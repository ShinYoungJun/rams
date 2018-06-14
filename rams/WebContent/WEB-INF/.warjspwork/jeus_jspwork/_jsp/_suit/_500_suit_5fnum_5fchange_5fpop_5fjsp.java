package jeus_jspwork._jsp._suit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_suit_5fnum_5fchange_5fpop_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(17,15);to=(17,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template12);
      // jsp code [from=(106,63);to=(106,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(107,51);to=(107,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(118,8);to=(118,17)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${affairNum2List}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("affairNum2List");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template8);
            // jsp code [from=(36,9);to=(36,33)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${affairNum2List.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(37,31);to=(37,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${affairNum2List.CODEDESC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(37,60);to=(37,84)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${affairNum2List.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\n\r\nfunction init(){\r\n\tvar form = document.form;\r\n\t\r\n\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\topener.location = \"/rams/suit/suit_view.do?AFFAIRNUM=\"+form.AFFAIRNUM.value+\"&PNU=\"+form.PNU.value;\r\n\t\twindow.close();\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\nfunction initForm(){\r\nvar form = document.form;\r\n\t\r\n\tvar new_option;\r\n\t\r\n\tvar affairnum2 = document.getElementById(\"AFFAIRNUM_2\");\r\n\t\r\n\t";
  private final static String _jspx_template8 = "\r\n\t\tif('";
  private final static String _jspx_template9 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template10 = "','";
  private final static String _jspx_template11 = "');\r\n\t\t\taffairnum2.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template12 = "\r\n\t\r\n\tvar affairnum1 = document.getElementById(\"AFFAIRNUM_1\");\r\n\tvar year = new Date().getYear();\r\n    for(var i=year-20;i<=year;i++){\r\n\t\tnew_option = new Option(i+'년',i);\r\n\t\tif(new_option.value == year){\r\n\t\t\tnew_option.selected = true;\r\n\t\t}\r\n\t\taffairnum1.options.add(new_option);\r\n\t}\r\n}\r\n\r\nfunction goSave(){\r\n\t\r\n\tif(!confirm(\"모든 관련정보에 사건번호가 변경됩니다. 변경하시겠습니까?\")){\r\n        return;\r\n    }\r\n\t\r\n\tvar\tresult\t= DataCheck();\r\n\tif(result\t==\tfalse)\r\n\t\treturn;\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_num_change_prc.do\";\r\n\tform.submit();\r\n}\r\n\r\n\r\nfunction\tDataCheck()\r\n{\r\n    var form \t= document.form;\r\n    var\tstr\t\t= \"\";\r\n\t// 기본사항\r\n\tif(getValueSelectTag(\"AFFAIRNUM_1\").length\t< 1)    \r\n    {\r\n        str\t+= \"소송년도를 선택하세요\\n\";\r\n        alert(str);\r\n        form.AFFAIRNUM_1.focus();\r\n    }\r\n    else if(getValueSelectTag(\"AFFAIRNUM_2\").length\t< 1)    \r\n    {\r\n        str\t+= \"소송구분을 선택하세요\\n\";\r\n        alert(str);\r\n        form.AFFAIRNUM_2.focus();\r\n    }\r\n    else if(form.AFFAIRNUM_3.value.length\t< 1)\r\n    {\r\n        str\t+= \"사건번호를 입력하세요\\n\";\r\n        alert(str);\r\n        form.AFFAIRNUM_3.focus();\r\n    }\r\n\r\n    if(str\t== \"\")\r\n    {\r\n        return\ttrue;\r\n    }\r\n\r\n    return\tfalse;\r\n}\r\n\r\n\r\n</script>\r\n</head>\r\n<body onload=\"init();initForm();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"AFFAIRNUM\" name=\"AFFAIRNUM\" value=\"";
  private final static String _jspx_template13 = "\"></input>\r\n<input type=\"hidden\" id=\"PNU\" name=\"PNU\" value=\"";
  private final static String _jspx_template14 = "\"></input>\r\n<div id=\"cont02\">\r\n\t  <h3><img src=\"/rams/images/suit/st_plaintiff6.gif\" alt=\"대상 토지 목록 조회\"/></h3>\r\n\t  <!-- 기본사항 -->\r\n\t  <table width=\"425\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"420\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">원 사건번호</th>\r\n\t\t\t\t<td width=\"300\" class=\"cont\">\r\n\t\t\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">변경 사건번호</th>\r\n\t\t\t\t<td width=\"300\" class=\"cont\">\r\n\t\t\t\t\t<select id=\"AFFAIRNUM_1\" name=\"AFFAIRNUM_1\" class=\"formBox2\">\r\n\t\t\t\t\t</select>&nbsp;\r\n\t\t\t\t\t<select id=\"AFFAIRNUM_2\" name=\"AFFAIRNUM_2\" class=\"formBox2\">\r\n\t\t\t\t\t\t<option value=\"\">::선택::</option>\r\n\t\t\t\t\t</select>&nbsp;\r\n\t\t\t\t\t<input id=\"AFFAIRNUM_3\" name=\"AFFAIRNUM_3\" type=\"text\" class=\"formBox2\" onKeyDown=\"onlyNumberInput();\" maxlength=\"12\" />\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"425\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td height=\"30\" align=\"right\">\r\n\t\t  <a href=\"#\" onclick=\"goSave();\" ><img src=\"/rams/images/common/btn_chg.gif\" alt=\"변경\" width=\"62\" height=\"19\" border=\"0\" /></a>\r\n\t\t  &nbsp;\r\n\t\t  <a href=\"#\" onclick=\"window.close();\"><img src=\"/rams/images/common/btn_cancel.gif\" alt=\"취소\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
