<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: ��� ������ :::::</title>
<link href="/rams/css/doro.css" rel="stylesheet" type="text/css" />

<style type="text/css">
body{
scrollbar-face-color:#EEF8FB;
scrollbar-3dlight-color:#BBBDB6; 
scrollbar-highlight-color:#EEF8FB;
scrollbar-shadow-color:#BBBDB6; 
scrollbar-darkshadow-color:#EEF8FB;
scrollbar-track-color:#EEF8FB;
scrollbar-arrow-color:#BBBDB6;

}
.box777 {
	background-color:#ffffff;
	border: 1px #d3e2ea solid;
	color: #9a9a9a;
	}
	
.style1 {color: #FFFFFF}
.style2 {
	color: #FFFF00;
	font-weight: bold;
}

</style>

<script src="/rams/js/common.js"></script>
<script language="javascript">

function goDown(filename,filepath){
	var url = "/rams/jsp/common/file_down.jsp?filename="+filename+"&filepath="+filepath;
	var form = document.form;
	form.action = url;
	form.submit();
}

function goDetail(gubun){

	
	if(gubun == '1'){


		//���������� ���� �ּ� ����
		document.getElementById('goFrame').src = '/rams/map/juckjianalysisdetailframe1.do?GOSIID=${gosiBean.GOSIID}';

		//������ ���뿡 �°� ��ȭ 
		document.getElementById('frame1').style.display = 'block';
		document.getElementById('frame2').style.display = 'none';
		
		

		//������ �ٲ�
		document.getElementById('Image7').src = '/rams/images/map/p_tab1_on.gif';
		document.getElementById('Image8').src = '/rams/images/map/p_tab2_off.gif';
		document.getElementById('Image9').src = '/rams/images/map/p_tab3_off.gif';

		document.getElementById('Image7').onmouseout = function() { this.src = "/rams/images/map/p_tab1_on.gif"; };		
		document.getElementById('Image8').onmouseout = function() { this.src = "/rams/images/map/p_tab2_off.gif"; };
		document.getElementById('Image9').onmouseout = function() { this.src = "/rams/images/map/p_tab3_off.gif"; };
		
		
	}else if(gubun =='2'){

		document.getElementById('goFrame').src = '/rams/map/juckjianalysisdetailframe2.do?GOSIID=${gosiBean.GOSIID}';

		//������ ���뿡 �°� ��ȭ 
		document.getElementById('frame1').style.display = 'none';
		document.getElementById('frame2').style.display = 'block';
		
		

		document.getElementById('Image8').src = '/rams/images/map/p_tab2_on.gif';
		document.getElementById('Image7').src = '/rams/images/map/p_tab1_off.gif';
		document.getElementById('Image9').src = '/rams/images/map/p_tab3_off.gif';
		
		document.getElementById('Image7').onmouseout = function() { this.src = "/rams/images/map/p_tab1_off.gif"; };		
		document.getElementById('Image8').onmouseout = function() { this.src = "/rams/images/map/p_tab2_on.gif"; };
		document.getElementById('Image9').onmouseout = function() { this.src = "/rams/images/map/p_tab3_off.gif"; };
		
		
	}else if(gubun == '3'){

		document.getElementById('goFrame').src = '/rams/map/juckjianalysisdetailframe3.do?GOSIID=${gosiBean.GOSIID}';

		//������ ���뿡 �°� ��ȭ 
		document.getElementById('frame1').style.display = 'none';
		document.getElementById('frame2').style.display = 'block';
		
		
		document.getElementById('Image9').src = '/rams/images/map/p_tab3_on.gif';
		document.getElementById('Image7').src = '/rams/images/map/p_tab1_off.gif';
		document.getElementById('Image8').src = '/rams/images/map/p_tab2_off.gif';
		
		document.getElementById('Image7').onmouseout = function() { this.src = "/rams/images/map/p_tab1_off.gif"; };		
		document.getElementById('Image8').onmouseout = function() { this.src = "/rams/images/map/p_tab2_off.gif"; };
		document.getElementById('Image9').onmouseout = function() { this.src = "/rams/images/map/p_tab3_on.gif"; };
		
	} 

}

</script>

</head>


<body>
<br>
<div id="tImg"><img src="/rams/images/map/tit_list.gif" alt="��ø��" width="65" height="19" style='position:relative;left:30px;' /></div>
<center>
<table width="804" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
  <tr>
    <td>
		<table width="800" border="1" cellpadding="0" cellspacing="1" class="mapPopup" summary="" bordercolor="#bed6e1">
		  <tr>
			<th width="100" scope="col">��ù�ȣ</th>
			<th width="100" scope="col">�������</th>
			<th width="150" scope="col">�������</th>
			<th scope="col">����</th>
			<th width="150" scope="col">��ñ��</th>
		  </tr>
		  <tr>
			<td>${gosiBean.GOSIID}</td>
			<td>${gosiBean.GOSI_DATE}</td>
			<td>${gosiBean.SUBJECT}</td>
			<td>${gosiBean.OTHER}</td>
			<td>${gosiBean.ORG}</td>
		  </tr>
		
		</table>
	</td>
  </tr>
</table>
</center>
<div id="tImg"><img src="/rams/images/map/tit_info.gif" alt="��û�����" width="97" height="19" style='position:relative;left:30px;' /></div>
<center>
<table width="804" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
  <tr>
    <td>
		<table width="800" border="1" cellpadding="0" cellspacing="1" class="mapPopup" summary="" bordercolor="#bed6e1">
		  <tr>
			<th width="100" scope="row">��ñ��</th>
			<td width="290">${gosiBean.ORG}</td>
			<th width="100" scope="row">��ù�ȣ</th>
			<td>${gosiBean.GOSIID}</td>
		  </tr>
		  <tr>
			<th scope="row">��ñ���</th>
			<td>${gosiBean.GUBUN_NM}</td>
			<th scope="row">�������</th>
			<td>${gosiBean.GOSI_DATE}</td>
		  </tr>
		  <tr>
			<th scope="row">�������</th>
			<td colspan="3">${gosiBean.SUBJECT}</td>
		  </tr>
		  <tr>
			<th scope="row">����</th>
			<td colspan="3">${gosiBean.OTHER}</td>
		  </tr>
		  <tr>
			<th scope="row">���</th>
			<td colspan="3">&nbsp;</td>
		  </tr>
		  <tr>
			<th scope="row">���� ���� </th>
			<td colspan="3" style="padding:1px">
				<table width="100%" border="1" cellpadding="0" cellspacing="1" class="mapPopup2" summary="" bordercolor="#bed6e1">
				  <tr>
					<th width="100" scope="col">��ù�</th>
					<td class="leftCon">
					<form name="form" id="form" method="post" enctype="multipart/form-data">
					<a href='#' onclick="goDown('${gosiBean.GOSIFILE}','${path}')">${gosiBean.GOSIFILE}</a>
					</form>
					</td>
					
				  </tr>
				  <tr>
					<th scope="col">��������</th>
					<td class="leftCon"></td>
				  </tr>
				  <tr>
					<th scope="col">��������</th>
					<td class="leftCon"></td>
				  </tr>
				  <tr>
					<th scope="col">����</th>
					<td class="leftCon"></td>
				  </tr>
				</table>
		    </td>
		  </tr>
		</table>
	</td>
  </tr>
</table>
</center>
<div id="tImg2" style='position:relative;left:1px;'>



  <table width="804" border="0" cellspacing="0" cellpadding="0" style='position:relative;left:25px;' >
    <tr>
        
     
     <td width="91" height="28"><img src="/rams/images/map/p_tab1_on.gif" onClick="goDetail('1');" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image7','','/rams/images/map/p_tab1_on.gif',1)" alt="���ýü�����" name="Image7" border="0" id="Image7" style='cursor:hand;'/></td>
	 <td width="91" height="28"><img src="/rams/images/map/p_tab2_off.gif" onClick="goDetail('2');" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image8','','/rams/images/map/p_tab2_on.gif',1)" alt="��������" name="Image8" border="0" id="Image8" style='cursor:hand;' /></td>
	 <td width="91" height="28"><img src="/rams/images/map/p_tab3_off.gif" onClick="goDetail('3');" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image9','','/rams/images/map/p_tab3_on.gif',1)" alt="��������" name="Image9"  border="0" id="Image9" style='cursor:hand;' /></td>
     
     
      <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
    </tr>
  </table>
</div>

<div id='frame1' style='position:relative;left:7px;display:block;'>
<table width="804" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
  <tr>
    <td>
		<table width="800" border="1" cellpadding="0" cellspacing="1" class="mapPopup" summary="" bordercolor="#bed6e1">
		  <tr>
			<th width="25" scope="col"></th>
			<th width="30" scope="col">����</th>
			<th width="85" scope="col">���ð�ȹ�з�</th>
			<th width="55" scope="col">���ι�ȣ</th>
			<th width="30" scope="col">����</th>
			<th width="30" scope="col">���</th>
			<th width="55" scope="col">����(m)</th>
			<th width="80" scope="col">����</th>
			<th width="80" scope="col">����</th>
			<th width="70" scope="col">�������</th>
			<th width="70" scope="col">�ֿ�����</th>
			<th width="70" scope="col">���ʰ�����</th>
			<th scope="col">���</th>
		  </tr>
		 </table>
		 </td>
		 </tr>
</table>
</div>
<div id='frame2' style='position:relative;left:7px;display:none;'>
<table width="804" border="1" cellpadding="1" cellspacing="1"  bordercolor="#d3e2ea">
  <tr>
    <td>
		<table width="800" border="1" cellpadding="0" cellspacing="1" class="mapPopup" summary="" bordercolor="#bed6e1" >
		  <tr>
			<th width="5%" scope="col"></td>
			<th width="10%" scope="col">���̸�</td>
			<th width="10%" scope="col">���̸�</td>
			<th width="15%" scope="col">����</td>
			<th width="10%" scope="col">�������̸�</td>
			<th width="20%" scope="col">�������ּ�</td>
			<th width="10%" scope="col">�������̸�</td>
			<th width="20%" scope="col">�������ּ�</td>			
		  </tr>
		 </table>
		 </td>
		 </tr>
</table>
</div>
<center>
 <iframe id='goFrame' src='/rams/map/juckjianalysisdetailframe1.do?GOSIID=${gosiBean.GOSIID}' width='822' frameborder='0' scrolling='yes' style='overflow-x:hidden;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;'></iframe>
</center>
<table width="824" border="0" cellspacing="0" cellpadding="0" >
  <tr>
    <td height="40" align="right"><!--<a href="#"><img src="/rams/images/common/btn_print.gif" alt="�μ�" border="0" /></a>--></td>
    <td align="right" width="50"><img src="/rams/images/common/btn_close.gif" onClick='javascript:window.close();' style='cursor:hand;' alt="�ݱ�" border="0" /></td>
  </tr>
</table>
</body>

</html>

