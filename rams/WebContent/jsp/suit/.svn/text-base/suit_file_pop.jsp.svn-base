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
		form.action = "/rams/suit/suit_file_pop_del.do";
		form.submit();
	}else{
		alert("삭제할 대상을 선택하세요");
	}
}
function goSave(){
	
	if(!confirm("제출자료를 추가하시겠습니까?")){
        return;
    }
	
	var	result	= DataCheck();
	if(result	==	false)
		return;
	
	var form = document.form;
	form.action = "/rams/suit/suit_file_pop_add.do";
	form.submit();

}

function	DataCheck()
{
    var form 	= document.form;
    var	str		= "";
    if(form.PRESENTDAY.value.length	< 1)
    {
        str	+= "일자를 입력하세요\n";
        alert(str);
        form.PRESENTDAY.focus();
    }
    else if(form.FILENAME.value.length	< 6)
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
		opener.location = "/rams/suit/suit_view.do?AFFAIRNUM="+form.AFFAIRNUM.value+"&PNU="+form.PNU.value;
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
<input id="AFFAIRNUM" name="AFFAIRNUM" type="hidden" value="${AFFAIRNUM}"></input>
<input id="PNU" name="PNU" type="hidden" value="${PNU}"></input>
<input id="FILEID" name="FILEID" type="hidden" value=""></input>
<div id="cont02">
	  
	  <!-- 제출 자료 등록/변경 관리 -->
	  <h3><img src="/rams/images/suit/st_manage2.gif" alt="제출 자료 등록/변경 관리"/></h3>
      <table width="680" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <th scope="row" width="5" height="100"><img src="/rams/images/suit/srch3_bg1.gif" alt="." /></th>
          <td background="/rams/images/suit/srch3_bg2.gif" class="srch">
			  <table width="650" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <th width="60" height="40" align="left" scope="row">자료 등록</th>
				  <td width="120">일자&nbsp;&nbsp;<input id="PRESENTDAY" name="PRESENTDAY" type="text" class="formBox2" readonly="readonly" /></td>
				  <td width="60"><a href="#" onclick="popUpCalendar(this, document.getElementById('PRESENTDAY'), 'yyyymmdd');"><img src="/rams/images/suit/cal.gif" alt="달력" border="0" /></a></td>
				  <td align="left">내용&nbsp;&nbsp;<input nid="CONTENT" name="CONTENT" type="text" class="formBox8" /></td>
				  <td width="70" align="right"><a href="#" onclick="goSave();"><img src="/rams/images/common/btn_add5.gif" alt="자료추가" width="62" height="19" border="0" /></a></td>
				</tr>
				<tr>
				  <th height="40" align="left" scope="row"></th>
				  <td>종류&nbsp;&nbsp;<select id="FILECATEG" name="FILECATEG" class="formBox2">
				  <option value="">::선택::</option>
				  <option value="문서">문서</option>
				  <option value="이미지">이미지</option>
				  <option value="기타">기타</option></select>
				  </td>
				  <td align="left">
				  <td align="left">
				  	<table>
				  	<tr>
					  	<td>
					  		파일위치&nbsp;&nbsp;<input id="FILENAME" name="FILENAME" type="text" class="formBox4" readonly="readonly"/>
					  	</td>
					  	<td height="19">
					  	<div style="background-image:url(/rams/images/common/btn_find.gif);width:62px;height:19px;overflow:hidden;">
						 <input type="file" id="SUIT_FILE" name="SUIT_FILE" style="border:0;background-color:white;width:62px;height:19px;filter:alpha(opacity=0)" onchange="document.getElementById('FILENAME').value=this.value">
						</div>
					  	</td>
				  	</tr>
				  	</table>
			  	  </td>
				  <td align="right"></td>
				</tr>
			  </table>
		  </td>
          <td width="5"><img src="/rams/images/suit/srch3_bg3.gif" alt="."/></td>
        </tr>
      </table>
	  
	  
	  <!-- 제출 자료 목록 -->
	  <h3><img src="/rams/images/suit/st_list3.gif" alt="제출 자료 목록"/></h3>
	  
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
			<table width="813" border="0" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
			    <td width="813" valign="top" style="text-align:left;background-color:#ddecf2">
					<table width="796" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
					  <tr height="26px">
					  	<th width="40" scope="row">선택</th>
						<th width="100" scope="row">일자</th>
						<th width="250" scope="row">내용</th>
						<th width="287" scope="row">첨부파일</th>
						<th width="120" scope="row">자료종류</th>
					  </tr>
					</table>
			    </td>
			  </tr>
			  <tr>
			    <td width="813" valign="top">
			    <div id="mainDisplay2" style="width:813px;height:150px;overflow-y:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;"">
				<table width="796" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
				  <c:forEach items="${blist}" var="blist">
				  <tr>
				  	<td width="40" height="26">
				  		<INPUT TYPE="checkbox" NAME="SELECT_ITEM" onclick="checkItem(this);">
						<INPUT TYPE="hidden" NAME="FILEID_ARR" value="${blist.FILEID}">
			  		</td>
					<td width="100" >${blist.PRESENTDAY}</td>
					<td width="250" >${blist.CONTENT}</td>
					<td width="286" ><a href="#" class="blue1" onclick="goDown('${blist.FILENAME}','${filePath}${suitPath}')">${blist.FILENAME}</a></td>
					<td width="120" >${blist.FILECATEG}</td>
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
	  
	  
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
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
