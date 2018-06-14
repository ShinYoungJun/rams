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

//�˻� �ؿ� ������
function goSearch(){
	var form = document.form;
	form.action = "/rams/gongsa/gongsa_list.do";
	form.submit();
}

//���������� ������
function iFrameResize(obj)
{
	var iFrm = obj;
	var the_height = iFrm.contentWindow.document.body.scrollHeight+30;
	iFrm.style.height = the_height;
	parent.iFrameResize(parent.document.getElementById("main"));
}

//�󼼺���� �̵�
function goView(contNum){
	document.getElementById("gongsaDetail").src = '/rams/gongsa/gongsa_detail.do?CONSTNUM='+contNum;
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
function initSearchForm(){
	var form = document.form;
	
	var new_option;
	var constCateg = document.getElementById("CONSTCATEG");
	
    <c:forEach items="${constCategList}" var="constCategList">
		if('${constCategList.CODEVALUE}' != ''){
	    	new_option = new Option('${constCategList.CODEDESC}','${constCategList.CODEVALUE}');
	    	if(new_option.value == '${CONSTCATEG}'){
	    		new_option.selected = true;
	    	}
	    	constCateg.options.add(new_option);
		}
	</c:forEach>
}

</script>

</head>

<body onload="init();initSearchForm();">
<form name="form" id="form" method="post">

<div id="cont01">
  <!-- �����丮 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > <a href="#" class="blue1">���������ȸ</a> > <strong>���������ȸ</strong></td>
    </tr>
  </table>
  </div>
  
  <!-- �˻� -->
  <div>
    <h2><img src="/rams/images/register/tt01.gif" alt="������� ��ȸ"/></h2>
	<h3><img src="/rams/images/register/st_cont.gif" alt="��������㰡 ����"/></h3>
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="5" height="70"><img src="/rams/images/suit/srch2_bg1.gif" alt="." /></td>
		  <td background="/rams/images/suit/srch2_bg2.gif" class="srch">
			  <table width="787" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td width="60" height="25" ><img src="/rams/images/suit/srch.gif" alt="�˻�"/></td>
				  <td width="50">��������</td>
				  <td width="308" colspan="5">
				  	<select id="CONSTCATEG" name="CONSTCATEG" class="formBox1">
				  		<option value="">:::����:::</option>
				  	</select>
				  </td>
				  <td width="40">�뼱��</td>
				  <td colspan="6"><input id="LINENAME" name="LINENAME" type="text" class="formBox2" value="${LINENAME}"/></td>
				</tr>
                <tr>
                  <td width="60" height="25">&nbsp;</td>
                  <td width="50">������</td>
                  <td width="98"><input id="FROM_STARTDATE" name="FROM_STARTDATE" type="text" class="formBox2" value="${FROM_STARTDATE}"/></td>
                  <td width="25"><a href="#" onclick="popUpCalendar(this, document.getElementById('FROM_STARTDATE'), 'yyyymmdd');"><img src="/rams/images/suit/cal.gif" alt="�޷�" border="0" /></a></td>
                  <td width="15">~</td>
                  <td width="98"><input id="TO_STARTDATE" name="TO_STARTDATE"  type="text" class="formBox2" value="${TO_STARTDATE}"/></td>
                  <td width="75"><a href="#" onclick="popUpCalendar(this, document.getElementById('TO_STARTDATE'), 'yyyymmdd');"><img src="/rams/images/suit/cal.gif" alt="�޷�" border="0" /></a></td>
                  <td width="40">�ذ���</td>
                  <td width="98"><input id="FROM_ENDDATE" name="FROM_ENDDATE"  type="text" class="formBox2" value="${FROM_ENDDATE}"/></td>
                  <td width="25"><a href="#" onclick="popUpCalendar(this, document.getElementById('FROM_ENDDATE'), 'yyyymmdd');"><img src="/rams/images/suit/cal.gif" alt="�޷�" border="0" /></a></td>
                  <td width="15">~</td>
                  <td width="98"><input id="TO_ENDDATE" name="TO_ENDDATE" type="text" class="formBox2" value="${TO_ENDDATE}"/></td>
                  <td width="40"><a href="#" onclick="popUpCalendar(this, document.getElementById('TO_ENDDATE'), 'yyyymmdd');"><img src="/rams/images/suit/cal.gif" alt="�޷�" border="0" /></a></td>
				  <td><a href="#" onclick="goSearch();"><img src="/rams/images/common/btn_srch3.gif" alt="�˻�" border="0" /></a></td>
                </tr>
              </table>
              </td>
		  <td width="5"><img src="/rams/images/suit/srch2_bg3.gif" alt="."/></td>
		</tr>
	  </table>
	</div>
    <div class="list">
	
	
	  <!-- �˻���� -->
	  <h4><img src="/rams/images/register/st_rst.gif" alt="�˻����" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="40" scope="col">����</th>
				<th width="90" scope="col">�뼱��</th>
				<th width="90" scope="col">��������</th>
				<th width="90" scope="col">��������</th>
				<th scope="col">���籸��</th>
				<th width="90" scope="col">����(km)</th>
				<th width="90" scope="col">������</th>
				<th width="90" scope="col">�ذ���</th>
			  </tr>
			  	<c:choose>
				<c:when test="${glist!= null && !empty glist}">
			  	<c:forEach items="${glist}" var="gongsa" varStatus="idx">
				  <tr onmouseover="trMoouseOver(this)" onmouseout="trMoouseOut(this)" onclick="goView('${gongsa.CONSTNUM}');" style="cursor:pointer">
					<td>${gongsa.RNUM}</td>
					<td>${gongsa.LINENAME}</td>
					<td>${gongsa.ANNOUNCEDATE}</td>
					<td>${gongsa.CONSTCATEG}</td>
					<td>
					<c:choose>
					<c:when test="${gongsa.STARTSECTION == null}">
					</c:when>
					<c:otherwise>
					${gongsa.STARTSECTION}���� <br/>${gongsa.ENDSECTION}����
					</c:otherwise>
					</c:choose>
					</td>
					<td>${gongsa.LENGTH}</td>
					<td>${gongsa.STARTDATE}</td>
					<td>${gongsa.ENDDATE}</td>
				  </tr>
				</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
					<td colspan="8" scope="col">
						�˻������ �����ϴ�.
					</td>
					</tr>
				</c:otherwise>
				</c:choose>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr style="height:36px">
			<td align="center">
				<table border="0" cellpadding="0" cellspacing="0">
					<tr>
						${strPageDivideForm}
					</tr>
				</table>
			</td>
		</tr>
	  </table>
	  
	  <iframe style="width:100%;height:100%;" id="gongsaDetail" name="gongsaDetail" frameborder="0" scrolling="no" src="" onload="iFrameResize(this);"></iframe>
    </div>
  </div>
</div>
</body>
</html>
