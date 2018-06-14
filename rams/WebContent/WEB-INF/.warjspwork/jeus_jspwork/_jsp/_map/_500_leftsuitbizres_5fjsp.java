package jeus_jspwork._jsp._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_leftsuitbizres_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return null;
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
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template9);
      // jsp code [from=(79,8);to=(79,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SearchList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template2);
            // jsp code [from=(56,52);to=(56,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.XID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template3);
            // jsp code [from=(56,93);to=(56,101)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template4);
            // jsp code [from=(57,47);to=(57,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SGGCODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template5);
            // jsp code [from=(58,36);to=(58,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.DONGCODE }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template6);
            // jsp code [from=(59,36);to=(59,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.JIBUN }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template7);
            // jsp code [from=(60,36);to=(60,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODEDESC }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);

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
  private final static String _jspx_template1 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>무제 문서</title>\r\n<link href=\"../css/doro.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<style type=\"text/css\">\r\n.box777 {\r\n\tbackground-color:#ffffff;\r\n\tborder: 1px #d3e2ea solid;\r\n\tcolor: #9a9a9a;\r\n\t}\r\n\r\n</style>\r\n\r\n<script language=\"javascript\">\r\n\r\n\r\nfunction goDetail(pnu){\r\n\r\n\tlocation.href='/rams/map/suitbizdetail.do?PNU='+pnu;\r\n\t\r\n}\r\n\r\nfunction goLocation(xid,layer){\r\n\r\n\tparent.fnGetCentroid(xid,layer);\r\n}\r\n</script>\r\n\r\n</head>\r\n\r\n<body>\r\n<div id=\"left\" align=\"center\" >\r\n  <table width=\"260\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n\t\t\t<td>\r\n\t\t\t\t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th height=\"35\" valign=\"bottom\" scope=\"row\"><img src=\"../images/map/l_st_rst.gif\" alt=\"검색결과\"/></th>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th scope=\"row\" class=\"cont3\">\r\n\t\t\t\t\t\t\t<table width=\"250\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#bed6e1\">\r\n\t\t\t\t\t\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th height=\"25\" scope=\"col\" class=\"title\">구명</th>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"title\" scope=\"col\">동명</th>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"title\" scope=\"col\">지번</th>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"title\" scope=\"col\">지목</th>\r\n\t\t\t\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t  ";
  private final static String _jspx_template2 = "\r\n\t\t\t\t\t\t\t\t\t\t\t  <tr onClick=\"javascript:goLocation('";
  private final static String _jspx_template3 = "','LP_PA_CBND_ALL');goDetail('";
  private final static String _jspx_template4 = "');\" style='cursor:hand;'>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"25\" class=\"title\">";
  private final static String _jspx_template5 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"title\" >";
  private final static String _jspx_template6 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"title\" >";
  private final static String _jspx_template7 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"title\" >";
  private final static String _jspx_template8 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t  ";
  private final static String _jspx_template9 = "\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t </table>\r\n\t\t\t\t\t\r\n\t\t\t\t\t</th>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t  <td height='10'></td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<td height=\"30\" align=\"center\">\r\n\t\t\r\n\t\t\t\r\n\t\t\t<table width=\"139\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template10 = "\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n    </table>\r\n</div>\r\n</body>\r\n</html>\r\n";
}
