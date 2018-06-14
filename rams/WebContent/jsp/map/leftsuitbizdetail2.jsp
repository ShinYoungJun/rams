<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>무제 문서</title>
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

#left1 .cont {background:url(/rams/images/map/l_bg2.gif); vertical-align:top; padding-left:0px;}
#left1 .cont .cont2 { background:url(/rams/images/map/con_bg1.gif); vertical-align:top; text-align:center; padding:0px;}
#left1 .cont .cont3 { background:url(/rams/images/map/con_bg1.gif); vertical-align:top; text-align:center;}
#left1 .cont .cont2 .title { background:url(/rams/images/map/dot1.gif) no-repeat; text-align:left; padding-left:0px;}
#left1 .cont .cont2 .title2 {text-align:left; padding-left:0px;}
#left1 .cont .stitle {background:url(/rams/images/map/l_st_bg1.gif) no-repeat; height:24px; padding:2px 0 0 27px;}


</style>

<script language="javascript">


</script>

</head>

<body>
<center>
<div id="iRst">
	<h4 class="style1">지번:</h4>
	<table width="233" border="1" cellspacing="0" cellpadding="0" bordercolor="#bed6e1">
	  <tr>
		<th height="25" scope="col" class="title">지번</th>
		<th class="title" scope="col">${view1.JIBUN}</th>
	  </tr>
	  <tr>
		<td height="25" class="cont">공시지가</td>
		<td class="cont">${view1.JIGA }</td>
	  </tr>
	  <tr>
		<td height="25" class="cont">면적(m2)</td>
		<td class="cont">${view1.AREA }</td>
	  </tr>
	  <tr>
		<td height="25" class="cont">주소</td>
		<td class="cont">${view1.DONGCODE }</td>
	  </tr>
	  <tr>
		<td height="25" class="cont">지목</td>
		<td class="cont">${view1.JIMOK }</td>
	  </tr>
	  <tr>
		<td height="25" class="cont">소유구분</td>
		<td class="cont">${view1.OWNGUBUN }</td>
	  </tr>
  </table>
  <h4 class="style1">상세정보</h4>
  <table width="233" border="1" cellspacing="0" cellpadding="0" bordercolor="#bed6e1">
	  <tr>
		<th width="60" height="25" class="title" scope="row">공사명</th>
		<td>${view2.CONSTNAME }</td>
	  </tr>
	  <tr>
		<th scope="row" class="title" height="25">공사구간</th>
		<td>${view2.CONSTPLACE }</td>
	  </tr>
	  <tr>
		<th scope="row" class="title" height="25">공사기간</th>
		<td>${view2.CONSTDATE }</td>
	  </tr>
	  <tr>
		<th scope="row" class="title" height="25">시행자</th>
		<td>${COMPANY}</td>
	  </tr>
	</table>
</div>
</center>
</body>
</html>
	