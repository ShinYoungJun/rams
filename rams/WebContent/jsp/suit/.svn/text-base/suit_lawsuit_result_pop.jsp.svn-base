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
<script language="javascript" src="/rams/js/Ajax_request.js"></script>
<script type="text/javascript">
function goSave(){
	
	if(!confirm("저장하시겠습니까?")){
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
	// 기본사항
	// 토지정보
	
	var _outcomeCheck = '';
	var _outcome = document.getElementsByName("OUTCOME");
	for(var i = 0 ; i < _outcome.length ; i++){
		if(_outcome[i].checked == true){
			_outcomeCheck = _outcome[i].value; 
		}
	}
	
	
    if(form.ANNOUNCEDATE.value.length	< 1)
    {
        str	+= "선고일자를 입력하세요\n";
        alert(str);
        form.TOTALAREA.focus();
    }
    else if(_outcomeCheck.length	< 1)
    {
        str	+= "승패를 입력하세요\n";
        alert(str);
    }
    else if(form.RESULT.value.length	< 1)    
    {
        str	+= "판결결과를 선택하세요\n";
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
	  <h3><img src="/rams/images/suit/st_input.gif" alt="소송 결과 입력"/></h3>
	  <!-- 기본사항 -->
      <table width="790" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <th scope="row" width="5" height="70"><img src="/rams/images/suit/srch2_bg1.gif" alt="." /></th>
          <td background="/rams/images/suit/srch2_bg2.gif" class="srch"><table width="780" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <th width="80" height="23" align="left" scope="row">판결선고일자</th>
			  <td width="100"><input id="ANNOUNCEDATE" name="ANNOUNCEDATE" type="text" class="formBox2"  value="${view.ANNOUNCEDATE}" readonly="readonly"/></td>
			  <td width="70"><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,ANNOUNCEDATE,'yyyymmdd')" style="cursor:pointer;"/></td>
              <td width="20"><input type="radio" name="OUTCOME" value="1" ${OUTCOME_1}/></td>
              <td width="70">승소</td>
              <td width="20"><input type="radio" name="OUTCOME" value="2" ${OUTCOME_2}/></td>
              <td width="70">패소</td>
              <td width="20"><input type="radio" name="OUTCOME" value="3" ${OUTCOME_3}/></td>
              <td width="70">화해권고결정</td>
              <th width="60">판결결과</th>
              <td align="right"><input id="RESULT" name="RESULT" type="text" class="formBox1" value="${view.RESULT}" /></td>
              <td width="70" align="right"><a href="#" onclick="goSave();"><img src="/rams/images/common/btn_save.gif" alt="저장" width="62" height="19" border="0" /></a></td>
            </tr>
            <tr>
              <th height="23" scope="row"></th>
              <td></td>
              <td></td>
              <td><input type="radio" name="OUTCOME" value="4" ${OUTCOME_4}/></td>
              <td>강제조정</td>
              <td><input type="radio" name="OUTCOME" value="5" ${OUTCOME_5}/></td>
              <td>소취하</td>
              <td><input type="radio" name="OUTCOME" value="6" ${OUTCOME_6}/></td>
              <td>기타</td>
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
		  <td width="60" height="30" align="right"><a href="#" onclick="window.close();"><img src="/rams/images/common/btn_cancel.gif" alt="취소" width="62" height="19" border="0" /></a></td>
		</tr>
	  </table>
	</form>
</body>
</html>
