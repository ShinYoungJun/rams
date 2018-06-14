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
	form.action = "/rams/reward/reward_list.do";
	form.submit();
}

function goView(num,pnu){
	var form = document.form;
	form.action = "/rams/reward/reward_view.do?COMPEID="+num+"&PNU="+pnu;
	form.submit();
	
}

function goWrite(){
	location.href = "/rams/reward/reward_write.do"
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
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > 보상용지 관리 <a href="#" class="blue1"></a> > <strong>미불보상용지 </strong></td>
    </tr>
  </table>
  </div>
  
  <div>
    <h2><img src="/rams/images/reward/tt01.gif" alt="보상용지관리_미불보상용지" width="184" height="22" /></h2>
   
   
    <!-- 탭 메뉴 -->
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><img src="/rams/images/reward/tab01_on.gif" alt="미불보상용지" width="91" height="29" /></td>
          <td width="91"><a href="/rams/reward/reward_review_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image16','','/rams/images/reward/tab02_on.gif',1)"><img src="/rams/images/reward/tab02_off.gif" alt="보상심의/사실조사" name="Image16" width="91" height="29" border="0" id="Image16" /></a></td>
          <td width="91"><a href="/rams/reward/reward_status_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image19','','/rams/images/reward/tab03_on.gif',1)"><img src="/rams/images/reward/tab03_off.gif" alt="현황관리" name="Image19" width="91" height="29" border="0" id="Image19" /></a></td>
          <td width="91"><a href="/rams/reward/reward_anal_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image20','','/rams/images/reward/tab04_on.gif',1)"><img src="/rams/images/reward/tab04_off.gif" alt="통계" name="Image20" width="91" height="29" border="0" id="Image20" /></a></td>
          <td width="91"><a href="/rams/reward/reward_own_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image20','','/rams/images/reward/tab05_on.gif',1)"><img src="/rams/images/reward/tab05_off.gif" alt="토지소유현황" name="Image19" width="91" height="29" border="0" id="Image20" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	
	<!-- 검색 박스 -->
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="5" height="50"><img src="/rams/images/suit/srch_bg1.gif" alt="." /></td>
		  <td background="/rams/images/suit/srch_bg2.gif" class="srch">
			  <table width="787" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td width="43" height="14" ><img src="/rams/images/suit/srch.gif" alt="검색"/></td>
				  <td width="635"><input id="SEARCH_VALUE" name="SEARCH_VALUE" type="text" class="formBox5" value="${SEARCH_VALUE}" /></td>
				  <td><a href="#" onclick="goSearch()"><img src="/rams/images/common/btn_srch3.gif" alt="검색" border="0" /></a></td>
				</tr>
			  </table>
		  </td>
		  <td width="5"><img src="/rams/images/suit/srch_bg3.gif" alt="."/></td>
		</tr>
	  </table>
	</div>
	<div class="list">
	  <!-- 검색결과 -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="16" valign="top" class="t_org">※ 보상여부 선택으로 미불보상 용지 및 보상용지별 조회가 가능합니다. </td>
    <td align="right" valign="top" class="t_org">${listCompenCount}/${listCount} 건</td>
  </tr>
</table>

	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">공사명</th>
				<th width="60" scope="col">자치구</th>
				<th width="60" scope="col">동명</th>
				<th width="60" scope="col">토지 상세<br/>(지번)</th>
				<th width="60" scope="col">지목</th>
				<th width="60" scope="col">면적(㎡)</th>
				<th width="60" scope="col">보상여부</th>
				<th scope="col">보상결정사유</th>
				<th width="80" scope="col">등록일자</th>
			  </tr>
			  <c:forEach items="${list}" var="rewardList">
			  <tr onmouseover="trMoouseOver(this)" onmouseout="trMoouseOut(this)" style="cursor:pointer" onclick="goView('${rewardList.COMPEID}','${rewardList.PNU}');">
				<td>${rewardList.CONSTNAME}</td>
				<td>${rewardList.GU_NM}</td>
				<td>${rewardList.BJ_NM}</td>
				<td>${rewardList.BONBUN}-${rewardList.BUBUN}</td>
				<td>${rewardList.JIMOK}</td>
				<td>${rewardList.AFFAIRAREA}㎡</td>
				<td>${rewardList.ISCOMPENSATE}</td>
				<td>${rewardList.REASON}</td>
				<td>${rewardList.REGISTDATE}</td>
			  </tr>			  
			  </c:forEach>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
	      <td height="26" align="right" valign="bottom"><a href="#" style="cursor:pointer" onclick="goWrite();"><img src="/rams/images/reward/btn_regi.gif" alt="미불보상용지등록" border="0"/></a></td>
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
