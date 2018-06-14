package jeus_jspwork._jsp._board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_notice_5flist_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(34,15);to=(34,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(90,70);to=(90,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_TERM1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(94,70);to=(94,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_TERM2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(98,70);to=(98,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_TERM3}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(101,87);to=(101,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCH_DATA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(125,79);to=(125,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(126,83);to=(126,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${currentPage}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(126,98);to=(126,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${totalPageNum}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template22);
      // jsp code [from=(150,8);to=(150,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${nlist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("notice");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template15);
            // jsp code [from=(138,115);to=(138,128)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.SEQNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(139,23);to=(139,36)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.SEQNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(140,23);to=(140,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.TITLE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(141,23);to=(141,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.REGISTNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(142,23);to=(142,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.REGISTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(143,23);to=(143,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.VIEWCNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction goSearch(){\r\n\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/board/notice_list.do\";\r\n\tform.submit();\r\n\t\r\n}\r\nfunction goWrite(){\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/board/notice_write.do\";\r\n\tform.submit();\r\n\t\r\n}\r\n\r\nfunction goView(seqnum){\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/board/notice_view.do?SEQNUM=\"+seqnum;\r\n\tform.submit();\r\n\t\r\n}\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\nfunction goList(){\r\n\tlocation.href = \"/rams/board/notice_list.do\";\r\n}\r\n\r\nfunction goBoard(){\r\n\tlocation.href = \"/rams/board/board_list.do\";\r\n}\r\n\r\n\r\n\r\n</script>\r\n</head>\r\n<body onload=\"init();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\">\r\n      \t<a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > \r\n      \t<a href=\"#\" class=\"blue1\" onclick=\"goList();\">공지사항 </a> > <strong>공지사항 조회 </strong>\r\n      </td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <!-- 검색 -->\r\n  <div>\r\n    <h2><img src=\"/rams/images/board/tt01.gif\" alt=\"공지사항_목록조회\"/></h2>\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n\t      <td width=\"91\" height=\"29\"><a href=\"#\" onclick=\"goBoard();\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image19','','/rams/images/board/tab02_on.gif',1)\"><img src=\"/rams/images/board/tab02_off.gif\" alt=\"권한관리\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image19\" /></a></td>\r\n          <td width=\"91\"><img src=\"/rams/images/board/tab01_on.gif\" alt=\"공지사항\" border=\"0\" /></td>\r\n          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t<div>\r\n\t\t<table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td width=\"5\" height=\"50\"><img src=\"/rams/images/\tsuit/srch_bg1.gif\" alt=\".\" /></td>\r\n\t\t  <td background=\"/rams/images/suit/srch_bg2.gif\" class=\"srch\" align=\"center\">\r\n\t\t\t  <table width=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td width=\"22\" height=\"20\" >\r\n\t\t\t\t  \t<input type=\"checkbox\" name=\"SEARCH_TERM1\" value=\"checkbox\" ";
  private final static String _jspx_template8 = "/>\r\n\t\t\t  \t  </td>\r\n\t\t\t\t  <td width=\"35\" align=\"left\">제목</td>\r\n\t\t\t\t  <td width=\"22\" height=\"20\" >\r\n\t\t\t\t  \t<input type=\"checkbox\" name=\"SEARCH_TERM2\" value=\"checkbox\" ";
  private final static String _jspx_template9 = "/>\r\n\t\t\t  \t  </td>\r\n\t\t\t\t  <td width=\"35\" align=\"left\">내용</td>\r\n\t\t\t\t  <td width=\"22\" height=\"20\" >\r\n\t\t\t\t  \t<input type=\"checkbox\" name=\"SEARCH_TERM3\" value=\"checkbox\" ";
  private final static String _jspx_template10 = "/>\r\n\t\t\t  \t  </td>\r\n\t\t\t\t  <td width=\"80\" align=\"left\">작성자</td>\r\n\t\t\t\t  <td width=\"320\"><input name=\"SEARCH_DATA\" type=\"text\" class=\"formBox8\" value=\"";
  private final static String _jspx_template11 = "\" /></td>\r\n\t\t\t\t  <td align=\"left\">\r\n\t\t\t\t  \t<a href=\"#\" onclick=\"goSearch();\">\r\n\t\t\t\t  \t\t<img src=\"/rams/images/common/btn_srch3.gif\" alt=\"검색\" border=\"0\" />\r\n\t\t\t\t  \t</a>\r\n\t\t\t  \t  </td>\r\n\t\t\t\t  <td align=\"right\">\r\n\t\t\t\t  \t<a href=\"#\" onclick=\"goWrite();\">\r\n\t\t\t\t  \t\t<img src=\"/rams/images/common/btn_write.gif\" alt=\"글쓰기\" border=\"0\" />\r\n\t\t\t  \t\t</a>\r\n\t\t\t\t  </td>\r\n\t\t\t\t</tr>\r\n\t\t\t  </table>\r\n\t\t  </td>\r\n\t\t  <td width=\"5\"><img src=\"/rams/images/suit/srch_bg3.gif\" alt=\".\"/></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</div>\r\n  </div>\r\n</div>\r\n<div id=\"cont03\">\r\n\t<div class=\"list2\">\r\n\t  <table width=\"810px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td align=\"right\" style=\"height:22px\">전체 게시물 수 : <strong class=\"style1\">";
  private final static String _jspx_template12 = "</strong></td>\r\n\t\t  <td align=\"right\" style=\"width:110px\">현재 페이지 : <span class=\"style1\"><strong>";
  private final static String _jspx_template13 = "/";
  private final static String _jspx_template14 = "</strong></span></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\" style=\"width:70px\">번호</th>\r\n\t\t\t<th scope=\"col\">제목</th>\r\n\t\t\t<th scope=\"col\" style=\"width:120px\">작성자</th>\r\n\t\t\t<th scope=\"col\" style=\"width:120px\">작성일</th>\r\n\t\t\t<th scope=\"col\" style=\"width:70px\">조회</th>\r\n\t\t  </tr>\r\n\t  ";
  private final static String _jspx_template15 = "\r\n\t\t  <tr onmouseover=\"trMoouseOver(this)\" onmouseout=\"trMoouseOut(this)\" style=\"cursor:pointer\" onclick=\"goView('";
  private final static String _jspx_template16 = "');\">\r\n\t\t\t<td class=\"cont\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t<td class=\"cont\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t<td class=\"cont\">";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t<td class=\"cont\">";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t<td class=\"cont\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t  </tr>\r\n\t  ";
  private final static String _jspx_template22 = "\r\n\t  \t  <tr style=\"height:50px\">\r\n\t  \t  <td align=\"center\" colspan=\"5\">\r\n\t  \t  \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template23 = "\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t  \t  </td>\r\n\t  \t  \r\n\t  \t  </tr>\r\n\t  </table>\r\n\t</div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
