<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script language="javascript" src="/rams/js/PopupCalendar.js"></script> 
<script language="javascript" src="/rams/js/Ajax_request.js"></script>
<script type="text/javascript">
function addSearchForm(){
	
	var _searchType = getValueSelectTag("search_type");
	var _searchForm = document.getElementById("search_form");
	
	var year = new Date().getYear();
	
	if(_searchType == 'affairnum'){
		var html = "<select id='selectYearValue' name='selectYearValue' class='formBox2'>" +
	    "<option value=''>::선택::</option>";
	    
	    for(var i=year-20;i<=year;i++){
			html +="<option";
			html+=" value='"+i+"'>"+i+"년</option>";
		}

		  html += "</select>";
		  html += "&nbsp;&nbsp;";
		  html += "<select id='selectDanValue' name='selectDanValue' class='formBox2'>";
		  html += "<option value=''>::선택::</option>";
		  html += "<option value='다'>다</option>";
		  html += "<option value='나'>나</option>";
		  html += "<option value='구단'>구단</option>";
		  html += "<option value='가단'>가단</option>";
		  html += "<option value='가합'>가합</option>";
		  html += "<option value='가소'>가소</option>";
		  html += "</select>";
		  html += "&nbsp;&nbsp;";
		  html += "<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:150px'/>";
	 
	  _searchForm.innerHTML = html;
		
	}else if(_searchType == 'affairname'){
		_searchForm.innerHTML = "<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:320px'/>";
		
	}else if(_searchType == 'affairland'){
		var html = "<select id='selectGuValue' name='selectGuValue' class='formBox2' onchange='changeGuCode();'>";
		html += "<option value=''>구선택</option>";
		
	    <c:forEach items="${guList}" var="guList">
	    	html +="<option value='${guList.GU_CD}'>${guList.GU_NM}</option>";
    	</c:forEach>
		
		  html += "</select>";
		  html += "&nbsp;&nbsp;";
		  html += "<select id='selectDongValue' name='selectDongValue' class='formBox2'>";
		  html += "</select>";
		  html += "&nbsp;&nbsp;";
		  html += "<input id='searchBonbun' name='searchBonbun' type='text' class='formBox3' style='width:40px' maxlength='4'/>";
		  html += "&nbsp;-&nbsp;";
		  html += "<input id='searchBubun' name='searchBubun' type='text' class='formBox3' style='width:40px' maxlength='4'/>";
		
		_searchForm.innerHTML = html;
		
	}else if(_searchType == 'username'){
		_searchForm.innerHTML = "<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:320px'/>";
		
	}
}

function changeGuCode(){
	var _guCode = getValueSelectTag("selectGuValue");
	var param = "&GU_CD="+_guCode;
	sendRequest("/rams/common/get_dong_list.do", param, "GET", ResultChangeGuCode);
}


////////////////////////////////AJAX////////////////////////////////////////////

function	ResultChangeGuCode(obj)
{
	fncSelectBoxSetting(obj, "selectDongValue", "", "동선택");
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


function goReg(){
	var form = document.form;
	form.action = "/rams/suit/suit_reg_init.do";
	form.submit();
}

function goView(num,pnu){
	var form = document.form;
	form.action = "/rams/suit/suit_view.do?AFFAIRNUM="+num+"&PNU="+pnu;
	form.submit();
	
}

function goSearch(){
	
	var form = document.form;
	document.getElementById("SEARCHTYPE").value = getValueSelectTag('search_type');
	
	document.getElementById("NUM_YEAR").value = "";
	document.getElementById("NUM_DAN").value = "";
	document.getElementById("NUM_NUM").value = "";
	document.getElementById("NAME_NAME").value = "";
	document.getElementById("LAND_GU").value = "";
	document.getElementById("LAND_DONG").value = "";
	document.getElementById("LAND_BONBUN").value = "";
	document.getElementById("LAND_BUBUN").value = "";
	document.getElementById("USERNAME_NAME").value = "";
	
	var _searchType = getValueSelectTag("search_type");
	if(_searchType == 'affairnum'){
		document.getElementById("NUM_YEAR").value = getValueSelectTag('selectYearValue');
		document.getElementById("NUM_DAN").value = getValueSelectTag('selectDanValue');
		document.getElementById("NUM_NUM").value = document.getElementById('searchValue').value;
	}else if(_searchType == 'affairname'){
		document.getElementById("NAME_NAME").value = document.getElementById('searchValue').value;
	}else if(_searchType == 'affairland'){
		document.getElementById("LAND_GU").value = getValueSelectTag('selectGuValue');
		document.getElementById("LAND_DONG").value = getValueSelectTag('selectDongValue');
		document.getElementById("LAND_BONBUN").value = document.getElementById("searchBonbun").value;
		document.getElementById("LAND_BUBUN").value = document.getElementById("searchBubun").value;
	}else if(_searchType == 'username'){
		document.getElementById("USERNAME_NAME").value = document.getElementById("searchValue").value;
	}
	

	form.action = "/rams/suit/suit_list.do";
	form.submit();
}

function goSearchExcel(){
	
	var form = document.form;
	document.getElementById("SEARCHTYPE").value = getValueSelectTag('search_type');
	
	document.getElementById("NUM_YEAR").value = "";
	document.getElementById("NUM_DAN").value = "";
	document.getElementById("NUM_NUM").value = "";
	document.getElementById("NAME_NAME").value = "";
	document.getElementById("LAND_GU").value = "";
	document.getElementById("LAND_DONG").value = "";
	document.getElementById("LAND_BONBUN").value = "";
	document.getElementById("LAND_BUBUN").value = "";
	document.getElementById("USERNAME_NAME").value = "";
	
	
	var _searchType = getValueSelectTag("search_type");
	if(_searchType == 'affairnum'){
		document.getElementById("NUM_YEAR").value = getValueSelectTag('selectYearValue');
		document.getElementById("NUM_DAN").value = getValueSelectTag('selectDanValue');
		document.getElementById("NUM_NUM").value = document.getElementById('searchValue').value;
	}else if(_searchType == 'affairname'){
		document.getElementById("NAME_NAME").value = document.getElementById('searchValue').value;
	}else if(_searchType == 'affairland'){
		document.getElementById("LAND_GU").value = getValueSelectTag('selectGuValue');
		document.getElementById("LAND_DONG").value = getValueSelectTag('selectDongValue');
		document.getElementById("LAND_BONBUN").value = document.getElementById("searchBonbun").value;
		document.getElementById("LAND_BUBUN").value = document.getElementById("searchBubun").value;
	}else if(_searchType == 'username'){
		document.getElementById("USERNAME_NAME").value = document.getElementById("searchValue").value;
	}
	

	form.action = "/rams/suit/suit_list_excel.do";
	form.submit();
}

function initSearchForm(){
	
	var form = document.form;
	
	changeSelectTag('search_type',document.getElementById("SEARCHTYPE").value);
	
	var _searchType = document.getElementById("SEARCHTYPE").value;
	var _searchForm = document.getElementById("search_form");
	
	var year = new Date().getYear();
	
	if(_searchType == 'affairnum'){
		var html = "<select id='selectYearValue' name='selectYearValue' class='formBox2'>" +
	    "<option value=''>::선택::</option>";
	    
	    for(var i=year-20;i<=year;i++){
			html +="<option";
			html+=" value='"+i+"' ";
			if(document.getElementById("NUM_YEAR").value == i){
				html+="selected";
			}
			html+=">"+i+"년</option>";
		}
		  html += "</select>";
		  html += "&nbsp;&nbsp;";
		  html += "<select id='selectDanValue' name='selectDanValue' class='formBox2'>";
		  html += "<option value=''>::선택::</option>";
		  <c:forEach items="${suitCodeList}" var="suitCodeList">
	    	html +="<option value='${suitCodeList.CODEVALUE}'";
	    	if(document.getElementById("NUM_DAN").value == '${suitCodeList.CODEVALUE}'){
	    		html +="selected";
	    	}
	    	html +=">${suitCodeList.CODEDESC}</option>";
    	  </c:forEach>
		  html += "</select>";
		  html += "&nbsp;&nbsp;";
		  html += "<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:150px'value='"+form.NUM_NUM.value+"'/>";
		  
	  _searchForm.innerHTML = html;
		
	}else if(_searchType == 'affairname'){
		_searchForm.innerHTML = "<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:320px' value='"+form.NAME_NAME.value+"'/>";
		
	}else if(_searchType == 'affairland'){
		var html = "<select name='selectGuValue' id='selectGuValue' class='formBox2' onchange='changeGuCode();'>";
		html += "<option value=''>구선택</option>";
		
	    <c:forEach items="${guList}" var="guList">
	    	html +="<option value='${guList.GU_CD}'"
	    	if(document.getElementById("LAND_GU").value == '${guList.GU_CD}'){
	    		html +="selected";
	    	}
	    	html +=">${guList.GU_NM}</option>";
    	</c:forEach>
		
		  html += "</select>";
		  html += "&nbsp;&nbsp;";
		  html += "<select id='selectDongValue' name='selectDongValue' class='formBox2'>";
		  html += "<option value=''>동선택</option>";
		  <c:forEach items="${dongList}" var="dongList">
	    	html +="<option value='${dongList.BJ_CD}'"
	    	if(document.getElementById("LAND_DONG").value == '${dongList.BJ_CD}'){
	    		html +="selected";
	    	}
	    	html +=">${dongList.BJ_NM}</option>";
    	  </c:forEach>
		  html += "</select>";
		  html += "&nbsp;&nbsp;";
		  html += "<input id='searchBonbun' name='searchBonbun' type='text' class='formBox3' style='width:40px' maxlength='4' value='"+form.LAND_BONBUN.value+"'/>";
		  html += "&nbsp;-&nbsp;";
		  html += "<input id='searchBubun' name='searchBubun' type='text' class='formBox3' style='width:40px' maxlength='4' value='"+form.LAND_BUBUN.value+"'/>";
		
		_searchForm.innerHTML = html;
		
	}else if(_searchType == 'username'){
		_searchForm.innerHTML = "<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:320px' value='"+form.USERNAME_NAME.value+"'/>";
		
	}
}

</script>

</head>
<body onload="initSearchForm();">
<form name="form" id="form" method="post">
<input id="SEARCHTYPE" name="SEARCHTYPE" type="hidden" value="${SEARCHTYPE}" />
<input id="NUM_YEAR" name="NUM_YEAR" type="hidden" value="${NUM_YEAR}" />
<input id="NUM_DAN" name="NUM_DAN" type="hidden" value="${NUM_DAN}" />
<input id="NUM_NUM" name="NUM_NUM" type="hidden" value="${NUM_NUM}" />
<input id="NAME_NAME" name="NAME_NAME" type="hidden" value="${NAME_NAME}" />
<input id="LAND_GU" name="LAND_GU" type="hidden" value="${LAND_GU}" />
<input id="LAND_DONG" name="LAND_DONG" type="hidden" value="${LAND_DONG}" />
<input id="LAND_BONBUN" name="LAND_BONBUN" type="hidden" value="${LAND_BONBUN}" />
<input id="LAND_BUBUN" name="LAND_BUBUN" type="hidden" value="${LAND_BUBUN}" />
<input id="USERNAME_NAME" name="USERNAME_NAME" type="hidden" value="${USERNAME_NAME}" />

<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > <a href="#" class="blue1">소송정보관리</a> > <strong>소송정보</strong></td>
    </tr>
  </table>
  </div>
  
  
  <!-- 검색 -->
  <div style="position:relative;">
    <h2><img src="/rams/images/suit/tt01.gif" alt="소송정보관리_소송정보" width="160" height="22" /></h2>
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><img src="/rams/images/suit/02tab01_on.gif" alt="소송정보" /></td>
          <td width="91"><a href="/rams/suit/suit_price_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image13','','/rams/images/suit/02tab02_on.gif',1)"><img src="/rams/images/suit/02tab02_off.gif" alt="소가관리" name="Image13" border="0" id="Image13" /></a></td>
          <td width="91"><a href="/rams/suit/suit_anal_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image14','','/rams/images/suit/02tab03_on.gif',1)"><img src="/rams/images/suit/02tab03_off.gif" alt="통계" name="Image14" border="0" id="Image14" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="5" height="50"><img src="/rams/images/suit/srch_bg1.gif" alt="." /></td>
		  <td background="/rams/images/suit/srch_bg2.gif" class="srch">
			  <table width="787" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td width="43" height="14" ><img src="/rams/images/suit/srch.gif" alt="검색"/></td>
				  <td width="95"><input name="FROMDATE" type="text" class="formBox2" /></td>
				  <td width="23"><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,FROMDATE,'yyyymmdd')" style="cursor:pointer;"/></td>
				  <td width="10">~</td>
				  <td width="95"><input name="TODATE" type="text" class="formBox2" /></td>
				  <td width="50"><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,TODATE,'yyyymmdd')" style="cursor:pointer;"/></td>
				  <td width="90">
				  <select id="search_type" class="formBox2" onchange='addSearchForm();'>
				    <option value='affairnum'>사건번호</option>
				    <option value='affairname'>원고</option>
				    <option value='affairland'>사건토지</option>
				    <option value='username'>담당자</option>
				  </select>				 		  
				   </td>
				  <td>
				  	<div id="search_form">
				   	</div>
				   	
				  </td>
				  <td align="right">
				  	<a href="#" onclick="goSearch()"><img src="/rams/images/common/btn_srch3.gif" alt="검색" border="0" /></a>
				  </td>
				</tr>
				
			  </table>
		  </td>
		  <td width="5"><img src="/rams/images/suit/srch_bg3.gif" alt="."/></td>
		</tr>
	  </table>
	</div>
	
	
    <div class="list">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
	      <td height="26" align="right" valign="top"><a href="#" onclick="goSearchExcel();"><img src="/rams/images/common/btn_print2.gif" alt="대장출력" border="0"/></a></td>
		</tr>
	  </table>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th scope="col">사건번호</th>
				<th scope="col">사건명</th>
				<th scope="col">사건토지</th>
				<th scope="col">원고</th>
				<th scope="col">진행상황</th>
				<th scope="col">변론기일</th>
				<th scope="col">담당자</th>
				<th scope="col">접수일자</th>
			  </tr>
			  <c:forEach items="${list}" var="suitlist">
			  <tr onmouseover="trMoouseOver(this)" onmouseout="trMoouseOut(this)" style="cursor:pointer" onclick="goView('${suitlist.AFFAIRNUM}','${suitlist.PNU}');">
				<td>${suitlist.AFFAIRNUM}</td>
				<td>${suitlist.AFFAIRNAME}</td>
				<td>${suitlist.SUITLAND}</td>
				<td>${suitlist.NAME}</td>
				<td>${suitlist.ANNOUNCE_YN}</td>
				<td>${suitlist.CLOSEDAY}</td>
				<td>${suitlist.USERNAME}</td>
				<td>${suitlist.ACCEPTDATE}</td>
			  </tr>			  
			  </c:forEach>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
	      <td height="26" align="right" valign="bottom"><a href="#" onclick="goReg();"><img src="/rams/images/common/btn_enroll.gif" alt="등록" border="0"/></a></td>
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
</body>
</form>
</html>
