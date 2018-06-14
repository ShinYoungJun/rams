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
<script language="javascript" src="/rams/js/Ajax_request.js"></script>
<script type="text/javascript">

function init(){
	var form = document.form;
	
	var msg = '${MSG}';
	if(msg != ''){
		alert(msg);
		opener.location = "/rams/suit/suit_view.do?AFFAIRNUM="+form.AFFAIRNUM.value+"&PNU="+form.PNU.value;
		window.close();
		return;
	}else{
		return;
	}
}

function initForm(){
var form = document.form;
	
	var new_option;
	
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

function goSave(){
	
	if(!confirm("모든 관련정보에 사건번호가 변경됩니다. 변경하시겠습니까?")){
        return;
    }
	
	var	result	= DataCheck();
	if(result	==	false)
		return;
	
	var form = document.form;
	form.action = "/rams/suit/suit_num_change_prc.do";
	form.submit();
}


function	DataCheck()
{
    var form 	= document.form;
    var	str		= "";
	// 기본사항
	if(getValueSelectTag("AFFAIRNUM_1").length	< 1)    
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

    if(str	== "")
    {
        return	true;
    }

    return	false;
}


</script>
</head>
<body onload="init();initForm();">
<form name="form" id="form" method="post">
<input type="hidden" id="AFFAIRNUM" name="AFFAIRNUM" value="${AFFAIRNUM}"></input>
<input type="hidden" id="PNU" name="PNU" value="${PNU}"></input>
<div id="cont02">
	  <h3><img src="/rams/images/suit/st_plaintiff6.gif" alt="대상 토지 목록 조회"/></h3>
	  <!-- 기본사항 -->
	  <table width="425" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="420" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">원 사건번호</th>
				<td width="300" class="cont">
					${AFFAIRNUM}
				</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">변경 사건번호</th>
				<td width="300" class="cont">
					<select id="AFFAIRNUM_1" name="AFFAIRNUM_1" class="formBox2">
					</select>&nbsp;
					<select id="AFFAIRNUM_2" name="AFFAIRNUM_2" class="formBox2">
						<option value="">::선택::</option>
					</select>&nbsp;
					<input id="AFFAIRNUM_3" name="AFFAIRNUM_3" type="text" class="formBox2" onKeyDown="onlyNumberInput();" maxlength="12" />
				</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="425" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td height="30" align="right">
		  <a href="#" onclick="goSave();" ><img src="/rams/images/common/btn_chg.gif" alt="변경" width="62" height="19" border="0" /></a>
		  &nbsp;
		  <a href="#" onclick="window.close();"><img src="/rams/images/common/btn_cancel.gif" alt="취소" width="62" height="19" border="0" /></a></td>
		</tr>
	  </table>
</div>
</form>
</body>
</html>
