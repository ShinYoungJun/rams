package jeus_jspwork._jsp._suit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_suit_5fmodify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(147,63);to=(147,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(148,51);to=(148,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(192,82);to=(192,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.CONSTNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(207,8);to=(207,22)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(210,101);to=(210,116)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(214,97);to=(214,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.JUDGMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(216,91);to=(216,101)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.COURT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(223,102);to=(223,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ACCEPTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(232,98);to=(232,111)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.CLOSEDAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(252,8);to=(252,21)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.SUITLAND}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(258,118);to=(258,134)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LAWSUITAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(259,115);to=(259,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.TOTALAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(280,109);to=(280,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST2_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(283,125);to=(283,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST2_JUMINNUM_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(285,125);to=(285,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST2_JUMINNUM_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(290,135);to=(290,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST2_ADMINSTNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(294,109);to=(294,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST2_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(296,95);to=(296,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST2_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(311,109);to=(311,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP2_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(314,125);to=(314,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP2_JUMINNUM_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(316,125);to=(316,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP2_JUMINNUM_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(321,109);to=(321,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP2_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(323,126);to=(323,138)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP2_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(336,109);to=(336,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP1_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(339,125);to=(339,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP1_JUMINNUM_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(341,125);to=(341,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP1_JUMINNUM_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(346,109);to=(346,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP1_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(348,126);to=(348,138)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP1_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(363,109);to=(363,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST1_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(366,125);to=(366,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST1_JUMINNUM_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // jsp code [from=(368,125);to=(368,144)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST1_JUMINNUM_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);
      // jsp code [from=(373,135);to=(373,155)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST1_ADMINSTNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template50);
      // jsp code [from=(377,109);to=(377,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST1_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template51);
      // jsp code [from=(379,126);to=(379,138)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST1_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template52);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitGubunList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("suitGubunList");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template7);
            // jsp code [from=(23,9);to=(23,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitGubunList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);
            // jsp code [from=(24,31);to=(24,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitGubunList.CODEDESC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(24,59);to=(24,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitGubunList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(25,30);to=(25,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.CALSS}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jimokList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("jimokList");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template13);
            // jsp code [from=(35,8);to=(35,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jimokList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(36,30);to=(36,48)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jimokList.CODEDESC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(36,54);to=(36,73)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jimokList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(37,29);to=(37,39)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.CATEG}",java.lang.String.class , pageContext.getVariableResolver(), null));

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

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\n\r\nfunction initSearchForm(){\r\n\tvar form = document.form;\r\n\t\r\n\tvar new_option;\r\n\t\r\n\tvar calss = document.getElementById(\"CALSS\");\r\n\t\r\n\t";
  private final static String _jspx_template7 = "\r\n\t\tif('";
  private final static String _jspx_template8 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template9 = "','";
  private final static String _jspx_template10 = "');\r\n\t\t\tif(new_option.value == '";
  private final static String _jspx_template11 = "'){\r\n\t\t\t\tnew_option.selected = true;\r\n\t\t\t}\r\n\t\t\tcalss.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template12 = "\r\n\t\r\n\t\r\n\tvar categ = document.getElementById(\"CATEG\");\r\n\t";
  private final static String _jspx_template13 = "\r\n\tif('";
  private final static String _jspx_template14 = "' != ''){\r\n\t\tnew_option = new Option('";
  private final static String _jspx_template15 = "','";
  private final static String _jspx_template16 = "');\r\n\t\tif(new_option.value == '";
  private final static String _jspx_template17 = "'){\r\n\t\t\tnew_option.selected = true;\r\n\t\t}\r\n\t\tcateg.options.add(new_option);\r\n\t}\r\n";
  private final static String _jspx_template18 = "\r\n\t\r\n\t\r\n}\r\n\r\n\r\nfunction goSave(){\r\n\t\r\n\tvar\tresult\t= DataCheck();\r\n\r\n\tif(result\t==\tfalse)\r\n\t\treturn;\r\n\t\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_modify_prc.do\";\r\n\tform.submit();\r\n\t\r\n}\r\n\r\nfunction\tDataCheck()\r\n{\r\n    var form \t= document.form;\r\n    var\tstr\t\t= \"\";\r\n\t// 기본사항\r\n    if(getValueSelectTag(\"CALSS\").length\t< 1)    \r\n    {\r\n        str\t+= \"구분을 선택 하세요\\n\";\r\n        alert(str);\r\n        form.CALSS.focus();\r\n    }\r\n    else if(form.AFFAIRNAME.value.length\t< 1)\r\n    {\r\n        str\t+= \"사건명을 입력하세요\\n\";\r\n        alert(str);\r\n        form.AFFAIRNAME.focus();\r\n    }\r\n    else if(form.JUDGMENT.value.length\t< 1)\r\n    {\r\n        str\t+= \"담당재판부를 입력하세요\\n\";\r\n        alert(str);\r\n        form.JUDGMENT.focus();\r\n    }\r\n    else if(form.COURT.value.length\t< 1)\r\n    {\r\n        str\t+= \"법원명을 선택하세요\\n\";\r\n        alert(str);\r\n        form.COURT.focus();\r\n    }\r\n    else if(form.ACCEPTDATE.value.length\t< 1)\r\n    {\r\n        str\t+= \"접수일자를 선택하세요\\n\";\r\n        alert(str);\r\n        form.ACCEPTDATE.focus();\r\n    }\r\n    else if(form.CLOSEDAY.value.length\t< 1)\r\n    {\r\n        str\t+= \"변경 종료일자를 선택하세요\\n\";\r\n        alert(str);\r\n        form.CLOSEDAY.focus();\r\n    }\r\n\t// 토지정보\r\n    else if(form.TOTALAREA.value.length\t< 1)\r\n    {\r\n        str\t+= \"총면적을 입력하세요\\n\";\r\n        alert(str);\r\n        form.TOTALAREA.focus();\r\n    }\r\n    else if(form.LAWSUITAREA.value.length\t< 1)\r\n    {\r\n        str\t+= \"사건면적을 입력하세요\\n\";\r\n        alert(str);\r\n        form.LAWSUITAREA.focus();\r\n    }\r\n    else if(getValueSelectTag(\"CATEG\").length\t< 1)    \r\n    {\r\n        str\t+= \"지목을 선택하세요\\n\";\r\n        alert(str);\r\n        form.CATEG.focus();\r\n    }\r\n\r\n    if(str\t== \"\")\r\n    {\r\n        return\ttrue;\r\n    }\r\n\r\n    return\tfalse;\r\n}\r\n\r\nfunction goCancel(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_view.do?AFFAIRNUM=\"+form.AFFAIRNUM.value+\"&PNU=\"+form.PNU.value;\r\n\tform.submit();\r\n}\r\n\r\nfunction goGongsaPop(){\r\n\tpopWindow('/rams/reward/pop_reward_gongsa.do','gonsaPop','800','500','no','no');\r\n}\r\n\r\n\r\n</script>\r\n</head>\r\n\r\n<body onload=\"initSearchForm();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<input id=\"AFFAIRNUM\" name=\"AFFAIRNUM\" type=\"hidden\" value=\"";
  private final static String _jspx_template19 = "\"></input>\r\n<input id=\"PNU\" name=\"PNU\" type=\"hidden\" value=\"";
  private final static String _jspx_template20 = "\"></input>\r\n\r\n<div id=\"cont01\">\r\n<!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > <a href=\"#\" class=\"blue1\">소송정보관리</a> > <strong>소송정보</strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n<!-- 탭 메뉴 -->\r\n  <div>\r\n    <h2><img src=\"/rams/images/suit/tt01.gif\" alt=\"소송정보관리_소송정보\" width=\"160\" height=\"22\" /></h2>\t\r\n\t<div>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><img src=\"/rams/images/suit/02tab01_on.gif\" alt=\"소송정보\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/suit/suit_price_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image13','','/rams/images/suit/02tab02_on.gif',1)\"><img src=\"/rams/images/suit/02tab02_off.gif\" alt=\"소가관리\" name=\"Image13\" border=\"0\" id=\"Image13\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/suit/suit_anal_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image14','','/rams/images/suit/02tab03_on.gif',1)\"><img src=\"/rams/images/suit/02tab03_off.gif\" alt=\"통계\" name=\"Image14\" border=\"0\" id=\"Image14\" /></a></td>\r\n          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t<div>\r\n\t  <h3><img src=\"/rams/images/suit/st_suit.gif\" alt=\"소송정보\" /></h3>\r\n\t  <h4><img src=\"/rams/images/suit/st_basis.gif\" alt=\"기본사항\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">구분</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\">\r\n\t\t\t\t\t<select id=\"CALSS\" name=\"CALSS\" class=\"formBox4\">\r\n\t\t\t\t\t\t<option value=\"\">::선택::</option>\r\n\t\t\t\t\t</select>\r\n\t\t\t\t</td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">공사번호</th>\r\n\t\t\t\t<td align=\"left\">\r\n\t\t\t\t<table width=\"100%\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t<td width=\"225\">\r\n\t\t\t\t\t<input id=\"CONSTNUM\" name=\"CONSTNUM\" type=\"text\" class=\"formBox4\"  value=\"";
  private final static String _jspx_template21 = "\" readonly=\"readonly\"/>\r\n\t\t\t\t\t<input id=\"CONSTNAME\" name=\"CONSTNAME\" type=\"hidden\" />\r\n\t\t\t\t\t<input id=\"GOSIID\" name=\"GOSIID\" type=\"hidden\" />\r\n\t\t\t\t\t<input id=\"COMPEID\" name=\"COMPEID\" type=\"hidden\" />\r\n\t\t\t\t</td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<a href=\"#\" onclick=\"goGongsaPop();\"><img src=\"/rams/images/common/btn_srch5.gif\" alt=\"검색\" width=\"42\" height=\"19\" border=\"0\" /></a>\r\n\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">사건번호</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t";
  private final static String _jspx_template22 = "\r\n\t\t\t\t</td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">사건 명 </th>\r\n\t\t\t\t<td class=\"cont\"><input type=\"text\" id=\"AFFAIRNAME\" name=\"AFFAIRNAME\" class=\"formBox4\" value=\"";
  private final static String _jspx_template23 = "\" maxlength=\"25\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"row\">담당재판부</th>\r\n\t\t\t\t<td class=\"cont\"><input type=\"text\" id=\"JUDGMENT\" name=\"JUDGMENT\" class=\"formBox4\" value=\"";
  private final static String _jspx_template24 = "\" maxlength=\"15\" /></td>\r\n\t\t\t\t<th scope=\"row\">법원 명 </th>\r\n\t\t\t\t<td class=\"cont\"><input type=\"text\" id=\"COURT\" name=\"COURT\" class=\"formBox4\" value=\"";
  private final static String _jspx_template25 = "\" maxlength=\"25\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"row\">접수일자</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<table width=\"190\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"152\"><input id=\"ACCEPTDATE\" name=\"ACCEPTDATE\" type=\"text\" class=\"formBox3\" value=\"";
  private final static String _jspx_template26 = "\" readonly=\"readonly\" /></td>\r\n\t\t\t\t\t\t<td><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" onclick=\"popUpCalendar(this,ACCEPTDATE,'yyyymmdd')\" style=\"cursor:pointer;\"/></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<th scope=\"row\">변론종결일자</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<table width=\"190\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"152\"><input id=\"CLOSEDAY\" name=\"CLOSEDAY\" type=\"text\" class=\"formBox3\" value=\"";
  private final static String _jspx_template27 = "\" readonly=\"readonly\" /></td>\r\n\t\t\t\t\t\t<td><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" onclick=\"popUpCalendar(this,CLOSEDAY,'yyyymmdd')\" style=\"cursor:pointer;\"/></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t\t\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <h4><img src=\"/rams/images/suit/st_ground.gif\" alt=\"토지정보\" width=\"60\" height=\"11\" /></h4>\r\n\t  <!-- 토지 --> \r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">사건 토지 </th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">\r\n\t\t\t\t\t";
  private final static String _jspx_template28 = "\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">사건면적/총면적</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\">\r\n\t\t\t\t\t<input id=\"LAWSUITAREA\" name=\"LAWSUITAREA\" type=\"text\" class=\"formBox2\" onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template29 = "\" maxlength=\"13\" />&nbsp;/&nbsp;\r\n\t\t\t\t\t<input id=\"TOTALAREA\" name=\"TOTALAREA\" type=\"text\" class=\"formBox2\"  onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template30 = "\" maxlength=\"13\" />&nbsp;㎡</td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">지목</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<select id=\"CATEG\" name=\"CATEG\" class=\"formBox2\">\r\n\t\t\t\t\t\t<option value=\"\">::선택::</option>\r\n\t\t\t\t\t</select>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t<!-- 피고 -->  \r\n\t<h4><img src=\"/rams/images/suit/st_defendant.gif\" alt=\"피고\" width=\"41\" height=\"11\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">피고명</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\"><input type=\"text\" id=\"ST2_NAME\" name=\"ST2_NAME\" class=\"formBox4\" value=\"";
  private final static String _jspx_template31 = "\" maxlength=\"25\" /></td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">주민번호</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<input id=\"ST2_JUMINNUM_1\" name=\"ST2_JUMINNUM_1\" type=\"text\" class=\"formBox7\"  onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template32 = "\" maxlength=\"6\" />\r\n\t\t\t\t\t&nbsp;-&nbsp;\r\n\t\t\t\t\t<input id=\"ST2_JUMINNUM_2\" name=\"ST2_JUMINNUM_2\" type=\"text\" class=\"formBox7\"  onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template33 = "\" maxlength=\"7\" />\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">기관명</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\" colspan=\"3\"><input type=\"text\" id=\"ST2_ADMINSTNAME\" name=\"ST2_ADMINSTNAME\" class=\"formBox4\" value=\"";
  private final static String _jspx_template34 = "\"  maxlength=\"9\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">주소</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\"><input type=\"text\" id=\"ST2_ADDR\" name=\"ST2_ADDR\" class=\"formBox4\" value=\"";
  private final static String _jspx_template35 = "\" maxlength=\"50\" /></td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">연락처</th>\r\n\t\t\t\t<td class=\"cont\"><input id=\"ST2_TEL\" name=\"ST2_TEL\" type=\"text\" class=\"formBox1\" value=\"";
  private final static String _jspx_template36 = "\" onKeyDown=\"onlyNumberInput();\" maxlength=\"20\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <!-- 대리 -->  \r\n\t  <h4><img src=\"/rams/images/suit/st_deputy.gif\" alt=\"대리\" width=\"41\" height=\"11\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">피고명</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\"><input type=\"text\" id=\"LP2_NAME\" name=\"LP2_NAME\" class=\"formBox4\" value=\"";
  private final static String _jspx_template37 = "\" maxlength=\"25\" /></td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">주민번호</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<input id=\"LP2_JUMINNUM_1\" name=\"LP2_JUMINNUM_1\" type=\"text\" class=\"formBox7\"  onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template38 = "\" maxlength=\"6\" />\r\n\t\t\t\t\t&nbsp;-&nbsp;\r\n\t\t\t\t\t<input id=\"LP2_JUMINNUM_2\" name=\"LP2_JUMINNUM_2\" type=\"text\" class=\"formBox7\"  onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template39 = "\" maxlength=\"7\" />\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">주소</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\"><input type=\"text\" id=\"LP2_ADDR\" name=\"LP2_ADDR\" class=\"formBox4\" value=\"";
  private final static String _jspx_template40 = "\" maxlength=\"50\" /></td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">연락처</th>\r\n\t\t\t\t<td class=\"cont\"><input id=\"LP2_TEL\" name=\"LP2_TEL\" type=\"text\" onKeyDown=\"onlyNumberInput();\" class=\"formBox4\" value=\"";
  private final static String _jspx_template41 = "\" maxlength=\"20\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <br/><br/>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">원고명</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\"><input type=\"text\" id=\"LP1_NAME\" name=\"LP1_NAME\" class=\"formBox4\" value=\"";
  private final static String _jspx_template42 = "\" maxlength=\"25\" /></td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">주민번호</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<input id=\"LP1_JUMINNUM_1\" name=\"LP1_JUMINNUM_1\" type=\"text\" class=\"formBox7\"  onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template43 = "\" maxlength=\"6\" />\r\n\t\t\t\t\t&nbsp;-&nbsp;\r\n\t\t\t\t\t<input id=\"LP1_JUMINNUM_2\" name=\"LP1_JUMINNUM_2\" type=\"text\" class=\"formBox7\"  onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template44 = "\" maxlength=\"7\" />\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">주소</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\"><input type=\"text\" id=\"LP1_ADDR\" name=\"LP1_ADDR\" class=\"formBox4\" value=\"";
  private final static String _jspx_template45 = "\" maxlength=\"50\" /></td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">연락처</th>\r\n\t\t\t\t<td class=\"cont\"><input id=\"LP1_TEL\" name=\"LP1_TEL\" type=\"text\" onKeyDown=\"onlyNumberInput();\" class=\"formBox4\" value=\"";
  private final static String _jspx_template46 = "\" maxlength=\"20\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <!-- 원고 -->  \r\n\t  <h4><img src=\"/rams/images/suit/st_plaintiff.gif\" alt=\"원고\" width=\"41\" height=\"11\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">원고명</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\"><input type=\"text\" id=\"ST1_NAME\" name=\"ST1_NAME\" class=\"formBox4\" value=\"";
  private final static String _jspx_template47 = "\"  maxlength=\"25\" /></td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">주민번호</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<input id=\"ST1_JUMINNUM_1\" name=\"ST1_JUMINNUM_1\" type=\"text\" class=\"formBox7\"  onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template48 = "\" maxlength=\"6\" />\r\n\t\t\t\t\t&nbsp;-&nbsp;\r\n\t\t\t\t\t<input id=\"ST1_JUMINNUM_2\" name=\"ST1_JUMINNUM_2\" type=\"text\" class=\"formBox7\"  onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template49 = "\" maxlength=\"7\" />\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">기관명</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\" colspan=\"3\"><input type=\"text\" id=\"ST1_ADMINSTNAME\" name=\"ST1_ADMINSTNAME\" class=\"formBox4\" value=\"";
  private final static String _jspx_template50 = "\" maxlength=\"10\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">주소</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\"><input type=\"text\" id=\"ST1_ADDR\" name=\"ST1_ADDR\" class=\"formBox4\" value=\"";
  private final static String _jspx_template51 = "\" maxlength=\"50\" /></td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">연락처</th>\r\n\t\t\t\t<td class=\"cont\"><input id=\"ST1_TEL\" name=\"ST1_TEL\" type=\"text\" class=\"formBox1\" onKeyDown=\"onlyNumberInput();\" value=\"";
  private final static String _jspx_template52 = "\" maxlength=\"20\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <!-- 페이징 및 버튼 --> \r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td height=\"26\" align=\"right\" valign=\"bottom\"><a href=\"#\" onclick=\"goSave();\"><img src=\"/rams/images/common/btn_modify.gif\" alt=\"수정\" border=\"0\"/></a></td>\r\n\t      <td width=\"70\" align=\"right\" valign=\"bottom\"><a href=\"#\" onclick=\"goCancel();\"><img src=\"/rams/images/common/btn_cancel.gif\" alt=\"취소\" border=\"0\"/></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</div>\r\n  </div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>";
}
