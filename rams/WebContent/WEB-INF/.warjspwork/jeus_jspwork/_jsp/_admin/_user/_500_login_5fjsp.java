package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_login_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return new String[] {
      "/jsp/common/include.jsp"
    };
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse  response)
      throws ServletException, IOException {

    JspFactory	_jspxFactory = null;
    PageContext	pageContext = null;
    HttpSession	session = null;
    ServletContext	application = null;
    ServletConfig	config = null;
    JspWriter	out = null;
    Object		page = this;
    String		_value = null;

    try {
      _jspxFactory = JspFactory.getDefaultFactory();
      pageContext = _jspxFactory.getPageContext(this, request, response, "", true, 8192, true);
      session = pageContext.getSession();
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      out = pageContext.getOut();

      response.setContentType("text/html;charset=MS949");

      out.write(_jspx_template0);
      out.write(_jspx_template1);
      out.write(_jspx_template2);
      out.write(_jspx_template3);
      out.write(_jspx_template4);
      out.write(_jspx_template5);
      out.write(_jspx_template6);
      // jsp code [from=(26,19);to=(26,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${message}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(238,5);to=(238,31)]
      out.write(_jspx_template7);
      // jsp code [from=(238,5);to=(238,31)]
      out.write(_jspx_template8);
      // jsp code [from=(280,5);to=(285,2)]
      out.write(_jspx_template9);
      out.write(_jspx_template10);

    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)) {
        if (out.getBufferSize() != 0) {
          try {
            out.clear();
          } catch (Exception _exc) { }
        }
        pageContext.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(pageContext);
    }
  }
  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script type=\"text/javascript\"><!--\r\n\r\n/*\r\nvar kkk22 = \"세외수입부과시스템 서버이전 작업 중입니다.\\n시간: 오후 3:00 ~ 4:00.\\n문의: 070 - 8889 - 3163 \\n테스트 시간 동안은 시스템 사용이 불가합니다.\";\r\nalert(kkk22);\r\n*/\r\n\r\n\r\n//팝업 적용시 roadsdb계정으로 공지사항 작성 후 글번호로 적용\r\nroads_boardDetailPop('554771');  \r\n\r\n\r\nfunction init()\r\n{\r\n\tvar form = document.loginForm;\r\n\r\n\tvar message = '";
  // jsp code [from=(238,5);to=(238,31)]
  private final static String _jspx_template7 = "';\r\n\t\r\n\tif(message != ''){\r\n\t\talert(message);\r\n\t}\r\n\r\n\tif (loc.indexOf(\"https://\") == -1) {\r\n\t\t//roads_boardDetailPop('226435');\r\n//\t\troads_boardDetailPop('250578'); /* SSL */\r\n//\t\troads_boardDetailPop('288800');  /* SSL 적용 팝업 */\r\n\t}\r\n}\r\n\r\n// 폼 체크\r\nfunction checkForm(obj)\r\n{\r\n\tvar form = document.loginForm;\r\n\tvar id;\r\n\tvar pw;\r\n\t\r\n\tif(obj == 'rams'){\r\n\t\tid = form.RAMS_USERID;\r\n\t\tpw = form.RAMS_PASS;\r\n\t\t\r\n\t}else{\r\n\t\tid = form.ROADS_USERID;\r\n\t\tpw = form.ROADS_PASS;\r\n\t\t\r\n\t}\r\n\t\r\n\t\r\n\tfor(var i=0; i<id.value.length; i++)\r\n\t{\r\n\t\tcode = id.value.substr(i,1);\r\n\t\tif(!isAllow(code))\r\n\t\t{\r\n\t\t\treturn;\r\n\t\t}\r\n\t}\r\n\tfor(var i=0; i<pw.value.length; i++)\r\n\t{\r\n\t\tcode = pw.value.substr(i,1);\r\n\t\tif(!isAllow(code))\r\n\t\t{\r\n\t\t\treturn;\r\n\t\t}\r\n\t}\t\t\r\n\tif(!checkStrNVMsg(id,\"아이디\")){\r\n\t\treturn;\r\n\t}\r\n\tif(!checkStrNVMsg(pw,\"비밀번호\")){\r\n\t\treturn;\r\n\t}\r\n\t\r\n\tif(obj == 'rams'){\r\n\t\tform.action = '/rams/admin/user/login.do';\r\n\t}else{\r\n\t\tform.action = '/admin/user/login.do';\t\r\n\t}\r\n\r\n\t// cookie에 저장된 id가 없으면 아이디저장 checkbox 언체크\r\n\tif (document.getElementById('idCheck').checked) \r\n\t{\r\n\t\tvar userId = document.getElementById('userid').value;\r\n\t\tsetCookie(\"userId\", userId, 30);\t// 30일 동안 id저장\r\n\t} else {\r\n\t\tdeleteCookie(\"userId\");\r\n\t}\r\n\t\r\n\tform.submit();\t\t\t\t\r\n}\r\n\r\n\r\n\r\nfunction fn_focus(obj)\r\n{\r\n\tvar form = document.ramsLoginForm;\r\n\t\r\n\tif(event.keyCode == 9) \r\n\t{\t\r\n\t\twindow.event.returnValue = false;\r\n\t\tobj.focus();\r\n\t}\t\r\n}\r\n\r\nfunction checkKeySearch()\r\n{\t\r\n\tif(event.keyCode == KEY_ENTER)\r\n\t\tcheckForm();\r\n}\r\n\r\n\r\n//아이디신청\r\nfunction fn_roads_regist()\r\n{\t\r\n\tvar winPosLeft = 'left='+(screen.width - 520) / 2; //  \r\n\t\tvar winPosTop = 'top='+(screen.height - 500 - 100) / 2; // \r\n\t\tvar param = \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, \"+winPosLeft+\",\"+ winPosTop+\", width=520, height=600\";\r\n\t\t\r\n\twindow.open('/admin/user/userReg.do?input_type=text',\"상세정보1\", param);\t\r\n}\r\n\r\n//아이디신청-rams\r\nfunction fn_rams_regist()\r\n{\t\r\n\tvar winPosLeft = 'left='+(screen.width - 520) / 2; //  \r\n\t\tvar winPosTop = 'top='+(screen.height - 500 - 100) / 2; // \r\n\t\tvar param = \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, \"+winPosLeft+\",\"+ winPosTop+\", width=540, height=450\";\r\n\t\t\r\n\twindow.open('/rams/admin/user/idRequest.do',\"상세정보1\", param);\t\r\n}\r\n\r\n//공지사항 상세view\r\nfunction roads_boardDetailPop(obj)\r\n{\t\r\n\tvar param = \"/admin/boardDetail.do?seq=\"+obj+\"&modeType=login\";\r\n    var winPosLeft = 'left='+(screen.width - 800) / 2; //  \r\n\t\tvar winPosTop = 'top='+(screen.height - 500 - 100) / 2; // \r\n\t\tvar param1 = \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, \"+winPosLeft+\",\"+ winPosTop+\", width=800, height=500\";\r\n\t\r\n\twindow.open( param, \"상세정보2\", param1);\t\r\n}\r\n\r\nfunction GetCookie(name){\r\n    var arg = name + \"=\";\r\n    var alen = arg.length;\r\n    var clen = document.cookie.length;\r\n    var i = 0;\r\n    \r\n    while(i < clen)\r\n {\r\n        var j = i + alen;\r\n        if(document.cookie.substring(i, j) == arg){\r\n        \treturn getCookieVal(j);\r\n        }\r\n        \r\n        i = document.cookie.indexOf(\" \", i) + 1;\r\n        \r\n        if(i == 0){\r\n        \tbreak;\r\n        }\r\n    }\r\n    return null;\r\n}\r\nfunction getCookieVal(offset){\r\n    var endstr = document.cookie.indexOf(\";\", offset);\r\n    \r\n    if(endstr == -1){\r\n        endstr = document.cookie.length;\r\n\t}\r\n    return unescape(document.cookie.substring(offset, endstr));\r\n}\r\n\r\n//cookie setting (2016.04 kny)\r\nfunction setCookie(cookieName, value, exdays){\r\n\tvar exdate = new Date();\r\n\texdate.setDate(exdate.getDate() + exdays);\r\n\tvar cookieValue = escape(value) + ((exdays==null) ? \"\" : \"; expires=\" + exdate.toGMTString());\r\n\tdocument.cookie = cookieName + \"=\" + cookieValue;\r\n}\r\n\r\n//delete from cookie (2016.04 kny)\r\nfunction deleteCookie(cookieName){\r\n\tvar expireDate = new Date();\r\n\texpireDate.setDate(expireDate.getDate() - 1);\r\n\tdocument.cookie = cookieName + \"= \" + \"; expires=\" + expireDate.toGMTString();\r\n}\r\n\r\nfunction expire()\r\n{ \r\n\tif(GetCookie(\"Notice\") != \"done\"){ \r\n\t\tnoticeOn(); \r\n\t} \r\n\r\n\t// 저장된 쿠키값을 가져와서 ID 칸에 넣어준다. 없으면 공백으로 들어감.\r\n\tvar getUserId = GetCookie(\"userId\");\r\n\t\r\n\tif(getUserId != null){\r\n\t\tdocument.getElem";
  // jsp code [from=(238,5);to=(238,31)]
  private final static String _jspx_template8 = "entById(\"userid\").value = getUserId;\r\n\t}\r\n\t\r\n\tif(document.getElementById(\"userid\").value != \"\"){\r\n\t\tdocument.getElementById('idCheck').checked = true;\r\n\t}\r\n\t/////////////////////////////////////////////////////////////////////// \r\n}\r\n\r\nfunction checkColor(seq,retVal){\r\n\tif(seq == 'seq1'){\r\n\t\t\r\n\t\tdocument.write('<FONT color=#FF0000>' + retVal + '</FONT>');\r\n\t}else{\r\n\t\tdocument.write(retVal);\r\n\t}\r\n\t\r\n}\r\n\r\nfunction noticeOn()\r\n{\r\n\t//window.open('/admin/user/noticePop.do?popup=1',\"공지사항\", \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, left=200,top=200,width=800, height=500\");\t\r\n}\r\n\r\n\r\n//////위로는 도로점용 찌꺼기\r\n// 여기부터 시작\r\nfunction goRamsNoticeDetail(seqNum){\r\n\twindow.open('/rams/admin/user/rams_notice_view.do?SEQNUM='+seqNum,\"공지사항\", \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, left=200,top=200,width=600, height=400\");\r\n}\r\n\r\n//********** BEGIN_KANG_20120829\r\nvar loc = new String(window.parent.document.location);\r\n\r\n";
  // jsp code [from=(280,5);to=(285,2)]
  private final static String _jspx_template9 = "\r\n\r\nfunction redirect(){\r\n\t\r\n\t//20180515\r\n\t//20180515 if(loc.indexOf(\"https://\") == -1) {\t// https가 아닌 경우만.\r\n\t//20180515\tvar url;\r\n\t//20180515\tif(loc.indexOf(\"http://\") == 0) {\r\n\t//20180515\t\turl = loc.replace(\"http://\", \"https://\");\r\n\t//20180515\t}else if(loc.indexOf(\"http://\" == -1) || (loc.indexOf(\"https://\") == -1)){\r\n\t//20180515\t\turl = loc.replace(\"http://\", \"https://\");\r\n\t//20180515\t}\t\r\n\t//20180515\twindow.location.replace(url);\r\n\t //20180515 }else{\r\n\t\tinit();\r\n\t\texpire();\r\n\t\t//20180515 }\r\n\r\n}\r\n\r\nfunction popHowhan(){\r\n\r\n\tvar param = \"\";\r\n\tvar winPosLeft = 'left='+(screen.width - 800) / 2; // 새창 x 좌표 \r\n\tvar winPosTop = 'top='+(screen.height - 500 - 300) / 2; // 새창 y 좌표 \r\n\tvar param1 = \"\";\r\n\t\r\n\t param = \"/admin/boardDetail.do?modeType=howhan\";\r\n\t param1 = \"resizable=no, status=no, scrollbars=yes, toolbar=no, menubar=no, \"+winPosLeft+\",\"+ winPosTop+\", width=770, height=800\";\r\n    \r\n\twindow.open( param, \"호환성보기설정\", param1);\t\r\n\t\r\n\t/*\r\n\tvar param = \"/admin/boardDetail.do?seq=\"+obj+\"&modeType=login\";\r\n  var winPosLeft = 'left='+(screen.width - 800) / 2; // 새창 x 좌표 \r\n\tvar winPosTop = 'top='+(screen.height - 500 - 100) / 2; // 새창 y 좌표 \r\n\tvar param1 = \"resizable=no, status=no, scrollbars=no, toolbar=no, menubar=no, \"+winPosLeft+\",\"+ winPosTop+\", width=800, height=500\";\r\n\t\r\n\twindow.open( param, \"상세정보2\", param1);\t\r\n\t*/\r\n}\r\n\r\n";
  private final static String _jspx_template10 = "\r\n//********** END_KANG_20120829\r\n\r\n--></script>\r\n</head>\r\n\r\n<body onload=\"redirect();MM_preloadImages('/rams/images/login/login_on01.gif','/rams/images/login/login_on02.gif')\">\r\n<form name=\"loginForm\" method=\"post\">\r\n\t<div id=\"wrapper\">\r\n\t  <div><img src=\"/rams/images/login/mimg.jpg\" alt=\"서울시도로재산관리시스템\" width=\"1024\" height=\"409\" /></div>\r\n\t  \r\n\r\n\t  \r\n\t  <!-- 도로점용관리 로그인 -->\r\n\t  <div class=\"loginP\">\r\n\t    <h3><img src=\"/rams/images/login/o_title.gif\" alt=\"도로점용관리(도로점용업무담당자)\" /></h3>\r\n\t\t<fieldset>\r\n\t\t  <legend>로그인정보</legend>\r\n\t\t  <p class=\"id\"><input type=\"text\" value=\"\" name=\"ROADS_USERID\" id=\"userid\" class=\"formBox6\" onKeyDown=\"fn_focus(document.loginForm.ROADS_PASS);checkKeySearch();\" /></p>\r\n\t\t  <p class=\"pw\"><input type=\"password\" value=\"\" name=\"ROADS_PASS\" class=\"formBox6\" onKeyDown=\"fn_focus(document.loginForm.ROADS_USERID);checkKeySearch();\" /></p>\r\n\t\t  <p class=\"btnP\"><a href=\"#\"><img src=\"/rams/images/login/login_off.gif\" alt=\"도로점용관리로그인\" border=\"0\" onclick=\"javascript:checkForm('roads');\" /></a></p>\r\n\t\t</fieldset>\r\n\t\t<div align=\"right\" style=\"margin-right: 70px;\"><label style=\"font-size: 11.5px;\"><input type=\"checkbox\"id=\"idCheck\" > 아이디저장</label></div>\r\n\t\t  <div class=\"memberInfo\" align=\"right\">\r\n\t\t  <a href=\"#\" onclick=\"fn_roads_regist();\" class=\"blue1\">아이디신청</a>\r\n\t\t  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n\t\t  </div>\r\n\t\t  <div class=\"noticeP\">\r\n\t\t\t<h4>\r\n\t\t\t\t<img src=\"/rams/images/login/o_notice.gif\" alt=\"도로점용관리 공지사항\" width=\"287\" height=\"25\" border=\"0\" usemap=\"#Map2\" />\r\n\t\t\t\t</h4>\r\n\t\t\t<ul>\r\n\t\t\t\r\n\t\t\t</ul>\r\n\t\t  </div>\r\n\t  </div>\r\n\r\n\t  \r\n\t  \r\n\t  <!-- 도로현황관리 로그인-->\r\n\t  <div class=\"loginO\">\r\n\t    <h3 style=\"padding-top: 20px;\"><img src=\"/rams/images/login/system_inquiry.png\" alt=\"시스템 이용문의\" /></h3>\r\n\t    <!-- p style=\"font-size: 12px; letter-spacing: 1px; padding-left: 8px;\">▶ 070 - 8889 - 3163</p> -->\r\n\t    <p style=\"font-size: 12px; letter-spacing: 1px; padding-left: 8px;\">▶ 070 - 8889 - 3275</p>\r\n\t    <!-- <p style=\"font-size: 12px; letter-spacing: 1px; padding-left: 8px;\">▶ ny_ksic@ksic.net</p> -->\r\n\t    <!-- p style=\"font-size: 12px; letter-spacing: 1px; padding-left: 8px;\">▶ kjh0123@ksic.net</p> -->\r\n\t    <p style=\"font-size: 12px; letter-spacing: 1px; padding-left: 8px;\">▶ syj0928@ksic.net</p>\r\n\t    <div style=\"padding: 10px 0 0 8px; font-size: 12px; cursor:pointer; text-decoration: u\" onclick=\"popHowhan('hohwan');\">\r\n\t\t\t☞ Internet Explorer 호환성보기 설정하는 방법\r\n      </div>\r\n\t    \r\n\t    <!-- \r\n\t\t<fieldset>\r\n\t\t  <legend>로그인정보</legend>\r\n\t\t  <p class=\"id\">\r\n\t\t    <input type=\"text\" name=\"RAMS_USERID\" class=\"formBox6\" onKeyDown=\"fn_focus(document.loginForm.RAMS_PASS);checkKeySearch();\" />\r\n\t\t  </p>\r\n\t\t  <p class=\"pw\">\r\n\t\t    <input type=\"password\" name=\"RAMS_PASS\" class=\"formBox6\" onKeyDown=\"fn_focus(document.loginForm.RAMS_USERID);checkKeySearch();\" />\r\n\t\t  </p>\r\n\t\t  <p class=\"btnO\"><a href=\"#\" onfocus=\"this.blur()\"><img src=\"/rams/images/login/login_off.gif\" alt=\"도로현황관리로그인\" border=\"0\" onclick=\"javascript:checkForm('rams');\" /></a></p>\r\n\t\t</fieldset>\r\n\t\t  <div class=\"memberInfo\" align=\"right\">\r\n\t\t  \t<a href=\"#\" class=\"blue1\" onclick=\"fn_rams_regist();\" onfocus=\"this.blur()\">아이디신청</a>\r\n\t\t  \t&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\r\n\t\t  </div>\r\n\t\t  <div class=\"noticeP\">\r\n\t\t\t<h4>\r\n\t\t\t\t<img src=\"/rams/images/login/p_notice.gif\" alt=\"도로현황관리 공지사항\" width=\"287\" height=\"25\" border=\"0\" usemap=\"#Map\" />\r\n\t\t\t\t</h4>\r\n\t\t\t<ul>\r\n\t\t\t\r\n\t\t\t</ul>\r\n\t\t  </div>-->\r\n\t  </div>  \r\n\t  \r\n\t</div>\r\n\t<div id=\"copy\">\r\n\t\t<img src=\"/rams/images/login/copy.gif\" alt=\"copyright\" width=\"1024\" height=\"96\" border=\"0\" usemap=\"#Map3\" />\r\n\t\t<map name=\"Map3\" id=\"Map3\">\r\n\t\t\t<area shape=\"rect\" coords=\"153,16,230,64\" href=\"#\" />\r\n\t\t\t<area shape=\"rect\" coords=\"243,25,350,47\" href=\"../../html/security/security2014.htm\" />\r\n\t\t\t<area shape=\"rect\" coords=\"701,24,767,57\" href=\"#\" />\r\n\t\t\t<area shape=\"rect\" coords=\"773,25,860,57\" href=\"#\" />\r\n\t\t</map>\r\n\t</div>\r\n\r\n  </form>\r\n</body>\r\n86\r\n</html>\r\n";
}
