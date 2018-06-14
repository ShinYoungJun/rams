package jeus_jspwork._jsp._suit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_suit_5fowner_5fpop_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(89,15);to=(89,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(103,63);to=(103,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(104,51);to=(104,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(105,59);to=(105,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ISFIXED}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template18);

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
  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("blist");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template11);
            // jsp code [from=(123,11);to=(123,21)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);
            // jsp code [from=(124,11);to=(124,25)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.JUMINNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(125,11);to=(125,21)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(126,11);to=(126,20)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(127,11);to=(127,20)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.ETC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(128,106);to=(128,120)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.OWNERNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);

          } while (_jspx_th_c_forEach_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_0.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_0.doCatch(t);
      } finally {
        _jspx_th_c_forEach_0.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_0.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction goDelete(ownerNum){\r\n\tif(!confirm(\"삭제하시겠습니까?\")){\r\n        return;\r\n    }\r\n\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_owner_pop_del.do?OWNERNUM=\"+ownerNum;\r\n\tform.submit();\r\n\r\n}\r\nfunction goSave(){\r\n\t\r\n\tif(!confirm(\"저장하시겠습니까?\")){\r\n        return;\r\n    }\r\n\t\r\n\tvar\tresult\t= DataCheck();\r\n\tif(result\t==\tfalse)\r\n\t\treturn;\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_owner_pop_add.do\";\r\n\tform.submit();\r\n\r\n}\r\n\r\nfunction\tDataCheck()\r\n{\r\n    var form \t= document.form;\r\n    var\tstr\t\t= \"\";\r\n    if(form.NAME.value.length\t< 1)\r\n    {\r\n        str\t+= \"이름을 입력하세요\\n\";\r\n        alert(str);\r\n        form.NAME.focus();\r\n    }\r\n    else if(form.JUMINNUM_1.value.length\t< 6)\r\n    {\r\n        str\t+= \"주민번호를 입력하세요\\n\";\r\n        alert(str);\r\n        form.JUMINNUM_1.focus();\r\n    }\r\n    else if(form.JUMINNUM_2.value.length\t< 7)\r\n    {\r\n    \tstr\t+= \"주민번호를 입력하세요\\n\";\r\n        alert(str);\r\n        form.JUMINNUM_2.focus();\r\n    }\r\n    else if(form.ADDR.value.length\t< 1)\r\n    {\r\n        str\t+= \"주소를 입력하세요\\n\";\r\n        alert(str);\r\n        form.ADDR.focus();\r\n    }\r\n    else if(form.TEL.value.length\t< 1)\r\n    {\r\n        str\t+= \"연락처를 입력하세요\\n\";\r\n        alert(str);\r\n        form.TEL.focus();\r\n    }\r\n    else if(form.ETC.value.length\t< 1)\r\n    {\r\n        str\t+= \"비고를 입력하세요\\n\";\r\n        alert(str);\r\n        form.ETC.focus();\r\n    }\r\n\t\r\n    if(str\t== \"\")\r\n    {\r\n        return\ttrue;\r\n    }\r\n\r\n    return\tfalse;\r\n}\r\n\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\topener.location = \"/rams/suit/suit_view.do?AFFAIRNUM=\"+form.AFFAIRNUM.value+\"&PNU=\"+form.PNU.value;\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\n</script>\r\n</head>\r\n<body onload=\"init();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"AFFAIRNUM\" name=\"AFFAIRNUM\" value=\"";
  private final static String _jspx_template8 = "\"></input>\r\n<input type=\"hidden\" id=\"PNU\" name=\"PNU\" value=\"";
  private final static String _jspx_template9 = "\"></input>\r\n<input type=\"hidden\" id=\"ISFIXED\" name=\"ISFIXED\" value=\"";
  private final static String _jspx_template10 = "\"></input>\r\n<div id=\"cont02\">\r\n\t  <h3><img src=\"/rams/images/suit/st_see.gif\" alt=\"원고 관리\"/></h3>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"80\" scope=\"col\">소유자명</th>\r\n\t\t\t\t<th width=\"130\" scope=\"col\">주민번호 /<br/>법인번호</th>\r\n\t\t\t\t<th width=\"150\" scope=\"col\">주소</th>\r\n\t\t\t\t<th width=\"100\" scope=\"col\">연락처</th>\r\n\t\t\t\t<th scope=\"col\">비고</th>\r\n\t\t\t\t<th width=\"70\" scope=\"col\">추가/삭제</th>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  ";
  private final static String _jspx_template11 = "\r\n\t\t\t  <tr>\r\n\t\t\t\t<td>";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template16 = "</td>\r\n\t\t\t\t<td><img src=\"/rams/images/common/btn_del3.gif\" alt=\"삭제\" width=\"62\" height=\"19\" onclick=\"goDelete('";
  private final static String _jspx_template17 = "');\" style=\"cursor:pointer;\" /></td>\r\n\t\t\t  </tr>\r\n\t   \t\t  ";
  private final static String _jspx_template18 = "\r\n\t   \t\t  \t<tr>\r\n\t   \t\t  \t\t<td><input type=\"text\" id=\"NAME\" name=\"NAME\" class=\"formBox7\" maxlength=\"25\" /></td>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<input id=\"JUMINNUM_1\" name=\"JUMINNUM_1\" type=\"text\" class=\"formBox9\"  onKeyDown=\"onlyNumberInput();\" maxlength=\"6\" />\r\n\t\t\t\t\t\t&nbsp;-&nbsp;\r\n\t\t\t\t\t\t<input id=\"JUMINNUM_2\" name=\"JUMINNUM_2\" type=\"text\" class=\"formBox9\"  onKeyDown=\"onlyNumberInput();\" maxlength=\"7\" />\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td><input type=\"text\" id=\"ADDR\" name=\"ADDR\" class=\"formBox1\" maxlength=\"50\" /></td>\r\n\t\t\t\t\t<td><input id=\"TEL\" name=\"TEL\" type=\"text\" class=\"formBox2\" onKeyDown=\"onlyNumberInput();\" maxlength=\"20\" /></td>\r\n\t\t\t\t\t<td><input type=\"text\" id=\"ETC\" name=\"ETC\" class=\"formBox3\" maxlength=\"100\" /></td>\r\n\t\t\t\t\t<td><img src=\"/rams/images/common/btn_save.gif\" alt=\"저장\" width=\"62\" height=\"19\" border=\"0\" style=\"cursor:pointer;\" onclick=\"goSave();\"/></td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td height=\"30\" align=\"right\"><a href=\"#\" onclick=\"window.close();\"><img src=\"/rams/images/common/btn_close3.gif\" alt=\"닫기\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
