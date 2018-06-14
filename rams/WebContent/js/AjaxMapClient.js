var _URL        = "http://175.196.64.240:8080";
var _EMPTY      = 0, _CALC_AREA  = 1, _CALC_DISTANCE = 2, _MOVE = 3, _INFO_LOC = 4, _AREA_SEARCH = 5;
var servletUrl  = _URL+"MapServiceV5?";
var getBoundUrl = servletUrl + "cmd=getallmapinfoxml";

var g_objMap    = null;
var g_objEvent  = null;
var g_graphic   = null;
var g_mouseMode = "default";
var g_objNavi   = new OpenLayers.Control.NavigationHistory();
var g_nMode     = 0;

var g_objTmp      = new OpenLayers.Control();
var g_objClick    = null;
var g_objControl  = null;
var g_objVector   = null;
var g_objFeatures = null;
var g_objLonLat   = null;

var myStyles4            = null;
var measureControls      = null;
var m_objCalcAndDistance = null;

// 지도 정보 가져올거...Show3D, LayerControl등 파라미터 값 조정하려구..
var MapList       = new IMap_MapInfo();
var g_dX, g_dY;
var g_bPrintMode  = false;
var g_objMakers   = null;
var g_objBoundary = null;
var g_erStrLayerOnOff = null, g_erStrTextOnOff = null, g_erStrLayerOn = null, g_erStrTextOn = null;

var g_strLayerOnOff = "";
var g_objList       = null;

var g_erStrSelectLayerId = null; // <- 영역검색을 위해 선택된 레이어들의 집합
var g_nSelectLayerId     = 0;    // <- 영역 검색한후에 검색된 데이터들의 총 카운트.

var g_erStrSelectLayerIdCollect = new Array(); // <- 영역 검색한후에 검색된 데이터 들의 집합.

var CBoundaryInform = function(dMinX, dMinY, dMaxX, dMaxY)
{
	this.dMinX = dMinX;
	this.dMinY = dMinY;
	this.dMaxX = dMaxX;
	this.dMaxY = dMaxY;
}

MapList.Init();

m_objCalcAndDistance = new OpenLayers.StyleMap({ //거리,면적측정
    "default": new OpenLayers.Style({
        strokeColor: "#30C0FF",
        fillColor: "#30C0FF",
        strokeWidth: 2,
        strokeOpacity: 1,
        fillOpacity: 0.5,
        pointRadius: 5
    })
});

function init(dMinX, dMinY, dMaxX, dMaxY, bPrintMode)
{
	/**
	* 지도를 띄우기 전에 IntraMap Web 5.0 에 설정된 boundary 값을 가져와서 설정해야합니다.
	* 지도 boundary 값을 가져오지 못하면 지도를 띄우지 못합니다.
	*/
	g_dX = g_dY = 0;
	
	m_Popup       = document.getElementById("m_gb");
	g_objBoundary = null;
	g_bPrintMode  = bPrintMode;
	//g_objList     = new CList();
	
	alert("getBoundUrl : " + getBoundUrl);
	
	if(this.init.arguments.length != 0)
		g_objBoundary = new CBoundaryInform(dMinX, dMinY, dMaxX, dMaxY);
	
	OpenLayers.loadURL(getBoundUrl, '', this, 
		function(res) 
		{
			var rXml = res.responseXML;
			var boundary;
			var flag;
			var minX, minY, maxX, maxY;
			var control = null;
			
			var bndArr = [];
			
			if(navigator.appName.indexOf("Explorer") != -1 )
			{
				var xmlText  = res.responseText;
				var xmlDoc   = new ActiveXObject("Microsoft.XMLDOM");
				
				xmlDoc.async = "false";
				xmlDoc.loadXML(xmlText);
				rXml = xmlDoc.documentElement;
			}

			if(rXml == null)
			{
				document.getElementById("PleaseWait").style.display      = "none";
				document.getElementById("MapConnectError").style.display = "block";				
				
				return;
			}
			
			boundary = rXml.getElementsByTagName("Boundary");
			
			minX = parseFloat(boundary[0].getElementsByTagName("MinX")[0].firstChild.nodeValue );
			minY = parseFloat(boundary[0].getElementsByTagName("MinY")[0].firstChild.nodeValue );
			maxX = parseFloat(boundary[0].getElementsByTagName("MaxX")[0].firstChild.nodeValue );
			maxY = parseFloat(boundary[0].getElementsByTagName("MaxY")[0].firstChild.nodeValue );
			
			if(g_objBoundary == null)
				g_objBoundary = new CBoundaryInform(minX, minY, maxX, maxY);
			
			//////////////////////////////////////////////////////////////////////////////////////////
			//xml읽어서 Show3D, LoadFlag, LayerControl 파라미터값을 가져옴...
			var strMap = getMapInfo(rXml);
			
			var strShow3D       = strMap.split('^')[0];
			var strLoadFlag     = strMap.split('^')[1];
			var strLayerControl = strMap.split('^')[2];
			
			//////////////////////////////////////////////////////////////////////////////////////////
			// 지도 초기화.... maxResolution 값은 반드시 'auto'로 지정해야합니다.
			g_objMap = new OpenLayers.Map("map", {maxResolution : "auto"});
			
			measureControls = {
			    line: new OpenLayers.Control.Measure(
			        OpenLayers.Handler.Path, {
			            persist: true,
			            handlerOptions: {
			                layerOptions: {styleMap: myStyles4}
			            }
			        }
			    ), 
			    polygon: new OpenLayers.Control.Measure(
			        OpenLayers.Handler.Polygon, {
			            persist: true,
			            handlerOptions: {
			                layerOptions: {styleMap: myStyles4}
			            }
			        }
			    )
			};
			
	        for(var key in measureControls)
	        {
	            control = measureControls[key];
	            control.events.on(
		            {
		                "measure" : handleMeasurements,
		                "measurepartial" : handleMeasurements
		            }
	            );
	            
	            g_objMap.addControl(control);
	        }
	        
			g_graphic = new OpenLayers.Layer.IMAP5(
							"", servletUrl, 
							[{'Show3D':strShow3D, 'LayerControl':strLayerControl, 'LoadFlag':strLoadFlag}], 
							[], minX, minY, maxX, maxY);
			
			g_objMap.addLayers([g_graphic]);
			//g_objMap.addControl(new OpenLayers.Control.MousePosition());
			g_objVectors = new OpenLayers.Layer.Vector("Vector Layer");
			g_objMakers  = new OpenLayers.Layer.Markers("Markers");
			
			g_objMap.addLayer(g_objMakers );
			g_objMap.addLayer(g_objVectors);
			
			OpenLayers.Control.Click = OpenLayers.Class(OpenLayers.Control, {
			    defaultHandlerOptions: 
				{
			        'single': true,
			        'double': false,
			        'pixelTolerance': 0,
			        'stopSingle': false,
			        'stopDouble': false
			    },
			    
			    initialize: function(options) 
			    {
			        this.handlerOptions = OpenLayers.Util.extend(
			            {}, this.defaultHandlerOptions
			        );
			        OpenLayers.Control.prototype.initialize.apply(
			            this, arguments
			        ); 
			        this.handler = new OpenLayers.Handler.Click(
			            this, {
			                'click': this.trigger
			            }, this.handlerOptions
			        );
			    }, 
				
				trigger: function(e) 
				{			    	
					//var size   = new OpenLayers.Size(30,30);
					//var offset = new OpenLayers.Pixel(-(size.w/2), -size.h);
					//var icon   = new OpenLayers.Icon('http://20.20.20.55:8080/OpenLayers/examples/image/Balloon.bmp', size, offset);
					//g_objMakers.addMarker(new OpenLayers.Marker(lonlat,icon));
					//alert("x : " + e.xy.x + " y : " + e.xy.y);
					
					document.getElementById("PleaseWaitSearch").src           = "/images/main/wait.gif";
					document.getElementById("PleaseWaitSearch").style.display = "block";
					
					doGetRecord(g_objMap.getLonLatFromPixel(e.xy));
			    }
		    } );
			
		    g_objClick = new OpenLayers.Control.Click();
			
		    g_objMap.addControl(g_objClick);
			g_objMap.addControl(g_objNavi);		
			
			InitFit(g_objBoundary.dMinX, g_objBoundary.dMinY, g_objBoundary.dMaxX, g_objBoundary.dMaxY);
			
			onBtnMapOnOffClick(1, g_erStrLayerOnOff, 0);
			onBtnMapOnOffClick(2, g_erStrTextOnOff,  0);
			onBtnMapOnOffClick(1, g_erStrLayerOn,    1);
			onBtnMapOnOffClick(2, g_erStrTextOn,     1);
		}, 
		
		function(res) 
		{
			document.getElementById("PleaseWait").style.display      = "none";
			document.getElementById("MapConnectError").style.display = "block";
			
			return;
		}
	);
} 
//end of Init();

function InitFit(minX, minY, maxX, maxY)
{
	zoomArea(minX, minY, maxX, maxY);
	toggleControl();
}

function doGetRecord(lonlat)
{
	var geoFilter = "0^1^1|" + Math.round(lonlat.lon) + "," + Math.round(lonlat.lat) + ",0,0";
	var result    = null;
	var objIcon   = null;
	var objSize   = new OpenLayers.Size(50, 50);
	var objOffset = new OpenLayers.Pixel(-(objSize.w/2), -objSize.h);
	
	var objParam = 
	{
		"MapID" : "-1",
		"LayerID" : "-1",
		"Filter" : [],
		"GeoFilter" : geoFilter, 
		"ReturnFieldName" : ["EQUIPCODE^table^XGEOMETRY"] // EQUIPCODE^XGEOMETRY
	};
	
	/*
	var markers = new OpenLayers.Layer.Markers( "Markers" );
	map.addLayer(markers);

	var size = new OpenLayers.Size(10,17);
	var offset = new OpenLayers.Pixel(-(size.w/2), -size.h);
	var icon = new OpenLayers.Icon('http://boston.openguides.org/markers/AQUA.png',size,offset);
	markers.addMarker(new OpenLayers.Marker(new OpenLayers.LonLat(0,0),icon));
	markers.addMarker(new OpenLayers.Marker(new OpenLayers.LonLat(0,0),icon.clone()));
	
	g_objMakers.destroy();
	removeMarker
	*/
	
	g_objMakers  = new OpenLayers.Layer.Markers("Markers");
	g_objMap.addLayer(g_objMakers);	
	
	objIcon = new OpenLayers.Icon(_LOCAL_PATH+"KMapApi/imgs/point1.gif", objSize, objOffset);
	g_objMakers.addMarker(new OpenLayers.Marker(lonlat, objIcon));
	
	g_graphic.GetIMAPRecord(objParam, GetClickRecord, funcFail);
}

function doGetAreaRecord(nMapId, nLayerId, geoFilter)
{
	var objParam = 
	{
		"MapID"     : nMapId, 
		"LayerID"   : nLayerId, 
		"Filter"    : [], 
		"GeoFilter" : geoFilter, 
		"ReturnFieldName" : ["EQUIPCODE^table^XGEOMETRY"] // EQUIPCODE^XGEOMETRY
	};
	
	AreaSearch(objParam);
	//g_graphic.GetIMAPRecord(param, GetClickRecord, funcFail);
}

function AreaSearch(objParam)
{
	try
	{
		var MapID      = objParam.MapID;
		var LayerID    = objParam.LayerID;
		var FilterList = objParam.Filter;
		var filter     = null;
		var geoFilter  = null;
		var ReqStr     = null;
		var strUrl     = null;
		var isGeoReq   = null;
		var FilterStr  = [];
		var objTmpXY   = g_objMap.getSize();
		
		//노말 필터.
		for(var i=0; i < FilterList.length; i++) 
		{
			for(var val in FilterList[i]) 
				FilterStr.push(val+"-"+ FilterList[i][val]);
		}
		
		///////////////////////////////////////////////////////////////////////////////////////////////
		//지오메트리 필터
		geoFilter = objParam.GeoFilter;
		filter    = FilterStr.join(",");
		ReqStr    = objParam.ReturnFieldName.join("^");
		
		//일단 테스트..
		strUrl = [servletUrl];
		
		strUrl.push("cmd=Record&", "RequestType=0&");
		strUrl.push("Width=", objTmpXY.w, "&Height=", objTmpXY.h, "&");
		strUrl.push("&LayerControl=0&");
		strUrl.push("Show3D=&", "LoadFlag=&");
		strUrl.push("MapIndex=", MapID, "&LayerIndex=", LayerID, "&");
		strUrl.push("VisibleOnly=0&", "RequestFields=", ReqStr,  "&");
		
		if(geoFilter != "" )
		{
			strUrl.push("CenX=",      g_objMap.getCenter().lon, "&CenY=", g_objMap.getCenter().lat, "&");
			strUrl.push("ZoomValue=", g_objMap.resolution );
			 
			strUrl.push("&GeometryFilter=", GetXGeometryURL(geoFilter));
		}
		
		strUrl = strUrl.join("");
		//alert(strUrl);
		// isGeoReq : 노말필터 only 인지, 아니면 XGEOMETRY가 포함된 요청인지???
		isGeoReq = ReqStr.indexOf("XGEOMETRY");
		
		if(isGeoReq == -1)
		{
			OpenLayers.loadURL(strUrl, '', this, this.parseData, SearchFailure);
		}
		else
		{
			OpenLayers.loadURL(strUrl, '', this, AreaSearchParseGeoData, SearchFailure);
		}
	}
	catch(e) { }
}

function SearchFailure(response)
{
	alert('Record 검색에 실패하였습니다.');
	return;
}

function AreaSearchParseGeoData(response) 
{
	var resultTxt = response.responseText;
	var rSet      = new RecordSet();
	rSet.Init();
	
	var r = resultTxt.split("#");			
	var eachR, eachNormal, eachGeo;		
	
	for(var i = 0; i < r.length; i++) 
	{
		eachR = new Record();
		eachR.Init();
		
		var normal, geo;

		if(i == 0) 
		{
			var tmp = r[i].split("!");
			
			try
			{
				var bound = tmp[1].split("^");		//MinX, MinY, MaxX, MaxY 정보 
				rSet.MinX = bound[0]; rSet.MinY = bound[1];
				rSet.MaxX = bound[2]; rSet.MaxY = bound[3];
				
				//tmp[2] 로 NormalField, GeometryField를 셋팅해야함...	
				normal = tmp[2].split("*")[0];
				geo =    tmp[2].split("*")[1];
			}
			catch(e) {  }
		}
		else
		{
			if( r[i].length == 0) break;
			
			normal = r[i].split("*")[0];
			geo    = r[i].split("*")[1];
		}
		
		//NormalFields 셋팅
		try
		{
			var arrGeo = null, eachGeo = null, tmpGeoInfo = null;			 
			
			if( normal != "-" )
			{
				var tmpNormal = normal.split("@");
				
				var nFieldNames = tmpNormal[0].split("^");
				var nFieldValues = tmpNormal[1].split("^");
				
				for( var j = 0; j < nFieldNames.length; j++) 
				{
					eachNormal = new NormalFields();
					eachNormal.Init();

					eachNormal.SetFieldName(nFieldNames[j]);
					eachNormal.SetFieldValue(nFieldValues[j]);
					
					eachR.AddNormalField(eachNormal);
				}
			}
			
			//geometry 셋팅
			geo    = geo.replace("#", "");
			arrGeo = geo.split("|");
			
			//CoordCount 설정
			eachGeoSet = new GeometryFieldSet();
			eachGeo    = new Geometry();
			
			eachGeoSet.Init(); eachGeo.Init();
			
			tmpGeoInfo = arrGeo[0].split("^");			
			eachGeo.SetGeometryType( parseInt( tmpGeoInfo[0] ) );
			
			// 이 아랫 부분에 멀티 폴리곤 부분도 되도록 수정해야함....
			eachGeo.SetPartCount(  parseInt(tmpGeoInfo[1]) );
			eachGeo.AddCoordCount( parseInt(tmpGeoInfo[2]) );
			
			for( var g = 1 ; g < arrGeo.length; g++ )
			{// for multiPolygon...
				var coordSet = arrGeo[g].split('$')[0];
				var coordCnt = arrGeo[g].split('$')[1];
				
				eachGeo.AddCoordXYZSet(coordSet);
				
				if(coordCnt)
					eachGeo.AddCoordCount( parseInt(coordCnt) );
			}
			
			eachGeoSet.AddGeometry(eachGeo);
			eachR.SetGeometryFieldSet( eachGeoSet );
			
			//레코드셋에 레코드 추가.
			rSet.AddRecord(eachR);
		}
		catch(e) { }
	}
		
	GetAreaSearchRecord(rSet);
}

function GetXGeometryURL(erGeometryFilter)
{
	var strURL = "2^1^"+erGeometryFilter.length+"|";
	//lon == y lat == x
	for(var i = 0;i < erGeometryFilter.length; i++)
	{
		if(Geometry.length - 1 == i)
			strURL += erGeometryFilter[i].lat + ","+ erGeometryFilter[i].lon + ",0.0";
		else
			strURL += erGeometryFilter[i].lat + ","+ erGeometryFilter[i].lon + ",0.0@";
	}
	
	return strURL;
}

//AreaSearch(objParam) geoFilter
var g_strSelectObjTmpValue = null;

function GetAreaSearchRecord(obj)
{
	var nCount         = obj.GetRecordCount();
	var objGetRecord   = null, objValue = null, objTableName = null;
	var erStrTableName = new Array(nCount), erStrKeyValue = new Array(nCount);
	var erObjResult    = new Array(2);
	
	if(obj != null)
	{
		var strUrl      = null, strWinName  = "속성정보보기";
		var nWidth      = 500,  nHeight     = 320;
		var strScroll   = "no", strResize   = "no";
		var i           = 0, j = 0;
		
		for(i = 0; i < nCount; i++) 
		{
			try
			{
				erStrKeyValue[i]  = obj.GetRecord(i).GetFieldValue(0);
				erStrTableName[i] = obj.GetRecord(i).GetFieldValue(1);				
			}
			catch(e)
			{
				alert("검색 결과가 존재 하지 않습니다.");
				objValue = null;
				break;
			}
		}
		
		if(nCount == 0)
		{
			//alert("검색 결과가 존재 하지 않습니다.");
		}
	}
	else
		//alert("검색 결과가 존재 하지 않습니다.");
	
	document.getElementById("PleaseWaitSearch").style.display = "none";
	document.getElementById("PleaseWaitSearch").src = "";
	
	erObjResult[0] = erStrKeyValue; erObjResult[1] = erStrTableName;	
	
	if(g_erStrSelectLayerId.length == TmpSaveAreaSearchResult(erObjResult)) 
		RtnDialog();
	//return erObjResult;
}

function RtnDialog()
{
	top.leftSearchBar.RtnResultData(g_erStrSelectLayerIdCollect, "Result Success!!!");
}

function TmpSaveAreaSearchResult(erObjResult)
{
	g_erStrSelectLayerIdCollect[g_nSelectLayerId++] = erObjResult;
	
	return g_nSelectLayerId;
}

function GetClickRecord(obj)
{
	var nCount       = obj.GetRecordCount();
	var strArea      = null;
	var objGetRecord = null, objValue = null, objTableName = null;
	
	if(nCount > 0)
	{
		var strUrl      = null, strWinName  = "속성정보보기";
		var nWidth      = 500,  nHeight     = 320;
		var strScroll   = "no", strResize   = "no";
		var bBreakPoint = false;
		var i           = 0, j = 0;
		
		for(i = 0; i < nCount; i++) 
		{
			try
			{
				objValue     = obj.GetRecord(i).GetFieldValue(0);
				objTableName = obj.GetRecord(i).GetFieldValue(1);
				
				if(objValue != null && objValue != "")
				{
					bBreakPoint = true;
					break;
				}
			}
			catch(e)
			{
				alert("검색 결과가 존재 하지 않습니다.");
				objValue = null;
				break;
			}
			
			if(bBreakPoint) break;
		}
		
		if(objValue != null && objValue != "" )
		{
			DrawPoly((obj.GetRecord(i).RecordToWKT()[j]).trim());
			
			if(confirm("해당 항목을 선택 하시겠습니까?"))
			{
				objValue += "-" + objTableName;				
				alert(objValue);
			}
		}
		else
			alert("검색 결과가 존재 하지 않습니다.");
	}
	else
		alert("검색 결과가 존재 하지 않습니다.");
	
	document.getElementById("PleaseWaitSearch").style.display = "none";
	document.getElementById("PleaseWaitSearch").src = "";
}

function AllStateInit()
{
	InitMouseState();
	m_Popup.style.display = "none";
	
	if(g_objFeatures != null)
		g_objVectors.removeFeatures(g_objFeatures);
}

function DrawPoly(str)
{
	if(g_objFeatures != null) g_objVectors.removeFeatures(g_objFeatures);
	
	g_objFeatures = new OpenLayers.Format.WKT(
							{	'internalProjection': g_objMap.baseLayer.projection, 
								'externalProjection': g_objMap.baseLayer.projection}  ).read(str);
	
	if(g_objFeatures != null)
	{
		if(g_objFeatures.constructor != Array) g_objFeatures = [g_objFeatures];
		
		g_objVectors.addFeatures(g_objFeatures);
	}
	else
		alert("그리기 실패");
}

function getMapInfo( objXml )
{
	var ret = [];		//리턴값...string... -> 'mapReqString^mapReq3DString' 이런형태로 리턴할꺼임.
	var mapObj = null;
	
	var MapInfo = objXml.getElementsByTagName('MapInfo');
	var MapCnt = MapInfo.length;
	if( MapCnt == 0 )
		return ',';
	
	//var MapList = new IMap_MapInfo();
	//MapList.Init();
	
	var MapVisible;
	for( var i = 0; i < MapCnt; i++)
	{
		//기존 코드.
		//MapVisible = MapInfo[i].getElementsByTagName('Visible')[0].firstChild.nodeValue;
		//mapObj = new Object();
		//mapObj.visible = MapVisible +'';
		//MapList.AddMap( mapObj );
		//변경된 코드.
		MapList.AddMap( MapInfo[i] );
	}
	
	ret.push(MapList.GetShow3D(1));
	ret.push(MapList.GetLoadFlag());
	ret.push(MapList.GetLayerControl());
	
	return ret.join('^');
}

function onPopupClose() 
{
	var control;
	
    for(var key in measureControls) 
    {
        control = measureControls[key];
        control.cancel();
    }
}

///////////////////////////////////////////////////////////////////////////////////////////
//거리,면적측정
//<- 계산 한 결과를 화면에 표출.
function handleMeasurements(event)
{
	g_objEvent = event;
	
	//m_Popup.style.display = "none";
	if(g_nMode == _AREA_SEARCH)
	{
		var objXY  = event.geometry.getVertices();
		var lonlat = new OpenLayers.LonLat(objXY[objXY.length-1].y, objXY[objXY.length-1].x);
		
		g_objList.AppendData(lonlat);
	}
}

function CutPoint(dData, nSlicePoint)
{
	var erStrTmp = null;
	dData += "";
	
	erStrTmp = dData.split(".");
	if(erStrTmp.length >= 2) 
		return erStrTmp[0] + "." + erStrTmp[1].substring(0, nSlicePoint);
	
	return dData;
}

//////////////////////////////////////////////////////////////////////////////
// show3d on / off
function onBtn3DClick(obj)
{
	var s3d = '';
	
	if(obj.value == "show3D")
	{	//3d 보이기
		s3d = MapList.GetShow3D(1);
		obj.value = "hide3D";
	}
	else
	{	//3d 숨기기
		s3d = MapList.GetShow3D(0);
		obj.value = "show3D";
	}
	
	g_graphic.mergeNewParams({'Show3D': s3d});
}

function winMapDrawInit()
{
	g_objMap.ctrlInit();
	g_objMap.usrDelImg();
	g_objMap.reFlush();
}

function InitMouseState()
{
	g_nMode = _EMPTY;
	
	g_objClick.deactivate();
	m_Popup.style.display = "none";
	
	document.getElementById("map").style.cursor = "auto";
	toggleControl();
}

function MapFit()
{
	zoomArea(g_objBoundary.dMinX, g_objBoundary.dMinY, g_objBoundary.dMaxX, g_objBoundary.dMaxY);
}

////////////////////////////////////////////////////////////////////////
//확대
function winMapZoomIn()  { g_objMap.zoomIn();  }

////////////////////////////////////////////////////////////////////////
//축소
function winMapZoomOut() { g_objMap.zoomOut(); }

function toggleControl(control) 
{
	//m_Popup.style.display = "none";
	if(g_nMode == _INFO_LOC) 
	{
		if(g_objClick != null) g_objClick.activate();
	}
	else
	{
		if(g_objClick != null) g_objClick.deactivate();
	}
	
	if(control != null)
	{
    	control.activate();
    } 
    else 
    {
        for(key in measureControls)
        {
            var c = measureControls[key];
        	c.deactivate();
        }
    }
}

//////////////////////////////////////////////////////////////////////////////
//마우스 커서 이동 상태로
function winMapMove() 
{
	if(g_objMap.move()) 
		g_objMap.move(false); 
	else 
		g_objMap.move(true);
}

//////////////////////////////////////////////////////////////////////////////
//이전보기
function winMapPrev() { g_objMap.prev(); }

//////////////////////////////////////////////////////////////////////////////
//다음보기
function winMapNext() { g_objMap.next(); }

//////////////////////////////////////////////////////////////////////////////
//전체화면
function winMapFit()  
{ 
	try
	{
		g_objMap.fit();
	}
	catch(e) { alert(e); }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//마우스 커서 거리재기 상태로
function GetDistance() 
{
	if(g_nMode != _CALC_DISTANCE)
	{
		toggleControl();
		
		document.getElementById("map").style.cursor = _LOCAL_PATH+"/KMapApi/cursor/calcdist.cur";		
		
		g_nMode = _CALC_DISTANCE; //"distance";
		toggleControl(measureControls["line"]);
	} 
	else 
	{
		document.getElementById("map").style.cursor = "auto";
		
		g_nMode = _EMPTY; //"move";
		toggleControl();
	}
}

function SetAreaSearch(erStrLayer)
{
	if(g_nMode != _AREA_SEARCH)
	{
		toggleControl();
		
		if(g_erStrSelectLayerId != null)
		{
			try
			{
				for(var i = 0; i < g_erStrSelectLayerId.length; i++)
					delete g_erStrSelectLayerId[i];
			}
			catch(e) {}
		}
		
		g_erStrSelectLayerId = erStrLayer;
		
		document.getElementById("map").style.cursor = _LOCAL_PATH+"/KMapApi/cursor/polygon.cur";
		
		g_nMode = _AREA_SEARCH; //"_AREA_SEARCH";
		toggleControl(measureControls["polygon"]);
	} 
	else 
	{
		document.getElementById("map").style.cursor = "auto";
		
		g_nMode = _EMPTY; //"move";
		toggleControl();
	}
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
//마우스 커서 영역 면적 재기 상태로
function GetArea()
{
	if(g_nMode != _CALC_AREA) 
	{
		toggleControl();
		
		document.getElementById("map").style.cursor = _LOCAL_PATH+"/KMapApi/cursor/area.cur";
		
		g_nMode = _CALC_AREA; //mode = "area";
		toggleControl(measureControls["polygon"]);
	}
	else
	{
		document.getElementById("map").style.cursor = "auto";
		
		g_nMode = _EMPTY; //"move";
		toggleControl();
	}
}

function DoubleClickEvent()
{
    var objXY     = g_objEvent.geometry.getVertices();    
    
    var erNLonLat = new Array();
    var objData   = null;
    
	switch(g_nMode)
	{
	case 0 : return; // _DEFAULT
	case 1 : // _CALC_AREA		
	case 2 : // _CALC_DISTANCE
		DistanceAndArea(g_objEvent.order, g_objEvent.measure, objXY, g_objEvent.units);
		break;
	case 3 : break; // _MOVE
	case 4 : break; // _INFO_LOC
	case 5 : // _AREA_SEARCH
		g_objList.AppendData(new OpenLayers.LonLat(objXY[objXY.length-1].y, objXY[objXY.length-1].x));
		
		for(var i = 0; i < g_erStrSelectLayerIdCollect.length; i++)
			delete g_erStrSelectLayerIdCollect[i];
		
		for(var i = 0; i < erNLonLat.length; i++)
			delete erNLonLat[i];
		
		erNLonLat = new Array();
		
		for(var i = 0;(pNode = g_objList.GetFrontData()) != null;i++)
			erNLonLat[i] = pNode[0];
		
		for(var i = 0;i < g_erStrSelectLayerId.length; i++)
			doGetAreaRecord(1, i, erNLonLat);

		g_nMode = _EMPTY;
		m_Popup.style.display = "none";
		toggleControl();
		break;		
	}
}

function DistanceAndArea(order, objMeasure, objPx, units)
{
    var objLonLat = null;
    var strGubun  = "";
    var strResult = "";
    
    if(order == 1)
    {
    	strGubun   = "거리";
    	strResult  = CutPoint( (new String(objMeasure.toFixed(2)) / 100000), 3);
    	strResult  = strGubun + " " + strResult + " " + units;
    }
    else
    {
    	strGubun   = "면적";
    	strResult  = CutPoint( (new String(objMeasure.toFixed(2)) / 100000), 3);
    	strResult  = strGubun + " " + strResult + " " + units + "<sup>2</sup>";
    }
    
    objLonLat = new OpenLayers.LonLat(objPx[objPx.length-1].x,objPx[objPx.length-1].y);
    objPx     = g_objMap.getPixelFromLonLat(objLonLat);
    
	m_Popup.style.left     = (objPx.x+10) + "px"; m_Popup.style.top = (objPx.y+10) + "px";
	m_Popup.style.display = "block";
    
    m_Popup.innerHTML = 
	    "<table width=\"150\" height=\"20\" border=\"0\" cellspacing=\"2\" cellpadding=\"2\" bgcolor=\"#30C0FF\" style=\"margin: 0 auto; font-size:10px;z-index:4; \" >" + 
	    "<tr align=\"middle\">" +
	    "<td bgcolor=\"#FFFFFF\" >" + strResult + "</td>" + 
	    "<td bgcolor=\"#FFFFFF\" onclick=\"m_Popup.style.display='none'; toggleControl(); document.getElementById('map').style.cursor='auto'; \" style='cursor:hand' >X</td>" + 
	    "</tr>" + 
	    "</table>";    
}

/////////////////////////////////////////////////////////////////////////////////////////////////////
//마우스 커서 사용자 선택 상태로 === 인자1 : 지정된 문자열 "userSelect" "userCircle" "userRect" "userLine" "userPolyline" "userPolygon"
function winMapUserMode(st) 
{
	if(st != null)
	{
		g_mouseMode = st;
		g_objMap.userDraw(st);
	}
	else
	{
		g_objMap.userDraw();
	}
}

function SetInfoLoc()
{
	if(g_nMode != _INFO_LOC)
	{
		g_nMode = _INFO_LOC;
		
		document.getElementById("map").style.cursor = _LOCAL_PATH+"/KMapApi/cursor/cross.cur";
		g_objClick.activate();
	}
	else
	{
		g_nMode = _EMPTY; //"move";
		AllStateInit();
	}
}

///////////////////////////////////////////////////////////////////////////////////////////////////
//지도 영역지정으로 이동 === 인자 : minX,minY,maxX,maxY
function zoomArea(minX, minY, maxX, maxY)
{
	var objExtent = null;
	
	objExtent = new OpenLayers.Bounds(minX, minY, maxX, maxY);
	g_objMap.zoomToExtent(objExtent);
}

///////////////////////////////////////////////////////////////////////////////////////////////////
//지도 중심좌표기반 이동 === 인자 중심좌표 그리고 축척의 세개 인자
function setLocation(x, y, scale)
{
	g_objMap.setLocation(x, y, scale);
}

function MapPrev()
{
	g_objNavi.previousTrigger();
}

function MapNext()
{
	g_objNavi.nextTrigger();
}

myStyles4 = new OpenLayers.StyleMap
			(
				{
				    "default": new OpenLayers.Style
					(
				        {
				            strokeColor: "#30C0FF",
				            fillColor: "#30C0FF",
				            strokeWidth: 2,
				            strokeOpacity: 1,
				            fillOpacity: 0.5,
				            pointRadius: 5
				        }
					)
			    }
			);

function getFeatureInfoLoc(ex, ey, strLayername, val, callback)
{
	var llMin = g_objMap.getLonLatFromPixel(new OpenLayers.Pixel(ex - val,ey + val));
	var llMax = g_objMap.getLonLatFromPixel(new OpenLayers.Pixel(ex + val,ey - val));
	
	var url =  layer.getFullRequestString(
		{	REQUEST: "GetFeatureInfo",
			EXCEPTIONS: "application/vnd.ogc.se_xml",
			//BBOX: layer.getExtent().toBBOX(),
			X: ex, Y: ey,
			BBOX: llMin.lon + "," + llMin.lat + "," + llMax.lon + "," + llMax.lat,
			INFO_FORMAT: 'text/xml',
			QUERY_LAYERS: strLayername,
			FEATURE_COUNT : 3,
			WIDTH: layer.map.size.w, 
			HEIGHT: layer.map.size.h
		}
	);
	
	OpenLayers.loadURL(url, '', this, callback);
}

function funcFail()
{
	alert("GetLayerInfo Failed....");
}

function MapTest()
{
	//var objTmp = g_objMap.getExtent();
	alert(g_objMap.resolution);
}

function GetMapBoundary()
{
	return (g_objMap == null) ? null : g_objMap.getExtent();
}

///////////////////////////////////////////////////////////////////////////////////////
//지도 on/off
function GetLayerVisibleArray(nErLayerIndexParam, nVisible)
{
	var nErLayerIndex = new Array();
	
	for(var i = 0; i < nErLayerIndexParam.length; i++)
		nErLayerIndex[i] = {layerIndex:nErLayerIndexParam[i], visible:nVisible};
	
	return nErLayerIndex;
}

function onBtnMapOnOffClick(nMapIndex, nErLayerIndex, nVisible)
{
	var strNewLoadFlag = null;
	
	try
	{
		nErLayerIndex  = nErLayerIndex.sort(function (n1, n2) { return n1 - n2;} );
		nErLayerIndex  = GetLayerVisibleArray(nErLayerIndex, nVisible);
		
		strNewLoadFlag = MapList.GetChangedLoadFlag(nMapIndex, 1, nErLayerIndex);
		
		if(strNewLoadFlag != null) g_graphic.mergeNewParams({'LoadFlag': strNewLoadFlag});
	}
	catch(e) {}
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           