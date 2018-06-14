package jeus_jspwork._jsp._gongsa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_gongsa_5flist_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(36,15);to=(36,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template13);
      // jsp code [from=(97,98);to=(97,106)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LINENAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(102,121);to=(102,135)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FROM_STARTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(105,118);to=(105,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TO_STARTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(108,118);to=(108,130)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${FROM_ENDDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(111,113);to=(111,123)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${TO_ENDDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template42);
      // jsp code [from=(180,9);to=(180,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${constCategList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("constCategList");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template8);
            // jsp code [from=(51,9);to=(51,33)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${constCategList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(52,34);to=(52,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${constCategList.CODEDESC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(52,63);to=(52,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${constCategList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);
            // jsp code [from=(53,33);to=(53,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CONSTCATEG}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);

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
          out.write(_jspx_template19);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template39);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_1_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template41);

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
    _jspx_th_c_when_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${glist!= null && !empty glist}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
      if (_jspx_eval_c_when_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template20);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_1_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template38);

        } while (_jspx_th_c_when_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_otherwise_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:otherwise ---- //
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_1 = new org.apache.taglibs.standard.tag.common.core.OtherwiseTag();
    _jspx_th_c_otherwise_1.setPageContext(pageContext);
    _jspx_th_c_otherwise_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_otherwise_1 = _jspx_th_c_otherwise_1.doStartTag();
      if (_jspx_eval_c_otherwise_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template40);

        } while (_jspx_th_c_otherwise_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_1.setPageContext(pageContext);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${glist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("gongsa");
    _jspx_th_c_forEach_1.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template21);
            // jsp code [from=(143,94);to=(143,109)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongsa.CONSTNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(144,12);to=(144,23)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongsa.RNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(145,12);to=(145,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongsa.LINENAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(146,12);to=(146,31)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongsa.ANNOUNCEDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(147,12);to=(147,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongsa.CONSTCATEG}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // ----  c:choose ---- invoke //
            if (_jspx_th_c_choose_1_fn(pageContext, _jspx_th_c_forEach_1)) return true;


            out.write(_jspx_template34);
            // jsp code [from=(157,12);to=(157,25)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongsa.LENGTH}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(158,12);to=(158,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongsa.STARTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(159,12);to=(159,26)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongsa.ENDDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);

          } while (_jspx_th_c_forEach_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_1.doCatch(t);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_choose_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:choose ---- //
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_1 = new org.apache.taglibs.standard.tag.common.core.ChooseTag();
    _jspx_th_c_choose_1.setPageContext(pageContext);
    _jspx_th_c_choose_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    try {
      int _jspx_eval_c_choose_1 = _jspx_th_c_choose_1.doStartTag();
      if (_jspx_eval_c_choose_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template27);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_1_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template29);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_1)) return true;


          out.write(_jspx_template33);

        } while (_jspx_th_c_choose_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_choose_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_choose_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_when_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:when ---- //
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = new org.apache.taglibs.standard.tag.rt.core.WhenTag();
    _jspx_th_c_when_1.setPageContext(pageContext);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongsa.STARTSECTION == null}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
      if (_jspx_eval_c_when_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template28);

        } while (_jspx_th_c_when_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_when_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_when_1.release();
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
          out.write(_jspx_template30);
          // jsp code [from=(153,8);to=(153,27)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongsa.STARTSECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template31);
          // jsp code [from=(153,38);to=(153,55)]
          out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gongsa.ENDSECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

          out.write(_jspx_template32);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\n\r\n//검색 밑에 나오게\r\nfunction goSearch(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/gongsa/gongsa_list.do\";\r\n\tform.submit();\r\n}\r\n\r\n//아이프레임 사이즈\r\nfunction iFrameResize(obj)\r\n{\r\n\tvar iFrm = obj;\r\n\tvar the_height = iFrm.contentWindow.document.body.scrollHeight+30;\r\n\tiFrm.style.height = the_height;\r\n\tparent.iFrameResize(parent.document.getElementById(\"main\"));\r\n}\r\n\r\n//상세보기로 이동\r\nfunction goView(contNum){\r\n\tdocument.getElementById(\"gongsaDetail\").src = '/rams/gongsa/gongsa_detail.do?CONSTNUM='+contNum;\r\n}\r\n\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\nfunction initSearchForm(){\r\n\tvar form = document.form;\r\n\t\r\n\tvar new_option;\r\n\tvar constCateg = document.getElementById(\"CONSTCATEG\");\r\n\t\r\n    ";
  private final static String _jspx_template8 = "\r\n\t\tif('";
  private final static String _jspx_template9 = "' != ''){\r\n\t    \tnew_option = new Option('";
  private final static String _jspx_template10 = "','";
  private final static String _jspx_template11 = "');\r\n\t    \tif(new_option.value == '";
  private final static String _jspx_template12 = "'){\r\n\t    \t\tnew_option.selected = true;\r\n\t    \t}\r\n\t    \tconstCateg.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template13 = "\r\n}\r\n\r\n</script>\r\n\r\n</head>\r\n\r\n<body onload=\"init();initSearchForm();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > <a href=\"#\" class=\"blue1\">공사대장조회</a> > <strong>공사대장조회</strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <!-- 검색 -->\r\n  <div>\r\n    <h2><img src=\"/rams/images/register/tt01.gif\" alt=\"공사대장 조회\"/></h2>\r\n\t<h3><img src=\"/rams/images/register/st_cont.gif\" alt=\"공사시행허가 내용\"/></h3>\r\n\t<div>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td width=\"5\" height=\"70\"><img src=\"/rams/images/suit/srch2_bg1.gif\" alt=\".\" /></td>\r\n\t\t  <td background=\"/rams/images/suit/srch2_bg2.gif\" class=\"srch\">\r\n\t\t\t  <table width=\"787\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td width=\"60\" height=\"25\" ><img src=\"/rams/images/suit/srch.gif\" alt=\"검색\"/></td>\r\n\t\t\t\t  <td width=\"50\">공사종류</td>\r\n\t\t\t\t  <td width=\"308\" colspan=\"5\">\r\n\t\t\t\t  \t<select id=\"CONSTCATEG\" name=\"CONSTCATEG\" class=\"formBox1\">\r\n\t\t\t\t  \t\t<option value=\"\">:::선택:::</option>\r\n\t\t\t\t  \t</select>\r\n\t\t\t\t  </td>\r\n\t\t\t\t  <td width=\"40\">노선명</td>\r\n\t\t\t\t  <td colspan=\"6\"><input id=\"LINENAME\" name=\"LINENAME\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template14 = "\"/></td>\r\n\t\t\t\t</tr>\r\n                <tr>\r\n                  <td width=\"60\" height=\"25\">&nbsp;</td>\r\n                  <td width=\"50\">착수일</td>\r\n                  <td width=\"98\"><input id=\"FROM_STARTDATE\" name=\"FROM_STARTDATE\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template15 = "\"/></td>\r\n                  <td width=\"25\"><a href=\"#\" onclick=\"popUpCalendar(this, document.getElementById('FROM_STARTDATE'), 'yyyymmdd');\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" border=\"0\" /></a></td>\r\n                  <td width=\"15\">~</td>\r\n                  <td width=\"98\"><input id=\"TO_STARTDATE\" name=\"TO_STARTDATE\"  type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template16 = "\"/></td>\r\n                  <td width=\"75\"><a href=\"#\" onclick=\"popUpCalendar(this, document.getElementById('TO_STARTDATE'), 'yyyymmdd');\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" border=\"0\" /></a></td>\r\n                  <td width=\"40\">준공일</td>\r\n                  <td width=\"98\"><input id=\"FROM_ENDDATE\" name=\"FROM_ENDDATE\"  type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template17 = "\"/></td>\r\n                  <td width=\"25\"><a href=\"#\" onclick=\"popUpCalendar(this, document.getElementById('FROM_ENDDATE'), 'yyyymmdd');\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" border=\"0\" /></a></td>\r\n                  <td width=\"15\">~</td>\r\n                  <td width=\"98\"><input id=\"TO_ENDDATE\" name=\"TO_ENDDATE\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template18 = "\"/></td>\r\n                  <td width=\"40\"><a href=\"#\" onclick=\"popUpCalendar(this, document.getElementById('TO_ENDDATE'), 'yyyymmdd');\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" border=\"0\" /></a></td>\r\n\t\t\t\t  <td><a href=\"#\" onclick=\"goSearch();\"><img src=\"/rams/images/common/btn_srch3.gif\" alt=\"검색\" border=\"0\" /></a></td>\r\n                </tr>\r\n              </table>\r\n              </td>\r\n\t\t  <td width=\"5\"><img src=\"/rams/images/suit/srch2_bg3.gif\" alt=\".\"/></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</div>\r\n    <div class=\"list\">\r\n\t\r\n\t\r\n\t  <!-- 검색결과 -->\r\n\t  <h4><img src=\"/rams/images/register/st_rst.gif\" alt=\"검색결과\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"40\" scope=\"col\">순번</th>\r\n\t\t\t\t<th width=\"90\" scope=\"col\">노선명</th>\r\n\t\t\t\t<th width=\"90\" scope=\"col\">공고일자</th>\r\n\t\t\t\t<th width=\"90\" scope=\"col\">공사종류</th>\r\n\t\t\t\t<th scope=\"col\">공사구간</th>\r\n\t\t\t\t<th width=\"90\" scope=\"col\">연장(km)</th>\r\n\t\t\t\t<th width=\"90\" scope=\"col\">착수일</th>\r\n\t\t\t\t<th width=\"90\" scope=\"col\">준공일</th>\r\n\t\t\t  </tr>\r\n\t\t\t  \t";
  private final static String _jspx_template19 = "\r\n\t\t\t\t";
  private final static String _jspx_template20 = "\r\n\t\t\t  \t";
  private final static String _jspx_template21 = "\r\n\t\t\t\t  <tr onmouseover=\"trMoouseOver(this)\" onmouseout=\"trMoouseOut(this)\" onclick=\"goView('";
  private final static String _jspx_template22 = "');\" style=\"cursor:pointer\">\r\n\t\t\t\t\t<td>";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t\t\t<td>";
  private final static String _jspx_template24 = "</td>\r\n\t\t\t\t\t<td>";
  private final static String _jspx_template25 = "</td>\r\n\t\t\t\t\t<td>";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t";
  private final static String _jspx_template27 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template28 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template29 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template31 = "부터 <br/>";
  private final static String _jspx_template32 = "까지\r\n\t\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template34 = "\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td>";
  private final static String _jspx_template35 = "</td>\r\n\t\t\t\t\t<td>";
  private final static String _jspx_template36 = "</td>\r\n\t\t\t\t\t<td>";
  private final static String _jspx_template37 = "</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t\t";
  private final static String _jspx_template39 = "\r\n\t\t\t\t";
  private final static String _jspx_template40 = "\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"8\" scope=\"col\">\r\n\t\t\t\t\t\t검색결과가 없습니다.\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t";
  private final static String _jspx_template41 = "\r\n\t\t\t\t";
  private final static String _jspx_template42 = "\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr style=\"height:36px\">\r\n\t\t\t<td align=\"center\">\r\n\t\t\t\t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template43 = "\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <iframe style=\"width:100%;height:100%;\" id=\"gongsaDetail\" name=\"gongsaDetail\" frameborder=\"0\" scrolling=\"no\" src=\"\" onload=\"iFrameResize(this);\"></iframe>\r\n    </div>\r\n  </div>\r\n</div>\r\n</body>\r\n</html>\r\n";
}
