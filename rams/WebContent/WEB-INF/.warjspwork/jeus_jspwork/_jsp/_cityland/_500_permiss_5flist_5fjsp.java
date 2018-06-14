package jeus_jspwork._jsp._cityland;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_permiss_5flist_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_3_fn(pageContext, null)) return;


      out.write(_jspx_template30);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_4_fn(pageContext, null)) return;


      out.write(_jspx_template36);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_5_fn(pageContext, null)) return;


      out.write(_jspx_template42);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_6_fn(pageContext, null)) return;


      out.write(_jspx_template48);
      out.write(_jspx_template49);
      // jsp code [from=(262,93);to=(262,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUNJI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(303,104);to=(303,115)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${START_P_AMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(305,100);to=(305,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${END_P_AMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);
      // jsp code [from=(315,107);to=(315,120)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PER_START_DAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template53);
      // jsp code [from=(318,105);to=(318,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PER_END_DAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template54);
      // jsp code [from=(327,106);to=(327,118)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${START_P_AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template55);
      // jsp code [from=(329,102);to=(329,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${END_P_AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template56);
      // jsp code [from=(349,42);to=(349,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${listCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template87);

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
            // jsp code [from=(49,9);to=(49,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PermissCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);
            // jsp code [from=(50,34);to=(50,52)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PermissCodeList.NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(50,58);to=(50,76)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PermissCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(51,33);to=(51,41)]
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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${UseCodeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("UseCodeList");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template13);
            // jsp code [from=(58,9);to=(58,23)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${UseCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(59,34);to=(59,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${UseCodeList.NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(59,54);to=(59,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${UseCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(60,33);to=(60,36)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${USE}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
    _jspx_th_c_forEach_2.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AdmiCodeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_2.setVar("AdmiCodeList");
    try {
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template19);
            // jsp code [from=(67,9);to=(67,24)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AdmiCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(68,31);to=(68,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AdmiCodeList.NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(68,52);to=(68,67)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AdmiCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(69,33);to=(69,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ADMI}",java.lang.String.class , pageContext.getVariableResolver(), null));

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

  private boolean _jspx_th_c_forEach_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_3.setPageContext(pageContext);
    _jspx_th_c_forEach_3.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AccountCodeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_3.setVar("AccountCodeList");
    try {
      try {
        int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
        if (_jspx_eval_c_forEach_3 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template25);
            // jsp code [from=(76,9);to=(76,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AccountCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(77,31);to=(77,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AccountCodeList.NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(77,55);to=(77,73)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AccountCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(78,33);to=(78,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ACCOUNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);

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

  private boolean _jspx_th_c_forEach_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_4.setPageContext(pageContext);
    _jspx_th_c_forEach_4.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MainManaCodeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_4.setVar("MainManaCodeList");
    try {
      try {
        int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
        if (_jspx_eval_c_forEach_4 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template31);
            // jsp code [from=(85,9);to=(85,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MainManaCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(86,31);to=(86,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MainManaCodeList.NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(86,56);to=(86,75)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MainManaCodeList.CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(87,33);to=(87,42)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MAIN_MANA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);

          } while (_jspx_th_c_forEach_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_4.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_4.doCatch(t);
      } finally {
        _jspx_th_c_forEach_4.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_4.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_5_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_5.setPageContext(pageContext);
    _jspx_th_c_forEach_5.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_5.setVar("guList");
    try {
      try {
        int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
        if (_jspx_eval_c_forEach_5 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template37);
            // jsp code [from=(101,9);to=(101,21)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(102,31);to=(102,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(102,49);to=(102,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(103,30);to=(103,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);

          } while (_jspx_th_c_forEach_5.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_5.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_5.doCatch(t);
      } finally {
        _jspx_th_c_forEach_5.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_5.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_6_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_6 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_6.setPageContext(pageContext);
    _jspx_th_c_forEach_6.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_6.setVar("dongList");
    try {
      try {
        int _jspx_eval_c_forEach_6 = _jspx_th_c_forEach_6.doStartTag();
        if (_jspx_eval_c_forEach_6 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template43);
            // jsp code [from=(110,9);to=(110,23)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(111,31);to=(111,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(111,51);to=(111,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(112,30);to=(112,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DONG_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);

          } while (_jspx_th_c_forEach_6.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_6.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_6.doCatch(t);
      } finally {
        _jspx_th_c_forEach_6.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_6.release();
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
          out.write(_jspx_template58);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template84);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template86);

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
          out.write(_jspx_template59);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_7_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template83);

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
          out.write(_jspx_template85);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_7_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_7 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_7.setPageContext(pageContext);
    _jspx_th_c_forEach_7.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_forEach_7.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_7.setVar("blist");
    try {
      try {
        int _jspx_eval_c_forEach_7 = _jspx_th_c_forEach_7.doStartTag();
        if (_jspx_eval_c_forEach_7 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template60);
            // jsp code [from=(371,52);to=(371,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PP_CLASS_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template61);
            // jsp code [from=(371,74);to=(371,89)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.LAND_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template62);
            // jsp code [from=(371,95);to=(371,106)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.USE_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template63);
            // jsp code [from=(371,112);to=(371,124)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.ADMI_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template64);
            // jsp code [from=(371,130);to=(371,145)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.ACCOUNT_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template65);
            // jsp code [from=(371,151);to=(371,170)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PER_START_DAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template66);
            // jsp code [from=(371,176);to=(371,193)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PER_END_DAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template67);
            // jsp code [from=(371,199);to=(371,213)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PER_AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template68);
            // jsp code [from=(371,219);to=(371,230)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.RATE1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template69);
            // jsp code [from=(371,236);to=(371,247)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PAY_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template70);
            // jsp code [from=(371,253);to=(371,266)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PER_AMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template71);
            // jsp code [from=(372,13);to=(372,21)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.RN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template72);
            // jsp code [from=(373,13);to=(373,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PP_CLASS_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template73);
            // jsp code [from=(374,13);to=(374,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.LAND_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template74);
            // jsp code [from=(375,13);to=(375,24)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.USE_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template75);
            // jsp code [from=(375,33);to=(375,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.ADMI_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template76);
            // jsp code [from=(376,13);to=(376,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.ACCOUNT_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template77);
            // jsp code [from=(377,13);to=(377,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.MAIN_MANA_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template78);
            // jsp code [from=(378,13);to=(378,22)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.AMT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template79);
            // jsp code [from=(379,13);to=(379,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PER_START_DAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template80);
            // jsp code [from=(379,38);to=(379,55)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PER_END_DAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template81);
            // jsp code [from=(380,13);to=(380,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PER_AREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template82);

          } while (_jspx_th_c_forEach_7.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_7.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_7.doCatch(t);
      } finally {
        _jspx_th_c_forEach_7.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_7.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\n\r\nfunction goSearch(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/cityland/permiss_list.do?SEARCH=Y\";\r\n\tform.submit();\r\n}\r\n\r\n\r\nfunction goView(PP_CLASS_N,LAND_ADDR,USE_N,ADMI_N,ACCOUNT_N,PER_START_DAY,PER_END_DAY,PER_AREA,RATE1,PAY_N,PER_AMT){\r\n\t\r\n\tdocument.getElementById(\"listResult\").style.height = '150px';\r\n\tdocument.getElementById(\"viewResult\").style.display = 'block';\r\n\t\r\n\tdocument.getElementById(\"PP_CLASS_N\").innerHTML = PP_CLASS_N;\r\n\tdocument.getElementById(\"LAND_ADDR\").innerHTML = LAND_ADDR;\r\n\tdocument.getElementById(\"USE_ADMI\").innerHTML = USE_N+'/'+ADMI_N;\r\n\tdocument.getElementById(\"ACCOUNT_N\").innerHTML= ACCOUNT_N;\r\n\tdocument.getElementById(\"PER_DAY\").innerHTML = PER_START_DAY + ' ~ ' + PER_END_DAY;\r\n\tdocument.getElementById(\"PER_AREA\").innerHTML = PER_AREA +'㎡';\r\n\tdocument.getElementById(\"RATE1\").innerHTML = RATE1;\r\n\tdocument.getElementById(\"PAY_N\").innerHTML = PAY_N;\r\n\tdocument.getElementById(\"PER_AMT\").innerHTML = PER_AMT;\r\n}\r\n\r\n\r\nfunction initSearchForm(){\r\n\tvar form = document.form;\r\n\t\r\n\tvar new_option;\r\n\tvar _ppClass = document.getElementById(\"PP_CLASS\");\r\n\tvar _Use = document.getElementById(\"USE\");\r\n\tvar _Admi = document.getElementById(\"ADMI\");\r\n\tvar _Account = document.getElementById(\"ACCOUNT\");\r\n\tvar _MainMana = document.getElementById(\"MAIN_MANA\");\r\n\t\r\n    ";
  private final static String _jspx_template7 = "\r\n\t\tif('";
  private final static String _jspx_template8 = "' != ''){\r\n\t    \tnew_option = new Option('";
  private final static String _jspx_template9 = "','";
  private final static String _jspx_template10 = "');\r\n\t    \tif(new_option.value == '";
  private final static String _jspx_template11 = "'){\r\n\t    \t\tnew_option.selected = true;\r\n\t    \t}\r\n\t    \t_ppClass.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template12 = "\r\n    ";
  private final static String _jspx_template13 = "\r\n\t\tif('";
  private final static String _jspx_template14 = "' != ''){\r\n\t    \tnew_option = new Option('";
  private final static String _jspx_template15 = "','";
  private final static String _jspx_template16 = "');\r\n\t    \tif(new_option.value == '";
  private final static String _jspx_template17 = "'){\r\n\t    \t\tnew_option.selected = true;\r\n\t    \t}\r\n\t    \t_Use.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template18 = "\r\n\t";
  private final static String _jspx_template19 = "\r\n\t\tif('";
  private final static String _jspx_template20 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template21 = "','";
  private final static String _jspx_template22 = "');\r\n\t    \tif(new_option.value == '";
  private final static String _jspx_template23 = "'){\r\n\t    \t\tnew_option.selected = true;\r\n\t    \t}\r\n\t\t\t_Admi.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template24 = "\r\n\t";
  private final static String _jspx_template25 = "\r\n\t\tif('";
  private final static String _jspx_template26 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template27 = "','";
  private final static String _jspx_template28 = "');\r\n\t    \tif(new_option.value == '";
  private final static String _jspx_template29 = "'){\r\n\t    \t\tnew_option.selected = true;\r\n\t    \t}\r\n\t\t\t_Account.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template30 = "\r\n\t";
  private final static String _jspx_template31 = "\r\n\t\tif('";
  private final static String _jspx_template32 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template33 = "','";
  private final static String _jspx_template34 = "');\r\n\t    \tif(new_option.value == '";
  private final static String _jspx_template35 = "'){\r\n\t    \t\tnew_option.selected = true;\r\n\t    \t}\r\n\t\t\t_MainMana.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template36 = "\r\n\t\r\n\tvar _GuCd = document.getElementById(\"GU_CD\");\r\n\tvar _DongCd = document.getElementById(\"DONG_CD\");\r\n\t\r\n\tvar value_GuCd;\r\n\tvar value_DongCd;\r\n\t\r\n\t";
  private final static String _jspx_template37 = "\r\n\t\tif('";
  private final static String _jspx_template38 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template39 = "','";
  private final static String _jspx_template40 = "');\r\n\t\t\tif(new_option.value == '";
  private final static String _jspx_template41 = "'){\r\n\t\t\t\tnew_option.selected = true;\r\n\t\t\t}\r\n\t\t\t_GuCd.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template42 = "\r\n\t";
  private final static String _jspx_template43 = "\r\n\t\tif('";
  private final static String _jspx_template44 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template45 = "','";
  private final static String _jspx_template46 = "');\r\n\t\t\tif(new_option.value == '";
  private final static String _jspx_template47 = "'){\r\n\t\t\t\tnew_option.selected = true;\r\n\t\t\t}\r\n\t\t\t_DongCd.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template48 = "\r\n}\r\n\r\n// 구코드 변경\r\nfunction changeGuCode(){\r\n\tvar _guCode = getValueSelectTag(\"GU_CD\");\r\n\tvar param = \"&GU_CD=\"+_guCode;\r\n\tsendRequest(\"/rams/common/get_dong_list.do\", param, \"GET\", ResultChangeGuCode);\r\n}\r\n\r\n\r\n////////////////////////////////AJAX////////////////////////////////////////////\r\n\r\nfunction\tResultChangeGuCode(obj)\r\n{\r\n\tfncSelectBoxSetting(obj, \"DONG_CD\", \"\", \"::동선택::\");\r\n}\r\n\r\nfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n{\r\n    var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n    var selectBoxLabel;\r\n    var root;\r\n    var selectBoxValue;\r\n    var opt \t= document.getElementById(selectBoxId);\r\n    var tags\t= \"\";\r\n    var\ttext\t= \"\";\r\n\r\n    for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n    {\r\n    \topt.options[i]\t= null;\r\n    }\r\n\r\n    xmldoc.async\t= false;\r\n\r\n\txmldoc.loadXML(strParam);\r\n\r\n\r\n\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n    if(root <= 0)\r\n    {\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(\"\");\r\n        tags.setAttribute(\"label\", \"\");\r\n        tags.appendChild(text);\r\n        tags.value = 0;\r\n        opt.appendChild(tags);\r\n        return;\r\n    }\r\n\r\n    if(topLabel != null && topLabel != \"\")\r\n\t{\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(topLabel);\r\n        tags.setAttribute(\"label\", topLabel);\r\n        tags.appendChild(text);\r\n        tags.value = '';\r\n        opt.appendChild(tags);\r\n    }\r\n\t\r\n    for(var i = 0; i < root; i++)\r\n    {\r\n    \t\r\n    \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n    \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n        tags \t= document.createElement(\"option\");\r\n   \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n        tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n        tags.value = selectBoxValue;\r\n        tags.appendChild(text);\r\n        opt.appendChild(tags);\r\n    }   \r\n}\r\n</script>\r\n\r\n\r\n\r\n\r\n\r\n</head>\r\n\r\n<body onload=\"initSearchForm();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > <a href=\"#\" class=\"blue1\">시유지 조회 </a> > <strong>대부사용 허가 </strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <!-- 검색 -->\r\n  <div>\r\n    <h2><img src=\"/rams/images/cityland/tt01.gif\" alt=\"시유지 조회_대부사용 허가\"/></h2>\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><img src=\"/rams/images/cityland/tab01_on.gif\" alt=\"소송정보\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/cityland/dis_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image19','','/rams/images/cityland/tab02_on.gif',1)\"><img src=\"/rams/images/cityland/tab02_off.gif\" alt=\"처분재산\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image19\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/cityland/moodan_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','/rams/images/cityland/tab03_on.gif',1)\"><img src=\"/rams/images/cityland/tab03_off.gif\" alt=\"무단 점사용\" name=\"Image20\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/cityland/base_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image21','','/rams/images/cityland/tab04_on.gif',1)\"><img src=\"/rams/images/cityland/tab04_off.gif\" alt=\"재산 전용\" name=\"Image21\" width=\"91\" height=\"29\" border=\"0\" id=\"Image21\" /></a></td>\r\n\t\t  <td width=\"91\"><a href=\"/rams/cityland/history_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image23','','/rams/images/cityland/tab05_on.gif',1)\"><img src=\"/rams/images/cityland/tab05_off.gif\" alt=\"재산이력\" name=\"Image23\" width=\"91\" height=\"29\" border=\"0\" id=\"Image23\" /></a></td>\r\n          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t<div class=\"list\">";
  private final static String _jspx_template49 = "\r\n\t\r\n\t\r\n\t  <!-- 대부 및 사용허가 검색 -->\r\n\t  <h3><img src=\"/rams/images/cityland/st_srch1.gif\" alt=\"대부 및 사용허가 검색\"/></h3>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">재산구분</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">\r\n\t\t\t\t  <select id=\"PP_CLASS\" name=\"PP_CLASS\" class=\"formBox1\">\r\n\t\t\t\t  \t<option value=\"\">::선택::</option>\r\n\t\t\t\t  </select>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">소재지</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">\r\n\t\t\t\t\t<table width=\"454\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"120\">\r\n\t\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"formBox1\" onchange=\"changeGuCode();\">\r\n\t\t\t\t\t\t\t\t<option value=\"\">::구선택::</option>\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"120\" class=\"cont\">\r\n\t\t\t\t\t\t\t<select id=\"DONG_CD\" name=\"DONG_CD\" class=\"formBox1\">\r\n\t\t\t\t\t\t\t\t<option value=\"\">::동선택::</option>\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td class=\"cont\"><input id=\"BUNJI\" name=\"BUNJI\" type=\"text\" class=\"formBox1\" value=\"";
  private final static String _jspx_template50 = "\"/></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">재산 용도</th>\r\n\t\t\t\t<td width=\"276\" class=\"cont\">\r\n\t\t\t\t\t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"120\">\r\n\t\t\t\t\t\t\t<select id=\"USE\" name=\"USE\" class=\"formBox1\">\r\n\t\t\t\t\t\t\t\t<option value=\"\">::선택::</option>\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"120\" class=\"cont\">\r\n\t\t\t\t\t\t\t<select id=\"ADMI\" name=\"ADMI\" class=\"formBox1\">\r\n\t\t\t\t\t\t\t\t<option value=\"\">::선택::</option>\r\n\t\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">회계 구분 </th>\r\n\t\t\t\t<td width=\"276\" class=\"cont\">\r\n\t\t\t\t  <select id=\"ACCOUNT\" name=\"ACCOUNT\" class=\"formBox1\">\r\n\t\t\t\t  \t<option value=\"\">::선택::</option>\r\n\t\t\t\t  </select>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">재산 관리관 </th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<select id=\"MAIN_MANA\" name=\"MAIN_MANA\" class=\"formBox8\">\r\n\t\t\t\t\t\t<option value=\"\">::선택::</option>\r\n\t\t\t\t\t</select>\r\n\t\t\t\t</td>\r\n\t\t\t\t<th scope=\"col\">재산 가액</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<table width=\"220px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"100\"><input id=\"START_P_AMT\" name=\"START_P_AMT\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template51 = "\"/>원</td>\r\n\t\t\t\t\t\t<td width=\"20\">~</td>\r\n\t\t\t\t\t\t<td width=\"100\"><input id=\"END_P_AMT\" name=\"END_P_AMT\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template52 = "\"/>원</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">허가 기간</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<table width=\"246\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"95\"><input id=\"PER_START_DAY\" name=\"PER_START_DAY\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template53 = "\"/></td>\r\n\t\t                <td width=\"23\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" onclick=\"popUpCalendar(this,PER_START_DAY,'yyyymmdd')\" style=\"cursor:pointer;\"/></td>\r\n\t\t\t\t  \t\t<td width=\"10\">~</td>\r\n\t\t\t\t  \t\t<td width=\"95\"><input id=\"PER_END_DAY\" name=\"PER_END_DAY\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template54 = "\"/></td>\r\n\t\t\t\t  \t\t<td width=\"23\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" onclick=\"popUpCalendar(this,PER_END_DAY,'yyyymmdd')\" style=\"cursor:pointer;\"/></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<th scope=\"col\">허가 면적 </th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<table width=\"220px\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"100\"><input id=\"START_P_AREA\" name=\"START_P_AREA\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template55 = "\"/>㎡</td>\r\n\t\t\t\t\t\t<td width=\"20\">~</td>\r\n\t\t\t\t\t\t<td width=\"100\"><input id=\"END_P_AREA\" name=\"END_P_AREA\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template56 = "\"/>㎡</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t      <td height=\"26\" align=\"right\" valign=\"bottom\"><a href=\"#\" onclick=\"goSearch();\"><img src=\"/rams/images/common/btn_srch4.gif\" alt=\"검색\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <!-- 대부 및 사용허가 검색결과 -->\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont2\"><img src=\"/rams/images/cityland/st_rst1.gif\" alt=\"대부 및 사용허가 검색결과\"/></th>\r\n\t\t  <td align=\"right\" class=\"t_org\">[총 ";
  private final static String _jspx_template57 = "건] </td>\r\n\t    </tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<DIV id=\"listResult\" style=\"width:813px;height:400px;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;overflow-y:auto;\">\r\n\t\t  \t<table width=\"100%\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"40\" scope=\"col\">순번</th>\r\n\t\t\t\t<th width=\"60\" scope=\"col\">재산구분</th>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">소재지</th>\r\n\t\t\t\t<th width=\"60\" scope=\"col\">재산용도</th>\r\n\t\t\t\t<th width=\"100\" scope=\"col\">회계구분</th>\r\n\t\t\t\t<th scope=\"col\">재산관리관</th>\r\n\t\t\t\t<th width=\"90\" scope=\"col\">재산가액</th>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">허가기간</th>\r\n\t\t\t\t<th width=\"70\" scope=\"col\">허가면적(㎡)</th>\r\n\t\t\t  </tr>\r\n\t\t\t  \t";
  private final static String _jspx_template58 = "\r\n\t\t\t\t";
  private final static String _jspx_template59 = "\r\n\t\t\t\t";
  private final static String _jspx_template60 = "\r\n\t\t\t\t\t<tr style=\"cursor:pointer\" onclick=\"goView('";
  private final static String _jspx_template61 = "','";
  private final static String _jspx_template62 = "','";
  private final static String _jspx_template63 = "','";
  private final static String _jspx_template64 = "','";
  private final static String _jspx_template65 = "','";
  private final static String _jspx_template66 = "','";
  private final static String _jspx_template67 = "','";
  private final static String _jspx_template68 = "','";
  private final static String _jspx_template69 = "','";
  private final static String _jspx_template70 = "','";
  private final static String _jspx_template71 = "');\">\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template72 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template73 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template74 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template75 = "/<br/>";
  private final static String _jspx_template76 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template77 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template78 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template79 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template80 = " ~ ";
  private final static String _jspx_template81 = "</td>\r\n\t\t\t\t\t\t<td>";
  private final static String _jspx_template82 = "</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t";
  private final static String _jspx_template83 = "\r\n\t\t\t\t";
  private final static String _jspx_template84 = "\r\n\t\t\t\t";
  private final static String _jspx_template85 = "\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t<td colspan=\"9\" scope=\"col\">\r\n\t\t\t\t\t\t검색결과가 없습니다.\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t";
  private final static String _jspx_template86 = "\r\n\t\t\t\t";
  private final static String _jspx_template87 = "\r\n\t\t\t\t\r\n\t\t\t</table>\r\n\t\t\t</DIV>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <div id=\"viewResult\" style=\"display:none;\">\r\n\t  \r\n\t\t  <!-- 대부 및 사용허가 상세정보 -->\r\n\t\t  <h3><img src=\"/rams/images/cityland/st_info1.gif\" alt=\"대부 및 사용허가 상세정보\" /></h3>\r\n\t\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t\t<tr>\r\n\t\t\t  <td>\r\n\t\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th width=\"120\" scope=\"col\">재산</th>\r\n\t\t\t\t\t<td colspan=\"3\" class=\"cont\"><span id=\"PP_CLASS_N\" name=\"PP_CLASS_N\"></span></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th scope=\"col\">소재지</th>\r\n\t\t\t\t\t<td colspan=\"3\" class=\"cont\"><span id=\"LAND_ADDR\" name=\"LAND_ADDR\"></span></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th width=\"120\" scope=\"col\">재산구분</th>\r\n\t\t\t\t\t<td width=\"280\" class=\"cont\"><span id=\"USE_ADMI\" name=\"USE_ADMI\"></span></td>\r\n\t\t\t\t\t<th width=\"120\" scope=\"col\">회계구분</th>\r\n\t\t\t\t\t<td width=\"283\" class=\"cont\"><span id=\"ACCOUNT_N\" name=\"ACCOUNT_N\"></span></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\r\n\t\t\t  </td>\r\n\t\t\t</tr>\r\n\t\t  </table>\r\n\t\t  \r\n\t\t  <!-- 사용 허가 정보 -->\r\n\t\t  <h3><img src=\"/rams/images/cityland/st_info2.gif\" alt=\"사용 허가 정보\" /></h3>\r\n\t\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t\t<tr>\r\n\t\t\t  <td>\r\n\t\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th width=\"120\" scope=\"col\">허가기간</th>\r\n\t\t\t\t\t<td width=\"280\" class=\"cont\"><span id=\"PER_DAY\" name=\"PER_DAY\"></span></td>\r\n\t\t\t\t\t<th width=\"120\" scope=\"col\">허가 면적 </th>\r\n\t\t\t\t\t<td width=\"283\" class=\"cont\"><span id=\"PER_AREA\" name=\"PER_AREA\"></span></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th scope=\"col\">요율</th>\r\n\t\t\t\t\t<td width=\"276\" class=\"cont\"><span id=\"RATE1\" name=\"RATE1\"></span></td>\r\n\t\t\t\t\t<th width=\"120\" scope=\"col\">유/무상 여부 </th>\r\n\t\t\t\t\t<td width=\"276\" class=\"cont\"><span id=\"PAY_N\" name=\"PAY_N\"></span></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th scope=\"col\">대부(허가)요금 </th>\r\n\t\t\t\t\t<td colspan=\"3\" class=\"cont\"><span id=\"PER_AMT\" name=\"PER_AMT\"></span></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\r\n\t\t\t  </td>\r\n\t\t\t</tr>\r\n\t\t  </table>\r\n\t  </div>\r\n    </div>\r\n  </div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>";
}
