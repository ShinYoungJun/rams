package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_id_5frequest_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(14,8);to=(14,11)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${msg}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(15,12);to=(15,15)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${msg}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(117,5);to=(117,8)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${job}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(124,5);to=(124,7)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gu}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(129,87);to=(129,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.PART }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(133,98);to=(133,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.ASSIGNWORK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(137,95);to=(137,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.USERNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(141,91);to=(141,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.USERID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(145,91);to=(145,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.PASS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(149,94);to=(149,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.PASS2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(153,129);to=(153,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.JUMINNUM1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(153,273);to=(153,288)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.JUMINNUM2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(157,118);to=(157,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.TEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(157,246);to=(157,256)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.TEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(157,375);to=(157,385)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.TEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(158,113);to=(158,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.INLINENUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(162,121);to=(162,132)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.MTEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(162,253);to=(162,264)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.MTEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(162,385);to=(162,396)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.MTEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(166,90);to=(166,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean2.EMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script type=\"text/javascript\" src=\"/rams/js/calculation.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction init(){\r\n\r\n\tif('";
  private final static String _jspx_template7 = "' != ''){\r\n\t\talert('";
  private final static String _jspx_template8 = "');\r\n\t\twindow.close();\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n\t\r\n}\r\nfunction goInsert(){\r\n\t\r\n\tvar form = document.getElementById('fm');\r\n\r\n\tvar\tresult\t= DataCheck();\r\n\r\n\tif(result\t==\tfalse)\r\n\t\treturn;\r\n\t\r\n\tform.action = '/rams/admin/user/idRequestPrc.do';\r\n\tform.submit();\r\n\t\r\n}\r\n\r\nfunction\tDataCheck()\r\n{\r\n    var form \t= document.form;\r\n    var\tstr\t\t= \"\";\r\n\t// 기본사항\r\n\t\r\n\t\r\n    if(document.getElementById('PART').value.length\t< 1)    \r\n    {\r\n        str\t+= \"소속부서를 입력하세요\\n\";\r\n        alert(str);\r\n        document.getElementById('PART').focus();\r\n    }\r\n    else if(document.getElementById('ASSIGNWORK').value.length\t< 1)\r\n    {\r\n        str\t+= \"담당업무를 입력하세요\\n\";\r\n        alert(str);\r\n        document.getElementById('ASSIGNWORK').focus();\r\n    }\r\n    else if(document.getElementById('USERNAME').value.length\t< 1)\r\n    {\r\n        str\t+= \"이름을 입력하세요\\n\";\r\n        alert(str);\r\n        document.getElementById('USERNAME').focus();\r\n    }\r\n    else if(document.getElementById('USERID').value.length\t< 1)\r\n    {\r\n        str\t+= \"아이디를 입력하세요\\n\";\r\n        alert(str);\r\n        document.getElementById('USERID').focus();\r\n    }\r\n    else if(document.getElementById('PASS').value.length\t< 4)\r\n    {\r\n        str\t+= \"패스워드를 4자리 이상 입력하세요 \\n\";\r\n        alert(str);\r\n        document.getElementById('PASS').focus();\r\n    }\r\n    else if(document.getElementById('JUMINNUM1').value.length\t< 6)\r\n    {\r\n        str\t+= \"주민번호를 입력하세요\\n\";\r\n        alert(str);\r\n        document.getElementById('JUMINNUM1').focus();\r\n    }\r\n    else if(document.getElementById('JUMINNUM2').value.length\t< 7)\r\n    {\r\n        str\t+= \"주민번호를 입력하세요\\n\";\r\n        alert(str);\r\n        document.getElementById('JUMINNUM2').focus();\r\n    }\r\n    else if(document.getElementById('EMAIL').value.length\t< 1)\r\n    {\r\n        str\t+= \"이메일을 입력하세요\\n\";\r\n        alert(str);\r\n        document.getElementById('EMAIL').focus();\r\n    }\r\n    else if(document.getElementById('PASS').value != document.getElementById('PASS2').value)\r\n    {\r\n        str\t+= \"패스워드가 다릅니다.\\n\";\r\n        alert(str);\r\n        document.getElementById('PASS').focus();\r\n    }\r\n    \r\n\r\n    if(str\t== \"\")\r\n    {\r\n        return\ttrue;\r\n    }\r\n\r\n    return\tfalse;\r\n}\r\n</script>\r\n</head>\r\n<body onload='init();'>\r\n<div id=\"idReq\">\r\n\t<h1><img src=\"/rams/images/login/t_idreq.gif\" alt=\"아이디신청\" width=\"520\" height=\"20\" /></h1>\r\n\t<p class=\"t_org\">* 사용자 정보를 입력하세요.</p>\r\n\t<form id='fm' name='fm' method='post'>\r\n\t<table width=\"520\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#d0e1e9\" class=\"mapPopup\">\r\n\t  <tr>\r\n\t\t<th>업무권한</th>\r\n\t\t<td class=\"cont\">\r\n\t\t";
  private final static String _jspx_template9 = "\r\n\t\t</td>\r\n\t  </tr>\r\n\t  \r\n\t  <tr>\r\n\t\t<th width=\"150\">소속기관</th>\r\n\t\t<td class=\"cont\">\r\n\t\t";
  private final static String _jspx_template10 = "\r\n\t\t</td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>소속부서</th>\r\n\t\t<td class=\"cont\"><input name=\"PART\" id=\"PART\" type=\"text\" class=\"formBox6\" value='";
  private final static String _jspx_template11 = "' maxlength='15'/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>담당업무</th>\r\n\t<td class=\"cont\"><input name=\"ASSIGNWORK\" id=\"ASSIGNWORK\" type=\"text\" class=\"formBox6\" value='";
  private final static String _jspx_template12 = "' maxlength='15'/></td>\r\n  </tr>\t\r\n  <tr>\r\n\t\t<th>이 름 </th>\r\n\t\t<td class=\"cont\"><input name=\"USERNAME\" id=\"USERNAME\" type=\"text\" class=\"formBox6\" value='";
  private final static String _jspx_template13 = "' maxlength='15'/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>아이디</th>\r\n\t\t<td class=\"cont\"><input name=\"USERID\" id=\"USERID\" type=\"text\" class=\"formBox6\" value='";
  private final static String _jspx_template14 = "' maxlength='15'/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>패스워드</th>\r\n\t\t<td class=\"cont\"><input name=\"PASS\" id=\"PASS\" type=\"password\" class=\"formBox6\" value='";
  private final static String _jspx_template15 = "' maxlength='15'/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>패스워드 확인 </th>\r\n\t\t<td class=\"cont\"><input name=\"PASS2\"  id=\"PASS2\" type=\"password\" class=\"formBox6\" value='";
  private final static String _jspx_template16 = "' maxlength='15'/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>주민번호</th>\r\n\t\t<td class=\"cont\"><input name=\"JUMINNUM1\" id=\"JUMINNUM1\"  type=\"text\" class=\"formBox2\" onkeydown='onlyNumberInput();' value='";
  private final static String _jspx_template17 = "' maxlength='6'/> - <input name=\"JUMINNUM2\" id=\"JUMINNUM2\" type=\"text\" class=\"formBox2\" onkeydown='onlyNumberInput();' value='";
  private final static String _jspx_template18 = "' maxlength='7'/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>전화번호</th>\r\n\t\t<td class=\"cont\"><input name=\"TEL1\" id=\"TEL1\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value='";
  private final static String _jspx_template19 = "' maxlength='4'/> - <input name=\"TEL2\" id=\"TEL2\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();'value='";
  private final static String _jspx_template20 = "' maxlength='4'/> - <input name=\"TEL3\" id=\"TEL3\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value='";
  private final static String _jspx_template21 = "' maxlength='4'/> &nbsp;내선: \r\n\t\t  <input name=\"INLINENUM\" id=\"INLINENUM\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value='";
  private final static String _jspx_template22 = "'/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>휴대폰번호</th>\r\n\t\t<td class=\"cont\"><input name=\"MTEL1\" id=\"MTEL1\"  type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value='";
  private final static String _jspx_template23 = "' maxlength='4'/> - <input name=\"MTEL2\" id=\"MTEL2\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value='";
  private final static String _jspx_template24 = "' maxlength='4'/> - <input name=\"MTEL3\" id=\"MTEL3\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value='";
  private final static String _jspx_template25 = "' maxlength='4'/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>E-mail</th>\r\n\t\t<td class=\"cont\"><input name=\"EMAIL\" id=\"EMAIL\" type=\"text\" class=\"formBox6\"  value='";
  private final static String _jspx_template26 = "'/></td>\r\n\t  </tr>\r\n  </table><table width=\"520\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td height=\"30\" align=\"right\" valign=\"bottom\"><img src=\"/rams/images/common/btn_input.gif\" alt=\"입력\" onclick='goInsert();' style='cursor:hand;' width=\"62\" height=\"19\" border=\"0\" /></td>\r\n    <td align=\"right\" valign=\"bottom\" width=\"70\"><a href=\"#\" onclick='window.close();'><img src=\"/rams/images/common/btn_cancel.gif\" alt=\"취소\" border=\"0\"/></a></td>\r\n  </tr>\r\n</table>\r\n</form>\r\n\r\n</div>\r\n</body>\r\n</html>\r\n";
}
