<%@ page language="java" contentType="text/html; charset=euc-kr" pageEncoding="euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>무제 문서</title>
<link href="/rams/css/doro.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.box777 {
	background-color:#ffffff;
	border: 1px #d3e2ea solid;
	color: #9a9a9a;
	}

</style>
<script src="/rams/js/common.js"></script>
<script language="javascript">
function goPop(){

    var cw=screen.availWidth; // 화면 너비
	var ch=screen.availHeight; // 화면 높이

	var name = '/rams/map/rewardview.do';
	var sw=830;// 띄울 창의 너비
	var sh=600;// 띄울 창의 높이

	var ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치
	var mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치

	 window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=yes,menubar=no,status=no ,directories=no,')
	
}


function goSetLocation(){

	var select = document.getElementById('GU').value;
	var  layer = "";

	
	if(select == '3'){
		layer = 'LA_PA_CBND_YS';
	}else if(select == '19'){
		layer = 'LA_PA_CBND_DJ';
		//layer = 'LP_PA_CBND_ALL';
	}else if(select == '20'){
		layer = 'LA_PA_CBND_GA';
	}else if(select == '17'){
		layer = 'LA_PA_CBND_GC';
	}else if(select == '16'){
		layer = 'LA_PA_CBND_GURO';
	}else if(select == '2'){
		layer = 'LA_PA_CBND_JUNGGU';
		//layer = 'LP_PA_CBND_ALL';
	}else if(select == '18'){
		layer = 'LA_PA_CBND_YDP';
	}else{
		layer = 'NOTSELECTED';
	}

	parent.document.getElementById("moveGu").value = layer;
	
	parent.fnGetCentroid(select,'G001_2_1');
	
	
}

</script>

</head>

<body>
<div id="left">
 <table width="260" height="100%" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td height="5" ><img src="/rams/images/map/l_bg1.gif" alt="."/></td>
    </tr>
    <tr>
      <td height="100%" class="cont">
	  	<table width="250" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<th scope="col"><img src="/rams/images/map/l_t04.gif" alt="적지분석" width="250" height="27" /></th>
		  </tr>
		  <tr>
			<td>			
				<table width="250" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<th scope="col" colspan='2'><img src="/rams/images/map/l_st_area2.gif" alt="보상용지대상선정" width="250" height="29" /></th>
				  </tr>
				    <tr>
							<th width="20%" height="30" class="title" scope="row" align='right'>구명</th>
							<td width="80%" align='center'><label for="select"><select class="tb147" id="GU" name="GU" onChange="goSetLocation();">
							  <option value="NOTSELECTED" selected>구선택</option>
							  <option value="3">용산구</option>
							  <option value="19">동작구</option>
							  <option value="20">관악구</option>
							  <option value="17">금천구</option>
							  <option value="16">구로구</option>							  
							  <option value="2">중구</option>
							  <option value="18">영등포구</option>
							</select></label></td>
						  </tr>
				  <tr>
					<td colspan='2'><img src="/rams/images/map/area2.gif" alt="영역지정설명" /></td>
				  </tr>
				  <tr>
					<td height="1" bgcolor="dddddd" colspan='2'>		
					</td>
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
