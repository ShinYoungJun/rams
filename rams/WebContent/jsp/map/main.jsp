<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html;charset=EUC-KR" />
<title>�����������ý���</title>
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



</style>
<script src="/rams/OpenLayers/lib/jquery-1.3.1.min.js"></script>
<script src="/rams/js/common.js">				 </script>
<script src="/rams/OpenLayers/lib/OpenLayers.js"></script>



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

var features_jibun = null;
/**
*	- �������� ���� Object Literal�� �Ἥ namespaceó��.
*	214�� �������� IntraMapWeb_GS �� ���� �����ؼ� ���.
*/
var KSIC = { 
	servletUrl : "http://98.33.1.86:8080/IntraMap/MapService", 
	click           : null,
	maptool08       : null,
	lon 			: 5,
	lat 			: 40,
	zoom 			: 5,
	map 			: null,			
	layer 			: null,
	sateliteLayer   : null,
	mode 			: null,
	measureControls : null,
	buffer_wfs 		: null,
	measure_wfs 	: null,
	marker 			: null,
	nav 			: null,
	selectedLayer 	: [],
	logPopup 		: null,

	arrLayers : [				
		{"name":"UQA100", "checked":false, "text":"�ְ�����" },
		{"name":"UQA200", "checked":false, "text":"�������" },
		{"name":"UQA300", "checked":false, "text":"��������" },
		{"name":"UQA400", "checked":false, "text":"��������" },
		{"name":"UQF100", "checked":false, "text":"�������" },
		{"name":"UQG100", "checked":false, "text":"�̰�����" },
		{"name":"UQH100", "checked":false, "text":"��������" },
		{"name":"UQI100", "checked":false, "text":"��ȭ����" },
		{"name":"UQJ100", "checked":false, "text":"��������" },
		{"name":"UQK100", "checked":false, "text":"��������" },
		{"name":"UQL100", "checked":false, "text":"�ü���ȣ����" },
		{"name":"UQM100", "checked":false, "text":"�뵵�������" },
		{"name":"UQN100", "checked":false, "text":"������������" },
		{"name":"UQP100", "checked":false, "text":"�����̿��Ÿ�뵵����" },
		{"name":"SUB_RD", "checked":true, "text":"����" },
		{"name":"LP_PA_CBND_ALL", "checked":true, "text":"����" },							
		{"name":"G001_2_1", "checked":true, "text":"�����" },
		{"name":"G001_3_2", "checked":true, "text":"�����" },
		{"name":"B003", "checked":false, "text":"�ǹ���" },
		{"name":"E011", "checked":true, "text":"��õ" },						
		{"name":"B006_1", "checked":false, "text":"����ö����" },
		{"name":"UQS200", "checked":false, "text":"������" },
		{"name":"UQT200", "checked":false, "text":"����" },
		{"name":"UQT300", "checked":false, "text":"����" },
		{"name":"UQT400", "checked":false, "text":"������" },
		{"name":"UQV300", "checked":false, "text":"�б�" },
		{"name":"LA_PA_CBND_YS", "checked":false, "text":"��걸����" },
		{"name":"LA_PA_CBND_DJ", "checked":false, "text":"���۱�����" },
		{"name":"LA_PA_CBND_GA", "checked":false, "text":"���Ǳ�����" },
		{"name":"LA_PA_CBND_GC", "checked":false, "text":"��õ������" },
		{"name":"LA_PA_CBND_GURO", "checked":false, "text":"���α�����" },
		{"name":"LA_PA_CBND_JUNGGU", "checked":false, "text":"�߱�����" },
		{"name":"LA_PA_CBND_YDP", "checked":false, "text":"������������" }		
	],

	
	myStyles2 : new OpenLayers.StyleMap(
			{ //��������
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
			{ //�Ÿ�,��������
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
	//g_erXYLocation = new Array();
//	delete g_erXYLocation;
//	delete g_objEvent;	
//	g_erXYLocation = new Array();
	
	var xy     = geometry.getVertices();
	var gubun  = "";
	var result = "";
	
	gubun = "�Ÿ�";
	result = measure.toFixed(2) + " " + units;
	g_objEvent = event;
	//alert(result);
	if(order == 1)
	{
	  gubun = "�Ÿ�";
	  result = measure.toFixed(2) + " " + units;
	} 
	else 
	{
		if(g_nMouseMode == _AREA)
		{
			gubun = "����";
			result = measure.toFixed(2) + " " + units + "<sup>2</sup>";
		}
	}

	lonlat = new OpenLayers.LonLat(xy[xy.length-1].x, xy[xy.length-1].y);
	
	
	if(g_nMouseMode == _AREA_SEARCH)
	{
		g_erXYLocation[g_nIndex++] = lonlat;
		//alert("olle : "+g_erXYLocation[g_nIndex].x);
		
	}
	
	if(order == 1 || g_nMouseMode == _AREA)
	{
		var mPopup = null;
		//������ : �������� Ŭ���� ����
		//������ -> ȭ��� �ȼ���ǥ		
		//popup div ��ġ�̵� �� �� ǥ��
		px = KSIC.map.getPixelFromLonLat(lonlat);
		mPopup = document.getElementById("mPopup");
		
		mPopup.style.left     = (px.x+300) + "px";
		mPopup.style.top      = (px.y) + "px";
		mPopup.style.display  = "block";
		mPopup.style.width    = "70px";
		mPopup.style.height   = "30px";
		mPopup.style.position = "absolute";


		//document.getElementById("recordresult").innerHTML = result;
		mPopup.innerHTML = 
			"<table width='100%' height='100%' border='0' cellspacing='2'   cellpadding='2' bgcolor='#30C0FF' style='margin: 0 auto;font-size:10px;'>" +"<tr bgcolor='#FFFFFF' align='center' height='50%'><td>"+gubun+"&nbsp;&nbsp;<a border='0' onClick='onPopupClose()' style='cursor:pointer'>X</a></td></tr>"
			+ "<tr bgcolor='#FFFFFF' align='center' height='50%'><td>" + result
			+ "</td></tr></table>";
	}
}

//�˾� â�� �����鼭 �׷ȴ� ������ �����ش�
function onPopupClose() 
{
	//alert('2');


	var mPopup = document.getElementById("mPopup");
	var control;
	
	mPopup.style.display = "none";	
	
	for(var key in KSIC.measureControls) 
	{
	  control = KSIC.measureControls[key];
	  control.cancel(); 
	}

	//getFeature�� �׸� ������ ����
	//alert(features_jibun);
//	if(features_jibun != null && features_jibun != 'undefined' && features_jibun != ''){ 


		//KSIC.buffer_wfs.removeFeatures(features_jibun);
		KSIC.buffer_wfs.removeAllFeatures(true);
		features_jibun = null;

//	}
	toggleControl();
}

//��ü���� zoomToExtent
function Fit() { KSIC.map.zoomToMaxExtent(); } 
//���� Ȯ��
function ZoomIn() { zoomlevel = KSIC.map.getZoom(); KSIC.map.zoomIn(); }
//���� ���
function ZoomOut() { zoomlevel = KSIC.map.getZoom(); KSIC.map.zoomOut(); }
//�ڷ� 
function Prev() { KSIC.nav.previousTrigger(); }
//������ 
function Next() { KSIC.nav.nextTrigger(); }

//�Ÿ���� Ŭ�� ��
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


//�̵�
function move(){

	
	g_nMouseMode = _MOVE;
	
	KSIC.mode = "move";
	toggleControl();
	
	
}

//������� Ŭ�� ��
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
		toggleControl();
		
	}
}

//��Ʈ�� ��۸�
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
*	Contains ����
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
	
	/** Polygon Ÿ������ Contains ����
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
	//Contains ���� ���ó��
	this.fnContainsResult = function(response)
	{
		/** alert(response.responseText); */

		var xml = response.responseXML;
		if(xml) 
		{
			/**
				����� ���� XML�� ���� ��û���� Ÿ�� ���̾���� Element�� ������
				�ش� ���̾ Ư�� Point�� ���Ѱ���.
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
*	�������� �߽��� ã�� ����
*	WFS�� ksic:centroid ������ ��û�Ͽ� ó���Ѵ�.
*/

//var features_jibun = null; 

function fnGetCentroid(xid,layer)
{

	
	//alert('asdfasdf:'+xid+" : "+layer);
	
	var filterHeader = '<' + '?xml version="1.0" encoding="UTF-8"?>';
	filterHeader += '<wfs:GetFeature xmlns:wfs="http://www.opengis.net/wfs" xmlns:ksic="http://www.ksic.net/wfs" ';
	filterHeader += 'xmlns:ogc="http://www.opengis.net/ogc" xmlns:gml="http://www.opengis.net/gml" ';
	filterHeader += 'xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="1.1.0" service="WFS" ';
	filterHeader += 'xsi:schemaLocation="http://www.ksic.net/wfs http://www.opengis.net/wfs http://schemas.opengis.net/wfs/1.1.0/wfs.xsd">';
	
	/**
	
	*	NW_LP_AA_EMD ���̺����� XID=2�� �����ﵥ������ �߽����� ã�´�.
	*/
	//var targetLayer = document.getElementById("txtCentroidLayer").value;	//'NW_LP_AA_EMD';
	var targetLayer  = layer;
	var filter3 = "";
	filter3 += '<wfs:Query typeName="'+ targetLayer + '">';						//���̺��� ����( 'NW_LP_AA_EMD' )
	//filter3 += '<wfs:PropertyName>ksic:centroid</wfs:PropertyName> ';		//�߽��� ã�� ����( 'ksic:centroid' )
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

	//alert(filter);
	//alert('id : '+this.id);
	this.fnCentroidResult = function(response) {

		
		//alert(response.responseText);
		
		if(features_jibun != null && features_jibun != 'undefined'){ 


			//KSIC.buffer_wfs.removeAllFeatures(true);
			KSIC.buffer_wfs.removeFeatures(features_jibun);
			features_jibun = null;

		}
		
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
		

			if(layer == 'LP_PA_CBND_ALL'){
				KSIC.buffer_wfs.addFeatures(features_jibun);
			}
	

	//centroid������ �̹��� �Ѹ���
//			var xml = response.responseXML;
//			if( xml )
//			{
//				var cenPos = xml.getElementsByTagName("centroid")[0].firstChild.nextSibling.firstChild.nextSibling.firstChild.nodeValue;
//				var x = cenPos.split(' ')[0];
//				var y = cenPos.split(' ')[1];

				//alert(x + " " + y);
//				var ret = x + ' ' + y;
//				var obj = document.getElementById("txtCentroidResult");
//				if( obj )
//				{
//					obj.innerText = ret;
//					obj.setAttribute("class", "resultFormat");
//				}
				
//				var size = new OpenLayers.Size(30,30);
//				var offset = new OpenLayers.Pixel(-(size.w/2), -size.h);
//				var icon = new OpenLayers.Icon('image/Balloon.bmp',size,offset);
		
		//OpenLayers.Layer.Markers ���̾ Ư�� �̹����� Ư�� ��ġ�� �Ѹ��ϴ�.
//				KSIC.markers.addMarker(new OpenLayers.Marker(new OpenLayers.LonLat(x, y),icon));
//			}


		}
	};

	//centroid ���� ��û( POST )
	new OpenLayers.Request.POST({
		method: "POST",
		url: KSIC.servletUrl,
		headers: {"Content-Type":"text/xml"},
		data: filter,
		callback: this.fnCentroidResult
	});

	//alert('�̻���');
	//document.getElementById('danger').value = filter;
	//Centroid ���� ��� ó��

}


function fnGetCentroid2(xid,layer)
{

	//alert('4 : '+features_jibun );
	
	
//	if(features_jibun != null && features_jibun != 'undefined' && features_jibun  != ''){ 

		
		KSIC.buffer_wfs.removeAllFeatures(true);

		features_jibun = null;
//	}

	
	var filterHeader = '<' + '?xml version="1.0" encoding="UTF-8"?>';
	filterHeader += '<wfs:GetFeature xmlns:wfs="http://www.opengis.net/wfs" xmlns:ksic="http://www.ksic.net/wfs" ';
	filterHeader += 'xmlns:ogc="http://www.opengis.net/ogc" xmlns:gml="http://www.opengis.net/gml" ';
	filterHeader += 'xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" version="1.1.0" service="WFS" ';
	filterHeader += 'xsi:schemaLocation="http://www.ksic.net/wfs http://www.opengis.net/wfs http://schemas.opengis.net/wfs/1.1.0/wfs.xsd">';
	
	/**
	*	NW_LP_AA_EMD ���̺����� XID=2�� �����ﵥ������ �߽����� ã�´�.
	*/
	//var targetLayer = document.getElementById("txtCentroidLayer").value;	//'NW_LP_AA_EMD';
	var targetLayer  = layer;
	var filter3 = "";
	filter3 += '<wfs:Query typeName="'+ targetLayer + '">';						//���̺��� ����( 'NW_LP_AA_EMD' )
	//filter3 += '<wfs:PropertyName>ksic:centroid</wfs:PropertyName> ';		//�߽��� ã�� ����( 'ksic:centroid' )
	//filter3 += '<wfs:PropertyName>TN_MGT_SN</wfs:PropertyName> ';

	filter3 += '<wfs:PropertyName>XGEOMETRY</wfs:PropertyName> ';
	
	var targetField = 'PNU';
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

		
	this.fnCentroidResult = function(response) {

		
		var gml = new OpenLayers.Format.GML();
		features_jibun = gml.read(response.responseText); 

		if(features_jibun) 
		{	
			KSIC.buffer_wfs.addFeatures(features_jibun);
		}
	};

	//centroid ���� ��û( POST )
	new OpenLayers.Request.POST({
		method: "POST",
		url: KSIC.servletUrl,
		headers: {"Content-Type":"text/xml"},
		data: filter,
		callback: this.fnCentroidResult
	});
	
}


//Ư�� ��ġ�� �ɺ�(�̹���) ǥ��.
function fnAddMarker()
{
	/**
		WFS GetFeature �������� POI_HOTEL�������̾�� 
		X��ǥ( �ʵ�� : X_CODE), Y��ǥ( �ʵ�� : Y_CODE)�� �����ͼ� 
		�ش� ��ġ�� Marker(image ��)�� �Ѹ��ϴ�.
		
		DB�� �ִ� �ڷḦ �̿��Ͽ� ������ �ɺ��� �Ѹ��°͵� �̿� ���� ������� �Ͻø� �˴ϴ�.
		DB�� �ִ� �ڷḦ  Ư�� ������ ����(xml, json��) �������� ��ȯ�ϴ� �������� servlet�� ����ż�
		ajax�� �����ͼ� �ش� ����� �Ľ��ؼ� �ش� ��ġ�� �Ѹ����� �Ͻø� �˴ϴ�.
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
				
				//OpenLayers.Layer.Markers ���̾ Ư�� �̹����� Ư�� ��ġ�� �Ѹ��ϴ�.
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
		//maxExtent:  new OpenLayers.Bounds( 182001.637, 437272.781, 216052.524, 465001.092),
				
		maxExtent:  new OpenLayers.Bounds( 179121.838, 436242.844, 216173.680, 466541.369),
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
//  KSIC.layer = new OpenLayers.Layer.WMS(
//  		"IntraMap WMS", KSIC.servletUrl, 
//  		//{layers: arrLayers.join(',') , format: 'image/png'},
//  		{layers: getSelectedLayer() , format: getSelectedValue('getMapFormat')},
//  		{singleTile: true,  visibility: false},
//  		{'buffer':0}    );
//
//
//	 KSIC.sateliteLayer = new OpenLayers.Layer.WMS( "Tiled Map Layer",
//				"http://98.33.0.67/ecwp/ecw_wms.dll?2009_10cm?request=GetMap&LAYERS=00-SEOUL_COLOR_10_G2009&SRS=none&BBOX=178905.00088288425, 436152.8993602714, 216723.25088288425, 467464.6493602714&WIDTH=900&HEIGHT=900&FORMAT=image/png", 
//				//"http://98.33.0.67/ecwp/ecw_wms.dll?2009_10cm?",
//				{format: 'image/png', transparent: true},
//				{
//			//	tileOrigin: new OpenLayers.LonLat(178905.00088288425, 436152.8993602714),
//     		//	maxExtent: new OpenLayers.Bounds(178905.00088288425, 436152.8993602714, 216723.25088288425, 467464.6493602714),
//                 visibility: true,
//                 'isBaseLayer': true,
//                 singleTile: true,
//                 'buffer':0
//             }
//			);
	
	KSIC.layer = new OpenLayers.Layer.WMS(
  		"IntraMap WMS", KSIC.servletUrl, 
  		//{layers: arrLayers.join(',') , format: 'image/png'},
  		{layers: getSelectedLayer() , format:'image/png', transparent:true},
  		{singleTile: true, isBaseLayer:true}
	);


	 KSIC.sateliteLayer = new OpenLayers.Layer.WMS( "Tiled Map Layer",
				"http://98.33.0.67/ecwp/ecw_wms.dll?2009_10cm?request=GetMap&LAYERS=00-SEOUL_COLOR_10_G2009&SRS=none&FORMAT=image/png", 
				{format: 'image/png'},
				{
				//tileOrigin: new OpenLayers.LonLat(178905.00088288425, 436152.8993602714),
     			//maxExtent: new OpenLayers.Bounds(178905.00088288425, 436152.8993602714, 216723.25088288425, 467464.6493602714),
     			
     		//	tileOrigin: new OpenLayers.LonLat(179121.838, 436242.844),
     		//	maxExtent: new OpenLayers.Bounds(179121.838, 436242.844, 216173.680, 466541.369),
     			
                 visibility: false,
                 'isBaseLayer': false,    
                 singleTile: true,
                 'buffer':0
             }
			);
	


	 
	KSIC.map.addLayers([KSIC.sateliteLayer, KSIC.layer]);



	//20101011
	KSIC.measureControls = 
	{
		line: new OpenLayers.Control.Measure( //�Ÿ����� ��Ʈ�� 
	    OpenLayers.Handler.Path, { 
			persist: true, //�׸����� ���Ӽ� ����
			handlerOptions: {
			  layerOptions: {styleMap: KSIC.myStyles4} //������ ������ �׸��⽺Ÿ�� ����
			}
	    }
	),
	
	polygon: new OpenLayers.Control.Measure( //�������� ��Ʈ��
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
	
	
	KSIC.buffer_wfs = new OpenLayers.Layer.Vector("buffer Features", {styleMap:KSIC.myStyles2});
	KSIC.markers = new OpenLayers.Layer.Markers( "Markers" );
	KSIC.map.addLayers([ KSIC.buffer_wfs, KSIC.markers ]);
	
	
	KSIC.map.zoomToMaxExtent();
	
	KSIC.map.addControl( new OpenLayers.Control.LayerSwitcher() );
			
	// Ŭ�� �̺�Ʈ ���
	//    click = new OpenLayers.Control.Click();			
	//    KSIC.map.addControl(click);
	KSIC.sateliteLayer.setVisibility(false);
	KSIC.sateliteLayer.setOpacity(0);
	KSIC.layer.setOpacity(1);
			
	KSIC.map.events.register('click', KSIC.map, function (e) 
			{				
		
				//OpenLayers.Util.getElement('recordresult').innerHTML = "Loading... please wait...";					
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
							X: e.xy.x,  //window ��ǥ
							Y: e.xy.y,  //window ��ǥ
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
				//wfs getfeature ����
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
			  
	//�ڷ�, ������
	KSIC.nav = new OpenLayers.Control.NavigationHistory();
	KSIC.map.addControl(KSIC.nav);
	
//	KSIC.click = new OpenLayers.Control.Click();
//	KSIC.map.addControl(KSIC.click);	
	// �������� button �鿡 �̺�Ʈ �ڵ鷯 �Ҵ�.
	SetControlEventHandle();
	//------���̾� ���� ����.
	setLayerInfo( "layerinfo1", KSIC.arrLayers , onChkClick );		
	setLayerInfo( "layerinfo2", KSIC.arrLayers , onChkClick );

	
	//logPopup = window.open("bmtLogPopup.html", "", "width=800,height=600,scrollbars=yes");
}



function vOn(){

var name = KSIC.sateliteLayer.getVisibility();

if(name == true){
	KSIC.sateliteLayer.setVisibility(false);
	KSIC.sateliteLayer.setOpacity(0);

}else {
	KSIC.sateliteLayer.setVisibility(true);
	KSIC.sateliteLayer.setOpacity(1);
	
}
 


	
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
		
// GetFeatureInfo ���� ���
function setResult( response )
{
	//���â�� text���.
	
  	//document.getElementById('recordresult').innerHTML = "Loading... please wait...";
	var txt = response.responseText;
	var txtElem = document.createTextNode(txt);
	//document.getElementById('recordresult').appendChild(txtElem);
	
	//gml������ ��� vector ���̾ �߰�. �ش� �ٿ������ ���� �̵�, �ش� ��ü ���̶���Ʈ.
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
				
				//alert("bounds : " + bounds);
			}  

			map.zoomToExtent(bounds);
			buffer_wfs.addFeatures(features);
		}
	}
}

//GetMap ���� ��û�ϴ� ���̾� ���.
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
		d=arr.length-7;
	
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

// GetMap ���̾� ��� ���ý� ���û�ϴ°�...
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
		
// GetFeatureInfo ������ ��� ���̾� ���.
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

// GetFeatureInfo���꿡 �ʿ��� ���̾� �����ϱ����� üũ�ڽ� Ŭ����.
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

// �޺��ڽ����� ������ �� ����.
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

function SetMouseMode(nMode)
{
	g_nMouseMode = nMode;
}

function DoubleClickEvent()
{

	//�����˻� ��ġ�� ������ 20110304
   //g_objEvent = OpenLayers.Geometry();
   //alert("array : "+g_erXYLocation[1].x);
 
   var objXY    = g_objEvent.geometry.getVertices(false);

   
  // var objXY = g_erXYLocation;
  
   var moveGu = document.getElementById('moveGu').value;
   
    objXY[objXY.length-1] = objXY[0];

    var test;
   for(var i = 0; i < objXY.length; i ++){
        test += objXY[i].x+'/'+objXY[i].y+'   ';
    }
		//alert(test);
   
    var erNLonLat = new Array();
    var objData   = null;
    var strData   = "";
    //_MOVE = 0, _AREA = 1, _AREA_SEARCH
    
	switch(g_nMouseMode)
	{	
	case 0 : alert('�����˻� ��ư�� �ٽ� ���� �� ������ ������ �ּ���'); 
			

			//getFeature�� �׸� ������ ����
//			if(features_jibun != null && features_jibun != 'undefined'){ 

//				KSIC.buffer_wfs.removeFeatures(features_jibun);
				KSIC.buffer_wfs.removeAllFeatures(true);
				features_jibun = null;
				toggleControl();

//			}
			return; // _MOVE
	case 1 : return; // _AREA
	case 2 : // _AREA_SEARCH
		g_nMouseMode = _MOVE;
		KSIC.mode = "move";


		if(moveGu == '' || moveGu == 'NOTSELECTED'){
				alert('�����˻� �ϰ��� �ϴ� ���� �������ּ��� ');
				return;
		}
		
		//alert("obj : "+objXY.length);
		if(KSIC.map.getScale()<2400){

			document.getElementById('recordresult').innerHTML = "<img src='/rams/images/map/LoadingBar.gif'>";
		//	document.getElementById('recordresult').style.zIndex = 3;
		//	document.getElementById('recordresult').style.display ='block';
			doGetAreaRecord(0, moveGu, objXY, "XID");
			
		}else {
			alert('ȭ���� �� Ȯ�����ּ���');
		}

		delete g_erXYLocation;
		g_erXYLocation = new Array();
		delete g_objEvent;
		g_nIndex       = 0;
		//toggleControl();
		
		
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

		//alert('1');
		//this.onPopupClose();
		//alert('3');
		
		var url   = "/MapService?";
		var param = "?SERVICE=WFS&VERSION=1.0.0&REQUEST=GetFeature";
		
		var objPoints = objParam.GeoFilter;
		var data = "";

		//alert(objPoints.length);

		 for(var i=0;i<objPoints.length;i++){
				if(i==objPoints.length-1){
					data += objPoints[i].x+" "+objPoints[i].y;
				}else{
					data += objPoints[i].x+" "+objPoints[i].y+" ";
				}

			}
		
		
		var reward = '${reward}';

	document.getElementById('AAA').innerHTML = data;
		
	var param2 = KSIC.servletUrl+"?SERVICE=WFS&VERSION=1.0.0&REQUEST=GetFeature&TYPENAME="+objParam.LayerName+"&FILTER=<ogc:Filter><ogc:Intersects><ogc:PropertyName>XGEOMETRY</ogc:PropertyName><gml:Polygon><gml:exterior><gml:LinearRing srsName='EPSG:2097'><gml:posList>"+data+"</gml:posList></gml:LinearRing></gml:exterior></gml:Polygon></ogc:Intersects></ogc:Filter>&PROPERTYNAME=XID";
	

	var getMapMovelinkIds = [];

		OpenLayers.loadURL(param2, '', this, function( response ) {

		
		var options = {};
		OpenLayers.Util.extend(options, this.formatOptions);
		var gml = this.format ? new this.format(options) : new OpenLayers.Format.GML(options);
		var features_jibun = gml.read(response.responseText);
		//var xml = response.responseXML;
		var xml = response.responseText;

		this.modifyHeight(); //div�� ������ ������ �� 

//		if(features_jibun != null && features_jibun != 'undefined'){ 


//			alert('�ȵŴ�?');
//			KSIC.buffer_wfs.removeFeatures(features_jibun);

//		}
		
		if( response.responseText )
		{	
			var a = "";
			var arrFields1 = xml.split("</PNU>");
			

			//alert("length : "+arrFields1.length);
			
			for(var j=0;j<arrFields1.length; j++){
				
				
				var arrFields2 = arrFields1[j].split("<PNU>");

				fnGetCentroid2(arrFields2[1],objParam.LayerName);

				a += arrFields2[1]+" ";
				
			}

		//	alert("a : "+a);
			
			if(reward == '1'){
				this.getPnuStr(a);
				
			}else if(reward =='2'){
				this.goRewardView(a);
				
			}
			
			
		}
	});
	}
	catch(e) { 
		
	}
}


function goRewardView(pnuList){

    var cw=screen.availWidth; // ȭ�� �ʺ�
	var ch=screen.availHeight; // ȭ�� ����

	var name = '/rams/map/rewardview.do?PNULIST='+pnuList;
	var sw=850;// ��� â�� �ʺ�
	var sh=650;// ��� â�� ����

	var ml=(cw-sw)/2;// ��� �������� â�� x��ġ
	var mt=(ch-sh)/2;// ��� �������� â�� y��ġ

	 window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=yes,menubar=no,status=no ,directories=no,');

	 document.getElementById('recordresult').innerHTML = "";
	// document.getElementById('recordresult').style.zIndex = 1;
	// document.getElementById('recordresult').style.display ='none';
}

function GetXGeometryURL(erGeometryFilter)
{
	var strURL = "";
	//lon == y lat == x
	//alert("url  : "+erGeometryFilter.length);
	for(var i = 0;i < erGeometryFilter.length; i++)
	{
		if(erGeometryFilter.length - 1 == i)
			strURL += erGeometryFilter[i].x + " "+ erGeometryFilter[i].y ;
		else
			strURL += erGeometryFilter[i].x + " "+ erGeometryFilter[i].y + " ";
	}
	return strURL;
}


function goResult(){

	var selectGu = document.getElementById("selectGu").value;
	var selectDong = document.getElementById("selectDong").value;
	var selectRoad = document.getElementById("selectRoad").value;
	var selectOwn = document.getElementById("selectOwn").value;
	var selectJi = document.getElementById("selectJi").value;
	var prevJiga = document.getElementById("prevJiga").value;
	var nextJiga = document.getElementById("nextJiga").value;
	var cityPlan = document.getElementById("cityPlan").value;
	var useArea = document.getElementById("useArea").value;
	var useZone = document.getElementById("useZone").value;
	var useRegion = document.getElementById("useRegion").value; 

	
	
	var param = "?selectGu="+selectGu+"&selectDong="+selectDong+"&selectRoad="+selectRoad+"&selectOwn="+selectOwn;
		  param += "&selectJi="+selectJi+"&prevJiga="+prevJiga+"&nextJiga="+nextJiga;
		  param += "&cityPlan="+cityPlan+"&useArea="+useArea+"&useZone="+useZone+"&useRegion="+useRegion;
		  
	var url = "/rams/map/juckjianalysisres.do";
	
	document.getElementById("searchResult").src = url+param;

}


function goResult3(){

	var selectGu = document.getElementById("selectGu").value;
	var selectDong = document.getElementById("selectDong").value;
	var san = document.getElementById("selectRoad").value;
	var jibun = document.getElementById("selectOwn").value;


	var param = "?selectGu="+selectGu+"&selectDong="+selectDong+"&san="+san+"&jibun="+jibun;
		  
		  
	var url = "/rams/map/suitbizres.do";

	//alert(url+param);
	
	document.getElementById("searchResult").src = url+param;

}

function modifyHeight(){

	var reward = '${reward}';
	
	//reward ����  0 �϶�
	//reward ����  1 �϶� unReward
	//reward ����  2 �϶� Reward
	if( reward == "1"){	
		
		document.getElementById('search').style.height= 390;		
		
		document.getElementById('searchResult').style.visibility = "hidden";		
		document.getElementById('unrewardDiv').style.display = "block";
		
	}else if(reward == "0"){
		
		document.getElementById('searchResult').style.top = 280;
		document.getElementById('searchResult').style.height = 380;
		document.getElementById('search').style.height = 280;

		document.getElementById('searchResult').style.visibility = "visible";
		document.getElementById('unrewardDiv').style.display = "none";
	
	}else if(reward =="2"){

		document.getElementById('searchResult').style.top = 0;
		document.getElementById('searchResult').style.height = 0;
		document.getElementById('search').style.height= 800;
		
		
		document.getElementById('unrewardDiv').style.display = "none";
		
	}

}


//ajax
function getXMLHTTPRequest()
{
	var xRequest = null;
	xRequest = new ActiveXObject("Microsoft.XMLHTTP");

	return xRequest;
}

var req;
var	call;

function sendRequest(url, params, HttpMethod, callback)
{
	req = getXMLHTTPRequest();

	call	= callback;
	if(req){
		req.onreadystatechange = onReadyStateChange;
		req.open(HttpMethod, url, true);
		req.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=UTF-8");
		req.send(params);
	}
}

function onReadyStateChange()
{
	var ready = req.readyState;
	var data = null;
	if(ready == 4){
		if(this.call	!= null)
			this.call(req.responseText);
	}
}

function getValueSelectTag(target){
	var obj = document.getElementById(target).options;

	for(var i = 0 ; i < obj.length ; i++){
		if(obj[i].selected == true){
			return obj[i].value;
		} 
	}
}

//ajax ��

function getPnuStr(list){
	var pnu_list = list;
	var ownGubun = document.getElementById('ownGubun').value;	
	
	//alert("list : "+pnu_list);

	
	//alert("�������� : "+document.getElementById('ownGubun').value);
	
	
	var param = "&PNUSTR="+pnu_list+"&OWNGUBUN="+ownGubun;
	sendRequest("/rams/map/getunrewardlist.do", param, "GET", ResultPnuList);
}

function	ResultPnuList(obj)
{
	
	fncPnuListSetting(obj, "UnRewardList");
}


function fncPnuListSetting(strParam, selectBoxId)
{
	
  var xmldoc = new ActiveXObject("Microsoft.XMLDOM");
  
  var root;
  var selectBoxValue1;
  var selectBoxValue2;
  var selectBoxValue3;
  var selectBoxValue4;
  var string="";   

  xmldoc.async	= false;

	xmldoc.loadXML(strParam);

	
	root = xmldoc.getElementsByTagName("tr").length;

	//alert("root : " +root);
                                                                                  
                                                                                                                                             
string += "<table width='260' height='100%' border='1' cellspacing='0' cellpadding='0' bgcolor='#ffffff'>                                                      ";
string += "	  <tr>                                                                                                                           ";
string += "				<td valign='top'>                                                                                                                 ";
string += "					<table width='250' border='0' cellspacing='0' cellpadding='0'>                                                   ";
string += "					  <tr>                                                                                                           ";
string += "						<th height='35' valign='bottom' scope='ro'><img src='../images/map/l_st_rst.gif' alt='�˻����'/></th>        ";
string += "					  </tr>                                                                                                          ";
string += "					  <tr>                                                                                                           ";
string += "						<th scope='row' class='cont3'>                                                                               ";
string += "								<table width='250' border='1' cellspacing='0' cellpadding='0' bordercolor='#bed6e1'>                 ";
string += "												  <tr>                                                                               ";
string += "															<th height='25' scope='col' class='title'>����</th>                        ";
string += "															<th class='title' scope='col'>����</th>                                    ";
string += "															<th class='title' scope='col'>����</th>                                    ";
string += "															<th class='title' scope='col'>����</th>                                    ";
string += "												  </tr>                                                                              ";



	
  for(var i = 0; i < root; i++)
  {
  	
  	//selectBoxValue = xmldoc.getElementsByTagName("tr").item(i).text; 	
  	
  	selectBoxValue1 = xmldoc.getElementsByTagName("tr").item(i).getElementsByTagName("td").item(0).text;
  	selectBoxValue2 = xmldoc.getElementsByTagName("tr").item(i).getElementsByTagName("td").item(1).text;
  	selectBoxValue3 = xmldoc.getElementsByTagName("tr").item(i).getElementsByTagName("td").item(2).text;
  	selectBoxValue4 = xmldoc.getElementsByTagName("tr").item(i).getElementsByTagName("td").item(3).text;
  	selectBoxValue5 = xmldoc.getElementsByTagName("tr").item(i).getElementsByTagName("td").item(4).text;
  	selectBoxValue6 = xmldoc.getElementsByTagName("tr").item(i).getElementsByTagName("td").item(5).text;

 	if(selectBoxValue3 == 'null') selectBoxValue3 = '';
 	if(selectBoxValue4 == 'null') selectBoxValue4 = '';
	
	string += "<tr onClick=goDetail('"+selectBoxValue5+"');fnGetCentroid('"+selectBoxValue6+"','LP_PA_CBND_ALL'); style='cursor:hand;'><td height='25' class='title' scope='col'>"+selectBoxValue1+"</td>";
	string += "<td height='25' class='title' scope='col'>"+selectBoxValue2+"</td>";
	string += "<td height='25' class='title' scope='col'>"+selectBoxValue3+"</td>";
	string += "<td height='25' class='title' scope='col'>"+selectBoxValue4+"</td></tr>";
	
  }

string += "	 </table>				";		
string += "	</th>                   ";
string += "</tr>                    ";
string += "</table>                 ";
string += "</td>                    ";
string += "</tr>                    ";
string += "<tr>                     ";
string += "<td height='10'></td>    ";
string += "</tr>                    ";
string += "</table>                 ";


  

  document.getElementById('unrewardDiv').innerHTML = string;   
  document.getElementById('recordresult').innerHTML = "";
  
  //document.getElementById('recordresult').style.zIndex = 1;
  //document.getElementById('recordresult').style.display ='none'; 

}

function goDetail(pnu){

	document.getElementById('searchResult').style.top = 380;
	document.getElementById('searchResult').style.height = 380;	
	document.getElementById('search').style.height= 390;
	document.getElementById('searchResult').src = "/rams/map/unrewarddetail.do?PNU="+pnu;
	document.getElementById('searchResult').style.visibility = "visible";
	document.getElementById('unrewardDiv').style.display = "none";

}


</script>

</head>

<!-- height:expression(screen.availHeight-350), width: expression(screen.availWidth)-->
<body onload="init();modifyHeight();"  style="height:550px;width:1200px;">

<input type="hidden" id = "selectGu"  name ="selectGu"  value=""></input>
<input type="hidden" id = "selectDong"  name="selectDong"  value=""></input>
<input type="hidden" id = "selectRoad"  name="selectRoad"  value=""></input>
<input type="hidden" id = "selectOwn"  name="selectOwn"  value=""></input>
<input type="hidden" id = "selectJi"  name="selectJi"  value=""></input>
<input type="hidden" id = "prevJiga"  name="prevJiga"  value=""></input>
<input type="hidden" id = "nextJiga"  name="nextJiga"  value=""></input>
<input type="hidden" id= "ownGubun" name="ownGubun" value=""></input>
<input type="hidden" id= "cityPlan" name="cityPlan" value=""></input>
<input type="hidden" id= "useArea" name="useArea" value=""></input>
<input type="hidden" id= "useZone" name="useZone" value=""></input>
<input type="hidden" id= "useRegion" name="useRegion" value=""></input>
<input type="hidden" id= "moveGu" name="moveGu" value="NOTSELECTED"></input>




<!-- ���� â -->

<iframe src="${iFrameUrl1}"  id="search"  name= "search" frameborder='0' scrolling='no' width="287px"  style="position:absolute;left:0px;top:0px;z-index:6;visibility:visible;overflow:hidden;"></iframe>
<iframe src="${iFrameUrl2}" scrolling='yes' id="searchResult" name = "searchResult"  frameborder='0'  width="287px" style="position:absolute;left:0px;top:0px;visibility:hidden;z-index:7;overflow:scroll;"></iframe>
<div id="unrewardDiv" style="position:absolute;left:5px;top:390px;z-index:7;display:none;overflow-x:hidden;overflow-y:scroll;height:200px;filter:alpha(opacity=100);)">
	<table width='260' height='100%' border='1' cellspacing='0' cellpadding='0' bgcolor='#ffffff'>                                                      
	  <tr>                                                                                                                           
				<td valign='top'>                                                                                                                 
					<table width='250' border='1' cellspacing='0' cellpadding='0'>                                                   
					  <tr>                                                                                                           
						<th height='35' valign='bottom' scope='ro'><img src='../images/map/l_st_rst.gif' alt='�˻����'/></th>        
					  </tr>                                                                                                          
					  <tr>                                                                                                            
										<th scope='row' class='cont3'>                                                                               
								<table width='250' border='1' cellspacing='0' cellpadding='0' bordercolor='#bed6e1'>                 
										  <tr>                                                                               
															<th height='25' scope='col' class='title'>����</th>                        
															<th class='title' scope='col'>����</th>                                    
															<th class='title' scope='col'>����</th>                                    
															<th class='title' scope='col'>����</th>                                    
										  </tr>                 
												  </table>
											</th>
									</tr>
					</table>
				</td>
		</tr>
	</table>																							
</div>

<div id="map" ondblclick="DoubleClickEvent();" name="map" class="smallmap" style="position:absolute;top:0px;left:100px;width:1200px;height:100%;z-index:2;">
</div>
<div>
	<span id="txtCentroidResult"></span>
</div>

<div id="topControl" style="position:absolute;top:0px;left:270px;z-index:6">
	<table width="620" border="0" cellspacing="0" cellpadding="0">
	<tr>
		<td width="15" height="48" ><img src="/rams/images/map/t_left.gif" alt="." border="0"/></td>
		<td width="46"><img src="/rams/images/map/t_prev_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnPrev','','/rams/images/map/t_prev_on.gif',1)"alt="����" name="btnPrev"  id="btnPrev" border="0" style='cursor:hand;'/></td>
		<td width="46"><img src="/rams/images/map/t_next_off.gif"  onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnNext','','/rams/images/map/t_next_on.gif',1)"  alt="����" name="btnNext" border="0" id="btnNext" style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_all_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnFit','','/rams/images/map/t_all_on.gif',1)" alt="��ü" name="btnFit" border="0"  id="btnFit" style='cursor:hand;'/></td>
		<td width="46"><img src="/rams/images/map/t_plus_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnZoomIn','','/rams/images/map/t_plus_on.gif',1)" alt="Ȯ��" name="btnZoomIn" border="0" id="btnZoomIn" style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_minus_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnZoomOut','','/rams/images/map/t_minus_on.gif',1)" alt="���" name="btnZoomOut" border="0" id="btnZoomOut" style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_move_off.gif" onclick='move();' onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image8','','/rams/images/map/t_move_on.gif',1)" alt="�̵�" name="Image8" border="0" id="Image8" style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_dist_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('btnDistance','','/rams/images/map/t_dist_on.gif',1)" alt="�Ÿ�" name="btnDistance" border="0" id="btnDistance"  style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_area_off.gif" alt="����" onclick="GetArea();" name="Image10" border="0" id="Image10" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image10','','/rams/images/map/t_area_on.gif',1)" style='cursor:hand;' /></td>
		<td width="46"><img src="/rams/images/map/t_new_off.gif" onclick='onPopupClose();' onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image11','','/rams/images/map/t_new_on.gif',1)" alt="���ΰ�ħ" name="Image11" border="0" id="Image11" style='cursor:hand;' /></td>
		<td width="45"><img src="/rams/images/map/t_sate_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image12','','/rams/images/map/t_sate_on.gif',1)" alt="��������" onclick='vOn();' name="Image12" border="0" id="Image12" style='cursor:hand;' /></td>
			<c:if test="${reward == '1' || reward == '2'}">
			<td width="45"><img src="/rams/images/map/t_search_off.gif" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image13','','/rams/images/map/t_search_on.gif',1)" alt="�����˻�" name="Image13" border="0" id="Image13" onclick="GetAreaSearch();" style="cursor:hand" ></td>
			</c:if>
		<td align="right" background="/rams/images/map/t_bg.gif">
			 <table width="65" border="0" cellspacing="0" cellpadding="0">
									<tr>
									  <th align="right" scope="row">���̾�</th>
									  <td width="20" align="right"><label for="checkbox"><input type="checkbox" name="checkbox" value="checkbox" id="checkbox"  onClick="javascript:layerOnOff();"/></label></td>
									</tr>
									<tr>
									  <th align="right" scope="row">����</th>
									  <td align="right"><label for="checkbox"><input type="checkbox" name="checkbox" value="checkbox" id="checkbox"  onClick="javascript:remarksOnOff();"/></label></td>
									</tr>
							    </table>
		</td>
		<td width="4"><img src="/rams/images/map/t_right.gif" alt="." border="0"/></td>
	</tr>
	</table>
</div>		

	<div id="layerinfo" class="clsDrag" style="position:absolute;top:55px;left:270px;z-index:10;visibility:hidden;filter:alpha(opacity=100);width:300px;background:white;">
				
				<table border='1'>
				<tr bgcolor="yellow">
				<td height='25'>�뵵��������</td>
				<td>���ð�ȹ�ü�</td>
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
				
				<div id="remarks" class="clsDrag" style="position:absolute;top:55px;left:270px;px;z-index:10;visibility:hidden;filter:alpha(opacity=100);width:400px;background:white;">
					<table border="1" style="width:400px;height:100px;">
									<tr><td colspan='2' bgcolor="yellow" align="center">�ְ�����</td></tr>
									<tr>
										<td>
												<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/1DivHome.jpg"> </td>
																	<td width="140">��1�������ְ�����</td>															
														</tr>
												</table>
										</td>	
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/1GenHome.jpg"> </td>
																	<td width="140">��1���Ϲ��ְ�����</td>															
														</tr>
												</table>
										</td>					
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/2DivHome.jpg"> </td>
																	<td width="140">��2�������ְ�����</td>																	
														</tr>
												</table>										
										</td>				
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/2GenHome7.jpg"> </td>
																	<td width="140">��2���Ϲ��ְ�����(7��)</td>															
														</tr>
												</table>
										</td>												
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/2GenHome12.jpg"> </td>
																	<td width="140">��2���Ϲ��ְ�����(12��)</td>																	
														</tr>
												</table>
										</td>				
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/3GenHome.jpg"> </td>
																	<td width="140">��3���Ϲ��ְ�����</td>															
														</tr>
												</table>
										</td>													
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/HalfHome.jpg"> </td>
																	<td width="140">���ְ�����</td>																	
														</tr>
												</table>
										</td>																
										<td>
											
										</td>	
									</tr>
					</table>
					<br><br></br>
					<table border="1" style="width:400px;height:40px;">
					<tr><td colspan='2' bgcolor="yellow" align="center">�������</td></tr>
									<tr>
									
										<td>
												<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/1DivHome.jpg"> </td>
																	<td width="140">�߽ɻ������</td>															
														</tr>
												</table>
										</td>	
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/GenBuy.jpg"> </td>
																	<td width="140">�Ϲݻ������</td>															
														</tr>
												</table>
										</td>					
									</tr>
									
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/GnBuy.jpg"> </td>
																	<td width="140">�ٸ��������</td>																	
														</tr>
												</table>										
										</td>				
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/UtBuy.jpg"> </td>
																	<td width="140">����������</td>															
														</tr>
												</table>
										</td>												
									</tr>
					</table>
							<br><br></br>
					<table border="1" style="width:400px;height:40px;">
					<tr><td colspan='2' bgcolor="yellow" align="center">��������</td></tr>
									<tr>
									
										<td>
												<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/naturalnok.jpg"> </td>
																	<td width="140">�ڿ���������</td>															
														</tr>
												</table>
										</td>	
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/nok2.jpg"> </td>
																	<td width="140">�����������</td>															
														</tr>
												</table>
										</td>					
									</tr>
									
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/bojunnok.jpg"> </td>
																	<td width="140">������������</td>																	
														</tr>
												</table>										
										</td>				
										<td>
											
										</td>												
									</tr>					
					</table>
						<br><br></br>
					<table border="1" style="width:400px;height:40px;">
					<tr><td colspan='2' bgcolor="yellow" align="center">�̰�����</td></tr>
									<tr>
									
										<td>
												<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/miguan_middle.jpg"> </td>
																	<td width="140">�߽����̰�����</td>															
														</tr>
												</table>
										</td>	
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/migaun_gen.jpg"> </td>
																	<td width="140">���繮ȭ�̰�����</td>															
														</tr>
												</table>
										</td>					
									</tr>
									
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/migaun_gen.jpg"> </td>
																	<td width="140">�Ϲݹ̰�����</td>																	
														</tr>
												</table>										
										</td>				
										<td>
											
										</td>												
									</tr>									
					</table>
					<br><br></br>
					<table border="1" style="width:400px;height:120px;">
					<tr><td colspan='2' bgcolor="yellow" align="center">��Ÿ����</td></tr>
									<tr>									
										<td>
												<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/industry.jpg"> </td>
																	<td width="140">��������</td>															
														</tr>
												</table>
										</td>	
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/kyungan.jpg"> </td>
																	<td width="140">�������</td>															
														</tr>
												</table>
										</td>					
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/godo.jpg"> </td>
																	<td width="140">��������</td>																	
														</tr>
												</table>										
										</td>				
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/fire.jpg"> </td>
																	<td width="140">��ȭ����</td>															
														</tr>
												</table>
										</td>												
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/fireje.jpg"> </td>
																	<td width="140">��������</td>																	
														</tr>
												</table>
										</td>				
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/bojon.jpg"> </td>
																	<td width="140">��������</td>															
														</tr>
												</table>
										</td>													
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/fire.jpg"> </td>
																	<td width="140">�ü���ȣ����</td>																	
														</tr>
												</table>
										</td>																
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/fire.jpg"> </td>
																	<td width="140">�뵵�������</td>															
														</tr>
												</table>
										</td>	
									</tr>
									<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/develop.jpg"> </td>
																	<td width="140">������������</td>																	
														</tr>
												</table>
										</td>																
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/fire.jpg"> </td>
																	<td width="140">�����̿��Ÿ�뵵����</td>															
														</tr>
												</table>
										</td>	
									</tr>	
										<tr>
										<td>
											<table border="0">
														<tr>
																	<td width="52"><img src="/rams/images/map/remark/develop.jpg"> </td>
																	<td width="140">������������</td>																	
														</tr>
												</table>
										</td>																
										<td>
											<table border="0">
														<tr>
																	<td width="100%" colspan='2'><div id='AAA'></div> </td>
																														
														</tr>
												</table>
										</td>	
									</tr>													
										
					</table>
				</div>
		
				
<div id='mPopup' style='z-index:6;display:block'>
	
</div>
<div id="recordresult" style='position:absolute;z-index:1;display:block;background-color:white;left:450px;top:300px;width:220px;'>
	
</div>

</body>

</html>