package jeus_jspwork._jsp._cityland;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_dis_5flist_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template12);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template18);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_2_fn(pageContext, null)) return;


      out.write(_jspx_template24);
      out.write(_jspx_template25);
      // jsp code [from=(225,93);to=(225,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUNJI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(235,116);to=(235,133)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${START_DIS_JUD_AMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(237,112);to=(237,127)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${END_DIS_JUD_AMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(257,42);to=(257,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template55);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PermissCodeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("PermissCodeList");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template7);
            // jsp code [from=(48,9);to=(48,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PermissCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);
            // jsp code [from=(49,34);to=(49,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PermissCodeList.NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(49,58);to=(49,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PermissCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(50,33);to=(50,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PP_CLASS}",java.lang.String.class , pageContext.getVariableResolver(), null));

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

  private boolean _jspx_th_c_forEach_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_1.setPageContext(pageContext);
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("guList");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template13);
            // jsp code [from=(64,9);to=(64,21)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(65,31);to=(65,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(65,49);to=(65,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(66,30);to=(66,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);

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

  private boolean _jspx_th_c_forEach_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_2.setPageContext(pageContext);
    _jspx_th_c_forEach_2.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_2.setVar("dongList");
    try {
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template19);
            // jsp code [from=(73,9);to=(73,23)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(74,31);to=(74,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(74,51);to=(74,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(75,30);to=(75,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DONG_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);

          } while (_jspx_th_c_forEach_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_2.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_2.doCatch(t);
      } finally {
        _jspx_th_c_forEach_2.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_2.release();
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
          out.write(_jspx_template30);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template52);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template54);

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
          out.write(_jspx_template31);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_3_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template51);

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
          out.write(_jspx_template53);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_3.setPageContext(pageContext);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_forEach_3.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_3.setVar("blist");
    try {
      try {
        int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
        if (_jspx_eval_c_forEach_3 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template32);
            // jsp code [from=(277,52);to=(277,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.DIS_DAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(277,71);to=(277,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.DIS_ACC_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(277,93);to=(277,108)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.LAND_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(277,114);to=(277,130)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PP_CLASS_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(277,136);to=(277,153)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.DIS_JUD_AMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);
            // jsp code [from=(277,159);to=(277,172)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.DIS_AMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(277,178);to=(277,193)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.DIS_WAY_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(277,199);to=(277,215)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.DIS_REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(277,221);to=(277,241)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.DIS_CONTRACT_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(277,247);to=(277,260)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.OWNER_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(277,266);to=(277,282)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.OWN_CITY_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(278,13);to=(278,21)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(279,13);to=(279,26)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.DIS_DAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(280,13);to=(280,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.DIS_ACC_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(281,13);to=(281,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.LAND_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);
            // jsp code [from=(282,13);to=(282,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PP_CLASS_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template48);
            // jsp code [from=(283,13);to=(283,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.DIS_JUD_AMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template49);
            // jsp code [from=(284,13);to=(284,26)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.DIS_AMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);

          } while (_jspx_th_c_forEach_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_3.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_3.doCatch(t);
      } finally {
        _jspx_th_c_forEach_3.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_3.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\n\r\nfunction goSearch(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/cityland/dis_list.do?SEARCH=Y\";\r\n\tform.submit();\r\n}\r\n\r\n\r\nfunction goView(DIS_DAY,DIS_ACC_YN,LAND_ADDR,PP_CLASS_N,DIS_JUD_AMT,DIS_AMT,DIS_WAY_N,DIS_REASON,DIS_CONTRACT_N,OWNER_N,OWN_CITY_N){\r\n\t\r\n\tdocument.getElementById(\"listResult\").style.height = '150px';\r\n\tdocument.getElementById(\"viewResult\").style.display = 'block';\r\n\t\r\n\tdocument.getElementById(\"DIS_DAY\").innerHTML = DIS_DAY;\r\n\tdocument.getElementById(\"DIS_ACC_YN\").innerHTML = DIS_ACC_YN;\r\n\tdocument.getElementById(\"LAND_ADDR\").innerHTML = LAND_ADDR;\r\n\tdocument.getElementById(\"PP_CLASS_N\").innerHTML = PP_CLASS_N;\r\n\tdocument.getElementById(\"DIS_JUD_AMT\").innerHTML = DIS_JUD_AMT;\r\n\tdocument.getElementById(\"DIS_AMT\").innerHTML = DIS_AMT;\r\n\tdocument.getElementById(\"DIS_WAY_N\").innerHTML = DIS_WAY_N;\r\n\tdocument.getElementById(\"DIS_REASON\").innerHTML = DIS_REASON;\r\n\tdocument.getElementById(\"DIS_CONTRACT_N\").innerHTML = DIS_CONTRACT_N;\r\n\tdocument.getElementById(\"OWNER_N\").innerHTML = OWNER_N;\r\n\tdocument.getElementById(\"OWN_CITY_N\").innerHTML = OWN_CITY_N;\r\n\r\n}\r\n\r\n\r\nfunction initSearchForm(){\r\n\tvar form = document.form;\r\n\t\r\n\tvar new_option;\r\n\tvar _ppClass = document.getElementById(\"PP_CLASS\");\r\n\t\r\n    ";
  private final static String _jspx_template7 = "\r\n\t\tif('";
  private final static String _jspx_template8 = "' != ''){\r\n\t    \tnew_option = new Option('";
  private final static String _jspx_template9 = "','";
  private final static String _jspx_template10 = "');\r\n\t    \tif(new_option.value == '";
  private final static String _jspx_template11 = "'){\r\n\t    \t\tnew_option.selected = true;\r\n\t    \t}\r\n\t    \t_ppClass.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template12 = "\r\n\t\r\n\tvar _GuCd = document.getElementById(\"GU_CD\");\r\n\tvar _DongCd = document.getElementById(\"DONG_CD\");\r\n\t\r\n\tvar value_GuCd;\r\n\tvar value_DongCd;\r\n\t\r\n\t";
  private final static String _jspx_template13 = "\r\n\t\tif('";
  private final static String _jspx_template14 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template15 = "','";
  private final static String _jspx_template16 = "');\r\n\t\t\tif(new_option.value == '";
  private final static String _jspx_template17 = "'){\r\n\t\t\t\tnew_option.selected = true;\r\n\t\t\t}\r\n\t\t\t_GuCd.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template18 = "\r\n\t";
  private final static String _jspx_template19 = "\r\n\t\tif('";
  private final static String _jspx_template20 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template21 = "','";
  private final static String _jspx_template22 = "');\r\n\t\t\tif(new_option.value == '";
  private final static String _jspx_template23 = "'){\r\n\t\t\t\tnew_option.selected = true;\r\n\t\t\t}\r\n\t\t\t_DongCd.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template24 = "\r\n}\r\n\r\n// 구코드 변경\r\nfunction changeGuCode(){\r\n\tvar _guCode = getValueSelectTag(\"GU_CD\");\r\n\tvar param = \"&GU_CD=\"+_guCode;\r\n\tsendRequest(\"/rams/common/get_dong_list.do\", param, \"GET\", ResultChangeGuCode);\r\n}\r\n\r\n\r\n////////////////////////////////AJAX////////////////////////////////////////////\r\n\r\nfunction\tResultChangeGuCode(obj)\r\n{\r\n\tfncSelectBoxSetting(obj, \"DONG_CD\", \"\", \"::동선택::\");\r\n}\r\n\r\nfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n{\r\n    var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n    var selectBoxLabel;\r\n    var root;\r\n    var selectBoxValue;\r\n    var opt \t= document.getElementById(selectBoxId);\r\n    var tags\t= \"\";\r\n    var\ttext\t= \"\";\r\n\r\n    for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n    {\r\n    \topt.options[i]\t= null;\r\n    }\r\n\r\n    xmldoc.async\t= false;\r\n\r\n\txmldoc.loadXML(strParam);\r\n\r\n\r\n\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n    if(root <= 0)\r\n    {\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(\"\");\r\n        tags.setAttribute(\"label\", \"\");\r\n        tags.appendChild(text);\r\n        tags.value = 0;\r\n        opt.appendChild(tags);\r\n        return;\r\n    }\r\n\r\n    if(topLabel != null && topLabel != \"\")\r\n\t{\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(topLabel);\r\n        tags.setAttribute(\"label\", topLabel);\r\n        tags.appendChild(text);\r\n        tags.value = '';\r\n        opt.appendChild(tags);\r\n    }\r\n\t\r\n    for(var i = 0; i < root; i++)\r\n    {\r\n    \t\r\n    \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n    \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n        tags \t= document.createElement(\"option\");\r\n   \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n        tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n        tags.value = selectBoxValue;\r\n        tags.appendChild(text);\r\n        opt.appendChild(tags);\r\n    }   \r\n}\r\n</script>\r\n\r\n\r\n\r\n\r\n\r\n</head>\r\n\r\n<body onload=\"initSearchForm();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > <a href=\"#\" class=\"blue1\">시유지 조회</a> > <strong>처분 재산 </strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <!-- 검색 -->\r\n  <div>\r\n    <h2><img src=\"/rams/images/cityland/tt02.gif\" alt=\"시유지 조회_대부사용 허가\"/></h2>\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><a href=\"/rams/cityland/permiss_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image22','','/rams/images/cityland/tab01_on.gif',1)\"><img src=\"/rams/images/cityland/tab01_off.gif\" alt=\"대부사용 허가\" name=\"Image22\" width=\"91\" height=\"29\" border=\"0\" id=\"Image22\" /></a></td>\r\n          <td width=\"91\"><img src=\"/rams/images/cityland/tab02_on.gif\" alt=\"처분 재산\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/cityland/moodan_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','/rams/images/cityland/tab03_on.gif',1)\"><img src=\"/rams/images/cityland/tab03_off.gif\" alt=\"무단 점사용\" name=\"Image20\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/cityland/base_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image21','','/rams/images/cityland/tab04_on.gif',1)\"><img src=\"/rams/images/cityland/tab04_off.gif\" alt=\"재산 전용\" name=\"Image21\" width=\"91\" height=\"29\" border=\"0\" id=\"Image21\" /></a></td>\r\n\t\t  <td width=\"91\"><a href=\"/rams/cityland/history_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image23','','/rams/images/cityland/tab05_on.gif',1)\"><img src=\"/rams/images/cityland/tab05_off.gif\" alt=\"재산이력\" name=\"Image23\" width=\"91\" height=\"29\" border=\"0\" id=\"Image23\" /></a></td>\r\n          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t<div class=\"l";
  private final static String _jspx_template25 = "ist\">\r\n\t\r\n\t\r\n\t  <!-- 처분재산 검색 -->\r\n\t  <h3><img src=\"/rams/images/cityland/st_srch2.gif\" alt=\"처분재산 검색\"/></h3>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">재산구분</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">\r\n\t\t\t\t  <select id=\"PP_CLASS\" name=\"PP_CLASS\" class=\"formBox1\">\r\n\t\t\t\t  \t<option value=\"\">::선택::</option>\r\n\t\t\t\t  </select>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">소재지</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">\r\n\t\t\t\t\t<table width=\"454\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"120\">\r\n\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"formBox1\" onchange=\"changeGuCode();\">\r\n\t\t\t\t\t\t\t\t<option value=\"\">::구선택::</option>\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"120\" class=\"cont\">\r\n\t\t\t\t\t\t\t<select id=\"DONG_CD\" name=\"DONG_CD\" class=\"formBox1\">\r\n\t\t\t\t\t\t\t\t<option value=\"\">::동선택::</option>\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td class=\"cont\"><input id=\"BUNJI\" name=\"BUNJI\" type=\"text\" class=\"formBox1\" value=\"";
  private final static String _jspx_template26 = "\"/></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">평가액</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">\r\n\t\t\t\t\t<table width=\"220px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"100\"><input id=\"START_DIS_JUD_AMT\" name=\"START_DIS_JUD_AMT\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template27 = "\"/>원</td>\r\n\t\t\t\t\t\t<td width=\"20\">~</td>\r\n\t\t\t\t\t\t<td width=\"100\"><input id=\"END_DIS_JUD_AMT\" name=\"END_DIS_JUD_AMT\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template28 = "\"/>원</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t      <td height=\"26\" align=\"right\" valign=\"bottom\"><a href=\"#\" onclick=\"goSearch();\"><img src=\"/rams/images/common/btn_srch4.gif\" alt=\"검색\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <!-- 처분내역 검색결과 -->\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont2\"><img src=\"/rams/images/cityland/st_rst2.gif\" alt=\"처분내역 검색결과\"/></th>\r\n\t\t  <td align=\"right\" class=\"t_org\">[총 ";
  private final static String _jspx_template29 = "건]</td>\r\n\t    </tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t\t  <DIV id=\"listResult\" name=\"listResult\" style=\"width:813px;height:420px;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;overflow-y:auto;\">\r\n\t\t\t  \t<table width=\"100%\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th width=\"40\" scope=\"col\">순번</th>\r\n\t\t\t\t\t<th width=\"90\" scope=\"col\">처분일</th>\r\n\t\t\t\t\t<th width=\"90\" scope=\"col\">처분수락여부</th>\r\n\t\t\t\t\t<th scope=\"col\">소재지</th>\r\n\t\t\t\t\t<th width=\"90\" scope=\"col\">재산구분</th>\r\n\t\t\t\t\t<th width=\"90\" scope=\"col\">처분감정가액</th>\r\n\t\t\t\t\t<th width=\"90\" scope=\"col\">처분가액</th>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  \t";
  private final static String _jspx_template30 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template31 = "\r\n\t\t\t\t  \t";
  private final static String _jspx_template32 = "\r\n\t\t\t\t\t<tr style=\"cursor:pointer\" onclick=\"goView('";
  private final static String _jspx_template33 = "','";
  private final static String _jspx_template34 = "','";
  private final static String _jspx_template35 = "','";
  private final static String _jspx_template36 = "','";
  private final static String _jspx_template37 = "','";
  private final static String _jspx_template38 = "','";
  private final static String _jspx_template39 = "','";
  private final static String _jspx_template40 = "','";
  private final static String _jspx_template41 = "','";
  private final static String _jspx_template42 = "','";
  private final static String _jspx_template43 = "');\">\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template44 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template45 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template46 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template47 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template48 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template49 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template50 = "</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template51 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template52 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template53 = "\r\n\t\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td colspan=\"7\" scope=\"col\">\r\n\t\t\t\t\t\t\t검색결과가 없습니다.\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t</tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template54 = "\r\n\t\t\t\t\t";
  private final static String _jspx_template55 = "\r\n\t\t\t\t</table>\r\n\t\t\t</DIV>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <div id=\"viewResult\" style=\"display:none;\">\r\n\t  \r\n\t  <!-- 처분 계획 상세정보 -->\r\n\t  <h3><img src=\"/rams/images/cityland/st_info3.gif\" alt=\"처분 계획 상세정보\" /></h3>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">처분일</th>\r\n\t\t\t\t<td class=\"cont\"><span id=\"DIS_DAY\" name=\"DIS_DAY\"></td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">처분수락여부</th>\r\n\t\t\t\t<td width=\"283\" class=\"cont\"><span id=\"DIS_ACC_YN\" name=\"DIS_ACC_YN\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">소재지</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\"><span id=\"LAND_ADDR\" name=\"LAND_ADDR\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">재산구분</th>\r\n\t\t\t\t<td width=\"280\" class=\"cont\"><span id=\"PP_CLASS_N\" name=\"PP_CLASS_N\"></td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">재산형태</th>\r\n\t\t\t\t<td width=\"283\" class=\"cont\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">처분가액</th>\r\n\t\t\t\t<td class=\"cont\"><span id=\"DIS_JUD_AMT\" name=\"DIS_JUD_AMT\"></td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">처분 감정가액 </th>\r\n\t\t\t\t<td width=\"283\" class=\"cont\"><span id=\"DIS_AMT\" name=\"DIS_AMT\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">처분방법</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\"><span id=\"DIS_WAY_N\" name=\"DIS_WAY_N\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">처분사유</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\"><span id=\"DIS_REASON\" name=\"DIS_REASON\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">처분계약구분</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\"><span id=\"DIS_CONTRACT_N\" name=\"DIS_CONTRACT_N\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <!-- 처분 계획재산 소유자정보 -->\r\n\t  <h3><img src=\"/rams/images/cityland/st_info4.gif\" alt=\"처분 계획재산 소유자정보\" /></h3>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">소유구분</th>\r\n\t\t\t\t<td width=\"280\" class=\"cont\"><span id=\"OWNER_N\" name=\"OWNER_N\"></td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">소유자단체</th>\r\n\t\t\t\t<td width=\"283\" class=\"cont\"><span id=\"OWN_CITY_N\" name=\"OWN_CITY_N\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n  \t  </div>\r\n    </div>\r\n  </div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
