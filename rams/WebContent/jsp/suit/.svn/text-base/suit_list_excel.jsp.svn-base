<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
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
 	response.setHeader("Content-Disposition", "filename=소송정보대장.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>
<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
  <tr>
	<th scope="col">사건번호</th>
	<th scope="col">사건명</th>
	<th scope="col">사건토지</th>
	<th scope="col">원고</th>
	<th scope="col">진행상황</th>
	<th scope="col">변론기일</th>
	<th scope="col">담당자</th>
	<th scope="col">접수일자</th>
  </tr>
  <c:forEach items="${list}" var="suitlist">
  <tr>
	<td>${suitlist.AFFAIRNUM}</td>
	<td>${suitlist.AFFAIRNAME}</td>
	<td>${suitlist.SUITLAND}</td>
	<td>${suitlist.NAME}</td>
	<td>${suitlist.ANNOUNCE_YN}</td>
	<td>${suitlist.CLOSEDAY}</td>
	<td>${suitlist.USERNAME}</td>
	<td>${suitlist.ACCEPTDATE}</td>
  </tr>			  
  </c:forEach>
</table>
</body>
</html>