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
function initSearchForm(){
	changeSelectTag('SEARCH_TYPE','${SEARCH_TYPE}');
}

function goSearch(){
	var form = document.form;
	form.action = "/rams/suit/suit_price_list.do";
	form.submit();
}

function goView(num,pnu){
	var form = document.form;
	form.action = "/rams/suit/suit_price_view.do?AFFAIRNUM="+num+"&PNU="+pnu;
	form.submit();
}




</script>
</head>
<body onload="initSearchForm();">
<form name="form" id="form" method="post">
<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > <a href="#" class="blue1">소송정보관리</a> > <strong>소가관리</strong></td>
    </tr>
  </table>
  </div>
  
  <!-- 검색 -->
  <div>
    <h2><img src="/rams/images/suit/tt02.gif" alt="소송정보관리_소가 관리" /></h2>	
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><a href="/rams/suit/suit_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image23','','/rams/images/suit/02tab01_on.gif',1)"><img src="/rams/images/suit/02tab01_off.gif" alt="소송정보" name="Image23" width="91" height="29" border="0" id="Image23" /></a></td>
          <td width="91"><img src="/rams/images/suit/02tab02_on.gif" alt="소가 관리" /></td>
          <td width="91"><a href="/rams/suit/suit_anal_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image14','','/rams/images/suit/02tab03_on.gif',1)"><img src="/rams/images/suit/02tab03_off.gif" alt="통계" name="Image14" border="0" id="Image14" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="5" height="50"><img src="/rams/images/suit/srch_bg1.gif" alt="." /></td>
		  <td background="/rams/images/suit/srch_bg2.gif" class="srch"><table width="787" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td width="30"><strong>검색</strong></td>
              <td width="130">
              <select id="SEARCH_TYPE" name="SEARCH_TYPE" class="formBox1">
              	<option value="1">사건번호</option>
              	<option value="2">원고명</option>
              </select>
              </td>
              <td width="135"><input id="SEARCH_VALUE" name="SEARCH_VALUE" type="text" class="formBox1" value="${SEARCH_VALUE}" /></td>
              <td><a href="#" onclick="goSearch();"><img src="/rams/images/common/btn_srch3.gif" alt="검색" width="44" height="17" border="0" /></a></td>
            </tr>
          </table></td>
		  <td width="5"><img src="/rams/images/suit/srch_bg3.gif" alt="."/></td>
		</tr>
	  </table>
	</div>
    <div class="list">
	  <p class="t_org">※ 목록에서 사건번호 등을 클릭하시면 소가에 해당하는 이율을 등록, 수정하실 수 있습니다. </p>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="100" scope="row">사건번호</th>
				<th scope="row">사건토지</th>
				<th width="90" scope="row">원고명</th>
				<th width="100" scope="row">이윤 합계(원) </th>
				<th width="100" scope="row">소가(원)</th>
				<th width="90" scope="row">업데이트 일자 </th>
				<th width="90" scope="row">등록일자</th>
			  </tr>
			<c:forEach items="${blist}" var="blist">
			<tr onmouseover="trMoouseOver(this)" onmouseout="trMoouseOut(this)" onclick="goView('${blist.AFFAIRNUM}','${blist.PNU}')" style="cursor:pointer" >
				<td>${blist.AFFAIRNUM}</td>
				<td>${blist.SUITLAND}</td>
				<td>${blist.NAME}</td>
				<td>${blist.SUM}</td>
				<td>${blist.LAWSUITPRICE}</td>
				<td>${blist.CHGDATE}</td>
				<td>${blist.REGISTDATE}</td>
			</tr>
			</c:forEach>

			</table>
		  </td>
		</tr>
	  </table>
	  
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	  	  <tr style="height:50px">
	  	  <td align="center" colspan="5">
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
