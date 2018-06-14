package jeus_jspwork._jsp._admin._user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_rams_5fnotice_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(27,26);to=(27,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ramsNotice.REGISTNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(31,26);to=(31,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ramsNotice.TITLE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(35,26);to=(35,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ramsNotice.REGISTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(39,26);to=(39,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ramsNotice.VIEWCNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(45,9);to=(45,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ramsNotice.CONTENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<link rel=\"stylesheet\" href=\"/rams/css/xq_contents.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\t\r\n</head>\r\n\r\n<body>\r\n\t<div id=\"cont01\">\r\n\t  <!-- 검색 -->\r\n\t  <div>\r\n\t    <h2><img src=\"/rams/images/board/tt02.gif\" alt=\"공지사항_공지사항보기\"/></h2>\r\n\t\t<div>\r\n\t\t<div id=\"cont03\">\r\n\t\t\t<div class=\"list2\">\r\n\t\t\t  <table width=\"90%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"3\" colspan=\"2\" background=\"/rams/images/board/dot3.gif\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td class=\"cont3\">이 름</td>\r\n\t\t\t\t\t<td class=\"cont4\">";
  private final static String _jspx_template7 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td class=\"cont3\">제목</td>\r\n\t\t\t\t\t<td class=\"cont4\">";
  private final static String _jspx_template8 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td class=\"cont3\">작성일</td>\r\n\t\t\t\t\t<td class=\"cont4\">";
  private final static String _jspx_template9 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td class=\"cont3\">조회수</td>\r\n\t\t\t\t\t<td class=\"cont4\">";
  private final static String _jspx_template10 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"100%\" align=\"center\" bgcolor=\"f0f7fb\"><strong>내용</strong></td>\r\n\t\t\t\t\t<td class=\"cont5\">\r\n\t\t\t\t\t\t<div class=\"xed\">\r\n\t\t\t\t\t\t";
  private final static String _jspx_template11 = "\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"3\" colspan=\"2\" background=\"/rams/images/board/dot3.gif\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t  </table>\r\n\t\t  </div>\r\n\t\t</div>\r\n\t\t</div>\r\n\t\t</div>\r\n\t\t</div>\r\n</body>\r\n</html>\r\n";
}
