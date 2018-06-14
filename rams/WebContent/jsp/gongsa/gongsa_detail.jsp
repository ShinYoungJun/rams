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


function goModify(constNum){
	var form = document.form;
	form.action = "/rams/gongsa/gongsa_modify.do?CONSTNUM="+constNum;
	form.submit();
	
}

function goDelete(constNum){
	
	if(!confirm("���� �����Ͻðڽ��ϱ�?")){
        return;
    }
	
	var form = parent.document.form;
	form.action = "/rams/gongsa/gongsa_delete.do?CONSTNUM="+constNum;
	form.submit();
		
}

function goDown(filename,filepath){
	var url = "/rams/jsp/common/file_down.jsp?filename="+filename+"&filepath="+filepath;
	
	var form = document.form;
	form.action = url;
	form.submit();
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
  <table width="817" border="0" cellspacing="0" cellpadding="0">
	<tr>
      <td height="26" align="right" valign="bottom"><a href="#" onclick="goModify('${bean.CONSTNUM}');"><img src="/rams/images/common/btn_modify.gif" alt="����" border="0"/></a></td>
	  <td width="70" align="right" valign="bottom"><a href="#" onclick="goDelete('${bean.CONSTNUM}');"><img src="/rams/images/common/btn_del3.gif" alt="����" width="62" height="19" border="0" /></a></td>
	</tr>
  </table>  
  <!-- ������೻�� �� -->
  <h4><img src="/rams/images/register/st_detailed.gif" alt="������೻�� ��" /></h4>
  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
	<tr>
	  <td>
	  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
		  <tr>
			<th style="width:150px;" scope="col">�ǽð�ȹ�ΰ����</th>
			<td style="width:253px;" width="203" class="cont">${bean.GOSIID}</td>
			<th style="width:150px;" width="150" scope="col">��������㰡 ������� </th>
			<td style="width:260px;" class="310">${bean.ANNPERMISSION}</td>
		  </tr>
		  <tr>
			<th scope="col">������ ����(�뼱��)</th>
			<td class="cont">${bean.LINENAME}</td>
			<th scope="col">������ ����</th>
			<td class="cont">${bean.CONSTCATEG_NM}</td>
		  </tr>
		  <tr>
			<th scope="col">���籸��</th>
			<td style="width:663px;" colspan="3" class="cont">
				<c:choose>
				<c:when test="${bean.STARTSECTION == null}">
				</c:when>
				<c:otherwise>
				${bean.STARTSECTION } ���� ${bean.ENDSECTION } ����
				</c:otherwise>
				</c:choose>
			</td>
		  </tr>
		  <tr>
			<th scope="col">�������</th>
			<td style="width:663px;" colspan="3" class="cont">${bean.CONSTPLACE}</td>
		  </tr>
		  <tr>
			<th scope="col">������</th>
			<td class="cont">${bean.STARTDATE}</td>
			<th scope="col">�ذ���</th>
			<td class="cont">${bean.ENDDATE}</td>
		  </tr>
		  <tr>
			<th scope="col">�������</th>
			<td style="width:663px;" colspan="3" class="cont">${bean.REASON}</td>
		  </tr>
		</table>
	  </td>
	</tr>
  </table>
  
  
  <!-- ���������(��û��) -->
  <h4><img src="/rams/images/register/st_pp.gif" alt="���������(��û��)" /></h4>
  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
	<tr>
	  <td>
	  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
		  <tr>
			<th style="width:150px;" scope="col">����(ȸ���)</th>
			<td style="width:253px;" class="cont">${bean.NAME}</td>
			<th style="width:150px;" width="203" scope="col">�ֹε�Ϲ�ȣ<br/>(����ڵ�Ϲ�ȣ)</th>
			<td style="width:260px;" class="cont">${bean.JUMINNUM}</td>
		  </tr>
		  <tr>
			<th scope="col">����ó</th>
			<td class="cont">${bean.TEL}</td>
			<th scope="col">�����ȣ</th>
			<td class="cont">${bean.POSTNUM}</td>
		  </tr>
		  <tr>
			<th scope="col">�ּ�</th>
			<td colspan="3" class="cont">${bean.ADDR}</td>
		  </tr>
		</table>
	  </td>
	</tr>
  </table>
  
  
  <!-- ÷���ڷ� -->
  <h4><img src="/rams/images/register/st_data.gif" alt="÷���ڷ�" /></h4>
  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
	<tr>
	  <td>
	  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
		  <tr>
			<th style="width:150px;" scope="col">�����ȹ��</th>
			<td style="width:253px;" class="cont"><a href="#" class="blue1" onclick="goDown('${bean.PLAN_FILE}','${filePath}${bean.FILELOC}')">${bean.PLAN_FILE}</a></td>
			<th style="width:150px;" width="203" scope="col">���ΰ�������㰡 ������� </th>
			<td style="width:260px;" class="cont"><a href="#" class="blue1" onclick="goDown('${bean.NOTICE_FILE}','${filePath}${bean.FILELOC}')">${bean.NOTICE_FILE}</a></td>
		  </tr>
		  <tr>
			<th scope="col">�����ڷ�</th>
			<td colspan="3" class="cont"><a href="#" class="blue1" onclick="goDown('${bean.PRINT_FILE}','${filePath}${bean.FILELOC}')">${bean.PRINT_FILE}</a></td>
		  </tr>
		  <tr>
			<th scope="col">��Ÿ�ڷ�</th>
			<td colspan="3" class="cont"><a href="#" class="blue1" onclick="goDown('${bean.ETC_FILE}','${filePath}${bean.FILELOC}')">${bean.ETC_FILE}</a></td>
		  </tr>
		</table>
	  </td>
	</tr>
  </table>
</form>
</body>
</html>
