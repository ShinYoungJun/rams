<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: ����� �����������ý��� :::::</title>
<link rel="stylesheet" href="/rams/css/doro.css" type="text/css" />
<script type="text/javascript" src="/rams/js/common.js"></script>
<script type="text/javascript">
function goSearch(){

	var form = document.form;
	form.action = "/rams/board/board_list.do";
	form.submit();
	
}
function goWrite(){
	
	var form = document.form;
	form.action = "/rams/board/board_write.do";
	form.submit();
	
}

function goView(seqnum){
	
	var form = document.form;
	form.action = "/rams/board/board_view.do?SEQNUM="+seqnum;
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

function goList(){
	location.href = "/rams/board/board_list.do";
}

//�������� �̵�
function goNotice(){
	var authur = '${userAuthur}';
	
	if(authur != null & authur.indexOf("0") < 0){
		alert('����� ������ �����ϴ�.');
		return;
	}
	
	location.href = "/rams/board/notice_list.do";
}

</script>
</head>
<body onload="init();">
<form name="form" id="form" method="post">

<div id="cont01">
  <!-- �����丮 -->
  <div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
	    <tr>
	      <td align="right">
	      	<a href="#" ><img src="/rams/images/suit/home.gif" alt="home" border="0" /></a> > 
	      	<a href="#" class="blue1" onclick="goList();">�Խ��� </a> > <strong>�Խù� ��ȸ </strong>
	      	</td>
	    </tr>
	  </table>
  </div>
  
  <!-- �˻� -->
  <div>
    <h2><img src="/rams/images/board/tt04.gif" alt="�Խ���_�Խù���ȸ"/></h2>
		<div class="tab">
		  <table width="817" border="0" cellspacing="0" cellpadding="0">
	        <tr>
	          <td width="91" height="29">
	          	<img src="/rams/images/board/tab02_on.gif" alt="�Խ���" />
	          </td>
	          <td width="91">
	          	<a href="#"  onclick="goNotice();" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image19','','/rams/images/board/tab01_on.gif',1)"><img src="/rams/images/board/tab01_off.gif" alt="��������" name="Image19" width="91" height="29" border="0" id="Image19" /></a>
	          </td>
	          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
	        </tr>
	      </table>
		</div>
	<div>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td width="5" height="50"><img src="/rams/images/	suit/srch_bg1.gif" alt="." /></td>
		  <td background="/rams/images/suit/srch_bg2.gif" class="srch" align="center">
			  <table width="700" border="0" cellspacing="0" cellpadding="0">
				<tr>
				  <td width="22" height="20" >
				  	<input type="checkbox" name="SEARCH_TERM1" value="checkbox" ${SEARCH_TERM1}/>
			  	  </td>
				  <td width="35" align="left">����</td>
				  <td width="22" height="20" >
				  	<input type="checkbox" name="SEARCH_TERM2" value="checkbox" ${SEARCH_TERM2}/>
			  	  </td>
				  <td width="35" align="left">����</td>
				  <td width="22" height="20" >
				  	<input type="checkbox" name="SEARCH_TERM3" value="checkbox" ${SEARCH_TERM3}/>
			  	  </td>
				  <td width="80" align="left">�ۼ���</td>
				  <td width="320"><input name="SEARCH_DATA" type="text" class="formBox8" value="${SEARCH_DATA}" /></td>
				  <td align="left">
				  	<a href="#" onclick="goSearch();">
				  		<img src="/rams/images/common/btn_srch3.gif" alt="�˻�" border="0" />
				  	</a>
			  	  </td>
				  <td align="right">
				  	<a href="#" onclick="goWrite();">
				  		<img src="/rams/images/common/btn_write.gif" alt="�۾���" border="0" />
			  		</a>
				  </td>
				</tr>
			  </table>
		  </td>
		  <td width="5"><img src="/rams/images/suit/srch_bg3.gif" alt="."/></td>
		</tr>
	  </table>
	</div>
  </div>
</div>

<div id="cont03">
	<div class="list2">
	  <table width="810px" border="0" cellspacing="0" cellpadding="0">
		<tr>
		  <td align="right" style="height:22px">��ü �Խù� �� : <strong class="style1">${listCount}</strong></td>
		  <td align="right" style="width:110px">���� ������ : <span class="style1"><strong>${currentPage}/${totalPageNum}</strong></span></td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<th scope="col" style="width:70px">��ȣ</th>
			<th scope="col">���� </th>
			<th scope="col" style="width:120px">�ۼ���</th>
			<th scope="col" style="width:120px">�ۼ���</th>
			<th scope="col" style="width:70px">��ȸ</th>
		  </tr>
	  <c:forEach items="${blist}" var="board" varStatus="idx">
		  <tr onmouseover="trMoouseOver(this)" onmouseout="trMoouseOut(this)"  style="cursor:pointer" onclick="goView('${board.SEQNUM}');">
			<td class="cont">${board.SEQNUM}</td>
			<td class="cont">${board.TITLE}</td>
			<td class="cont">${board.REGISTNAME}</td>
			<td class="cont">${board.REGISTDATE}</td>
			<td class="cont">${board.VIEWCNT}</td>
		  </tr>
	  </c:forEach>
	  	  <tr style="height:50px">
	  	  <td align="center" colspan="5">
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
</form>
</body>
</html>
