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
<script language="javascript" src="/rams/js/Ajax_request.js"></script>
<script type="text/javascript">
function goSearch(){
	var form = document.form;
	form.action = "/rams/reward/reward_anal_list.do";
	form.submit();
}

function goExcel(){
	var form = document.form;
	form.action = "/rams/reward/reward_anal_list_excel.do";
	form.submit();
}

function init(){
	changeSelectTag("SEARCH_TYPE",'${SEARCH_TYPE}');
	
}
</script>
</head>
<body onload="init();">
<form name="form" id="form" method="post">
<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > 보상용지 관리 <a href="#" class="blue1"></a> > <strong>통계</strong></td>
    </tr>
  </table>
  </div>
  
  <div>
    <h2><img src="/rams/images/reward/tt04.gif" alt="보상용지관리_통계"/></h2>
   
   
    <!-- 탭 메뉴 -->
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><a href="/rams/reward/reward_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image22','','/rams/images/reward/tab01_on.gif',1)"><img src="/rams/images/reward/tab01_off.gif" alt="미불보상용지" name="Image22" width="91" height="29" border="0" id="Image22" /></a></td>
          <td width="91"><a href="/rams/reward/reward_review_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image16','','/rams/images/reward/tab02_on.gif',1)"><img src="/rams/images/reward/tab02_off.gif" alt="보상심의/사실조사" name="Image16" width="91" height="29" border="0" id="Image16" /></a></td>
          <td width="91"><a href="/rams/reward/reward_status_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image19','','/rams/images/reward/tab03_on.gif',1)"><img src="/rams/images/reward/tab03_off.gif" alt="현황관리" name="Image19" width="91" height="29" border="0" id="Image19" /></a></td>
          <td width="91"><img src="/rams/images/reward/tab04_on.gif" alt="통계" /></td>
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
				  <td width="50" height="14" ><img src="/rams/images/suit/srch.gif" alt="검색"/></td>
				  <td width="140">
				  <select id="SEARCH_TYPE" name="SEARCH_TYPE" class="formBox1">
				  	<option value="0">신청일자</option>
				    <option value="1">조사서 등록일자</option>
				  </select>
				  </td>
				  <td width="120">
				  	<table><tr><td><input id="FROMDATE" name="FROMDATE" type="text" class="formBox2" value="${FROMDATE}"/></td>
					<td><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,FROMDATE,'yyyymmdd')" style="cursor:pointer;"/></td></tr></table>
				  </td>
				  <td width="20" align="center">~</td>
				  <td width="150">
					<table><tr><td><input id="TODATE" name="TODATE" type="text" class="formBox2" value="${TODATE}"/></td>
					<td><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,TODATE,'yyyymmdd')" style="cursor:pointer;"/></td></tr></table>
				  </td>
				  <td><a href="#" onclick="goSearch();"><img src="/rams/images/common/btn_srch3.gif" alt="검색" border="0" /></a></td>
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
	      <td height="25" class="t_org"></td>
		  <td align="right" valign="top"><a href="#" onclick="goExcel();"><img src="/rams/images/common/btn_print3.gif" alt="출력" width="62" height="19" border="0" /></a></td>
		</tr>
	  </table>

	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="80" scope="col">번호</th>
				<th width="100" scope="col">자치구</th>
				<th width="100" scope="col">총건수</th>
				<th width="100" scope="col">보상건수</th>
				<th width="100" scope="col">미보상건수</th>
				<th width="150" scope="col">면적(㎡)</th>
				<th width="183" scope="col">보상금액</th>
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
	   					검색결과가 없습니다.
	   				</td>
	   				</tr>
	   			</c:otherwise>
	   			</c:choose>

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
