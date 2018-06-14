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
<script language="javascript" src="/rams/js/calculation.js"></script> 
<script language="javascript" src="/rams/js/Ajax_request.js"></script>
<script type="text/javascript">

function goDown(filename,filepath){
	var url = "/rams/jsp/common/file_down.jsp?filename="+filename+"&filepath="+filepath;
	var form = document.form;
	form.action = url;
	form.submit();
}

function initSearchForm(){
	var form = document.form;
	
	var new_option;
	var _AreaGuCd = document.getElementById("AREA_GU_CD");	
	var _GuCd = document.getElementById("CP_DEPT_CODE");
	
	<c:forEach items="${guList}" var="guList">
		if('${guList.GU_CD}' != ''){
			new_option = new Option('${guList.GU_NM}','${guList.GU_CD}');
			if(new_option.value == '${compeView.GU_CD}'){
				new_option.selected = true;
			}
			_AreaGuCd.options.add(new_option);
		}
	</c:forEach>
	
}

//구코드 변경
function changeGuCode(){
	var _guCode = getValueSelectTag("AREA_GU_CD");
	var param = "&GU_CD="+_guCode;

	sendRequest("/rams/common/get_dong_list.do", param, "GET", ResultChangeGuCode);
}

////////////////////////////////AJAX////////////////////////////////////////////

function ResultChangeGuCode(obj)
{
	fncSelectBoxSetting(obj, "AREA_DONG_CD", "", "자치구");
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

function juminCk(obj1, obj2){
	
	var chk =0;
	
	for (var i = 0; i <=5 ; i++){
		chk = chk + ((i%8+2) * parseInt(obj1.substring(i,i+1)))
		}
		
		for (var i = 6; i <=11 ; i++){
		chk = chk + ((i%8+2) * parseInt(obj2.substring(i-6,i-5)))
		}
		
		chk = 11 - (chk %11)
		chk = chk % 10
		
		if (chk != obj2.substring(6,7))
		{
			alert ("주민등록번호가 유효하지 않습니다.");
			document.form.CP_JUMIN.focus();
			return false;
		}
		return true;
}

function goModifyPrc(){
	var form = document.form;
	var temp,jumin1,jumin2;
	var isTrue = false;
	
	temp = form.CP_JUMIN.value;
	temp = temp.replace(/-/gi, "");  
	
	jumin1 = temp.substr(0,6);
	jumin2 = temp.substr(6,8);

	if(form.COMPEID.value == 'null' || form.COMPEID.value == "" || form.PNU.value == 'null' || form.PNU.value == ""){
		alert ("공사명을 선택해 주세요.");
		form.COMPEID.focus();
		return;
	}

	if(form.AREA_GU_CD.value.length	< 1){
		alert ("자치구를 선택해 주세요.");
		form.AREA_GU_CD.focus();
		return;
	}
		
	if(form.AREA_DONG_CD.value.length	< 1){
		alert ("동명을 선택해 주세요.");
		form.AREA_DONG_CD.focus();
		return;
	}
	
	if(form.AREA_BONBUN.value.length	< 1){
		alert ("번지 앞자리를 입력해 주세요.");
		form.AREA_BONBUN.focus();
		return;
	}

	if(form.AREA_BUBUN.value.length	< 1){
		alert ("번지 뒷자리를 입력해 주세요.");
		form.AREA_BUBUN.focus();
		return;
	}

	if(form.CP_NAME.value.length	< 1){
		alert ("신청자 성명을 입력해 주세요.");
		form.CP_NAME.focus();
		return;
	}

	if(form.CP_ADDRESS.value.length	< 1){
		alert ("신청자 주소를 입력해 주세요.");
		form.CP_ADDRESS.focus();
		return;
	}
	if(form.REQDATE.value.length	< 1){
		alert ("신청 일자를 입력해 주세요.");
		form.REQDATE.focus();
		return;
	}

	if(form.RECEIPT.value.length	< 1){
		alert ("수신처를 입력해 주세요.");
		form.RECEIPT.focus();
		return;
	}
	
	isTrue = juminCk(jumin1, jumin2);
	form.CP_JUMIN.value = temp;
	
	if(isTrue){
		if(confirm("수정 하시겠습니까?")){
			document.form.submit();
		}		
	}
	
}
</script>
</head>
<body onload="init();initSearchForm();">
<form name="form" method="post" action="/rams/reward/reward_view_mody_prc.do" enctype="multipart/form-data">
<input type="hidden" id="COMPEID" name="COMPEID" value="${compeView.COMPEID}" />
<input type="hidden" id="PNU" name="PNU" value="${compeView.PNU}" />
<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > 보상용지 관리 <a href="#" class="blue1"></a> > <strong>미불보상용지 </strong></td>
    </tr>
  </table>
  </div>
  
  <div>
    <h2><img src="/rams/images/reward/tt01.gif" alt="보상용지관리_미불보상용지" width="184" height="22" /></h2>
   
   
    <!-- 탭 메뉴 -->
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><img src="/rams/images/reward/tab01_on.gif" alt="미불보상용지" width="91" height="29" /></td>
          <td width="91"><a href="/rams/reward/reward_review_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image16','','/rams/images/reward/tab02_on.gif',1)"><img src="/rams/images/reward/tab02_off.gif" alt="보상심의/사실조사" name="Image16" width="91" height="29" border="0" id="Image16" /></a></td>
          <td width="91"><a href="/rams/reward/reward_status_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image19','','/rams/images/reward/tab03_on.gif',1)"><img src="/rams/images/reward/tab03_off.gif" alt="현황관리" name="Image19" width="91" height="29" border="0" id="Image19" /></a></td>
          <td width="91"><a href="/rams/reward/reward_anal_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image20','','/rams/images/reward/tab04_on.gif',1)"><img src="/rams/images/reward/tab04_off.gif" alt="통계" name="Image20" width="91" height="29" border="0" id="Image20" /></a></td>
          <td width="91"><a href="/rams/reward/reward_own_list.do" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image20','','/rams/images/reward/tab05_on.gif',1)"><img src="/rams/images/reward/tab05_off.gif" alt="토지소유현황" name="Image19" width="91" height="29" border="0" id="Image20" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	
	<div class="list">
	  <h3><img src="/rams/images/reward/st_modify.gif" alt="미불보상용지 수정"/></h3>
	  
	  
	  <!-- 토지정보 -->
	  <h4><img src="/rams/images/suit/st_ground.gif" alt="토지정보" width="60" height="11" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">고시(관보)</th>
				<td width="274" class="cont"><input name="GOSIID" type="text" class="formBox6" value="${compeView.GOSIID}" readonly/></td>
				<th width="120" scope="col">공사명</th>
				<td class="cont">
					<table width="240" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="180"><input name="CONSTNUM" type="text" class="formBox6" value="${compeView.CONSTNUM}" readonly/></td>
						<td><a href="#"><img src="/rams/images/common/btn_srch5.gif" alt="검색" width="42" height="19" border="0" /></a></td>
					  </tr>
					</table>
				</td>
			  </tr>			  
			  <tr>
				<th width="120" scope="col">토지</th>
				<td width="274" class="cont">
					<table width="240" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="80">
						<select id="AREA_GU_CD" name="AREA_GU_CD" class="formBox2" onchange="changeGuCode();">
						  <option value="">자치구</option>
						</select>
						</td>
						<td width="80" class="cont">
						<select id="AREA_DONG_CD" name="AREA_DONG_CD" class="formBox2">
						  <option value="${compeView.BJ_CD}">${compeView.BJ_NM}</option>
						  <option value="">동명</option>
						</select></td>
<!-- 					
						<td class="cont">
						<input name="AREA_ADDRESS" id="AREA_ADDRESS" type="text" class="formBox7" />
						</td>
 -->							
					  </tr>
					  <tr>
						<td width="80" align="right">번지입력:</td>
						<td width="80" class="cont">
							<input name="AREA_BONBUN" type="text" class="formBox7" value="${compeView.BONBUN}" maxlength='4' onKeyDown="onlyNumberInput();"/>&nbsp;-&nbsp;</td>
						<td class="cont">
							<input name="AREA_BUBUN" type="text" class="formBox7" value="${compeView.BUBUN}" maxlength='4' onKeyDown="onlyNumberInput();" />
						</td>
					  </tr>	
					</table>
				</td>
				<th width="120" scope="col">지목</th>
				<td width="289" class="cont">
					<select id="JIMOK" name="JIMOK" class="formBox6"">
				  		<c:forEach items="${jimokList}" var="jimokView">
				  		 <option value="${jimokView.CODEVALUE}" <c:if test="${ jimokView.CODEVALUE eq compeView.JIMOK_CODE}">selected</c:if>>${jimokView.CODEDESC}</option>
				  		</c:forEach>
				  	</select>
				</td>
			  </tr>
			  <tr>
				<th scope="col">지적(㎡)</th>
				<td class="cont"><input name="AFFAIRNUM" type="text" class="formBox6" value="${compeView.AFFAIRAREA}" onKeyDown="onlyNumberInput();"/></td>
				<th scope="col">보상결정사유</th>
				<td class="cont"><input name="REASON" type="text" class="formBox6" value="${compeView.REASON}"/></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  
	  <!-- 평가정보 -->
	  <h4><img src="/rams/images/reward/sst_info2.gif" alt="평가정보" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">평가기관</th>
				<td width="274" class="cont"><input name="OFFICENAME_1" type="text" class="formBox6" value="${compeView.OFFICENAME_1}"/></td>
				<th width="120" scope="col">단가</th>
				<td class="cont"><input name="DANGA_1" type="text" class="formBox6" value="${compeView.DANGA_1}" onKeyDown="onlyNumberInput();"/></td>
			  </tr>
			  <tr>
				<th scope="col">금액</th>
				<td class="cont"><input name="JUDGEPRICE_1" type="text" class="formBox6" value="${compeView.JUDGEPRICE_1}" onKeyDown="onlyNumberInput();"/></td>
				<th scope="col">가격시점</th>
				<td class="cont"><input name="POINTDATE_1" type="text" class="formBox6" value="${compeView.POINTDATE_1}" readOnly/><img src="/rams/images/suit/cal.gif" alt="달력" width="19" height="15" border="0" onclick="popUpCalendar(this,POINTDATE_1,'yyyymmdd')" style="cursor:pointer;"/></td>
			  </tr>
			  <tr>
				<th scope="col">평가기관</th>
				<td class="cont"><input name="OFFICENAME_2" type="text" class="formBox6" value="${compeView.OFFICENAME_2}"/></td>
				<th scope="col">단가</th>
				<td class="cont"><input name="DANGA_2" type="text" class="formBox6" value="${compeView.DANGA_2}" onKeyDown="onlyNumberInput();"/></td>
			  </tr>
			  <tr>
				<th scope="col">금액</th>
				<td class="cont"><input name="JUDGEPRICE_2" type="text" class="formBox6" value="${compeView.JUDGEPRICE_2}" onKeyDown="onlyNumberInput();"/></td>
				<th scope="col">가격시점</th>
				<td class="cont"><input name="POINTDATE_2" type="text" class="formBox6" value="${compeView.POINTDATE_2}" readOnly/><img src="/rams/images/suit/cal.gif" alt="달력" width="19" height="15" border="0" onclick="popUpCalendar(this,POINTDATE_2,'yyyymmdd')" style="cursor:pointer;"/></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  	  
	  <!-- 대상토지 목록
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <th height="30" align="left" class="cont2"><img src="/rams/images/reward/sst_list.gif" alt="대상토지 목록" width="83" height="11" /></th>
		  <td width="70" align="right" class="cont2"><img src="/rams/images/common/btn_del.gif" alt="토지삭제" width="62" height="19" /></td>
		  <td width="70" align="right" class="cont2"><img src="/rams/images/common/btn_add.gif" alt="토지추가" width="62" height="19" /></td>
	    </tr>
	  </table>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th scope="col">토지</th>
				<th width="150" scope="col">지목</th>
				<th width="150" scope="col">지적(㎡)</th>
				<th width="150" scope="col">&nbsp;</th>
				<th width="150" scope="col">&nbsp;</th>
			  </tr>
			  <tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	   -->
	  	  
	  <!-- 대상토지 목록
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
		  <td align="right" class="cont2"><img src="/rams/images/reward/btn_srch.gif" alt="소유자조회" width="62" height="19" /></td>
	    </tr>
	  </table>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">소유자 명 </th>
				<th scope="col">주소</th>
				<th width="120" scope="col">지분</th>
				<th width="120" scope="col">비고</th>
				<th width="120" scope="col">업데이트 일자 </th>
			  </tr>
			  <tr>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
				<td>&nbsp;</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	   -->
	  
	  <h4></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="col">신청자 성명 </th>
				<td width="274" class="cont"><input name="CP_NAME" type="text" class="formBox6" value="${compeView.NAME}"/></td>
				<th width="120" scope="col">주민번호</th>
				<td class="cont"><input name="CP_JUMIN" type="text" class="formBox6" value="${compeView.JUMINNUM}" onKeyDown="onlyNumberInput();"/></td>
			  </tr>
			  <tr>
				<th scope="col">주소</th>
				<td colspan="3" class="cont">
					<table width="550" border="0" cellspacing="0" cellpadding="0">
					  <tr>
<!-- 						  
						<td width="80"><select name="CP_REGION" class="formBox2">
						  <option value="11">${address_arr1 }</option>
						  <option value="">지역</option>
						  </select>
						</td>
						<td width="80" class="cont"><select name="CP_DEPT_CODE" class="formBox2" onchange="changeGuCode2();">
						  <option value="">${address_arr2 }</option>
						  <option value="">자치구</option>
						  </select>
						</td>
						<td width="80" class="cont"><select name="CP_DONG_CODE" class="formBox2">
						  <option value="">${address_arr3 }</option>
						  <option value="">동명</option>
						  </select>
						</td>
-->						
						<td width="130" class="cont"><input name="CP_ADDRESS" type="text" class="formBox1" value="${compeView.ADDRESS}" style="width:300px"/></td>
<!-- 
						<td width="20" class="cont"><input type="checkbox" name="CP_AUTH_YN" value="Y" /></td>
						<td class="cont">소유자 동일여부</td>
 -->
					  </tr>
				  </table>			  
				</td>
			  </tr>
			  <tr>
				<th scope="col">토지현황</th>
				<td colspan="3" class="cont">
					<table width="600" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="50"><input type="radio" name="LANDGUBUN" value="1" <c:if test="${ compeView.LANDGUBUN eq '1'}">checked="checked"</c:if> />도로</td>
						<td width="70" class="cont"><input type="radio" name="LANDGUBUN" value="2" <c:if test="${ compeView.LANDGUBUN eq '2'}">checked="checked"</c:if> />하천</td>
						<td width="100" class="cont">(<input type="radio" name="LANDDETAIL" value="asphalt" <c:if test="${ compeView.LANDDETAIL eq 'asphalt'}">checked="checked"</c:if> />아스팔트포장</td>
						<td width="100" class="cont"><input type="radio" name="LANDDETAIL" value="concrete" <c:if test="${ compeView.LANDDETAIL eq 'concrete'}">checked="checked"</c:if> />콘크리트포장</td>
						<td width="100" class="cont"><input type="radio" name="LANDDETAIL" value="block" <c:if test="${ compeView.LANDDETAIL eq 'block'}">checked="checked"</c:if> />보도블럭포설</td>
						<td class="cont"><input type="radio" name="LANDDETAIL" value="etc" <c:if test="${ compeView.LANDDETAIL eq 'etc'">checked="checked"</c:if> />기타 )</td>
					  </tr>
					</table>
				</td>
			  </tr>
			  <tr>
				<th scope="col">신청일자</th>
				<td class="cont">
					<table width="230" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="120"><input name="REQDATE" type="text" class="formBox1" value="${compeView.REQDATE }" readOnly/></td>
						<td class="cont"><a href="#"><img src="/rams/images/suit/cal.gif" alt="달력" width="19" height="15" border="0" onclick="popUpCalendar(this,REQDATE,'yyyymmdd')" style="cursor:pointer;"/></a></td>
					  </tr>
					</table>
				</td>
				<th scope="col">수신처</th>
				<td class="cont"><input name="RECEIPT" type="text" class="formBox6" value="${compeView.RECEIPT }"/></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td height="34" align="right" valign="bottom"><a href="#" onclick="goModifyPrc();"><img src="/rams/images/common/btn_save.gif" alt="저장" width="62" height="19" border="0" /></a></td>
		  <td width="70" align="right" valign="bottom"><a href="/rams/reward/reward_view.do?COMPEID=${compeView.COMPEID}&PNU=${compeView.PNU}"><img src="/rams/images/common/btn_cancel.gif" alt="취소" width="62" height="19" border="0" /></a></td>
		</tr>
	  </table>
    </div>
  </div>
</div>
</form>
</body>
</html>
