package jeus_jspwork._jsp._suit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_suit_5freg_5finit_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(155,15);to=(155,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(234,100);to=(234,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${BUNJI}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // ----  c:choose ---- invoke //
      if (_jspx_th_c_choose_0_fn(pageContext, null)) return;


      out.write(_jspx_template38);
      // jsp code [from=(309,8);to=(309,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("guList");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template7);
            // jsp code [from=(135,9);to=(135,21)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);
            // jsp code [from=(136,31);to=(136,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(136,49);to=(136,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(137,30);to=(137,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("dongList");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template13);
            // jsp code [from=(144,9);to=(144,23)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(145,31);to=(145,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(145,51);to=(145,65)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(146,30);to=(146,37)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${DONG_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
          out.write(_jspx_template21);
          // ----  c:when ---- invoke //
          if (_jspx_th_c_when_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template35);
          // ----  c:otherwise ---- invoke //
          if (_jspx_th_c_otherwise_0_fn(pageContext, _jspx_th_c_choose_0)) return true;


          out.write(_jspx_template37);

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
          out.write(_jspx_template22);
          // ----  c:forEach ---- invoke //
          if (_jspx_th_c_forEach_2_fn(pageContext, _jspx_th_c_when_0)) return true;


          out.write(_jspx_template34);

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
          out.write(_jspx_template36);

        } while (_jspx_th_c_otherwise_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_otherwise_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_otherwise_0.release();
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
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag)_jspx_parentTag);
    _jspx_th_c_forEach_2.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_2.setVar("blist");
    try {
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template23);
            // jsp code [from=(276,58);to=(276,73)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(277,52);to=(277,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(279,15);to=(279,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(280,15);to=(280,31)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.AFFAIRNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(281,15);to=(281,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.LAND_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(282,15);to=(282,33)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.ANNOUNCEDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(283,15);to=(283,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.OUTCOME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(284,15);to=(284,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PRE_COURT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(285,15);to=(285,34)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PRE_AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(286,15);to=(286,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PRE_OUTCOME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);

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

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\n\r\n// 구코드 변경\r\nfunction changeGuCode(){\r\n\tvar _guCode = getValueSelectTag(\"GU_CD\");\r\n\tvar param = \"&GU_CD=\"+_guCode;\r\n\tsendRequest(\"/rams/common/get_dong_list.do\", param, \"GET\", ResultChangeGuCode);\r\n}\r\n\r\n\r\n////////////////////////////////AJAX////////////////////////////////////////////\r\n\r\nfunction\tResultChangeGuCode(obj)\r\n{\r\n\tfncSelectBoxSetting(obj, \"DONG_CD\", \"\", \"::동선택::\");\r\n}\r\n\r\nfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n{\r\n    var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n    var selectBoxLabel;\r\n    var root;\r\n    var selectBoxValue;\r\n    var opt \t= document.getElementById(selectBoxId);\r\n    var tags\t= \"\";\r\n    var\ttext\t= \"\";\r\n\r\n    for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n    {\r\n    \topt.options[i]\t= null;\r\n    }\r\n\r\n    xmldoc.async\t= false;\r\n\r\n\txmldoc.loadXML(strParam);\r\n\r\n\r\n\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n    if(root <= 0)\r\n    {\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(\"\");\r\n        tags.setAttribute(\"label\", \"\");\r\n        tags.appendChild(text);\r\n        tags.value = 0;\r\n        opt.appendChild(tags);\r\n        return;\r\n    }\r\n\r\n    if(topLabel != null && topLabel != \"\")\r\n\t{\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(topLabel);\r\n        tags.setAttribute(\"label\", topLabel);\r\n        tags.appendChild(text);\r\n        tags.value = '';\r\n        opt.appendChild(tags);\r\n    }\r\n\t\r\n    for(var i = 0; i < root; i++)\r\n    {\r\n    \t\r\n    \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n    \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n        tags \t= document.createElement(\"option\");\r\n   \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n        tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n        tags.value = selectBoxValue;\r\n        tags.appendChild(text);\r\n        opt.appendChild(tags);\r\n    }   \r\n}\r\n\r\n\r\nfunction goSearch(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_reg_init.do\";\r\n\tform.submit();\r\n}\r\n\r\nfunction goCancel(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_list.do\";\r\n\tform.submit();\r\n}\r\n\r\nfunction goRegSuit(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_reg.do\";\r\n\tform.submit();\r\n\t\r\n}\r\n\r\nfunction goRegAfterSuit(){\r\n\tif(document.getElementById(\"AFFAIRNUM\").value != null && document.getElementById(\"AFFAIRNUM\").value != ''){\r\n\t\tvar form = document.form;\r\n\t\tform.action = \"/rams/suit/suit_after_reg.do\";\r\n\t\tform.submit();\r\n\t}else{\r\n\t\talert(\"상급심 등록을 위해 한개의 결과를 선택하세요\");\r\n\t}\r\n\t\r\n\t\r\n}\r\n\r\n\r\nfunction initSearchForm(){\r\n\tvar form = document.form;\r\n\t\r\n\tvar new_option;\r\n\t\r\n\tvar _GuCd = document.getElementById(\"GU_CD\");\r\n\tvar _DongCd = document.getElementById(\"DONG_CD\");\r\n\t\r\n\tvar value_GuCd;\r\n\tvar value_DongCd;\r\n\t\r\n\t";
  private final static String _jspx_template7 = "\r\n\t\tif('";
  private final static String _jspx_template8 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template9 = "','";
  private final static String _jspx_template10 = "');\r\n\t\t\tif(new_option.value == '";
  private final static String _jspx_template11 = "'){\r\n\t\t\t\tnew_option.selected = true;\r\n\t\t\t}\r\n\t\t\t_GuCd.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template12 = "\r\n\t";
  private final static String _jspx_template13 = "\r\n\t\tif('";
  private final static String _jspx_template14 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template15 = "','";
  private final static String _jspx_template16 = "');\r\n\t\t\tif(new_option.value == '";
  private final static String _jspx_template17 = "'){\r\n\t\t\t\tnew_option.selected = true;\r\n\t\t\t}\r\n\t\t\t_DongCd.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template18 = "\r\n}\r\n\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template19 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\n\r\nfunction checkItem(obj){\r\n\t\r\n\tvar selectItem_arr = document.getElementsByName(\"SELECT_ITEM\");\r\n\tvar affairNum_arr = document.getElementsByName(\"AFFAIRNUM_ARR\");\r\n\tvar pnu_arr = document.getElementsByName(\"PNU_ARR\");\r\n\r\n\tfor(var i = 0; i < selectItem_arr.length; i ++){\r\n\t\tif(selectItem_arr[i] == obj){\r\n\t\t\tdocument.getElementById(\"AFFAIRNUM\").value = affairNum_arr[i].value;\r\n\t\t\tdocument.getElementById(\"PNU\").value = pnu_arr[i].value;\r\n\t\t}else{\r\n\t\t\tselectItem_arr[i].checked = false;\r\n\t\t}\r\n\t}\r\n\t\r\n}\r\n\r\n\r\n</script>\r\n</head>\r\n<body onload=\"init();initSearchForm();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n\r\n<input id=\"AFFAIRNUM\" name=\"AFFAIRNUM\" type=\"hidden\" value=\"\"></input>\r\n<input id=\"PNU\" name=\"PNU\" type=\"hidden\" value=\"\"></input>\r\n\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > <a href=\"#\" class=\"blue1\">소송정보관리</a> > <strong>소송정보</strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <!-- 검색 -->\r\n  <div>\r\n    <h2><img src=\"/rams/images/suit/tt01.gif\" alt=\"소송정보관리_소송정보\" width=\"160\" height=\"22\" /></h2>\t\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><img src=\"/rams/images/suit/02tab01_on.gif\" alt=\"소송정보\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/suit/suit_price_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image13','','/rams/images/suit/02tab02_on.gif',1)\"><img src=\"/rams/images/suit/02tab02_off.gif\" alt=\"소가관리\" name=\"Image13\" border=\"0\" id=\"Image13\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/suit/suit_anal_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image14','','/rams/images/suit/02tab03_on.gif',1)\"><img src=\"/rams/images/suit/02tab03_off.gif\" alt=\"통계\" name=\"Image14\" border=\"0\" id=\"Image14\" /></a></td>\r\n          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t<div>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td width=\"5\" height=\"50\"><img src=\"/rams/images/suit/srch_bg1.gif\" alt=\".\" /></td>\r\n\t\t  <td background=\"/rams/images/suit/srch_bg2.gif\" class=\"srch\"><table width=\"787\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n            <tr>\r\n              <td height=\"20\" colspan=\"5\" class=\"t_org\">※ 상고심 유무 체크를 위해 입력하고자 하는 사건의 토지를 먼저 검색하세요.</td>\r\n              </tr>\r\n            <tr>\r\n              <td width=\"90\"><strong>사건 토지 검색</strong></td>\r\n              <td width=\"130\">\r\n           \t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"formBox1\" onchange=\"changeGuCode();\">\r\n\t\t\t\t\t<option value=\"%\">::구선택::</option>\r\n\t\t\t\t</select>\r\n              </td>\r\n              <td width=\"130\">\r\n\t\t\t\t<select id=\"DONG_CD\" name=\"DONG_CD\" class=\"formBox1\">\r\n\t\t\t\t\t<option value=\"%\">::동선택::</option>\r\n\t\t\t\t</select>\r\n              </td>\r\n              <td width=\"130\"><input id=\"BUNJI\" name=\"BUNJI\" type=\"text\" class=\"formBox1\" value=\"";
  private final static String _jspx_template20 = "\"/></td>\r\n              <td width=\"307\"><a href=\"#\" onclick=\"goSearch();\"><img src=\"/rams/images/common/btn_srch3.gif\" alt=\"검색\" width=\"44\" height=\"17\" border=\"0\" /></a></td>\r\n            </tr>\r\n          </table></td>\r\n\t\t  <td width=\"5\"><img src=\"/rams/images/suit/srch_bg3.gif\" alt=\".\"/></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</div>\r\n    <div class=\"list\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t      <td height=\"19\" align=\"right\" valign=\"top\"><a href=\"#\" onclick=\"goRegSuit();\"><img src=\"/rams/images/common/btn_enroll2.gif\" alt=\"신규등록\" border=\"0\" /></a></td>\r\n\t      <td align=\"right\" valign=\"top\" width=\"70\"><a href=\"#\" onclick=\"goRegAfterSuit();\"><img src=\"/rams/images/common/btn_enroll3.gif\" alt=\"상급심등록\" border=\"0\" /></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <h3><img src=\"/rams/images/suit/st_rst.gif\" alt=\"검색결과\" /></h3>\r\n\t  <br/>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t  \t  <tr>\r\n\t\t  \t  \t<th width=\"33\" rowspan=\"2\" scope=\"col\">선택</th>\r\n\t\t\t\t<th width=\"80\" rowspan=\"2\" scope=\"col\">사건번호</th>\r\n\t\t\t\t<th width=\"100\" rowspan=\"2\" scope=\"col\">사건명</th>\r\n\t\t\t\t<th width=\"120\" rowspan=\"2\" scope=\"col\">사건토지</th>\r\n\t\t\t\t<th width=\"80\" rowspan=\"2\" scope=\"col\">판결선고일자</th>\r\n\t\t\t\t<th width=\"100\" rowspan=\"2\" scope=\"col\">판결결과</th>\r\n\t\t\t\t<th width=\"300\" colspan=\"3\" scope=\"col\">상   급   정   보</th>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">법   원</th>\r\n\t\t\t\t<th width=\"80\" scope=\"col\">사건번호</th>\r\n\t\t\t\t<th width=\"100\" scope=\"col\">결   과</th>\r\n\t\t\t  </tr>\r\n\t\t\t\t";
  private final static String _jspx_template21 = "\r\n\t   \t\t\t";
  private final static String _jspx_template22 = "\r\n\t   \t\t\t";
  private final static String _jspx_template23 = "\r\n\t   \t\t\t<tr>\r\n\t   \t\t\t\t<td>\r\n\t\t\t\t  \t\t<INPUT TYPE=\"checkbox\" NAME=\"SELECT_ITEM\" onclick=\"checkItem(this);\">\r\n\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"AFFAIRNUM_ARR\" value=\"";
  private final static String _jspx_template24 = "\">\r\n\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"PNU_ARR\" value=\"";
  private final static String _jspx_template25 = "\"> \r\n\t   \t\t\t\t</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template26 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template27 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template28 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template29 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template30 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template31 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template32 = "</td>\r\n\t   \t\t\t\t<td>";
  private final static String _jspx_template33 = "</td>\r\n\t   \t\t\t</tr>\r\n\t   \t\t\t";
  private final static String _jspx_template34 = "\r\n\t   \t\t\t";
  private final static String _jspx_template35 = "\r\n\t   \t\t\t";
  private final static String _jspx_template36 = "\r\n\t   \t\t\t\t<tr>\r\n\t   \t\t\t\t<td colspan=\"10\" scope=\"col\">\r\n\t   \t\t\t\t\t검색결과가 없습니다.\r\n\t   \t\t\t\t</td>\r\n\t   \t\t\t\t</tr>\r\n\t   \t\t\t";
  private final static String _jspx_template37 = "\r\n\t   \t\t\t";
  private final static String _jspx_template38 = "\r\n\t\t\t</table>\r\n\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  \t\t<tr>\r\n\t\t<td height=\"30\" align=\"center\">\r\n\t  \t  \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template39 = "\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t</td>\r\n\t  \t</tr>\r\n\t\t<tr>\r\n\t      <td height=\"26\" align=\"right\" valign=\"bottom\"><a href=\"#\" onclick=\"goCancel();\"><img src=\"/rams/images/common/btn_cancel.gif\" alt=\"취소\" border=\"0\"/></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</div>\r\n  </div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
