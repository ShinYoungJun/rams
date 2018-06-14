package jeus_jspwork._jsp._board;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_notice_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(39,16);to=(39,19)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(88,26);to=(88,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.REGISTNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(92,26);to=(92,38)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.TITLE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(96,26);to=(96,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.REGISTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(100,26);to=(100,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.VIEWCNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(106,9);to=(106,23)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.CONTENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(122,42);to=(122,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.SEQNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(125,42);to=(125,55)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${notice.SEQNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<link rel=\"stylesheet\" href=\"/rams/css/xq_contents.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script type=\"text/javascript\">\r\n\tfunction goModify(obj){\r\n\t\tvar form = document.form;\r\n\t\tform.action = \"/rams/board/notice_write.do?SEQNUM=\"+obj+\"&MODE=modify\";\r\n\t\tform.submit();\r\n\t\t\r\n\t}\r\n\tfunction goDelete(obj){\r\n\t\t\r\n\t\tif(!confirm(\"삭제하시겠습니까?\")){\r\n            return;\r\n        }\r\n\t\t\r\n\t\t\r\n\t\tvar form = document.form;\r\n\t\tform.action = \"/rams/board/notice_delete.do?SEQNUM=\"+obj;\r\n\t\tform.submit();\r\n\t\t\t\r\n\t}\r\n\tfunction goList(){\r\n\t\tlocation.href = \"/rams/board/notice_list.do\";\r\n\t}\r\n\r\n\tfunction goBoard(){\r\n\t\tlocation.href = \"/rams/board/board_list.do\";\r\n\t}\r\n\t\r\n\tfunction init(){\r\n\t\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\t\tif(msg != ''){\r\n\t\t\talert(msg);\r\n\t\t\treturn;\r\n\t\t}else{\r\n\t\t\treturn;\r\n\t\t}\r\n\t}\r\n</script>\r\n\t\r\n\t\r\n</head>\r\n\r\n<body onload=\"init();\">\r\n\t<form name=\"form\" id=\"form\" method=\"post\">\r\n\t<div id=\"cont01\">\r\n\t  <!-- 히스토리 -->\r\n\t  <div>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t      <td align=\"right\">\r\n\t      \t<a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > \r\n\t      \t<a href=\"#\" class=\"blue1\" onclick=\"goList();\">공지사항 </a> > <strong>공지사항 보기</strong>\r\n\t      </td>\r\n\t    </tr>\r\n\t  </table>\r\n\t  </div>\r\n\t  \r\n\t  <!-- 검색 -->\r\n\t  <div>\r\n\t    <h2><img src=\"/rams/images/board/tt02.gif\" alt=\"공지사항_공지사항보기\"/></h2>\r\n\t\t<div class=\"tab\">\r\n\t\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t        <tr>\r\n\t\t      <td width=\"91\" height=\"29\"><a href=\"#\" onclick=\"goBoard();\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image19','','/rams/images/board/tab02_on.gif',1)\"><img src=\"/rams/images/board/tab02_off.gif\" alt=\"권한관리\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image19\" /></a></td>\r\n\t          <td width=\"91\"><img src=\"/rams/images/board/tab01_on.gif\" alt=\"공지사항\" border=\"0\" /></td>\r\n\t          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n\t        </tr>\r\n\t      </table>\r\n\t\t</div>\r\n\t\t<div>\r\n\t\t<div id=\"cont03\">\r\n\t\t\t<div class=\"list2\">\r\n\t\t\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"3\" colspan=\"2\" background=\"/rams/images/board/dot3.gif\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td class=\"cont3\">이 름</td>\r\n\t\t\t\t\t<td class=\"cont4\">";
  private final static String _jspx_template8 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td class=\"cont3\">제목</td>\r\n\t\t\t\t\t<td class=\"cont4\">";
  private final static String _jspx_template9 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td class=\"cont3\">작성일</td>\r\n\t\t\t\t\t<td class=\"cont4\">";
  private final static String _jspx_template10 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td class=\"cont3\">조회수</td>\r\n\t\t\t\t\t<td class=\"cont4\">";
  private final static String _jspx_template11 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"100%\" align=\"center\" bgcolor=\"f0f7fb\"><strong>내용</strong></td>\r\n\t\t\t\t\t<td class=\"cont5\">\r\n\t\t\t\t\t\t<div class=\"xed\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template12 = "\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"3\" colspan=\"2\" background=\"/rams/images/board/dot3.gif\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t  </table>\r\n\t\t\r\n\t\t\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"30\" align=\"center\" valign=\"bottom\">\r\n\t\t\t\t\t\t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"goModify('";
  private final static String _jspx_template13 = "');\"><img src=\"/rams/images/common/btn_modify.gif\" alt=\"수정\" border=\"0\" /></a>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"goDelete('";
  private final static String _jspx_template14 = "');\"><img src=\"/rams/images/common/btn_del3.gif\" alt=\"삭제\" width=\"62\" height=\"19\" border=\"0\" /></a>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t\t<td align=\"center\">\r\n\t\t\t\t\t\t\t\t<a href=\"#\" onclick=\"goList();\"><img src=\"/rams/images/common/btn_list2.gif\" alt=\"목록\" width=\"62\" height=\"19\" border=\"0\" /></a>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t  </table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t  </table>\r\n\t\t  </div>\r\n\t\t</div>\r\n\t\t</div>\r\n\t\t</div>\r\n\t\t</div>\r\n\t\t</form>\r\n</body>\r\n</html>\r\n";
}
