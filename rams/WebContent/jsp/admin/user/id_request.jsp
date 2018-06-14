<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: ����� �����������ý��� :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script type="text/javascript" src="/rams/js/calculation.js"></script>
<script type="text/javascript">
function init(){

	if('${msg}' != ''){
		alert('${msg}');
		window.close();
	}else{
		return;
	}
	
}
function goInsert(){
	
	var form = document.getElementById('fm');

	var	result	= DataCheck();

	if(result	==	false)
		return;
	
	form.action = '/rams/admin/user/idRequestPrc.do';
	form.submit();
	
}

function	DataCheck()
{
    var form 	= document.form;
    var	str		= "";
	// �⺻����
	
	
    if(document.getElementById('PART').value.length	< 1)    
    {
        str	+= "�ҼӺμ��� �Է��ϼ���\n";
        alert(str);
        document.getElementById('PART').focus();
    }
    else if(document.getElementById('ASSIGNWORK').value.length	< 1)
    {
        str	+= "�������� �Է��ϼ���\n";
        alert(str);
        document.getElementById('ASSIGNWORK').focus();
    }
    else if(document.getElementById('USERNAME').value.length	< 1)
    {
        str	+= "�̸��� �Է��ϼ���\n";
        alert(str);
        document.getElementById('USERNAME').focus();
    }
    else if(document.getElementById('USERID').value.length	< 1)
    {
        str	+= "���̵� �Է��ϼ���\n";
        alert(str);
        document.getElementById('USERID').focus();
    }
    else if(document.getElementById('PASS').value.length	< 4)
    {
        str	+= "�н����带 4�ڸ� �̻� �Է��ϼ��� \n";
        alert(str);
        document.getElementById('PASS').focus();
    }
    else if(document.getElementById('JUMINNUM1').value.length	< 6)
    {
        str	+= "�ֹι�ȣ�� �Է��ϼ���\n";
        alert(str);
        document.getElementById('JUMINNUM1').focus();
    }
    else if(document.getElementById('JUMINNUM2').value.length	< 7)
    {
        str	+= "�ֹι�ȣ�� �Է��ϼ���\n";
        alert(str);
        document.getElementById('JUMINNUM2').focus();
    }
    else if(document.getElementById('EMAIL').value.length	< 1)
    {
        str	+= "�̸����� �Է��ϼ���\n";
        alert(str);
        document.getElementById('EMAIL').focus();
    }
    else if(document.getElementById('PASS').value != document.getElementById('PASS2').value)
    {
        str	+= "�н����尡 �ٸ��ϴ�.\n";
        alert(str);
        document.getElementById('PASS').focus();
    }
    

    if(str	== "")
    {
        return	true;
    }

    return	false;
}
</script>
</head>
<body onload='init();'>
<div id="idReq">
	<h1><img src="/rams/images/login/t_idreq.gif" alt="���̵��û" width="520" height="20" /></h1>
	<p class="t_org">* ����� ������ �Է��ϼ���.</p>
	<form id='fm' name='fm' method='post'>
	<table width="520" border="1" cellspacing="0" cellpadding="0" bordercolor="#d0e1e9" class="mapPopup">
	  <tr>
		<th>��������</th>
		<td class="cont">
		${job}
		</td>
	  </tr>
	  
	  <tr>
		<th width="150">�Ҽӱ��</th>
		<td class="cont">
		${gu}
		</td>
	  </tr>
	  <tr>
		<th>�ҼӺμ�</th>
		<td class="cont"><input name="PART" id="PART" type="text" class="formBox6" value='${bean2.PART }' maxlength='15'/></td>
	  </tr>
	  <tr>
		<th>������</th>
	<td class="cont"><input name="ASSIGNWORK" id="ASSIGNWORK" type="text" class="formBox6" value='${bean2.ASSIGNWORK}' maxlength='15'/></td>
  </tr>	
  <tr>
		<th>�� �� </th>
		<td class="cont"><input name="USERNAME" id="USERNAME" type="text" class="formBox6" value='${bean2.USERNAME}' maxlength='15'/></td>
	  </tr>
	  <tr>
		<th>���̵�</th>
		<td class="cont"><input name="USERID" id="USERID" type="text" class="formBox6" value='${bean2.USERID}' maxlength='15'/></td>
	  </tr>
	  <tr>
		<th>�н�����</th>
		<td class="cont"><input name="PASS" id="PASS" type="password" class="formBox6" value='${bean2.PASS}' maxlength='15'/></td>
	  </tr>
	  <tr>
		<th>�н����� Ȯ�� </th>
		<td class="cont"><input name="PASS2"  id="PASS2" type="password" class="formBox6" value='${bean2.PASS2}' maxlength='15'/></td>
	  </tr>
	  <tr>
		<th>�ֹι�ȣ</th>
		<td class="cont"><input name="JUMINNUM1" id="JUMINNUM1"  type="text" class="formBox2" onkeydown='onlyNumberInput();' value='${bean2.JUMINNUM1}' maxlength='6'/> - <input name="JUMINNUM2" id="JUMINNUM2" type="text" class="formBox2" onkeydown='onlyNumberInput();' value='${bean2.JUMINNUM2}' maxlength='7'/></td>
	  </tr>
	  <tr>
		<th>��ȭ��ȣ</th>
		<td class="cont"><input name="TEL1" id="TEL1" type="text" class="formBox7" onkeydown='onlyNumberInput();' value='${bean2.TEL1}' maxlength='4'/> - <input name="TEL2" id="TEL2" type="text" class="formBox7" onkeydown='onlyNumberInput();'value='${bean2.TEL2}' maxlength='4'/> - <input name="TEL3" id="TEL3" type="text" class="formBox7" onkeydown='onlyNumberInput();' value='${bean2.TEL3}' maxlength='4'/> &nbsp;����: 
		  <input name="INLINENUM" id="INLINENUM" type="text" class="formBox7" onkeydown='onlyNumberInput();' value='${bean2.INLINENUM}'/></td>
	  </tr>
	  <tr>
		<th>�޴�����ȣ</th>
		<td class="cont"><input name="MTEL1" id="MTEL1"  type="text" class="formBox7" onkeydown='onlyNumberInput();' value='${bean2.MTEL1}' maxlength='4'/> - <input name="MTEL2" id="MTEL2" type="text" class="formBox7" onkeydown='onlyNumberInput();' value='${bean2.MTEL2}' maxlength='4'/> - <input name="MTEL3" id="MTEL3" type="text" class="formBox7" onkeydown='onlyNumberInput();' value='${bean2.MTEL3}' maxlength='4'/></td>
	  </tr>
	  <tr>
		<th>E-mail</th>
		<td class="cont"><input name="EMAIL" id="EMAIL" type="text" class="formBox6"  value='${bean2.EMAIL}'/></td>
	  </tr>
  </table><table width="520" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="30" align="right" valign="bottom"><img src="/rams/images/common/btn_input.gif" alt="�Է�" onclick='goInsert();' style='cursor:hand;' width="62" height="19" border="0" /></td>
    <td align="right" valign="bottom" width="70"><a href="#" onclick='window.close();'><img src="/rams/images/common/btn_cancel.gif" alt="���" border="0"/></a></td>
  </tr>
</table>
</form>

</div>
</body>
</html>
