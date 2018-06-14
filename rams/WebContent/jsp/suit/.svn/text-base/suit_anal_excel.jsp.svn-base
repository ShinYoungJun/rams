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
 	response.setHeader("Content-Disposition", "filename=소송통계대장.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>
<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="138" rowspan="2" scope="col">${SEARCH_TYPE}</th>
				<th width="75" rowspan="2" scope="col">총건수</th>
				<th width="75" rowspan="2" scope="col">완료건수</th>
				<th width="75" rowspan="2" scope="col">진행건수</th>
				<th width="450" colspan="6" scope="col">판&nbsp;&nbsp;결&nbsp;&nbsp;결&nbsp;&nbsp;과</th>
			  </tr>
			  <tr>
                <th width="75" scope="col">승소</th>
                <th width="75" scope="col">패소</th>
                <th width="75" scope="col">화해경고</th>
                <th width="75" scope="col">강제조정</th>
                <th width="75" scope="col">소취하</th>
                <th width="75" scope="col">기타</th>
			  </tr>
	   			<c:choose>
	   			<c:when test="${blist!= null && !empty blist}">
	   			<c:forEach items="${blist}" var="blist">
	   			<tr>
	   				<td>${blist.TYPE_DATA}</td>
	   				<td>${blist.TOTAL_COUNT}</td>
	   				<td>${blist.CLOSE_COUNT}</td>
	   				<td>${blist.CONTINUE_COUNT}</td>
	   				<td>${blist.COUNT_R1}</td>
	   				<td>${blist.COUNT_R2}</td>
	   				<td>${blist.COUNT_R3}</td>
	   				<td>${blist.COUNT_R4}</td>
	   				<td>${blist.COUNT_R5}</td>
	   				<td>${blist.COUNT_R6}</td>
	   			</tr>
	   			</c:forEach>
	   			</c:when>
	   			<c:otherwise>
	   				<tr>
	   				<td colspan="10" scope="col">
	   					검색결과가 없습니다.
	   				</td>
	   				</tr>
	   			</c:otherwise>
	   			</c:choose>
			  
			</table>
</body>
</html>