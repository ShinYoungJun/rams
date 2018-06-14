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

function goSearch(){
	var form = document.form;
	form.action = "/rams/cityland/permiss_list.do?SEARCH=Y";
	form.submit();
}


function goView(PP_CLASS_N,LAND_ADDR,USE_N,ADMI_N,ACCOUNT_N,PER_START_DAY,PER_END_DAY,PER_AREA,RATE1,PAY_N,PER_AMT){
	
	document.getElementById("listResult").style.height = '150px';
	document.getElementById("viewResult").style.display = 'block';
	
	document.getElementById("PP_CLASS_N").innerHTML = PP_CLASS_N;
	document.getElementById("LAND_ADDR").innerHTML = LAND_ADDR;
	document.getElementById("USE_ADMI").innerHTML = USE_N+'/'+ADMI_N;
	document.getElementById("ACCOUNT_N").innerHTML= ACCOUNT_N;
	document.getElementById("PER_DAY").innerHTML = PER_START_DAY + ' ~ ' + PER_END_DAY;
	document.getElementById("PER_AREA").innerHTML = PER_AREA +'㎡';
	document.getElementById("RATE1").innerHTML = RATE1;
	document.getElementById("PAY_N").innerHTML = PAY_N;
	document.getElementById("PER_AMT").innerHTML = PER_AMT;
}


function initSearchForm(){
	var form = document.form;
	
	var new_option;
	var _ppClass = document.getElementById("PP_CLASS");
	var _Use = document.getElementById("USE");
	var _Admi = document.getElementById("ADMI");
	var _Account = document.getElementById("ACCOUNT");
	var _MainMana = document.getElementById("MAIN_MANA");
	
    <c:forEach items="${PermissCodeList}" var="PermissCodeList">
		if('${PermissCodeList.CD}' != ''){
	    	new_option = new Option('${PermissCodeList.NM}','${PermissCodeList.CD}');
	    	if(new_option.value == '${PP_CLASS}'){
	    		new_option.selected = true;
	    	}
	    	_ppClass.options.add(new_option);
		}
	</c:forEach>
    <c:forEach items="${UseCodeList}" var="UseCodeList">
		if('${UseCodeList.CD}' != ''){
	    	new_option = new Option('${UseCodeList.NM}','${UseCodeList.CD}');
	    	if(new_option.value == '${USE}'){
	    		new_option.selected = true;
	    	}
	    	_Use.options.add(new_option);
		}
	</c:forEach>
	<c:forEach items="${AdmiCodeList}" var="AdmiCodeList">
		if('${AdmiCodeList.CD}' != ''){
			new_option = new Option('${AdmiCodeList.NM}','${AdmiCodeList.CD}');
	    	if(new_option.value == '${ADMI}'){
	    		new_option.selected = true;
	    	}
			_Admi.options.add(new_option);
		}
	</c:forEach>
	<c:forEach items="${AccountCodeList}" var="AccountCodeList">
		if('${AccountCodeList.CD}' != ''){
			new_option = new Option('${AccountCodeList.NM}','${AccountCodeList.CD}');
	    	if(new_option.value == '${ACCOUNT}'){
	    		new_option.selected = true;
	    	}
			_Account.options.add(new_option);
		}
	</c:forEach>
	<c:forEach items="${MainManaCodeList}" var="MainManaCodeList">
		if('${MainManaCodeList.CD}' != ''){
			new_option = new Option('${MainManaCodeList.NM}','${MainManaCodeList.CD}');
	    	if(new_option.value == '${MAIN_MANA}'){
	    		new_option.selected = true;
	    	}
			_MainMana.options.add(new_option);
		}
	</c:forEach>
	
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

// 구코드 변경
function changeGuCode(){
	var _guCode = getValueSelectTag("GU_CD");
	var param = "&GU_CD="+_guCode;
	sendRequest("/rams/common/get_dong_list.do", param, "GET", ResultChangeGuCode);
}


////////////////////////////////AJAX////////////////////////////////////////////

function	ResultChangeGuCode(obj)
{
	fncSelectBoxSetting(obj, "DONG_CD", "", "::동선택::");
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
</script>





</head>

<body onload="initSearchForm();">
<form name="form" id="form" method="post">
<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > <a href="#" class="blue1">시유지 조회 </a> > <strong>대부사용 허가 </strong></td>
    </tr>
  </table>
  </div>
  
  <!-- 검색 -->
  <div>
    <h2><img src="/rams/images/cityland/tt01.gif" alt="시유지 조회_대부사용 허가"/></h2>
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><img src="/rams/images/cityland/tab01_on.gif" alt="소송정보" /></td>
          <td width="91"><a href="/rams/cityland/dis_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image19','','/rams/images/cityland/tab02_on.gif',1)"><img src="/rams/images/cityland/tab02_off.gif" alt="처분재산" name="Image19" width="91" height="29" border="0" id="Image19" /></a></td>
          <td width="91"><a href="/rams/cityland/moodan_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image20','','/rams/images/cityland/tab03_on.gif',1)"><img src="/rams/images/cityland/tab03_off.gif" alt="무단 점사용" name="Image20" width="91" height="29" border="0" id="Image20" /></a></td>
          <td width="91"><a href="/rams/cityland/base_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image21','','/rams/images/cityland/tab04_on.gif',1)"><img src="/rams/images/cityland/tab04_off.gif" alt="재산 전용" name="Image21" width="91" height="29" border="0" id="Image21" /></a></td>
		  <td width="91"><a href="/rams/cityland/history_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image23','','/rams/images/cityland/tab05_on.gif',1)"><img src="/rams/images/cityland/tab05_off.gif" alt="재산이력" name="Image23" width="91" height="29" border="0" id="Image23" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	<div class="list">
	
	
	  <!-- 대부 및 사용허가 검색 -->
	  <h3><img src="/rams/images/cityland/st_srch1.gif" alt="대부 및 사용허가 검색"/></h3>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">재산구분</th>
				<td colspan="3" class="cont">
				  <select id="PP_CLASS" name="PP_CLASS" class="formBox1">
				  	<option value="">::선택::</option>
				  </select>
				</td>
			  </tr>
			  <tr>
				<th scope="col">소재지</th>
				<td colspan="3" class="cont">
					<table width="454" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="120">
							<select id="GU_CD" name="GU_CD" class="formBox1" onchange="changeGuCode();">
								<option value="">::구선택::</option>
							</select>
						</td>
						<td width="120" class="cont">
							<select id="DONG_CD" name="DONG_CD" class="formBox1">
								<option value="">::동선택::</option>
							</select>
						</td>
						<td class="cont"><input id="BUNJI" name="BUNJI" type="text" class="formBox1" value="${BUNJI}"/></td>
					  </tr>
					</table>
				</td>
			  </tr>
			  <tr>
				<th width="120" scope="col">재산 용도</th>
				<td width="276" class="cont">
					<table width="250" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="120">
							<select id="USE" name="USE" class="formBox1">
								<option value="">::선택::</option>
							</select>
						</td>
						<td width="120" class="cont">
							<select id="ADMI" name="ADMI" class="formBox1">
								<option value="">::선택::</option>
							</select>
						</td>
					  </tr>
					</table>
				</td>
				<th width="120" scope="col">회계 구분 </th>
				<td width="276" class="cont">
				  <select id="ACCOUNT" name="ACCOUNT" class="formBox1">
				  	<option value="">::선택::</option>
				  </select>
				</td>
			  </tr>
			  <tr>
				<th scope="col">재산 관리관 </th>
				<td class="cont">
					<select id="MAIN_MANA" name="MAIN_MANA" class="formBox8">
						<option value="">::선택::</option>
					</select>
				</td>
				<th scope="col">재산 가액</th>
				<td class="cont">
					<table width="220px" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="100"><input id="START_P_AMT" name="START_P_AMT" type="text" class="formBox2" value="${START_P_AMT}"/>원</td>
						<td width="20">~</td>
						<td width="100"><input id="END_P_AMT" name="END_P_AMT" type="text" class="formBox2" value="${END_P_AMT}"/>원</td>
					  </tr>
					</table>
				</td>
			  </tr>
			  <tr>
				<th scope="col">허가 기간</th>
				<td class="cont">
					<table width="246" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="95"><input id="PER_START_DAY" name="PER_START_DAY" type="text" class="formBox2" value="${PER_START_DAY}"/></td>
		                <td width="23"><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,PER_START_DAY,'yyyymmdd')" style="cursor:pointer;"/></td>
				  		<td width="10">~</td>
				  		<td width="95"><input id="PER_END_DAY" name="PER_END_DAY" type="text" class="formBox2" value="${PER_END_DAY}"/></td>
				  		<td width="23"><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,PER_END_DAY,'yyyymmdd')" style="cursor:pointer;"/></td>
					  </tr>
					</table>
				</td>
				<th scope="col">허가 면적 </th>
				<td class="cont">
					<table width="220px" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="100"><input id="START_P_AREA" name="START_P_AREA" type="text" class="formBox2" value="${START_P_AREA}"/>㎡</td>
						<td width="20">~</td>
						<td width="100"><input id="END_P_AREA" name="END_P_AREA" type="text" class="formBox2" value="${END_P_AREA}"/>㎡</td>
					  </tr>
					</table>
				</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
	      <td height="26" align="right" valign="bottom"><a href="#" onclick="goSearch();"><img src="/rams/images/common/btn_srch4.gif" alt="검색" width="62" height="19" border="0" /></a></td>
		</tr>
	  </table>
	  
	  
	  <!-- 대부 및 사용허가 검색결과 -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont2"><img src="/rams/images/cityland/st_rst1.gif" alt="대부 및 사용허가 검색결과"/></th>
		  <td align="right" class="t_org">[총 ${listCount}건] </td>
	    </tr>
	  </table>
	  <table width="817" border="0" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<DIV id="listResult" style="width:813px;height:400px;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;overflow-y:auto;">
		  	<table width="100%" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="40" scope="col">순번</th>
				<th width="60" scope="col">재산구분</th>
				<th width="120" scope="col">소재지</th>
				<th width="60" scope="col">재산용도</th>
				<th width="100" scope="col">회계구분</th>
				<th scope="col">재산관리관</th>
				<th width="90" scope="col">재산가액</th>
				<th width="120" scope="col">허가기간</th>
				<th width="70" scope="col">허가면적(㎡)</th>
			  </tr>
			  	<c:choose>
				<c:when test="${blist!= null && !empty blist}">
				<c:forEach items="${blist}" var="blist">
					<tr style="cursor:pointer" onclick="goView('${blist.PP_CLASS_N}','${blist.LAND_ADDR}','${blist.USE_N}','${blist.ADMI_N}','${blist.ACCOUNT_N}','${blist.PER_START_DAY}','${blist.PER_END_DAY}','${blist.PER_AREA}','${blist.RATE1}','${blist.PAY_N}','${blist.PER_AMT}');">
						<td>${blist.RN}</td>
						<td>${blist.PP_CLASS_N}</td>
						<td>${blist.LAND_ADDR}</td>
						<td>${blist.USE_N}/<br/>${blist.ADMI_N}</td>
						<td>${blist.ACCOUNT_N}</td>
						<td>${blist.MAIN_MANA_N}</td>
						<td>${blist.AMT}</td>
						<td>${blist.PER_START_DAY} ~ ${blist.PER_END_DAY}</td>
						<td>${blist.PER_AREA}</td>
					</tr>
				</c:forEach>
				</c:when>
				<c:otherwise>
					<tr>
					<td colspan="9" scope="col">
						검색결과가 없습니다.
					</td>
					</tr>
				</c:otherwise>
				</c:choose>
				
			</table>
			</DIV>
		  </td>
		</tr>
	  </table>
	  
	  <div id="viewResult" style="display:none;">
	  
		  <!-- 대부 및 사용허가 상세정보 -->
		  <h3><img src="/rams/images/cityland/st_info1.gif" alt="대부 및 사용허가 상세정보" /></h3>
		  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
			<tr>
			  <td>
			  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
				  <tr>
					<th width="120" scope="col">재산</th>
					<td colspan="3" class="cont"><span id="PP_CLASS_N" name="PP_CLASS_N"></span></td>
				  </tr>
				  <tr>
					<th scope="col">소재지</th>
					<td colspan="3" class="cont"><span id="LAND_ADDR" name="LAND_ADDR"></span></td>
				  </tr>
				  <tr>
					<th width="120" scope="col">재산구분</th>
					<td width="280" class="cont"><span id="USE_ADMI" name="USE_ADMI"></span></td>
					<th width="120" scope="col">회계구분</th>
					<td width="283" class="cont"><span id="ACCOUNT_N" name="ACCOUNT_N"></span></td>
				  </tr>
				</table>
			  </td>
			</tr>
		  </table>
		  
		  <!-- 사용 허가 정보 -->
		  <h3><img src="/rams/images/cityland/st_info2.gif" alt="사용 허가 정보" /></h3>
		  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
			<tr>
			  <td>
			  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
				  <tr>
					<th width="120" scope="col">허가기간</th>
					<td width="280" class="cont"><span id="PER_DAY" name="PER_DAY"></span></td>
					<th width="120" scope="col">허가 면적 </th>
					<td width="283" class="cont"><span id="PER_AREA" name="PER_AREA"></span></td>
				  </tr>
				  <tr>
					<th scope="col">요율</th>
					<td width="276" class="cont"><span id="RATE1" name="RATE1"></span></td>
					<th width="120" scope="col">유/무상 여부 </th>
					<td width="276" class="cont"><span id="PAY_N" name="PAY_N"></span></td>
				  </tr>
				  <tr>
					<th scope="col">대부(허가)요금 </th>
					<td colspan="3" class="cont"><span id="PER_AMT" name="PER_AMT"></span></td>
				  </tr>
				</table>
			  </td>
			</tr>
		  </table>
	  </div>
    </div>
  </div>
</div>
</form>
</body>
</html>