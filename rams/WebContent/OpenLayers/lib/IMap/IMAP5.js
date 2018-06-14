/* Copyright (c) 2008 Avencia, Inc., published under the Clear BSD
 * license.  See http://svn.openlayers.org/trunk/openlayers/license.txt for the
 * full text of the license. */




/**
 * Class: OpenLayers.Layer.ArcGIS93Rest
 *
 * Inherits from:
 *  - <OpenLayers.Layer.Grid>
 */
OpenLayers.Layer.IMAP5 = OpenLayers.Class(OpenLayers.Layer.Grid, {

    /**
     * Constant: DEFAULT_PARAMS
     * {Object} Hashtable of default parameter key/value pairs 
     */
    DEFAULT_PARAMS: { 
		cmd:'DrawMapAjax',
		ImageType: 1,
		//Width: 512,
		//Height: 256,
		//CenX: 192336, //194896,
		//CenY: 247885,//305248,
		//ZoomValue: 500,
		LayerControl: 'null',
		Show3D: 0,
		LoadColor: '',
		LoadFlag: 'null'
    },
    
	variableParams: {
		CenX:null,
		CenY:null,
		Width:null,
		Height:null,
		ZoomValue:null
	},
    
	// proj : IntraMap 5.0 좌표계에 맞게 하기위한 XCoordinate 객체.
	proj : null, 

	
    /**
     * APIProperty: isBaseLayer
     * {Boolean} Default is true for IMAP5 layer
     */
    isBaseLayer: true,
 
	mapUrl : null,
 
	mapBound : null, 
	
    /**
     * Constructor: OpenLayers.Layer.IMAP5
     * Create a new IMAP5 layer object.
     */
    initialize: function(name, url, params, options, minX, minY, maxX, maxY) {
		options = options || {};
	
		this.mapUrl = url;
		// 좌표계 변환용...
		this.proj = new XCoordinate();
		
        var newArguments = [];        /*
		this.bTrans = this.proj.setProj("EPSG:2097", "EPSG:4326");
		this.proj.ConvertCoord(this.DEFAULT_PARAMS.CenX, this.DEFAULT_PARAMS.CenY);
		if(this.bTrans) {
			//this.map.setCenter(new OpenLayers.LonLat(this.proj.toX, this.proj.toY));
			console.log("initial Center Pos : " + this.proj.toX + ", " + this.proj.toY);
		}
		
		//Layer properties setting.
		//options.center = new OpenLayers.LonLat(this.proj.toX, this.proj.toY);
		
		console.log("in initialize before cnv : " + this.DEFAULT_PARAMS.CenX + ", " + this.DEFAULT_PARAMS.CenY);
		console.log("in initialize after cnv : " + this.proj.toX + ", " + this.proj.toY);
		
		
		//options.zoom = 0;
		//options.ratio = 1;
		//options.tileSize = new OpenLayers.Size(512, 256);
		
		var newExtent = [];
		this.proj.setProj("EPSG:2097", "EPSG:4326");
		this.proj.ConvertCoord(-876541.77000000, -523725.34000000);
		//this.proj.ConvertCoord(-100000, -300000);
		newExtent.push(this.proj.toX);
		newExtent.push(this.proj.toY);
		console.log("init Left Bottom : " + this.proj.toX + ", " + this.proj.toY);
		
		this.proj.setProj("EPSG:2097", "EPSG:4326");
		this.proj.ConvertCoord(1768877.86000000, 1471611.14000000);
		//this.proj.ConvertCoord(500000, 1000000);
		newExtent.push(this.proj.toX);
		newExtent.push(this.proj.toY);
		console.log("init Right Top : " + this.proj.toX + ", " + this.proj.toY);
		*/
		//options.maxExtent = new OpenLayers.Bounds(newExtent[0], newExtent[1], newExtent[2], newExtent[3]);
		
		// ajax로 getallmapinfoxml 읽어서 바운더리 설정해야함.
		//var boundUrl = this.mapUrl + "cmd=getallmapinfoxml";
		
		
		
		//options.maxExtent = new OpenLayers.Bounds(85093.03000000, 371368.31000000, 275030.53000000, 530959.51000000);
		options.maxExtent = new OpenLayers.Bounds(minX, minY, maxX, maxY);
		
		mapBound = options.maxExtent;
		
		if( params )
		{
			this.DEFAULT_PARAMS.Show3D = params[0].Show3D;
			this.DEFAULT_PARAMS.LayerControl = params[0].LayerControl;
			//this.DEFAULT_PARAMS.LoadColor = params[0].LoadColor;
			this.DEFAULT_PARAMS.LoadFlag = params[0].LoadFlag;
		}
		
		//options.maxExtent = new OpenLayers.Bounds(minX, minY, maxX, maxY);
		newArguments.push(name, url, params, options);
		OpenLayers.Layer.Grid.prototype.initialize.apply(this, newArguments);
		OpenLayers.Util.applyDefaults(
					  this.params, 
					  this.DEFAULT_PARAMS
					  );
		
		this.singleTile = true;
		//this.gutter = 1;
		this.ratio = 1;
		
		this.grid = [];
		
	},  

	
	/*
		MapInit : 사용하지 않음.
	*/
	MapInit:function(minX, minY, maxX, maxY, params, obj) 
	{
		var newArguments = [];
		var options = {};
	},
    
    /**
     * Method: destroy
     * Destroy this layer
     */
    destroy: function() {
        // for now, nothing special to do here. 
        OpenLayers.Layer.Grid.prototype.destroy.apply(this, arguments);  
    },   
    
    
    /**
     * Method: getURL
     * Return an image url this layer.
     *
     * Parameters:
     * bounds - {<OpenLayers.Bounds>} A bounds representing the bbox for the
     *                                request.
     *
     * Returns:
     * {String} A string with the map image's url.
     */
    getURL: function (bounds) {
        bounds = this.adjustBounds(bounds);
		
		var center = bounds.getCenterLonLat();
		
		
		
		var imageSize = this.getImageSize(); 
		
		var dw = bounds.getWidth();
		var dh = bounds.getHeight();
		
		var iw = this.getImageSize().w;
		var ih = this.getImageSize().h;
		
		var z = (dw/iw);
		
		if( (dw/iw) > (dh/ih) )
			z = (dh / ih);
		
		//z*=1000;
		
		/*
		// 이건 맵 바운더리를 계산하는 부분
		double dataWidth	= ( m_cViewRect.Width() * m_rDisplayScale ) / 2.0;
		double dataHeight	= ( m_cViewRect.Height() * m_rDisplayScale ) / 2.0;

		m_cViewBound.MinX = ViewCenter.x - dataWidth;
		m_cViewBound.MaxX = ViewCenter.x + dataWidth;
		m_cViewBound.MinY = ViewCenter.y - dataHeight;
		m_cViewBound.MaxY = ViewCenter.y + dataHeight;
		point.x = ( MaxX - MinX )/2 + MinX;
		point.y = ( MaxY - MinY )/2 + MinY;
		*/
		
		
        var newParams = {
            //'BBOX': this.encodeBBOX ?  bounds.toBBOX() : bounds.toArray(),
            'Width': imageSize.w,
            'Height': imageSize.h,
			'CenX': center.lon,
			'CenY': center.lat,
			'ZoomValue': z
        };
		
		this.variableParams.Width = newParams.Width;
		this.variableParams.Height = newParams.Height;
		this.variableParams.CenX = newParams.CenX;
		this.variableParams.CenY = newParams.CenY;
		this.variableParams.ZoomValue = newParams.ZoomValue;
		
		var requestString = this.getFullRequestString(newParams);
		
		//alert(requestString);
		//var requestString = this.getFullRequestString();
        return requestString;
    },
    
    /**
     * Method: setLayerFilter
     * addTile creates a tile, initializes it, and adds it to the layer div. 
     *
     * Parameters:
     * id - {String} The id of the layer to which the filter applies.
     * queryDef - {String} A sql-ish query filter, for more detail see the ESRI
     *                     documentation at http://sampleserver1.arcgisonline.com/ArcGIS/SDK/REST/export.html
     */
    setLayerFilter: function ( id, queryDef ) {
        if (!this.layerDefs) {
            this.layerDefs = {};
        }
        if (queryDef) {
            this.layerDefs[id] = queryDef;
        } else {
            delete this.layerDefs[id];
        }
    },
    
    /**
     * Method: clearLayerFilter
     * Clears layer filters, either from a specific layer,
     * or all of them.
     *
     * Parameters:
     * id - {String} The id of the layer from which to remove any
     *               filter.  If unspecified/blank, all filters
     *               will be removed.
     */
    clearLayerFilter: function ( id ) {
        if (id) {
            delete this.layerDefs[id];
        } else {
            delete this.layerDefs;
        }
    },
    
    /**
     * APIMethod: mergeNewParams
     * Catch changeParams and uppercase the new params to be merged in
     *     before calling changeParams on the super class.
     * 
     *     Once params have been changed, the tiles will be reloaded with
     *     the new parameters.
     * 
     * Parameters:
     * newParams - {Object} Hashtable of new params to use
     */
    mergeNewParams:function(newParams) {
        //var upperParams = OpenLayers.Util.upperCaseObject(newParams);
        //var newArguments = [upperParams];
        //return OpenLayers.Layer.Grid.prototype.mergeNewParams.apply(this, 
        //                                                     newArguments);
		
		return OpenLayers.Layer.Grid.prototype.mergeNewParams.apply(this, 
                                                             [newParams]);
    },
	
    /**
     * Method: addTile
     * addTile creates a tile, initializes it, and adds it to the layer div. 
     *
     * Parameters:
     * bounds - {<OpenLayers.Bounds>}
     * position - {<OpenLayers.Pixel>}
     * 
     * Returns:
     * {<OpenLayers.Tile.Image>} The added OpenLayers.Tile.Image
	 */     
    addTile:function(bounds,position) {
		return new OpenLayers.Tile.Image(this, position, bounds, 
                                         null, this.tileSize);
    },
	
	getFullRequestString:function(newParams, altUrl) {
        
		return OpenLayers.Layer.Grid.prototype.getFullRequestString.apply(
                                                    this, arguments);
    },

	show:function(){
		alert("show imap5");
	}, 
	
	GetIMAPRecord: function(param, callback)
	{
		if(!param)
			return;

		//var strResult = "-9999";
		
		// parseGeoData : XGEOMETRY 겟레코드 결과를 파싱....
		this.parseGeoData = function(response) 
		{
			var resultTxt = response.responseText;
			//alert(resultTxt);
			
			if( resultTxt == "" )
			{
				alert("Not Found");
				return;
			}
			
			
			var rSet = new RecordSet();
			rSet.Init();
			
			var r = resultTxt.split("#");
			
			var eachR;
			var eachNormal;
			var eachGeo;

			
			
			for(var i = 0; i < r.length; i++) 
			{
				eachR = new Record();
				eachR.Init();	
				
				var normal;
				var geo;

				if(i == 0) 
				{
					var tmp = r[i].split("!");
					var bound = tmp[1].split("^");		//MinX, MinY, MaxX, MaxY 정보 
					rSet.MinX = bound[0];
					rSet.MinY = bound[1];
					rSet.MaxX = bound[2];
					rSet.MaxY = bound[3];
					
					//tmp[2] 로 NormalField, GeometryField를 셋팅해야함...
					
					normal = tmp[2].split("*")[0];
					geo =    tmp[2].split("*")[1];
				}
				else
				{
					if( r[i].length == 0) 
						break;
					
					normal = r[i].split("*")[0];
					geo =    r[i].split("*")[1];
				}
				
				//NormalFields 셋팅
				
				if( normal != "-" )
				{
					
					
					var tmpNormal;
					tmpNormal = normal.split("@");
					
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
				geo = geo.replace("#", "");
				var arrGeo = geo.split("|");
				
				
				
				//CoordCount 설정
				eachGeoSet = new GeometryFieldSet();
				eachGeoSet.Init();
				
				var eachGeo = new Geometry();
				eachGeo.Init();
				
				
				var tmpGeoInfo = arrGeo[0].split("^");
				
				//eachGeo.SetGeometryType( parseInt(arrGeo[0].substring(0, arrGeo[0].indexOf("^") ) ) );
				eachGeo.SetGeometryType( parseInt( tmpGeoInfo[0] ) );
				
				
				
				//
				// 이 아랫 부분에 멀티 폴리곤 부분도 되도록 수정해야함....
				//
				eachGeo.SetPartCount( parseInt( tmpGeoInfo[1] ) );
				
				//eachGeo.SetCoordCount( parseInt( arrGeo[0].substring( arrGeo[0].lastIndexOf("^")+1 ) ) );
				eachGeo.AddCoordCount( parseInt( tmpGeoInfo[2] ) );
			
				
				// for multiPolygon...
				for( var g = 1 ; g < arrGeo.length; g++ )
				{
					var coordSet = arrGeo[g].split('$')[0];
					var coordCnt = arrGeo[g].split('$')[1];
					
					eachGeo.AddCoordXYZSet(coordSet);
					
					if( coordCnt ) {
						
						
						eachGeo.AddCoordCount( parseInt(coordCnt) );
					}
				}
				
				//eachGeo.AddCoordXYZSet(arrGeo[1]);
				
				eachGeoSet.AddGeometry(eachGeo);

				eachR.SetGeometryFieldSet( eachGeoSet );
				
				//레코드셋에 레코드 추가.
				rSet.AddRecord(eachR);
			}
				
			callback(rSet);
			
		};
		
		//parseData : 레코드 검색 결과 파싱 (Only Normal Field 인 경우...)
		this.parseData = function(response)
		{
			
			//alert(response.responseText);
			var resultTxt = response.responseText;
			
			
			//recordset 할당..파싱~~!!!
			var rSet = new RecordSet();
			rSet.Init();
			
			//var rSet = new Array();
			
			
			var eachR;
			var eachF;	
			//
			var r = resultTxt.split("#");
			
			
			var tmpR = "";
			var lIndex = -1;
			var arrFieldNames, arrFieldValues;
			for(var i = 0; i < r.length; i++) {
				//tmpR : 하나의 레코드.
				tmpR = r[i].replace("*-", "");	//'*-' 를 제거.
				lIndex = tmpR.lastIndexOf("!");
				if(lIndex != -1)
					tmpR = tmpR.substring(lIndex+1);
				
				
				arrFieldNames = tmpR.split('@')[0];
				arrFieldValues = tmpR.split('@')[1];
				
				// 각각의 레코드에 필드값을 넣기.
				eachR = new Record();
				eachR.Init();
				
				for(var j = 0; j < arrFieldNames.split('^').length; j++) {
					eachF = new NormalFields();
					eachF.Init();
					
					eachF.SetFieldName(arrFieldNames.split('^')[j]);
					eachF.SetFieldValue(arrFieldValues.split('^')[j]);
					
					
					
					eachR.AddNormalField(eachF);
				}
				
				rSet.AddRecord(eachR);
			}
			// 콜백에서 recordSet을 받아서 처리하도록...
			callback(rSet);
			
		};
		
		//failure : 레코드 검색 실패.
		this.failure = function(response)
		{
			alert('Record 검색에 실패하였습니다.');
			return;
		};
		
		if(param.MapID < 0)
			return;
		
		try
		{
			var MapID = param.MapID;
			var LayerID = param.LayerID;
			var FilterList = param.Filter;
			var FilterStr = [];
			
			//노말 필터.
			for(var i=0; i < FilterList.length; i++) {
				for(var val in FilterList[i]) {
					FilterStr.push(val+"-"+ FilterList[i][val]);
				}
			}
			
			//지오메트리 필터
			var geoFilter = param.GeoFilter;
			
			var filter = FilterStr.join(",");
			
			var ReqStr = param.ReturnFieldName.join("^");
			
			//일단 테스트..
			//var url = ["http://localhost:9981/servlet/intramapswg.MapServiceV5?"];	
			var url = [this.mapUrl];
			
			/*
			url.push("cmd=Record&", "RequestType=0&");
			url.push("Width=512&", "Height=256&");
			url.push("CenX=195586.865356&", "CenY=449160.673180&");
			url.push("ZoomValue=43.177535&", "LayerControl=0&");
			url.push("Show3D=&", "LoadFlag=&");
			url.push("MapIndex=", MapID, "&LayerIndex=", LayerID, "&");
			url.push("VisibleOnly=1&", "RequestFields=", ReqStr, "&");
			url.push("NormalFilter=", filter);
			*/
			url.push("cmd=Record&", "RequestType=0&");
			url.push("Width=", this.variableParams.Width, "&Height=", this.variableParams.Height, "&");
			url.push("&LayerControl=0&");
			url.push("Show3D=&", "LoadFlag=&");
			url.push("MapIndex=", MapID, "&LayerIndex=", LayerID, "&");
			url.push("VisibleOnly=0&", "RequestFields=", ReqStr, "&");
			if( filter.length > 1 )
			{
				url.push("CenX=", this.variableParams.CenX, "&CenY=", this.variableParams.CenY, "&");
				url.push("ZoomValue=", this.variableParams.ZoomValue);
				url.push("&NormalFilter=", filter);
			}
			if( geoFilter != "" )
			{
				url.push("CenX=", parseInt(this.variableParams.CenX), "&CenY=", parseInt(this.variableParams.CenY), "&");
				url.push("ZoomValue=", this.variableParams.ZoomValue);
				url.push("&GeometryFilter=", geoFilter);
			}
			var u = url.join("");
			
			alert(u);
			//
			
			// isGeoReq : 노말필터 only 인지, 아니면 XGEOMETRY가 포함된 요청인지???
			var isGeoReq = ReqStr.indexOf("XGEOMETRY");
			
			if( isGeoReq == -1 ) 
			{
				OpenLayers.loadURL(u, '', this, this.parseData, this.failure);
			}
			else
			{
				OpenLayers.loadURL(u, '', this, this.parseGeoData, this.failure);
			}
		}
		catch(e)
		{
			alert(e);
		}
	},
	
	/**
	* FindShortPath : 최단 경로 찾기.
	*
	*/
	FindShortPath : function(params, callbackSucc, callbackFail)
	{
		var pts = [];
		pts[0] = new OpenLayers.Geometry.Point(params.sx, params.sy);
		pts[1] = new OpenLayers.Geometry.Point(params.mx, params.my);
		pts[2] = new OpenLayers.Geometry.Point(params.ex, params.ey);
		// params.sx, params.sy, params.ex, params.ey 는 0이면 안되요.
		
		var servlet = this.mapUrl;
		var pathUrl = servlet + "cmd=FindPath";
		
		var iLoop = 2;
		
		var sPt, ePt;
		var tUrl = [pathUrl];
		for( var i = 0; i < iLoop; i++) {
			sPt = pts[i];
			ePt = pts[i+1];
			if(ePt.x == 0 || ePt.y ==  0)
			{
				ePt = pts[i+2];
				iLoop--;
			}
			
			try {
				if( i != 0 )
					tUrl.splice(1, 4);
			
				tUrl.push("StartX=" + sPt.x);
				tUrl.push("StartY=" + sPt.y);
				tUrl.push("EndX=" + ePt.x);
				tUrl.push("EndY=" + ePt.y);
				
				alert(tUrl.join('&'));
				var reqUrl = tUrl.join('&');
				
				//alert(reqUrl);
				OpenLayers.loadURL(reqUrl, '', this, function(res) {
					// 경로 탐색 성공
					var obj = new IMapNodeLinkList();
					obj.Init();
					
					var retTxt = res.responseText;
					
					var tmpNode = retTxt.split('%')[0];
					var tmpLink = retTxt.split('%')[1];
					
					var i;
					var loopCnt;
					// Node 파싱.
					
					var splittedNode = tmpNode.split('$');
					loopCnt = parseInt(splittedNode[1]);
					
					var objNode;
					var tmpNodeArr;	//노드 정보 쪼갠거...'|'로..
					for(i = 0; i < loopCnt; i++) 
					{
						tmpNodeArr = splittedNode[2+i].split('|');
						
						objNode = new IMapNode();
						objNode.Init();						//Node 한개 초기화하고..
						objNode.SetNodeName( tmpNodeArr[0] );		//Node 이름 넣고..
						objNode.SetPos( parseFloat( tmpNodeArr[1].split('^')[0] ), parseFloat( tmpNodeArr[1].split('^')[1] ) );		//Node coord를 설정.
						
						obj.AddNode( objNode );
					}
					
					
					// Link 파싱
					tmpLink = tmpLink.replace('?', '');
					var splittedLink = tmpLink.split('$');
					loopCnt = parseInt( splittedLink[1], 10 );
					
					var objLink;
					var tmpLinkArr;
					var tmpLinkPosCnt;
					var j;
					var tmpPos;
					for( i = 0; i < loopCnt; i++ )
					{
						tmpLinkArr = splittedLink[2+i].split('|');		//링크 정보 '|'로 짜른거.
						
						objLink = new IMapLink();
						objLink.Init();
						
						objLink.SetLinkId( tmpLinkArr[0] );
						objLink.SetLinkName( tmpLinkArr[1] );
						//alert("linkId: " + tmpLinkArr[0] + ", linkName : " + tmpLinkArr[1] );
						tmpLinkPosCnt = parseInt( tmpLinkArr[2], 10);
						for(j = 0; j < tmpLinkPosCnt; j++)
						{
							tmpPos = new OpenLayers.Geometry.Point( parseFloat( tmpLinkArr[3+j].split('^')[0] ), parseFloat( tmpLinkArr[3+j].split('^')[1] ) );
							objLink.AddPos( tmpPos );
						}
						
						obj.AddLink( objLink );
					}
					
					callbackSucc( obj );
					
				}, function(){
					// 경로 탐색 실패.
					alert('Ajax Failed...');
					callbackFail();
					return;
				});
				
			}
			catch(e)
			{
				alert("경로 탐색 중 예외가 발생했습니다.");
			}
		}
	},// end of FindShortPath
	
    
    CLASS_NAME: "OpenLayers.Layer.IMAP5"
});
