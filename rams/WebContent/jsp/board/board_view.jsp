<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: ����� �����������ý��� :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<link rel="stylesheet" href="/rams/css/xq_contents.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script type="text/javascript">
	function goModify(obj){
		var form = document.form;
		form.action = "/rams/board/board_write.do?SEQNUM="+obj+"&MODE=modify";
		form.submit();
		
	}
	function goDelete(obj){
		
		if(!confirm("�����Ͻðڽ��ϱ�?")){
            return;
        }
		
		
		var form = document.form;
		form.action = "/rams/board/board_delete.do?SEQNUM="+obj;
		form.submit();
			
	}
	function goList(){
		location.href = "/rams/board/board_list.do";
	}
	//�������� �̵�
	function goNotice(){
		var authur = '${userAuthur}';
		
		if(authur != null & authur.indexOf("0") < 0){
			alert('����� ������ �����ϴ�.');
			return;
		}
		
		location.href = "/rams/board/notice_list.do";
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
		  <!-- �����丮 -->
		  <div>
		  <table width="817" border="0" cellspacing="0" cellpadding="0">
		    <tr>
		      <td align="right">
		      	<a href="#" ><img src="../images/suit/home.gif" alt="home" border="0" /></a> > 
		      	<a href="#" class="blue1" onclick="goList();">�Խ��� </a> > <strong>�Խù� ����</strong>
	      	</td>
		    </tr>
		  </table>
		  </div>
		  
	  <!-- �˻� -->
	  <div>
	    <h2><img src="/rams/images/board/tt05.gif" alt="�Խ���_�Խù�����"/></h2>
		<div class="tab">
		  <table width="817" border="0" cellspacing="0" cellpadding="0">
	        <tr>
	          <td width="91" height="29">
	          	<img src="/rams/images/board/tab02_on.gif" alt="�Խ���" />
	          </td>
	          <td width="91">
	          	<a href="#"  onclick="goNotice();" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image19','','/rams/images/board/tab01_on.gif',1)"><img src="/rams/images/board/tab01_off.gif" alt="��������" name="Image19" width="91" height="29" border="0" id="Image19" /></a>
	          </td>
	          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
	        </tr>
	      </table>
		</div>
		<div id="cont03">
			<div class="list2">
			  <table width="817" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td height="3" colspan="2" background="../images/board/dot3.gif"></td>
				  </tr>
				  <tr>
					<td class="cont3">�� ��</td>
					<td class="cont4">${board.REGISTNAME}</td>
				  </tr>
				  <tr>
					<td class="cont3">����</td>
					<td class="cont4">${board.TITLE}</td>
				  </tr>
				  <tr>
					<td class="cont3">�ۼ���</td>
					<td class="cont4">${board.REGISTDATE}</td>
				  </tr>
				  <tr>
					<td class="cont3">��ȸ��</td>
					<td class="cont4">${board.VIEWCNT}</td>
				  </tr>
				  <tr>
					<td height="100%" align="center" bgcolor="f0f7fb"><strong>����</strong></td>
					<td class="cont5">
						<div class="xed">
						${board.CONTENT}
						</div>
						
					</td>
				  </tr>
				  <tr>
					<td height="3" colspan="2" background="../images/board/dot3.gif"></td>
				  </tr>
			  </table>
		
			  <table width="817" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td height="30" align="center" valign="bottom">
						<table width="320" border="0" cellspacing="0" cellpadding="0">
						  <tr>
							<td align="center">
								<a href="#" onclick="alert('�۾���')"><img src="../images/common/btn_reply.gif" alt="���" border="0" /></a>
							</td>
							<td align="center">
								<a href="#" onclick="goModify('${board.SEQNUM}');"><img src="../images/common/btn_modify.gif" alt="����" border="0" /></a>
							</td>
							<td align="center">
								<a href="#" onclick="goDelete('${board.SEQNUM}');"><img src="../images/common/btn_del3.gif" alt="����" width="62" height="19" border="0" /></a>
							</td>
							<td align="center">
								<a href="#" onclick="goList();"><img src="../images/common/btn_list2.gif" alt="���" width="62" height="19" border="0" /></a>
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
	</form>
</body>
</html>
