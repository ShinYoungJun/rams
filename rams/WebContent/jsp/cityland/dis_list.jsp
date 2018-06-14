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
	form.action = "/rams/cityland/dis_list.do?SEARCH=Y";
	form.submit();
}


function goView(DIS_DAY,DIS_ACC_YN,LAND_ADDR,PP_CLASS_N,DIS_JUD_AMT,DIS_AMT,DIS_WAY_N,DIS_REASON,DIS_CONTRACT_N,OWNER_N,OWN_CITY_N){
	
	document.getElementById("listResult").style.height = '150px';
	document.getElementById("viewResult").style.display = 'block';
	
	document.getElementById("DIS_DAY").innerHTML = DIS_DAY;
	document.getElementById("DIS_ACC_YN").innerHTML = DIS_ACC_YN;
	document.getElementById("LAND_ADDR").innerHTML = LAND_ADDR;
	document.getElementById("PP_CLASS_N").innerHTML = PP_CLASS_N;
	document.getElementById("DIS_JUD_AMT").innerHTML = DIS_JUD_AMT;
	document.getElementById("DIS_AMT").innerHTML = DIS_AMT;
	document.getElementById("DIS_WAY_N").innerHTML = DIS_WAY_N;
	document.getElementById("DIS_REASON").innerHTML = DIS_REASON;
	document.getElementById("DIS_CONTRACT_N").innerHTML = DIS_CONTRACT_N;
	document.getElementById("OWNER_N").innerHTML = OWNER_N;
	document.getElementById("OWN_CITY_N").innerHTML = OWN_CITY_N;

}


function initSearchForm(){
	var form = document.form;
	
	var new_option;
	var _ppClass = document.getElementById("PP_CLASS");
	
    <c:forEach items="${PermissCodeList}" var="PermissCodeList">
		if('${PermissCodeList.CD}' != ''){
	    	new_option = new Option('${PermissCodeList.NM}','${PermissCodeList.CD}');
	    	if(new_option.value == '${PP_CLASS}'){
	    		new_option.selected = true;
	    	}
	    	_ppClass.options.add(new_option);
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
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > <a href="#" class="blue1">시유지 조회</a> > <strong>처분 재산 </strong></td>
    </tr>
  </table>
  </div>
  
  <!-- 검색 -->
  <div>
    <h2><img src="/rams/images/cityland/tt02.gif" alt="시유지 조회_대부사용 허가"/></h2>
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><a href="/rams/cityland/permiss_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image22','','/rams/images/cityland/tab01_on.gif',1)"><img src="/rams/images/cityland/tab01_off.gif" alt="대부사용 허가" name="Image22" width="91" height="29" border="0" id="Image22" /></a></td>
          <td width="91"><img src="/rams/images/cityland/tab02_on.gif" alt="처분 재산" /></td>
          <td width="91"><a href="/rams/cityland/moodan_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image20','','/rams/images/cityland/tab03_on.gif',1)"><img src="/rams/images/cityland/tab03_off.gif" alt="무단 점사용" name="Image20" width="91" height="29" border="0" id="Image20" /></a></td>
          <td width="91"><a href="/rams/cityland/base_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image21','','/rams/images/cityland/tab04_on.gif',1)"><img src="/rams/images/cityland/tab04_off.gif" alt="재산 전용" name="Image21" width="91" height="29" border="0" id="Image21" /></a></td>
		  <td width="91"><a href="/rams/cityland/history_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image23','','/rams/images/cityland/tab05_on.gif',1)"><img src="/rams/images/cityland/tab05_off.gif" alt="재산이력" name="Image23" width="91" height="29" border="0" id="Image23" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	<div class="list">
	
	
	  <!-- 처분재산 검색 -->
	  <h3><img src="/rams/images/cityland/st_srch2.gif" alt="처분재산 검색"/></h3>
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
				<th width="120" scope="col">평가액</th>
				<td colspan="3" class="cont">
					<table width="220px" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="100"><input id="START_DIS_JUD_AMT" name="START_DIS_JUD_AMT" type="text" class="formBox2" value="${START_DIS_JUD_AMT}"/>원</td>
						<td width="20">~</td>
						<td width="100"><input id="END_DIS_JUD_AMT" name="END_DIS_JUD_AMT" type="text" class="formBox2" value="${END_DIS_JUD_AMT}"/>원</td>
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
	  
	  
	  <!-- 처분내역 검색결과 -->
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont2"><img src="/rams/images/cityland/st_rst2.gif" alt="처분내역 검색결과"/></th>
		  <td align="right" class="t_org">[총 ${listCount}건]</td>
	    </tr>
	  </table>
	  <table width="817" border="0" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
			  <DIV id="listResult" name="listResult" style="width:813px;height:420px;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;overflow-y:auto;">
			  	<table width="100%" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
				  <tr>
					<th width="40" scope="col">순번</th>
					<th width="90" scope="col">처분일</th>
					<th width="90" scope="col">처분수락여부</th>
					<th scope="col">소재지</th>
					<th width="90" scope="col">재산구분</th>
					<th width="90" scope="col">처분감정가액</th>
					<th width="90" scope="col">처분가액</th>
				  </tr>
				  	<c:choose>
					<c:when test="${blist!= null && !empty blist}">
				  	<c:forEach items="${blist}" var="blist">
					<tr style="cursor:pointer" onclick="goView('${blist.DIS_DAY}','${blist.DIS_ACC_YN}','${blist.LAND_ADDR}','${blist.PP_CLASS_N}','${blist.DIS_JUD_AMT}','${blist.DIS_AMT}','${blist.DIS_WAY_N}','${blist.DIS_REASON}','${blist.DIS_CONTRACT_N}','${blist.OWNER_N}','${blist.OWN_CITY_N}');">
						<td>${blist.RN}</td>
						<td>${blist.DIS_DAY}</td>
						<td>${blist.DIS_ACC_YN}</td>
						<td>${blist.LAND_ADDR}</td>
						<td>${blist.PP_CLASS_N}</td>
						<td>${blist.DIS_JUD_AMT}</td>
						<td>${blist.DIS_AMT}</td>
					</tr>
					</c:forEach>
					</c:when>
					<c:otherwise>
						<tr>
						<td colspan="7" scope="col">
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
	  
	  <!-- 처분 계획 상세정보 -->
	  <h3><img src="/rams/images/cityland/st_info3.gif" alt="처분 계획 상세정보" /></h3>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">처분일</th>
				<td class="cont"><span id="DIS_DAY" name="DIS_DAY"></td>
				<th width="120" scope="col">처분수락여부</th>
				<td width="283" class="cont"><span id="DIS_ACC_YN" name="DIS_ACC_YN"></td>
			  </tr>
			  <tr>
				<th scope="col">소재지</th>
				<td colspan="3" class="cont"><span id="LAND_ADDR" name="LAND_ADDR"></td>
			  </tr>
			  <tr>
				<th width="120" scope="col">재산구분</th>
				<td width="280" class="cont"><span id="PP_CLASS_N" name="PP_CLASS_N"></td>
				<th width="120" scope="col">재산형태</th>
				<td width="283" class="cont"></td>
			  </tr>
			  <tr>
				<th scope="col">처분가액</th>
				<td class="cont"><span id="DIS_JUD_AMT" name="DIS_JUD_AMT"></td>
				<th width="120" scope="col">처분 감정가액 </th>
				<td width="283" class="cont"><span id="DIS_AMT" name="DIS_AMT"></td>
			  </tr>
			  <tr>
				<th width="120" scope="col">처분방법</th>
				<td colspan="3" class="cont"><span id="DIS_WAY_N" name="DIS_WAY_N"></td>
			  </tr>
			  <tr>
				<th width="120" scope="col">처분사유</th>
				<td colspan="3" class="cont"><span id="DIS_REASON" name="DIS_REASON"></td>
			  </tr>
			  <tr>
				<th width="120" scope="col">처분계약구분</th>
				<td colspan="3" class="cont"><span id="DIS_CONTRACT_N" name="DIS_CONTRACT_N"></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  
	  <!-- 처분 계획재산 소유자정보 -->
	  <h3><img src="/rams/images/cityland/st_info4.gif" alt="처분 계획재산 소유자정보" /></h3>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">소유구분</th>
				<td width="280" class="cont"><span id="OWNER_N" name="OWNER_N"></td>
				<th width="120" scope="col">소유자단체</th>
				<td width="283" class="cont"><span id="OWN_CITY_N" name="OWN_CITY_N"></td>
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
