package jeus_jspwork._jsp._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_leftunrewarddetail_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return null;
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
      // jsp code [from=(155,79);to=(155,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template2);
      // jsp code [from=(174,15);to=(174,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(193,15);to=(193,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template12);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template21);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_2_fn(pageContext, null)) return;


      out.write(_jspx_template30);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_3_fn(pageContext, null)) return;


      out.write(_jspx_template38);
      // jsp code [from=(410,43);to=(410,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.JIBUN }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(414,29);to=(414,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.JIGA }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(418,29);to=(418,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AREA }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(422,29);to=(422,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.DONGCODE }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(426,29);to=(426,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.CODEDESC }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(446,59);to=(446,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gosiCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(463,59);to=(463,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${planCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(478,59);to=(478,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AffairCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(492,59);to=(492,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AffairList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("suit");
    _jspx_th_c_forEach_0.setVarStatus("count");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template5);
            // jsp code [from=(265,33);to=(265,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template6);
            // jsp code [from=(265,79);to=(265,94)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suit.AFFAIRNUM }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template7);
            // jsp code [from=(265,137);to=(265,148)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);
            // jsp code [from=(265,192);to=(265,203)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(266,20);to=(266,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suit.AFFAIRNUM }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(267,32);to=(267,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suit.AFFAIRNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gosiList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("gosi");
    _jspx_th_c_forEach_1.setVarStatus("count");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template13);
            // jsp code [from=(297,32);to=(297,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(297,81);to=(297,92)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gosi.GOSIID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(297,135);to=(297,146)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(297,190);to=(297,201)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);
            // jsp code [from=(298,19);to=(298,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gosi.NUM }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(299,31);to=(299,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gosi.SUBJECT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(300,19);to=(300,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${gosi.ORG}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);

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
    _jspx_th_c_forEach_2.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${planList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_2.setVar("plan");
    _jspx_th_c_forEach_2.setVarStatus("count1");
    try {
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template22);
            // jsp code [from=(331,31);to=(331,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count1.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(331,81);to=(331,92)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${plan.GOSIID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(331,135);to=(331,147)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count1.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(331,191);to=(331,203)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count1.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(332,19);to=(332,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${plan.NUM }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(333,31);to=(333,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${plan.SUBJECT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(334,19);to=(334,27)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${plan.ORG}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);

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
    _jspx_th_c_forEach_3.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_3.setVar("comp");
    _jspx_th_c_forEach_3.setVarStatus("count1");
    try {
      try {
        int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
        if (_jspx_eval_c_forEach_3 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template31);
            // jsp code [from=(360,32);to=(360,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count1.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(360,81);to=(360,93)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${comp.COMPEID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);
            // jsp code [from=(360,136);to=(360,148)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count1.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template34);
            // jsp code [from=(360,192);to=(360,204)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${count1.index}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template35);
            // jsp code [from=(361,32);to=(361,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${comp.COMPEID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template36);
            // jsp code [from=(362,32);to=(362,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${comp.REQDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template37);

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
  private final static String _jspx_template1 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>무제 문서</title>\r\n<link href=\"/rams/css/doro.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<style type=\"text/css\">\r\n.box777 {\r\n\tbackground-color:#ffffff;\r\n\tborder: 1px #d3e2ea solid;\r\n\tcolor: #9a9a9a;\r\n\t}\r\n\t\r\n.style1 {color: #FFFFFF}\r\n.style2 {\r\n\tcolor: #FFFF00;\r\n\tfont-weight: bold;\r\n}\r\n\r\n</style>\r\n\r\n<script language=\"javascript\">\r\n\r\n\r\n//ajax\r\nfunction getXMLHTTPRequest()\r\n{\r\n\tvar xRequest = null;\r\n\txRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n\treturn xRequest;\r\n}\r\n\r\nvar req;\r\nvar\tcall;\r\n\r\nfunction sendRequest(url, params, HttpMethod, callback)\r\n{\r\n\treq = getXMLHTTPRequest();\r\n\r\n\tcall\t= callback;\r\n\tif(req){\r\n\t\treq.onreadystatechange = onReadyStateChange;\r\n\t\treq.open(HttpMethod, url, true);\r\n\t\treq.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=UTF-8\");\r\n\t\treq.send(params);\r\n\t}\r\n}\r\n\r\nfunction onReadyStateChange()\r\n{\r\n\tvar ready = req.readyState;\r\n\tvar data = null;\r\n\tif(ready == 4){\r\n\t\tif(this.call\t!= null)\r\n\t\t\tthis.call(req.responseText);\r\n\t}\r\n}\r\n\r\nfunction getValueSelectTag(target){\r\n\tvar obj = document.getElementById(target).options;\r\n\r\n\tfor(var i = 0 ; i < obj.length ; i++){\r\n\t\tif(obj[i].selected == true){\r\n\t\t\treturn obj[i].value;\r\n\t\t} \r\n\t}\r\n}\r\n\r\n//ajax 끝\r\n\r\nfunction changeGuCode(){\r\n\tvar _guCode = getValueSelectTag(\"selectGu\");\r\n\talert(\"gu : \"+_guCode);\r\n\tvar param = \"&GU_CD=\"+_guCode;\r\n\tsendRequest(\"/rams/map/get_dong_list.do\", param, \"GET\", ResultChangeGuCode);\r\n}\r\n\r\nfunction\tResultChangeGuCode(obj)\r\n{\r\n\t\r\n\tfncSelectBoxSetting(obj, \"selectDong\", \"\", \"동선택\");\r\n}\r\n\r\nfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n{\r\n    var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n    var selectBoxLabel;\r\n    var root;\r\n    var selectBoxValue;\r\n    var opt \t= document.getElementById(selectBoxId);\r\n    var tags\t= \"\";\r\n    var\ttext\t= \"\";\r\n\r\n    for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n    {\r\n    \topt.options[i]\t= null;\r\n    }\r\n\r\n    xmldoc.async\t= false;\r\n\r\n\txmldoc.loadXML(strParam);\r\n\r\n\r\n\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n    if(root <= 0)\r\n    {\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(\"\");\r\n        tags.setAttribute(\"label\", \"\");\r\n        tags.appendChild(text);\r\n        tags.value = 0;\r\n        opt.appendChild(tags);\r\n        return;\r\n    }\r\n\r\n    if(topLabel != null && topLabel != \"\")\r\n\t{\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(topLabel);\r\n        tags.setAttribute(\"label\", topLabel);\r\n        tags.appendChild(text);\r\n        tags.value = '';\r\n        opt.appendChild(tags);\r\n    }\r\n\t\r\n    for(var i = 0; i < root; i++)\r\n    {\r\n    \t\r\n    \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n    \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n        tags \t= document.createElement(\"option\");\r\n   \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n        tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n        tags.value = selectBoxValue;\r\n        tags.appendChild(text);\r\n        opt.appendChild(tags);\r\n    }   \r\n}\r\n\r\nfunction goLand(){\r\n\r\n\t\r\n    var cw=screen.availWidth; // 화면 너비\r\n\tvar ch=screen.availHeight; // 화면 높이\r\n\r\n\tvar name = 'http://land.seoul.go.kr/land/jsp/ginfo/GeneralInfo.jsp?_landCd=";
  private final static String _jspx_template2 = "';\r\n\tvar sw=800;// 띄울 창의 너비\r\n\tvar sh=600;// 띄울 창의 높이\r\n\r\n\tvar ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치\r\n\tvar mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치\r\n\t\r\n\r\n\t window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=yes,menubar=no,status=no ,directories=no,');\r\n\r\n\t \r\n}\r\n\r\n\r\n\r\nfunction goRewardDet(compeid){\r\n\r\n\r\n\t\r\n\tvar pnu = '";
  private final static String _jspx_template3 = "';\r\n\t\r\n    var cw=screen.availWidth; // 화면 너비\r\n\tvar ch=screen.availHeight; // 화면 높이\r\n\r\n\tvar name = '/rams/reward/reward_view.do?COMPEID='+compeid+'&PNU='+pnu;\r\n\tvar sw=950;// 띄울 창의 너비\r\n\tvar sh=700;// 띄울 창의 높이\r\n\r\n\tvar ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치\r\n\tvar mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치\r\n\r\n\t window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=yes,menubar=no,status=no ,directories=no,');\r\n\t\r\n}\r\n\r\n\r\nfunction goSuitDet(affairnum){\r\n\t\r\n\tvar pnu = '";
  private final static String _jspx_template4 = "';\r\n\t\r\n    var cw=screen.availWidth; // 화면 너비\r\n\tvar ch=screen.availHeight; // 화면 높이\r\n\r\n\tvar name = '/rams/map/gosuitview.do?PNU='+pnu+\"&AFFAIRNUM=\"+affairnum;\r\n\t\r\n\tvar sw=950;// 띄울 창의 너비\r\n\tvar sh=800;// 띄울 창의 높이\r\n\r\n\tvar ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치\r\n\tvar mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치\r\n\r\n\t window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=yes,menubar=no,status=no ,directories=no,');\r\n\t\r\n}\r\n\t\t\r\n\r\n\r\nfunction goDetailView(GOSIID){\r\n\r\n    var cw=screen.availWidth; // 화면 너비\r\n\tvar ch=screen.availHeight; // 화면 높이\r\n\r\n\tvar name = '/rams/map/juckjianalysisdetailview.do?GOSIID='+GOSIID;\r\n\tvar sw=850;// 띄울 창의 너비\r\n\tvar sh=680;// 띄울 창의 높이\r\n\r\n\tvar ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치\r\n\tvar mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치\r\n\r\n\t window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=yes,menubar=no,status=no ,directories=no,')\r\n\t\r\n}\r\n\r\nfunction goList(){\r\n\r\n\r\n\tparent.document.getElementById('searchResult').style.visibility = \"hidden\";\r\n\tparent.document.getElementById('unrewardDiv').style.display = \"block\";\r\n\tparent.document.getElementById('unrewardDiv').style.zIndex = \"10\";\r\n}\r\n\r\nfunction changeNextColor(obj){\r\n\r\n\t\r\n\t//alert(obj);\r\n\tdocument.getElementById(obj).style.backgroundColor = '#dddddd';\r\n}\r\n\r\nfunction changePrevColor(obj){\r\n\r\n\t//alert(obj);\r\n\tdocument.getElementById(obj).style.backgroundColor = '#ffffff';\r\n\t\r\n}\r\n\r\nfunction openDoor(category){\r\n\r\n\t\r\n\tif(category == \"suit\"){\r\n\t\t\t\tif(document.getElementById(\"suit\").height=='1'){\r\n\r\n\t\t\t\t\t//div안에 내용이 있으면 높이에 상관없이 내용이 다 출력됨\r\n\t\t\t\t\tdocument.getElementById(\"suit\").height= 2;\t\r\n\t\t\t\t\t\r\n\t\t\t\t\tvar a =\t\"<table>\";\r\n\t\t\t\t  \ta+=\"\t\t<tr bgcolor='yellow'>                     \";\r\n\t\t\t\t  \ta+=\"\t\t\t<td>공고번호</td>                      \";\r\n\t\t\t\t  \ta+=\"\t\t\t<td>고시제목</td>                      \";\t\t\t\t  \t\r\n\t\t\t\t  \ta+=\"\t\t</tr>                                     \";\r\n\t\t\t\t  \t\t";
  private final static String _jspx_template5 = " \r\n\t\t\t\t  \ta+=\"\t\t<tr id='gosiTable";
  private final static String _jspx_template6 = "' onclick=javascript:goSuitDet('";
  private final static String _jspx_template7 = "') onmouseout=changePrevColor('gosiTable";
  private final static String _jspx_template8 = "') onmouseover=changeNextColor('gosiTable";
  private final static String _jspx_template9 = "') style='cursor:hand;'> \";\r\n\t\t\t  \t\ta+=\"\t\t<td>";
  private final static String _jspx_template10 = "</td>                     \";\r\n\t\t\t  \t\ta+=\"\t\t<td width='150'>";
  private final static String _jspx_template11 = "</td>      \";\t\t\t  \t\t\r\n\t\t\t\t  \ta+=\"\t\t</tr>                                     \";\r\n\r\n\t\t\t\t\t\t";
  private final static String _jspx_template12 = "                                  \r\n\t\t\t\t  \t\r\n\t\t\t\t  \ta+=\"\t</table>                                      \";\r\n\r\n\t\t\t\t\tdocument.getElementById('suitDiv').innerHTML = a;\r\n\t\t\t\t\t\r\n\t\t\t\t}else{\r\n\t\t\t\t\t\r\n\t\t\t\t\tdocument.getElementById('suitDiv').innerHTML = '';\r\n\t\t\t\t\tdocument.getElementById(\"suit\").height= 1;\r\n\t\t\t\t}\r\n\t\tdocument.getElementById(\"gosi\").height= 1;\r\n\t\tdocument.getElementById(\"plan\").height= 1;\r\n\t\tdocument.getElementById(\"reward\").height= 1;\r\n\t}else if(category ==\"gosi\"){\r\n\t\t\tif(document.getElementById(\"gosi\").height=='1'){\r\n\r\n\t\t\t\t//div안에 내용이 있으면 높이에 상관없이 내용이 다 출력됨\r\n\t\t\t\tdocument.getElementById(\"gosi\").height= 2;\t\r\n\r\n\t\t\tvar a =\t\"<table>\";\r\n\t\t\t  \ta+=\"\t\t<tr bgcolor='yellow'>                     \";\r\n\t\t\t  \ta+=\"\t\t\t<td>공고번호</td>                      \";\r\n\t\t\t  \ta+=\"\t\t\t<td>고시제목</td>                      \";\r\n\t\t\t  \ta+=\"\t\t\t<td>공고기관</td>                      \";\r\n\t\t\t  \ta+=\"\t\t</tr>                                     \";\r\n\t\t\t  \t\t";
  private final static String _jspx_template13 = " \r\n\t\t\t  \ta+=\"\t\t<tr id='gosiTable";
  private final static String _jspx_template14 = "' onclick=javascript:goDetailView('";
  private final static String _jspx_template15 = "') onmouseout=changePrevColor('gosiTable";
  private final static String _jspx_template16 = "') onmouseover=changeNextColor('gosiTable";
  private final static String _jspx_template17 = "') style='cursor:hand;'> \";\r\n\t\t  \t\ta+=\"\t\t<td>";
  private final static String _jspx_template18 = "</td>                     \";\r\n\t\t  \t\ta+=\"\t\t<td width='150'>";
  private final static String _jspx_template19 = "</td>      \";\r\n\t\t  \t\ta+=\"\t\t<td>";
  private final static String _jspx_template20 = "</td>                      \";\r\n\t\t\t  \ta+=\"\t\t</tr>                                     \";\r\n\r\n\t\t\t\t\t";
  private final static String _jspx_template21 = "                                  \r\n\t\t\t  \t\r\n\t\t\t  \ta+=\"\t</table>                                      \";\r\n\r\n\t\t\t\tdocument.getElementById('gosiDiv').innerHTML = a;\r\n\t\t\t\t\r\n\t\t\t}else{\r\n\t\t\t\t\r\n\t\t\t\tdocument.getElementById('gosiDiv').innerHTML = '';\r\n\t\t\t\tdocument.getElementById(\"gosi\").height= 1;\r\n\t\t\t}\r\n\t\tdocument.getElementById(\"suit\").height= 1;\t\t\r\n\t\tdocument.getElementById(\"plan\").height= 1;\r\n\t\tdocument.getElementById(\"reward\").height= 1;\r\n\t}else if(category ==\"plan\"){\r\n\t\t\tif(document.getElementById(\"plan\").height=='1'){\r\n\r\n\t\t\t\t\r\n\t\t\t\t\r\n\t\t\t\tdocument.getElementById(\"plan\").height= 2;\r\n\r\n\t\t\t\tvar a =\t\"<table>\";\r\n\t\t\t  \ta+=\"\t\t<tr bgcolor='yellow'>                     \";\r\n\t\t\t  \ta+=\"\t\t\t<td>공고번호</td>                      \";\r\n\t\t\t  \ta+=\"\t\t\t<td>고시제목</td>                      \";\r\n\t\t\t  \ta+=\"\t\t\t<td>공고기관</td>                      \";\r\n\t\t\t  \ta+=\"\t\t</tr>                                     \";\r\n\t\t\t  \t\t";
  private final static String _jspx_template22 = " \t\t\t  \t\r\n\t\t\t  \ta+=\" <tr id='gosiTable";
  private final static String _jspx_template23 = "' onclick=javascript:goDetailView('";
  private final static String _jspx_template24 = "') onmouseout=changePrevColor('gosiTable";
  private final static String _jspx_template25 = "') onmouseover=changeNextColor('gosiTable";
  private final static String _jspx_template26 = "') style='cursor:hand;'> \";\t\t\t  \t\r\n\t\t  \t\ta+=\"\t\t<td>";
  private final static String _jspx_template27 = "</td>                     \";\r\n\t\t  \t\ta+=\"\t\t<td width='150'>";
  private final static String _jspx_template28 = "</td>      \";\r\n\t\t  \t\ta+=\"\t\t<td>";
  private final static String _jspx_template29 = "</td>                      \";\r\n\t\t\t  \ta+=\"\t\t</tr>                                     \";\r\n\t\t\t\t\t";
  private final static String _jspx_template30 = "                             \r\n\t\t\t  \t\r\n\t\t\t  \ta+=\"\t</table>                                      \";\r\n\r\n\t\t\t\tdocument.getElementById('planDiv').innerHTML = a;\r\n\r\n\t\t\t\t\r\n\t\t\t}else{\r\n\t\t\t\tdocument.getElementById('planDiv').innerHTML = '';\t\t\t\t\r\n\t\t\t\tdocument.getElementById(\"plan\").height= 1;\r\n\t\t\t}\r\n\t\tdocument.getElementById(\"suit\").height= 1;\r\n\t\tdocument.getElementById(\"gosi\").height= 1;\t\t\r\n\t\tdocument.getElementById(\"reward\").height= 1;\r\n\t}else if(category ==\"reward\"){\r\n\t\t\t\tif(document.getElementById(\"reward\").height=='1'){\r\n\t\t\t\t\tdocument.getElementById(\"reward\").height= 2;\r\n\r\n\t\t\t\t\tvar a =\t\"<table>\";\r\n\t\t\t\t  \ta+=\"\t\t<tr bgcolor='yellow'>                     \";\r\n\t\t\t\t  \ta+=\"\t\t\t<td>보상ID</td>                      \";\r\n\t\t\t\t  \ta+=\"\t\t\t<td>신청일자</td>                      \";\t\t\t\t  \t\r\n\t\t\t\t  \ta+=\"\t\t</tr>                                     \";\r\n\t\t\t\t  \t\t";
  private final static String _jspx_template31 = " \t\t\t  \t\r\n\t\t\t\t  \ta+=\" <tr id='gosiTable";
  private final static String _jspx_template32 = "' onclick=javascript:goRewardDet('";
  private final static String _jspx_template33 = "') onmouseout=changePrevColor('gosiTable";
  private final static String _jspx_template34 = "') onmouseover=changeNextColor('gosiTable";
  private final static String _jspx_template35 = "') style='cursor:hand;'> \";\t\t\t  \t\r\n\t\t\t  \t\ta+=\"\t\t<td height='18'>";
  private final static String _jspx_template36 = "</td>                     \";\r\n\t\t\t  \t\ta+=\"\t\t<td width='100'>";
  private final static String _jspx_template37 = "</td>      \";\t\t\t  \t\t\r\n\t\t\t\t  \ta+=\"\t\t</tr>                                     \";\r\n\t\t\t\t\t\t";
  private final static String _jspx_template38 = "                             \r\n\t\t\t\t  \t\r\n\t\t\t\t  \ta+=\"\t</table>                                      \";\r\n\r\n\t\t\t\t\tdocument.getElementById('rewardDiv').innerHTML = a;\r\n\r\n\t\t\t\t}else{\r\n\t\t\t\t\tdocument.getElementById('rewardDiv').innerHTML = '';\t\r\n\t\t\t\t\tdocument.getElementById(\"reward\").height= 1;\r\n\t\t\t\t}\r\n\t\tdocument.getElementById(\"suit\").height= 1;\r\n\t\tdocument.getElementById(\"gosi\").height= 1;\r\n\t\tdocument.getElementById(\"plan\").height= 1;\t\t\r\n\t}\r\n}\r\n\r\n\r\n\r\n\r\n\r\n</script>\r\n\r\n</head>\r\n\r\n<body>\r\n<div id=\"left\" align=\"center\">\r\n  <table width=\"260\" height=\"700\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td height=\"5\" ><img src=\"/rams/images/map/l_bg1.gif\" alt=\".\"/></td>\r\n    </tr>\r\n    <tr>\r\n      <td height=\"100%\" class=\"cont\">\r\n\t  \t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\t\t \r\n\t\t  <tr>\r\n\t\t\t<td>\r\n\t\t\t\t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th height=\"35\" valign=\"bottom\" scope=\"row\">\r\n\t\t\t\t\t \r\n\t\t\t\t\t<img src=\"/rams/images/map/l_st_info2_1.gif\" alt=\"상세정보\" width=\"250\" height=\"29\" border=\"0\" usemap=\"#Map\" style='cursor:hand;' /></th>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th scope=\"row\" class=\"cont3\">\r\n\t\t\t\t\t\t\t<table width=\"250\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" bordercolor=\"#bed6e1\" id=\"iRst\">\r\n\t\t\t\t\t\t\t\t\t  <tr onclick=\"javascript:parent.modifyHeight();\">\r\n\t\t\t\t\t\t\t\t\t\t<th width=\"125\" height=\"25\" scope=\"col\" class=\"title\">지번</th>\r\n\t\t\t\t\t\t\t\t\t\t<th class=\"title\" scope=\"col\">";
  private final static String _jspx_template39 = "</th>\r\n\t\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"25\" class=\"col\">공시지가</td>\r\n\t\t\t\t\t\t\t\t\t\t<td class=\"col\">";
  private final static String _jspx_template40 = "</td>\r\n\t\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"25\" class=\"col\">면적(m2)</td>\r\n\t\t\t\t\t\t\t\t\t\t<td class=\"col\">";
  private final static String _jspx_template41 = "</td>\r\n\t\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"25\" class=\"col\">주소</td>\r\n\t\t\t\t\t\t\t\t\t\t<td class=\"col\">";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t\t\t\t<td height=\"25\" class=\"col\">지목</td>\r\n\t\t\t\t\t\t\t\t\t\t<td class=\"col\">";
  private final static String _jspx_template43 = "</td>\r\n\t\t\t\t\t\t\t\t\t  </tr>\r\n  \t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\r\n\t\t\t\t\t</th>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<td height=\"10\"></td>\r\n\t\t  </tr>\r\n\t    </table>\r\n\t    <br>\r\n\t\t <table width=\"250\"  border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t  <tr>\r\n\t\t\t<td class=\"stitle\">\r\n\t\t\t\t<table width=\"213\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr onClick=\"openDoor('gosi');\" style='cursor:hand;'>\r\n\t\t\t\t\t<th align=\"left\" scope=\"row\"><span class=\"style1\">시설결정고시</span></th>\r\n\t\t\t\t\t<td width=\"50\" align=\"right\"><span class=\"style2\">[";
  private final static String _jspx_template44 = "] 건 </span></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t  \r\n\t\t  \t<td id=\"gosi\" height=\"1\" background=\"/rams/images/map/l_bg3.gif\">\r\n\t\t  \t\t<div id='gosiDiv'></div>\t\r\n\t\t  \t\r\n\t\t  \t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<td class=\"stitle\">\r\n\t\t\t\t<table width=\"213\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr onClick=\"openDoor('plan');\" style='cursor:hand;'>\r\n\t\t\t\t\t<th align=\"left\" scope=\"row\" ><span class=\"style1\" >실시계획인가</span></th>\r\n\t\t\t\t\t<td width=\"50\" align=\"right\"><span class=\"style2\">[";
  private final static String _jspx_template45 = "] 건 </span></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t  \t<td id=\"plan\" height=\"1\" background=\"/rams/images/map/l_bg3.gif\">\r\n\t\t  \t\t<div id='planDiv'></div>\r\n\t\t  \t\t\r\n\t\t  \t</td>\r\n\t\t  </tr>\r\n\t\t   <tr onClick=\"openDoor('suit');\" style='cursor:hand;'>\r\n\t\t\t<td class=\"stitle\">\r\n\t\t\t\t<table width=\"213\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th align=\"left\" scope=\"row\"><span class=\"style1\">소송정보</span></th>\r\n\t\t\t\t\t<td width=\"50\" align=\"right\"><span class=\"style2\">[";
  private final static String _jspx_template46 = "]건</span></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t  \t<td id=\"suit\" height=\"1\" background=\"../images/map/l_bg3.gif\">\r\n\t\t  \t\t<div id='suitDiv'></div>\r\n\t\t  \t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<td class=\"stitle\">\r\n\t\t\t\t<table width=\"213\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr onClick=\"openDoor('reward');\" style='cursor:hand;'>\r\n\t\t\t\t\t<th align=\"left\" scope=\"row\"><span class=\"style1\">보상용지관리</span></th>\r\n\t\t\t\t\t<td width=\"50\" align=\"right\"><span class=\"style2\">[";
  private final static String _jspx_template47 = "]건</span></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t  \t<td id=\"reward\"  height=\"1\" background=\"../images/map/l_bg3.gif\">\r\n\t\t  \t\t<div id='rewardDiv'></div>\r\n\t\t  \t</td>\r\n\t\t  </tr>\r\n\t\t</table>\r\n\t  </td>\r\n    </tr>\r\n  </table>\r\n</div>\r\n<map name=\"Map\" id=\"Map\">\r\n<area shape=\"rect\" coords=\"160,6,247,25\" onClick=\"goLand();\"/>\r\n<area shape=\"rect\" coords=\"115,8,156,25\" onClick=\"goList();\"/>\r\n</map>\r\n</body>\r\n</html>\r\n";
}
