<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>도로재산관리시스템</title>
<link href="/rams/css/doro.css" rel="stylesheet" type="text/css" />
<script language='javascript'>

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

function goResultPop(){

	opener.parent.document.getElementById("selectGu").value = document.getElementById("selectGu").value;
	opener.parent.document.getElementById("selectDong").value =  document.getElementById("selectDong").value;
	opener.parent.document.getElementById("selectRoad").value = document.getElementById("selectRoad").value;
	opener.parent.document.getElementById("selectOwn").value = document.getElementById("selectOwn").value;
	opener.parent.document.getElementById("selectJi").value = document.getElementById("selectJi").value;
	opener.parent.document.getElementById("prevJiga").value = document.getElementById("prevJiga").value;
	opener.parent.document.getElementById("nextJiga").value = document.getElementById("nextJiga").value;
	opener.parent.document.getElementById("cityPlan").value = document.getElementById("cityPlan").value;
	opener.parent.document.getElementById("useArea").value = document.getElementById("useArea").value;
	opener.parent.document.getElementById("useZone").value = document.getElementById("useZone").value;
	opener.parent.document.getElementById("useRegion").value = document.getElementById("useRegion").value; 

	
	var gu =  document.getElementById("selectGu").value;

	if( gu == null || gu == "" ){
		alert('구를 선택해주세요');
	}else{

		
		opener.parent.goResult();
	}
	
	
	

}



</script>
</head>

<body>

<div id="tImg" style='left:10px;'><img src="/rams/images/map/tit_srch.gif" alt="상세검색" width="65" height="19" /></div>
<table width="804" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
  <tr>
    <td>
		<table width="800" border="1" cellpadding="0" cellspacing="1" class="mapPopup" summary="" bordercolor="#bed6e1">
		  <tr>
			<th width="100" scope="col">구명</th>
			<td width="155" class="leftCon">${GuCode}</td>
			<th width="100" scope="col">동명</th>
			<td width="155" class="leftCon"><select name="selectDong" class="formBox1" id="selectDong"></select></td>
			<th width="100" scope="col">노선명</th>
			<td class="leftCon">${RoadName} </td>
		  </tr>
		  <tr>
			<th scope="col">소유구분</th>
			<td class="leftCon">${Owngubun}</td>
			<th scope="col">지목</th>
			<td class="leftCon">${Jimok} </td>
			<th scope="col">도시계획시설</th>
			<td class="leftCon">
				<select name="cityPlan" class="formBox1">
					<option value='all'>::전체::</option>
					<option value='count_15'>도로</option>
					<option value='count_16'>주차장</option>
					<option value='count_17'>공원</option>
					<option value='count_18'>녹지</option>
					<option value='count_19'>유원지</option>
					<option value='count_20'>학교</option>
					<option value='count_21'>하천</option>				
				</select>			
			</td>			
		  </tr>
		  <tr>
			<th scope="col">용도구역</th>
			<td class="leftCon">
				<select name="useArea" class="formBox1">
					<option value='all'>:::전체:::</option>
					<option value='count_'>개발제한구역</option>
				</select>
			</td>
			<th scope="col">용도지역</th>
			<td class="leftCon">
				<select name="useZone" class="formBox1">
					<option value='all'>:::전체:::</option>
					<option value='count_1'>주거지역</option>
					<option value='count_2'>상업지역</option>
					<option value='count_3'>공업지역</option>
					<option value='count_4'>녹지지역</option>
				</select>
			</td>
			<th width="85" scope="col">용도지구</th>
			<td class="leftCon">
				<select name="useRegion" class="formBox1">
					<option value='all'>:::전체:::</option>
					<option value='count_5'>경관지구</option>
					<option value='count_6'>미관지구</option>
					<option value='count_7'>고도지구</option>
					<option value='count_8'>방화지구</option>
					<option value='count_9'>방재지구</option>
					<option value='count_10'>보존지구</option>
					<option value='count_11'>시설보호지구</option>
					<option value='count_12'>용도지구취락지구</option>
					<option value='count_13'>개발진흥지구</option>
					<option value='count_14'>국토이용기타용도지구</option>
				</select>
			</td>
		  </tr>
		  <tr>
			<th width="85" scope="col">지가</th>
			<td class="leftCon" colspan="5" ><input type='text' name="prevJiga" id="prevJiga" class="formBox1"> ~ <input type='text' name="nextJiga" id="nextJiga" class="formBox1"></td>
		  </tr>
		</table>
	</td>
  </tr>
</table>
<table width="804" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="30" align="right"><img src="/rams/images/common/btn_srch2.gif" onclick='goResultPop();' style='cursor:hand;'alt="검색" width="62" height="18" border="0" /></td>
  </tr>
</table>

</body>
</html>
