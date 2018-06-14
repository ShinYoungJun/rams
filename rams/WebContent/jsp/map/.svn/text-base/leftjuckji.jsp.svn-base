<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>도로재산관리시스템</title>
<link href="../css/doro.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.box777 {
	background-color:#ffffff;
	border: 1px #d3e2ea solid;
	color: #9a9a9a;
	}

</style>

<script language="javascript">
function goResult(){

	
	parent.document.getElementById("selectGu").value = document.getElementById("selectGu").value;
	parent.document.getElementById("selectDong").value = document.getElementById("selectDong").value;
	parent.document.getElementById("selectRoad").value = document.getElementById("selectRoad").value;
	parent.document.getElementById("selectOwn").value = document.getElementById("selectOwn").value;
	parent.document.getElementById("selectJi").value = document.getElementById("selectJi").value;
	parent.document.getElementById("prevJiga").value = document.getElementById("prevJiga").value;
	parent.document.getElementById("nextJiga").value = document.getElementById("nextJiga").value;

	var gu =  document.getElementById("selectGu").value;

	if( gu == null || gu == "" ){
		alert('구를 선택해주세요');
	}else{
			
	parent.goResult();
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

//ajax 끝

function changeGuCode(){
	var _guCode = getValueSelectTag("selectGu");
	//alert("gu : "+_guCode);
	var param = "&GU_CD="+_guCode;
	sendRequest("/rams/map/get_dong_list.do", param, "GET", ResultChangeGuCode);
}

function	ResultChangeGuCode(obj)
{
	
	fncSelectBoxSetting(obj, "selectDong", "", "동선택");
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

function goSearch(){
	

	    var cw=screen.availWidth; // 화면 너비
	var ch=screen.availHeight; // 화면 높이

	var name = '/rams/map/juckjianalysissearch.do';
	var sw=810;// 띄울 창의 너비
	var sh=200;// 띄울 창의 높이

	var ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치
	var mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치

	 window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=no,menubar=no,status=no ,directories=no,');

	
}
</script>

</head>

<body>
<div id="left">

  <table width="260" height="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="5" ><img src="../images/map/l_bg1.gif" alt="."/></td>
    </tr>
    <tr>
      <td height="100%" class="cont">
	  	<table width="250" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<th scope="col"><img src="../images/map/l_t01.gif" alt="적지분석" width="250" height="27" /></th>
		  </tr>
		  <tr>
			<td>
			
			
				<table width="250" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<th scope="col"><img src="../images/map/l_st_srch.gif" alt="검색" width="250" height="29" /></th>
				  </tr>
				  <tr>
					<td class="cont2">
						<table width="220" border="0" cellspacing="0" cellpadding="0">
						  <tr>
							<th width="73" height="24" class="title" scope="row">구명</th>
							<td width="147"><label for="select">${GuCode }</label></td>
						  </tr>
						  <tr>
							<th height="24" class="title" scope="row">동명</th>
							<td width="147"><label for="select"><select name="selectDong" class="tb147" id="selectDong"></select></label></td>
						  </tr>
						  <tr>
							<th height="24" class="title" scope="row">노선번호</th>
							<td width="147"><label for="select">${RoadName}</label></td>
						  </tr>
						  <tr>
							<th height="24" class="title" scope="row">소유구분</th>
							<td width="147"><label for="select"> ${Owngubun }</label></td>
						  </tr>
						  <tr>
							<th height="24" class="title" scope="row">지목</th>
							<td width="147"><label for="select">${Jimok}</label></td>
						  </tr>
						  <tr>
							<th height="24" class="title" scope="row">지가</th>
							<td width="147" align="left"><input type="text" id="prevJiga" name="prevJiga" class="box777"  size="7">&nbsp; ~ &nbsp;<input type="text" id="nextJiga" name="nextJiga"  size="7" class="box777" ></td>
						  </tr>
						  <tr>
							<th scope="row"></th>
							<td height="30" align="right" valign="bottom">
								<table width="130" border="0" cellspacing="0" cellpadding="0">
								  <tr>
									<td><img src="/rams/images/common/btn_detail.gif" onclick='goSearch();' alt="상세검색" style='cursor:hand;' width="62" height="18" border="0" /></td>
									<td width="68" align="right"><img src="/rams/images/common/btn_srch.gif" onClick="javascript:goResult();" style='cursor:hand;' alt="검색" border="0"/></td>
								  </tr>
								</table>
							</td>
						  </tr>
						</table>
					</td>
				  </tr>
				  <tr>
					<td height="1" bgcolor="dddddd"></td>
				  </tr>
				</table>
			</td>
		  </tr>
		  
		</table>
		
	  </td>
    </tr>
  </table>
  
</div>
</body>
</html>
