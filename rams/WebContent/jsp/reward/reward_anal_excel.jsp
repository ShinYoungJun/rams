<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
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
 	response.setHeader("Content-Disposition", "filename=보상통계대장.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="80" scope="col">번호</th>
				<th width="100" scope="col">자치구</th>
				<th width="100" scope="col">총건수</th>
				<th width="100" scope="col">보상건수</th>
				<th width="100" scope="col">미보상건수</th>
				<th width="150" scope="col">면적(㎡)</th>
				<th width="183" scope="col">보상금액</th>
			  </tr>
			  
			  <c:choose>
	   			<c:when test="${blist!= null && !empty blist}">
	   			<c:forEach items="${blist}" var="blist" varStatus="idx">
	   			<tr>
	   				<td>${idx.count}</td>
	   				<td>${blist.GU_NM}</td>
	   				<td>${blist.TOTAL_COMPE}</td>
	   				<td>${blist.COMPE}</td>
	   				<td>${blist.UN_COMPE}</td>
	   				<td>${blist.AREA}</td>
	   				<td>${blist.PRICE}</td>
	   			</tr>
	   			</c:forEach>
	   			</c:when>
	   			<c:otherwise>
	   				<tr>
	   				<td colspan="7" scope="col">
	   					검색결과가 없습니다.
	   				</td>
	   				</tr>
	   			</c:otherwise>
	   			</c:choose>

			</table>
</body>
</html>