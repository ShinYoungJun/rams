<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script language="javascript" src="/rams/js/PopupCalendar.js"></script> 
<script language="javascript" src="/js/Ajax_request.js"></script>
<script type="text/javascript">
function goSearch(){
	
	var form = document.form;
	form.action = "/rams/reward/reward_status_list.do";
	form.submit();
	
}

function goExcel(){
	var form = document.form;
	form.action = "/rams/reward/reward_status_excel.do";
	form.submit();
}

function goView(compeId,pnu,juminNum){

	var form = document.form;
	form.action = "/rams/reward/reward_status_view.do?COMPEID="+compeId+"&PNU="+pnu+"&JUMINNUM="+juminNum;
	form.submit();
	
}

</script>
</head>

<body>
<form name="form" id="form" method="post">
<input type="hidden" name="currentPage" value="${currentPage }"/>
<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="../images/suit/home.gif" alt="home" border="0" /></a> > 보상용지 관리 <a href="#" class="blue1"></a> > <strong>현황관리</strong></td>
    </tr>
  </table>
  </div>
  
  <div>
    <h2><img src="../images/reward/tt03.gif" alt="보상용지관리_현황관리"/></h2>
   
   
    <!-- 탭 메뉴 -->
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><a href="/rams/reward/reward_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image22','','../images/reward/tab01_on.gif',1)"><img src="../images/reward/tab01_off.gif" alt="미불보상용지" name="Image22" width="91" height="29" border="0" id="Image22" /></a></td>
          <td width="91"><a href="/rams/reward/reward_review_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image23','','../images/reward/tab02_on.gif',1)"><img src="../images/reward/tab02_off.gif" alt="보상 심의/사실조사" name="Image23" width="91" height="29" border="0" id="Image23" /></a></td>
          <td width="91"><img src="../images/reward/tab03_on.gif" alt="현황관리" /></td>
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
				  <td width="45" height="14" ><img src="../images/suit/srch.gif" alt="검색"/></td>
				  <td width="97"><input id="FROMDATE" name="FROMDATE" type="text" class="formBox2" value="${FROMDATE}" /></td>
				  <td width="30"><img src="../images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,FROMDATE,'yyyymmdd')" style="cursor:pointer;"/></td>
				  <td width="17">~</td>
				  <td width="97"><input id="TODATE" name="TODATE" type="text" class="formBox2" value="${TODATE}"/></td>
				  <td width="70"><img src="../images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,TODATE,'yyyymmdd')" style="cursor:pointer;" /></td>
				  <td width="200"><input id="SEARCH_VALUE" name="SEARCH_VALUE" type="text" class="formBox6" value="${SEARCH_VALUE}" /></td>
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
	      <td height="30" valign="top" class="t_org">※ 개인별 보상여부에 대해 관리하는 화면입니다.<br />
          특정 기간의 보상현황 대장이 필요하시면 [대장출력] 버튼을 이용하세요.</td>
		  <td align="right"><a href="#" onclick="goExcel();"><img src="../images/common/btn_print2.gif" alt="대장출력" border="0" /></a></td>
		</tr>
	  </table>

	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th scope="col">구분</th>
				<th width="80" scope="col">자치구</th>
				<th width="80" scope="col">동명</th>
				<th width="100" scope="col">토지상세(지번)</th>
				<th width="80" scope="col">면적(㎡)</th>
				<th width="80" scope="col">보상대상자</th>
				<th width="80" scope="col">배정일자</th>
				<th width="80" scope="col">취득보고</th>
				<th width="80" scope="col">비고</th>
				<th width="80" scope="col">등록일자</th>
			  </tr>
			  <c:forEach items="${list}" var="statusList">
			  <tr onmouseover="trMoouseOver(this)" onmouseout="trMoouseOut(this)" style="cursor:pointer" onclick="goView('${statusList.COMPEID}','${statusList.PNU}','${statusList.JUMINNUM}');">
				<td>${statusList.GUBUN}</td>
				<td>${statusList.GU_NM}</td>
				<td>${statusList.BJ_NM}</td>
				<td>${statusList.BONBUN}-${statusList.BUBUN}</td>
				<td>${statusList.AFFAIRAREA}㎡</td>
				<td>${statusList.JUMINNUM}</td>
				<td>${statusList.ASSIGNDATE}</td>
				<td>${statusList.ISACQUIRE}</td>
				<td>${statusList.ETC}</td>
				<td>${statusList.REGISTDATE}</td>
			  </tr>			  
			  </c:forEach>

			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
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
