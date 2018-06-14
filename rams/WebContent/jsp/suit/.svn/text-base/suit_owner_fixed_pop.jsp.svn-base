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
function goDelete(ownerNum){
	if(!confirm("삭제하시겠습니까?")){
        return;
    }

	var form = document.form;
	form.action = "/rams/suit/suit_owner_pop_del.do?OWNERNUM="+ownerNum;
	form.submit();

}
function goSave(){
	
	if(!confirm("저장하시겠습니까?")){
        return;
    }
	
	var	result	= DataCheck();
	if(result	==	false)
		return;
	
	var form = document.form;
	form.action = "/rams/suit/suit_owner_pop_add.do";
	form.submit();

}

function	DataCheck()
{
    var form 	= document.form;
    var	str		= "";
    if(form.NAME.value.length	< 1)
    {
        str	+= "이름을 입력하세요\n";
        alert(str);
        form.NAME.focus();
    }
    else if(form.JUMINNUM_1.value.length	< 6)
    {
        str	+= "주민번호를 입력하세요\n";
        alert(str);
        form.JUMINNUM_1.focus();
    }
    else if(form.JUMINNUM_2.value.length	< 7)
    {
    	str	+= "주민번호를 입력하세요\n";
        alert(str);
        form.JUMINNUM_2.focus();
    }
    else if(form.ADDR.value.length	< 1)
    {
        str	+= "주소를 입력하세요\n";
        alert(str);
        form.ADDR.focus();
    }
    else if(form.TEL.value.length	< 1)
    {
        str	+= "연락처를 입력하세요\n";
        alert(str);
        form.TEL.focus();
    }
    else if(form.ETC.value.length	< 1)
    {
        str	+= "비고를 입력하세요\n";
        alert(str);
        form.ETC.focus();
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
		opener.location = "/rams/suit/suit_view.do?AFFAIRNUM="+form.AFFAIRNUM.value+"&PNU="+form.PNU.value;
		return;
	}else{
		return;
	}
}

</script>
</head>
<body onload="init();">
<form name="form" id="form" method="post">
<input type="hidden" id="AFFAIRNUM" name="AFFAIRNUM" value="${AFFAIRNUM}"></input>
<input type="hidden" id="PNU" name="PNU" value="${PNU}"></input>
<input type="hidden" id="ISFIXED" name="ISFIXED" value="${ISFIXED}"></input>
<div id="cont02">
	  <h3><img src="/rams/images/suit/st_manage.gif" alt="근저당 관리"/></h3>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="80" scope="col">근저당권자</th>
				<th width="130" scope="col">주민번호 / 법인번호</th>
				<th width="150" scope="col">주소</th>
				<th width="100" scope="col">연락처</th>
				<th width="80" scope="col">지분율(%)</th>
				<th scope="col">비고</th>
				<th width="70" scope="col">추가/삭제</th>
			  </tr>
			  
			  <c:forEach items="${blist}" var="blist">
			  <tr>
				<td>${blist.NAME}</td>
				<td>${blist.JUMINNUM}</td>
				<td>${blist.ADDR}</td>
				<td>${blist.TEL}</td>
				<td>${blist.OWNRATE}</td>
				<td>${blist.ETC}</td>
				<td><img src="/rams/images/common/btn_del3.gif" alt="삭제" width="62" height="19" onclick="goDelete('${blist.OWNERNUM}');" style="cursor:pointer;" /></td>
			  </tr>
	   		  </c:forEach>
	   		  	<tr>
	   		  		<td><input type="text" id="NAME" name="NAME" class="formBox7" maxlength="25" /></td>
					<td>
						<input id="JUMINNUM_1" name="JUMINNUM_1" type="text" class="formBox9"  onKeyDown="onlyNumberInput();" maxlength="6" />
						&nbsp;-&nbsp;
						<input id="JUMINNUM_2" name="JUMINNUM_2" type="text" class="formBox9"  onKeyDown="onlyNumberInput();" maxlength="7" />
					</td>
					<td><input type="text" id="ADDR" name="ADDR" class="formBox1" maxlength="50" /></td>
					<td><input id="TEL" name="TEL" type="text" class="formBox2" onKeyDown="onlyNumberInput();" maxlength="20" /></td>
					<td><input type="text" id="OWNRATE" name="OWNRATE" class="formBox9" onKeyDown="onlyNumberInput();" maxlength="6"/></td>
					<td><input type="text" id="ETC" name="ETC" class="formBox3" maxlength="100" /></td>
					<td><img src="/rams/images/common/btn_save.gif" alt="저장" width="62" height="19" border="0" style="cursor:pointer;" onclick="goSave();"/></td>
				</tr>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td height="30" align="right"><a href="#" onclick="window.close();"><img src="/rams/images/common/btn_close3.gif" alt="닫기" width="62" height="19" border="0" /></a></td>
		</tr>
	  </table>
</div>
</form>
</body>
</html>
