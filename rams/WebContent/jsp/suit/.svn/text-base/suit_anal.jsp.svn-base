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
	form.action = "/rams/suit/suit_anal_list.do";
	form.submit();
}

function goExcel(){
	var form = document.form;
	form.action = "/rams/suit/suit_anal_list_excel.do";
	form.submit();
}

</script>
</head>
<body>
<form name="form" id="form" method="post">
<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > <a href="#" class="blue1">소송정보관리</a> > <strong>통계</strong></td>
    </tr>
  </table>
  </div>
  
  <!-- 검색 -->
  <div>
    <h2><img src="/rams/images/suit/tt03.gif" alt="소송정보관리_통계"/></h2>	
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><a href="/rams/suit/suit_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image22','','/rams/images/suit/02tab01_on.gif',1)"><img src="/rams/images/suit/02tab01_off.gif" alt="소송정보" name="Image22" width="91" height="29" border="0" id="Image22" /></a></td>
          <td width="91"><a href="/rams/suit/suit_price_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image13','','/rams/images/suit/02tab02_on.gif',1)"><img src="/rams/images/suit/02tab02_off.gif" alt="소가관리" name="Image13" border="0" id="Image13" /></a></td>
          <td width="91"><img src="/rams/images/suit/02tab03_on.gif" alt="통계" /></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="5" height="50"><img src="/rams/images/suit/srch_bg1.gif" alt="." /></td>
		  <td background="/rams/images/suit/srch_bg2.gif" class="srch">
			  <table width="787" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td width="60" height="14" ><img src="/rams/images/suit/srch.gif" alt="검색"/></td>
				  <td width="20"><input type="radio" name="SEARCH_TYPE" value="GU" ${GU}/></td>
				  <td width="60">자치구별</td>
				  <td width="20"><input type="radio" name="SEARCH_TYPE" value="LINE" ${LINE}/></td>
				  <td width="70">노선별</td>
				  <td width="90">
				  </td>
				  <td width="125" align="right">
					<table><tr><td><input id="FROMDATE" name="FROMDATE" type="text" class="formBox2" value="${FROMDATE}"/></td>
					<td><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,FROMDATE,'yyyymmdd')" style="cursor:pointer;"/></td></tr></table>
			  	  </td>
				  <td width="20" align="center"> ~ </td>
				  <td width="125">
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
	  <h3><img src="/rams/images/suit/st_present.gif" alt="소송 현황" /></h3>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td height="30" class="t_org"></td>
	      <td align="right"><a href="#" onclick="goExcel();"><img src="/rams/images/common/btn_print3.gif" alt="대장출력" border="0"/></a></td>
		</tr>
	  </table>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="138" rowspan="2" scope="col">${SEARCH_TYPE}</th>
				<th width="75" rowspan="2" scope="col">총건수</th>
				<th width="75" rowspan="2" scope="col">완료건수</th>
				<th width="75" rowspan="2" scope="col">진행건수</th>
				<th width="450" colspan="6" scope="col">판&nbsp;&nbsp;결&nbsp;&nbsp;결&nbsp;&nbsp;과</th>
			  </tr>
			  <tr>
                <th width="75" scope="col">승소</th>
                <th width="75" scope="col">패소</th>
                <th width="75" scope="col">화해경고</th>
                <th width="75" scope="col">강제조정</th>
                <th width="75" scope="col">소취하</th>
                <th width="75" scope="col">기타</th>
			  </tr>
	   			<c:choose>
	   			<c:when test="${blist!= null && !empty blist}">
	   			<c:forEach items="${blist}" var="blist">
	   			<tr>
	   				<td>${blist.TYPE_DATA}</td>
	   				<td>${blist.TOTAL_COUNT}</td>
	   				<td>${blist.CLOSE_COUNT}</td>
	   				<td>${blist.CONTINUE_COUNT}</td>
	   				<td>${blist.COUNT_R1}</td>
	   				<td>${blist.COUNT_R2}</td>
	   				<td>${blist.COUNT_R3}</td>
	   				<td>${blist.COUNT_R4}</td>
	   				<td>${blist.COUNT_R5}</td>
	   				<td>${blist.COUNT_R6}</td>
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
		  </td>
		</tr>
	  </table>
    </div>
  </div>
</div>
</form>
</body>
</html>
