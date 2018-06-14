package jeus_jspwork._jsp._suit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_suit_5fland_5fpop_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(89,15);to=(89,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template12);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template17);
      // jsp code [from=(205,63);to=(205,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(206,51);to=(206,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_2_fn(pageContext, null)) return;


      out.write(_jspx_template29);
      // jsp code [from=(249,87);to=(249,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LAWSUITAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(250,91);to=(250,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LAWSUITAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);

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
            out.write(_jspx_template8);
            // jsp code [from=(110,9);to=(110,21)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(111,31);to=(111,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(111,49);to=(111,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
            // jsp code [from=(116,9);to=(116,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jimokList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(117,31);to=(117,49)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jimokList.CODEDESC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(117,55);to=(117,74)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jimokList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);

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
    _jspx_th_c_forEach_2.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_2.setVar("blist");
    try {
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template20);
            // jsp code [from=(226,11);to=(226,26)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.LAND_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(227,11);to=(227,26)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.TOTALAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(228,11);to=(228,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.LAWSUITAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(229,11);to=(229,22)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.CATEG}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(230,11);to=(230,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.TOTAL_PRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(231,11);to=(231,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.REGISTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(232,106);to=(232,121)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(232,127);to=(232,136)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\n//구코드 변경\r\nfunction changeGuCode(){\r\n\tvar _guCode = getValueSelectTag(\"GU_CD\");\r\n\tvar param = \"&GU_CD=\"+_guCode;\r\n\tsendRequest(\"/rams/common/get_dong_list.do\", param, \"GET\", ResultChangeGuCode);\r\n}\r\n\r\n////////////////////////////////AJAX////////////////////////////////////////////\r\n\r\nfunction\tResultChangeGuCode(obj)\r\n{\r\n\tfncSelectBoxSetting(obj, \"DONG_CD\", \"\", \":동선택:\");\r\n}\r\n\r\nfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n{\r\n    var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n    var selectBoxLabel;\r\n    var root;\r\n    var selectBoxValue;\r\n    var opt \t= document.getElementById(selectBoxId);\r\n    var tags\t= \"\";\r\n    var\ttext\t= \"\";\r\n\r\n    for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n    {\r\n    \topt.options[i]\t= null;\r\n    }\r\n\r\n    xmldoc.async\t= false;\r\n\r\n\txmldoc.loadXML(strParam);\r\n\r\n\r\n\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n    if(root <= 0)\r\n    {\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(\"\");\r\n        tags.setAttribute(\"label\", \"\");\r\n        tags.appendChild(text);\r\n        tags.value = 0;\r\n        opt.appendChild(tags);\r\n        return;\r\n    }\r\n\r\n    if(topLabel != null && topLabel != \"\")\r\n\t{\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(topLabel);\r\n        tags.setAttribute(\"label\", topLabel);\r\n        tags.appendChild(text);\r\n        tags.value = '';\r\n        opt.appendChild(tags);\r\n    }\r\n\t\r\n    for(var i = 0; i < root; i++)\r\n    {\r\n    \t\r\n    \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n    \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n        tags \t= document.createElement(\"option\");\r\n   \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n        tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n        tags.value = selectBoxValue;\r\n        tags.appendChild(text);\r\n        opt.appendChild(tags);\r\n    }   \r\n}\r\n\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\nfunction initForm(){\r\n\tvar form = document.form;\r\n\t\r\n\tvar new_option;\r\n\t\r\n\tvar _GuCd = document.getElementById(\"GU_CD\");\r\n\tvar _categ = document.getElementById(\"CATEG\");\r\n\t\r\n\tvar value_GuCd;\r\n\tvar value_DongCd;\r\n\t\r\n\t";
  private final static String _jspx_template8 = "\r\n\t\tif('";
  private final static String _jspx_template9 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template10 = "','";
  private final static String _jspx_template11 = "');\r\n\t\t\t_GuCd.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template12 = "\r\n\t";
  private final static String _jspx_template13 = "\r\n\t\tif('";
  private final static String _jspx_template14 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template15 = "','";
  private final static String _jspx_template16 = "');\r\n\t\t\t_categ.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template17 = "\r\n}\r\n\r\nfunction goSave(){\r\n\t\r\n\tif(!confirm(\"저장하시겠습니까?\")){\r\n        return;\r\n    }\r\n\t\r\n\tvar\tresult\t= DataCheck();\r\n\tif(result\t==\tfalse)\r\n\t\treturn;\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_land_pop_add.do\";\r\n\tform.submit();\r\n}\r\n\r\nfunction goDelete(affairNum,pnu){\r\n\t\r\n\tif(!confirm(\"토지를 삭제할경우 관련 정보가 모두 삭제됩니다. 삭제하시겠습니까?\")){\r\n        return;\r\n    }\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_land_pop_del.do?DEL_AFFAIRNUM=\"+affairNum+\"&DEL_PNU=\"+pnu;\r\n\tform.submit();\r\n}\r\n\r\nfunction\tDataCheck()\r\n{\r\n    var form \t= document.form;\r\n    var\tstr\t\t= \"\";\r\n\t// 기본사항\r\n\t// 토지정보\r\n\tif(getValueSelectTag(\"DONG_CD\").length\t< 1)    \r\n    {\r\n        str\t+= \"법정동을 선택하세요\\n\";\r\n        alert(str);\r\n        form.DONG_CD.focus();\r\n    }\r\n    else if(form.BONBUN.value.length\t< 1)\r\n    {\r\n        str\t+= \"본번을 입력하세요\\n\";\r\n        alert(str);\r\n        form.BONBUN.focus();\r\n    }\r\n    else if(form.BUBUN.value.length\t< 1)\r\n    {\r\n        str\t+= \"부번을 입력하세요\\n\";\r\n        alert(str);\r\n        form.BUBUN.focus();\r\n    }\r\n    else if(form.TOTALAREA.value.length\t< 1)\r\n    {\r\n        str\t+= \"총면적을 입력하세요\\n\";\r\n        alert(str);\r\n        form.TOTALAREA.focus();\r\n    }\r\n    else if(form.LAWSUITAREA.value.length\t< 1)\r\n    {\r\n        str\t+= \"사건면적을 입력하세요\\n\";\r\n        alert(str);\r\n        form.LAWSUITAREA.focus();\r\n    }\r\n    else if(getValueSelectTag(\"CATEG\").length\t< 1)    \r\n    {\r\n        str\t+= \"지목을 선택하세요\\n\";\r\n        alert(str);\r\n        form.CATEG.focus();\r\n    }\r\n\t\r\n    if(str\t== \"\")\r\n    {\r\n        return\ttrue;\r\n    }\r\n\r\n    return\tfalse;\r\n}\r\n\r\n\r\n</script>\r\n</head>\r\n<body onload=\"init();initForm();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"AFFAIRNUM\" name=\"AFFAIRNUM\" value=\"";
  private final static String _jspx_template18 = "\"></input>\r\n<input type=\"hidden\" id=\"PNU\" name=\"PNU\" value=\"";
  private final static String _jspx_template19 = "\"></input>\r\n<div id=\"cont02\">\r\n\t  <h3><img src=\"/rams/images/suit/st_srch.gif\" alt=\"대상 토지 목록 조회\"/></h3>\r\n\t  <!-- 기본사항 -->\r\n\t  <table width=\"815\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"810\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"300\" scope=\"col\">주\t\t\t소</th>\r\n\t\t\t\t<th width=\"90\" scope=\"col\">전체면적</th>\r\n\t\t\t\t<th width=\"90\" scope=\"col\">사건면적</th>\r\n\t\t\t\t<th width=\"90\" scope=\"col\">지  목</th>\r\n\t\t\t\t<th width=\"90\" scope=\"col\">총금액</th>\r\n\t\t\t\t<th width=\"80\" scope=\"col\">등록일자</th>\r\n\t\t\t\t<th width=\"70\" scope=\"col\">저장/삭제</th>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  ";
  private final static String _jspx_template20 = "\r\n\t\t\t  <tr>\r\n\t\t\t\t<td>";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template24 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template25 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t\t<td><img src=\"/rams/images/common/btn_del3.gif\" alt=\"삭제\" width=\"62\" height=\"19\" onclick=\"goDelete('";
  private final static String _jspx_template27 = "','";
  private final static String _jspx_template28 = "');\" style=\"cursor:pointer;\" /></td>\r\n\t\t\t  </tr>\r\n\t   \t\t  ";
  private final static String _jspx_template29 = "\r\n\t   \t\t  \t<tr>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<select id=\"GU_CD\" name=\"GU_CD\" class=\"formBox2\" onchange=\"changeGuCode();\">\r\n\t\t\t\t\t\t\t<option value=\"%\">:자치구:</option>\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t&nbsp;\r\n\t\t\t\t\t\t<select id=\"DONG_CD\" name=\"DONG_CD\" class=\"formBox2\">\r\n\t\t\t\t\t\t\t<option value=\"%\">:법정동:</option>\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t\t&nbsp;\r\n\t\t\t\t\t\t<input id=\"BONBUN\" name=\"BONBUN\" type=\"text\" class=\"formBox9\" maxlength=\"4\"/>\r\n\t\t\t\t\t\t&nbsp;-&nbsp;\r\n\t\t\t\t\t\t<input id=\"BUBUN\" name=\"BUBUN\" type=\"text\" class=\"formBox9\" maxlength=\"4\"/>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td><input id=\"TOTALAREA\" name=\"TOTALAREA\" type=\"text\" class=\"formBox7\" value=\"";
  private final static String _jspx_template30 = "\" style=\"text-align:center;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"13\" /></td>\r\n\t\t\t\t\t<td><input id=\"LAWSUITAREA\" name=\"LAWSUITAREA\" type=\"text\" class=\"formBox7\" value=\"";
  private final static String _jspx_template31 = "\" style=\"text-align:center;\" onKeyDown=\"onlyNumberInput();\" maxlength=\"13\" /></td>\r\n\t\t\t\t\t<td>\r\n\t\t\t\t\t\t<select id=\"CATEG\" name=\"CATEG\" class=\"formBox7\">\r\n\t\t\t\t\t\t\t<option value=\"%\">:지목:</option>\r\n\t\t\t\t\t\t</select>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t\t<td><input id=\"TOTAL_PRICE\" name=\"TOTAL_PRICE\" type=\"text\" class=\"formBox7\" value=\"\" onKeyDown=\"onlyNumberInput();\" onKeyDown=\"onlyNumberInput();\" maxlength=\"13\" style=\"text-align:center;\" /></td>\r\n\t\t\t\t\t<td></td>\r\n\t\t\t\t\t<td><img src=\"/rams/images/common/btn_save.gif\" alt=\"저장\" width=\"62\" height=\"19\" border=\"0\" style=\"cursor:pointer;\" onclick=\"goSave();\"/></td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"810\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td width=\"70\" height=\"30\" align=\"right\"><a href=\"#\" onclick=\"window.close();\"><img src=\"/rams/images/common/btn_close3.gif\" alt=\"취소\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
