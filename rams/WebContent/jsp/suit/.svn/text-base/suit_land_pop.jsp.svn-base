<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script language="javascript" src="/rams/js/calculation.js"></script>
<script language="javascript" src="/rams/js/Ajax_request.js"></script>
<script type="text/javascript">
//구코드 변경
function changeGuCode(){
	var _guCode = getValueSelectTag("GU_CD");
	var param = "&GU_CD="+_guCode;
	sendRequest("/rams/common/get_dong_list.do", param, "GET", ResultChangeGuCode);
}

////////////////////////////////AJAX////////////////////////////////////////////

function	ResultChangeGuCode(obj)
{
	fncSelectBoxSetting(obj, "DONG_CD", "", ":동선택:");
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

function init(){
	var msg = '${MSG}';
	if(msg != ''){
		alert(msg);
		return;
	}else{
		return;
	}
}

function initForm(){
	var form = document.form;
	
	var new_option;
	
	var _GuCd = document.getElementById("GU_CD");
	var _categ = document.getElementById("CATEG");
	
	var value_GuCd;
	var value_DongCd;
	
	<c:forEach items="${guList}" var="guList">
		if('${guList.GU_CD}' != ''){
			new_option = new Option('${guList.GU_NM}','${guList.GU_CD}');
			_GuCd.options.add(new_option);
		}
	</c:forEach>
	<c:forEach items="${jimokList}" var="jimokList">
		if('${jimokList.CODEVALUE}' != ''){
			new_option = new Option('${jimokList.CODEDESC}','${jimokList.CODEVALUE}');
			_categ.options.add(new_option);
		}
	</c:forEach>
}

function goSave(){
	
	if(!confirm("저장하시겠습니까?")){
        return;
    }
	
	var	result	= DataCheck();
	if(result	==	false)
		return;
	
	var form = document.form;
	form.action = "/rams/suit/suit_land_pop_add.do";
	form.submit();
}

function goDelete(affairNum,pnu){
	
	if(!confirm("토지를 삭제할경우 관련 정보가 모두 삭제됩니다. 삭제하시겠습니까?")){
        return;
    }
	
	var form = document.form;
	form.action = "/rams/suit/suit_land_pop_del.do?DEL_AFFAIRNUM="+affairNum+"&DEL_PNU="+pnu;
	form.submit();
}

function	DataCheck()
{
    var form 	= document.form;
    var	str		= "";
	// 기본사항
	// 토지정보
	if(getValueSelectTag("DONG_CD").length	< 1)    
    {
        str	+= "법정동을 선택하세요\n";
        alert(str);
        form.DONG_CD.focus();
    }
    else if(form.BONBUN.value.length	< 1)
    {
        str	+= "본번을 입력하세요\n";
        alert(str);
        form.BONBUN.focus();
    }
    else if(form.BUBUN.value.length	< 1)
    {
        str	+= "부번을 입력하세요\n";
        alert(str);
        form.BUBUN.focus();
    }
    else if(form.TOTALAREA.value.length	< 1)
    {
        str	+= "총면적을 입력하세요\n";
        alert(str);
        form.TOTALAREA.focus();
    }
    else if(form.LAWSUITAREA.value.length	< 1)
    {
        str	+= "사건면적을 입력하세요\n";
        alert(str);
        form.LAWSUITAREA.focus();
    }
    else if(getValueSelectTag("CATEG").length	< 1)    
    {
        str	+= "지목을 선택하세요\n";
        alert(str);
        form.CATEG.focus();
    }
	
    if(str	== "")
    {
        return	true;
    }

    return	false;
}


</script>
</head>
<body onload="init();initForm();">
<form name="form" id="form" method="post">
<input type="hidden" id="AFFAIRNUM" name="AFFAIRNUM" value="${AFFAIRNUM}"></input>
<input type="hidden" id="PNU" name="PNU" value="${PNU}"></input>
<div id="cont02">
	  <h3><img src="/rams/images/suit/st_srch.gif" alt="대상 토지 목록 조회"/></h3>
	  <!-- 기본사항 -->
	  <table width="815" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="810" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="300" scope="col">주			소</th>
				<th width="90" scope="col">전체면적</th>
				<th width="90" scope="col">사건면적</th>
				<th width="90" scope="col">지  목</th>
				<th width="90" scope="col">총금액</th>
				<th width="80" scope="col">등록일자</th>
				<th width="70" scope="col">저장/삭제</th>
			  </tr>
			  
			  <c:forEach items="${blist}" var="blist">
			  <tr>
				<td>${blist.LAND_ADDR}</td>
				<td>${blist.TOTALAREA}</td>
				<td>${blist.LAWSUITAREA}</td>
				<td>${blist.CATEG}</td>
				<td>${blist.TOTAL_PRICE}</td>
				<td>${blist.REGISTDATE}</td>
				<td><img src="/rams/images/common/btn_del3.gif" alt="삭제" width="62" height="19" onclick="goDelete('${blist.AFFAIRNUM}','${blist.PNU}');" style="cursor:pointer;" /></td>
			  </tr>
	   		  </c:forEach>
	   		  	<tr>
					<td>
						<select id="GU_CD" name="GU_CD" class="formBox2" onchange="changeGuCode();">
							<option value="%">:자치구:</option>
						</select>
						&nbsp;
						<select id="DONG_CD" name="DONG_CD" class="formBox2">
							<option value="%">:법정동:</option>
						</select>
						&nbsp;
						<input id="BONBUN" name="BONBUN" type="text" class="formBox9" maxlength="4"/>
						&nbsp;-&nbsp;
						<input id="BUBUN" name="BUBUN" type="text" class="formBox9" maxlength="4"/>
					</td>
					<td><input id="TOTALAREA" name="TOTALAREA" type="text" class="formBox7" value="${view.LAWSUITAREA}" style="text-align:center;" onKeyDown="onlyNumberInput();" maxlength="13" /></td>
					<td><input id="LAWSUITAREA" name="LAWSUITAREA" type="text" class="formBox7" value="${view.LAWSUITAREA}" style="text-align:center;" onKeyDown="onlyNumberInput();" maxlength="13" /></td>
					<td>
						<select id="CATEG" name="CATEG" class="formBox7">
							<option value="%">:지목:</option>
						</select>
					</td>
					<td><input id="TOTAL_PRICE" name="TOTAL_PRICE" type="text" class="formBox7" value="" onKeyDown="onlyNumberInput();" onKeyDown="onlyNumberInput();" maxlength="13" style="text-align:center;" /></td>
					<td></td>
					<td><img src="/rams/images/common/btn_save.gif" alt="저장" width="62" height="19" border="0" style="cursor:pointer;" onclick="goSave();"/></td>
				</tr>
			</table>

		  </td>
		</tr>
	  </table>
	  <table width="810" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="70" height="30" align="right"><a href="#" onclick="window.close();"><img src="/rams/images/common/btn_close3.gif" alt="취소" width="62" height="19" border="0" /></a></td>
		</tr>
	  </table>
</div>
</form>
</body>
</html>
