<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: ����� �����������ý��� :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script type="text/javascript">
function init()
{
	var form = document.loginForm;

	var message = '${message}';
	
	if(message != ''){
		alert(message);
	}
	
}

// �� üũ
function checkForm(obj)
{
	var form = document.loginForm;
	var id;
	var pw;
	
	if(obj == 'rams'){
		id = form.RAMS_USERID;
		pw = form.RAMS_PASS;
		
	}else{
		id = form.ROADS_USERID;
		pw = form.ROADS_PASS;
		
	}
	
	
	for(var i=0; i<id.value.length; i++)
	{
		code = id.value.substr(i,1);
		if(!isAllow(code))
		{
			return;
		}
	}
	for(var i=0; i<pw.value.length; i++)
	{
		code = pw.value.substr(i,1);
		if(!isAllow(code))
		{
			return;
		}
	}		
	if(!checkStrNVMsg(id,"���̵�")){
		return;
	}
	if(!checkStrNVMsg(pw,"��й�ȣ")){
		return;
	}
	
	if(obj == 'rams'){
		form.action = '/rams/admin/user/login.do';
	}else{
		form.action = '/admin/user/login.do';	
	}
			
	form.submit();				
}



function fn_focus(obj)
{
	var form = document.ramsLoginForm;
	
	if(event.keyCode == 9) 
	{	
		window.event.returnValue = false;
		obj.focus();
	}	
}

function checkKeySearch()
{	
	if(event.keyCode == KEY_ENTER)
		checkForm();
}


//���̵��û
function fn_roads_regist()
{	
	var winPosLeft = 'left='+(screen.width - 520) / 2; // ��â x ��ǥ 
		var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // ��â y ��ǥ 
		var param = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=520, height=600";
		
	window.open('/admin/user/userReg.do?input_type=text',"������1", param);	
}

//���̵��û-rams
function fn_rams_regist()
{	
	var winPosLeft = 'left='+(screen.width - 520) / 2; // ��â x ��ǥ 
		var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // ��â y ��ǥ 
		var param = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=540, height=450";
		
	window.open('/rams/admin/user/idRequest.do',"������1", param);	
}

//�������� ��view
function roads_boardDetailPop(obj)
{	
	var param = "/admin/boardDetail.do?seq="+obj+"&modeType=login";
    var winPosLeft = 'left='+(screen.width - 800) / 2; // ��â x ��ǥ 
		var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // ��â y ��ǥ 
		var param1 = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=800, height=500";
	
	window.open( param, "������2", param1);	
}

function GetCookie(name){
    var arg = name + "=";
    var alen = arg.length;
    var clen = document.cookie.length;
    var i = 0;
    
    while(i < clen)
 {
        var j = i + alen;
        if(document.cookie.substring(i, j) == arg){
        	return getCookieVal(j);
        }
        
        i = document.cookie.indexOf(" ", i) + 1;
        
        if(i == 0){
        	break;
        }
    }
    return null;
}
function getCookieVal(offset){
    var endstr = document.cookie.indexOf(";", offset);
    
    if(endstr == -1){
        endstr = document.cookie.length;
	}
    return unescape(document.cookie.substring(offset, endstr));
}

function expire()
{ 
	if(GetCookie("Notice") != "done"){ 
		noticeOn(); 
	} 
}

function checkColor(seq,retVal){
	if(seq == 'seq1'){
		
		document.write('<FONT color=#FF0000>' + retVal + '</FONT>');
	}else{
		document.write(retVal);
	}
	
}

function noticeOn()
{
	window.open('/admin/user/noticePop.do?popup=1',"��������", "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, left=200,top=200,width=300, height=393");	
}


//////���δ� �������� ���
// ������� ����
function goRamsNoticeDetail(seqNum){
	window.open('/rams/admin/user/rams_notice_view.do?SEQNUM='+seqNum,"��������", "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, left=200,top=200,width=600, height=400");
}


</script>
</head>

<body onload="init();expire();MM_preloadImages('/rams/images/login/login_on01.gif','/rams/images/login/login_on02.gif')">
<form name="loginForm" method="post">
	<div id="wrapper">
	  <div><img src="/rams/images/login/mimg.jpg" alt="����õ����������ý���" width="1024" height="409" /></div>
	  

	  
	  <!-- ����������� �α��� -->
	  <div class="loginP">
	    <h3><img src="/rams/images/login/o_title.gif" alt="�����������(����������������)" /></h3>
		<fieldset>
		  <legend>�α�������</legend>
		  <p class="id"><input type="text" name="ROADS_USERID" class="formBox6" onKeyDown="fn_focus(document.loginForm.ROADS_PASS);checkKeySearch();" /></p>
		  <p class="pw"><input type="password" name="ROADS_PASS" class="formBox6" onKeyDown="fn_focus(document.loginForm.ROADS_USERID);checkKeySearch();" /></p>
		  <p class="btnP"><a href="#"><img src="/rams/images/login/login_off.gif" alt="������������α���" border="0" onclick="javascript:checkForm('roads');" /></a></p>
		</fieldset>
		  <div class="memberInfo" align="right">
		  <a href="#" onclick="fn_roads_regist();" class="blue1">���̵��û</a>
		  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  </div>
		  <div class="noticeP">
			<h4>
				<img src="/rams/images/login/o_notice.gif" alt="����������� ��������" width="287" height="25" border="0" usemap="#Map2" />
				</h4>
			<ul>
			  <c:forEach items="${roadsNoticeList}" var="roadsNoticeList" varStatus="idx">
			  <li><a href="#" class="grey1" onclick="roads_boardDetailPop('${roadsNoticeList.BOARD_ID}');">- ${roadsNoticeList.TITLE}</a></li>
			  </c:forEach>
			</ul>
		  </div>
	  </div>

	  
	  
	  <!-- ������Ȳ���� �α��� -->
	  <div class="loginO">
	    <h3><img src="/rams/images/login/p_title.gif" alt="������Ȳ����(������������)" /></h3>
		<fieldset>
		  <legend>�α�������</legend>
		  <p class="id">
		    <input type="text" name="RAMS_USERID" class="formBox6" onKeyDown="fn_focus(document.loginForm.RAMS_PASS);checkKeySearch();" />
		  </p>
		  <p class="pw">
		    <input type="password" name="RAMS_PASS" class="formBox6" onKeyDown="fn_focus(document.loginForm.RAMS_USERID);checkKeySearch();" />
		  </p>
		  <p class="btnO"><a href="#" onfocus="this.blur()"><img src="/rams/images/login/login_off.gif" alt="������Ȳ�����α���" border="0" onclick="javascript:checkForm('rams');" /></a></p>
		</fieldset>
		  <div class="memberInfo" align="right">
		  	<a href="#" class="blue1" onclick="fn_rams_regist();" onfocus="this.blur()">���̵��û</a>
		  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  </div>
		  <div class="noticeP">
			<h4>
				<img src="/rams/images/login/p_notice.gif" alt="������Ȳ���� ��������" width="287" height="25" border="0" usemap="#Map" />
				</h4>
			<ul>
			  <c:forEach items="${ramsNoticeList}" var="ramsNoticeList" varStatus="idx">
			  <li><a href="#" class="grey1" onclick="goRamsNoticeDetail('${ramsNoticeList.SEQNUM}');">- ${ramsNoticeList.TITLE}</a></li>
			  </c:forEach>
			</ul>
		  </div>
	  </div>  
	</div>
	<div id="copy">
		<img src="/rams/images/login/copy.gif" alt="copyright" width="1024" height="96" border="0" usemap="#Map3" />
		<map name="Map3" id="Map3"><area shape="rect" coords="153,16,230,64" href="#" />
			<area shape="rect" coords="701,24,767,57" href="#" />
			<area shape="rect" coords="773,25,860,57" href="#" />
		</map>
	</div>
	
  </form>
</body>

</html>
