package jeus_jspwork._jsp._suit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_suit_5flawsuit_5fresult_5fpop_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(72,15);to=(72,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(86,64);to=(86,73)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(95,106);to=(95,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ANNOUNCEDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(97,77);to=(97,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OUTCOME_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(99,77);to=(99,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OUTCOME_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(101,77);to=(101,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OUTCOME_3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(104,104);to=(104,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.RESULT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(111,66);to=(111,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OUTCOME_4}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(113,66);to=(113,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OUTCOME_5}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(115,66);to=(115,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${OUTCOME_6}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction goSave(){\r\n\t\r\n\tif(!confirm(\"저장하시겠습니까?\")){\r\n        return;\r\n    }\r\n\t\r\n\tvar\tresult\t= DataCheck();\r\n\tif(result\t==\tfalse)\r\n\t\treturn;\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_lawsuit_result_modify_pop.do\";\r\n\tform.submit();\r\n\t\r\n}\r\n\r\nfunction\tDataCheck()\r\n{\r\n    var form \t= document.form;\r\n    var\tstr\t\t= \"\";\r\n\t// 기본사항\r\n\t// 토지정보\r\n\t\r\n\tvar _outcomeCheck = '';\r\n\tvar _outcome = document.getElementsByName(\"OUTCOME\");\r\n\tfor(var i = 0 ; i < _outcome.length ; i++){\r\n\t\tif(_outcome[i].checked == true){\r\n\t\t\t_outcomeCheck = _outcome[i].value; \r\n\t\t}\r\n\t}\r\n\t\r\n\t\r\n    if(form.ANNOUNCEDATE.value.length\t< 1)\r\n    {\r\n        str\t+= \"선고일자를 입력하세요\\n\";\r\n        alert(str);\r\n        form.TOTALAREA.focus();\r\n    }\r\n    else if(_outcomeCheck.length\t< 1)\r\n    {\r\n        str\t+= \"승패를 입력하세요\\n\";\r\n        alert(str);\r\n    }\r\n    else if(form.RESULT.value.length\t< 1)    \r\n    {\r\n        str\t+= \"판결결과를 선택하세요\\n\";\r\n        alert(str);\r\n        form.CATEG.focus();\r\n    }\r\n\t\r\n    if(str\t== \"\")\r\n    {\r\n        return\ttrue;\r\n    }\r\n\r\n    return\tfalse;\r\n}\r\n\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\twindow.close();\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\n</script>\r\n</head>\r\n<body onload=\"init();\">\r\n\t<form name=\"form\" id=\"form\" method=\"post\">\r\n\t<input type=\"hidden\" id=\"AFFAIRNUM\" name=\"AFFAIRNUM\" value=\"";
  private final static String _jspx_template8 = "\"></input>\r\n\t  <h3><img src=\"/rams/images/suit/st_input.gif\" alt=\"소송 결과 입력\"/></h3>\r\n\t  <!-- 기본사항 -->\r\n      <table width=\"790\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <th scope=\"row\" width=\"5\" height=\"70\"><img src=\"/rams/images/suit/srch2_bg1.gif\" alt=\".\" /></th>\r\n          <td background=\"/rams/images/suit/srch2_bg2.gif\" class=\"srch\"><table width=\"780\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n            <tr>\r\n              <th width=\"80\" height=\"23\" align=\"left\" scope=\"row\">판결선고일자</th>\r\n\t\t\t  <td width=\"100\"><input id=\"ANNOUNCEDATE\" name=\"ANNOUNCEDATE\" type=\"text\" class=\"formBox2\"  value=\"";
  private final static String _jspx_template9 = "\" readonly=\"readonly\"/></td>\r\n\t\t\t  <td width=\"70\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" onclick=\"popUpCalendar(this,ANNOUNCEDATE,'yyyymmdd')\" style=\"cursor:pointer;\"/></td>\r\n              <td width=\"20\"><input type=\"radio\" name=\"OUTCOME\" value=\"1\" ";
  private final static String _jspx_template10 = "/></td>\r\n              <td width=\"70\">승소</td>\r\n              <td width=\"20\"><input type=\"radio\" name=\"OUTCOME\" value=\"2\" ";
  private final static String _jspx_template11 = "/></td>\r\n              <td width=\"70\">패소</td>\r\n              <td width=\"20\"><input type=\"radio\" name=\"OUTCOME\" value=\"3\" ";
  private final static String _jspx_template12 = "/></td>\r\n              <td width=\"70\">화해권고결정</td>\r\n              <th width=\"60\">판결결과</th>\r\n              <td align=\"right\"><input id=\"RESULT\" name=\"RESULT\" type=\"text\" class=\"formBox1\" value=\"";
  private final static String _jspx_template13 = "\" /></td>\r\n              <td width=\"70\" align=\"right\"><a href=\"#\" onclick=\"goSave();\"><img src=\"/rams/images/common/btn_save.gif\" alt=\"저장\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n            </tr>\r\n            <tr>\r\n              <th height=\"23\" scope=\"row\"></th>\r\n              <td></td>\r\n              <td></td>\r\n              <td><input type=\"radio\" name=\"OUTCOME\" value=\"4\" ";
  private final static String _jspx_template14 = "/></td>\r\n              <td>강제조정</td>\r\n              <td><input type=\"radio\" name=\"OUTCOME\" value=\"5\" ";
  private final static String _jspx_template15 = "/></td>\r\n              <td>소취하</td>\r\n              <td><input type=\"radio\" name=\"OUTCOME\" value=\"6\" ";
  private final static String _jspx_template16 = "/></td>\r\n              <td>기타</td>\r\n              <th></th>\r\n              <td></td>\r\n              <td></td>\r\n            </tr>\r\n          </table></td>\r\n          <td width=\"5\"><img src=\"/rams/images/suit/srch2_bg3.gif\" alt=\".\"/></td>\r\n        </tr>\r\n      </table>\r\n      <table width=\"790\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td width=\"60\" height=\"30\" align=\"right\"><a href=\"#\" onclick=\"window.close();\"><img src=\"/rams/images/common/btn_cancel.gif\" alt=\"취소\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</form>\r\n</body>\r\n</html>\r\n";
}
