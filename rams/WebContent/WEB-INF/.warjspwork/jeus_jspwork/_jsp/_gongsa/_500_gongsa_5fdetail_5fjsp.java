package jeus_jspwork._jsp._gongsa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_gongsa_5fdetail_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(43,15);to=(43,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(61,86);to=(61,99)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.CONSTNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(62,82);to=(62,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.CONSTNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(73,56);to=(73,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.GOSIID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(75,43);to=(75,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.ANNPERMISSION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(79,23);to=(79,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.LINENAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(81,23);to=(81,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.CONSTCATEG_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template21);
      // jsp code [from=(97,56);to=(97,71)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.CONSTPLACE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(101,23);to=(101,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.STARTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(103,23);to=(103,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.ENDDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(107,56);to=(107,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(123,44);to=(123,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(125,44);to=(125,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.JUMINNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(129,23);to=(129,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(131,23);to=(131,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.POSTNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(135,35);to=(135,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(151,87);to=(151,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.PLAN_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(151,107);to=(151,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(151,118);to=(151,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.FILELOC}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(151,137);to=(151,151)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.PLAN_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(153,87);to=(153,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.NOTICE_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(153,109);to=(153,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(153,120);to=(153,132)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.FILELOC}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(153,139);to=(153,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.NOTICE_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(157,78);to=(157,93)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.PRINT_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(157,99);to=(157,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(157,110);to=(157,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.FILELOC}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(157,129);to=(157,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.PRINT_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(161,78);to=(161,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.ETC_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(161,97);to=(161,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

      // jsp code [from=(161,108);to=(161,120)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.FILELOC}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(161,127);to=(161,140)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.ETC_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);

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
          out.write(_jspx_template14);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template16);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template20);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.STARTSECTION == null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template15);

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
          out.write(_jspx_template17);
          // jsp code [from=(90,7);to=(90,25)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.STARTSECTION }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template18);
          // jsp code [from=(90,32);to=(90,48)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.ENDSECTION }",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template19);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\n\r\n\r\nfunction goModify(constNum){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/gongsa/gongsa_modify.do?CONSTNUM=\"+constNum;\r\n\tform.submit();\r\n\t\r\n}\r\n\r\nfunction goDelete(constNum){\r\n\t\r\n\tif(!confirm(\"정말 삭제하시겠습니까?\")){\r\n        return;\r\n    }\r\n\t\r\n\tvar form = parent.document.form;\r\n\tform.action = \"/rams/gongsa/gongsa_delete.do?CONSTNUM=\"+constNum;\r\n\tform.submit();\r\n\t\t\r\n}\r\n\r\nfunction goDown(filename,filepath){\r\n\tvar url = \"/rams/jsp/common/file_down.jsp?filename=\"+filename+\"&filepath=\"+filepath;\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = url;\r\n\tform.submit();\r\n}\r\n\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\n\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"init();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t<tr>\r\n      <td height=\"26\" align=\"right\" valign=\"bottom\"><a href=\"#\" onclick=\"goModify('";
  private final static String _jspx_template8 = "');\"><img src=\"/rams/images/common/btn_modify.gif\" alt=\"수정\" border=\"0\"/></a></td>\r\n\t  <td width=\"70\" align=\"right\" valign=\"bottom\"><a href=\"#\" onclick=\"goDelete('";
  private final static String _jspx_template9 = "');\"><img src=\"/rams/images/common/btn_del3.gif\" alt=\"삭제\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t</tr>\r\n  </table>  \r\n  <!-- 공사시행내역 상세 -->\r\n  <h4><img src=\"/rams/images/register/st_detailed.gif\" alt=\"공사시행내역 상세\" /></h4>\r\n  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t<tr>\r\n\t  <td>\r\n\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t  <tr>\r\n\t\t\t<th style=\"width:150px;\" scope=\"col\">실시계획인가고시</th>\r\n\t\t\t<td style=\"width:253px;\" width=\"203\" class=\"cont\">";
  private final static String _jspx_template10 = "</td>\r\n\t\t\t<th style=\"width:150px;\" width=\"150\" scope=\"col\">공사시행허가 내용공고 </th>\r\n\t\t\t<td style=\"width:260px;\" class=\"310\">";
  private final static String _jspx_template11 = "</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\">도로의 종류(노선명)</th>\r\n\t\t\t<td class=\"cont\">";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t<th scope=\"col\">공사의 종류</th>\r\n\t\t\t<td class=\"cont\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\">공사구간</th>\r\n\t\t\t<td style=\"width:663px;\" colspan=\"3\" class=\"cont\">\r\n\t\t\t\t";
  private final static String _jspx_template14 = "\r\n\t\t\t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t\t";
  private final static String _jspx_template16 = "\r\n\t\t\t\t";
  private final static String _jspx_template17 = "\r\n\t\t\t\t";
  private final static String _jspx_template18 = " 부터 ";
  private final static String _jspx_template19 = " 까지\r\n\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\">공사장소</th>\r\n\t\t\t<td style=\"width:663px;\" colspan=\"3\" class=\"cont\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\">착수일</th>\r\n\t\t\t<td class=\"cont\">";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t<th scope=\"col\">준공일</th>\r\n\t\t\t<td class=\"cont\">";
  private final static String _jspx_template24 = "</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\">공사사유</th>\r\n\t\t\t<td style=\"width:663px;\" colspan=\"3\" class=\"cont\">";
  private final static String _jspx_template25 = "</td>\r\n\t\t  </tr>\r\n\t\t</table>\r\n\t  </td>\r\n\t</tr>\r\n  </table>\r\n  \r\n  \r\n  <!-- 공사시행자(신청인) -->\r\n  <h4><img src=\"/rams/images/register/st_pp.gif\" alt=\"공사시행자(신청인)\" /></h4>\r\n  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t<tr>\r\n\t  <td>\r\n\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t  <tr>\r\n\t\t\t<th style=\"width:150px;\" scope=\"col\">성명(회사명)</th>\r\n\t\t\t<td style=\"width:253px;\" class=\"cont\">";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t<th style=\"width:150px;\" width=\"203\" scope=\"col\">주민등록번호<br/>(사업자등록번호)</th>\r\n\t\t\t<td style=\"width:260px;\" class=\"cont\">";
  private final static String _jspx_template27 = "</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\">연락처</th>\r\n\t\t\t<td class=\"cont\">";
  private final static String _jspx_template28 = "</td>\r\n\t\t\t<th scope=\"col\">우편번호</th>\r\n\t\t\t<td class=\"cont\">";
  private final static String _jspx_template29 = "</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\">주소</th>\r\n\t\t\t<td colspan=\"3\" class=\"cont\">";
  private final static String _jspx_template30 = "</td>\r\n\t\t  </tr>\r\n\t\t</table>\r\n\t  </td>\r\n\t</tr>\r\n  </table>\r\n  \r\n  \r\n  <!-- 첨부자료 -->\r\n  <h4><img src=\"/rams/images/register/st_data.gif\" alt=\"첨부자료\" /></h4>\r\n  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t<tr>\r\n\t  <td>\r\n\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t  <tr>\r\n\t\t\t<th style=\"width:150px;\" scope=\"col\">사업계획서</th>\r\n\t\t\t<td style=\"width:253px;\" class=\"cont\"><a href=\"#\" class=\"blue1\" onclick=\"goDown('";
  private final static String _jspx_template31 = "','";
  private final static String _jspx_template32 = "')\">";
  private final static String _jspx_template33 = "</a></td>\r\n\t\t\t<th style=\"width:150px;\" width=\"203\" scope=\"col\">도로공사시행허가 내용공고 </th>\r\n\t\t\t<td style=\"width:260px;\" class=\"cont\"><a href=\"#\" class=\"blue1\" onclick=\"goDown('";
  private final static String _jspx_template34 = "','";
  private final static String _jspx_template35 = "')\">";
  private final static String _jspx_template36 = "</a></td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\">도면자료</th>\r\n\t\t\t<td colspan=\"3\" class=\"cont\"><a href=\"#\" class=\"blue1\" onclick=\"goDown('";
  private final static String _jspx_template37 = "','";
  private final static String _jspx_template38 = "')\">";
  private final static String _jspx_template39 = "</a></td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\">기타자료</th>\r\n\t\t\t<td colspan=\"3\" class=\"cont\"><a href=\"#\" class=\"blue1\" onclick=\"goDown('";
  private final static String _jspx_template40 = "','";
  private final static String _jspx_template41 = "')\">";
  private final static String _jspx_template42 = "</a></td>\r\n\t\t  </tr>\r\n\t\t</table>\r\n\t  </td>\r\n\t</tr>\r\n  </table>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
