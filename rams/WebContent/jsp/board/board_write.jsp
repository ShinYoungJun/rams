<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ include file="/jsp/common/include.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Frameset//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd">
<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="ko">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR" />
<title>::::: 서울시 도로재산관리시스템 :::::</title>
<link rel="stylesheet" href="/rams/css/write_doro.css" type="text/css" />
	<link rel="stylesheet" type="text/css" href="/rams/css/xq_ui.css" />
	<link rel="stylesheet" type="text/css" href="/rams/css/xq_custom.css" />
	<script type="text/javascript" src="/rams/js/common.js"></script>
	<script type="text/javascript" src="/rams/js/board/XQuared.js?load_others=1"></script>
	<script type="text/javascript" src="/rams/js/board/plugin/SpringnotePlugin.js"></script>
	<script type="text/javascript" src="/rams/js/board/plugin/EditorResizePlugin.js"></script>
	<script type="text/javascript" src="/rams/js/board/plugin/MacroPlugin.js"></script>
	<script type="text/javascript" src="/rams/js/board/plugin/FlashMovieMacroPlugin.js"></script>
	<script type="text/javascript" src="/rams/js/board/plugin/swfupload/AC_OETags.js"></script>
	<script type="text/javascript" src="/rams/js/board/plugin/swfupload/swfupload.js"></script>
	<script type="text/javascript" src="/rams/js/board/plugin/swfupload/swfupload.queue.js"></script>
	<script type="text/javascript" src="/rams/js/board/plugin/FileUploadPlugin.js"></script>
	<script type="text/javascript" src="/rams/js/board/plugin/CustomStylePlugin.js"></script>
	<script type="text/javascript">//<![CDATA[
	var xed;
	
	window.onload = function() {
		xed = new xq.Editor("xqEditor");
		xed.config.imagePathForDefaultToolbar = '/rams/images/board/toolbar/ko/';
		
		xed.config.defaultToolbarButtons.fontFace = 
			{className:"fontFace", title:"글꼴", list:[
				{html:"굴림", style: {fontFamily:'굴림,Gulim'}, handler:"xed.handleFontFace('굴림,San-Serif')"},
				{html:"굴림체", style: {fontFamily:'굴림체,Gulimche'}, handler:"xed.handleFontFace('굴림체,San-Serif')"},
				{html:"궁서", style: {fontFamily:'궁서,Gungseou'}, handler:"xed.handleFontFace('궁서,Serif')"},
				{html:"궁서체", style: {fontFamily:'궁서체,Gungseouche'}, handler:"xed.handleFontFace('궁서체,Serif')"},
				{html:"돋움", style: {fontFamily:'돋움,Dotum'}, handler:"xed.handleFontFace('돋움,San-Serif')"},
				{html:"돋움체", style: {fontFamily:'돋움체,Dotumche'},handler:"xed.handleFontFace('돋움체,San-Serif')"},
				{html:"바탕", style: {fontFamily:'바탕,Batang'}, handler:"xed.handleFontFace('바탕,Serif')"},
				{html:"바탕체", style: {fontFamily:'바탕체,Batangche'}, handler:"xed.handleFontFace('바탕체,Serif')"},
                {html:"Arial", style: {fontFamily: "Arial"}, handler:"xed.handleFontFace('Arial')"},
                {html:"Comic Sans MS", style: {fontFamily: "Comic Sans MS"}, handler:"xed.handleFontFace('Comic Sans MS')"},
                {html:"Courier New", style: {fontFamily: "Courier New"}, handler:"xed.handleFontFace('Courier New')"},
                {html:"Georgia", style: {fontFamily: "Georgia"}, handler:"xed.handleFontFace('Georgia')"},
                {html:"Tahoma", style: {fontFamily: "Tahoma"}, handler:"xed.handleFontFace('Tahoma')"},
                {html:"Times", style: {fontFamily: "Times"}, handler:"xed.handleFontFace('Times')"},
                {html:"Trebuchte MS", style: {fontFamily: "Trebuchte MS"}, handler:"xed.handleFontFace('Trebuchte MS')"},
                {html:"Verdana", style: {fontFamily: "Verdana"}, handler:"xed.handleFontFace('Verdana')"}
			]};


		xed.config.defaultToolbarButtons.fontSize =
			{className:"fontSize", title:"글자 크기", list:[
                {html:"가나다라마바사 (8pt)", style: {fontSize: "8pt", marginBottom: "3px"}, handler:"xed.handleFontSize('1')"},
                {html:"가나다라마바사 (10pt)", style: {fontSize: "10pt", marginBottom: "3px"}, handler:"xed.handleFontSize('2')"},
                {html:"가나다라마바사 (12pt)", style: {fontSize: "12pt", marginBottom: "6px"}, handler:"xed.handleFontSize('3')"},
                {html:"가나다라마바사 (14pt)", style: {fontSize: "14pt", marginBottom: "10px"}, handler:"xed.handleFontSize('4')"},
                {html:"가나다라마바사 (18pt)", style: {fontSize: "18pt", marginBottom: "16px"}, handler:"xed.handleFontSize('5')"},
                {html:"가나다라마바사 (24pt)", style: {fontSize: "24pt", marginBottom: "6px"}, handler:"xed.handleFontSize('6')"}
			]};

		xed.config.defaultToolbarButtonList = [
			xed.config.defaultToolbarButtons.fontFace,
			xed.config.defaultToolbarButtons.fontSize,
			"separator",
			xed.config.defaultToolbarButtons.foregroundColor,
			xed.config.defaultToolbarButtons.backgroundColor,
			"separator",
			xed.config.defaultToolbarButtons.strongEmphasis,
			xed.config.defaultToolbarButtons.emphasis,
			xed.config.defaultToolbarButtons.underline,
			xed.config.defaultToolbarButtons.strike,
			xed.config.defaultToolbarButtons.superscription,
			xed.config.defaultToolbarButtons.subscription,
			xed.config.defaultToolbarButtons.removeFormat,
			"separator",
			xed.config.defaultToolbarButtons.justifyLeft,
			xed.config.defaultToolbarButtons.justifyCenter,
			xed.config.defaultToolbarButtons.justifyRight,
			xed.config.defaultToolbarButtons.justifyBoth,
			"separator",
			xed.config.defaultToolbarButtons.indent,
			xed.config.defaultToolbarButtons.outdent,
			xed.config.defaultToolbarButtons.unorderedList,
			xed.config.defaultToolbarButtons.orderedList,
			"separator",
			xed.config.defaultToolbarButtons.table,
			xed.config.defaultToolbarButtons.separator,
			xed.config.defaultToolbarButtons.character,
			"separator",
			xed.config.defaultToolbarButtons.html,
			"separator",
			xed.config.defaultToolbarButtons.undo,
			xed.config.defaultToolbarButtons.redo
		];

		// Customize Link and FileUpload Dialog
		xq.ui_templates.basicLinkDialog= '<form id="linkDialog" class="xqFormDialog lightweight" action="#">\n	<h3>link</h3>\n	<div class="dialog-content">\n		<label class="link-target">링크 대상</label>\n		<input type="text" name="text" class="type-text" value="" />\n		<p class="explain">URL을 입력해주세요.</p>\n		<label class="link-name">표시할 이름</label>\n		<input type="text" name="url" class="type-text" value="http://" />\n		<div class="dialog-buttons">\n			<a href="#" class="button-white cancel">취소</a>\n			<a href="#" class="button-gray submit">생성</a>\n		</div>\n	</div>\n<p class="option"><label><input type="checkbox" class="type-checkbox" name="newWindow"/>새 창으로 열립니다.</label></p>\n</form>'
		xq.ui_templates.basicFileUploadDialog='<form id="fileUploadDialog" class="xqFormDialog modal" method="post" enctype="multipart/form-data" target="uploadTarget" action="" >\n		<h3>파일 첨부</h3>\n		<div class="dialog-content">\n			<div class="attachment-section">\n				<label class="label" for="searchAttachFile">파일찾기</label><input type="file" class="type-text" id="searchAttachFile" name="tempFile" />\n			</div>\n			<div class="dialog-buttons">\n				<a href="#" class="button-white cancel">닫기</a>\n				<a href="#" class="button-gray submit">삽입</a>\n			</div>\n		</div>\n		<iframe id="uploadTarget" name="uploadTarget" src="" style="width:0;height:0;border:0px solid #fff;"></iframe>\n		<a href="#" class="cancel close-dialog"><img src="/rams/images/board/dialogs/icon_close.gif" alt="Close" /></a>\n<input type="hidden" name="accept" value="application/json" />	</form>';
		xq.ui_templates.basicMovieDialog='<form id="videoDialog" class="xqFormDialog modal">\n		<h3>동영상 삽입</h3>\n		<div class="dialog-content">\n			<p>동영상의 HTML 소스(object, embed 태그)를 입력하세요. Youtube, naver, 다음, 판도라tv, mncast, mgoon, 만득이네, 앤유등을 지원합니다.</p>\n			<textarea class="initialFocus" name="html"></textarea>\n			<div class="dialog-buttons">\n				<a href="#" class="button-white cancel">닫기</a>\n				<a href="#" class="button-gray submit">삽입</a>\n			</div>\n		</div>\n		<a href="#" class="cancel close-dialog"><img src="/rams/images/board/dialogs/icon_close.gif" alt="close" /></a>\n	</form>';
		xq.ui_templates.basicMultiFileUploadDialog= '<form id="multiFileUploadDialog" class="xqFormDialog modal" method="post" enctype="multipart/form-data">\n		<h3>이미지 삽입</h3>\n		<div class="dialog-content">\n			<div id="fileUploadContainer" class="attachment-section">\n				<p>한 파일당 최대 <strong>20MB</strong>까지 올릴 수 있고,<br/>한 번에 여러 개의 파일을 첨부할 수 있습니다.</p>\n				<div class="dialog-buttons upload-buttons"><div id="MultiFileUploaderDiv"></div></div>\n			</div>\n			<div id="fileListContainer" class="attachment-section">\n			</div>\n			<div class="dialog-buttons">\n				<a href="#" class="button-white cancel">닫기</a>\n				<a href="#" class="button-gray submit">삽입</a>\n			</div>\n			<p class="noti">\n				정상적으로 동작하지 않을 경우에는 기존 방식으로 업로드 하시길 바랍니다.<span><a href="#" onclick="xed.handleFileUpload(true)">기존 방식으로 업로드 하기</a></span>\n			</p>\n		</div>\n		<a href="#" class="cancel close-dialog"><img src="/rams/images/board/dialogs/icon_close.gif" alt="Close" /></a>\n		<div id="MultiFileUploader"></div>\n	</form>';
		xq.ui_templates.basicTableDialog= '<form id="tableDialog" class="xqFormDialog modal" action="#">\n		<h3 id="tableDialogTitle">테이블 삽입</h3>\n		<input type="hidden" name="tableDialogType" value="" />\n		<div class="dialog-content">\n			<fieldset class="table-type">\n				<legend>table type</legend>\n				<ul>\n					<li><a href="#" id="tableTypeDefaultValue" class="selected" onclick="xq.RichTableController.changeType(this, \'\'); return false;"><img src="/rams/images/board/dialogs/iconTable_01.gif?1214533817" alt="제목 없는 표" /></a></li>\n					<li><a href="#" onclick="xq.RichTableController.changeType(this, \'t\'); return false;"><img src="/rams/images/board/dialogs/iconTable_02.gif?1214533817" alt="상단에 제목 칼럼" /></a></li>\n					<li><a href="#" onclick="xq.RichTableController.changeType(this, \'l\'); return false;"><img src="/rams/images/board/dialogs/iconTable_03.gif?1214533817" alt="좌측에 제목 칼럼" /></a></li>\n					<li class="last-child"><a href="#" onclick="xq.RichTableController.changeType(this, \'tl\'); return false;"><img src="/rams/images/board/dialogs/iconTable_04.gif?1214533817" alt="상단과 좌측에 제목 칼럼" /></a></li>\n				</ul>\n				<input id="tableTypeField" type="hidden" name="tableType" value="" />\n			</fieldset>\n			<fieldset class="table-size">\n				<legend id="tableSizeLabel" class="font-variation">크기</legend>\n				<div class="wrapper">\n					<ul>\n						<li class="new-only">\n							<label>행</label>\n							<span class="controller"><input type="text" onchange="xq.RichTableController.previewTable(); return false;" id="tableRowsField" name="tableRows" value="3" class="type-text" /><span class="buttons"><img src="/rams/images/board/dialogs/arrow_top.gif" alt="plus" class="plus rows" onclick="xq.RichTableController.changeSize(this); return false;" /><img src="/rams/images/board/dialogs/arrow_bottom.gif" alt="minus" class="minus rows" onclick="xq.RichTableController.changeSize(this); return false;" /></span></span>\n						</li>\n						<li class="new-only">\n							<label>열</label>\n							<span class="controller"><input type="text" onchange="xq.RichTableController.previewTable(); return false;" id="tableColsField" name="tableCols" value="3" class="type-text" /><span class="buttons"><img src="/rams/images/board/dialogs/arrow_top.gif" alt="plus" class="plus cols" onclick="xq.RichTableController.changeSize(this); return false;" /><img src="/rams/images/board/dialogs/arrow_bottom.gif" alt="minus" class="minus cols" onclick="xq.RichTableController.changeSize(this); return false;" /></span></span>\n						</li>\n						<li class="table-width">\n							<label>너비</label>\n							<select class="tableWidths" onchange="xq.RichTableController.changeStyle(this); return false;">\n								<option value="fullsize">페이지에 맞춤</option>\n								<option value="content">내용에 맞춤</option>\n								<option value="pixel">고정 사이즈(px)</option>\n								<option value="percentage">페이지 대비 비율(%)</option>\n							</select>			\n							<input type="text" name="tableWidth" id="tableWidthValue" class="type-text height-box" style="display:none;" />				\n							<input type="hidden" name="tableWidthUnit" value="" id="tableWidthValueUnit" />				\n							<!--input type="checkbox" name="tableFixed" class="type-checkbox" /><label class="none font-valiation">Same cell spacing</label-->\n						</li>\n						<li class="table-height">\n							<label>높이</label>\n							<select class="tableHeights" onchange="xq.RichTableController.changeStyle(this); return false;">\n								<option selected value="content">내용에 맞춤</option>\n								<option value="pixel">고정 사이즈(px)</option>\n							</select>							\n							<input type="text" name="tableHeight" id="tableHeightValue" class="type-text height-box" style="display:none;" />\n							<input type="hidden" name="tableHeightUnit" id="tableHeightValueUnit" />\n						</li>\n					</ul>\n					<div id="previewTable" class="new-only">\n						<table>\n							<tr>\n								<td></td>\n								<td></td>\n								<td></td>\n							</tr>\n							<tr>\n								<td></td>\n								<td></td>\n								<td></td>\n							</tr>\n							<tr>\n								<td></td>\n								<td></td>\n								<td></td>\n							</tr>\n						</table>\n					</div>\n				</div>\n			</fieldset>\n			<fieldset class="table-alignment">\n				<legend class="font-variation">정렬</legend>\n				<div class="wrapper">\n					<ul>\n						<li>\n							<label>가로</label>\n							<select name="tableHorizontalAlign">\n								<option value="left">왼쪽</option>\n								<option value="center">가운데</option>\n								<option value="right">오른쪽</option>\n							</select>\n						</li>\n						<li>\n							<label>세로</label>\n							<select name="tableVerticalAlign">\n								<option value="top">상단</option>\n								<option value="middle">중앙</option>\n								<option value="bottom">하단</option>\n							</select>\n						</li>\n					</ul>\n				</div>\n			</fieldset>\n			<fieldset class="table-border">\n				<legend class="font-variation">테두리</legend>\n				<div class="wrapper button-style03">\n					<ul>\n						<li class="weight-li">\n							<label>크기</label><span class="controller"><input type="text" name="tableBorderSize" value="0" class="type-text" /><span class="buttons"><img src="/rams/images/board/dialogs/arrow_top.gif" alt="" class="plus border" onclick="xq.RichTableController.changeSize(this); return false;" /><img src="/rams/images/board/dialogs/arrow_bottom.gif" alt="" class="minus border" onclick="xq.RichTableController.changeSize(this); return false;" /></span></span>\n						</li>\n						<li class="color-li">\n							<label>color</label>\n							<span class="color">\n								<a href="#" id="borderColorBoard" class="tableDialog border" onclick="xq.RichTableController.showColorPicker(this); return false;">&nbsp;</a>\n							</span>\n							<a href="#" class="tableDialog" onclick="xq.RichTableController.showColorPicker(this); return false;" title="search"><img src="/rams/images/board/dialogs/arrow06.gif" alt="search" class="search-color" /></a>\n							<input id="borderColorCode" type="hidden" name="tableBorderColor" value="#000000" />\n						</li>\n					</ul>\n				</div>\n			</fieldset>\n			<fieldset class="table-background">\n				<legend class="font-variation">배경</legend>\n				<div class="wrapper button-style03">\n					<ul>\n						<li>\n							<label>색상</label>\n							<span class="color">\n								<a href="#" id="backgroundColorBoard" class="tableDialog background" onclick="xq.RichTableController.showColorPicker(this); return false;">&nbsp;</a>\n							</span>\n							<a href="#" class="tableDialog" onclick="xq.RichTableController.showColorPicker(this); return false;" title="search"><img src="/rams/images/board/dialogs/arrow06.gif" alt="search" class="search-color" /></a>\n							<input id="backgroundColorCode" type="hidden" name="tableBackgroundColor" value="#ffffff" />\n						</li>\n					</ul>\n				</div>\n			</fieldset>\n			<div class="dialog-buttons">\n				<a href="#" class="button-white cancel">취소</a>\n				<a href="#" class="button-gray submit" id="tableDialogSubmit">삽입</a>\n			</div>\n		</div>\n		<a href="#" class="cancel close-dialog"><img src="/rams/images/board/dialogs/icon_close.gif" alt="close" /></a>\n	</form>';
		
		xed.config.autoFocusOnInit = true;
		xed.config.urlValidationMode = 'host_relative';
		xed.config.changeCursorOnLink = true;
		xed.config.enableLinkClick = true;
		
		xed.addPlugin('Springnote');
		xed.addPlugin('EditorResize');
		xed.addPlugin('Macro');
		xed.addPlugin('FileUpload');
		xed.addPlugin('FlashMovieMacro');
		xed.addPlugin('CustomStyle');
		
		xed.setFileUploadTarget('/client/examples/single_upload_submit.php', '/client/examples/upload.php');
		xed.config.contentCssList = ["/rams/css/xq_contents.css"];
		
		
		xed.config.PreventExitMessage = "저장하시겠습니까?";
	
		xed.setEditMode('wysiwyg');
		xed.setWidth("100%");
		
	}
	
	//]]></script>
	<script type="text/javascript">
	function goWritePrc(){
		
		var form = document.form;
		form.CONTENT.value = xed.getCurrentContent(true);
		form.action = "/rams/board/board_write_prc.do";
		form.submit();
		
	}
	
	function goList(){
		location.href = "/rams/board/board_list.do";
	}
	//공지사항 이동
	function goNotice(){
		var authur = '${userAuthur}';
		
		if(authur != null & authur.indexOf("0") < 0){
			alert('사용자 권한이 없습니다.');
			return;
		}
		
		location.href = "/rams/board/notice_list.do";
	}
	
	
	</script>

</head>

<body>
	<form name="form" id="form" method="post">
		<input type="hidden" name="CONTENT" value="" />
		<input type="hidden" name="MODE" value="${MODE}" />
		<input type="hidden" name="SEQNUM" value="${SEQNUM}" />
		<div id="cont01">
		  <!-- 히스토리 -->
		  <div>
		  <table width="817" border="0" cellspacing="0" cellpadding="0">
		    <tr>
		      <td align="right">
		      	<a href="#" ><img src="/rams//images/suit/home.gif" alt="home" border="0" /></a> > 
		      	<a href="#" class="blue1" onclick="goList();">게시판 </a> > <strong>게시물 작성</strong>
	      	  </td>
		    </tr>
		  </table>
		  </div>
		  
		  <!-- 검색 -->
		  <div>
		    <h2><img src="/rams//images/board/tt06.gif" alt="게시판_글쓰기"/></h2>
			<div class="tab">
			  <table width="817" border="0" cellspacing="0" cellpadding="0">
		        <tr>
		          <td width="91" height="29">
		          	<img src="/rams/images/board/tab02_on.gif" alt="게시판" />
		          </td>
		          <td width="91">
		          	<a href="#"  onclick="goNotice();" onmouseout="MM_swapImgRestore()" onmouseover="MM_swapImage('Image19','','/rams/images/board/tab01_on.gif',1)"><img src="/rams/images/board/tab01_off.gif" alt="공지사항" name="Image19" width="91" height="29" border="0" id="Image19" /></a>
		          </td>
		          <td background="/rams/images/map/p_tab_bg.gif">&nbsp;</td>
		        </tr>
		      </table>
			</div>
		  </div>
		</div>
		
		<div id="cont03">
			<div class="list2">
			  <table width="817" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td height="3" colspan="2" background="/rams//images/board/dot3.gif"></td>
				  </tr>
				  <tr>
					<td class="cont3">이름</td>
					<td class="cont4">
						<input name="REGISTNAME" type="text" class="formBox6" value="${userName}" readonly="readonly"/>
						<input name="REGISID" type="hidden" class="formBox6" value="${userId}" />
					</td>
				  </tr>
				  <tr>
					<td class="cont3">제목</td>
					<td class="cont4">
						<input name="TITLE" type="text" class="formBox9" value="${board.TITLE}" />
					</td>
				  </tr>
				  <tr>
					<td height="30" align="center" bgcolor="f0f7fb" colspan="2">
					    <textarea name="content" id="xqEditor">
					    	 ${board.CONTENT} 
					    </textarea>
					</td>
				  </tr>
				  <tr>
					<td height="3" colspan="2" background="/rams//images/board/dot3.gif"></td>
				  </tr>
			  </table>
		
			  <table width="817" border="0" cellspacing="0" cellpadding="0">
				  <tr>
					<td height="30" align="center" valign="bottom">
						<table width="160" border="0" cellspacing="0" cellpadding="0">
						  <tr>
							<td align="center"><a href="#" onclick="goWritePrc();">
								<img src="/rams//images/common/btn_save.gif" alt="저장" width="62" height="19" border="0" />
							</a></td>
							<td align="center"><a href="#" onclick="goList();">
								<img src="/rams//images/common/btn_list2.gif" alt="목록" width="62" height="19" border="0" />
							</a></td>
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
