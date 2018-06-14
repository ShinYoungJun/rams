<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: ����� �����������ý��� :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script language="javascript" src="/rams/js/calculation.js"></script>
<script language="javascript" src="/rams/js/PopupCalendarSuitView.js"></script> 
<script language="javascript" src="/rams/js/Ajax_request.js"></script>
<script type="text/javascript">
function priceViewModify(){
	document.getElementById("viewMode").innerHTML = 
		"<img src='/rams/images/common/btn_save.gif' alt='�Ұ�����' width='62' height='19' onclick='priceViewSave()' style='cursor:pointer;'/>&nbsp;&nbsp;"+
		"<img src='/rams/images/common/btn_cancel.gif' alt='�Ұ����' width='62' height='19' onclick='priceViewCancel()' style='cursor:pointer;'/>";
	var lawSuitPrice = document.getElementById("LAWSUITPRICE");
	var unfairProfit = document.getElementById("UNFAIRPROFIT");
	
	lawSuitPrice.style.border = '1px solid #9a9a9a';
	unfairProfit.style.border = '1px solid #9a9a9a';
	lawSuitPrice.readOnly = false;
	unfairProfit.readOnly = false;
	
}

function priceViewSave(){
	
	if(!confirm("�����Ͻðڽ��ϱ�?")){
        return;
    }
	
	var form = document.form;
	form.action = "/rams/suit/suit_price_view_modify.do";
	form.submit();
}

function priceViewCancel(){
	document.getElementById("viewMode").innerHTML = 
		"<img src='/rams/images/common/btn_modify2.gif' alt='�Ұ�����' width='62' height='19' onclick='priceViewModify()' style='cursor:pointer;'/>";
		
	var lawSuitPrice = document.getElementById("LAWSUITPRICE");
	var unfairProfit = document.getElementById("UNFAIRPROFIT");
	lawSuitPrice.value = '${view.LAWSUITPRICE}';
	unfairProfit.value = '${view.UNFAIRPROFIT}';
	lawSuitPrice.style.border = '0px solid #9a9a9a';
	unfairProfit.style.border = '0px solid #9a9a9a';
	lawSuitPrice.readOnly = true;
	unfairProfit.readOnly = true;
		
		
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

function calRawSuitPrice(idx){
	var unFairProfitArr = document.getElementsByName("UNFAIRPROFIT_ARR");
	var lawSuitAreaArr = document.getElementsByName("LAWSUITAREA_ARR");
	var startDayArr = document.getElementsByName("STARTDAY_ARR");
	var endDayArr = document.getElementsByName("ENDDAY_ARR");
	var rateArr = document.getElementsByName("RATE_ARR");
	var dayCntArr = document.getElementsByName("DAYCNT_ARR");
	var sumArr = document.getElementsByName("SUM_ARR");
	var statusArr = document.getElementsByName("STATUS_ARR");
	
	var startDay = removeDash(startDayArr[idx].value);
	var endDay = removeDash(endDayArr[idx].value);
	
	if(startDay == ''){
		
		return;
	}else if(endDay == ''){
		
		return;
	}else if(startDay >= endDay){
		alert("�Ⱓ�������� �����Ϻ��� Ŀ���մϴ�.");
		return;
	}
	
	dayCntArr[idx].value = getDiffDay(startDay,endDay);
	
	var day = dayCntArr[idx].value/365;
	var unfairProfit = removeComma(unFairProfitArr[idx].value);
	var rate;
	
	if(!rateArr[idx].value == ''){
		rate = rateArr[idx].value/100;
	}else{
		rate = 0;
		rateArr[idx].value = '0';
	}
	
	sumArr[idx].value = insertComma2(Math.floor(fixFloatCal(unfairProfit*rate*day)));
	
	if(statusArr[idx].value != 'add'){
		statusArr[idx].value = 'modify';
	}
}

function goSave(){
	
	if(!confirm("�����Ͻðڽ��ϱ�?")){
        return;
    }
	
	var form = document.form;
	form.action = "/rams/suit/suit_price_view_list_save.do";
	form.submit();
}

function goDelete(idx){
	if(!confirm("�����Ͻðڽ��ϱ�?")){
        return;
    }
	
	var affairNum = document.getElementById("AFFAIRNUM");
	var pnu = document.getElementById("PNU");
	var lawSuitSeq_arr = document.getElementsByName("LAWSUITSEQ_ARR");
	
	var form = document.form;
	form.action = "/rams/suit/suit_price_view_list_delete.do?LAWSUITSEQ="+lawSuitSeq_arr[idx].value;
	form.submit();
	
}


</script>
</head>
<body onload="init();">
<form name="form" id="form" method="post">
<input id="AFFAIRNUM" name="AFFAIRNUM" type="hidden" value="${AFFAIRNUM}" />
<input id="PNU" name="PNU" type="hidden" value="${PNU}" />
<div id="cont01">
  <!-- �����丮 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > <a href="#" class="blue1">�Ҽ���������</a> > <strong>�Ұ�����</strong></td>
    </tr>
  </table>
  </div>
  
  <!-- �˻� -->
  <div>
    <h2><img src="/rams/images/suit/tt02.gif" alt="�Ҽ���������_�Ұ� ����" /></h2>	
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><a href="/rams/suit/suit_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image23','','/rams/images/suit/02tab01_on.gif',1)"><img src="/rams/images/suit/02tab01_off.gif" alt="�Ҽ�����" name="Image23" width="91" height="29" border="0" id="Image23" /></a></td>
          <td width="91"><img src="/rams/images/suit/02tab02_on.gif" alt="�Ұ� ����" /></td>
          <td width="91"><a href="/rams/suit/suit_anal_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image14','','/rams/images/suit/02tab03_on.gif',1)"><img src="/rams/images/suit/02tab03_off.gif" alt="���" name="Image14" border="0" id="Image14" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	<div class="list">
	
	
	  <!-- �Ұ� ��ȸ -->

	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont2"><img src="/rams/images/suit/st_srch3.gif" alt="�Ұ� ��ȸ" width="66" height="19" /></th>
		  <td width="140" align="right" class="cont2">
		  <div id="viewMode" style="width:140">
		  	<img src='/rams/images/common/btn_modify2.gif' alt='�Ұ�����' width='62' height='19' onclick='priceViewModify()' style='cursor:pointer;' />
		  </div>
		  </td>
	    </tr>
	  </table>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">��� ��ȣ</th>
				<td width="286" style="text-align:left;padding-left:10px">${view.AFFAIRNUM}</td>
				<th width="120" scope="row">��� �� </th>
				<td style="text-align:left;padding-left:10px">${view.AFFAIRNAME}</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">��� ����</th>
				<td colspan="3" style="text-align:left;padding-left:10px">${view.SUITLAND}</td>
			  </tr>
			  <tr>
				<th scope="row">��� ����(��)</th>
				<td style="text-align:left;padding-left:10px">${view.LAWSUITAREA}</td>
				<th width="120" scope="row">���� �հ� </th>
				<td style="text-align:left;padding-left:10px">${view.SUM}</td>
			  </tr>
			  <tr>
				<th scope="row">�Ұ�</th>
				<td style="text-align:left;padding-left:5px">
				<input id="LAWSUITPRICE" name="LAWSUITPRICE" type="text" class="formBox7" value="${view.LAWSUITPRICE}" onKeyDown="onlyNumberInput();" onkeyup="fn_addComma(this)" maxlength="13" style="border:0px;" readonly="readonly"/>
				</td>
				<th scope="row">�δ��̵�� </th>
				<td style="text-align:left;padding-left:5px">
				<input id="UNFAIRPROFIT" name="UNFAIRPROFIT" type="text" class="formBox7" value="${view.UNFAIRPROFIT}" onKeyDown="onlyNumberInput();" onkeyup="fn_addComma(this)" maxlength="13" style="border:0px;" readonly="readonly"/>
				</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  <br/>
	  <br/>
	  <!-- ���� ���� �� ���� -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont2"><img src="/rams/images/suit/st_info.gif" alt="���� ���� �� ����"/></th>
		  <td width="70" align="right" class="cont2"><img src="/rams/images/common/btn_save.gif" alt="����" width="62" height="19" onclick="goSave();" style="cursor:pointer;" /></td>
	    </tr>
	  </table>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="90" scope="row">�δ��̵��</th>
				<th width="90" scope="row">��� ����(��)</th>
				<th width="110" scope="row">�Ⱓ(����)</th>
				<th width="110" scope="row">�Ⱓ(����)</th>
				<th width="70" scope="row">����(%)</th>
				<th width="90" scope="row">�ϼ�</th>
				<th width="93" scope="row">�հ�</th>
				<th width="90" scope="row">�������</th>
				<th width="70" scope="row">��  ��</th>
			  </tr>
				<c:forEach items="${viewList}" var="viewList" varStatus="idx">
				<tr>
				<td><input name="UNFAIRPROFIT_ARR" type="text" class="formBox7" value="${view.UNFAIRPROFIT}" style="border:0px;text-align:center;" readonly="readonly"/></td>
				<td><input name="LAWSUITAREA_ARR" type="text" class="formBox7" value="${view.LAWSUITAREA}" style="border:0px;text-align:center;" readonly="readonly"/></td>
				<td><input name="STARTDAY_ARR" type="text" class="formBox2" value="${viewList.STARTDAY}" onclick="popUpCalendar(this,this,'yyyymmdd','${idx.count-1}')" style="cursor:pointer;text-align:center;" readonly="readonly"/></td>
				<td><input name="ENDDAY_ARR" type="text" class="formBox2" value="${viewList.ENDDAY}" onclick="popUpCalendar(this,this,'yyyymmdd','${idx.count-1}')" style="cursor:pointer;text-align:center;" readonly="readonly"/></td>
				<td><input name="RATE_ARR" type="text" class="formBox9" value="${viewList.RATE}" onKeyDown="onlyNumberInput();" onkeyup="calRawSuitPrice('${idx.count-1}');" style="text-align:center;" /></td>
				<td><input name="DAYCNT_ARR" type="text" class="formBox7" value="${viewList.DAYCNT}" style="border:0px;text-align:center;" readonly="readonly"/></td>
				<td><input name="SUM_ARR" type="text" class="formBox7" value="${viewList.SUM}" style="border:0px;text-align:center;" readonly="readonly"/></td>
				<td><input name="REGISTDATE_ARR" type="text" class="formBox7" value="${viewList.REGISTDATE}" style="border:0px;text-align:center;" readonly="readonly"/></td>
				<td>
					<input name="STATUS_ARR" type="hidden" value=""/>
					<input name="LAWSUITSEQ_ARR" type="hidden" value="${viewList.LAWSUITSEQ}"/>
					<img src="/rams/images/common/btn_del3.gif" alt="����" width="62" height="19" onclick="goDelete('${idx.count-1}');" style="cursor:pointer;" />
				</td>
				</tr>
				</c:forEach>
				<tr>
				<td><input name="UNFAIRPROFIT_ARR" type="text" class="formBox7" value="${view.UNFAIRPROFIT}" style="border:0px;text-align:center;" readonly="readonly"/></td>
				<td><input name="LAWSUITAREA_ARR" type="text" class="formBox7" value="${view.LAWSUITAREA}" style="border:0px;text-align:center;" readonly="readonly"/></td>
				<td><input name="STARTDAY_ARR" type="text" class="formBox2" value="" onclick="popUpCalendar(this,this,'yyyymmdd','${viewListCount}')" style="cursor:pointer;text-align:center;" readonly="readonly"/></td>
				<td><input name="ENDDAY_ARR" type="text" class="formBox2" value="" onclick="popUpCalendar(this,this,'yyyymmdd','${viewListCount}')" style="cursor:pointer;text-align:center;" readonly="readonly"/></td>
				<td><input name="RATE_ARR" type="text" class="formBox9" value="" onKeyDown="onlyNumberInput();" onkeyup="calRawSuitPrice('${viewListCount}');"  style="text-align:center;" /></td>
				<td><input name="DAYCNT_ARR" type="text" class="formBox7" value="" style="border:0px;text-align:center;" readonly="readonly"/></td>
				<td><input name="SUM_ARR" type="text" class="formBox7" value="" style="border:0px;text-align:center;" readonly="readonly"/></td>
				<td><input name="REGISTDATE_ARR" type="text" class="formBox7" value="" style="border:0px;text-align:center;" readonly="readonly"/></td>
				<td>
					<input name="STATUS_ARR" type="hidden" value="add"/>
				</td>
				</tr>
			</table>
			</td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <td height="24" align="right" class="cont2">
		  	<img src="/rams/images/common/btn_list2.gif" alt="���" width="62" height="19" onclick="location.href='/rams/suit/suit_price_list.do'" style="cursor:pointer;" />
		  </td>
	    </tr>
	  </table>	  
	</div>
  </div>
</div>
</form>
</body>
</html>
