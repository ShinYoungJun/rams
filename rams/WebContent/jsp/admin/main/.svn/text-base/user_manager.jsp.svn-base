<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script type="text/javascript">

function initForm(){
	
	changeSelectTag("ISAPPROVE","${ISAPPROVE}");

	var _GuCd = document.getElementById("GU_CD");
	<c:forEach items="${guList}" var="guList">
		if('${guList.GU_CD}' != ''){
			new_option = new Option('${guList.GU_NM}','${guList.GU_CD}');
			if(new_option.value == '${GU_CD}'){
				new_option.selected = true;
			}
			_GuCd.options.add(new_option);
		}
	</c:forEach>
}

function goSearch(){
	var form = document.form;
	form.action = "/rams/admin/user/user_manager.do";
	form.submit();
}

function goApproveModify(name,userId,approve){
	var form = document.form;
	form.action = "/rams/admin/user/user_approve_modify.do?NAME="+name+"&USERID="+userId+"&APPROVE="+approve;
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

function goView(userId){
	var form = document.form;
	form.action = "/rams/admin/user/user_view.do";
	form.submit();
	
}

function checkItem(obj){
	var selectItem_arr = document.getElementsByName("SELECT_ITEM");
	var userId_arr = document.getElementsByName("USERID_ARR");

	for(var i = 0; i < selectItem_arr.length; i ++){
		if(selectItem_arr[i] == obj){
			document.getElementById("TARGET_ID").value = userId_arr[i].value;
		}else{
			selectItem_arr[i].checked = false;
		}
	}
}

function goDelete(){
	if(!confirm("삭제하시겠습니까?")){
        return;
    }
	
	var targetId = document.getElementById("TARGET_ID").value;
	var form = document.form;
	form.action = "/rams/admin/user/user_delete.do?TARGET_ID="+targetId;
	form.submit();
}

function goModify(){
	var targetId = document.getElementById("TARGET_ID").value;
	
	var winPosLeft = 'left='+(screen.width - 520) / 2; // 새창 x 좌표 
	var winPosTop = 'top='+(screen.height - 500 - 100) / 2; // 새창 y 좌표 
	var param = "resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, "+winPosLeft+","+ winPosTop+", width=520, height=600";
	
	window.open("/rams/admin/user/user_modify.do?TARGET_ID="+targetId,"사용자정보변경", param);	
	
}

</script>
</head>
<body onload="init();initForm();">
<form name="form" id="form" method="post">
<input type="hidden" id="TARGET_ID" name="TARGET_ID"></input>
<div id="cont01">
  <!-- 히스토리 -->
  <div>
  <table width="817" border="0" cellspacing="0" cellpadding="0">
    <tr>
      <td align="right"><a href="#"><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > <a href="#" class="blue1">관리자 </a> > <strong>사용자관리 </strong></td>
    </tr>
  </table>
  </div>
  
  <!-- 검색 -->
  <div>
    <h2><img src="/rams/images/manage/tt01.gif" alt="사용자 관리 조회"/></h2>
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="5" height="50"><img src="/rams/images/suit/srch_bg1.gif" alt="." /></td>
		  <td background="/rams/images/suit/srch_bg2.gif" class="srch">
			  <table width="787" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td width="70" height="14" ><img src="/rams/images/suit/srch.gif" alt="검색"/></td>
				  <td width="47">사용자명</td>
				  <td width="160"><input  id="USERNAME" name="USERNAME" type="text" class="formBox1" value="${USERNAME}" /></td>
				  <td width="47">소속기관</td>
				  <td width="160">
				  <select id="GU_CD" name="GU_CD" class="formBox1">
				  	<option value="">::선택::</option>
			      </select>
			      </td>
				  <td width="47">승인여부</td>
				  <td width="160">
				  <select id="ISAPPROVE" name="ISAPPROVE" class="formBox1">
				  	<option value="">::선택::</option>
				  	<option value="Y">승인</option>
				  	<option value="N">미승인</option>
				  </select>
				  </td>
				  <td><a href="#" onclick="goSearch();"><img src="/rams/images/common/btn_srch3.gif" alt="검색" border="0" /></a></td>
				</tr>
			  </table>
		  </td>
		  <td width="5"><img src="/rams/images/suit/srch_bg3.gif" alt="."/></td>
		</tr>
	  </table>
	</div>
	<div class="list">
	

	   <table width="817">
		  <tr>
			<td align="right" height="30px">
			  <a href="#" onclick="goModify();"><img src="/rams/images/common/btn_modify.gif" alt="수정" width="62" height="19" border="0" /></a>
			  <a href="#" onclick="goDelete();"><img src="/rams/images/common/btn_del3.gif" alt="삭제" width="62" height="19" border="0" /></a>
		  	</td>
		  </tr>
	  </table>  
		  
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
			  	<th width="40" scope="col">선택</th>
			  	<th width="80" scope="col">사용자ID</th>
				<th width="80" scope="col">사용자명</th>
				<th width="80" scope="col">소속기관</th>
				<th width="100" scope="col">소속부서</th>
				<th width="130" scope="col">담당업무</th>
				<th width="143" scope="col">권&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;한</th>
				<th width="90" scope="col">승인여부</th>
				<th WIDTH="70" scope="col">승인</th>
			  </tr>
			  
		  	<c:choose>
			<c:when test="${blist!= null && !empty blist}">
		  	<c:forEach items="${blist}" var="blist">
			<tr onmouseover="trMoouseOver(this)" onmouseout="trMoouseOut(this)" style="cursor:pointer" >
				<td width="40" height="26">
					<INPUT TYPE="checkbox" NAME="SELECT_ITEM" onclick="checkItem(this);">
					<INPUT TYPE="hidden" NAME="USERID_ARR" value="${blist.USERID}">
			  	</td>
				<td>${blist.USERID}</td>
				<td>${blist.USERNAME}</td>
				<td>${blist.GU_NM}</td>
				<td>${blist.PART}</td>
				<td>${blist.ASSIGNWORK}</td>
				<td>
				<c:choose>
				<c:when test="${fn:indexOf(blist.AUTHURNAME,'0') != -1}">관리자</c:when>
				<c:otherwise>업무담당자</c:otherwise>
				</c:choose>
				</td>
				<td>
				<c:choose>
					<c:when test="${blist.ISAPPROVE == 'Y'}">승인</c:when>
					<c:otherwise>미승인</c:otherwise>
				</c:choose>
				</td>
				<td>
				<c:choose>
					<c:when test="${blist.ISAPPROVE == 'Y'}">
						<img src="/rams/images/common/btn_cancel2.gif" alt="취소" width="42" height="19" border="0" onclick="goApproveModify('${blist.USERNAME}','${blist.USERID}','N');" style="cursor:pointer;"/>
					</c:when>
					<c:otherwise>
						<img src="/rams/images/common/btn_approval.gif" alt="승인" width="42" height="19" border="0" onclick="goApproveModify('${blist.USERNAME}','${blist.USERID}','Y');" style="cursor:pointer;"/>
					</c:otherwise>
				</c:choose>
				</td>
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
		  </td>
		</tr>
	  </table>
	  <table width="817">
		  <tr>
			  <td height="40px" align="center">
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
</form>
</body>
</html>
