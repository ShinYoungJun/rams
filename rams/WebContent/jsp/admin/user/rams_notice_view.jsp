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
</head>

<body>
	<div id="cont01">
	  <!-- �˻� -->
	  <div>
	    <h2><img src="/rams/images/board/tt02.gif" alt="��������_�������׺���"/></h2>
		<div>
		<div id="cont03">
			<div class="list2">
			  <table width="90%" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td height="3" colspan="2" background="/rams/images/board/dot3.gif"></td>
				  </tr>
				  <tr>
					<td class="cont3">�� ��</td>
					<td class="cont4">${ramsNotice.REGISTNAME}</td>
				  </tr>
				  <tr>
					<td class="cont3">����</td>
					<td class="cont4">${ramsNotice.TITLE}</td>
				  </tr>
				  <tr>
					<td class="cont3">�ۼ���</td>
					<td class="cont4">${ramsNotice.REGISTDATE}</td>
				  </tr>
				  <tr>
					<td class="cont3">��ȸ��</td>
					<td class="cont4">${ramsNotice.VIEWCNT}</td>
				  </tr>
				  <tr>
					<td height="100%" align="center" bgcolor="f0f7fb"><strong>����</strong></td>
					<td class="cont5">
						<div class="xed">
						${ramsNotice.CONTENT}
						</div>
					</td>
				  </tr>
				  <tr>
					<td height="3" colspan="2" background="/rams/images/board/dot3.gif"></td>
				  </tr>
			  </table>
		  </div>
		</div>
		</div>
		</div>
		</div>
</body>
</html>
