package jeus_jspwork._jsp._suit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_suit_5fanal_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(60,74);to=(60,76)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(62,76);to=(62,80)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LINE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(67,96);to=(67,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FROMDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(72,92);to=(72,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TODATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(96,47);to=(96,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_TYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template29);

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
  private boolean _jspx_th_c_choose_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_0.setPageContext(pageContext);
    try {
      int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
      if (_jspx_eval_c_choose_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template12);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template26);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template28);

        } while (_jspx_th_c_choose_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_0.setPageContext(pageContext);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist!= null && !empty blist}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template13);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_0_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template25);

        } while (_jspx_th_c_when_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_0.setPageContext(pageContext);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
      if (_jspx_eval_c_otherwise_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template27);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("blist");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template14);
            // jsp code [from=(114,15);to=(114,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.TYPE_DATA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(115,15);to=(115,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.TOTAL_COUNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(116,15);to=(116,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.CLOSE_COUNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(117,15);to=(117,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.CONTINUE_COUNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(118,15);to=(118,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.COUNT_R1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(119,15);to=(119,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.COUNT_R2}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(120,15);to=(120,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.COUNT_R3}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(121,15);to=(121,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.COUNT_R4}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(122,15);to=(122,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.COUNT_R5}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(123,15);to=(123,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.COUNT_R6}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction goSearch(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_anal_list.do\";\r\n\tform.submit();\r\n}\r\n\r\nfunction goExcel(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_anal_list_excel.do\";\r\n\tform.submit();\r\n}\r\n\r\n</script>\r\n</head>\r\n<body>\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > <a href=\"#\" class=\"blue1\">소송정보관리</a> > <strong>통계</strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <!-- 검색 -->\r\n  <div>\r\n    <h2><img src=\"/rams/images/suit/tt03.gif\" alt=\"소송정보관리_통계\"/></h2>\t\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><a href=\"/rams/suit/suit_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image22','','/rams/images/suit/02tab01_on.gif',1)\"><img src=\"/rams/images/suit/02tab01_off.gif\" alt=\"소송정보\" name=\"Image22\" width=\"91\" height=\"29\" border=\"0\" id=\"Image22\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/suit/suit_price_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image13','','/rams/images/suit/02tab02_on.gif',1)\"><img src=\"/rams/images/suit/02tab02_off.gif\" alt=\"소가관리\" name=\"Image13\" border=\"0\" id=\"Image13\" /></a></td>\r\n          <td width=\"91\"><img src=\"/rams/images/suit/02tab03_on.gif\" alt=\"통계\" /></td>\r\n          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t<div>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td width=\"5\" height=\"50\"><img src=\"/rams/images/suit/srch_bg1.gif\" alt=\".\" /></td>\r\n\t\t  <td background=\"/rams/images/suit/srch_bg2.gif\" class=\"srch\">\r\n\t\t\t  <table width=\"787\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td width=\"60\" height=\"14\" ><img src=\"/rams/images/suit/srch.gif\" alt=\"검색\"/></td>\r\n\t\t\t\t  <td width=\"20\"><input type=\"radio\" name=\"SEARCH_TYPE\" value=\"GU\" ";
  private final static String _jspx_template7 = "/></td>\r\n\t\t\t\t  <td width=\"60\">자치구별</td>\r\n\t\t\t\t  <td width=\"20\"><input type=\"radio\" name=\"SEARCH_TYPE\" value=\"LINE\" ";
  private final static String _jspx_template8 = "/></td>\r\n\t\t\t\t  <td width=\"70\">노선별</td>\r\n\t\t\t\t  <td width=\"90\">\r\n\t\t\t\t  </td>\r\n\t\t\t\t  <td width=\"125\" align=\"right\">\r\n\t\t\t\t\t<table><tr><td><input id=\"FROMDATE\" name=\"FROMDATE\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template9 = "\"/></td>\r\n\t\t\t\t\t<td><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" onclick=\"popUpCalendar(this,FROMDATE,'yyyymmdd')\" style=\"cursor:pointer;\"/></td></tr></table>\r\n\t\t\t  \t  </td>\r\n\t\t\t\t  <td width=\"20\" align=\"center\"> ~ </td>\r\n\t\t\t\t  <td width=\"125\">\r\n\t\t\t\t\t<table><tr><td><input id=\"TODATE\" name=\"TODATE\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template10 = "\"/></td>\r\n\t\t\t\t\t<td><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" onclick=\"popUpCalendar(this,TODATE,'yyyymmdd')\" style=\"cursor:pointer;\"/></td></tr></table>\r\n\t\t\t  \t  </td>\r\n\t\t\t\t  <td><a href=\"#\" onclick=\"goSearch();\"><img src=\"/rams/images/common/btn_srch3.gif\" alt=\"검색\" border=\"0\" /></a></td>\r\n\t\t\t\t</tr>\r\n\t\t\t  </table>\r\n\t\t  </td>\r\n\t\t  <td width=\"5\"><img src=\"/rams/images/suit/srch_bg3.gif\" alt=\".\"/></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</div>\r\n    <div class=\"list\">\r\n\t  <h3><img src=\"/rams/images/suit/st_present.gif\" alt=\"소송 현황\" /></h3>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td height=\"30\" class=\"t_org\"></td>\r\n\t      <td align=\"right\"><a href=\"#\" onclick=\"goExcel();\"><img src=\"/rams/images/common/btn_print3.gif\" alt=\"대장출력\" border=\"0\"/></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"138\" rowspan=\"2\" scope=\"col\">";
  private final static String _jspx_template11 = "</th>\r\n\t\t\t\t<th width=\"75\" rowspan=\"2\" scope=\"col\">총건수</th>\r\n\t\t\t\t<th width=\"75\" rowspan=\"2\" scope=\"col\">완료건수</th>\r\n\t\t\t\t<th width=\"75\" rowspan=\"2\" scope=\"col\">진행건수</th>\r\n\t\t\t\t<th width=\"450\" colspan=\"6\" scope=\"col\">판&nbsp;&nbsp;결&nbsp;&nbsp;결&nbsp;&nbsp;과</th>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n                <th width=\"75\" scope=\"col\">승소</th>\r\n                <th width=\"75\" scope=\"col\">패소</th>\r\n                <th width=\"75\" scope=\"col\">화해경고</th>\r\n                <th width=\"75\" scope=\"col\">강제조정</th>\r\n                <th width=\"75\" scope=\"col\">소취하</th>\r\n                <th width=\"75\" scope=\"col\">기타</th>\r\n\t\t\t  </tr>\r\n\t   \t\t\t";
  private final static String _jspx_template12 = "\r\n\t   \t\t\t";
  private final static String _jspx_template13 = "\r\n\t   \t\t\t";
  private final static String _jspx_template14 = "\r\n\t   \t\t\t<tr>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template15 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template16 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template17 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template18 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template19 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template20 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template21 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template22 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template23 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template24 = "</td>\r\n\t   \t\t\t</tr>\r\n\t   \t\t\t";
  private final static String _jspx_template25 = "\r\n\t   \t\t\t";
  private final static String _jspx_template26 = "\r\n\t   \t\t\t";
  private final static String _jspx_template27 = "\r\n\t   \t\t\t\t<tr>\r\n\t   \t\t\t\t<td colspan=\"10\" scope=\"col\">\r\n\t   \t\t\t\t\t검색결과가 없습니다.\r\n\t   \t\t\t\t</td>\r\n\t   \t\t\t\t</tr>\r\n\t   \t\t\t";
  private final static String _jspx_template28 = "\r\n\t   \t\t\t";
  private final static String _jspx_template29 = "\r\n\t\t\t  \r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n    </div>\r\n  </div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
