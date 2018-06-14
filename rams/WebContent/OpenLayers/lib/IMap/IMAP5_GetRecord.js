/*
	IMap5_GetRecord.js : IntraMap/Web 5.0에서 레코드 검색
*/

//레코드셋.
function RecordSet()
{
	var RecordCount;
	var ResultSet;
	this.MinX;
	this.MinY;
	this.MaxX;
	this.MaxY;
	
	
	this.Init = function(){
		RecordCount = null;
		ResultSet = new Array();
		
		this.MinX = null;
		this.MinY = null;
		this.MaxX = null;
		this.MaxY = null;
	};
	
	this.AddRecord = function(obj) {
		ResultSet.push(obj);
		RecordCount = ResultSet.length;
	};
	
	this.GetRecordCount = function() {
		return ResultSet.length;
	};
	
	this.GetRecord = function(i) {
		if( i < 0 || i >= ResultSet.length )
			return null;
			
		return ResultSet[i];
	};
	
	
}

//레코드
function Record() 
{ 
	var FieldCount;
	var NormalFields;
	var GeometryFieldSet;
	
	this.Init = function(){
		FieldCount = null;
		NormalFields = new Array();
		GeometryFieldSet = null;
	};
	
	//Geometry set / get
	this.GetGeometryFieldSet = function()
	{
		return GeometryFieldSet;
	};
	
	this.SetGeometryFieldSet = function( obj ) 
	{
		GeometryFieldSet = obj;
	};
	
	
	//Normal set / get
	this.GetNormalFieldCount = function() {
		return NormalFields.length;
	};
	
	this.GetNormalField = function(i) {
		if(i < 0 || i >= NormalFields.length)
			return null;
			
		return NormalFields[i];
	};
	
	this.AddNormalField = function(obj) {
		if(!obj)
			return;
			
		NormalFields.push(obj);
		
		FieldCount = NormalFields.length;
	};
	
	this.GetFieldName = function(i) {
		if( i < 0 || i >= NormalFields.length )
			return null;
			
		return this.GetNormalField(i).GetFieldName();
	};
	
	this.GetFieldValue = function(i) {
		if( i < 0 || i >= NormalFields.length )
			return null;
			
		return this.GetNormalField(i).GetFieldValue();
	};
	
	// RecordToGeoJSON() : 레코드 검색 결과를 GeoJSON 객체로 만들기..
	this.RecordToGeoJSON = function() {
		var geoObj = this.GetGeometryFieldSet();
		if( geoObj.GetGeometryCount() == 0 )
			return null;
			
		var arrGeoJSON = [];
		
		var tmpJson;
		for( var i = 0; i < geoObj.GetGeometryCount(); i++ ) 
		{
			tmpJson = {};
			
			
			arrGeoJSON.push(tmpJson);
		}
		
		return arrGeoJSON;
	};

	this.GeoJSONToRecord = function(geojson) {
		
		return ResultSet;
	};
	
	// RecordToWKT() : XGEOMETRY 레코드 검색 결과를 WKT 객체로 만들기..
	this.RecordToWKT = function() {
		var geoObj = this.GetGeometryFieldSet();
		if( geoObj.GetGeometryCount() == 0 )
			return null;
		
		var arrWKT = [];
		var tmpWKT;
		var eachObj;
		for( var i = 0; i < geoObj.GetGeometryCount(); i++ ) 
		{
			tmpWKT = "";
			eachObj = geoObj.GetGeometry(i);
			var tmpArr;
			switch( eachObj.GetGeometryType() )
			{
				case 0:	//point
					
					if( eachObj.GetPartCount() == 1 )
					{
						tmpWKT += "POINT";
						tmpWKT += "(";
						
						tmpArr = eachObj.GetCoordXYZArray(0);
						
						for(var j = 0; j < tmpArr.length; j++)
						{
							tmpWKT += tmpArr[j];
							if( j == 0 )
								tmpWKT += ( " " );						
						}
						
						tmpWKT += ")";
					}
				break;
				case 1:	//line
					if( eachObj.GetPartCount() == 1 ) 
					{
						tmpWKT += "LINESTRING";
						tmpWKT += "(";
						
						tmpArr = eachObj.GetCoordXYZArray(0);
						
						for(var j = 0; j < tmpArr.length; j++)
						{
							if( j < tmpArr.length-1) {
								if( j % 2 == 0 )
									tmpWKT += ( " " );
								else
									tmpWKT += ( ", " );
							}				
						}
						
						tmpWKT += ")";
					}
					else
					{
						tmpWKT += "MULTILINESTRING";
						tmpWKT += "(";
						
						for( var i = 0; i < eachObj.GetPartCount(); i++ ) 
						{
							tmpArr = eachObj.GetCoordXYZArray(i);
							if( i == 0 )
								tmpWKT += "(";
							else
								tmpWKT += "), (";
							
							for( var j = 0; j < tmpArr.length; j++ )
							{
								tmpWKT += tmpArr[j];
								if( j < tmpArr.length-1) {
									if( j % 2 == 0 )
										tmpWKT += ( " " );
									else
										tmpWKT += ( ", " );
								}
							}
							tmpWKT += (", " + tmpArr[0] + " " + tmpArr[1]);
							
						}
						
						tmpWKT += "))";
					}
				break;
				case 2:	//polygon
					if( eachObj.GetPartCount() == 1) 
					{
						tmpWKT += "POLYGON";
						tmpWKT += "((";
						
						tmpArr = eachObj.GetCoordXYZArray(0);
						
						for( var j = 0; j < tmpArr.length; j++ )
						{
							tmpWKT += tmpArr[j];
							if( j < tmpArr.length-1) {
								if( j % 2 == 0 )
									tmpWKT += ( " " );
								else
									tmpWKT += ( ", " );
							}
						}
						//처음과 끝 좌표가 같아야함.
						tmpWKT += (", " + tmpArr[0] + " " + tmpArr[1]);
						
						var tmpStr = tmpWKT.replace("\r", "").replace("\n", "");
						tmpWKT = tmpStr;
						tmpWKT += "))";
					}
					else
					{
						// MultiPolygon 이다....
						tmpWKT += "MULTIPOLYGON";
						tmpWKT += "(";
						
						for( var i = 0; i < eachObj.GetPartCount(); i++ ) 
						{
							tmpArr = eachObj.GetCoordXYZArray(i);
							if( i == 0 )
								tmpWKT += "((";
							else
								tmpWKT += ")), ((";
								
							var rStr = [];
							
							for( var j = 0; j < tmpArr.length; j++ )
							{
								tmpWKT += tmpArr[j];
								if( j < tmpArr.length-1) {
									if( j % 2 == 0 )
										tmpWKT += ( " " );
									else
										tmpWKT += ( ", " );
								}
							}
							tmpWKT += (", " + tmpArr[0] + " " + tmpArr[1]);
							var tmpStr = tmpWKT.replace("\r", "").replace("\n", "");
							tmpWKT = tmpStr;
						}
						
						tmpWKT += ")))";
					}
					
				break;
				default:
				break;
			}
			
			arrWKT.push(tmpWKT);
		}
		
		return arrWKT;
	};
	
	this.WKTToRecord = function(wkt) {
		
		return ResultSet;
	};
}


//NormalField.....
function NormalFields()
{
	var FieldName;
	var FieldIndex;
	var FieldValue;
	
	this.Init = function() {
		FieldName = null;
		FieldIndex = null;
		FieldValue = null;
	};
	
	this.SetFieldName = function(name) {
		FieldName = name;
	};
	
	this.SetFieldIndex = function(val) {
		if( val < 0 ) 
			return;
		FieldIndex = val;
	};
	
	this.SetFieldValue = function(val) {
		FieldValue = val;
	};
	
	this.GetFieldName = function() {
		return FieldName;
	};
	
	this.GetFieldValue = function() {
		return FieldValue;
	};
	
	this.GetFieldIndex = function() {
		return FieldIndex;
	};
}

// XGEOMETRY 를 요청했을경우...
function GeometryFieldSet() 
{
	var GeometryFieldName;
	var GeometryFieldIndex;
	var Geometries;		//Geometry 객체의 배열
	
	this.Init = function()
	{
		GeometryFieldName = null;
		GeometryFieldIndex = null;
		Geometries = new Array();
	};
	
	this.SetGeometryFieldName = function(name) {
		GeometryFieldName = name;
	};
	
	this.SetGeometryFieldIndex = function(index) {
		GeometryFieldIndex = index;
	};
	
	this.AddGeometry = function(geometry) {
		Geometries.push(geometry);
	};
	
	this.GetGeometryFieldName = function() {
		return GeometryFieldName;
	};
	
	this.GetGeometryFieldIndex = function() {
		return GeometryFieldIndex;
	};
	
	this.GetGeometry = function( index ) {
		if( index < 0 || index >= Geometries.length ) 
			return null;
			
		return Geometries[index];
	};
	
	this.GetGeometryCount = function() {
		return Geometries.length;
	};
}

function Geometry()
{
	var GeometryObjectCount;
	var GeometryType;
	var GeoPartCount;
	var CoordCount;
	var CoordXYZSet;
	
	this.Init = function() {
		GeometryObjectCount = null;
		GeometryType = null;
		GeoPartCount = null;
		CoordCount = new Array();
		CoordXYZSet = new Array();
	};
	
	this.SetPartCount = function( count ) 
	{
		GeoPartCount = count;
	};
	
	this.GetPartCount = function() 
	{
		return GeoPartCount;
	};
	
	this.SetGeometryObjectCount = function(count) {
		GeometryObjectCount = count;
	};
	
	this.SetGeometryType = function( type ) {
		GeometryType = type;
	};
	
	this.AddCoordCount = function( count ) {
		CoordCount.push( count );
	};
	
	this.AddCoordXYZSet = function( xyzset ) {
		CoordXYZSet.push( xyzset );
	};
	
	this.GetGeometryObjectCount = function() {
		return GeometryObjectCount;
	};
	
	this.GetGeometryType = function() {
		return GeometryType;
	};
	
	this.GetCoordCount = function( index ) {
		if( index < 0 || index >= CoordCount.length )
			return null;
	
		return CoordCount[index];
	};
	
	this.GetCoordXYZSet = function( index ) {
		if( index < 0 || index >= CoordXYZSet.length )
			return null;
		return CoordXYZSet[index];
	};
	
	this.GetCoordXYZArray = function( index ) {
		if( index < 0 || index >= CoordXYZSet.length )
			return null;
		return CoordXYZSet[index].split('~');
	};
	
}


//------------------------------------------------------------------------------
// END OF RECORDSET...
//------------------------------------------------------------------------------

/*
	GetIMAPRecord(param, callback) : ajax로 레코드 검색.

function GetIMAPRecord(param, callback)
{
	if(!param)
		return;

	//var strResult = "-9999";
	
	// parseGeoData : XGEOMETRY 겟레코드 결과를 파싱....
	this.parseGeoData = function(response) 
	{
		var resultTxt = response.responseText;
		
		console.log("in parseGeoData.....");
		
		var rSet = new RecordSet();
		rSet.Init();
		
		var r = resultTxt.split("#");
		
		var eachR;
		var eachNormal;
		var eachGeo;

		console.log("length : " + r.length);
		
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
			console.log("normal : " + normal);
			if( normal != "-" )
			{
				
				
				var tmpNormal;
				tmpNormal = normal.split("@");
				
				var nFieldNames = tmpNormal[0].split("^");
				var nFieldValues = tmpNormal[1].split("^");
				
				console.log("nFieldCount : " + nFieldNames.length);
				
				for( var j = 0; j < nFieldNames.length; j++) 
				{
					eachNormal = new NormalFields();
					eachNormal.Init();

					eachNormal.SetFieldName(nFieldNames[j]);
					eachNormal.SetFieldValue(nFieldValues[j]);
					
					console.log(i+ ", " + j+ " normal set..name: " + nFieldNames[j] + ", val : " + nFieldValues[j]);
					
					eachR.AddNormalField(eachNormal);
				}
			}
				
			//geometry 셋팅
			geo = geo.replace("#", "");
			var arrGeo = geo.split("|");
			
			console.log("arrGeo.length : " + arrGeo.length);
			
			//CoordCount 설정
			eachGeoSet = new GeometryFieldSet();
			eachGeoSet.Init();
			
			var eachGeo = new Geometry();
			eachGeo.Init();
			
			
			var tmpGeoInfo = arrGeo[0].split("^");
			
			//eachGeo.SetGeometryType( parseInt(arrGeo[0].substring(0, arrGeo[0].indexOf("^") ) ) );
			eachGeo.SetGeometryType( parseInt( tmpGeoInfo[0] ) );
			console.log("geometryType: " + eachGeo.GetGeometryType() );
			
			
			//
			// 이 아랫 부분에 멀티 폴리곤 부분도 되도록 수정해야함....
			//
			eachGeo.SetPartCount( parseInt( tmpGeoInfo[1] ) );
			console.log("partCount : " + eachGeo.GetPartCount() );
			//eachGeo.SetCoordCount( parseInt( arrGeo[0].substring( arrGeo[0].lastIndexOf("^")+1 ) ) );
			eachGeo.AddCoordCount( parseInt( tmpGeoInfo[2] ) );
			console.log("CoordCount : "+ eachGeo.GetCoordCount(0) );
			
			// for multiPolygon...
			for( var g = 1 ; g < arrGeo.length; g++ )
			{
				var coordSet = arrGeo[g].split('$')[0];
				var coordCnt = arrGeo[g].split('$')[1];
				
				eachGeo.AddCoordXYZSet(coordSet);
				
				if( coordCnt ) {
					console.log("parseInt(coordCnt) : " + parseInt(coordCnt));
					
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
		console.log("int parseData......");
		//alert(response.responseText);
		var resultTxt = response.responseText;
		console.log("resultTxt = " + resultTxt);
		
		//recordset 할당..파싱~~!!!
		var rSet = new RecordSet();
		rSet.Init();
		
		//var rSet = new Array();
		
		console.log("typeof rSet : " + Object.prototype.toString.call(rSet));
		var eachR;
		var eachF;	
		//
		var r = resultTxt.split("#");
		
		console.log(r.length);
		
		var tmpR = "";
		var lIndex = -1;
		var arrFieldNames, arrFieldValues;
		for(var i = 0; i < r.length; i++) {
			//tmpR : 하나의 레코드.
			tmpR = r[i].replace("*-", "");	//'*-' 를 제거.
			lIndex = tmpR.lastIndexOf("!");
			if(lIndex != -1)
				tmpR = tmpR.substring(lIndex+1);
			console.log(tmpR);
			
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
				
				console.log(arrFieldNames.split('^')[j] + " = " + arrFieldValues.split('^')[j]);
				
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
		
		for(var i=0; i < FilterList.length; i++) {
			for(var val in FilterList[i]) {
				FilterStr.push(val+"-"+ FilterList[i][val]);
			}
		}
		
		var filter = FilterStr.join(",");
		
		var ReqStr = param.ReturnFieldName.join("^");
		
		//일단 테스트..
		var url = ["http://localhost:9981/servlet/intramapswg.MapServiceV5?"];	
		
		url.push("cmd=Record&", "RequestType=0&");
		url.push("Width=512&", "Height=256&");
		url.push("CenX=195586.865356&", "CenY=449160.673180&");
		url.push("ZoomValue=43.177535&", "LayerControl=0&");
		url.push("Show3D=&", "LoadFlag=&");
		url.push("MapIndex=", MapID, "&LayerIndex=", LayerID, "&");
		url.push("VisibleOnly=1&", "RequestFields=", ReqStr, "&");
		url.push("NormalFilter=", filter);
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
}
*/



