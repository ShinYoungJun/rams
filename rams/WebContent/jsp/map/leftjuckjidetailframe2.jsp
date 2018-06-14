<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 고시 상세정보 :::::</title>
<link href="/rams/css/doro.css" rel="stylesheet" type="text/css" />
<style type="text/css">
body { 
scrollbar-face-color: #94AEF8; 
scrollbar-shadow-color: #4671EA; 
scrollbar-highlight-color: #AFC1F3; 
scrollbar-3dlight-color: #333333; 
scrollbar-darkshadow-color: #000000; 
scrollbar-track-color: #DFE7FF; 
scrollbar-arrow-color: #021650; 
}

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





</script>

</head>


<body>

<center>
<table width="804" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea" style='scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;'>
  <tr>
    <td>
		<table width="800" border="1" cellpadding="0" cellspacing="1" class="mapPopup" summary="" bordercolor="#bed6e1" style='scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;'>
		  
		  
		 <c:if test='${fSize == 0 }'>
			<tr>				<td colspan='13'>해당 결과가 없습니다.</td>
			</tr>
		</c:if>
		 
		 <c:forEach items="${fList}" var="fList" varStatus='count'> 
		  <tr>
			<td width="5%" scope="col">${count.index+1}</td>
			<td width="10%" scope="col">${fList.GU_NM }</td>
			<td width="10%" scope="col">${fList.BJ_NM }</td>
			<td width="15%" scope="col">${fList.JIBUN }</td>
			<td width="10%" scope="col">${fList.OWNNAME }</td>
			<td width="20%" scope="col">${fList.OWNADDR }</td>
			<td width="10%" scope="col">${fList.RELNAME}</td>
			<td width="20%" scope="col">${fList.RELADDR }</td>			
		  </tr>
		  </c:forEach>
		</table>
	</td>
  </tr>
</table>
</center>

</body>

</html>
