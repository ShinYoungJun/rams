<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=euc-kr" />
<title>::::: ����� �����������ý��� :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<style type="text/css">
<!--
#sM01 {
	position:absolute;
	left:275px;
	top:53px;
	width:331px;
	height:20px;
	z-index:1;
	visibility: hidden;
	padding-top:2px;
}
#sM02 {
	position:absolute;
	left:341px;
	top:53px;
	width:187px;
	height:20px;
	z-index:1;
	visibility: hidden;
	padding-top:2px;
}
#sM03 {
	position:absolute;
	left:400px;
	top:53px;
	width:331px;
	height:20px;
	z-index:1;
	visibility: hidden;
	padding-top:2px;
}
#sM05 {
	position:absolute;
	left:495px;
	top:53px;
	width:365px;
	height:20px;
	z-index:1;
	visibility: hidden;
	padding-top:2px;
}
.style1 {color: #0083cd}
-->
</style>
<script type="text/javascript" src="/rams/js/common.js"></script>
<script type="text/javascript">
//���������� �̵�
function moveMenu(num,link){
	var authur = '${userAuthur}';
	
	if(authur != null & authur.indexOf(num) < 0){
		alert('����� ������ �����ϴ�.');
		return;
	}
	
	var _mainFrm = document.getElementById("main");
	_mainFrm.src = link;
}
//���������� ��������
function iFrameResize(obj)
{
	var iFrm = obj;

	//width �߰� : ������ �� ���� �߰� �ٸ� ���������� ������ ��ġ�� �ʴ� �� ���� - �ѿ� ����			
	var the_height = iFrm.contentWindow.document.body.scrollHeight+30;
	var the_width = iFrm.contentWindow.document.body.scrollWidth;
	
	iFrm.style.height = the_height;
	iFrm.style.width = the_width;
}


function logOut(){
	if(!confirm("�α׾ƿ� �Ͻðڽ��ϱ�?")){
        return;
    }
	location.href="/rams/admin/user/logout.do";
	
}


</script>

</head>

<body>
	<div id="top">
	  <table width="874" border="0" cellspacing="0" cellpadding="0">
	    <tr>
			<th height="21" align="right" scope="row"><span class="style1">${userName}</span></th>
			<td width="85" align="left">�� ȯ���մϴ�. </td>
			<td align="right" width="70"><a href="#" onclick="logOut();"><img src="/rams/images/common/logout.gif" alt="�α׾ƿ�" border="0" /></a></td>
			<td class="manage" width="95" align="right"><a href="#" onclick="moveMenu('0','/rams/admin/user/user_manager.do');" class="blue1">������</a>��<a href="#" class="blue1" onclick="moveMenu('','/rams/board/board_list.do');">�Խ���</a></td>
		</tr>
	  </table>
	  <table width="854" border="0" cellspacing="0" cellpadding="0">
	    <tr>
	      <td rowspan="2" scope="row" width="260" height="54"><img src="/rams/images/common/logo.gif" alt="����õ��������������ý���" /></td>
	      <td><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image23','','/rams/images/common/mm01_on.gif',1)"><img src="/rams/images/common/mm01_off.gif" alt="��������ȸ" name="Image23" width="107" height="33" border="0" id="Image23" onmouseover="MM_showHideLayers('sM01','','show')" onmouseout="MM_showHideLayers('sM01','','hide')" /></a></td>
	      <td><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image18','','/rams/images/common/mm02_on.gif',1)"><img src="/rams/images/common/mm02_off.gif" alt="�Ҽ���������" name="Image18" width="122" height="33" border="0" id="Image18" onmouseover="MM_showHideLayers('sM02','','show')" onmouseout="MM_showHideLayers('sM02','','hide')" /></a></td>
	      <td><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image4','','/rams/images/common/mm03_on.gif',1)"><img src="/rams/images/common/mm03_off.gif" alt="�����������" name="Image4" width="123" height="33" border="0" id="Image4" onmouseover="MM_showHideLayers('sM03','','show')" onmouseout="MM_showHideLayers('sM03','','hide')" /></a></td>
	      <td><a href="#" onclick="moveMenu('4','/rams/gongsa/gongsa_list.do');" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image17','','/rams/images/common/mm04_on.gif',1)"><img src="/rams/images/common/mm04_off.gif" alt="������� ��ȸ" name="Image17" width="129" height="33" border="0" id="Image17" /></a></td>
	      <td><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image7','','/rams/images/common/mm05_on.gif',1)"><img src="/rams/images/common/mm05_off.gif" alt="�ǻ��������" name="Image7" width="113" height="33" border="0" id="Image7" onmouseover="MM_showHideLayers('sM05','','show')" onmouseout="MM_showHideLayers('sM05','','hide')" /></a></td>
	    </tr>
	    <tr>
	      <td colspan="5" class="subMenu">&nbsp;</td>
	    </tr>
	  </table>
	</div>	
	
	<div id="cont01">
	  <table width="854" border="0" cellspacing="0" cellpadding="0">
	  	<tr>
		  	<td>
		  		<iframe width="100%" height="100%" id="main" name="main" frameborder="0" scrolling="no" src="/rams/cityland/permiss_list.do" onload="iFrameResize(this)">
		  		</iframe>
		  	</td>
	  	</tr>
	  </table>
	</div>
	<div id="sM01" onmouseover="MM_showHideLayers('sM01','','show')" onmouseout="MM_showHideLayers('sM01','','hide')">
		<a href="#" class="blue1" onclick="moveMenu('1','/rams/cityland/permiss_list.do');">��λ���㰡 </a>�� 
		<a href="#" class="blue1" onclick="moveMenu('1','/rams/cityland/dis_list.do');">ó����� </a>�� 
		<a href="#" class="blue1" onclick="moveMenu('1','/rams/cityland/moodan_list.do');">��������� </a>�� 
		<a href="#" class="blue1" onclick="moveMenu('1','/rams/cityland/base_list.do');">�������</a>��
		<a href="#" class="blue1" onclick="moveMenu('1','/rams/cityland/history_list.do');">����̷�</a>
	</div>
	<div id="sM02" onmouseover="MM_showHideLayers('sM02','','show')" onmouseout="MM_showHideLayers('sM02','','hide')">
		<a href="#" class="blue1" onclick="moveMenu('2','/rams/suit/suit_list.do');">�Ҽ����� </a>�� 
		<a href="#" class="blue1" onclick="moveMenu('2','/rams/suit/suit_price_list.do');">�Ұ����� </a>�� 
		<a href="#" class="blue1" onclick="moveMenu('2','/rams/suit/suit_anal_list.do');">���</a>
	</div>
	<div id="sM03" onmouseover="MM_showHideLayers('sM03','','show')" onmouseout="MM_showHideLayers('sM03','','hide')">
		<a href="#" class="blue1" onclick="moveMenu('3','/rams/reward/reward_list.do');">�̺Һ������ </a>�� 
		<a href="#" class="blue1" onclick="moveMenu('3','/rams/reward/reward_review_list.do');">���� ����/������� </a>�� 
		<a href="#" class="blue1" onclick="moveMenu('3','/rams/reward/reward_status_list.do');">��Ȳ���� </a>�� 
		<a href="#" class="blue1" onclick="moveMenu('3','/rams/reward/reward_anal_list.do');">���</a>��  
		<a href="#" class="blue1" onclick="moveMenu('3','/rams/reward/reward_own_list.do');">����������Ȳ</a>
	</div>
	<div id="sM05" onmouseover="MM_showHideLayers('sM05','','show')" onmouseout="MM_showHideLayers('sM05','','hide')">
		<a href="#" class="blue1" onclick="moveMenu('5','/rams/map/map.do?selectMap=juckji');">�����м� </a>�� 
		<a href="#" class="blue1" onclick="moveMenu('5','/rams/map/map.do?selectMap=unReward')">�̺Һ�������м� </a>�� 
		<a href="#" class="blue1" onclick="moveMenu('5','/rams/map/map.do?selectMap=suitBiz')">�Ҽ۾������� </a>�� 
		<a href="#" class="blue1" onclick="moveMenu('5','/rams/map/map.do?selectMap=reward')">�����������</a>
	</div>


</body>

</html>

