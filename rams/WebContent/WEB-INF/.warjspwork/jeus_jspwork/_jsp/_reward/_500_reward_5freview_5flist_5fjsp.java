package jeus_jspwork._jsp._reward;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_reward_5freview_5flist_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(26,67);to=(26,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(64,89);to=(64,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_VALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template23);
      // jsp code [from=(122,9);to=(122,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("reviewList");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template9);
            // jsp code [from=(101,116);to=(101,130)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(101,136);to=(101,155)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.INVESTID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);
            // jsp code [from=(101,161);to=(101,179)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.COMPEID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);
            // jsp code [from=(102,11);to=(102,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(103,11);to=(103,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(104,11);to=(104,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(104,34);to=(104,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(105,11);to=(105,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.INVESTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(106,11);to=(106,33)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.INVESTPLACE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(107,11);to=(107,34)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.ISCOMPENSATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(108,11);to=(108,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(109,11);to=(109,25)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.ETC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(110,11);to=(110,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewList.REGISTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction goSearch(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/reward/reward_review_list.do\";\r\n\tform.submit();\r\n}\r\n\r\nfunction goView(pnu,investid,compeid){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/reward/reward_review_write.do?PNU=\"+pnu+\"&INVESTID=\"+investid+\"&COMPEID=\"+compeid;\r\n\tform.submit();\t\t\r\n}\r\n</script>\r\n</head>\r\n<body>\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<input id=\"currentPage\" name=\"currentPage\" type=\"hidden\" value=\"";
  private final static String _jspx_template7 = "\"></input>\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"../images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > 보상용지 관리 <a href=\"#\" class=\"blue1\"></a> > <strong>보상 심의/사실조사 </strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <div>\r\n    <h2><img src=\"../images/reward/tt02.gif\" alt=\"보상용지관리_미불보상용지\"/></h2>\r\n   \r\n   \r\n    <!-- 탭 메뉴 -->\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><a href=\"/rams/reward/reward_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image22','','../images/reward/tab01_on.gif',1)\"><img src=\"../images/reward/tab01_off.gif\" alt=\"미불보상용지\" name=\"Image22\" width=\"91\" height=\"29\" border=\"0\" id=\"Image22\" /></a></td>\r\n          <td width=\"91\"><img src=\"../images/reward/tab02_on.gif\" alt=\"보상 심의/사실조사\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_status_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image19','','../images/reward/tab03_on.gif',1)\"><img src=\"../images/reward/tab03_off.gif\" alt=\"현황관리\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image19\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_anal_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','../images/reward/tab04_on.gif',1)\"><img src=\"../images/reward/tab04_off.gif\" alt=\"통계\" name=\"Image20\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_own_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','/rams/images/reward/tab05_on.gif',1)\"><img src=\"/rams/images/reward/tab05_off.gif\" alt=\"토지소유현황\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td background=\"../images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t\r\n\t<!-- 검색 박스 -->\r\n\t<div>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td width=\"5\" height=\"50\"><img src=\"../images/suit/srch_bg1.gif\" alt=\".\" /></td>\r\n\t\t  <td background=\"../images/suit/srch_bg2.gif\" class=\"srch\">\r\n\t\t\t  <table width=\"787\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td width=\"43\" height=\"14\" ><img src=\"../images/suit/srch.gif\" alt=\"검색\"/></td>\r\n\t\t\t\t  <td width=\"635\"><input name=\"SEARCH_VALUE\" type=\"text\" class=\"formBox5\"  value=\"";
  private final static String _jspx_template8 = "\"/></td>\r\n\t\t\t\t  <td><a href=\"#\" onclick=\"goSearch()\"><img src=\"../images/common/btn_srch3.gif\" alt=\"검색\" border=\"0\" /></a></td>\r\n\t\t\t\t</tr>\r\n\t\t\t  </table>\r\n\t\t  </td>\r\n\t\t  <td width=\"5\"><img src=\"../images/suit/srch_bg3.gif\" alt=\".\"/></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</div>\r\n\t\r\n\t\r\n\t<div class=\"list\">\r\n\t\r\n\t\r\n\t  <!-- 검색결과 -->\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t      <td height=\"16\" valign=\"top\" class=\"t_org\">※ 보상 심의 및 사실조사 관련 이익을 관리하는 화면입니다. </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"60\" scope=\"col\">자치구</th>\r\n\t\t\t\t<th width=\"60\" scope=\"col\">통명</th>\r\n\t\t\t\t<th scope=\"col\">지번</th>\t\t\t\t\r\n\t\t\t\t<th width=\"100\" scope=\"col\">심의일자</th>\r\n\t\t\t\t<th width=\"60\" scope=\"col\">심의장소</th>\r\n\t\t\t\t<th width=\"80\" scope=\"col\">보상여부</th>\r\n\t\t\t\t<th width=\"80\" scope=\"col\">보상부결사유</th>\r\n\t\t\t\t<th width=\"80\" scope=\"col\">비고</th>\r\n\t\t\t\t<th width=\"80\" scope=\"col\">등록일자</th>\r\n\t\t\t  </tr>\r\n\t\t\t  ";
  private final static String _jspx_template9 = "\r\n\t\t\t  <tr onmouseover=\"trMoouseOver(this)\" onmouseout=\"trMoouseOut(this)\" style=\"cursor:pointer\" onclick=\"goView('";
  private final static String _jspx_template10 = "','";
  private final static String _jspx_template11 = "','";
  private final static String _jspx_template12 = "');\">\r\n\t\t\t\t<td>";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template15 = " - ";
  private final static String _jspx_template16 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t  </tr>\t\t\t  \r\n\t\t\t  ";
  private final static String _jspx_template23 = "\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t  <tr>\r\n\t\t\t<td height=\"30\" align=\"center\">\r\n\t\t\t\t<table width=\"139\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template24 = "\t\t\t\t  \r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t  </table>\r\n    </div>\r\n  </div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
