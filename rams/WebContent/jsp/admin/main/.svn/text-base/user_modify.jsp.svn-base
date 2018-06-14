<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script type="text/javascript" src="/rams/js/calculation.js"></script>
<script type="text/javascript">
function checkAuthur(){
	var authur = '${view.AUTHURNAME}';
	for(var i = 0 ; i < authur.length ; i ++){
		checkAuthurForm(authur.substring(i,i+1));
	}
}
function checkAuthurForm(num){
	document.getElementsByName("AUTHUR")[num].checked = true;
}
function goUpdate(){
	if(!confirm("수정하시겠습니까??")){
        return;
    }
	
	var	result	= DataCheck();
	if(result	==	false)
		return;
	
	
	var form = document.form;
	form.action = "/rams/admin/user/user_modify_prc.do";
	form.submit();
}


function	DataCheck()
{
    var form 	= document.form;
    var	str		= "";
    if(form.USERNAME.value.length	< 1)
    {
        str	+= "이름를 입력하세요\n";
        alert(str);
        form.USERNAME.focus();
    }
    else if(form.PASS.value.length	< 1)
    {
        str	+= "패스워드를 입력하세요\n";
        alert(str);
        form.PASS.focus();
    }
    else if(form.PASS2.value.length	< 1 && form.PASS.value != form.PASS2.value)
    {
        str	+= "패스워드 확인을 입력하세요\n";
        alert(str);
        form.PASS2.focus();
    }
    else if(form.JUMINNUM1.value.length	< 6)
    {
        str	+= "주민번호를 입력하세요\n";
        alert(str);
        form.JUMINNUM1.focus();
    }
    else if(form.JUMINNUM2.value.length	< 7)
    {
        str	+= "주민번호를 입력하세요\n";
        alert(str);
        form.JUMINNUM2.focus();
    }
    else if(form.EMAIL.value.length	< 1)
    {
        str	+= "이메일을 입력하세요\n";
        alert(str);
        form.EMAIL.focus();
    }
	
    if(str	== "")
    {
        return	true;
    }

    return	false;
}


function init(){
	var msg = '${MSG}';
	if(msg != ''){
		alert(msg);
		opener.location.reload();
		window.close();
		return;
	}else{
		return;
	}
}

</script>
</head>
<body onload="init();checkAuthur();">
<form id='form' name='form' method='post'>
<input type="hidden" id="TARGET_ID" name="TARGET_ID" value="${TARGET_ID}"></input>
<div id="idReq">
	<h1><img src="/rams/images/manage/tt02.gif" alt="아이디신청" /></h1>
	<p class="t_org">* 사용자 정보를 변경하세요.</p>
	<table width="520" border="1" cellspacing="0" cellpadding="0" bordercolor="#d0e1e9" class="mapPopup">
	  <tr>
		<th width="150">소속기관</th>
		<td class="cont">
			${view.GU_NM}
		</td>
	  </tr>
	  <tr>
		<th>소속부서</th>
		<td class="cont"><input name="PART" id="PART" type="text" class="formBox6" value="${view.PART}" maxlength="10"/></td>
	  </tr>
	  <tr>
		<th>담당업무</th>
		<td class="cont"><input name="ASSIGNWORK" id="ASSIGNWORK" type="text" class="formBox6" value="${view.ASSIGNWORK}" maxlength="25"/></td>
	  </tr>
	  <tr>
		<th>사용자 권한</th>
		<td class="cont">
		<table>
		<tr>
		<td width="100" style="text-align:left;"><input type="checkbox" name="AUTHUR" value="0">관리자</input></td>
		<td width="100" style="text-align:left;"><input type="checkbox" name="AUTHUR" value="1">시유지 조회</input></td>
		<td width="100" style="text-align:left;"><input type="checkbox" name="AUTHUR" value="2">소송정보 관리</input></td>
		</tr>
		<tr>
		<td style="text-align:left;"><input type="checkbox" name="AUTHUR" value="3">보상용지 관리</input></td>
		<td style="text-align:left;"><input type="checkbox" name="AUTHUR" value="4">공사대장 조회</input></td>
		<td style="text-align:left;"><input type="checkbox" name="AUTHUR" value="5">의사결정 지원</input></td>
		</tr>
		</table>
		
		
		</td>
	  </tr>
	  <tr>
		<th>이 름 </th>
		<td class="cont"><input name="USERNAME" id="USERNAME" type="text" class="formBox6" value="${view.USERNAME}"  maxlength="10"/></td>
	  </tr>
	  <tr>
		<th>아이디</th>
		<td style="text-align:left;padding-left:10px">${view.USERID}</td>
	  </tr>
	  <tr>
		<th>패스워드</th>
		<td class="cont"><input name="PASS" id="PASS" type="password" class="formBox6" value="${view.PASS}"  maxlength="10"/></td>
	  </tr>
	  <tr>
		<th>패스워드 확인 </th>
		<td class="cont"><input name="PASS2"  id="PASS2" type="password" class="formBox6"  value=""  maxlength="10"/></td>
	  </tr>
	  <tr>
		<th>주민번호</th>
		<td class="cont"><input name="JUMINNUM1" id="JUMINNUM1"  type="text" class="formBox2" onkeydown='onlyNumberInput();' value="${view.JUMINNUM1}"  maxlength="6"/> - <input name="JUMINNUM2" id="JUMINNUM2" type="text" class="formBox2" onkeydown='onlyNumberInput();' value="${view.JUMINNUM2}"  maxlength="7"/></td>
	  </tr>
	  <tr>
		<th>전화번호</th>
		<td class="cont"><input name="TEL1" id="TEL1" type="text" class="formBox7" onkeydown='onlyNumberInput();' value="${view.TEL1}"  maxlength="4"/> - <input name="TEL2" id="TEL2" type="text" class="formBox7" onkeydown='onlyNumberInput();' value="${view.TEL2}" maxlength="4"/> - <input name="TEL3" id="TEL3" type="text" class="formBox7" onkeydown='onlyNumberInput();' value="${view.TEL3}" maxlength="4"/> &nbsp;내선: 
		  <input name="INLINENUM" id="INLINENUM" type="text" class="formBox7" onkeydown='onlyNumberInput();' value="${view.INLINENUM}" maxlength="4"/></td>
	  </tr>
	  <tr>
		<th>휴대폰번호</th>
		<td class="cont"><input name="MTEL1" id="MTEL1"  type="text" class="formBox7" onkeydown='onlyNumberInput();' value="${view.MTEL1}" maxlength="4"/> - <input name="MTEL2" id="MTEL2" type="text" class="formBox7" onkeydown='onlyNumberInput();' value="${view.MTEL2}" maxlength="4"/> - <input name="MTEL3" id="MTEL3" type="text" class="formBox7" onkeydown='onlyNumberInput();' value="${view.MTEL3}" maxlength="4"/></td>
	  </tr>
	  <tr>
		<th>E-mail</th>
		<td class="cont"><input name="EMAIL" id="EMAIL" type="text" class="formBox6" value="${view.EMAIL}" maxlength="50"/></td>
	  </tr>
  </table><table width="520" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="30" align="right" valign="bottom"><img src="/rams/images/common/btn_modify.gif" alt="수정" onclick='goUpdate();' style='cursor:hand;' width="62" height="19" border="0" /></td>
    <td align="right" valign="bottom" width="70"><a href="#" onclick="window.close();"><img src="/rams/images/common/btn_cancel.gif" alt="취소" border="0"/></a></td>
  </tr>
</table>
</div>
</form>
</body>
</html>
