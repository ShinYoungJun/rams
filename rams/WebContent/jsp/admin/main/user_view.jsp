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
</script>
</head>
<body>

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
    <h2><img src="/rams/images/manage/tt02.gif" alt="시유지 조회_대부사용 허가"/></h2>
	<div class="tab">
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td width="91" height="29"><img src="/rams/images/manage/tab01_on.gif" alt="소송정보" /></td>
          <td width="91"><a href="#" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image19','','/rams/images/manage/tab02_on.gif',1)"><img src="/rams/images/manage/tab02_off.gif" alt="권한관리" name="Image19" width="91" height="29" border="0" id="Image19" /></a></td>
          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
        </tr>
      </table>
	</div>
	<div class="list">
	  <table width="817" border="1" cellpadding="1" cellspacing="1" bordercolor="#d3e2ea">
		<tr>
		  <td>
		  	<table width="813" border="1" cellspacing="0" cellpadding="0" class="mapPopup" summary="" bordercolor="#bed6e1">
			  <tr>
				<th width="150" scope="col">구분</th>
				<th scope="col">내용</th>
			  </tr>
			  <tr>
				<td>소속기관</td>
				<td class="cont"><select name="select" class="formBox3">
				  <option>기관선택</option>
				  </select>
				</td>
			  </tr>
			  <tr>
				<td>소속부서</td>
				<td class="cont"><select name="select2" class="formBox3">
				  <option>부서선택</option>
				  </select>
				</td>
			  </tr>
			  <tr>
				<td>담당업무</td>
				<td class="cont"><input name="textfield" type="text" class="formBox3" /></td>
			  </tr>
			  <tr>
				<td>이 름</td>
				<td class="cont"><input name="textfield" type="text" class="formBox3" /></td>
			  </tr>
			  <tr>
				<td>아이디</td>
				<td class="cont"><input name="textfield" type="text" class="formBox3" /></td>
			  </tr>
			  <tr>
				<td>패스워드</td>
				<td class="cont"><input name="textfield" type="text" class="formBox3" /></td>
			  </tr>
			  <tr>
				<td>패스워드 확인 </td>
				<td class="cont"><input name="textfield" type="text" class="formBox3" /></td>
			  </tr>
			  <tr>
				<td>사용자 등급 </td>
				<td class="cont"><select name="select2" class="formBox3">
				  <option>선택하세요</option>
				  </select>
				</td>
			  </tr>
			  <tr>
				<td>전화번호</td>
				<td class="cont">
					<table border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="60"><input name="textfield2" type="text" class="formBox7" /></td>
						<td width="15">~</td>
						<td width="80"><input name="textfield2" type="text" class="formBox2" /></td>
						<td width="15">~</td>
						<td width="80"><input name="textfield3" type="text" class="formBox2" /></td>
						<td width="52">&nbsp;&nbsp;&nbsp; 내선 : </td>
						<td><input name="textfield2" type="text" class="formBox7" /></td>
					  </tr>
					</table>
				</td>
			  </tr>
			  <tr>
				<td>휴대폰번호</td>
				<td class="cont">
					<table border="0" cellspacing="0" cellpadding="0">
					  <tr>
						<td width="60"><input name="textfield2" type="text" class="formBox7" /></td>
						<td width="15">~</td>
						<td width="80"><input name="textfield2" type="text" class="formBox2" /></td>
						<td width="15">~</td>
						<td width="80"><input name="textfield3" type="text" class="formBox2" /></td>
					  </tr>
					</table>
				</td>
			  </tr>
			  <tr>
				<td>E-mail</td>
				<td class="cont"><input name="textfield" type="text" class="formBox3" /></td>
			  </tr>
			</table>
		  </td>
		</tr>
	  </table>
	  <table width="817" border="0" cellspacing="0" cellpadding="0">
		  <tr>
			<td height="30" align="right" valign="bottom"><a href="#"><img src="/rams/images/common/btn_see.gif" alt="목록보기" width="62" height="19" border="0" /></a></td>
			<td width="75" align="right" valign="bottom"><a href="#"><img src="/rams/images/common/btn_save.gif" alt="저장" width="62" height="19" border="0" /></a></td>
			<td width="75" align="right" valign="bottom"><a href="#"><img src="/rams/images/common/btn_cancel.gif" alt="취소" border="0" /></a></td>
		  </tr>
	  </table>
	  
	</div>
  </div>
</div>
</body>
</html>
