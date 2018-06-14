<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: ����� �����������ý��� :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script language="javascript" src="/rams/js/PopupCalendar.js"></script> 
<script language="javascript" src="/rams/js/Ajax_request.js"></script>
<script type="text/javascript">
function goSave(){
	
	if(!confirm("�����Ͻðڽ��ϱ�?")){
        return;
    }
	
	var	result	= DataCheck();
	if(result	==	false)
		return;
	
	var form = document.form;
	form.action = "/rams/suit/suit_lawsuit_result_modify_pop.do";
	form.submit();
	
}

function	DataCheck()
{
    var form 	= document.form;
    var	str		= "";
	// �⺻����
	// ��������
	
	var _outcomeCheck = '';
	var _outcome = document.getElementsByName("OUTCOME");
	for(var i = 0 ; i < _outcome.length ; i++){
		if(_outcome[i].checked == true){
			_outcomeCheck = _outcome[i].value; 
		}
	}
	
	
    if(form.ANNOUNCEDATE.value.length	< 1)
    {
        str	+= "�������ڸ� �Է��ϼ���\n";
        alert(str);
        form.TOTALAREA.focus();
    }
    else if(_outcomeCheck.length	< 1)
    {
        str	+= "���и� �Է��ϼ���\n";
        alert(str);
    }
    else if(form.RESULT.value.length	< 1)    
    {
        str	+= "�ǰ����� �����ϼ���\n";
        alert(str);
        form.CATEG.focus();
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
		window.close();
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
	  <h3><img src="/rams/images/suit/st_input.gif" alt="�Ҽ� ��� �Է�"/></h3>
	  <!-- �⺻���� -->
      <table width="790" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <th scope="row" width="5" height="70"><img src="/rams/images/suit/srch2_bg1.gif" alt="." /></th>
          <td background="/rams/images/suit/srch2_bg2.gif" class="srch"><table width="780" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <th width="80" height="23" align="left" scope="row">�ǰἱ������</th>
			  <td width="100"><input id="ANNOUNCEDATE" name="ANNOUNCEDATE" type="text" class="formBox2"  value="${view.ANNOUNCEDATE}" readonly="readonly"/></td>
			  <td width="70"><img src="/rams/images/suit/cal.gif" alt="�޷�" onclick="popUpCalendar(this,ANNOUNCEDATE,'yyyymmdd')" style="cursor:pointer;"/></td>
              <td width="20"><input type="radio" name="OUTCOME" value="1" ${OUTCOME_1}/></td>
              <td width="70">�¼�</td>
              <td width="20"><input type="radio" name="OUTCOME" value="2" ${OUTCOME_2}/></td>
              <td width="70">�м�</td>
              <td width="20"><input type="radio" name="OUTCOME" value="3" ${OUTCOME_3}/></td>
              <td width="70">ȭ�رǰ����</td>
              <th width="60">�ǰ���</th>
              <td align="right"><input id="RESULT" name="RESULT" type="text" class="formBox1" value="${view.RESULT}" /></td>
              <td width="70" align="right"><a href="#" onclick="goSave();"><img src="/rams/images/common/btn_save.gif" alt="����" width="62" height="19" border="0" /></a></td>
            </tr>
            <tr>
              <th height="23" scope="row"></th>
              <td></td>
              <td></td>
              <td><input type="radio" name="OUTCOME" value="4" ${OUTCOME_4}/></td>
              <td>��������</td>
              <td><input type="radio" name="OUTCOME" value="5" ${OUTCOME_5}/></td>
              <td>������</td>
              <td><input type="radio" name="OUTCOME" value="6" ${OUTCOME_6}/></td>
              <td>��Ÿ</td>
              <th></th>
              <td></td>
              <td></td>
            </tr>
          </table></td>
          <td width="5"><img src="/rams/images/suit/srch2_bg3.gif" alt="."/></td>
        </tr>
      </table>
      <table width="790" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="60" height="30" align="right"><a href="#" onclick="window.close();"><img src="/rams/images/common/btn_cancel.gif" alt="���" width="62" height="19" border="0" /></a></td>
		</tr>
	  </table>
	</form>
</body>
</html>
