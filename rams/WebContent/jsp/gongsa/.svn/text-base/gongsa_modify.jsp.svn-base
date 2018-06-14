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
function goModifyPrc(){
	document.form.submit();
}

function goCancel(){
	var form = document.form;
	form.action = '/rams/gongsa/gongsa_detail.do?CONSTNUM='+document.getElementById("CONSTNUM");
	form.submit();
}

function init(){
	
	var constCateg = document.getElementById("CONSTCATEG");
    <c:forEach items="${constCategList}" var="constCategList">
	if('${constCategList.CODEVALUE}' != ''){
    	new_option = new Option('${constCategList.CODEDESC}','${constCategList.CODEVALUE}');
    	if(new_option.value == '${bean.CONSTCATEG}'){
    		new_option.selected = true;
    	}
    	constCateg.options.add(new_option);
	}
	</c:forEach>
}

</script>



</head>

<body onload="init();">
<form name="form" method="post" action="/rams/gongsa/gongsa_modify_prc.do" enctype="multipart/form-data">
	<input type="hidden" id="CONSTNUM" name="CONSTNUM" value="${CONSTNUM}" />
	<!-- 검색 -->
   <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
    		<td height="26" align="right" valign="bottom">
    			<a href="#" onclick="goModifyPrc();"><img src="/rams//images/common/btn_save.gif" alt="저장" width="62" height="19" border="0" /></a>
    			&nbsp;
    			<a href="#" onclick="goCancel();"><img src="/rams//images/common/btn_cancel.gif" alt="취소" width="62" height="19" border="0" /></a>
			</td>
    	</tr>
    </table>
	
	<!-- 공사시행내역 상세 -->
	  <h4><img src="/rams/images/register/st_detailed.gif" alt="공사시행내역 상세" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th style="width:150px;" scope="col">실시계획인가고시</th>
				<td style="width:253px;text-align:left;padding-left:10px;" class="cont"><input name="GOSIID" type="text" class="formBox6" value="${bean.GOSIID}" readonly="readonly"/></td>
				<th style="width:150px;" scope="col">공사시행허가 내용공고 </th>
				<td style="width:260px;text-align:left;padding-left:10px" class="cont"><input name="ANNPERMISSION" type="text" class="formBox6" value="${bean.ANNPERMISSION }" /></td>
			  </tr>
			  
			  <tr>
				<th scope="col">도로의 종류(노선명)</th>
				<td style="text-align:left;padding-left:10px;" class="cont"><input name="LINENAME" type="text" class="formBox6" value="${bean.LINENAME }" /></td>
				<th scope="col">공사의 종류</th>
				<td style="text-align:left;padding-left:10px;" class="cont">
				  	<select id="CONSTCATEG" name="CONSTCATEG" class="formBox1">
				  		<option value="">:::선택:::</option>
				  	</select>
				</td>
			  </tr>
			  
			  <tr>
				<th scope="col">공사구간</th>
				<td style="width:663px;text-align:left;padding-left:10px;" colspan="3" class="cont">
					<input name="STARTSECTION" type="text" class="formBox6" value="${bean.STARTSECTION}" />부터
					<input name="ENDSECTION" type="text" class="formBox6" value="${bean.ENDSECTION}" />까지
				</td>
			  </tr>
			  <tr>
				<th scope="col">공사장소</th>
				<td style="width:663px;text-align:left;padding-left:10px;" colspan="3" class="cont"><input name="CONSTPLACE" type="text" style="width:650px" class="formBox6" value="${bean.CONSTPLACE}" /></td>
			  </tr>
			  
			  <tr>
				<th scope="col">착수일</th>
				<td style="text-align:left;padding-left:10px;" class="cont">
					<input id="STARTDATE" name="STARTDATE" type="text" class="formBox2" value="${bean.STARTDATE}"/>
					<a href="#" onclick="popUpCalendar(this, document.getElementById('STARTDATE'), 'yyyymmdd');"><img src="/rams/images/suit/cal.gif" alt="달력" border="0" /></a>
				</td>
				<th scope="col">준공일</th>
				<td style="text-align:left;padding-left:10px;" class="cont">
					<input id="ENDDATE" name="ENDDATE" type="text" class="formBox2" value="${bean.ENDDATE}"/>
					<a href="#" onclick="popUpCalendar(this, document.getElementById('ENDDATE'), 'yyyymmdd');"><img src="/rams/images/suit/cal.gif" alt="달력" border="0" /></a>
				</td>
			  </tr>
			  
			  <tr>
				<th scope="col">공사사유</th>
				<td style="width:663px;text-align:left;padding-left:10px;" colspan="3" class="cont">
					<input name="REASON" type="text" style="width:650px" class="formBox6" value="${bean.REASON}" />
				</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  <br/>
	  <br/>
	  
	  <!-- 공사시행자(신청인) -->
	  <h4><img src="/rams/images/register/st_pp.gif" alt="공사시행자(신청인)" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th style="width:150px;" scope="col">성명(회사명)</th>
				<td style="width:253px;text-align:left;padding-left:10px;" class="cont"><input name="NAME" type="text" class="formBox6" value="${bean.NAME}" /></td>
				<th style="width:150px;" scope="col">주민등록번호<br/>(사업자등록번호)</th>
				<td style="width:260px;text-align:left;padding-left:10px;" class="cont"><input name="JUMINNUM" type="text" class="formBox6" value="${bean.JUMINNUM}" /></td>
			  </tr>
			  <tr>
				<th scope="col">연락처</th>
				<td style="text-align:left;padding-left:10px;" class="cont"><input name="TEL" type="text" class="formBox6" value="${bean.TEL}" /></td>
				<th scope="col">우편번호</th>
				<td style="text-align:left;padding-left:10px;" class="cont"><input name="POSTNUM" type="text" class="formBox6" value="${bean.POSTNUM}" /></td>
			  </tr>
			  <tr>
				<th scope="col">주소</th>
				<td style="width:663px;text-align:left;padding-left:10px;" colspan="3" class="cont"><input name="ADDR" type="text" style="width:650px" class="formBox6" value="${bean.ADDR}" /></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>

	  <!-- 첨부자료 -->
	  <h4><img src="/rams/images/register/st_data.gif" alt="첨부자료" /></h4>
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th style="width:150px;" scope="col">사업계획서</th>
				<td style="width:253px;text-align:left;padding-left:10px;" class="cont">
					<table width="244px">
					<tr>
						<td width="160px"><input id="PLAN" name="PLAN" type="text" value="${bean.PLAN_FILE}"  class="formBox6" style="width:90%" readonly="readonly"/></td>
						<td width="42px"><div style="background-image:url(/rams/images/common/btn_add4.gif);width:42px;height:19px;overflow:hidden;">
						 <input type="file" name="PLAN_FILE" style="border:0;background-color:white;width:62px;filter:alpha(opacity=0)" onchange="document.getElementById('PLAN').value=this.value">
						</div>
						</td>
						<td width="42px">
							<img src="/rams//images/common/btn_del5.gif" alt="삭제" width="42px" height="19px" onclick="document.getElementById('PLAN').value=''" style="border:0px;cursor:pointer;"/>
						</td>
					</tr>
					</table>
				</td>
				<th style="width:150px;" scope="col">도로공사시행허가 내용공고 </th>
				<td style="width:260px;text-align:left;padding-left:10px;" class="cont">
					<table width="244px">
					<tr>
						<td width="150px"><input id="NOTICE" name="NOTICE" type="text" value="${bean.NOTICE_FILE}"  class="formBox6" style="width:90%" readonly="readonly"/></td>
						<td width="42px"><div style="background-image:url(/rams/images/common/btn_add4.gif);width:42px;height:19px;overflow:hidden;">
						 <input type="file" name="NOTICE_FILE" style="border:0;background-color:white;width:62px;filter:alpha(opacity=0)" onchange="document.getElementById('NOTICE').value=this.value">
						</div>
						</td>
						<td width="42px">
							<img src="/rams//images/common/btn_del5.gif" alt="삭제" width="42px" height="19px" onclick="document.getElementById('NOTICE').value=''" style="border:0px;cursor:pointer;"/>
						</td>
					</tr>
					</table>
				</td>
			  </tr>
			  <tr>
				<th scope="col">도면자료</th>
				<td style="width:663px;text-align:left;padding-left:10px;" colspan="3" class="cont">
					<table width="474px">
					<tr>
						<td width="390px"><input id="PRINT" name="PRINT" type="text" value="${bean.PRINT_FILE}"  class="formBox6" style="width:90%" readonly="readonly"/></td>
						<td width="42px"><div style="background-image:url(/rams/images/common/btn_add4.gif);width:42px;height:19px;overflow:hidden;">
						 <input type="file" name="PRINT_FILE" style="border:0;background-color:white;width:62px;filter:alpha(opacity=0)" onchange="document.getElementById('PRINT').value=this.value">
						</div>
						</td>
						<td width="42px">
							<img src="/rams//images/common/btn_del5.gif" alt="삭제" width="42px" height="19px" onclick="document.getElementById('PRINT').value=''" style="border:0px;cursor:pointer;"/>
						</td>
					</tr>
					</table>
				</td>
			  </tr>
			  <tr>
				<th scope="col">기타자료</th>
				<td style="width:663px;text-align:left;padding-left:10px;" colspan="3" class="cont">
					<table width="474px">
					<tr>
						<td width="390px"><input id="ETC" name="ETC" type="text" value="${bean.ETC_FILE}"  class="formBox6" style="width:90%" readonly="readonly"/></td>
						<td width="42px"><div style="background-image:url(/rams/images/common/btn_add4.gif);width:42px;height:19px;overflow:hidden;">
						 <input type="file" name="ETC_FILE" style="border:0;background-color:white;width:62px;filter:alpha(opacity=0)" onchange="document.getElementById('ETC').value=this.value">
						</div>
						</td>
						<td width="42px">
							<img src="/rams//images/common/btn_del5.gif" alt="삭제" width="42px" height="19px" onclick="document.getElementById('ETC').value=''" style="border:0px;cursor:pointer;"/>
						</td>
					</tr>
					</table>
				</td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>

</form>
</body>
</html>
