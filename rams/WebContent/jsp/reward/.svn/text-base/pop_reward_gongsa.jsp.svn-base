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
function goSearch(){
	var form = document.form;
	form.action = "/rams/reward/reward_write.do";
	form.submit();
}

function goView(cNum,cName,cGoId,cId){

	opener.document.getElementById("CONSTNUM").value = cNum;
	opener.document.getElementById("CONSTNAME").value = cName;
	opener.document.getElementById("GOSIID").value = cGoId;
	opener.document.getElementById("COMPEID").value = cId;

	self.close();
}

function goWrite(){
	location.href = "/rams/reward/reward_write.do";
}
</script>
</head>

<body>
<form name="form" id="form" method="post">
<input id="currentPage" name="currentPage" type="hidden" value="${currentPage}"></input>
<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="500" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > 보상용지 관리 <a href="#" class="blue1"></a> > <strong>미불보상용지 </strong></td>
    </tr>
  </table>
  </div>
  
  <div>
    <h2><img src="/rams/images/reward/tt01.gif" alt="보상용지관리_미불보상용지" width="184" height="22" /></h2>
	
	<!-- 검색 박스
	<div>
	  <table width="700" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="5" height="50"><img src="/rams/images/suit/srch_bg1.gif" alt="." /></td>
		  <td background="/rams/images/suit/srch_bg2.gif" class="srch">
			  <table width="387" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td width="43" height="14" ><img src="/rams/images/suit/srch.gif" alt="검색"/></td>
				  <td width="335"><input id="SEARCH_VALUE" name="SEARCH_VALUE" type="text" class="formBox5" value="${SEARCH_VALUE}" /></td>
				  <td><a href="#" onclick="goSearch()"><img src="/rams/images/common/btn_srch3.gif" alt="검색" border="0" /></a></td>
				</tr>
			  </table>
		  </td>
		  <td width="5"><img src="/rams/images/suit/srch_bg3.gif" alt="."/></td>
		</tr>
	  </table>
	</div>
	<div class="list">
	 -->
	  <!-- 검색결과 -->
	  <table width="500" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="16" valign="top" class="t_org">※ 보상여부 선택으로 미불보상 용지 및 보상용지별 조회가 가능합니다. </td>
    <td align="right" valign="top" class="t_org"></td>
  </tr>
</table>

	  <table width="700" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="700" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">공사번호</th>
				<th width="60" scope="col">공사명</th>
				<th width="60" scope="col">고시번호</th>
			  </tr>
			  <c:forEach items="${list}" var="gonsaView">
			  <tr onmouseover="trMoouseOver(this)" onmouseout="trMoouseOut(this)" style="cursor:pointer" onclick="goView('${gonsaView.CONSTNUM}','${gonsaView.CONSTNAME}','${gonsaView.GOSIID}','${gonsaView.COMPEID}');">
				<td>${gonsaView.CONSTNUM}</td>
				<td>${gonsaView.CONSTNAME}</td>
				<td>${gonsaView.GOSIID}</td>
			  </tr>			  
			  </c:forEach>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="500" border="0" cellspacing="0" cellpadding="0">
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
