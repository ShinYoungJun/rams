/* Copyright (c) 2008 Avencia, Inc., published under the Clear BSD
 * license.  See http://svn.openlayers.org/trunk/openlayers/license.txt for the
 * full text of the license. */




/**
 * Class: OpenLayers.Layer.ArcGIS93Rest
 *
 * Inherits from:
 *  - <OpenLayers.Layer.Grid>
 */
OpenLayers.Layer.IMAP5 = OpenLayers.Class(OpenLayers.Layer.Image, {

      DEFAULT_PARAMS: { 
		cmd:'DrawMapAjax',
		ImageType: 1,
		Width: 512,
		Height: 256,
		CenX: 192336, //194896,
		CenY: 247885,//305248,
		ZoomValue: 5000,
		LayerControl: 'null',
		Show3D: 0,
		LoadColor: 'null',
		LoadFlag: 'null'
    },
        
	// tmpV : 그냥 테스트용.	
	tmpV : 0,
	
	// proj : IntraMap 5.0 좌표계에 맞게 하기위한 XCoordinate 객체.
	proj : null, 

	bTrans : false,
	
    isBaseLayer: true,
 

 
    /**
     * Constructor: OpenLayers.Layer.IMAP5
     * Create a new IMAP5 layer object.
     *
     * Example:
     * (code)
     * (end)
     */
    initialize: function(name, url, params, options) {
		
		// 좌표계 변환용...
		this.proj = new XCoordinate();
		
        var newArguments = [];
        
		this.bTrans = this.proj.setProj("EPSG:2097", "EPSG:4326");
		
		//Layer properties setting.
		//options.center = new OpenLayers.LonLat(this.proj.toX, this.proj.toY);
		//options.zoom = 15;
		//options.ratio = 1;
		
		/* 	uMap 바운더리를 EPSG:4326 으로 변환해서 UMAP5 layer가 추가된 지도의 maxExtent를 설정.
			newExtent
			0 : minX
			1 : minY
			2 : maxX
			3 : maxY
			<MinX>-876541.77000000</MinX> 
			<MinY>-523725.34000000</MinY> 
			<MaxX>1768877.86000000</MaxX> 
			<MaxY>1471611.14000000</MaxY> 
		*/
		var newExtent = [];
		this.proj.ConvertCoord(-876541.77000000, -523725.34000000);
		newExtent.push(this.proj.toX);
		newExtent.push(this.proj.toY);
		this.proj.ConvertCoord(1768877.86000000, 1471611.14000000);
		newExtent.push(this.proj.toX);
		newExtent.push(this.proj.toY);
		
		this.extent = new OpenLayers.Bounds(newExtent[0], newExtent[1], newExtent[2], newExtent[3]);
		this.maxExtent = this.extent;
		this.size = new OpenLayers.Size(this.DEFAULT_PARAMS.Width, this.DEFAULT_PARAMS.Height);
		
		var tmpArr = [];
		for ( val in this.DEFAULT_PARAMS ) {
			//console.log(val + "," + this.DEFAULT_PARAMS[val]);
			tmpArr.push(val + "=" + this.DEFAULT_PARAMS[val]);
			//tmpArr.push(this.DEFAULT_PARAMS[val]);
		}
		
		this.url = url + tmpArr.join("&");
		console.log(this.url);
        //console.log(this.extent);
		//console.log(this.size);
		
		OpenLayers.Layer.Image.prototype.initialize.apply(name, this.url, this.extent, this.size); //, {numZoomLevel:10});
		//OpenLayers.Layer.Image.prototype.initialize.apply(name, "http://localhost:9981/kMap_base/MapServiceV5?cmd=DrawMapAjax&ImageType=1&Width=512&Height=256&CenX=192336&CenY=247885&ZoomValue=5000&LayerControl=null&Show3D=0&LoadColor=null&LoadFlag=null", this.extent, this.size);
		//OpenLayers.Layer.Image.prototype.initialize.apply("", );
		//this.events.register("moveend", this, this.resetParams);
	},    
	
	
	//마우스 이동할 때.
	moveTo: function(bounds, zoomChanged, dragging) {
		//OpenLayers.Layer.Image.prototype.moveTo.apply(this, arguments);
		//this.tmpV++;
		//OpenLayers.Console.log('IMap5 moveTo...' + bounds);
		//this.tmpV++;
		
	
	},
	
	//moveEnd 이벤트에서 실행하는 함수.
	resetParams: function() {
	
	},
    
    /**
     * Method: destroy
     * Destroy this layer
     */
    destroy: function() {
        // for now, nothing special to do here. 
        OpenLayers.Layer.Image.prototype.destroy.apply(this, arguments);  
    },   
    

    
    CLASS_NAME: "OpenLayers.Layer.IMAP5"
});
