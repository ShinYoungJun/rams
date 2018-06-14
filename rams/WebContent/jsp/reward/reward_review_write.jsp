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
function goWritePrc(){

	document.form.action = '/rams/reward/reward_review_write_prc.do';
	document.form.submit();
	
	var isTrue = false;
	
	if(isTrue){
		if(confirm("등록 하시겠습니까?")){
			document.form.submit();
		}
	}

}

function goDown(filename,filepath){
	var url = "/rams/jsp/common/file_down.jsp?filename="+filename+"&filepath="+filepath;
	var form = document.form;
	form.action = url;
	form.submit();
}

function goDel(fileid){
	
	if(confirm("심의자료를 삭제하시겠습니까?")){
		document.form.action = '/rams/reward/reward_discuss_file_del.do?FILEID='+fileid;
		document.form.submit();
	}
	

}

</script>
</head>
<body>
<form name="form" method="post" action="/rams/reward/reward_review_write_prc.do" enctype="multipart/form-data">
<input type="hidden" name="PNU" value="${PNU }" />
<input type="hidden" name="INVESTID" value="${INVESTID }" />
<input type="hidden" name="COMPEID" value="${COMPEID }" />

<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="../images/suit/home.gif" alt="home" border="0" /></a> > 보상용지 관리 <a href="#" class="blue1"></a> > <strong>보상 심의/사실조사</strong></td>
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


      
	  <h3><img src="../images/reward/st_rm.gif" alt="보상심의 및 사실조사 등록/수정" /></h3>
	  <!-- 신청자 -->
	  <h4><img src="../images/reward/sst_applicant.gif" alt="신청자" width="51" height="11" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">신청일자</th>
				<td width="274" class="cont">${reviewViewBean.REQDATE }</td>
				<th width="120" scope="col">심의일자 </th>
				<td class="cont">
					<table width="160" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="120"><input name="INVESTDATE" type="text" class="formBox1" value="${reviewViewBean.INVESTDATE }"/></td>
						<td class="cont"><img src="../images/suit/cal.gif" alt="달력" width="19" height="15" border="0" onclick="popUpCalendar(this,INVESTDATE,'yyyymmdd')" style="cursor:pointer;"/></a></td>
					  </tr>
					</table>
				</td>
			  </tr>
			  <tr>
				<th scope="col">신청인 주소</th>
				<td colspan="3" class="cont">${reviewViewBean.CP_ADDRESS }</td>
			  </tr>
			  <tr>
				<th scope="col">신청인 성명 </th>
				<td class="cont">${reviewViewBean.CP_NAME }</td>
				<th scope="col">연락처 </th>
				<td class="cont">${reviewViewBean.CP_TEL }</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  
	  
	  <!-- 토지 -->
	  <h4><img src="../images/suit/st_ground2.gif" alt="토지" width="41" height="11" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th scope="col">소재지번</th>
				<th scope="col">지목</th>
				<th scope="col">면적(㎡)</th>
				<th scope="col">근저당여부</th>
				<th scope="col">보상액</th>
				<th scope="col">비고</th>
			  </tr>
			  <tr>
				<td>${CompeViewbean.GU_NM}&nbsp;${CompeViewbean.BJ_NM}&nbsp;${CompeViewbean.BONBUN}-${CompeViewbean.BUBUN}</td>
				<td>${CompeViewbean.JIMOK}</td>
				<td>${CompeViewbean.AFFAIRAREA}</td>
				<td>${CompeViewbean.ISFIXED}</td>
				<td>${CompeViewbean.TOTPRICE}</td>
				<td>${CompeViewbean.ETC}</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  	  
	  <!-- 심의의결 결과관리 -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont2"><img src="../images/reward/sst_manage.gif" alt="심의의결 결과관리" width="101" height="11" /></th>
		  <td width="90" align="right" class="cont2"><!-- <a href="#"><img src="../images/reward/btn_see2.gif" alt="신청자료보기" border="0"/></a> --></td>
	    </tr>
	  </table>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">보상 여부</th>
				<td class="cont" >
					<table width="150" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="50"><input type="radio" name="COMPEYN" value="Y" <c:if test="${ reviewViewBean.COMPEYN eq 'Y'}">checked="checked"</c:if>/>가결</td>
						<td><input type="radio" name="COMPEYN" value="N" <c:if test="${ reviewViewBean.COMPEYN eq 'N'}">checked="checked"</c:if>/>부결</td>
					  </tr>
				  </table>
				</td>
			  </tr>
			  <tr>
				<th scope="col">보상부결사유 </th>
				<td class="cont" ><input name="REASON" type="text" class="formBox6" value="${reviewViewBean.REASON }"/></td>
			  </tr>
			  <tr>
				<th scope="col">의결서 등록 </th>
				<td class="cont" ><p>&nbsp;</p>
				  <table width="400" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="180"><input id="reviewFile" name="reviewFile" type="text" class="formBox6" readonly="readonly"/></td>
                    <td class="cont">
                    	<div style="background-image:url(/rams/images/common/btn_add4.gif);width:42px;height:19px;overflow:hidden;">
						 <input type="file" name="DISCUSS_FILE" style="border:0;background-color:white;width:62px;filter:alpha(opacity=0)" onchange="document.getElementById('reviewFile').value=this.value">
						</div>
						</td>
                  </tr>
                <c:forEach items="${reviewFileList}" var="reviewFileList">
                  <tr>
                    <td><a href="#" onclick="goDown('${reviewFileList.FILENAME}','${filePath}${discussPath}')">${reviewFileList.FILENAME}</a></td>
                    <td class="cont"><a href="#" onclick="goDel('${reviewFileList.FILEID}')"><img src="../images/common/btn_del5.gif" alt="삭제" width="42" height="19" border="0"/></a></td>
                  </tr>
			  	</c:forEach>
                </table>
			    <p>&nbsp;</p></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td height="34" align="right"><a href="#" onclick="goWritePrc();"><img src="/rams/images/common/btn_save.gif" alt="저장" width="62" height="19" border="0" class="cont2" /></a></td>
		  <td width="70" align="right"><a href="#" onclick="javascript:form.reset();"><img src="/rams/images/common/btn_cancel.gif" alt="취소" width="62" height="19" border="0" class="cont2" /></a></td>
		  <td width="70" align="right"><a href="/rams/reward/reward_review_list.do"><img src="/rams/images/common/btn_list2.gif" alt="목록" width="62" height="19" border="0" class="cont2" /></a></td>
		</tr>
      </table>
  </div>
  </div>
</div>
</form>
</body>
</html>
