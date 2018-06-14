<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/loginCheck.jsp" %>
<%@ include file="/jsp/common/include.jsp"%>

<html xmlns:x="urn:schemas-microsoft-com:office:excel">
<head>
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<!--[if gte mso 9]><xml>
<x:ExcelWorkbook><x:ExcelWorksheets><x:ExcelWorksheet>
<x:Name>Sheet1</x:Name>
<x:WorksheetOptions><x:Panes><x:Pane>
</x:Pane></x:Panes></x:WorksheetOptions>
</x:ExcelWorksheet></x:ExcelWorksheets></x:ExcelWorkbook>
</xml><![endif]-->
</head>

<body>

<%
	response.setContentType("application/vnd.ms-excel; charset=euc-kr");
 	response.setHeader("Content-Disposition", "filename=보상가산정.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>

<table width="804" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
  <tr>
    <td><table width="800" border="1" cellpadding="0" cellspacing="1" class="mapPopup" summary="" bordercolor="#bed6e1">
      <tr>
        <th width="70" scope="col">지번</th>
        <th width="70" scope="col">지목</th>
        <th width="100" scope="col">소유구분</th>
        <th width="100" scope="col">면적(m2)</th>
        <th width="170" scope="col">공시지가(원)<br />
          (2010.1.1기준)</th>
        <th scope="col">지가산정(원)</th>
      </tr>
      <c:forEach items="${rewardList}" var="list" varStatus="index"> 
      <tr>        
        <td>${list.JIBUN}</td>
        <td>${list.CODEDESC}</td>
        <td>${list.OWNGUBUN}</td>
        <td>${list.AREA}</td>
        <td>${list.JIGA}</td>
        <td>${list.MAKEJIGA}</td>
      </tr>      
     </c:forEach>
   
    </table></td>
  </tr>
</table>
<table width="804" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td width="390" height="40" align="right"><strong>면적</strong></td>
    <td width="128" align="right">${sumArea}</td>
    <td width="140" align="right"><strong>보상용지지가 합산</strong> </td>
    <td width="128" align="right">${sumJiga}</td>
  </tr>
  <tr>
  	<td height="35" colspan="4" align="center" valign="bottom" class="t_org">*보상가 산정은 편입 토지에 대한 지가에 대한 합산으로 대략적인 금액만 산정해 볼 수 있습니다.</td>
  </tr>
</table>


</body>
</html>
