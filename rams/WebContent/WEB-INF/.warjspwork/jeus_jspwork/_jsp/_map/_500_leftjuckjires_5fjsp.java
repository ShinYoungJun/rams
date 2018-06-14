package jeus_jspwork._jsp._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_leftjuckjires_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template2);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template10);
      // jsp code [from=(204,8);to=(204,25)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

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
  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SearchList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("list");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template3);
            // jsp code [from=(182,52);to=(182,60)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.XID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template4);
            // jsp code [from=(182,93);to=(182,101)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template5);
            // jsp code [from=(183,47);to=(183,59)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.SGGCODE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template6);
            // jsp code [from=(184,36);to=(184,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.DONGCODE }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template7);
            // jsp code [from=(185,36);to=(185,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.JIBUN }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);
            // jsp code [from=(186,36);to=(186,50)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list.CODEDESC }",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);

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

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>무제 문서</title>\r\n<link href=\"/rams/css/doro.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<style type=\"text/css\">\r\n.box777 {\r\n\tbackground-color:#ffffff;\r\n\tborder: 1px #d3e2ea solid;\r\n\tcolor: #9a9a9a;\r\n\t}\r\n\r\n</style>\r\n<script src=\"/rams/OpenLayers/lib/jquery-1.3.1.min.js\"></script>\r\n<script src=\"/rams/js/common.js\">\t\t\t\t </script>\r\n<script src=\"/rams/OpenLayers/lib/OpenLayers.js\"></script>\r\n\r\n<script language=\"javascript\">\r\n\r\n\r\n//ajax\r\nfunction getXMLHTTPRequest()\r\n{\r\n\tvar xRequest = null;\r\n\txRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n\treturn xRequest;\r\n}\r\n\r\nvar req;\r\nvar\tcall;\r\n\r\nfunction sendRequest(url, params, HttpMethod, callback)\r\n{\r\n\treq = getXMLHTTPRequest();\r\n\r\n\tcall\t= callback;\r\n\tif(req){\r\n\t\treq.onreadystatechange = onReadyStateChange;\r\n\t\treq.open(HttpMethod, url, true);\r\n\t\treq.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=UTF-8\");\r\n\t\treq.send(params);\r\n\t}\r\n}\r\n\r\nfunction onReadyStateChange()\r\n{\r\n\tvar ready = req.readyState;\r\n\tvar data = null;\r\n\tif(ready == 4){\r\n\t\tif(this.call\t!= null)\r\n\t\t\tthis.call(req.responseText);\r\n\t}\r\n}\r\n\r\nfunction getValueSelectTag(target){\r\n\tvar obj = document.getElementById(target).options;\r\n\r\n\tfor(var i = 0 ; i < obj.length ; i++){\r\n\t\tif(obj[i].selected == true){\r\n\t\t\treturn obj[i].value;\r\n\t\t} \r\n\t}\r\n}\r\n\r\n//ajax 끝\r\n\r\nfunction changeGuCode(){\r\n\tvar _guCode = getValueSelectTag(\"selectGu\");\r\n\talert(\"gu : \"+_guCode);\r\n\tvar param = \"&GU_CD=\"+_guCode;\r\n\tsendRequest(\"/rams/map/get_dong_list.do\", param, \"GET\", ResultChangeGuCode);\r\n}\r\n\r\nfunction\tResultChangeGuCode(obj)\r\n{\r\n\t\r\n\tfncSelectBoxSetting(obj, \"selectDong\", \"\", \"동선택\");\r\n}\r\n\r\nfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n{\r\n    var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n    var selectBoxLabel;\r\n    var root;\r\n    var selectBoxValue;\r\n    var opt \t= document.getElementById(selectBoxId);\r\n    var tags\t= \"\";\r\n    var\ttext\t= \"\";\r\n\r\n    for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n    {\r\n    \topt.options[i]\t= null;\r\n    }\r\n\r\n    xmldoc.async\t= false;\r\n\r\n\txmldoc.loadXML(strParam);\r\n\r\n\r\n\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n    if(root <= 0)\r\n    {\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(\"\");\r\n        tags.setAttribute(\"label\", \"\");\r\n        tags.appendChild(text);\r\n        tags.value = 0;\r\n        opt.appendChild(tags);\r\n        return;\r\n    }\r\n\r\n    if(topLabel != null && topLabel != \"\")\r\n\t{\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(topLabel);\r\n        tags.setAttribute(\"label\", topLabel);\r\n        tags.appendChild(text);\r\n        tags.value = '';\r\n        opt.appendChild(tags);\r\n    }\r\n\t\r\n    for(var i = 0; i < root; i++)\r\n    {\r\n    \t\r\n    \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n    \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n        tags \t= document.createElement(\"option\");\r\n   \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n        tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n        tags.value = selectBoxValue;\r\n        tags.appendChild(text);\r\n        opt.appendChild(tags);\r\n    }   \r\n}\r\n\r\nfunction goDetail(pnu){\r\n\r\n\tlocation.href='/rams/map/juckjianalysisdetail.do?PNU='+pnu;\r\n\t\r\n}\r\n\r\nfunction goLocation(xid,layer){\r\n\r\n\t//alert(xid);\r\n\tparent.fnGetCentroid(xid,layer);\r\n}\r\n\r\n</script>\r\n\r\n</head>\r\n\r\n<body>\r\n<div id=\"left\" align=\"center\" >\r\n  <table width=\"260\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n\t\t\t<td>\r\n\t\t\t\t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th height=\"35\" valign=\"bottom\" scope=\"row\"><img src=\"../images/map/l_st_rst.gif\" alt=\"검색결과\"/></th>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th scope=\"row\" class=\"cont3\">\r\n\t\t\t\t\t\t\t<table width=\"250\" border=\"1\" cellspacing=\"0\" c";
  private final static String _jspx_template2 = "ellpadding=\"0\" bordercolor=\"#bed6e1\">\r\n\t\t\t\t\t\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th height=\"25\" scope=\"col\" class=\"title\">구명</th>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"title\" scope=\"col\">동명</th>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"title\" scope=\"col\">지번</th>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<th class=\"title\" scope=\"col\">지목</th>\r\n\t\t\t\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t\t\t\t  ";
  private final static String _jspx_template3 = "\r\n\t\t\t\t\t\t\t\t\t\t\t  <tr onClick=\"javascript:goLocation('";
  private final static String _jspx_template4 = "','LP_PA_CBND_ALL');goDetail('";
  private final static String _jspx_template5 = "');\" style='cursor:hand;'>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td height=\"25\" class=\"title\">";
  private final static String _jspx_template6 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"title\" >";
  private final static String _jspx_template7 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"title\" >";
  private final static String _jspx_template8 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t\t\t\t<td class=\"title\" >";
  private final static String _jspx_template9 = "</td>\r\n\t\t\t\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t\t\t\t  ";
  private final static String _jspx_template10 = "\t\t\t\t\t\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t\t </table>\r\n\t\t\t\t\t\r\n\t\t\t\t\t</th>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t  <td height='10'></td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<td height=\"30\" align=\"center\">\t\t\t\r\n\t\t\t\r\n\t\t\t<table width=\"139\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t\t";
  private final static String _jspx_template11 = "\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n    </table>\r\n</div>\r\n</body>\r\n</html>\r\n";
}
