<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script type="text/javascript"><!--

/*
var kkk22 = "세외수입부과시스템 서버이전 작업 중입니다.\n시간: 오후 3:00 ~ 4:00.\n문의: 070 - 8889 - 3163 \n테스트 시간 동안은 시스템 사용이 불가합니다.";
alert(kkk22);
*/


//팝업 적용시 roadsdb계정으로 공지사항 작성 후 글번호로 적용
roads_boardDetailPop('554771');  


function init()
{
	var form = document.loginForm;

	var message = '${message}';
	
	if(message != ''){
		alert(message);
	}

	if (loc.indexOf("https://") == -1) {
		//roads_boardDetailPop('226435');
//		roads_boardDetailPop('250578'); /* SSL */
//		roads_boardDetailPop('288800');  /* SSL 적용 팝업 */
	}
}

// 폼 체크
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
	if(!checkStrNVMsg(id,"아이디")){
		return;
	}
	if(!checkStrNVMsg(pw,"비밀번호")){
		return;
	}
	
	if(obj == 'rams'){
		form.action = '/rams/admin/user/login.do';
	}else{
		form.action = '/admin/user/login.do';	
	}

	// cookie에 저장된 id가 없으면 아이디저장 checkbox 언체크
	if (document.getElementById('idCheck').checked) 
	{
		var userId = document.getElementById('userid').value;
		setCookie("userId", userId, 30);	// 30일 동안 id저장
	} else {
		deleteCookie("userId");
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


//아이디신청
function fn_roads_regist()
{	
	var winPosLeft = 'left='+(screen.width - 520) / 2; //  
		var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // 
		var param = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=520, height=600";
		
	window.open('/admin/user/userReg.do?input_type=text',"상세정보1", param);	
}

//아이디신청-rams
function fn_rams_regist()
{	
	var winPosLeft = 'left='+(screen.width - 520) / 2; //  
		var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // 
		var param = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=540, height=450";
		
	window.open('/rams/admin/user/idRequest.do',"상세정보1", param);	
}

//공지사항 상세view
function roads_boardDetailPop(obj)
{	
	var param = "/admin/boardDetail.do?seq="+obj+"&modeType=login";
    var winPosLeft = 'left='+(screen.width - 800) / 2; //  
		var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // 
		var param1 = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=800, height=500";
	
	window.open( param, "상세정보2", param1);	
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

//cookie setting (2016.04 kny)
function setCookie(cookieName, value, exdays){
	var exdate = new Date();
	exdate.setDate(exdate.getDate() + exdays);
	var cookieValue = escape(value) + ((exdays==null) ? "" : "; expires=" + exdate.toGMTString());
	document.cookie = cookieName + "=" + cookieValue;
}

//delete from cookie (2016.04 kny)
function deleteCookie(cookieName){
	var expireDate = new Date();
	expireDate.setDate(expireDate.getDate() - 1);
	document.cookie = cookieName + "= " + "; expires=" + expireDate.toGMTString();
}

function expire()
{ 
	if(GetCookie("Notice") != "done"){ 
		noticeOn(); 
	} 

	// 저장된 쿠키값을 가져와서 ID 칸에 넣어준다. 없으면 공백으로 들어감.
	var getUserId = GetCookie("userId");
	
	if(getUserId != null){
		document.getElementById("userid").value = getUserId;
	}
	
	if(document.getElementById("userid").value != ""){
		document.getElementById('idCheck').checked = true;
	}
	/////////////////////////////////////////////////////////////////////// 
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
	//window.open('/admin/user/noticePop.do?popup=1',"공지사항", "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, left=200,top=200,width=800, height=500");	
}


//////위로는 도로점용 찌꺼기
// 여기부터 시작
function goRamsNoticeDetail(seqNum){
	window.open('/rams/admin/user/rams_notice_view.do?SEQNUM='+seqNum,"공지사항", "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, left=200,top=200,width=600, height=400");
}

//********** BEGIN_KANG_20120829
var loc = new String(window.parent.document.location);

<%-- TODO https 접속 처리 주석 해제.  --%>

function redirect(){
	
	//20180515
	//20180515 if(loc.indexOf("https://") == -1) {	// https가 아닌 경우만.
	//20180515	var url;
	//20180515	if(loc.indexOf("http://") == 0) {
	//20180515		url = loc.replace("http://", "https://");
	//20180515	}else if(loc.indexOf("http://" == -1) || (loc.indexOf("https://") == -1)){
	//20180515		url = loc.replace("http://", "https://");
	//20180515	}	
	//20180515	window.location.replace(url);
	 //20180515 }else{
		init();
		expire();
		//20180515 }

}

function popHowhan(){

	var param = "";
	var winPosLeft = 'left='+(screen.width - 800) / 2; // 새창 x 좌표 
	var winPosTop = 'top='+(screen.height - 500 - 300) / 2; // 새창 y 좌표 
	var param1 = "";
	
	 param = "/admin/boardDetail.do?modeType=howhan";
	 param1 = "resizable=no, status=no, scrollbars=yes, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=770, height=800";
    
	window.open( param, "호환성보기설정", param1);	
	
	/*
	var param = "/admin/boardDetail.do?seq="+obj+"&modeType=login";
  var winPosLeft = 'left='+(screen.width - 800) / 2; // 새창 x 좌표 
	var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // 새창 y 좌표 
	var param1 = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=800, height=500";
	
	window.open( param, "상세정보2", param1);	
	*/
}

<%--
var url = loc.replace("http://", "https://");
if (loc.indexOf("https://")== -1) {
	window.location.replace(url);
}
 --%>
//********** END_KANG_20120829

--></script>
</head>

<body onload="redirect();MM_preloadImages('/rams/images/login/login_on01.gif','/rams/images/login/login_on02.gif')">
<form name="loginForm" method="post">
	<div id="wrapper">
	  <div><img src="/rams/images/login/mimg.jpg" alt="서울시도로재산관리시스템" width="1024" height="409" /></div>
	  

	  
	  <!-- 도로점용관리 로그인 -->
	  <div class="loginP">
	    <h3><img src="/rams/images/login/o_title.gif" alt="도로점용관리(도로점용업무담당자)" /></h3>
		<fieldset>
		  <legend>로그인정보</legend>
		  <p class="id"><input type="text" value="" name="ROADS_USERID" id="userid" class="formBox6" onKeyDown="fn_focus(document.loginForm.ROADS_PASS);checkKeySearch();" /></p>
		  <p class="pw"><input type="password" value="" name="ROADS_PASS" class="formBox6" onKeyDown="fn_focus(document.loginForm.ROADS_USERID);checkKeySearch();" /></p>
		  <p class="btnP"><a href="#"><img src="/rams/images/login/login_off.gif" alt="도로점용관리로그인" border="0" onclick="javascript:checkForm('roads');" /></a></p>
		</fieldset>
		<div align="right" style="margin-right: 70px;"><label style="font-size: 11.5px;"><input type="checkbox"id="idCheck" > 아이디저장</label></div>
		  <div class="memberInfo" align="right">
		  <a href="#" onclick="fn_roads_regist();" class="blue1">아이디신청</a>
		  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  </div>
		  <div class="noticeP">
			<h4>
				<img src="/rams/images/login/o_notice.gif" alt="도로점용관리 공지사항" width="287" height="25" border="0" usemap="#Map2" />
				</h4>
			<ul>
			
			</ul>
		  </div>
	  </div>

	  
	  
	  <!-- 도로현황관리 로그인-->
	  <div class="loginO">
	    <h3 style="padding-top: 20px;"><img src="/rams/images/login/system_inquiry.png" alt="시스템 이용문의" /></h3>
	    <!-- p style="font-size: 12px; letter-spacing: 1px; padding-left: 8px;">▶ 070 - 8889 - 3163</p> -->
	    <p style="font-size: 12px; letter-spacing: 1px; padding-left: 8px;">▶ 070 - 8889 - 3275</p>
	    <!-- <p style="font-size: 12px; letter-spacing: 1px; padding-left: 8px;">▶ ny_ksic@ksic.net</p> -->
	    <!-- p style="font-size: 12px; letter-spacing: 1px; padding-left: 8px;">▶ kjh0123@ksic.net</p> -->
	    <p style="font-size: 12px; letter-spacing: 1px; padding-left: 8px;">▶ syj0928@ksic.net</p>
	    <div style="padding: 10px 0 0 8px; font-size: 12px; cursor:pointer; text-decoration: u" onclick="popHowhan('hohwan');">
			☞ Internet Explorer 호환성보기 설정하는 방법
      </div>
	    
	    <!-- 
		<fieldset>
		  <legend>로그인정보</legend>
		  <p class="id">
		    <input type="text" name="RAMS_USERID" class="formBox6" onKeyDown="fn_focus(document.loginForm.RAMS_PASS);checkKeySearch();" />
		  </p>
		  <p class="pw">
		    <input type="password" name="RAMS_PASS" class="formBox6" onKeyDown="fn_focus(document.loginForm.RAMS_USERID);checkKeySearch();" />
		  </p>
		  <p class="btnO"><a href="#" onfocus="this.blur()"><img src="/rams/images/login/login_off.gif" alt="도로현황관리로그인" border="0" onclick="javascript:checkForm('rams');" /></a></p>
		</fieldset>
		  <div class="memberInfo" align="right">
		  	<a href="#" class="blue1" onclick="fn_rams_regist();" onfocus="this.blur()">아이디신청</a>
		  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		  </div>
		  <div class="noticeP">
			<h4>
				<img src="/rams/images/login/p_notice.gif" alt="도로현황관리 공지사항" width="287" height="25" border="0" usemap="#Map" />
				</h4>
			<ul>
			
			</ul>
		  </div>-->
	  </div>  
	  
	</div>
	<div id="copy">
		<img src="/rams/images/login/copy.gif" alt="copyright" width="1024" height="96" border="0" usemap="#Map3" />
		<map name="Map3" id="Map3">
			<area shape="rect" coords="153,16,230,64" href="#" />
			<area shape="rect" coords="243,25,350,47" href="../../html/security/security2014.htm" />
			<area shape="rect" coords="701,24,767,57" href="#" />
			<area shape="rect" coords="773,25,860,57" href="#" />
		</map>
	</div>

  </form>
</body>
86
</html>
