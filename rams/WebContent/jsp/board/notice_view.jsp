<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<link rel="stylesheet" href="/rams/css/xq_contents.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script type="text/javascript">
	function goModify(obj){
		var form = document.form;
		form.action = "/rams/board/notice_write.do?SEQNUM="+obj+"&MODE=modify";
		form.submit();
		
	}
	function goDelete(obj){
		
		if(!confirm("삭제하시겠습니까?")){
            return;
        }
		
		
		var form = document.form;
		form.action = "/rams/board/notice_delete.do?SEQNUM="+obj;
		form.submit();
			
	}
	function goList(){
		location.href = "/rams/board/notice_list.do";
	}

	function goBoard(){
		location.href = "/rams/board/board_list.do";
	}
	
	function init(){
		var msg = '${MSG}';
		if(msg != ''){
			alert(msg);
			return;
		}else{
			return;
		}
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
	      <td align="right">
	      	<a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > 
	      	<a href="#" class="blue1" onclick="goList();">공지사항 </a> > <strong>공지사항 보기</strong>
	      </td>
	    </tr>
	  </table>
	  </div>
	  
	  <!-- 검색 -->
	  <div>
	    <h2><img src="/rams/images/board/tt02.gif" alt="공지사항_공지사항보기"/></h2>
		<div class="tab">
		  <table width="817" border="0" cellspacing="0" cellpadding="0">
	        <tr>
		      <td width="91" height="29"><a href="#" onclick="goBoard();" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image19','','/rams/images/board/tab02_on.gif',1)"><img src="/rams/images/board/tab02_off.gif" alt="권한관리" name="Image19" width="91" height="29" border="0" id="Image19" /></a></td>
	          <td width="91"><img src="/rams/images/board/tab01_on.gif" alt="공지사항" border="0" /></td>
	          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
	        </tr>
	      </table>
		</div>
		<div>
		<div id="cont03">
			<div class="list2">
			  <table width="817" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td height="3" colspan="2" background="/rams/images/board/dot3.gif"></td>
				  </tr>
				  <tr>
					<td class="cont3">이 름</td>
					<td class="cont4">${notice.REGISTNAME}</td>
				  </tr>
				  <tr>
					<td class="cont3">제목</td>
					<td class="cont4">${notice.TITLE}</td>
				  </tr>
				  <tr>
					<td class="cont3">작성일</td>
					<td class="cont4">${notice.REGISTDATE}</td>
				  </tr>
				  <tr>
					<td class="cont3">조회수</td>
					<td class="cont4">${notice.VIEWCNT}</td>
				  </tr>
				  <tr>
					<td height="100%" align="center" bgcolor="f0f7fb"><strong>내용</strong></td>
					<td class="cont5">
						<div class="xed">
						${notice.CONTENT}
						</div>
						
					</td>
				  </tr>
				  <tr>
					<td height="3" colspan="2" background="/rams/images/board/dot3.gif"></td>
				  </tr>
			  </table>
		
			  <table width="817" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td height="30" align="center" valign="bottom">
						<table width="250" border="0" cellspacing="0" cellpadding="0">
						  <tr>
							<td align="center">
								<a href="#" onclick="goModify('${notice.SEQNUM}');"><img src="/rams/images/common/btn_modify.gif" alt="수정" border="0" /></a>
							</td>
							<td align="center">
								<a href="#" onclick="goDelete('${notice.SEQNUM}');"><img src="/rams/images/common/btn_del3.gif" alt="삭제" width="62" height="19" border="0" /></a>
							</td>
							<td align="center">
								<a href="#" onclick="goList();"><img src="/rams/images/common/btn_list2.gif" alt="목록" width="62" height="19" border="0" /></a>
							</td>
						  </tr>
					  </table>
					</td>
				  </tr>
			  </table>
		  </div>
		</div>
		</div>
		</div>
		</div>
		</form>
</body>
</html>
