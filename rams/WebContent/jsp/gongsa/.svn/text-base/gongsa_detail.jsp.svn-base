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


function goModify(constNum){
	var form = document.form;
	form.action = "/rams/gongsa/gongsa_modify.do?CONSTNUM="+constNum;
	form.submit();
	
}

function goDelete(constNum){
	
	if(!confirm("정말 삭제하시겠습니까?")){
        return;
    }
	
	var form = parent.document.form;
	form.action = "/rams/gongsa/gongsa_delete.do?CONSTNUM="+constNum;
	form.submit();
		
}

function goDown(filename,filepath){
	var url = "/rams/jsp/common/file_down.jsp?filename="+filename+"&filepath="+filepath;
	
	var form = document.form;
	form.action = url;
	form.submit();
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


</script>

</head>

<body onload="init();">
<form name="form" id="form" method="post">
  <table width="817" border="0" cellspacing="0" cellpadding="0">
	<tr>
      <td height="26" align="right" valign="bottom"><a href="#" onclick="goModify('${bean.CONSTNUM}');"><img src="/rams/images/common/btn_modify.gif" alt="수정" border="0"/></a></td>
	  <td width="70" align="right" valign="bottom"><a href="#" onclick="goDelete('${bean.CONSTNUM}');"><img src="/rams/images/common/btn_del3.gif" alt="삭제" width="62" height="19" border="0" /></a></td>
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
			<td style="width:253px;" width="203" class="cont">${bean.GOSIID}</td>
			<th style="width:150px;" width="150" scope="col">공사시행허가 내용공고 </th>
			<td style="width:260px;" class="310">${bean.ANNPERMISSION}</td>
		  </tr>
		  <tr>
			<th scope="col">도로의 종류(노선명)</th>
			<td class="cont">${bean.LINENAME}</td>
			<th scope="col">공사의 종류</th>
			<td class="cont">${bean.CONSTCATEG_NM}</td>
		  </tr>
		  <tr>
			<th scope="col">공사구간</th>
			<td style="width:663px;" colspan="3" class="cont">
				<c:choose>
				<c:when test="${bean.STARTSECTION == null}">
				</c:when>
				<c:otherwise>
				${bean.STARTSECTION } 부터 ${bean.ENDSECTION } 까지
				</c:otherwise>
				</c:choose>
			</td>
		  </tr>
		  <tr>
			<th scope="col">공사장소</th>
			<td style="width:663px;" colspan="3" class="cont">${bean.CONSTPLACE}</td>
		  </tr>
		  <tr>
			<th scope="col">착수일</th>
			<td class="cont">${bean.STARTDATE}</td>
			<th scope="col">준공일</th>
			<td class="cont">${bean.ENDDATE}</td>
		  </tr>
		  <tr>
			<th scope="col">공사사유</th>
			<td style="width:663px;" colspan="3" class="cont">${bean.REASON}</td>
		  </tr>
		</table>
	  </td>
	</tr>
  </table>
  
  
  <!-- 공사시행자(신청인) -->
  <h4><img src="/rams/images/register/st_pp.gif" alt="공사시행자(신청인)" /></h4>
  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
	<tr>
	  <td>
	  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
		  <tr>
			<th style="width:150px;" scope="col">성명(회사명)</th>
			<td style="width:253px;" class="cont">${bean.NAME}</td>
			<th style="width:150px;" width="203" scope="col">주민등록번호<br/>(사업자등록번호)</th>
			<td style="width:260px;" class="cont">${bean.JUMINNUM}</td>
		  </tr>
		  <tr>
			<th scope="col">연락처</th>
			<td class="cont">${bean.TEL}</td>
			<th scope="col">우편번호</th>
			<td class="cont">${bean.POSTNUM}</td>
		  </tr>
		  <tr>
			<th scope="col">주소</th>
			<td colspan="3" class="cont">${bean.ADDR}</td>
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
			<td style="width:253px;" class="cont"><a href="#" class="blue1" onclick="goDown('${bean.PLAN_FILE}','${filePath}${bean.FILELOC}')">${bean.PLAN_FILE}</a></td>
			<th style="width:150px;" width="203" scope="col">도로공사시행허가 내용공고 </th>
			<td style="width:260px;" class="cont"><a href="#" class="blue1" onclick="goDown('${bean.NOTICE_FILE}','${filePath}${bean.FILELOC}')">${bean.NOTICE_FILE}</a></td>
		  </tr>
		  <tr>
			<th scope="col">도면자료</th>
			<td colspan="3" class="cont"><a href="#" class="blue1" onclick="goDown('${bean.PRINT_FILE}','${filePath}${bean.FILELOC}')">${bean.PRINT_FILE}</a></td>
		  </tr>
		  <tr>
			<th scope="col">기타자료</th>
			<td colspan="3" class="cont"><a href="#" class="blue1" onclick="goDown('${bean.ETC_FILE}','${filePath}${bean.FILELOC}')">${bean.ETC_FILE}</a></td>
		  </tr>
		</table>
	  </td>
	</tr>
  </table>
</form>
</body>
</html>
