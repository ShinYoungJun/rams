<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 보상가 산정 :::::</title>
<link href="../css/doro.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.box777 {
	background-color:#ffffff;
	border: 1px #d3e2ea solid;
	color: #9a9a9a;
	}
	
.style1 {color: #FFFFFF}
.style2 {
	color: #FFFF00;
	font-weight: bold;
}

</style>

<script src="/rams/js/common.js"></script>
<script language="javascript">

function add(){

	var count = '${count}';
	var sumJiga = 0;
	var sumArea = 0;

	for(var i=1;i<=count;i++){
		
		if(document.getElementById('selectBox'+i).checked == true){
			
			var jiga = fixFloatCal(document.getElementById('makeJiga'+i).value);			
			var area = fixFloatCal(document.getElementById('makeArea'+i).value);
			
			sumJiga += jiga;
			sumArea += area;
		}
	}

	document.getElementById('sumArea').value= fixFloatCal(sumArea);
	document.getElementById('sumJiga').value= fixFloatCal(sumJiga);
	 
	
	
}

function fixFloatCal(val){
	return  Math.round( parseFloat(val) *1000) /1000;
	
}

function goExcel(){

	var count = '${count}';

	var pnuList = "";
	var jigaList = "";
	
	
	for(var i=1;i<=count;i++){
		
		if(document.getElementById('selectBox'+i).checked == true){

			pnuList += document.getElementById('pnuList'+i).value+" ";
			jigaList += document.getElementById('makeJiga'+i).value+" ";
			
		}
	}

	var sumJiga = document.getElementById("sumJiga").value;
	var sumArea = document.getElementById("sumArea").value;
	
	
	location.href="/rams/map/rewardexcel.do?PNULIST="+pnuList+"&JIGALIST="+jigaList+"&SUMAREA="+sumArea+"&SUMJIGA="+sumJiga;
	
}

</script>
</head>
<body>
<center>
<br>
  <table width="804" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <th align="left" scope="row"><img src="../images/map/tit_calcul.gif" alt="보상가선정" width="80" height="19" /></th>
      <td align="right" width="62"><img src="../images/common/btn_sum.gif" alt="지가합산" border="0" style="cursor:hand;" onClick="javascript:add();"/></td>
      <td align="right" width="70"><img src="../images/common/btn_excel.gif" alt="엑셀출력" border="0" style="cursor:hand;" onClick="goExcel();"/></td>
      <td align="right" width="70"><img src="../images/common/btn_close2.gif" alt="창닫기" border="0" style="cursor:hand;" onClick="window.close();"/></td>
    </tr>
  </table>
<br><br>

 <div style="width:830px; height: 450px; overflow: auto">
<table width="804" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
  <tr>
    <td><table width="800" border="1" cellpadding="0" cellspacing="1" class="mapPopup" summary="" bordercolor="#bed6e1">
      <tr>
        <th width="80" scope="col">보상용지선정</th>
        <th width="70" scope="col">지번</th>
        <th width="70" scope="col">지목</th>
        <th width="100" scope="col">소유구분</th>
        <th width="100" scope="col">면적(m2)</th>
        <th width="170" scope="col">공시지가(원)<br />
          (2010.1.1기준)</th>
        <th scope="col">지가산정(원)</th>
      </tr>
 
     
     
      <c:forEach items="${rewardList}" var="list" varStatus="index"> 
      <input type="hidden" id="pnuList${index.count}" name="pnuList${index.count}" value="${list.PNU}">
      
      <tr>
        <td width="80" scope="col"><label for="checkbox"><input type="checkbox" name="selectBox${index.count}" id="selectBox${index.count}" /></label></td>
        <td width="70" scope="col">${list.JIBUN}</td>
        <td width="70" scope="col">${list.CODEDESC}</td>
        <td width="100" scope="col">${list.OWNGUBUN}</td>
        <td width="100" scope="col">${list.AREA}</td>
        <td width="170" scope="col">${list.JIGA}</td>
        <td><label for="textfield"><input name="makeJiga${index.count}" type="text" class="formBox3" id="makeJiga${index.count}" value="${list.JIGA}"/></label></td>
      </tr>
      <input type="hidden" name="makeArea${index.count}" id="makeArea${index.count}" value="${list.AREA}">
     </c:forEach>
   	</table>
   	
    </td>
  </tr>
</table>
</div>
<table width="804" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="390" height="40" align="right"><strong>면적</strong></td>
    <td width="128" align="right"><label for="label">
    <input name="sumArea" type="text" class="formBox1" id="sumArea" /></label></td>
    <td width="140" align="right"><strong>보상용지지가 합산</strong> </td>
    <td width="128" align="right"><label for="label"><input name="sumJiga" type="text" class="formBox1" id="sumJiga" /></label></td>
  </tr>
  <tr>
  	<td height="35" colspan="4" align="center" valign="bottom" class="t_org">*보상가 산정은 편입 토지에 대한 지가에 대한 합산으로 대략적인 금액만 산정해 볼 수 있습니다.</td>
  </tr>
</table>
</center>
</body>

</html>
