<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script type="text/javascript">
</script>
</head>

<body>
<form name="form" id="form" method="post">
<input id="currentPage" name="currentPage" type="hidden" value="${currentPage}" />
<input id="ownGubun" name="ownGubun" type="hidden" value="${ownGubun}" />
<input id="SEARCH_VALUE" name="SEARCH_VALUE" type="hidden" value="${SEARCH_VALUE}" />

<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > 보상용지 관리 <a href="#" class="blue1"></a> > <strong>토지소유현황</strong></td>
    </tr>
  </table>
  </div>
  
  <div>
    <h2><img src="/rams/images/reward/tt05.gif" alt="토지소유현황"/></h2>

	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="80" scope="col">자치구</th>
				<th width="80" scope="col">동명</th>
				<th width="80" scope="col">상세지번</th>
				<th width="80" scope="col">소유권</th>
				<th width="260" scope="col">보고자/보고부서</th>
				<th width="160" scope="col">노선명</th>
			  </tr>
			  <c:forEach items="${blist}" var="ownList">
			  <tr>
				<td>${ownList.GU_NM}</td>
				<td>${ownList.BJ_NM}</td>
				<td>${ownList.BONBUN}-${ownList.BUBUN}</td>
				<td>${ownList.OWN}</td>
				<td>${ownList.REPORT}</td>
				<td>${ownList.ROADNAME}</td>
			  </tr>			  
			  </c:forEach>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
	      <td height="26" align="right" valign="bottom"></td>
		</tr>
		  <tr>
			<td height="30" align="center">
		  	  	<table border="0" cellpadding="0" cellspacing="0">
					<tr>
						${strPageDivideForm}
					</tr>
				</table>
			</td>
		  </tr>
	  </table>
    </div>
  </div>
</div>
</form>
</body>
</html>
