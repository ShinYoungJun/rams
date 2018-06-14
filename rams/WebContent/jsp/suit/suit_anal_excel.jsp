<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<html xmlns:x="urn:schemas-microsoft-com:office:excel">
<head>
<title>::::: ����� �����������ý��� :::::</title>
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
 	response.setHeader("Content-Disposition", "filename=�Ҽ�������.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>
<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="138" rowspan="2" scope="col">${SEARCH_TYPE}</th>
				<th width="75" rowspan="2" scope="col">�ѰǼ�</th>
				<th width="75" rowspan="2" scope="col">�Ϸ�Ǽ�</th>
				<th width="75" rowspan="2" scope="col">����Ǽ�</th>
				<th width="450" colspan="6" scope="col">��&nbsp;&nbsp;��&nbsp;&nbsp;��&nbsp;&nbsp;��</th>
			  </tr>
			  <tr>
                <th width="75" scope="col">�¼�</th>
                <th width="75" scope="col">�м�</th>
                <th width="75" scope="col">ȭ�ذ��</th>
                <th width="75" scope="col">��������</th>
                <th width="75" scope="col">������</th>
                <th width="75" scope="col">��Ÿ</th>
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
	   					�˻������ �����ϴ�.
	   				</td>
	   				</tr>
	   			</c:otherwise>
	   			</c:choose>
			  
			</table>
</body>
</html>