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
 	response.setHeader("Content-Disposition", "filename=����������.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="80" scope="col">��ȣ</th>
				<th width="100" scope="col">��ġ��</th>
				<th width="100" scope="col">�ѰǼ�</th>
				<th width="100" scope="col">����Ǽ�</th>
				<th width="100" scope="col">�̺���Ǽ�</th>
				<th width="150" scope="col">����(��)</th>
				<th width="183" scope="col">����ݾ�</th>
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
	   					�˻������ �����ϴ�.
	   				</td>
	   				</tr>
	   			</c:otherwise>
	   			</c:choose>

			</table>
</body>
</html>