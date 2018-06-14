package jeus_jspwork._jsp._admin._main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_user_5fmodify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(13,18);to=(13,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AUTHURNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(88,15);to=(88,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(103,63);to=(103,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TARGET_ID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(111,6);to=(111,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(116,87);to=(116,96)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PART}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(120,99);to=(120,114)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ASSIGNWORK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(143,95);to=(143,108)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.USERNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(147,51);to=(147,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.USERID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(151,91);to=(151,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PASS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(159,129);to=(159,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.JUMINNUM1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(159,273);to=(159,287)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.JUMINNUM2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(163,118);to=(163,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.TEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(163,247);to=(163,256)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.TEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(163,375);to=(163,384)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.TEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(164,113);to=(164,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.INLINENUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(168,121);to=(168,131)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.MTEL1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(168,252);to=(168,262)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.MTEL2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(168,383);to=(168,393)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.MTEL3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(172,89);to=(172,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.EMAIL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script type=\"text/javascript\" src=\"/rams/js/calculation.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction checkAuthur(){\r\n\tvar authur = '";
  private final static String _jspx_template7 = "';\r\n\tfor(var i = 0 ; i < authur.length ; i ++){\r\n\t\tcheckAuthurForm(authur.substring(i,i+1));\r\n\t}\r\n}\r\nfunction checkAuthurForm(num){\r\n\tdocument.getElementsByName(\"AUTHUR\")[num].checked = true;\r\n}\r\nfunction goUpdate(){\r\n\tif(!confirm(\"수정하시겠습니까??\")){\r\n        return;\r\n    }\r\n\t\r\n\tvar\tresult\t= DataCheck();\r\n\tif(result\t==\tfalse)\r\n\t\treturn;\r\n\t\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/admin/user/user_modify_prc.do\";\r\n\tform.submit();\r\n}\r\n\r\n\r\nfunction\tDataCheck()\r\n{\r\n    var form \t= document.form;\r\n    var\tstr\t\t= \"\";\r\n    if(form.USERNAME.value.length\t< 1)\r\n    {\r\n        str\t+= \"이름를 입력하세요\\n\";\r\n        alert(str);\r\n        form.USERNAME.focus();\r\n    }\r\n    else if(form.PASS.value.length\t< 1)\r\n    {\r\n        str\t+= \"패스워드를 입력하세요\\n\";\r\n        alert(str);\r\n        form.PASS.focus();\r\n    }\r\n    else if(form.PASS2.value.length\t< 1 && form.PASS.value != form.PASS2.value)\r\n    {\r\n        str\t+= \"패스워드 확인을 입력하세요\\n\";\r\n        alert(str);\r\n        form.PASS2.focus();\r\n    }\r\n    else if(form.JUMINNUM1.value.length\t< 6)\r\n    {\r\n        str\t+= \"주민번호를 입력하세요\\n\";\r\n        alert(str);\r\n        form.JUMINNUM1.focus();\r\n    }\r\n    else if(form.JUMINNUM2.value.length\t< 7)\r\n    {\r\n        str\t+= \"주민번호를 입력하세요\\n\";\r\n        alert(str);\r\n        form.JUMINNUM2.focus();\r\n    }\r\n    else if(form.EMAIL.value.length\t< 1)\r\n    {\r\n        str\t+= \"이메일을 입력하세요\\n\";\r\n        alert(str);\r\n        form.EMAIL.focus();\r\n    }\r\n\t\r\n    if(str\t== \"\")\r\n    {\r\n        return\ttrue;\r\n    }\r\n\r\n    return\tfalse;\r\n}\r\n\r\n\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template8 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\topener.location.reload();\r\n\t\twindow.close();\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\n</script>\r\n</head>\r\n<body onload=\"init();checkAuthur();\">\r\n<form id='form' name='form' method='post'>\r\n<input type=\"hidden\" id=\"TARGET_ID\" name=\"TARGET_ID\" value=\"";
  private final static String _jspx_template9 = "\"></input>\r\n<div id=\"idReq\">\r\n\t<h1><img src=\"/rams/images/manage/tt02.gif\" alt=\"아이디신청\" /></h1>\r\n\t<p class=\"t_org\">* 사용자 정보를 변경하세요.</p>\r\n\t<table width=\"520\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#d0e1e9\" class=\"mapPopup\">\r\n\t  <tr>\r\n\t\t<th width=\"150\">소속기관</th>\r\n\t\t<td class=\"cont\">\r\n\t\t\t";
  private final static String _jspx_template10 = "\r\n\t\t</td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>소속부서</th>\r\n\t\t<td class=\"cont\"><input name=\"PART\" id=\"PART\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template11 = "\" maxlength=\"10\"/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>담당업무</th>\r\n\t\t<td class=\"cont\"><input name=\"ASSIGNWORK\" id=\"ASSIGNWORK\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template12 = "\" maxlength=\"25\"/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>사용자 권한</th>\r\n\t\t<td class=\"cont\">\r\n\t\t<table>\r\n\t\t<tr>\r\n\t\t<td width=\"100\" style=\"text-align:left;\"><input type=\"checkbox\" name=\"AUTHUR\" value=\"0\">관리자</input></td>\r\n\t\t<td width=\"100\" style=\"text-align:left;\"><input type=\"checkbox\" name=\"AUTHUR\" value=\"1\">시유지 조회</input></td>\r\n\t\t<td width=\"100\" style=\"text-align:left;\"><input type=\"checkbox\" name=\"AUTHUR\" value=\"2\">소송정보 관리</input></td>\r\n\t\t</tr>\r\n\t\t<tr>\r\n\t\t<td style=\"text-align:left;\"><input type=\"checkbox\" name=\"AUTHUR\" value=\"3\">보상용지 관리</input></td>\r\n\t\t<td style=\"text-align:left;\"><input type=\"checkbox\" name=\"AUTHUR\" value=\"4\">공사대장 조회</input></td>\r\n\t\t<td style=\"text-align:left;\"><input type=\"checkbox\" name=\"AUTHUR\" value=\"5\">의사결정 지원</input></td>\r\n\t\t</tr>\r\n\t\t</table>\r\n\t\t\r\n\t\t\r\n\t\t</td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>이 름 </th>\r\n\t\t<td class=\"cont\"><input name=\"USERNAME\" id=\"USERNAME\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template13 = "\"  maxlength=\"10\"/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>아이디</th>\r\n\t\t<td style=\"text-align:left;padding-left:10px\">";
  private final static String _jspx_template14 = "</td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>패스워드</th>\r\n\t\t<td class=\"cont\"><input name=\"PASS\" id=\"PASS\" type=\"password\" class=\"formBox6\" value=\"";
  private final static String _jspx_template15 = "\"  maxlength=\"10\"/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>패스워드 확인 </th>\r\n\t\t<td class=\"cont\"><input name=\"PASS2\"  id=\"PASS2\" type=\"password\" class=\"formBox6\"  value=\"\"  maxlength=\"10\"/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>주민번호</th>\r\n\t\t<td class=\"cont\"><input name=\"JUMINNUM1\" id=\"JUMINNUM1\"  type=\"text\" class=\"formBox2\" onkeydown='onlyNumberInput();' value=\"";
  private final static String _jspx_template16 = "\"  maxlength=\"6\"/> - <input name=\"JUMINNUM2\" id=\"JUMINNUM2\" type=\"text\" class=\"formBox2\" onkeydown='onlyNumberInput();' value=\"";
  private final static String _jspx_template17 = "\"  maxlength=\"7\"/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>전화번호</th>\r\n\t\t<td class=\"cont\"><input name=\"TEL1\" id=\"TEL1\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value=\"";
  private final static String _jspx_template18 = "\"  maxlength=\"4\"/> - <input name=\"TEL2\" id=\"TEL2\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value=\"";
  private final static String _jspx_template19 = "\" maxlength=\"4\"/> - <input name=\"TEL3\" id=\"TEL3\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value=\"";
  private final static String _jspx_template20 = "\" maxlength=\"4\"/> &nbsp;내선: \r\n\t\t  <input name=\"INLINENUM\" id=\"INLINENUM\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value=\"";
  private final static String _jspx_template21 = "\" maxlength=\"4\"/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>휴대폰번호</th>\r\n\t\t<td class=\"cont\"><input name=\"MTEL1\" id=\"MTEL1\"  type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value=\"";
  private final static String _jspx_template22 = "\" maxlength=\"4\"/> - <input name=\"MTEL2\" id=\"MTEL2\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value=\"";
  private final static String _jspx_template23 = "\" maxlength=\"4\"/> - <input name=\"MTEL3\" id=\"MTEL3\" type=\"text\" class=\"formBox7\" onkeydown='onlyNumberInput();' value=\"";
  private final static String _jspx_template24 = "\" maxlength=\"4\"/></td>\r\n\t  </tr>\r\n\t  <tr>\r\n\t\t<th>E-mail</th>\r\n\t\t<td class=\"cont\"><input name=\"EMAIL\" id=\"EMAIL\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template25 = "\" maxlength=\"50\"/></td>\r\n\t  </tr>\r\n  </table><table width=\"520\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td height=\"30\" align=\"right\" valign=\"bottom\"><img src=\"/rams/images/common/btn_modify.gif\" alt=\"수정\" onclick='goUpdate();' style='cursor:hand;' width=\"62\" height=\"19\" border=\"0\" /></td>\r\n    <td align=\"right\" valign=\"bottom\" width=\"70\"><a href=\"#\" onclick=\"window.close();\"><img src=\"/rams/images/common/btn_cancel.gif\" alt=\"취소\" border=\"0\"/></a></td>\r\n  </tr>\r\n</table>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
