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
<script type="text/javascript">
function goModify(){
	var form = document.form;
	form.action = "/rams/reward/reward_status_modify.do";
	form.submit();
}


function goCancel(){
	var isAcquire = document.getElementsByName("ISACQUIRE");
	for(var i = 0; i < isAcquire.length;i++ ){
		if(isAcquire[i].value == 'N'){
			isAcquire[i].checked = true;
		}else{
			isAcquire[i].checked = false;
		}
		
	}
	document.getElementById("ASSIGNDATE").value = "";
	document.getElementById("ETC").value = "";
}

function init(){
	var msg = '${MSG}';
	if(msg != ''){
		alert(msg);
		return;
	}else{
		return;
	}
}

</script>
</head>

<body onload="init()">
<form name="form" id="form" method="post">
<input type="hidden" id="COMPEID" name="COMPEID" value="${COMPEID}" />
<input type="hidden" id="PNU" name="PNU" value="${PNU}" />
<input type="hidden" id="JUMINNUM" name="JUMINNUM" value="${JUMINNUM}" />

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
	<div class="list"> 
	  <h3><img src="../images/reward/st_manage.gif" alt="보상용지 현황관리" /></h3>
	  
	  
	  <!-- 토지정보 -->
	  <h4><img src="../images/suit/st_ground.gif" alt="토지정보" width="60" height="11" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">대상자 성명 </th>
				<td width="274" class="cont">${rewardStatusView.JUMINNUM}</td>
				<th width="120" scope="col">주민번호</th>
				<td class="cont">&nbsp;</td>
			  </tr>
			  <tr>
				<th scope="col">고시번호</th>
				<td class="cont">${rewardStatusView.GOSIID}</td>
				<th scope="col">공사명</th>
				<td class="cont">${rewardStatusView.CONSTNAME}</td>
			  </tr>
			  <tr>
				<th scope="col">구분</th>
				<td class="cont" colspan="3">${rewardStatusView.GUBUN}</td>
			  </tr>
			  <tr>
				<th scope="col">토지</th>
				<td class="cont">${rewardStatusView.GU_NM}&nbsp;${rewardStatusView.BJ_NM}&nbsp;${rewardStatusView.BONBUN}-${rewardStatusView.BUBUN}</td>
				<th scope="col">지목</th>
				<td class="cont">${rewardStatusView.JIMOK}</td>
			  </tr>
			  <tr>
				<th scope="col">지적(㎡)</th>
				<td class="cont">${rewardStatusView.AFFAIRAREA}</td>
				<th scope="col">보상결정사유</th>
				<td class="cont">${rewardStatusView.REASON}</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  
	  <!-- 평가정보 -->
	  <h4><img src="../images/reward/sst_info2.gif" alt="평가정보" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">평가기관</th>
				<td width="274" class="cont">${rewardStatusView.OFFICENAME_1}</td>
				<th width="120" scope="col">단가</th>
				<td class="cont">${rewardStatusView.DANGA_1}</td>
			  </tr>
			  <tr>
				<th scope="col">금액</th>
				<td class="cont">${rewardStatusView.JUDGEPRICE_1}</td>
				<th scope="col">가격시점</th>
				<td class="cont">${rewardStatusView.POINTDATE_1}</td>
			  </tr>
			  <tr>
				<th scope="col">평가기관</th>
				<td class="cont">${rewardStatusView.OFFICENAME_2}</td>
				<th scope="col">단가</th>
				<td class="cont">${rewardStatusView.DANGA_2}</td>
			  </tr>
			  <tr>
				<th scope="col">금액</th>
				<td class="cont">${rewardStatusView.JUDGEPRICE_2}</td>
				<th scope="col">가격시점</th>
				<td class="cont">${rewardStatusView.POINTDATE_2}</td>
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
				<th width="120" scope="col">배정일자</th>
				<td width="274" class="cont">
					<table width="160" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="120"><input id="ASSIGNDATE" name="ASSIGNDATE" type="text" class="formBox1" value="${rewardStatusView.ASSIGNDATE}" /></td>
						<td class="cont"><img src="../images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,ASSIGNDATE,'yyyymmdd')" style="cursor:pointer;"/></td>
					  </tr>
					</table>
				</td>
				<th width="120" scope="col">취득보고</th>
				<td class="cont">
					<table width="150" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="55"><input type="radio" name="ISACQUIRE" value="N" ${ISACQUIRE_N}/>
						미보고</td>
						<td width="100"><input type="radio" name="ISACQUIRE" value="Y" ${ISACQUIRE_Y}/>
						보고</td>
					  </tr>
					</table>
				</td>
			  </tr>
			  <tr>
				<th scope="col">비고</th>
				<td colspan="3" class="cont"><input id="ETC" name="ETC" type="text" class="formBox8" value="${rewardStatusView.ETC}" /></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table> 
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td height="40" align="right"><a href="#" onclick="goModify();"><img src="../images/common/btn_save.gif" alt="저장" width="62" height="19" border="0" /></a></td>
		  <td width="70" align="right"><a href="#" onclick="goCancel();"><img src="../images/common/btn_cancel.gif" alt="취소" width="62" height="19" border="0"/></a></td>
		</tr>
	  </table>
	</div>
  </div>
</div>
</form>
</body>
</html>
