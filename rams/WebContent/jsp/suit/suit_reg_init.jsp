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

// ���ڵ� ����
function changeGuCode(){
	var _guCode = getValueSelectTag("GU_CD");
	var param = "&GU_CD="+_guCode;
	sendRequest("/rams/common/get_dong_list.do", param, "GET", ResultChangeGuCode);
}


////////////////////////////////AJAX////////////////////////////////////////////

function	ResultChangeGuCode(obj)
{
	fncSelectBoxSetting(obj, "DONG_CD", "", "::������::");
}

function fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)
{
    var xmldoc = new ActiveXObject("Microsoft.XMLDOM");
    var selectBoxLabel;
    var root;
    var selectBoxValue;
    var opt 	= document.getElementById(selectBoxId);
    var tags	= "";
    var	text	= "";

    for(var i = opt.options.length - 1 ; i > -1 ; i--)
    {
    	opt.options[i]	= null;
    }

    xmldoc.async	= false;

	xmldoc.loadXML(strParam);


	root = xmldoc.getElementsByTagName("option").length;


    if(root <= 0)
    {
        tags 	= document.createElement("option");
        text	= document.createTextNode("");
        tags.setAttribute("label", "");
        tags.appendChild(text);
        tags.value = 0;
        opt.appendChild(tags);
        return;
    }

    if(topLabel != null && topLabel != "")
	{
        tags 	= document.createElement("option");
        text	= document.createTextNode(topLabel);
        tags.setAttribute("label", topLabel);
        tags.appendChild(text);
        tags.value = '';
        opt.appendChild(tags);
    }
	
    for(var i = 0; i < root; i++)
    {
    	
    	selectBoxValue = xmldoc.getElementsByTagName("option/@value").item(i).text;
    	selectBoxLabel = xmldoc.getElementsByTagName("option/@label").item(i).text;

        tags 	= document.createElement("option");
   		text	= document.createTextNode(selectBoxLabel);

        tags.setAttribute("label", selectBoxLabel);

        tags.value = selectBoxValue;
        tags.appendChild(text);
        opt.appendChild(tags);
    }   
}


function goSearch(){
	var form = document.form;
	form.action = "/rams/suit/suit_reg_init.do";
	form.submit();
}

function goCancel(){
	var form = document.form;
	form.action = "/rams/suit/suit_list.do";
	form.submit();
}

function goRegSuit(){
	var form = document.form;
	form.action = "/rams/suit/suit_reg.do";
	form.submit();
	
}

function goRegAfterSuit(){
	if(document.getElementById("AFFAIRNUM").value != null && document.getElementById("AFFAIRNUM").value != ''){
		var form = document.form;
		form.action = "/rams/suit/suit_after_reg.do";
		form.submit();
	}else{
		alert("��޽� ����� ���� �Ѱ��� ����� �����ϼ���");
	}
	
	
}


function initSearchForm(){
	var form = document.form;
	
	var new_option;
	
	var _GuCd = document.getElementById("GU_CD");
	var _DongCd = document.getElementById("DONG_CD");
	
	var value_GuCd;
	var value_DongCd;
	
	<c:forEach items="${guList}" var="guList">
		if('${guList.GU_CD}' != ''){
			new_option = new Option('${guList.GU_NM}','${guList.GU_CD}');
			if(new_option.value == '${GU_CD}'){
				new_option.selected = true;
			}
			_GuCd.options.add(new_option);
		}
	</c:forEach>
	<c:forEach items="${dongList}" var="dongList">
		if('${dongList.BJ_CD}' != ''){
			new_option = new Option('${dongList.BJ_NM}','${dongList.BJ_CD}');
			if(new_option.value == '${DONG_CD}'){
				new_option.selected = true;
			}
			_DongCd.options.add(new_option);
		}
	</c:forEach>
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


function checkItem(obj){
	
	var selectItem_arr = document.getElementsByName("SELECT_ITEM");
	var affairNum_arr = document.getElementsByName("AFFAIRNUM_ARR");
	var pnu_arr = document.getElementsByName("PNU_ARR");

	for(var i = 0; i < selectItem_arr.length; i ++){
		if(selectItem_arr[i] == obj){
			document.getElementById("AFFAIRNUM").value = affairNum_arr[i].value;
			document.getElementById("PNU").value = pnu_arr[i].value;
		}else{
			selectItem_arr[i].checked = false;
		}
	}
	
}


</script>
</head>
<body onload="init();initSearchForm();">
<form name="form" id="form" method="post">

<input id="AFFAIRNUM" name="AFFAIRNUM" type="hidden" value=""></input>
<input id="PNU" name="PNU" type="hidden" value=""></input>

<div id="cont01">
  <!-- �����丮 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > <a href="#" class="blue1">�Ҽ���������</a> > <strong>�Ҽ�����</strong></td>
    </tr>
  </table>
  </div>
  
  <!-- �˻� -->
  <div>
    <h2><img src="/rams/images/suit/tt01.gif" alt="�Ҽ���������_�Ҽ�����" width="160" height="22" /></h2>	
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><img src="/rams/images/suit/02tab01_on.gif" alt="�Ҽ�����" /></td>
          <td width="91"><a href="/rams/suit/suit_price_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image13','','/rams/images/suit/02tab02_on.gif',1)"><img src="/rams/images/suit/02tab02_off.gif" alt="�Ұ�����" name="Image13" border="0" id="Image13" /></a></td>
          <td width="91"><a href="/rams/suit/suit_anal_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image14','','/rams/images/suit/02tab03_on.gif',1)"><img src="/rams/images/suit/02tab03_off.gif" alt="���" name="Image14" border="0" id="Image14" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="5" height="50"><img src="/rams/images/suit/srch_bg1.gif" alt="." /></td>
		  <td background="/rams/images/suit/srch_bg2.gif" class="srch"><table width="787" border="0" cellspacing="0" cellpadding="0">
            <tr>
              <td height="20" colspan="5" class="t_org">�� ���� ���� üũ�� ���� �Է��ϰ��� �ϴ� ����� ������ ���� �˻��ϼ���.</td>
              </tr>
            <tr>
              <td width="90"><strong>��� ���� �˻�</strong></td>
              <td width="130">
           		<select id="GU_CD" name="GU_CD" class="formBox1" onchange="changeGuCode();">
					<option value="%">::������::</option>
				</select>
              </td>
              <td width="130">
				<select id="DONG_CD" name="DONG_CD" class="formBox1">
					<option value="%">::������::</option>
				</select>
              </td>
              <td width="130"><input id="BUNJI" name="BUNJI" type="text" class="formBox1" value="${BUNJI}"/></td>
              <td width="307"><a href="#" onclick="goSearch();"><img src="/rams/images/common/btn_srch3.gif" alt="�˻�" width="44" height="17" border="0" /></a></td>
            </tr>
          </table></td>
		  <td width="5"><img src="/rams/images/suit/srch_bg3.gif" alt="."/></td>
		</tr>
	  </table>
	</div>
    <div class="list">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
	      <td height="19" align="right" valign="top"><a href="#" onclick="goRegSuit();"><img src="/rams/images/common/btn_enroll2.gif" alt="�űԵ��" border="0" /></a></td>
	      <td align="right" valign="top" width="70"><a href="#" onclick="goRegAfterSuit();"><img src="/rams/images/common/btn_enroll3.gif" alt="��޽ɵ��" border="0" /></a></td>
		</tr>
	  </table>
	  
	  <h3><img src="/rams/images/suit/st_rst.gif" alt="�˻����" /></h3>
	  <br/>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
		  	  <tr>
		  	  	<th width="33" rowspan="2" scope="col">����</th>
				<th width="80" rowspan="2" scope="col">��ǹ�ȣ</th>
				<th width="100" rowspan="2" scope="col">��Ǹ�</th>
				<th width="120" rowspan="2" scope="col">�������</th>
				<th width="80" rowspan="2" scope="col">�ǰἱ������</th>
				<th width="100" rowspan="2" scope="col">�ǰ���</th>
				<th width="300" colspan="3" scope="col">��   ��   ��   ��</th>
			  </tr>
			  <tr>
				<th width="120" scope="col">��   ��</th>
				<th width="80" scope="col">��ǹ�ȣ</th>
				<th width="100" scope="col">��   ��</th>
			  </tr>
				<c:choose>
	   			<c:when test="${blist!= null && !empty blist}">
	   			<c:forEach items="${blist}" var="blist">
	   			<tr>
	   				<td>
				  		<INPUT TYPE="checkbox" NAME="SELECT_ITEM" onclick="checkItem(this);">
						<INPUT TYPE="hidden" NAME="AFFAIRNUM_ARR" value="${blist.AFFAIRNUM}">
						<INPUT TYPE="hidden" NAME="PNU_ARR" value="${blist.PNU}"> 
	   				</td>
	   				<td>${blist.AFFAIRNUM}</td>
	   				<td>${blist.AFFAIRNAME}</td>
	   				<td>${blist.LAND_ADDR}</td>
	   				<td>${blist.ANNOUNCEDATE}</td>
	   				<td>${blist.OUTCOME}</td>
	   				<td>${blist.PRE_COURT}</td>
	   				<td>${blist.PRE_AFFAIRNUM}</td>
	   				<td>${blist.PRE_OUTCOME}</td>
	   			</tr>
	   			</c:forEach>
	   			</c:when>
	   			<c:otherwise>
	   				<tr>
	   				<td colspan="10" scope="col">
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
  		<tr>
		<td height="30" align="center">
	  	  	<table border="0" cellpadding="0" cellspacing="0">
				<tr>
					${strPageDivideForm}
				</tr>
			</table>
		</td>
	  	</tr>
		<tr>
	      <td height="26" align="right" valign="bottom"><a href="#" onclick="goCancel();"><img src="/rams/images/common/btn_cancel.gif" alt="���" border="0"/></a></td>
		</tr>
	  </table>
	</div>
  </div>
</div>
</form>
</body>
</html>
