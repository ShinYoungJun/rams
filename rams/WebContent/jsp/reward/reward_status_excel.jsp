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
 	response.setHeader("Content-Disposition", "filename=������Ȳ��������.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>
 			<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="80" scope="col">��ȣ</th>			  
				<th scope="col">����</th>
				<th width="100" scope="col">��ġ��</th>
				<th width="100" scope="col">����</th>
				<th width="150" scope="col">������(����)</th>
				<th width="80" scope="col">����(��)</th>
				<th width="150" scope="col">��������</th>
				<th width="100" scope="col">��������</th>
				<th width="80" scope="col">��溸��</th>
				<th width="80" scope="col">���</th>
				<th width="100" scope="col">�������</th>
			  </tr>
			  <c:choose>
			  <c:when test="${list!= null && !empty list}">
			  <c:forEach items="${list}" var="statusList" varStatus="idx">
			  <tr>
			  <td class="txt_type">${idx.count}</td>
				<td style="mso-number-format:'\@'" >${statusList.GUBUN}</td>
				<td style="mso-number-format:'\@'" >${statusList.GU_NM}</td>
				<td style="mso-number-format:'\@'" >${statusList.BJ_NM}</td>
				<td style="mso-number-format:'\@'" >${statusList.BONBUN}-${statusList.BUBUN}</td>
				<td style="mso-number-format:'\@'" >${statusList.AFFAIRAREA}��</td>
				<td style="mso-number-format:'\@'" >${statusList.JUMINNUM}</td>
				<td style="mso-number-format:'\@'" >${statusList.ASSIGNDATE}</td>
				<td style="mso-number-format:'\@'" >${statusList.ISACQUIRE}</td>
				<td style="mso-number-format:'\@'" >${statusList.ETC}</td>
				<td style="mso-number-format:'\@'" >${statusList.REGISTDATE}</td>
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