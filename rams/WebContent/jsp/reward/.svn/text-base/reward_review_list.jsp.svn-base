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
	form.action = "/rams/reward/reward_review_list.do";
	form.submit();
}

function goView(pnu,investid,compeid){
	var form = document.form;
	form.action = "/rams/reward/reward_review_write.do?PNU="+pnu+"&INVESTID="+investid+"&COMPEID="+compeid;
	form.submit();		
}
</script>
</head>
<body>
<form name="form" id="form" method="post">
<input id="currentPage" name="currentPage" type="hidden" value="${currentPage}"></input>
<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="../images/suit/home.gif" alt="home" border="0" /></a> > 보상용지 관리 <a href="#" class="blue1"></a> > <strong>보상 심의/사실조사 </strong></td>
    </tr>
  </table>
  </div>
  
  <div>
    <h2><img src="../images/reward/tt02.gif" alt="보상용지관리_미불보상용지"/></h2>
   
   
    <!-- 탭 메뉴 -->
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><a href="/rams/reward/reward_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image22','','../images/reward/tab01_on.gif',1)"><img src="../images/reward/tab01_off.gif" alt="미불보상용지" name="Image22" width="91" height="29" border="0" id="Image22" /></a></td>
          <td width="91"><img src="../images/reward/tab02_on.gif" alt="보상 심의/사실조사" /></td>
          <td width="91"><a href="/rams/reward/reward_status_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image19','','../images/reward/tab03_on.gif',1)"><img src="../images/reward/tab03_off.gif" alt="현황관리" name="Image19" width="91" height="29" border="0" id="Image19" /></a></td>
          <td width="91"><a href="/rams/reward/reward_anal_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image20','','../images/reward/tab04_on.gif',1)"><img src="../images/reward/tab04_off.gif" alt="통계" name="Image20" width="91" height="29" border="0" id="Image20" /></a></td>
          <td width="91"><a href="/rams/reward/reward_own_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image20','','/rams/images/reward/tab05_on.gif',1)"><img src="/rams/images/reward/tab05_off.gif" alt="토지소유현황" name="Image19" width="91" height="29" border="0" id="Image20" /></a></td>
          <td background="../images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	
	<!-- 검색 박스 -->
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="5" height="50"><img src="../images/suit/srch_bg1.gif" alt="." /></td>
		  <td background="../images/suit/srch_bg2.gif" class="srch">
			  <table width="787" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td width="43" height="14" ><img src="../images/suit/srch.gif" alt="검색"/></td>
				  <td width="635"><input name="SEARCH_VALUE" type="text" class="formBox5"  value="${SEARCH_VALUE}"/></td>
				  <td><a href="#" onclick="goSearch()"><img src="../images/common/btn_srch3.gif" alt="검색" border="0" /></a></td>
				</tr>
			  </table>
		  </td>
		  <td width="5"><img src="../images/suit/srch_bg3.gif" alt="."/></td>
		</tr>
	  </table>
	</div>
	
	
	<div class="list">
	
	
	  <!-- 검색결과 -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
	      <td height="16" valign="top" class="t_org">※ 보상 심의 및 사실조사 관련 이익을 관리하는 화면입니다. </td>
		</tr>
	  </table>

	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="60" scope="col">자치구</th>
				<th width="60" scope="col">통명</th>
				<th scope="col">지번</th>				
				<th width="100" scope="col">심의일자</th>
				<th width="60" scope="col">심의장소</th>
				<th width="80" scope="col">보상여부</th>
				<th width="80" scope="col">보상부결사유</th>
				<th width="80" scope="col">비고</th>
				<th width="80" scope="col">등록일자</th>
			  </tr>
			  <c:forEach items="${list}" var="reviewList">
			  <tr onmouseover="trMoouseOver(this)" onmouseout="trMoouseOut(this)" style="cursor:pointer" onclick="goView('${reviewList.PNU}','${reviewList.INVESTID}','${reviewList.COMPEID}');">
				<td>${reviewList.GU_NM}</td>
				<td>${reviewList.BJ_NM}</td>
				<td>${reviewList.BONBUN} - ${reviewList.BUBUN}</td>
				<td>${reviewList.INVESTDATE}</td>
				<td>${reviewList.INVESTPLACE}</td>
				<td>${reviewList.ISCOMPENSATE}</td>
				<td>${reviewList.REASON}</td>
				<td>${reviewList.ETC}</td>
				<td>${reviewList.REGISTDATE}</td>
			  </tr>			  
			  </c:forEach>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td height="30" align="center">
				<table width="139" border="0" cellspacing="0" cellpadding="0">
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
