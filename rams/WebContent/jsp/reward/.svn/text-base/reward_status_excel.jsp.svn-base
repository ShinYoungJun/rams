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
 	response.setHeader("Content-Disposition", "filename=보상현황관리대장.xls"); 
 	response.setHeader("Content-Description", "JSP Generated Data"); 
%>
 			<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="80" scope="col">번호</th>			  
				<th scope="col">구분</th>
				<th width="100" scope="col">자치구</th>
				<th width="100" scope="col">동명</th>
				<th width="150" scope="col">토지상세(지번)</th>
				<th width="80" scope="col">면적(㎡)</th>
				<th width="150" scope="col">보상대상자</th>
				<th width="100" scope="col">배정일자</th>
				<th width="80" scope="col">취득보고</th>
				<th width="80" scope="col">비고</th>
				<th width="100" scope="col">등록일자</th>
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
				<td style="mso-number-format:'\@'" >${statusList.AFFAIRAREA}㎡</td>
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
	   					검색결과가 없습니다.
	   				</td>
	   				</tr>
	   			</c:otherwise>
	   			</c:choose>
			</table>

</body>
</html>