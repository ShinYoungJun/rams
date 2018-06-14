<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<style type="text/css">
<!--
#sM01 {
	position:absolute;
	left:275px;
	top:53px;
	width:331px;
	height:20px;
	z-index:1;
	visibility: hidden;
	padding-top:2px;
}
#sM02 {
	position:absolute;
	left:341px;
	top:53px;
	width:187px;
	height:20px;
	z-index:1;
	visibility: hidden;
	padding-top:2px;
}
#sM03 {
	position:absolute;
	left:400px;
	top:53px;
	width:331px;
	height:20px;
	z-index:1;
	visibility: hidden;
	padding-top:2px;
}
#sM05 {
	position:absolute;
	left:495px;
	top:53px;
	width:365px;
	height:20px;
	z-index:1;
	visibility: hidden;
	padding-top:2px;
}
.style1 {color: #0083cd}
-->
</style>
<script type="text/javascript" src="/rams/js/common.js"></script>
<script type="text/javascript">
//메인페이지 이동
function moveMenu(num,link){
	var authur = '${userAuthur}';
	
	if(authur != null & authur.indexOf(num) < 0){
		alert('사용자 권한이 없습니다.');
		return;
	}
	
	var _mainFrm = document.getElementById("main");
	_mainFrm.src = link;
}
//메인페이지 리사이즈
function iFrameResize(obj)
{
	var iFrm = obj;

	//width 추가 : 지도가 안 떠서 추가 다른 페이지에는 영향을 미치지 않는 것 같음 - 한웅 수정			
	var the_height = iFrm.contentWindow.document.body.scrollHeight+30;
	var the_width = iFrm.contentWindow.document.body.scrollWidth;
	
	iFrm.style.height = the_height;
	iFrm.style.width = the_width;
}


function logOut(){
	if(!confirm("로그아웃 하시겠습니까?")){
        return;
    }
	location.href="/rams/admin/user/logout.do";
	
}


</script>

</head>

<body>
	<div id="top">
	  <table width="874" border="0" cellspacing="0" cellpadding="0">
	    <tr>
			<th height="21" align="right" scope="row"><span class="style1">${userName}</span></th>
			<td width="85" align="left">님 환영합니다. </td>
			<td align="right" width="70"><a href="#" onclick="logOut();"><img src="/rams/images/common/logout.gif" alt="로그아웃" border="0" /></a></td>
			<td class="manage" width="95" align="right"><a href="#" onclick="moveMenu('0','/rams/admin/user/user_manager.do');" class="blue1">관리자</a>ㅣ<a href="#" class="blue1" onclick="moveMenu('','/rams/board/board_list.do');">게시판</a></td>
		</tr>
	  </table>
	  <table width="854" border="0" cellspacing="0" cellpadding="0">
	    <tr>
	      <td rowspan="2" scope="row" width="260" height="54"><img src="/rams/images/common/logo.gif" alt="서울시도로재산관리정보시스템" /></td>
	      <td><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image23','','/rams/images/common/mm01_on.gif',1)"><img src="/rams/images/common/mm01_off.gif" alt="시유지조회" name="Image23" width="107" height="33" border="0" id="Image23" onmouseover="MM_showHideLayers('sM01','','show')" onmouseout="MM_showHideLayers('sM01','','hide')" /></a></td>
	      <td><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image18','','/rams/images/common/mm02_on.gif',1)"><img src="/rams/images/common/mm02_off.gif" alt="소송정보관리" name="Image18" width="122" height="33" border="0" id="Image18" onmouseover="MM_showHideLayers('sM02','','show')" onmouseout="MM_showHideLayers('sM02','','hide')" /></a></td>
	      <td><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image4','','/rams/images/common/mm03_on.gif',1)"><img src="/rams/images/common/mm03_off.gif" alt="보상용지관리" name="Image4" width="123" height="33" border="0" id="Image4" onmouseover="MM_showHideLayers('sM03','','show')" onmouseout="MM_showHideLayers('sM03','','hide')" /></a></td>
	      <td><a href="#" onclick="moveMenu('4','/rams/gongsa/gongsa_list.do');" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image17','','/rams/images/common/mm04_on.gif',1)"><img src="/rams/images/common/mm04_off.gif" alt="공사대장 조회" name="Image17" width="129" height="33" border="0" id="Image17" /></a></td>
	      <td><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image7','','/rams/images/common/mm05_on.gif',1)"><img src="/rams/images/common/mm05_off.gif" alt="의사결정지원" name="Image7" width="113" height="33" border="0" id="Image7" onmouseover="MM_showHideLayers('sM05','','show')" onmouseout="MM_showHideLayers('sM05','','hide')" /></a></td>
	    </tr>
	    <tr>
	      <td colspan="5" class="subMenu">&nbsp;</td>
	    </tr>
	  </table>
	</div>	
	
	<div id="cont01">
	  <table width="854" border="0" cellspacing="0" cellpadding="0">
	  	<tr>
		  	<td>
		  		<iframe width="100%" height="100%" id="main" name="main" frameborder="0" scrolling="no" src="/rams/cityland/permiss_list.do" onload="iFrameResize(this)">
		  		</iframe>
		  	</td>
	  	</tr>
	  </table>
	</div>
	<div id="sM01" onmouseover="MM_showHideLayers('sM01','','show')" onmouseout="MM_showHideLayers('sM01','','hide')">
		<a href="#" class="blue1" onclick="moveMenu('1','/rams/cityland/permiss_list.do');">대부사용허가 </a>ㅣ 
		<a href="#" class="blue1" onclick="moveMenu('1','/rams/cityland/dis_list.do');">처분재산 </a>ㅣ 
		<a href="#" class="blue1" onclick="moveMenu('1','/rams/cityland/moodan_list.do');">무단점사용 </a>ㅣ 
		<a href="#" class="blue1" onclick="moveMenu('1','/rams/cityland/base_list.do');">재산정보</a>ㅣ
		<a href="#" class="blue1" onclick="moveMenu('1','/rams/cityland/history_list.do');">재산이력</a>
	</div>
	<div id="sM02" onmouseover="MM_showHideLayers('sM02','','show')" onmouseout="MM_showHideLayers('sM02','','hide')">
		<a href="#" class="blue1" onclick="moveMenu('2','/rams/suit/suit_list.do');">소송정보 </a>ㅣ 
		<a href="#" class="blue1" onclick="moveMenu('2','/rams/suit/suit_price_list.do');">소가관리 </a>ㅣ 
		<a href="#" class="blue1" onclick="moveMenu('2','/rams/suit/suit_anal_list.do');">통계</a>
	</div>
	<div id="sM03" onmouseover="MM_showHideLayers('sM03','','show')" onmouseout="MM_showHideLayers('sM03','','hide')">
		<a href="#" class="blue1" onclick="moveMenu('3','/rams/reward/reward_list.do');">미불보상용지 </a>ㅣ 
		<a href="#" class="blue1" onclick="moveMenu('3','/rams/reward/reward_review_list.do');">보상 심의/사실조사 </a>ㅣ 
		<a href="#" class="blue1" onclick="moveMenu('3','/rams/reward/reward_status_list.do');">현황관리 </a>ㅣ 
		<a href="#" class="blue1" onclick="moveMenu('3','/rams/reward/reward_anal_list.do');">통계</a>ㅣ  
		<a href="#" class="blue1" onclick="moveMenu('3','/rams/reward/reward_own_list.do');">토지소유현황</a>
	</div>
	<div id="sM05" onmouseover="MM_showHideLayers('sM05','','show')" onmouseout="MM_showHideLayers('sM05','','hide')">
		<a href="#" class="blue1" onclick="moveMenu('5','/rams/map/map.do?selectMap=juckji');">적지분석 </a>ㅣ 
		<a href="#" class="blue1" onclick="moveMenu('5','/rams/map/map.do?selectMap=unReward')">미불보상용지분석 </a>ㅣ 
		<a href="#" class="blue1" onclick="moveMenu('5','/rams/map/map.do?selectMap=suitBiz')">소송업무지원 </a>ㅣ 
		<a href="#" class="blue1" onclick="moveMenu('5','/rams/map/map.do?selectMap=reward')">보상업무지원</a>
	</div>


</body>

</html>

