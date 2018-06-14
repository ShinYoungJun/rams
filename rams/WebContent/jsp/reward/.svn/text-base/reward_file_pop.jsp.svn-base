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
function goDelete(){
	
	if(document.getElementById("FILEID").value != null && document.getElementById("FILEID").value != ''){
		if(!confirm("삭제하시겠습니까?")){
	        return;
	    }
		var form = document.form;
		form.action = "/rams/reward/reward_file_pop_del.do";
		form.submit();
	}else{
		alert("삭제할 대상을 선택하세요");
	}
}
function goSave(){
	
	if(!confirm("관련자료를 추가하시겠습니까?")){
        return;
    }
	
	var	result	= DataCheck();
	if(result	==	false)
		return;
	
	var form = document.form;
	form.action = "/rams/reward/reward_file_pop_add.do";
	form.submit();

}

function	DataCheck()
{
    var form 	= document.form;
    var	str		= "";
    if(form.FILENAME.value.length	< 6)
    {
        str	+= "파일을 선택하세요\n";
        alert(str);
        form.FILENAME.focus();
    }
	
    if(str	== "")
    {
        return	true;
    }

    return	false;
}

function init(){
	var msg = '${MSG}';
	if(msg != ''){
		alert(msg);
		opener.location = "/rams/reward/reward_view.do?COMPEID="+form.COMPEID.value+"&PNU="+form.PNU.value;
		return;
	}else{
		return;
	}
}

function goDown(filename,filepath){
	var url = "/rams/jsp/common/file_down.jsp?filename="+filename+"&filepath="+filepath;
	var form = document.form;
	form.action = url;
	form.submit();
}

function checkItem(obj){
	
	var selectItem_arr = document.getElementsByName("SELECT_ITEM");
	var fileId_arr = document.getElementsByName("FILEID_ARR");

	for(var i = 0; i < selectItem_arr.length; i ++){
		if(selectItem_arr[i] == obj){
			document.getElementById("FILEID").value = fileId_arr[i].value;
		}else{
			selectItem_arr[i].checked = false;
		}
	}
	
}


</script>
</head>
<body onload="init();">
<form name="form" id="form" method="post" enctype="multipart/form-data">
<input id="COMPEID" name="COMPEID" type="hidden" value="${COMPEID}"></input>
<input id="PNU" name="PNU" type="hidden" value="${PNU}"></input>
<input id="FILEID" name="FILEID" type="hidden" value=""></input>
<div id="cont02">
	  
	  <!-- 제출 자료 등록/변경 관리 -->
	  <h3><img src="/rams/images/reward/st_manage2.gif" alt="관련 자료 등록/변경 관리"/></h3>
      <table width="437" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <th scope="row" width="5" height="100"><img src="/rams/images/suit/srch3_bg1.gif" alt="." /></th>
          <td background="/rams/images/suit/srch3_bg2.gif" class="srch">
			  <table width="407" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <th width="60" height="40" align="left" scope="row">자료 등록</th>
				  <td align="right">
				  	<table>
				  	<tr>
					  	<td>
					  		파일위치&nbsp;&nbsp;<input id="FILENAME" name="FILENAME" type="text" class="formBox4" readonly="readonly"/>
					  	</td>
					  	<td height="19">
					  	<div style="background-image:url(/rams/images/common/btn_find.gif);width:62px;height:19px;overflow:hidden;">
						 <input type="file" id="REWARD_FILE" name="REWARD_FILE" style="border:0;background-color:white;width:62px;height:19px;filter:alpha(opacity=0)" onchange="document.getElementById('FILENAME').value=this.value">
						</div>
					  	</td>
				  	</tr>
				  	</table>
			  	  </td>
				  <td align="right"></td>
				</tr>
				<tr>
				  	<td colspan="2" align="right"><a href="#" onclick="goSave();"><img src="/rams/images/common/btn_add5.gif" alt="자료추가" width="62" height="19" border="0" /></a></td>
				</tr>
			  </table>
		  </td>
          <td width="5"><img src="/rams/images/suit/srch3_bg3.gif" alt="."/></td>
        </tr>
      </table>
	  
	  
	  <!-- 제출 자료 목록 -->
	  <h3><img src="/rams/images/reward/st_list3.gif" alt="관련 자료 목록"/></h3>
	  
	  <table width=437 border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
			<table width="437" border="0" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
			    <td width="437" valign="top" style="text-align:left;background-color:#ddecf2">
					<table width="437" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
					  <tr height="26px">
					  	<th width="40" scope="row">선택</th>
						<th width="260" scope="row">파일이름</th>
						<th width="120" scope="row">일자</th>
						<th width="17" scope="row"></th>
					  </tr>
					</table>
			    </td>
			  </tr>
			  <tr>
			    <td width="437" valign="top">
			    <div id="mainDisplay2" style="width:437px;height:150px;overflow-y:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;"">
				<table width="420" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
				  <c:forEach items="${blist}" var="blist">
				  <tr>
				  	<td width="40" height="26">
				  		<INPUT TYPE="checkbox" NAME="SELECT_ITEM" onclick="checkItem(this);">
						<INPUT TYPE="hidden" NAME="FILEID_ARR" value="${blist.FILEID}">
			  		</td>
					<td width="260" ><a href="#" class="blue1" onclick="goDown('${blist.FILENAME}','${filePath}${rewardPath}')">${blist.FILENAME}</a></td>
					<td width="120" >${blist.REGISTDATE}</td>
				  </tr>			  
				  </c:forEach>
				</table>
			    </div>
			    </td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  
	  
	  <table width="437" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td height="40" align="right">
		  	<a href="#" onclick="goDelete();"><img src="/rams/images/common/btn_del3.gif" alt="삭제" width="62" height="19" border="0" /></a>
		  	<a href="#" onclick="window.close();"><img src="/rams/images/common/btn_close3.gif" alt="닫기" width="62" height="19" border="0" /></a>
	  	  </td>
		</tr>
	  </table>
</div>
</form>
</body>
</html>
