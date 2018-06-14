<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>���� ����</title>
<link href="/rams/css/doro.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.box777 {
	background-color:#ffffff;
	border: 1px #d3e2ea solid;
	color: #9a9a9a;
	}

</style>
<script src="/rams/OpenLayers/lib/jquery-1.3.1.min.js"></script>
<script src="/rams/js/common.js">				 </script>
<script src="/rams/OpenLayers/lib/OpenLayers.js"></script>

<script language="javascript">


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

function changeGuCode(){
	var _guCode = getValueSelectTag("selectGu");
	alert("gu : "+_guCode);
	var param = "&GU_CD="+_guCode;
	sendRequest("/rams/map/get_dong_list.do", param, "GET", ResultChangeGuCode);
}

function	ResultChangeGuCode(obj)
{
	
	fncSelectBoxSetting(obj, "selectDong", "", "������");
}

function fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)
{
    var xmldoc = new ActiveXObject("Microsoft.XMLDOM");
    var selectBoxLabel;
    var root;
    var selectBoxValue;
    var opt 	= document.getElementById(selectBoxId);
    var tags	= "";
    var	text	= "";

    for(var i = opt.options.length - 1 ; i > -1 ; i--)
    {
    	opt.options[i]	= null;
    }

    xmldoc.async	= false;

	xmldoc.loadXML(strParam);


	root = xmldoc.getElementsByTagName("option").length;


    if(root <= 0)
    {
        tags 	= document.createElement("option");
        text	= document.createTextNode("");
        tags.setAttribute("label", "");
        tags.appendChild(text);
        tags.value = 0;
        opt.appendChild(tags);
        return;
    }

    if(topLabel != null && topLabel != "")
	{
        tags 	= document.createElement("option");
        text	= document.createTextNode(topLabel);
        tags.setAttribute("label", topLabel);
        tags.appendChild(text);
        tags.value = '';
        opt.appendChild(tags);
    }
	
    for(var i = 0; i < root; i++)
    {
    	
    	selectBoxValue = xmldoc.getElementsByTagName("option/@value").item(i).text;
    	selectBoxLabel = xmldoc.getElementsByTagName("option/@label").item(i).text;

        tags 	= document.createElement("option");
   		text	= document.createTextNode(selectBoxLabel);

        tags.setAttribute("label", selectBoxLabel);

        tags.value = selectBoxValue;
        tags.appendChild(text);
        opt.appendChild(tags);
    }   
}

function goDetail(pnu){

	location.href='/rams/map/juckjianalysisdetail.do?PNU='+pnu;
	
}

function goLocation(xid,layer){

	//alert(xid);
	parent.fnGetCentroid(xid,layer);
}

</script>

</head>

<body>
<div id="left" align="center" >
  <table width="260" height="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
			<td>
				<table width="250" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<th height="35" valign="bottom" scope="row"><img src="../images/map/l_st_rst.gif" alt="�˻����"/></th>
				  </tr>
				  <tr>
					<th scope="row" class="cont3">
							<table width="250" border="1" cellspacing="0" cellpadding="0" bordercolor="#bed6e1">
											  <tr>
														<th height="25" scope="col" class="title">����</th>
														<th class="title" scope="col">����</th>
														<th class="title" scope="col">����</th>
														<th class="title" scope="col">����</th>
											  </tr>
										
											  <c:forEach items="${SearchList}"  var="list">
											  <tr onClick="javascript:goLocation('${list.XID}','LP_PA_CBND_ALL');goDetail('${list.PNU}');" style='cursor:hand;'>
														<td height="25" class="title">${list.SGGCODE}</td>
														<td class="title" >${list.DONGCODE }</td>
														<td class="title" >${list.JIBUN }</td>
														<td class="title" >${list.CODEDESC }</td>
											  </tr>
											  </c:forEach>											
								 </table>
					
					</th>
				  </tr>
				</table>
			</td>
		  </tr>
		  <tr>
		  <td height='10'></td>
		  </tr>
		  <tr>
			<td height="30" align="center">			
			
			<table width="139" border="0" cellspacing="0" cellpadding="0">
				<tr>
					${strPageDivideForm}
				</tr>
			</table>
			</td>
		  </tr>
    </table>
</div>
</body>
</html>
