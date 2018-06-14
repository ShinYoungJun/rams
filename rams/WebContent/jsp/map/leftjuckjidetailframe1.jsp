<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 고시 상세정보 :::::</title>
<link href="../css/doro.css" rel="stylesheet" type="text/css" />
<style type="text/css">
body{
scrollbar-face-color:#EEF8FB;
scrollbar-3dlight-color:#BBBDB6; 
scrollbar-highlight-color:#EEF8FB;
scrollbar-shadow-color:#BBBDB6; 
scrollbar-darkshadow-color:#EEF8FB;
scrollbar-track-color:#EEF8FB;
scrollbar-arrow-color:#BBBDB6;

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
			<tr>
				<td colspan='13'>해당 결과가 없습니다.</td>
			</tr>
		</c:if>
		 
		 <c:forEach items="${fList}" var="fList" varStatus='count'> 
		  <tr>
			<td width="25" scope="col">${count.index+1}</td>
			<td width="30" scope="col">${fList.STATE }</td>
			<td width="85" scope="col">${fList.CODETEXT }</td>
			<td width="55" scope="col">${fList.RDNUM }</td>
			<td width="30" scope="col">${fList.WIDTH }</td>
			<td width="30" scope="col">${fList.RDUSE }</td>
			<td width="55" scope="col">${fList.LEN }</td>
			<td width="80" scope="col">${fList.LNSTART }</td>
			<td width="80" scope="col">${fList.LNEND }</td>
			<td width="70" scope="col">${fList.RDTYPE }</td>
			<td width="70" scope="col">${fList.LNVIA }</td>
			<td width="70" scope="col">${fList.FIRSTDATE }</td>
			<td scope="col">${fList.OTHER}</td>
		  </tr>
		  </c:forEach>
		</table>
	</td>
  </tr>
</table>
</center>

</body>

</html>
