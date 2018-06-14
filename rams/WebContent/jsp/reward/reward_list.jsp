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
function goSearch(){
	var form = document.form;
	form.action = "/rams/reward/reward_list.do";
	form.submit();
}

function goView(num,pnu){
	var form = document.form;
	form.action = "/rams/reward/reward_view.do?COMPEID="+num+"&PNU="+pnu;
	form.submit();
	
}

function goWrite(){
	location.href = "/rams/reward/reward_write.do"
}
</script>
</head>

<body>
<form name="form" id="form" method="post">
<input id="currentPage" name="currentPage" type="hidden" value="${currentPage}"></input>
<div id="cont01">
  <!-- �����丮 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > ������� ���� <a href="#" class="blue1"></a> > <strong>�̺Һ������ </strong></td>
    </tr>
  </table>
  </div>
  
  <div>
    <h2><img src="/rams/images/reward/tt01.gif" alt="�����������_�̺Һ������" width="184" height="22" /></h2>
   
   
    <!-- �� �޴� -->
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><img src="/rams/images/reward/tab01_on.gif" alt="�̺Һ������" width="91" height="29" /></td>
          <td width="91"><a href="/rams/reward/reward_review_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image16','','/rams/images/reward/tab02_on.gif',1)"><img src="/rams/images/reward/tab02_off.gif" alt="�������/�������" name="Image16" width="91" height="29" border="0" id="Image16" /></a></td>
          <td width="91"><a href="/rams/reward/reward_status_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image19','','/rams/images/reward/tab03_on.gif',1)"><img src="/rams/images/reward/tab03_off.gif" alt="��Ȳ����" name="Image19" width="91" height="29" border="0" id="Image19" /></a></td>
          <td width="91"><a href="/rams/reward/reward_anal_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image20','','/rams/images/reward/tab04_on.gif',1)"><img src="/rams/images/reward/tab04_off.gif" alt="���" name="Image20" width="91" height="29" border="0" id="Image20" /></a></td>
          <td width="91"><a href="/rams/reward/reward_own_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image20','','/rams/images/reward/tab05_on.gif',1)"><img src="/rams/images/reward/tab05_off.gif" alt="����������Ȳ" name="Image19" width="91" height="29" border="0" id="Image20" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	
	<!-- �˻� �ڽ� -->
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="5" height="50"><img src="/rams/images/suit/srch_bg1.gif" alt="." /></td>
		  <td background="/rams/images/suit/srch_bg2.gif" class="srch">
			  <table width="787" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td width="43" height="14" ><img src="/rams/images/suit/srch.gif" alt="�˻�"/></td>
				  <td width="635"><input id="SEARCH_VALUE" name="SEARCH_VALUE" type="text" class="formBox5" value="${SEARCH_VALUE}" /></td>
				  <td><a href="#" onclick="goSearch()"><img src="/rams/images/common/btn_srch3.gif" alt="�˻�" border="0" /></a></td>
				</tr>
			  </table>
		  </td>
		  <td width="5"><img src="/rams/images/suit/srch_bg3.gif" alt="."/></td>
		</tr>
	  </table>
	</div>
	<div class="list">
	  <!-- �˻���� -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="16" valign="top" class="t_org">�� ���󿩺� �������� �̺Һ��� ���� �� ��������� ��ȸ�� �����մϴ�. </td>
    <td align="right" valign="top" class="t_org">${listCompenCount}/${listCount} ��</td>
  </tr>
</table>

	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">�����</th>
				<th width="60" scope="col">��ġ��</th>
				<th width="60" scope="col">����</th>
				<th width="60" scope="col">���� ��<br/>(����)</th>
				<th width="60" scope="col">����</th>
				<th width="60" scope="col">����(��)</th>
				<th width="60" scope="col">���󿩺�</th>
				<th scope="col">�����������</th>
				<th width="80" scope="col">�������</th>
			  </tr>
			  <c:forEach items="${list}" var="rewardList">
			  <tr onmouseover="trMoouseOver(this)" onmouseout="trMoouseOut(this)" style="cursor:pointer" onclick="goView('${rewardList.COMPEID}','${rewardList.PNU}');">
				<td>${rewardList.CONSTNAME}</td>
				<td>${rewardList.GU_NM}</td>
				<td>${rewardList.BJ_NM}</td>
				<td>${rewardList.BONBUN}-${rewardList.BUBUN}</td>
				<td>${rewardList.JIMOK}</td>
				<td>${rewardList.AFFAIRAREA}��</td>
				<td>${rewardList.ISCOMPENSATE}</td>
				<td>${rewardList.REASON}</td>
				<td>${rewardList.REGISTDATE}</td>
			  </tr>			  
			  </c:forEach>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
	      <td height="26" align="right" valign="bottom"><a href="#" style="cursor:pointer" onclick="goWrite();"><img src="/rams/images/reward/btn_regi.gif" alt="�̺Һ���������" border="0"/></a></td>
		</tr>
		  <tr>
			<td height="30" align="center">
		  	  	<table border="0" cellpadding="0" cellspacing="0">
					<tr>
						${strPageDivideForm}
					</tr>
				</table>
			</td>
		  </tr>
	  </table>
    </div>
  </div>
</div>
</form>
</body>
</html>
