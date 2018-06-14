<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script language="javascript" src="/rams/js/calculation.js"></script>
<script language="javascript" src="/rams/js/PopupCalendar.js"></script>
<script language="javascript" src="/rams/js/Ajax_request.js"></script>
<script type="text/javascript">


function initSearchForm(){
	var form = document.form;
	
	var new_option;
	
	var calss = document.getElementById("CALSS");
	
	<c:forEach items="${suitGubunList}" var="suitGubunList">
		if('${suitGubunList.CODEVALUE}' != ''){
			new_option = new Option('${suitGubunList.CODEDESC}','${suitGubunList.CODEVALUE}');
			calss.options.add(new_option);
		}
	</c:forEach>
	
	
	var affairnum2 = document.getElementById("AFFAIRNUM_2");
	
	<c:forEach items="${affairNum2List}" var="affairNum2List">
		if('${affairNum2List.CODEVALUE}' != ''){
			new_option = new Option('${affairNum2List.CODEDESC}','${affairNum2List.CODEVALUE}');
			affairnum2.options.add(new_option);
		}
	</c:forEach>
	
	var affairnum1 = document.getElementById("AFFAIRNUM_1");
	var year = new Date().getYear();
    for(var i=year-20;i<=year;i++){
		new_option = new Option(i+'년',i);
		if(new_option.value == year){
			new_option.selected = true;
		}
		affairnum1.options.add(new_option);
	}
    
}


function goDown(filename,filepath){
	var url = "/rams/jsp/common/file_down.jsp?filename="+filename+"&filepath="+filepath;
	var form = document.form;
	form.action = url;
	form.submit();
}


function goSave(){
	
	var	result	= DataCheck();

	if(result	==	false)
		return;
	
	
	var form = document.form;
	form.action = "/rams/suit/suit_after_reg_prc.do";
	form.submit();
	
}

function	DataCheck()
{
    var form 	= document.form;
    var	str		= "";
	// 기본사항
    if(getValueSelectTag("CALSS").length	< 1)    
    {
        str	+= "구분을 선택 하세요\n";
        alert(str);
        form.CALSS.focus();
    }
    else if(getValueSelectTag("AFFAIRNUM_1").length	< 1)    
    {
        str	+= "소송년도를 선택하세요\n";
        alert(str);
        form.AFFAIRNUM_1.focus();
    }
    else if(getValueSelectTag("AFFAIRNUM_2").length	< 1)    
    {
        str	+= "소송구분을 선택하세요\n";
        alert(str);
        form.AFFAIRNUM_2.focus();
    }
    else if(form.AFFAIRNUM_3.value.length	< 1)
    {
        str	+= "사건번호를 입력하세요\n";
        alert(str);
        form.AFFAIRNUM_3.focus();
    }
    else if(form.AFFAIRNAME.value.length	< 1)
    {
        str	+= "사건명을 입력하세요\n";
        alert(str);
        form.AFFAIRNAME.focus();
    }
    else if(form.JUDGMENT.value.length	< 1)
    {
        str	+= "담당재판부를 입력하세요\n";
        alert(str);
        form.JUDGMENT.focus();
    }
    else if(form.COURT.value.length	< 1)
    {
        str	+= "법원명을 선택하세요\n";
        alert(str);
        form.COURT.focus();
    }
    else if(form.ACCEPTDATE.value.length	< 1)
    {
        str	+= "접수일자를 선택하세요\n";
        alert(str);
        form.ACCEPTDATE.focus();
    }
    else if(form.CLOSEDAY.value.length	< 1)
    {
        str	+= "변경 종료일자를 선택하세요\n";
        alert(str);
        form.CLOSEDAY.focus();
    }

    if(str	== "")
    {
        return	true;
    }

    return	false;
}

function goCancel(){
	var form = document.form;
	form.action = "/rams/suit/suit_reg_init.do";
	form.submit();
}

</script>
</head>
<body onload="initSearchForm();">
<form name="form" id="form" method="post">
<input type="hidden" id="PRE_AFFAIRNUM" name="PRE_AFFAIRNUM" value="${PRE_AFFAIRNUM}"></input>
<input type="hidden" id="PRE_PNU" name="PRE_PNU" value="${PRE_PNU}"></input>
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
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><img src="/rams/images/suit/02tab01_on.gif" alt="소송정보" /></td>
          <td width="91"><a href="/rams/suit/suit_price_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image13','','/rams/images/suit/02tab02_on.gif',1)"><img src="/rams/images/suit/02tab02_off.gif" alt="소가관리" name="Image13" border="0" id="Image13" /></a></td>
          <td width="91"><a href="/rams/suit/suit_anal_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image14','','/rams/images/suit/02tab03_on.gif',1)"><img src="/rams/images/suit/02tab03_off.gif" alt="통계" name="Image14" border="0" id="Image14" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif"></td>
        </tr>
      </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
	      <td height="35" align="left" valign="bottom" class="t_org">※ 사건 번호는 수정할 수 없으니, 한번 더 확인 후 저장하세요.<br />※ 소송 정보 등록 후 기존의 소송자료를 필히 삭제하세요.</td>
		  <td width="70" align="right" valign="bottom"><a href="#" onclick="goSave();"><img src="/rams/images/common/btn_save.gif" alt="저장" border="0"/></a></td>
		  <td width="70" align="right" valign="bottom"><a href="#" onclick="goCancel();"><img src="/rams/images/common/btn_cancel.gif" alt="취소" border="0"/></a></td>
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
				<td width="286" class="cont">
					<select id="CALSS" name="CALSS" class="formBox4">
						<option value="">::선택::</option>
					</select>
				</td>
				<th width="120" scope="row">이전 사건번호</th>
				<td>${view.AFFAIRNUM}</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">사건번호</th>
				<td class="cont">
					<select id="AFFAIRNUM_1" name="AFFAIRNUM_1" class="formBox2">
					</select>&nbsp;
					<select id="AFFAIRNUM_2" name="AFFAIRNUM_2" class="formBox2">
						<option value="">::선택::</option>
					</select>&nbsp;
					<input id="AFFAIRNUM_3" name="AFFAIRNUM_3" type="text" class="formBox2" onKeyDown="onlyNumberInput();" maxlength="12" />
				</td>
				<th width="120" scope="row">사건 명 </th>
				<td class="cont"><input type="text" id="AFFAIRNAME" name="AFFAIRNAME" class="formBox4" maxlength="25" /></td>
			  </tr>
			  <tr>
				<th scope="row">담당재판부</th>
				<td class="cont"><input type="text" id="JUDGMENT" name="JUDGMENT" class="formBox4" maxlength="15" /></td>
				<th scope="row">법원 명 </th>
				<td class="cont"><input type="text" id="COURT" name="COURT" class="formBox4" maxlength="25" /></td>
			  </tr>
			  <tr>
				<th scope="row">접수일자</th>
				<td class="cont">
					<table width="190" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="152"><input id="ACCEPTDATE" name="ACCEPTDATE" type="text" class="formBox3" readonly="readonly" /></td>
						<td><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,ACCEPTDATE,'yyyymmdd')" style="cursor:pointer;"/></td>
					  </tr>
					</table>
				</td>
				<th scope="row">변론종결일자</th>
				<td class="cont">
					<table width="190" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="152"><input id="CLOSEDAY" name="CLOSEDAY" type="text" class="formBox3" readonly="readonly" /></td>
						<td><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,CLOSEDAY,'yyyymmdd')" style="cursor:pointer;"/></td>
					  </tr>
					</table>
					
				</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	<!-- 피고 -->
	<h4><img src="/rams/images/suit/st_defendant.gif" alt="피고" width="41" height="11" /></h4>
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
	  
	  <!-- 원고 -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont"><img src="/rams/images/suit/st_plaintiff.gif" alt="원고" width="41" height="11" /></th>
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
				<td class="cont">${view.ST2_JUMINNUM}&nbsp;/&nbsp;${view.ST1_TEL}</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">주소</th>
				<td colspan="3" class="cont">${view.ST1_ADDR}</td>
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
	  
	  <!-- 소유 -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont"><img src="/rams/images/suit/st_possess.gif" alt="소유" width="41" height="11" /></th>
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
	    </tr>
	  </table>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">일자</th>
				<th width="286" scope="row">내용</th>
				<th scope="row">첨부파일</th>
				<th width="120" scope="row">자료종류</th>
			  </tr>
			  <c:forEach items="${fileList}" var="fileList">
			  <tr>
				<td class="cont">${fileList.PRESENTDAY}</td>
				<td class="cont">${fileList.CONTENT}</td>
				<td class="cont"><a href="#" class="blue1" onclick="goDown('${fileList.FILENAME}','${filePath}${suitPath}')">${fileList.FILENAME}</a></td>
				<td class="cont">${fileList.FILECATEG}</td>
			  </tr>			  
			  </c:forEach>
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
