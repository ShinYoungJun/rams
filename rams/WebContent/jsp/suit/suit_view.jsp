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

function goLandPop(affairnum,pnu){
	
    window.open("/rams/suit/suit_land_pop.do?AFFAIRNUM="+affairnum+"&PNU="+pnu,'사건토지관리','toolbar=no,status=no,menubar=no,width=815,height=400');
}

function goLawsuitResultPop(affairnum){
	
    window.open("/rams/suit/suit_lawsuit_result_pop.do?AFFAIRNUM="+affairnum,'승패입력','toolbar=no,status=no,menubar=no,width=790,height=200');
}

function goNumChangePop(affairnum,pnu){
	
    window.open("/rams/suit/suit_num_change_pop.do?AFFAIRNUM="+affairnum+"&PNU="+pnu,'사건번호변경','toolbar=no,status=no,menubar=no,width=425,height=200');
}

function goModify(affairnum,pnu){
	var form = document.form;
	form.action = "/rams/suit/suit_modify.do?AFFAIRNUM="+affairnum+"&PNU="+pnu;
	form.submit();
}


function goSuitorPop(affairnum,gubun){
    window.open('/rams/suit/suit_suitor_pop.do?AFFAIRNUM='+affairnum+'&GUBUN='+gubun,'소송인관리','toolbar=no,status=no,menubar=no,width=817,height=400');
}

function goOwnerPop(affairnum,pnu){
    window.open('/rams/suit/suit_owner_pop.do?AFFAIRNUM='+affairnum+'&PNU='+pnu+'&ISFIXED=0','소유자관리','toolbar=no,status=no,menubar=no,width=817,height=400');
}


function goFilePop(affairnum,pnu){
    window.open('/rams/suit/suit_file_pop.do?AFFAIRNUM='+affairnum+'&PNU='+pnu,'제출자료관리','toolbar=no,status=no,menubar=no,width=817,height=400');
}

function goOwnerFixedPop(affairnum,pnu){
	window.open('/rams/suit/suit_owner_pop.do?AFFAIRNUM='+affairnum+'&PNU='+pnu+'&ISFIXED=1','근저당관리','toolbar=no,status=no,menubar=no,width=817,height=400');
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
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > <a href="#" class="blue1">소송정보관리</a> > <strong>소송정보</strong></td>
    </tr>
  </table>
  </div>
  
<!-- 탭 메뉴 -->
  <div>
    <h2><img src="/rams/images/suit/tt01.gif" alt="소송정보관리_소송정보" width="160" height="22" /></h2>
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><img src="/rams/images/suit/02tab01_on.gif" alt="소송정보" /></td>
          <td width="91"><a href="/rams/suit/suit_price_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image13','','/rams/images/suit/02tab02_on.gif',1)"><img src="/rams/images/suit/02tab02_off.gif" alt="소가관리" name="Image13" border="0" id="Image13" /></a></td>
          <td width="91"><a href="/rams/suit/suit_anal_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image14','','/rams/images/suit/02tab03_on.gif',1)"><img src="/rams/images/suit/02tab03_off.gif" alt="통계" name="Image14" border="0" id="Image14" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
	      <td height="35" align="left" valign="bottom" class="t_org">※ 수정버튼을 통해 사건 기본 정보 및 &quot;공사정보(공사대장, 고시)&quot;를 연결하실 수 있습니다.<br/>
          또한, 사건 번호가 틀린경우 &quot;사건번호변경&quot;버튼을 통해 입력된 사건을 복사하실 수 있습니다. </td>
		  <td align="right" valign="bottom"><a href="#" onclick="goModify('${view.AFFAIRNUM}','${view.PNU}');"><img src="/rams/images/common/btn_modify.gif" alt="수정" width="62" height="19" border="0" /></a></td>
		  <td width="70" align="right" valign="bottom"><a href="#" onclick="goLawsuitResultPop('${view.AFFAIRNUM}');"><img src="/rams/images/common/btn_input2.gif" alt="승패입력" border="0"/></a></td>
		  <td width="90" align="right" valign="bottom"><a href="#" onclick="goNumChangePop('${view.AFFAIRNUM}','${view.PNU}');"><img src="/rams/images/common/btn_change.gif" alt="사건번호변경" border="0"/></a></td>
		</tr>
	  </table>
	</div>
	<div >
	  <h4><img src="/rams/images/suit/st_basis.gif" alt="기본사항" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">구분</th>
				<td colspan="3" class="cont">${view.CALSS}</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">사건번호</th>
				<td width="286" class="cont">${view.AFFAIRNUM}</td>
				<th width="120" scope="row">사건 명 </th>
				<td class="cont">${view.AFFAIRNAME}</td>
			  </tr>
			  <tr>
				<th scope="row">사건토지</th>
				<td class="cont">
				    <table width="260" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td >${view.SUITLAND}</td>
						<td width="42"><a href="#" onclick="goLandPop('${view.AFFAIRNUM}','${view.PNU}');"><img src="/rams/images/common/btn_more.gif" alt="사건토지 더보기" border="0" /></a></td>
					  </tr>
					</table>
				</td>
				<th scope="row">공사번호/명 </th>
				<td class="cont">${view.CONSTNUM}&nbsp;/&nbsp;${view.CONSTNAME}</td>
			  </tr>
			  <tr>
				<th scope="row">담당재판부</th>
				<td class="cont">${view.JUDGMENT}</td>
				<th scope="row">법원 명 </th>
				<td class="cont">${view.COURT}</td>
			  </tr>
			  <tr>
				<th scope="row">변론종결일자</th>
				<td class="cont">${view.CLOSEDAY}</td>
				<th scope="row">접수일</th>
				<td class="cont">${view.ACCEPTDATE}</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>

	  
	<!-- 피고 -->
	<table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont"><img src="/rams/images/suit/st_defendant.gif" alt="피고" width="41" height="11" /></th>
		  <td align="right" class="cont"></td>
		  <td width="50" align="right" class="cont"><img src="/rams/images/common/btn_more.gif" onclick="goSuitorPop('${view.AFFAIRNUM}','2');" style="cursor:pointer;" alt="피고추가,삭제하기"/></td>
	    </tr>
	</table>
	<table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">성명</th>
				<td width="286" class="cont">${view.ST2_NAME}</td>
				<th width="120" scope="row">주민번호/연락처</th>
				<td class="cont">${view.ST2_JUMINNUM}&nbsp;/&nbsp;${view.ST2_TEL}</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">주소</th>
				<td colspan="3" class="cont">${view.ST2_ADDR}</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  <!-- 대리 -->
	  <h4><img src="/rams/images/suit/st_deputy.gif" alt="대리" width="41" height="11" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">구분</th>
				<th width="286" scope="row">소송대리인</th>
				<th scope="row">연락처</th>
				<th scope="row">비고</th>
			  </tr>
			  <tr>
				<td class="cont">피고</td>
				<td class="cont">${view.LP2_NAME}</td>
				<td class="cont">${view.LP2_TEL}</td>
				<td class="cont"></td>
			  </tr>
			  <tr>
				<td class="cont">원고</td>
				<td class="cont">${view.LP1_NAME}</td>
				<td class="cont">${view.LP1_TEL}</td>
				<td class="cont"></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  
	  <!-- 원고 -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont"><img src="/rams/images/suit/st_plaintiff.gif" alt="원고" width="41" height="11" /></th>
		  <td align="right" class="cont"></td>
		  <td width="50" align="right" class="cont"><img src="/rams/images/common/btn_more.gif" onclick="goSuitorPop('${view.AFFAIRNUM}','1');" style="cursor:pointer;" alt="원고 추가,삭제하기"/></td>
	    </tr>
	  </table>

	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">성명</th>
				<td width="286" class="cont">${view.ST1_NAME}</td>
				<th width="120" scope="row">주민번호/연락처</th>
				<td class="cont">${view.ST1_JUMINNUM}&nbsp;/&nbsp;${view.ST1_TEL}</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">주소</th>
				<td colspan="3" class="cont">${view.ST1_ADDR}</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  <!-- 소유 -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont"><img src="/rams/images/suit/st_possess.gif" alt="소유" width="41" height="11" /></th>
		  <td align="right" class="cont"><img src="/rams/images/common/btn_security.gif" alt="근저당관리" width="62" height="19" onclick="goOwnerFixedPop('${view.AFFAIRNUM}','${view.PNU}');" style="cursor:pointer;"/></td>
		  <td width="50" align="right" class="cont"><img src="/rams/images/common/btn_more.gif" onclick="goOwnerPop('${view.AFFAIRNUM}','${view.PNU}');" style="cursor:pointer;" alt="소유자 추가 삭제"/></td>
	    </tr>
	  </table>

	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">소유권자성명</th>
				<td width="286" class="cont">${view.ON_NAME}</td>
				<th width="120" scope="row">주민번호/연락처</th>
				<td class="cont">${view.ON_JUMINNUM}&nbsp;/&nbsp;${view.ON_TEL}</td>
			  </tr>
			  <tr>
				<th scope="row">주소</th>
				<td colspan="3" class="cont">${view.ON_ADDR}</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  <!-- 제출자료 -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont"><img src="/rams/images/suit/st_data.gif" alt="제출자료" /></th>
		  <td width="62" align="right" class="cont"><a href="#" onclick="goFilePop('${view.AFFAIRNUM}','${view.PNU}');"><img src="/rams/images/common/btn_data.gif" alt="제출자료" border="0"/></a></td>
	    </tr>
	  </table>
	  

	  
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
			<table width="813" border="0" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
			    <td width="813" valign="top" style="text-align:left;background-color:#ddecf2">
					<table width="796" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
					  <tr height="26px">
						<th width="120" scope="row">일자</th>
						<th width="270" scope="row">내용</th>
						<th width="287" scope="row">첨부파일</th>
						<th width="120" scope="row">자료종류</th>
					  </tr>
					</table>
			    </td>
			  </tr>
			  <tr>
			    <td width="813" valign="top">
			    <div id="mainDisplay2" style="width:813px;height:150px;overflow-y:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;"">
				<table width="796" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
				  <c:forEach items="${fileList}" var="fileList">
				  <tr>
					<td width="120" height="26px">${fileList.PRESENTDAY}</td>
					<td width="270" >${fileList.CONTENT}</td>
					<td width="286" ><a href="#" class="blue1" onclick="goDown('${fileList.FILENAME}','${filePath}${suitPath}')">${fileList.FILENAME}</a></td>
					<td width="120" >${fileList.FILECATEG}</td>
				  </tr>			  
				  </c:forEach>
				</table>
			    </div>
			    </td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  <!-- 심급 -->
	  <h4><img src="/rams/images/suit/st_sim2.gif" alt="심급" width="41" height="11" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">법원</th>
				<th width="286" scope="row">사건번호</th>
				<th width="120" scope="row">판결결과</th>
				<th scope="row">판결선고일자</th>
			  </tr>
			  <tr>
				<td class="cont">${view.PRE_COURT}</td>
				<td class="cont">${view.PRE_AFFAIRNUM}</td>
				<td class="cont">${view.PRE_OUTCOME}</td>
				<td class="cont">${view.PRE_ANNOUNCEDATE}</td>
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
