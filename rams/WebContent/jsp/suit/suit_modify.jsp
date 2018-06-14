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
<script language="javascript" src="/rams/js/PopupCalendar.js"></script>
<script language="javascript" src="/rams/js/Ajax_request.js"></script>
<script type="text/javascript">

function initSearchForm(){
	var form = document.form;
	
	var new_option;
	
	var calss = document.getElementById("CALSS");
	
	<c:forEach items="${suitGubunList}" var="suitGubunList">
		if('${suitGubunList.CODEVALUE}' != ''){
			new_option = new Option('${suitGubunList.CODEDESC}','${suitGubunList.CODEVALUE}');
			if(new_option.value == '${view.CALSS}'){
				new_option.selected = true;
			}
			calss.options.add(new_option);
		}
	</c:forEach>
	
	
	var categ = document.getElementById("CATEG");
	<c:forEach items="${jimokList}" var="jimokList">
	if('${jimokList.CODEVALUE}' != ''){
		new_option = new Option('${jimokList.CODEDESC}','${jimokList.CODEVALUE}');
		if(new_option.value == '${view.CATEG}'){
			new_option.selected = true;
		}
		categ.options.add(new_option);
	}
</c:forEach>
	
	
}


function goSave(){
	
	var	result	= DataCheck();

	if(result	==	false)
		return;
	
	
	var form = document.form;
	form.action = "/rams/suit/suit_modify_prc.do";
	form.submit();
	
}

function	DataCheck()
{
    var form 	= document.form;
    var	str		= "";
	// 기본사항
    if(getValueSelectTag("CALSS").length	< 1)    
    {
        str	+= "구분을 선택 하세요\n";
        alert(str);
        form.CALSS.focus();
    }
    else if(form.AFFAIRNAME.value.length	< 1)
    {
        str	+= "사건명을 입력하세요\n";
        alert(str);
        form.AFFAIRNAME.focus();
    }
    else if(form.JUDGMENT.value.length	< 1)
    {
        str	+= "담당재판부를 입력하세요\n";
        alert(str);
        form.JUDGMENT.focus();
    }
    else if(form.COURT.value.length	< 1)
    {
        str	+= "법원명을 선택하세요\n";
        alert(str);
        form.COURT.focus();
    }
    else if(form.ACCEPTDATE.value.length	< 1)
    {
        str	+= "접수일자를 선택하세요\n";
        alert(str);
        form.ACCEPTDATE.focus();
    }
    else if(form.CLOSEDAY.value.length	< 1)
    {
        str	+= "변경 종료일자를 선택하세요\n";
        alert(str);
        form.CLOSEDAY.focus();
    }
	// 토지정보
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

function goCancel(){
	var form = document.form;
	form.action = "/rams/suit/suit_view.do?AFFAIRNUM="+form.AFFAIRNUM.value+"&PNU="+form.PNU.value;
	form.submit();
}

function goGongsaPop(){
	popWindow('/rams/reward/pop_reward_gongsa.do','gonsaPop','800','500','no','no');
}


</script>
</head>

<body onload="initSearchForm();">
<form name="form" id="form" method="post">
<input id="AFFAIRNUM" name="AFFAIRNUM" type="hidden" value="${AFFAIRNUM}"></input>
<input id="PNU" name="PNU" type="hidden" value="${PNU}"></input>

<div id="cont01">
<!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > <a href="#" class="blue1">소송정보관리</a> > <strong>소송정보</strong></td>
    </tr>
  </table>
  </div>
  
<!-- 탭 메뉴 -->
  <div>
    <h2><img src="/rams/images/suit/tt01.gif" alt="소송정보관리_소송정보" width="160" height="22" /></h2>	
	<div>
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
	  <h3><img src="/rams/images/suit/st_suit.gif" alt="소송정보" /></h3>
	  <h4><img src="/rams/images/suit/st_basis.gif" alt="기본사항" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">구분</th>
				<td width="286" class="cont">
					<select id="CALSS" name="CALSS" class="formBox4">
						<option value="">::선택::</option>
					</select>
				</td>
				<th width="120" scope="row">공사번호</th>
				<td align="left">
				<table width="100%">
				<tr>
				<td width="225">
					<input id="CONSTNUM" name="CONSTNUM" type="text" class="formBox4"  value="${view.CONSTNUM}" readonly="readonly"/>
					<input id="CONSTNAME" name="CONSTNAME" type="hidden" />
					<input id="GOSIID" name="GOSIID" type="hidden" />
					<input id="COMPEID" name="COMPEID" type="hidden" />
				</td>
				<td>
					<a href="#" onclick="goGongsaPop();"><img src="/rams/images/common/btn_srch5.gif" alt="검색" width="42" height="19" border="0" /></a>
				</td>
				</tr>
				</table>
				</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">사건번호</th>
				<td class="cont">
					${view.AFFAIRNUM}
				</td>
				<th width="120" scope="row">사건 명 </th>
				<td class="cont"><input type="text" id="AFFAIRNAME" name="AFFAIRNAME" class="formBox4" value="${view.AFFAIRNAME}" maxlength="25" /></td>
			  </tr>
			  <tr>
				<th scope="row">담당재판부</th>
				<td class="cont"><input type="text" id="JUDGMENT" name="JUDGMENT" class="formBox4" value="${view.JUDGMENT}" maxlength="15" /></td>
				<th scope="row">법원 명 </th>
				<td class="cont"><input type="text" id="COURT" name="COURT" class="formBox4" value="${view.COURT}" maxlength="25" /></td>
			  </tr>
			  <tr>
				<th scope="row">접수일자</th>
				<td class="cont">
					<table width="190" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="152"><input id="ACCEPTDATE" name="ACCEPTDATE" type="text" class="formBox3" value="${view.ACCEPTDATE}" readonly="readonly" /></td>
						<td><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,ACCEPTDATE,'yyyymmdd')" style="cursor:pointer;"/></td>
					  </tr>
					</table>
				</td>
				<th scope="row">변론종결일자</th>
				<td class="cont">
					<table width="190" border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="152"><input id="CLOSEDAY" name="CLOSEDAY" type="text" class="formBox3" value="${view.CLOSEDAY}" readonly="readonly" /></td>
						<td><img src="/rams/images/suit/cal.gif" alt="달력" onclick="popUpCalendar(this,CLOSEDAY,'yyyymmdd')" style="cursor:pointer;"/></td>
					  </tr>
					</table>
					
				</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  <h4><img src="/rams/images/suit/st_ground.gif" alt="토지정보" width="60" height="11" /></h4>
	  <!-- 토지 --> 
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">사건 토지 </th>
				<td colspan="3" class="cont">
					${view.SUITLAND}
				</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">사건면적/총면적</th>
				<td width="286" class="cont">
					<input id="LAWSUITAREA" name="LAWSUITAREA" type="text" class="formBox2" onKeyDown="onlyNumberInput();" value="${view.LAWSUITAREA}" maxlength="13" />&nbsp;/&nbsp;
					<input id="TOTALAREA" name="TOTALAREA" type="text" class="formBox2"  onKeyDown="onlyNumberInput();" value="${view.TOTALAREA}" maxlength="13" />&nbsp;㎡</td>
				<th width="120" scope="row">지목</th>
				<td class="cont">
					<select id="CATEG" name="CATEG" class="formBox2">
						<option value="">::선택::</option>
					</select>
				</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	<!-- 피고 -->  
	<h4><img src="/rams/images/suit/st_defendant.gif" alt="피고" width="41" height="11" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">피고명</th>
				<td width="286" class="cont"><input type="text" id="ST2_NAME" name="ST2_NAME" class="formBox4" value="${view.ST2_NAME}" maxlength="25" /></td>
				<th width="120" scope="row">주민번호</th>
				<td class="cont">
					<input id="ST2_JUMINNUM_1" name="ST2_JUMINNUM_1" type="text" class="formBox7"  onKeyDown="onlyNumberInput();" value="${view.ST2_JUMINNUM_1}" maxlength="6" />
					&nbsp;-&nbsp;
					<input id="ST2_JUMINNUM_2" name="ST2_JUMINNUM_2" type="text" class="formBox7"  onKeyDown="onlyNumberInput();" value="${view.ST2_JUMINNUM_2}" maxlength="7" />
				</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">기관명</th>
				<td width="286" class="cont" colspan="3"><input type="text" id="ST2_ADMINSTNAME" name="ST2_ADMINSTNAME" class="formBox4" value="${view.ST2_ADMINSTNAME}"  maxlength="9" /></td>
			  </tr>
			  <tr>
				<th width="120" scope="row">주소</th>
				<td width="286" class="cont"><input type="text" id="ST2_ADDR" name="ST2_ADDR" class="formBox4" value="${view.ST2_ADDR}" maxlength="50" /></td>
				<th width="120" scope="row">연락처</th>
				<td class="cont"><input id="ST2_TEL" name="ST2_TEL" type="text" class="formBox1" value="${view.ST2_TEL}" onKeyDown="onlyNumberInput();" maxlength="20" /></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  <!-- 대리 -->  
	  <h4><img src="/rams/images/suit/st_deputy.gif" alt="대리" width="41" height="11" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">피고명</th>
				<td width="286" class="cont"><input type="text" id="LP2_NAME" name="LP2_NAME" class="formBox4" value="${view.LP2_NAME}" maxlength="25" /></td>
				<th width="120" scope="row">주민번호</th>
				<td class="cont">
					<input id="LP2_JUMINNUM_1" name="LP2_JUMINNUM_1" type="text" class="formBox7"  onKeyDown="onlyNumberInput();" value="${view.LP2_JUMINNUM_1}" maxlength="6" />
					&nbsp;-&nbsp;
					<input id="LP2_JUMINNUM_2" name="LP2_JUMINNUM_2" type="text" class="formBox7"  onKeyDown="onlyNumberInput();" value="${view.LP2_JUMINNUM_2}" maxlength="7" />
				</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">주소</th>
				<td width="286" class="cont"><input type="text" id="LP2_ADDR" name="LP2_ADDR" class="formBox4" value="${view.LP2_ADDR}" maxlength="50" /></td>
				<th width="120" scope="row">연락처</th>
				<td class="cont"><input id="LP2_TEL" name="LP2_TEL" type="text" onKeyDown="onlyNumberInput();" class="formBox4" value="${view.LP2_TEL}" maxlength="20" /></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  <br/><br/>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">원고명</th>
				<td width="286" class="cont"><input type="text" id="LP1_NAME" name="LP1_NAME" class="formBox4" value="${view.LP1_NAME}" maxlength="25" /></td>
				<th width="120" scope="row">주민번호</th>
				<td class="cont">
					<input id="LP1_JUMINNUM_1" name="LP1_JUMINNUM_1" type="text" class="formBox7"  onKeyDown="onlyNumberInput();" value="${view.LP1_JUMINNUM_1}" maxlength="6" />
					&nbsp;-&nbsp;
					<input id="LP1_JUMINNUM_2" name="LP1_JUMINNUM_2" type="text" class="formBox7"  onKeyDown="onlyNumberInput();" value="${view.LP1_JUMINNUM_2}" maxlength="7" />
				</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">주소</th>
				<td width="286" class="cont"><input type="text" id="LP1_ADDR" name="LP1_ADDR" class="formBox4" value="${view.LP1_ADDR}" maxlength="50" /></td>
				<th width="120" scope="row">연락처</th>
				<td class="cont"><input id="LP1_TEL" name="LP1_TEL" type="text" onKeyDown="onlyNumberInput();" class="formBox4" value="${view.LP1_TEL}" maxlength="20" /></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  <!-- 원고 -->  
	  <h4><img src="/rams/images/suit/st_plaintiff.gif" alt="원고" width="41" height="11" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="120" scope="row">원고명</th>
				<td width="286" class="cont"><input type="text" id="ST1_NAME" name="ST1_NAME" class="formBox4" value="${view.ST1_NAME}"  maxlength="25" /></td>
				<th width="120" scope="row">주민번호</th>
				<td class="cont">
					<input id="ST1_JUMINNUM_1" name="ST1_JUMINNUM_1" type="text" class="formBox7"  onKeyDown="onlyNumberInput();" value="${view.ST1_JUMINNUM_1}" maxlength="6" />
					&nbsp;-&nbsp;
					<input id="ST1_JUMINNUM_2" name="ST1_JUMINNUM_2" type="text" class="formBox7"  onKeyDown="onlyNumberInput();" value="${view.ST1_JUMINNUM_2}" maxlength="7" />
				</td>
			  </tr>
			  <tr>
				<th width="120" scope="row">기관명</th>
				<td width="286" class="cont" colspan="3"><input type="text" id="ST1_ADMINSTNAME" name="ST1_ADMINSTNAME" class="formBox4" value="${view.ST1_ADMINSTNAME}" maxlength="10" /></td>
			  </tr>
			  <tr>
				<th width="120" scope="row">주소</th>
				<td width="286" class="cont"><input type="text" id="ST1_ADDR" name="ST1_ADDR" class="formBox4" value="${view.ST1_ADDR}" maxlength="50" /></td>
				<th width="120" scope="row">연락처</th>
				<td class="cont"><input id="ST1_TEL" name="ST1_TEL" type="text" class="formBox1" onKeyDown="onlyNumberInput();" value="${view.ST1_TEL}" maxlength="20" /></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  <!-- 페이징 및 버튼 --> 
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td height="26" align="right" valign="bottom"><a href="#" onclick="goSave();"><img src="/rams/images/common/btn_modify.gif" alt="수정" border="0"/></a></td>
	      <td width="70" align="right" valign="bottom"><a href="#" onclick="goCancel();"><img src="/rams/images/common/btn_cancel.gif" alt="취소" border="0"/></a></td>
		</tr>
	  </table>
	</div>
  </div>
</div>
</form>
</body>
</html>