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
function init(){
	var msg = '${MSG}';
	if(msg != ''){
		alert(msg);
		return;
	}else{
		return;
	}
}

function goDown(filename,filepath){
	var url = "/rams/jsp/common/file_down.jsp?filename="+filename+"&filepath="+filepath;
	var form = document.form;
	form.action = url;
	form.submit();
}

function goMody(num,pnu){
	var form = document.form;
	form.action = "/rams/reward/reward_view_mody.do?COMPEID="+num+"&PNU="+pnu;
	form.submit();
}

function goFilePop(compeId,pnu){
	window.open('/rams/reward/reward_file_pop.do?COMPEID='+compeId+'&PNU='+pnu,'관련자료관리','toolbar=no,status=no,menubar=no,width=437,height=400');
}


function goLandPop(compeid,pnu){
	
    window.open("/rams/reward/pop_reward_land.do?COMPEID="+compeid+"&PNU="+pnu,'보상토지관리','toolbar=no,status=no,menubar=no,width=815,height=400');
}

function goRightPop(compeid){
	popWindow('/rams/reward/pop_reward_right.do?COMPEID='+compeid,'gonsaPop','800','500','no','no');
//	window.open('/rams/reward/pop_reward_gongsa.do', 'gonsaPop', 'top=100px, left=100px, height=500px, width=800px');
}

</script>
</head>

<body onload="init();">
<form name="form" id="form" method="post">
<iframe id="fileDown" style="visibility:hidden;" src="" width="1" height="1"></iframe>
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
	
	<div class="list">
	  <h3><img src="/rams/images/reward/st_info.gif" alt="미불 보상용지 상세정보" /></h3>
	  
	  
	  <!-- 토지정보 -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont2"><img src="/rams/images/suit/st_ground.gif" alt="토지정보" width="60" height="11" /></th>
		  <td align="right" class="cont2"><!-- 
		  <a href="#" onclick="goRightPop('${compeView.COMPEID}');"><img src="/rams/images/reward/btn_see.gif" alt="권리권자정보보기" width="100" height="19" border="0" /></a>
		   -->
		  </td>
	    </tr>
	  </table>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">고시(관보)</th>
				<td width="274" class="cont">${compeView.GOSIID}</td>
				<th width="120" scope="col">공사대장</th>
				<td class="cont">&nbsp;${compeView.CONSTNUM}</td>
			  </tr>			  
			  <tr>
				<th width="120" scope="col">토지상황</th>
				<td width="274" class="cont">&nbsp;</td>
				<th width="120" scope="col">출처</th>
				<td width="289" class="cont">&nbsp;</td>
			  </tr>
			  <tr>
				<th scope="col">토지</th>
				<td class="cont">${compeView.GU_NM}&nbsp;${compeView.BJ_NM}&nbsp;${compeView.BONBUN}-${compeView.BUBUN}&nbsp;&nbsp;<a href="#" onclick="goLandPop('${compeView.COMPEID}','${compeView.PNU}');"><img src="/rams/images/common/btn_more.gif" alt="사건토지 더보기" border="0" align="absmiddle"/></a>

				</td>
				<th scope="col">지목</th>
				<td class="cont">${compeView.JIMOK}</td>
			  </tr>
			  <tr>
				<th scope="col">지적(㎡)</th>
				<td class="cont">${compeView.AFFAIRAREA}</td>
				<th scope="col">보상결정사유</th>
				<td class="cont">&nbsp;${compeView.REASON}</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  
	  <!-- 평가정보 -->
	  <h4><img src="/rams/images/reward/sst_info2.gif" alt="평가정보" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">평가기관</th>
				<td width="274" class="cont">${compeView.OFFICENAME_1}</td>
				<th width="120" scope="col">단가</th>
				<td class="cont">${compeView.DANGA_1}</td>
			  </tr>
			  <tr>
				<th scope="col">금액</th>
				<td class="cont">${compeView.JUDGEPRICE_1}</td>
				<th scope="col">가격시점</th>
				<td class="cont">${compeView.POINTDATE_1}</td>
			  </tr>
			  <tr>
				<th scope="col">평가기관</th>
				<td class="cont">${compeView.OFFICENAME_2}</td>
				<th scope="col">단가</th>
				<td class="cont">${compeView.DANGA_2}</td>
			  </tr>
			  <tr>
				<th scope="col">금액</th>
				<td class="cont">${compeView.JUDGEPRICE_2}</td>
				<th scope="col">가격시점</th>
				<td class="cont">${compeView.POINTDATE_2}</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  
	  <!-- 감정평가 -->
	  <h4><img src="/rams/images/reward/sst_test.gif" alt="감정평가" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th WIDTH="150" scope="col">소재지</th>
				<th width="80" scope="col">지목</th>
				<th width="80" scope="col">지적(㎡)</th>
				<th width="80" scope="col">단가</th>
				<th width="80" scope="col">금액</th>
				<th scope="col">보상결정사유</th>
			  </tr>
			  <tr>
				<td>${compeView.GU_NM}&nbsp;${compeView.BJ_NM}&nbsp;${compeView.BONBUN}-${compeView.BUBUN}</td>
				<td>${compeView.JIMOK}</td>
				<td>${compeView.AFFAIRAREA}</td>
				<td>${compeView.UNITPRICE}</td>
				<td>${compeView.TOTPRICE}</td>
				<td>${compeView.REASON}</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  
	  <h4></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">신청자 성명 </th>
				<td width="274" class="cont">${compeView.NAME}</td>
				<th width="120" scope="col">주민번호</th>
				<td class="cont">${compeView.JUMINNUM}</td>
			  </tr>
			  <tr>
				<th scope="col">주소</th>
				<td colspan="3" class="cont">${compeView.ADDRESS}</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  
	  <!-- 평가정보 -->
	  
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont"><h4><img src="/rams/images/reward/sst_data.gif" alt="관련자료" width="60" height="11" /></h4></th>
		  <td width="62" align="right" class="cont"><a href="#" onclick="goFilePop('${compeView.COMPEID}','${compeView.PNU}');"><img src="/rams/images/common/btn_add5.gif" alt="제출자료" border="0"/></a></td>
	    </tr>
	  </table>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
		  	<c:forEach items="${compeFileList}" var="compeFileList">
		  	  <tr>
				<td class="cont"><a href="#" class="blue1" onclick="goDown('${compeFileList.FILENAME}','${filePath}${rewardPath}')">${compeFileList.FILENAME}</a></td>
			  </tr>
		  	</c:forEach>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td height="34" align="right" valign="bottom"><a href="#" style="cursor:pointer" onclick="goMody('${compeView.COMPEID}','${compeView.PNU}');"><img src="/rams/images/common/btn_modify.gif" alt="수정" width="62" height="19" border="0" /></a></td>
		  <td width="70" align="right" valign="bottom"><a href="/rams/reward/reward_list.do"><img src="/rams/images/common/btn_list2.gif" alt="목록" width="62" height="19" border="0" /></a></td>
		</tr>
	  </table>
    </div>
  </div>
</div>

</form>
</body>
</html>
