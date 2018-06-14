<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>도로재산관리시스템</title>
<link rel="stylesheet" href="/rams/OpenLayers/theme/default/style.css" type="text/css" />
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />

<style type="text/css">
#smallmap {
	width: 1024px;
	height: 700px;
}


.resultFormat {
	background-color : #ffffff;
	color : red;
}

body{
scrollbar-face-color:#FF6699;
scrollbar-shadow-color:#FFFFFF;
scrollbar-highlight-color:#FFFFFF;
scrollbar-3dilight-color:#A20034;
scrollbar-darkshadow-color:#A20034;
scrollbar-track-color:#F4D2E8;
scrollbar-arrow-color:#A20034;

}

</style>
<script src="/rams/OpenLayers/lib/jquery-1.3.1.min.js"></script>
<script src="/rams/js/common.js">				 </script>
<script src="/rams/OpenLayers/lib/OpenLayers.js"></script>
<script src="/rams/js/MoveDiv.js"></script>


<script type="text/javascript">
var CPoint = function(x, y)
{
	this.x = x;
	this.y = y;
};
</script>

<script type="text/javascript">
var _MOVE = 0, _AREA = 1, _AREA_SEARCH = 2;
var g_nMouseMode   = _MOVE;
var g_objEvent     = null;

var g_erXYLocation = new Array();
var g_nIndex       = 0;

/**
*	- 전역변수 말고 Object Literal을 써서 namespace처럼.
*	214번 서버에서 IntraMapWeb_GS 웹 엔진 구동해서 사용.
*/
var KSIC = { 
	servletUrl : "http://175.196.63.33:8080/IntraMap/MapService", 
	click           : null,
	maptool08       : null,
	lon 			: 5,
	lat 			: 40,
	zoom 			: 5,
	map 			: null,			
	layer 			: null,
	mode 			: null,
	measureControls : null,
	buffer_wfs 		: null,
	measure_wfs 	: null,
	marker 			: null,
	nav 			: null,
	selectedLayer 	: [],
	logPopup 		: null,

	arrLayers : [				
		{"name":"UQA100", "checked":false, "text":"주거지역" },
		{"name":"UQA200", "checked":false, "text":"상업지역" },
		{"name":"UQA300", "checked":false, "text":"공업지역" },
		{"name":"UQA400", "checked":false, "text":"녹지지역" },
		{"name":"UQF100", "checked":false, "text":"경관지구" },
		{"name":"UQG100", "checked":false, "text":"미관지구" },
		{"name":"UQH100", "checked":false, "text":"고도지구" },
		{"name":"UQI100", "checked":false, "text":"방화지구" },
		{"name":"UQJ100", "checked":false, "text":"방재지구" },
		{"name":"UQK100", "checked":false, "text":"보존지구" },
		{"name":"UQL100", "checked":false, "text":"시설보호지구" },
		{"name":"UQM100", "checked":false, "text":"용도취락지구" },
		{"name":"UQN100", "checked":false, "text":"개발진흥지구" },
		{"name":"UQP100", "checked":false, "text":"국토이용기타용도지구" },
		{"name":"LP_PA_CBND_ALL", "checked":false, "text":"지번" },					
		{"name":"G001_2_1", "checked":true, "text":"구경계" },
		{"name":"G001_3_2", "checked":true, "text":"동경계" },
		{"name":"B003", "checked":false, "text":"건물군" },
		{"name":"E011", "checked":true, "text":"하천" },		
		{"name":"SUB_RD", "checked":true, "text":"도로" },		
		{"name":"B006_1", "checked":false, "text":"지하철역사" },
		{"name":"UQS200", "checked":false, "text":"주차장" },
		{"name":"UQT200", "checked":false, "text":"공원" },
		{"name":"UQT300", "checked":false, "text":"녹지" },
		{"name":"UQT400", "checked":false, "text":"유원지" },
		{"name":"UQV300", "checked":false, "text":"학교" }
	],

	
	myStyles2 : new OpenLayers.StyleMap(
			{ //쿼리도형
				"default": new OpenLayers.Style(
					{
						strokeColor: "#0000ff",
						fillColor: "#ffff00",
						strokeWidth: 2,
						strokeOpacity: 1,
						fillOpacity: 0.4,
						pointRadius: 5
					}
				)
			}
		),
	
	myStyles4 : new OpenLayers.StyleMap(
			{ //거리,면적측정
				"default": new OpenLayers.Style(
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
		)
};

function handleMeasurements(event)
{
	var geometry = event.geometry;
	var units    = event.units;
	var order    = event.order;
	var measure  = event.measure;
	var lonlat   = null;
	var px       = null;
	
	var xy     = geometry.getVertices();
	var gubun  = "";
	var result = "";
	
	gubun = "거리";
	result = measure.toFixed(2) + " " + units;
	g_objEvent = event;
	//alert(result);
	if(order == 1)
	{
	  gubun = "거리";
	  result = measure.toFixed(2) + " " + units;
	} 
	else 
	{
		if(g_nMouseMode == _AREA)
		{
			gubun = "면적";
			result = measure.toFixed(2) + " " + units + "<sup>2</sup>";
		}
	}

	lonlat = new OpenLayers.LonLat(xy[xy.length-1].x, xy[xy.length-1].y);
	
	if(g_nMouseMode == _AREA_SEARCH)
	{
		g_erXYLocation[g_nIndex++] = lonlat;
	}
	
	if(order == 1 || g_nMouseMode == _AREA)
	{
		var mPopup = null;
		//경위도 : 마지막에 클릭한 지점
		//경위도 -> 화면상 픽셀좌표		
		//popup div 위치이동 및 값 표현
		px = KSIC.map.getPixelFromLonLat(lonlat);
		mPopup = document.getElementById("mPopup");
		
		mPopup.style.left     = (px.x+300) + "px";
		mPopup.style.top      = (px.y) + "px";
		mPopup.style.display  = "block";
		mPopup.style.width    = "70px";
		mPopup.style.height   = "30px";
		mPopup.style.position = "absolute";
	
		mPopup.innerHTML = 
			"<table width='100%' height='100%' border='0' cellspacing='2'   cellpadding='2' bgcolor='#30C0FF' style='margin: 0 auto;font-size:10px;'>" +"<tr bgcolor='#FFFFFF' align='center' height='50%'><td>"+gubun+"&nbsp;&nbsp;<a border='0' onClick='onPopupClose()' style='cursor:pointer'>X</a></td></tr>"
			+ "<tr bgcolor='#FFFFFF' align='center' height='50%'><td>" + result
			+ "</td></tr></table>";
	}
}

//팝업 창을 닫으면서 그렸던 도형도 지워준다
function onPopupClose() 
{
	var mPopup = document.getElementById("mPopup");
	var control;
	
	mPopup.style.display = "none";	
	
	for(var key in KSIC.measureControls) 
	{
	  control = KSIC.measureControls[key];
	  control.cancel(); 
	}
	
	toggleControl();
}

//전체보기 zoomToExtent
function Fit() { KSIC.map.zoomToMaxExtent(); } 
//지도 확대
function ZoomIn() { zoomlevel = KSIC.map.getZoom(); KSIC.map.zoomIn(); }
//지도 축소
function ZoomOut() { zoomlevel = KSIC.map.getZoom(); KSIC.map.zoomOut(); }
//뒤로 
function Prev() { KSIC.nav.previousTrigger(); }
//앞으로 
function Next() { KSIC.nav.nextTrigger(); }

//거리재기 클릭 시
function distance() 
{
	if(KSIC.mode == null && KSIC.mode == "move") 
	{
		KSIC.mode = "move";
		toggleControl();
	} 
	else 
	{				
		KSIC.mode = "distance";
		toggleControl(KSIC.measureControls["line"]);
	}
}

//면적재기 클릭 시
function GetArea()
{
	//if(maptool09.status=="push") {
	if(g_nMouseMode == _MOVE)
	{	
		g_nMouseMode = _AREA;
		KSIC.mode = "area";
		toggleControl(KSIC.measureControls["polygon"]);
	}
	else
	{
		g_nMouseMode = _MOVE;
		KSIC.mode = "move";
	}	
	//} else {
	//	mode = "move";
	//	toggleControl();
	//}
	//maptool17.defBtn();
	//maptool08.defBtn();
}

function GetAreaSearch()
{
	//if(maptool09.status=="push") {
	if(g_nMouseMode == _MOVE)
	{	
		g_nMouseMode = _AREA_SEARCH;
		KSIC.mode = "area";
		toggleControl(KSIC.measureControls["polygon"]);
	}
	else
	{
		g_nMouseMode = _MOVE;
		KSIC.mode = "move";
	}
}

//컨트롤 토글링
function toggleControl(control) 
{//mPopup.hStyle().display = "none";
	if(KSIC.mode == "infoLoc") 
	{
		if(KSIC.click != null) KSIC.click.activate();
	} 
	else 
	{
		if(KSIC.click != null) KSIC.click.deactivate();
	}
	
	if(control != null)
	{
		control.activate();
	} 
	else
	{
		for(key in KSIC.measureControls) 
		{
			var c = KSIC.measureControls[key];
			c.deactivate();
		}
	}
}

function SetControlEventHandle()
{
	var oFit      = document.getElementById('btnFit');
	var oIn       = document.getElementById('btnZoomIn');
	var oOut      = document.getElementById('btnZoomOut');
	var oPrev     = document.getElementById('btnPrev');
	var oNext     = document.getElementById('btnNext');
	var oMarker   = document.getElementById('btnMarker');
	var oCentroid = document.getElementById('btnCentroid');
	var oContains = document.getElementById('btnContains');
	var oImageFormat = document.getElementById('getMapFormat');
	var oDistance = document.getElementById('btnDistance');

	if(oContains) oContains.onclick = fnGetContains;
	if(oFit) 	oFit.onclick = Fit;
	if(oIn)  	oIn.onclick = ZoomIn;
	if(oOut) 	oOut.onclick = ZoomOut;
	if(oPrev) 	oPrev.onclick = Prev;
	if(oNext) 	oNext.onclick = Next;
	if(oMarker) oMarker.onclick = fnAddMarker;
	if(oCentroid) oCentroid.onclick = fnGetCentroid;
	if(oImageFormat) oImageFormat.onchange = onSelectImageFormat;
	if(oDistance) oDistance.onclick = distance;
}

/**
*	Contains 연산
*/
function fnGetContains()
{
	var filterHeader = '<' + '?xml version="1.0" encoding="UTF-8"?>';
	filterHeader += '<wfs:GetFeature xmlns:wfs="http://www.opengis.net/wfs" xmlns:ksic="http://www.ksic.net/wfs" ';
	filterHeader += 'xmlns:ogc="http://www.opengis.net/ogc" xmlns:gml="http://www.opengis.net/gml" ';
	filterHeader += 'xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="1.1.0" service="WFS" ';
	filterHeader += 'xsi:schemaLocation="http://www.ksic.net/wfs http://www.opengis.net/wfs http://schemas.opengis.net/wfs/1.1.0/wfs.xsd">';

	var targetLayer = document.getElementById('txtCentroidLayer').value;
	
	var filter3 = "";
	filter3 += '<wfs:Query typeName="' + targetLayer + '">';
	filter3 += '<wfs:PropertyName>XID</wfs:PropertyName> ';
	filter3 += '<ogc:Filter>';
	filter3 += '<ogc:Contains>';	
	
	/** Polygon 타입으로 Contains 연산
		filter3 += '<gml:Polygon>';
		filter3 += '<gml:exterior>';
		filter3 += '<gml:LinearRing srsName="EPSG:2097">';
		filter3 += '<gml:posList>206136 463401 206146 463411 206146 463401 206136 463401</gml:posList>';
		filter3 += '</gml:LinearRing>';
		filter3 += '</gml:exterior>';
		filter3 += '</gml:Polygon>';
	*/
	var operandPos = document.getElementById("txtCentroidResult").innerText;
	if( !operandPos )
		operandPos = "206136 463401";
	//alert(operandPos);
	
	operandPos = "204930.47561270214 461310.88229709124";
	
	filter3 += '<gml:Point>';
	filter3 += '<gml:pos>' + operandPos + '</gml:pos>';	//contains 206136.951269, 463401.317480
	//filter3 += '<gml:pos>1000000 1000000</gml:pos>';	//not contains
	filter3 += '</gml:Point>';
	filter3 += '</ogc:Contains>';
	filter3 += '</ogc:Filter>';
	filter3 += '</wfs:Query>';
	
	var filter = filterHeader + filter3 + '</wfs:GetFeature>';
	
	//alert(filter);
	//Contains 연산 결과처리
	this.fnContainsResult = function(response)
	{
		/** alert(response.responseText); */

		var xml = response.responseXML;
		if(xml) 
		{
			/**
				결과로 받은 XML에 연산 요청시의 타겟 레이어명의 Element가 있으면
				해당 레이어에 특정 Point가 속한것임.
			*/
			var b = xml.getElementsByTagName(targetLayer)[0];
			
			if( b )
			{					
				/** alert("Contains!!"); */
				var gmlid = b.getAttribute("gml:id");
				var xid;
				if(gmlid)
					xid = gmlid.split(".")[1];
				
				var ret = "layer : " + targetLayer + ", xid = " + xid;
				var obj = document.getElementById("txtContainsResult");
				if( obj ) 
				{
					obj.innerText = ret;
					obj.setAttribute("class", "resultFormat");
				}
			}
			else
				alert("Not Contains");		
		}
	}
		
	new OpenLayers.Request.POST({
		method: "POST",
		url: KSIC.servletUrl,
		//url : "http://nwland.nowon.kr/intramap/MapService",
		headers: {"Content-Type":"text/xml"},
		data: filter,
		callback: this.fnContainsResult
	});
}

/**
*	폴리곤의 중심점 찾기 샘플
*	WFS의 ksic:centroid 연산을 요청하여 처리한다.
*/

var features_jibun = null; 

function fnGetCentroid(xid,layer)
{

	//KSIC.layer.redraw();
	
	var filterHeader = '<' + '?xml version="1.0" encoding="UTF-8"?>';
	filterHeader += '<wfs:GetFeature xmlns:wfs="http://www.opengis.net/wfs" xmlns:ksic="http://www.ksic.net/wfs" ';
	filterHeader += 'xmlns:ogc="http://www.opengis.net/ogc" xmlns:gml="http://www.opengis.net/gml" ';
	filterHeader += 'xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="1.1.0" service="WFS" ';
	filterHeader += 'xsi:schemaLocation="http://www.ksic.net/wfs http://www.opengis.net/wfs http://schemas.opengis.net/wfs/1.1.0/wfs.xsd">';
	
	/**
	*	NW_LP_AA_EMD 테이블에서 XID=2인 폴리곤데이터의 중심점을 찾는다.
	*/
	//var targetLayer = document.getElementById("txtCentroidLayer").value;	//'NW_LP_AA_EMD';
	var targetLayer  = layer;
	var filter3 = "";
	filter3 += '<wfs:Query typeName="'+ targetLayer + '">';						//테이블명 설정( 'NW_LP_AA_EMD' )
	//filter3 += '<wfs:PropertyName>ksic:centroid</wfs:PropertyName> ';		//중심점 찾기 연산( 'ksic:centroid' )
	//filter3 += '<wfs:PropertyName>TN_MGT_SN</wfs:PropertyName> ';

	filter3 += '<wfs:PropertyName>XGEOMETRY</wfs:PropertyName> ';
	
	var targetField = 'XID';
	//var targetValue = document.getElementById("txtCentroidInput").value;
	var targetValue = xid;
	filter3 += '<ogc:Filter>';					
	filter3 += '<ogc:PropertyIsEqualTo>';
	filter3 += '<ogc:PropertyName>' + targetField + '</ogc:PropertyName>';
	filter3 += '<ogc:Literal>' + targetValue + '</ogc:Literal>';
	filter3 += '</ogc:PropertyIsEqualTo>';
	//filter3 += '<ogc:GmlObjectId gml:id="NW_LP_AA_EMD.1" />';
	filter3 += '</ogc:Filter>';
	filter3 += '</wfs:Query>';
	
	var filter = filterHeader + filter3 + '</wfs:GetFeature>';

	alert(filter);

	//centroid 연산 요청( POST )
	new OpenLayers.Request.POST({
		method: "POST",
		url: KSIC.servletUrl,
		headers: {"Content-Type":"text/xml"},
		data: filter,
		callback: this.fnCentroidResult
	});

	
	//document.getElementById('danger').value = filter;
	//Centroid 연산 결과 처리
	alert('출력되는가?');
	this.fnCentroidResult = function(response) {
		alert(response.responseText);
		
		//if(features_jibun != null) KSIC.buffer_wfs.removeFeatures(features_jibun);
		
		var gml = new OpenLayers.Format.GML();
		features_jibun = gml.read(response.responseText); 

		
		
		var bounds = ""; 

		

		if(features_jibun) 
		{
			
			
			for(var i=0; i<features_jibun.length; ++i) 
			{   
				if (!bounds) 
				{    
					bounds = features_jibun[i].geometry.getBounds();
				} 
				else 
				{   
					bounds.extend(features_jibun[i].geometry.getBounds());   
				}  
			}  

			KSIC.map.zoomToExtent(bounds);
				
		
			KSIC.buffer_wfs.addFeatures(features_jibun);
			

			//centroid지점에 이미지 뿌리기
//			var xml = response.responseXML;
//			if( xml )
//			{
//				var cenPos = xml.getElementsByTagName("centroid")[0].firstChild.nextSibling.firstChild.nextSibling.firstChild.nodeValue;
//				var x = cenPos.split(' ')[0];
//				var y = cenPos.split(' ')[1];
//
//				//alert(x + " " + y);
//				var ret = x + ' ' + y;
//				var obj = document.getElementById("txtCentroidResult");
//				if( obj )
//				{
//					obj.innerText = ret;
//					obj.setAttribute("class", "resultFormat");
//				}
//				
//				var size = new OpenLayers.Size(30,30);
//				var offset = new OpenLayers.Pixel(-(size.w/2), -size.h);
//				var icon = new OpenLayers.Icon('image/Balloon.bmp',size,offset);
				
				//OpenLayers.Layer.Markers 레이어에 특정 이미지를 특정 위치에 뿌립니다.
//				KSIC.markers.addMarker(new OpenLayers.Marker(new OpenLayers.LonLat(x, y),icon));
//			}
		}
	}
	
	
}

//특정 위치에 심볼(이미지) 표출.
function fnAddMarker()
{
	/**
		WFS GetFeature 연산으로 POI_HOTEL지도레이어에서 
		X좌표( 필드명 : X_CODE), Y좌표( 필드명 : Y_CODE)를 가져와서 
		해당 위치에 Marker(image 등)를 뿌립니다.
		
		DB에 있는 자료를 이용하여 지도상에 심볼을 뿌리는것도 이와 같은 방식으로 하시면 됩니다.
		DB에 있는 자료를  특정 데이터 형식(xml, json등) 형식으로 반환하는 페이지나 servlet을 만드셔서
		ajax로 가져와서 해당 결과를 파싱해서 해당 위치에 뿌리도록 하시면 됩니다.
	*/
	var filter = "";
	filter = '<ogc:Filter xmlns="http:www.opengis.net/ogc">';					
	filter += '<ogc:PropertyIsEqualTo>';
	filter += '<ogc:PropertyName>XID</ogc:PropertyName>';
	filter += '<ogc:Literal>106</ogc:Literal>';
	filter += '</ogc:PropertyIsEqualTo>';
	filter += '</ogc:Filter>';
	
	var url2 = KSIC.servletUrl + "?" + "SERVICE=WFS&REQUEST=GetFeature";
	url2 += "&TYPENAME=POI_HOTEL&SRSNAME=EPSG:2097";
	url2 += "&PROPERTYNAME=X_CODE,Y_CODE&FILTER=";
	url2 += filter;
	
	OpenLayers.loadURL(url2, '', this, function(response)
		{
			var xml = response.responseXML;
			//alert(xml);
			if( xml )
			{
				var x = xml.getElementsByTagName("X_CODE")[0].firstChild.nodeValue;
				var y = xml.getElementsByTagName("Y_CODE")[0].firstChild.nodeValue;
				
				var size = new OpenLayers.Size(30,30);
				var offset = new OpenLayers.Pixel(-(size.w/2), -size.h);
				//var icon = new OpenLayers.Icon('http://localhost:9981/OpenLayers/examples/image/Balloon.bmp',size,offset);
				var icon = new OpenLayers.Icon('image/Balloon.bmp',size,offset);
				
				//OpenLayers.Layer.Markers 레이어에 특정 이미지를 특정 위치에 뿌립니다.
				KSIC.markers.addMarker(new OpenLayers.Marker(new OpenLayers.LonLat(x, y),icon));
			}
		}
	);
}
		
function init()
{	
	
	
	var control = null;
	var options = {
		projection: new OpenLayers.Projection("EPSG:2097"), //EPSG:2097
		displayProjection: new OpenLayers.Projection("EPSG:2097"),
		units: "m",
		maxResolution : "auto",
		//maxExtent:  new OpenLayers.Bounds( 171836.748526, 430494.198328, 223823.621719, 472890.250221),
		//maxExtent:  new OpenLayers.Bounds( 934969.095, 1936360.618, 972001.695, 1966682.529),
		//maxExtent:  new OpenLayers.Bounds( 100000, 400000, 972001.695, 1966682.529),
		//maxExtent:  new OpenLayers.Bounds( 121938.400, 58050.410, 197436.440, 155027.040),	
		maxExtent:  new OpenLayers.Bounds( 182001.637, 437272.781, 216052.524, 465001.092),		
		//maxExtent:  new OpenLayers.Bounds( 179191, 436548, 216243, 466846),
		//maxExtent:  new OpenLayers.Bounds( 202001.637, 437272.781, 196052.524, 465001.092),
		//maxExtent:  new OpenLayers.Bounds( 937987.650, 1937061.813, 971931.624, 1965805.093),
		//scales: [216000, 80000, 40000, 12000, 7000, 3372, 1686, 843],
		controls: [
//			new OpenLayers.Control.PanZoomBar(),
			new OpenLayers.Control.Scale(),
			new OpenLayers.Control.Navigation(),
			new OpenLayers.Control.MousePosition()	]
 	};

	KSIC.map = new OpenLayers.Map( 'map' , options );
	KSIC.layer = new OpenLayers.Layer.WMS(
			"IntraMap WMS", KSIC.servletUrl, 
			//{layers: arrLayers.join(',') , format: 'image/png'},
			{layers: getSelectedLayer() , format: getSelectedValue('getMapFormat')},
			{singleTile: true},
			{'buffer':0}    );

	//20101011
	KSIC.measureControls = 
	{
		line: new OpenLayers.Control.Measure( //거리측정 컨트롤 
	    OpenLayers.Handler.Path, { 
			persist: true, //그리기의 지속성 여부
			handlerOptions: {
			  layerOptions: {styleMap: KSIC.myStyles4} //위에서 설정한 그리기스타일 설정
			}
	    }
	),
	
	polygon: new OpenLayers.Control.Measure( //면적측정 컨트롤
			OpenLayers.Handler.Polygon, {
		    	persist: true,
				handlerOptions: {
		        	layerOptions: {styleMap: KSIC.myStyles4}
				}
		    }
		)
	};

	for(var key in KSIC.measureControls) 
	{
		control = KSIC.measureControls[key];
		control.events.on(
			{
			"measure": handleMeasurements,
			"measurepartial": handleMeasurements
		 	}
		 );
		 
		KSIC.map.addControl(control);
	}

	KSIC.map.addLayer(KSIC.layer);
	
	KSIC.buffer_wfs = new OpenLayers.Layer.Vector("buffer Features", {styleMap:KSIC.myStyles2});
	KSIC.markers = new OpenLayers.Layer.Markers( "Markers" );
	KSIC.map.addLayers([ KSIC.buffer_wfs, KSIC.markers ]);
	
	//KSIC.map.setCenter(new OpenLayers.LonLat(lon, lat), zoom);
	KSIC.map.zoomToMaxExtent();
	
	KSIC.map.addControl( new OpenLayers.Control.LayerSwitcher() );
			
	// 클릭 이벤트 등록
	//    click = new OpenLayers.Control.Click();			
	//    KSIC.map.addControl(click);
			
	KSIC.map.events.register('click', KSIC.map, function (e) 
			{				
				OpenLayers.Util.getElement('recordresult').innerHTML = "Loading... please wait...";					
				//alert(e.xy.x+" : "+e.xy.y);
				var pos = KSIC.map.getLonLatFromPixel(e.xy);
				var filter = "";
				var url =  
					KSIC.layer.getFullRequestString(
						{
							REQUEST: "GetFeatureInfo",
							EXCEPTIONS: "application/vnd.ogc.se_xml",
							BBOX: KSIC.layer.map.getExtent().toBBOX(),
							//BBOX: KSIC.map.getExtent().toBBOX(),
							X: e.xy.x,  //window 좌표
							Y: e.xy.y,  //window 좌표
							INFO_FORMAT: getSelectedValue('getFeatureInfoFormat'), //'text/html',
							QUERY_LAYERS: getSelectedLayer(),//getQueryLayers(),
							WIDTH: KSIC.layer.map.size.w,
							HEIGHT: KSIC.layer.map.size.h
						}
					);
			
				//WIDTH: KSIC.map.size.w,
				//HEIGHT: KSIC.map.size.h});
				//alert(url);
				OpenLayers.loadURL(url, '', this, setResult);
				//wfs getfeature 연산
				filter = '<ogc:Filter xmlns="http:www.opengis.net/ogc">';					
				filter += '<ogc:PropertyIsEqualTo>';
				filter += '<ogc:PropertyName>EMD_CD</ogc:PropertyName>';
				filter += '<ogc:Literal>11350105</ogc:Literal>';
				filter += '</ogc:PropertyIsEqualTo>';
				filter += '</ogc:Filter>';
				
				var url2 = KSIC.servletUrl + "?" + "SERVICE=WFS&REQUEST=GetFeature";
				url2 += "&TYPENAME=NW_LP_AA_EMD&SRSNAME=EPSG:2097";
				url2 += "&PROPERTYNAME=XGEOMETRY&FILTER=";
				url2 += filter;
				
				//alert("DEBUG~~" + url2);
				OpenLayers.loadURL(url2, '', this, setWFSResult);
				
				OpenLayers.Event.stop(e);
				
				if( KSIC.logPopup ) KSIC.logPopup.addLog("GetFeatureInfo : " + url);
		  }
	);
			  
	//뒤로, 앞으로
	KSIC.nav = new OpenLayers.Control.NavigationHistory();
	KSIC.map.addControl(KSIC.nav);
	
//	KSIC.click = new OpenLayers.Control.Click();
//	KSIC.map.addControl(KSIC.click);	
	// 페이지내 button 들에 이벤트 핸들러 할당.
	SetControlEventHandle();
	//------레이어 정보 구성.
	setLayerInfo( "layerinfo1", KSIC.arrLayers , onChkClick );		
	setLayerInfo( "layerinfo2", KSIC.arrLayers , onChkClick );

	
	//logPopup = window.open("bmtLogPopup.html", "", "width=800,height=600,scrollbars=yes");
}

function setWFSResult( response )
{
	var r = "";
	//r += '<wfs:FeatureCollection xmlns:wfs="http://www.opengis.net/wfs" xmlns:ksic="http://www.ksic.net/wfs" xmlns:ows="http://www.opengis.net/ows" xmlns:ogc="http://www.opengis.net/ogc" xmlns:gml="http://www.opengis.net/gml" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="1.1.0" service="WFS" xsi:schemaLocation="http://www.opengis.net/wfs http://localhost:9981/IntraMapGS/MapService?service=WFS&amp;request=DescribeFeatureType&amp;typename=subwaystation"> ';
	r = '<?xml version="1.0" encoding="UTF-8" ?> '
	r += '<wms:FeatureCollection xmlns:wms="http://www.opengis.net/wms"'
	r += 'xmlns:gml="http://www.opengis.net/gml"'
	r += 'xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"'
	r += 'xsi:schemaLocation="http://www.opengis.net/wms http://schemas.opengis.net/wms/1.3.0/wms.xsd http://www.opengis.net/gml http://schemas.opengis.net/gml/3.1.1/base/feature.xsd">'
	
	r += '<gml:boundedBy> ';
	r += '<gml:Envelope srsName="EPSG:2097"> ';
	r += '<gml:lowerCorner>945201.241594 1942052.232615</gml:lowerCorner> ';
	r += '<gml:upperCorner>945278.478031 1942233.308630</gml:upperCorner> ';
	r += '</gml:Envelope> ';
	r += '</gml:boundedBy> ';
	r += '<gml:featureMember> ';
	r += '<subwaystation gml:id="subwaystation.1"> ';
	r += '<ksic_geom> ';
	r += '<gml:Polygon srsName="EPSG:2097"> ';
	r += '<gml:exterior> ';
	r += '<gml:LinearRing> ';
	r += '<gml:posList dimension="2">945278.478247 1942058.772764 945260.822440 1942052.232535 945254.692159 1942070.048301 945201.241378 1942227.244516 945219.074547 1942233.308710 945272.360097 1942076.593550 945278.478247 1942058.772764</gml:posList> ';
	r += '</gml:LinearRing> ';
	r += '</gml:exterior> ';
	r += '</gml:Polygon> ';
	r += '</ksic_geom> ';
	r += '</subwaystation> ';
	r += '</gml:featureMember> ';
	r += '</wfs:FeatureCollection>';
			
	//alert(r);
	//alert(response.responseText);
	var options = {};
	OpenLayers.Util.extend(options, this.formatOptions);
	var gml = this.format ? new this.format(options) : new OpenLayers.Format.GML(options);
	var features = gml.read(response.responseText); 
	//var features = gml.read(r); 
	//var features = gml.read(str); 

	var bounds = ""; 
	
	if(features) 
	{
		//if(features.constructor != Array) 
		//{
		//	alert("not array");
		//	features = [features];  
		//}  
		for(var i=0; i<features.length; ++i) 
		{   
			if (!bounds) 
			{    
				bounds = features[i].geometry.getBounds();
			} 
			else 
			{   
				bounds.extend(features[i].geometry.getBounds());   
			}  
			//alert(features[i].geometry);
			//alert("bounds : " + bounds);
		}  

		KSIC.map.zoomToExtent(bounds);
		
		KSIC.buffer_wfs.addFeatures(features);
	}
}
		
// GetFeatureInfo 연산 결과
function setResult( response )
{
	//결과창에 text출력.
  	document.getElementById('recordresult').innerHTML = "";
	var txt = response.responseText;
	var txtElem = document.createTextNode(txt);
	document.getElementById('recordresult').appendChild(txtElem);
	
	//gml형식의 경우 vector 레이어에 추가. 해당 바운더리로 지도 이동, 해당 개체 하이라이트.
	var outputFormat = document.getElementById("getFeatureInfoFormat").value;
	
	if( outputFormat == "application/vnd.ogc.gml" )
	{
		var gml = new OpenLayers.Format.GML();
		var str = "";
		var bounds;
		
		str = '<?xml version="1.0" encoding="UTF-8" ?> '
		//str += '<wfs:FeatureCollection xmlns:wfs="http://www.opengis.net/wfs" xmlns:ksic="http://www.ksic.net/wfs" xmlns:ows="http://www.opengis.net/ows" xmlns:ogc="http://www.opengis.net/ogc" xmlns:gml="http://www.opengis.net/gml" xmlns:xlink="http://www.w3.org/1999/xlink" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="1.1.0" service="WFS" xsi:schemaLocation="http://www.opengis.net/wfs http://10.47.40.3/gml.xsd">'
		str += '<wms:FeatureCollection xmlns:wms="http://www.opengis.net/wms"'
		str += 'xmlns:gml="http://www.opengis.net/gml"'
		str += 'xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"'
		str += 'xsi:schemaLocation="http://www.opengis.net/wms http://schemas.opengis.net/wms/1.3.0/wms.xsd http://www.opengis.net/gml http://schemas.opengis.net/gml/3.1.1/base/feature.xsd">'
		
		str += '<gml:boundedBy>'
		str += '<gml:Envelope srsName="EPSG:2097">'
		str += '<gml:lowerCorner>204867.68 461238.38</gml:lowerCorner> '
		str += '<gml:upperCorner>204990.89 461380.98</gml:upperCorner> '
		str += '</gml:Envelope>'
		str += '</gml:boundedBy>'
		str += '<gml:featureMember>'
		str += '<NW_LP_PA_CBND gml:id="NW_LP_PA_CBND.19518">'
		str += '<ksic_geom>'
		str += '<gml:Polygon srsName="EPSG:2097">'
		str += '<gml:exterior>'
		str += '<gml:LinearRing>'
		str += '<gml:posList dimension="2">204960.24 461380.98 204967.52000000002 461376.89 204979.93 461332.70999999996 204972.24 461330.54000000004 204990.89 461263.95999999996 204899.56 461238.38 204867.68 461354.87 204915.83000000002 461368.44999999995 204960.24 461380.98</gml:posList> '
		str += '</gml:LinearRing>'
		str += '</gml:exterior>'
		str += '</gml:Polygon>'
		str += '</ksic_geom>'
		str += '</NW_LP_PA_CBND>'
		str += '</gml:featureMember>'
		str += '</wfs:FeatureCollection>'
				
		//alert(response.responseText);
		//var features = gml.read(response.responseText); 
		var features = gml.read(str); 
		
		if(features) 
		{
			if(features.constructor != Array) 
			{   
				features = [features];  
			}  
			for(var i=0; i<features.length; ++i) 
			{   
				if (!bounds) 
				{    
					bounds = features[i].geometry.getBounds();
				} 
				else 
				{   
					bounds.extend(features[i].geometry.getBounds());   
				}  
				
				alert("bounds : " + bounds);
			}  

			map.zoomToExtent(bounds);
			buffer_wfs.addFeatures(features);
		}
	}
}

//GetMap 연산 요청하는 레이어 목록.
function getSelectedLayer()
{
	var rStr = [];
	
	for( var i = 0; i < KSIC.arrLayers.length; i++)
	{
		if(KSIC.arrLayers[i].checked)
		{
			
			rStr.push(KSIC.arrLayers[i].name);
		}
	}	

	return rStr.join(',');
}

function setLayerInfo(id, arr, callback )
{
	//if( !arr ) return;
	//alert(id);
	var r = document.getElementById( id );
	
	var divElem;
	var chkElem;
	var txtElem;
	var table;
	var tr;
	var td;
	var tmp = [];	
	var tbody ;
	var c;
	var d;
	
	
	table = document.createElement('table');
	table.setAttribute("border", "0");
	table.setAttribute("cellspacing", "0");
	table.setAttribute("cellpadding", "0");		

	tbody = document.createElement("tbody");

	if(id =='layerinfo1'){
		c=0;
		d=14;
	}else{
		c=14;
		d=arr.length;
	
		}
	
	for( var i = c; i <d ; i++) 
	{

		tr = document.createElement('tr');
		td = document.createElement('td');
		td.setAttribute("width", "150");
		
		//divElem = document.createElement('div');
		chkElem = document.createElement('input');
		chkElem.type = 'checkbox';
		
		chkElem.checked = arr[i].checked;
		chkElem.onclick = callback;
		
		chkElem.name = arr[i].name;
		
		//divElem.appendChild(chkElem);
		td.appendChild(chkElem);
		
		txtElem = document.createTextNode(arr[i].text);
		td.appendChild(txtElem);
		tr.appendChild(td);
		tbody.appendChild(tr);	
		

	//	r.appendChild(divElem);
		

		//alert(r);
		if( id == 'layerinfo1' || id == 'layerinfo2'  ) chkElem.checked = arr[i].checked;
		else					 chkElem.checked = arr[i].qCheck;
	}

	table.appendChild(tbody);	
	r.appendChild(table);

	

	
}
		
function onSelectImageFormat()
{
	var newParam = {'format' : getSelectedValue('getMapFormat') };
	
	layer.mergeNewParams( newParam );
	var tmpBnd = layer.getExtent();
	if( logPopup )
	logPopup.addLog( "GetMap : " + layer.getURL(tmpBnd) );
}

// GetMap 레이어 목록 선택시 재요청하는거...
function onChkClick()
{
	//alert(this.name);
	
	for( var i = 0; i < KSIC.arrLayers.length; i++ )
	{
		if( KSIC.arrLayers[i].name == this.name ) {
			KSIC.arrLayers[i].checked = this.checked;
			break;
		}
	}
	
	var newParams = {'layers' : getSelectedLayer(), 'format' : getSelectedValue('getMapFormat') };
	KSIC.layer.mergeNewParams( newParams );
	//layer.redraw();
	
	var tmpBnd = KSIC.layer.getExtent();
	if( KSIC.logPopup )
		KSIC.logPopup.addLog( "GetMap : " + layer.getURL(tmpBnd) );
}
		
// GetFeatureInfo 연산할 대상 레이어 목록.
function getQueryLayers()
{
	var ret = [];
	for( var i = 0; i < KSIC.arrLayers.length; i++ )
	{
		if( KSIC.arrLayers[i].qCheck )
			ret.push(KSIC.arrLayers[i].name);
	}
	
	return ret.join(',');
}

// GetFeatureInfo연산에 필요한 레이어 선택하기위한 체크박스 클릭시.
function onChkClick2()
{
	//if( this.checked ){
	//	if( selectedLayer.indexOf( this.name ) == -1 )
	//		selectedLayer.push(this.name);
	//}
	for( var i = 0; i < KSIC.arrLayers.length; i++ )
	{
		if( KSIC.arrLayers[i].name == this.name )
		{
			KSIC.arrLayers[i].qCheck = this.checked;
			break;
		}
		//if( arrLayers[i].qCheck )
		//	selectedLayer.push(this.name);
	}
}

// 콤보박스에서 선택한 값 리턴.
function getSelectedValue( id )
{
	if( typeof id != "string" )
		return null; 
		
	var o = document.getElementById(id);
	if( o )
		return o.value;
	else 
		return null;
}

/*
$(document).ready(function(){
    init();
	//changeSize();
});

function changeSize()
{
    var vMapLeft, vMapTop, vMapHeigh, vMapWidth;
    vMapLeft  = 0;
    vMapTop   = 53;
    vMapHeight = $(window).height() -55;
    vMapWidth  = $(window).width()  -6;
    $("#map").css("left",  vMapLeft);
    $("#map").css("top",   vMapTop);
    $("#map").css("height",vMapHeight);
    //$("#map").css("zIndex",-100);
}
*/

////////////////////////////////////////////////////////////////////////////////
// 최주영 2010. 12. 21 작성.
function SetMouseMode(nMode)
{
	g_nMouseMode = nMode;
}

function DoubleClickEvent()
{
    var objXY     = g_objEvent.geometry.getVertices();
    
    var erNLonLat = new Array();
    var objData   = null;
    var strData   = "";
    //_MOVE = 0, _AREA = 1, _AREA_SEARCH
    
	switch(g_nMouseMode)
	{
	case 0 : return; // _MOVE
	case 1 : return; // _AREA
	case 2 : // _AREA_SEARCH
		g_nMouseMode = _MOVE;
		KSIC.mode = "move";

	g_erXYLocation[g_nIndex++] = 
			new OpenLayers.LonLat(objXY[objXY.length-1].x, objXY[objXY.length-1].y);
		//g_erXYLocation[g_nIndex++] = new CPoint(objXY[objXY.length-1].x, objXY[objXY.length-1].y);
		doGetAreaRecord(0, "UQS500", g_erXYLocation, "ID");
		
		delete g_erXYLocation;
		g_erXYLocation = new Array();
		g_nIndex       = 0;
		toggleControl();
		
		return;
	}
}

function layerOnOff(){
	var layer = document.getElementById('layerinfo').style.visibility;

	if(layer == 'hidden'){
		document.getElementById('layerinfo').style.visibility = "visible";
	}else {
		document.getElementById('layerinfo').style.visibility = "hidden";
	}
}

function remarksOnOff(){

	
	var remarks = document.getElementById('remarks').style.visibility;

	if(remarks == 'hidden'){
		document.getElementById('remarks').style.visibility = "visible";
	}else {
		document.getElementById('remarks').style.visibility = "hidden";
	}
	
}
		
	


function doGetAreaRecord(nMapId, nLayerId, geoFilter, strFieldName)
{
	var objParam = 
	{
		"MapID"     : nMapId, 
		"LayerName" : nLayerId, 
		"Filter"    : [], 
		"GeoFilter" : geoFilter, 
		"ReturnFieldName" : [strFieldName] // EQUIPCODE^XGEOMETRY
	};
	
	AreaSearch(objParam);
}

function AreaSearch(objParam)
{
	try
	{
		var url   = "/IntraMap/MapService?";
		var param = "SERVICE=WFS&REQUEST=GetFeature";
		
		param += "&TYPENAME="+objParam.LayerName; //요청 테이블명
		param += "&SRSNAME=EPSG:2097";
		param += "&PROPERTYNAME="+objParam.ReturnFieldName; //요청 속성명
		param += "&FILTER=";
		param += "<ogc:Filter xmlns:ogc=\"http://www.opengis.net/ogc\">";
		param += "<ogc:Intersects>"; 
		param += "<ogc:PropertyName>XGEOMETRY</ogc:PropertyName>";
		param += "<gml:Polygon xmlns:gml=\"http://www.opengis.net/gml\">";
		param += "<gml:outerBoundaryIs>";
		param += "<gml:LinearRing>";
		param += "<gml:coordinates decimal=\"0\" cs=\",\" ts=\" \" > " + GetXGeometryURL(objParam.GeoFilter);
		param += "</gml:coordinates>";
		param += "</gml:LinearRing>";
		param += "</gml:outerBoundaryIs>";
		param += "</gml:Polygon>";
		param += "</ogc:Intersects>";
		param += "</ogc:Filter>";

		//POST방식으로 요청
		//혹은 좌표문자열이 길 경우 쿼리가 안 될 수 있으므로 ajax의 post방식으로 요청
		new OpenLayers.Request.POST(
				{
					method: "POST",
					url: url + param,
					callback: AreaSearchParseGeoData
				}
			);
	}
	catch(e) {  }
}

function SearchFailure(response)
{
	alert('Record 검색에 실패하였습니다.');
	return;
}

function AreaSearchParseGeoData(response)
{
	var resultXml = response.responseXML;
	var rSet      = new RecordSet();
	rSet.Init();

	alert("resultTxt : " + resultXml);
	/*/
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
	*/
}

function GetXGeometryURL(erGeometryFilter)
{
	var strURL = "";
	//lon == y lat == x
	for(var i = 0;i < erGeometryFilter.length; i++)
	{
		if(Geometry.length - 1 == i)
			strURL += erGeometryFilter[i].lat + ","+ erGeometryFilter[i].lon;
		else
			strURL += erGeometryFilter[i].lat + ","+ erGeometryFilter[i].lon + " ";
	}
	
	return strURL;
}

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
			alert("검색 결과가 존재 하지 않습니다.");
	}
	else
		alert("검색 결과가 존재 하지 않습니다.");
	
	//document.getElementById("PleaseWaitSearch").style.display = "none";
	//document.getElementById("PleaseWaitSearch").src = "";
	
	erObjResult[0] = erStrKeyValue; erObjResult[1] = erStrTableName;
	/*
	if( g_erStrSelectLayerId.length == 
		TmpSaveAreaSearchResult(erObjResult) )
		RtnDialog();
	*/
}

function goResult(){

	var selectGu = document.getElementById("selectGu").value;
	var selectDong = document.getElementById("selectDong").value;
	var selectRoad = document.getElementById("selectRoad").value;
	var selectOwn = document.getElementById("selectOwn").value;
	var selectJi = document.getElementById("selectJi").value;
	var prevJiga = document.getElementById("prevJiga").value;
	var nextJiga = document.getElementById("nextJiga").value; 


	
	var encRoad = encodeURIComponent(selectRoad);
	//var encRoad = encodeURI(selectRoad);
    //var encRoad  = selectRoad;
 

	var param = "?selectGu="+selectGu+"&selectDong="+selectDong+"&selectRoad="+encRoad+"&selectOwn="+selectOwn;
		  param += "&selectJi="+selectJi+"&prevJiga="+prevJiga+"&nextJiga="+nextJiga;
		  
	var url = "/rams/map/juckjianalysisres.do";

	//alert(url+param);
	
	document.getElementById("searchResult").src = url+param;

}

</script>

</head>

<!-- height:expression(screen.availHeight-350), width: expression(screen.availWidth)-->
<body onload="init();"  style="height:550px;width:1200px;">

<input type="hidden" id = "selectGu"  name ="selectGu"  value=""></input>
<input type="hidden" id = "selectDong"  value="selectDong"  value=""></input>
<input type="hidden" id = "selectRoad"  value="selectRoad"  value=""></input>
<input type="hidden" id = "selectOwn"  value="selectOwn"  value=""></input>
<input type="hidden" id = "selectJi"  value="selectJi"  value=""></input>
<input type="hidden" id = "prevJiga"  value="prevJiga"  value=""></input>
<input type="hidden" id = "nextJiga"  value="nextJiga"  value=""></input>




<!-- 왼쪽 창 --> 
<iframe src="${iFrameUrl1}"  id="search"  name= "search" frameborder='0' height="280px" width="277px"  style="position:absolute;left:0px;top:0px;z-index:5;visibility:visible;"></iframe>
<iframe src="${iFrameUrl2}" scrolling='yes' id="searchResult" name = "searchResult"  frameborder='0' height="380px" width="277px" style="position:absolute;left:0px;top:280px;z-index:5;visibility:visible;overflow:scroll;"></iframe>

<div id="map" ondblclick="DoubleClickEvent();" name="map" class="smallmap" style="position:absolute;top:0px;left:100px;width:100%;height:100%;z-index:2;">
</div>
<div>
	<span id="txtCentroidResult"></span>
</div>

<div id="topControl" style="position:absolute;top:0px;left:265px;z-index:3">
	<table width="620" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="15" height="48" ><img src="/rams/images/map/t_left.gif" alt="." border="0"/></td>
		<td width="46"><img src="/rams/images/map/t_prev_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnPrev','','/rams/images/map/t_prev_on.gif',1)"alt="이전" name="btnPrev"  id="btnPrev" border="0" style='cursor:hand;'/></td>
		<td width="46"><img src="/rams/images/map/t_next_off.gif"  onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnNext','','/rams/images/map/t_next_on.gif',1)"  alt="이후" name="btnNext" border="0" id="btnNext" style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_all_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnFit','','/rams/images/map/t_all_on.gif',1)" alt="전체" name="btnFit" border="0"  id="btnFit" style='cursor:hand;'/></td>
		<td width="46"><img src="/rams/images/map/t_plus_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnZoomIn','','/rams/images/map/t_plus_on.gif',1)" alt="확대" name="btnZoomIn" border="0" id="btnZoomIn" style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_minus_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnZoomOut','','/rams/images/map/t_minus_on.gif',1)" alt="축소" name="btnZoomOut" border="0" id="btnZoomOut" style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_move_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image8','','/rams/images/map/t_move_on.gif',1)" alt="이동" name="Image8" border="0" id="Image8" style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_dist_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnDistance','','/rams/images/map/t_dist_on.gif',1)" alt="거리" name="btnDistance" border="0" id="btnDistance"  style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_area_off.gif" alt="면적" onclick="GetArea();" name="Image10" border="0" id="Image10" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image10','','/rams/images/map/t_area_on.gif',1)" style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_new_off.gif" onclick='onPopupClose();' onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image11','','/rams/images/map/t_new_on.gif',1)" alt="새로고침" name="Image11" border="0" id="Image11" style='cursor:hand;' /></td>
		<td width="45"><img src="/rams/images/map/t_sate_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image12','','/rams/images/map/t_sate_on.gif',1)" alt="위성영상" name="Image12" border="0" id="Image12" style='cursor:hand;' /></td>
		<!--<td width="45" onclick="GetAreaSearch();" style="cursor:hand" > 영역검색 </td>-->
		<td align="right" background="/rams/images/map/t_bg.gif">
			 <table width="65" border="0" cellspacing="0" cellpadding="0">
									<tr>
									  <th align="right" scope="row">레이어</th>
									  <td width="20" align="right"><label for="checkbox"><input type="checkbox" name="checkbox" value="checkbox" id="checkbox"  onClick="javascript:layerOnOff();"/></label></td>
									</tr>
									<tr>
									  <th align="right" scope="row">범례</th>
									  <td align="right"><label for="checkbox"><input type="checkbox" name="checkbox" value="checkbox" id="checkbox"  onClick="javascript:remarksOnOff();"/></label></td>
									</tr>
							    </table>
		</td>
		<td width="4"><img src="/rams/images/map/t_right.gif" alt="." border="0"/></td>
	</tr>
	</table>
</div>		

	<div id="layerinfo" class="clsDrag" style="position:absolute;top:100px;left:expression((screen.availWidth/2)-50);px;z-index:6;visibility:hidden;filter:alpha(opacity=100);width:300px;background:white;">
				
				<table border='1'>
				<tr bgcolor="yellow">
				<td height='25'>용도지역지구</td>
				<td>도시계획시설</td>
				</tr>
				<tr>
						<td>							
				<div id="layerinfo1"   >
	
				</div>	
				</td>
				<td valign="top">			
				<div id="layerinfo2"  >		
						
				</div>				
				</td>
				</tr>
				</table>
				</div >
				
				<div id="remarks" class="clsDrag" style="position:absolute;top:100px;left:expression((document.body.clientWidth/2)-50);px;z-index:6;visibility:hidden;filter:alpha(opacity=100);width:400px;background:white;">
					<table border="1" style="width:400px;height:100px;">
									<tr><td colspan='2' bgcolor="yellow" align="center">주거지역</td></tr>
									<tr>
										<td>
												<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/1DivHome.jpg"> </td>
																	<td width="140">제1종전용주거지역</td>															
														</tr>
												</table>
										</td>	
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/1GenHome.jpg"> </td>
																	<td width="140">제1종일반주거지역</td>															
														</tr>
												</table>
										</td>					
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/2DivHome.jpg"> </td>
																	<td width="140">제2종전용주거지역</td>																	
														</tr>
												</table>										
										</td>				
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/2GenHome7.jpg"> </td>
																	<td width="140">제2종일반주거지역(7층)</td>															
														</tr>
												</table>
										</td>												
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/2GenHome12.jpg"> </td>
																	<td width="140">제2종일반주거지역(12층)</td>																	
														</tr>
												</table>
										</td>				
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/3GenHome.jpg"> </td>
																	<td width="140">제3종일반주거지역</td>															
														</tr>
												</table>
										</td>													
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/HalfHome.jpg"> </td>
																	<td width="140">준주거지역</td>																	
														</tr>
												</table>
										</td>																
										<td>
											
										</td>	
									</tr>
					</table>
					<br><br></br>
					<table border="1" style="width:400px;height:40px;">
					<tr><td colspan='2' bgcolor="yellow" align="center">상업지역</td></tr>
									<tr>
									
										<td>
												<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/1DivHome.jpg"> </td>
																	<td width="140">중심상업지역</td>															
														</tr>
												</table>
										</td>	
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/GenBuy.jpg"> </td>
																	<td width="140">일반상업지역</td>															
														</tr>
												</table>
										</td>					
									</tr>
									
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/GnBuy.jpg"> </td>
																	<td width="140">근린상업지역</td>																	
														</tr>
												</table>										
										</td>				
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/UtBuy.jpg"> </td>
																	<td width="140">유통상업지역</td>															
														</tr>
												</table>
										</td>												
									</tr>
					</table>
							<br><br></br>
					<table border="1" style="width:400px;height:40px;">
					<tr><td colspan='2' bgcolor="yellow" align="center">녹지지역</td></tr>
									<tr>
									
										<td>
												<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/naturalnok.jpg"> </td>
																	<td width="140">자연녹지지역</td>															
														</tr>
												</table>
										</td>	
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/nok2.jpg"> </td>
																	<td width="140">생산녹지지역</td>															
														</tr>
												</table>
										</td>					
									</tr>
									
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/bojunnok.jpg"> </td>
																	<td width="140">보전녹지지역</td>																	
														</tr>
												</table>										
										</td>				
										<td>
											
										</td>												
									</tr>					
					</table>
						<br><br></br>
					<table border="1" style="width:400px;height:40px;">
					<tr><td colspan='2' bgcolor="yellow" align="center">미관지구</td></tr>
									<tr>
									
										<td>
												<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/miguan_middle.jpg"> </td>
																	<td width="140">중심지미관지구</td>															
														</tr>
												</table>
										</td>	
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/migaun_gen.jpg"> </td>
																	<td width="140">역사문화미관지구</td>															
														</tr>
												</table>
										</td>					
									</tr>
									
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/migaun_gen.jpg"> </td>
																	<td width="140">일반미관지구</td>																	
														</tr>
												</table>										
										</td>				
										<td>
											
										</td>												
									</tr>									
					</table>
					<br><br></br>
					<table border="1" style="width:400px;height:120px;">
					<tr><td colspan='2' bgcolor="yellow" align="center">기타지역</td></tr>
									<tr>									
										<td>
												<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/industry.jpg"> </td>
																	<td width="140">공업지역</td>															
														</tr>
												</table>
										</td>	
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/kyungan.jpg"> </td>
																	<td width="140">경관지구</td>															
														</tr>
												</table>
										</td>					
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/godo.jpg"> </td>
																	<td width="140">고도지구</td>																	
														</tr>
												</table>										
										</td>				
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/fire.jpg"> </td>
																	<td width="140">방화지구</td>															
														</tr>
												</table>
										</td>												
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/fireje.jpg"> </td>
																	<td width="140">방재지구</td>																	
														</tr>
												</table>
										</td>				
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/bojon.jpg"> </td>
																	<td width="140">보존지구</td>															
														</tr>
												</table>
										</td>													
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/fire.jpg"> </td>
																	<td width="140">시설보호지구</td>																	
														</tr>
												</table>
										</td>																
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/fire.jpg"> </td>
																	<td width="140">용도취락지구</td>															
														</tr>
												</table>
										</td>	
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/develop.jpg"> </td>
																	<td width="140">개발진흥지구</td>																	
														</tr>
												</table>
										</td>																
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/fire.jpg"> </td>
																	<td width="140">국토이용기타용도지구</td>															
														</tr>
												</table>
										</td>	
									</tr>
									
									
					</table>
				</div>
				
				
<div id='mPopup' style='z-index:6;display:block'>
	
</div>
<div id="recordresult" style="position:absolute; top:350px;right:650px;"></div>

</body>

</html>