package jeus_jspwork._jsp._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_leftsuitbiz_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(198,10);to=(198,16)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GuCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);

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
  private final static String _jspx_template1 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>무제 문서</title>\r\n<link href=\"../css/doro.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<style type=\"text/css\">\r\n.box777 {\r\n\tbackground-color:#ffffff;\r\n\tborder: 1px #d3e2ea solid;\r\n\tcolor: #9a9a9a;\r\n\t}\r\n\r\n</style>\r\n<script src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\">\r\nfunction goResult3(){\r\n\r\n\tparent.document.getElementById(\"selectGu\").value = document.getElementById(\"selectGu\").value;\r\n\tparent.document.getElementById(\"selectDong\").value = document.getElementById(\"selectDong\").value;\r\n\t\r\n\tparent.document.getElementById(\"selectOwn\").value = document.getElementById(\"jibun\").value;\r\n\r\n\r\n\r\n\tparent.document.getElementById(\"selectRoad\").value = document.getElementById(\"san\").checked; \r\n\r\n\r\n\t//alert('checked : '+document.getElementById(\"san\").checked);\r\n\t\t\r\n\r\n\tvar gu =  document.getElementById(\"selectGu\").value;\r\n\r\n\tif( gu == null || gu == \"\" ){\r\n\t\talert('구를 선택해주세요');\r\n\t}else{\r\n\t\t\t\r\n\tparent.goResult3();\r\n\t}\r\n\t\r\n}\r\n\r\n//ajax\r\nfunction getXMLHTTPRequest()\r\n{\r\n\tvar xRequest = null;\r\n\txRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n\treturn xRequest;\r\n}\r\n\r\nvar req;\r\nvar\tcall;\r\n\r\nfunction sendRequest(url, params, HttpMethod, callback)\r\n{\r\n\treq = getXMLHTTPRequest();\r\n\r\n\tcall\t= callback;\r\n\tif(req){\r\n\t\treq.onreadystatechange = onReadyStateChange;\r\n\t\treq.open(HttpMethod, url, true);\r\n\t\treq.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=UTF-8\");\r\n\t\treq.send(params);\r\n\t}\r\n}\r\n\r\nfunction onReadyStateChange()\r\n{\r\n\tvar ready = req.readyState;\r\n\tvar data = null;\r\n\tif(ready == 4){\r\n\t\tif(this.call\t!= null)\r\n\t\t\tthis.call(req.responseText);\r\n\t}\r\n}\r\n\r\nfunction getValueSelectTag(target){\r\n\tvar obj = document.getElementById(target).options;\r\n\r\n\tfor(var i = 0 ; i < obj.length ; i++){\r\n\t\tif(obj[i].selected == true){\r\n\t\t\treturn obj[i].value;\r\n\t\t} \r\n\t}\r\n}\r\n\r\n//ajax 끝\r\n\r\nfunction changeGuCode(){\r\n\tvar _guCode = getValueSelectTag(\"selectGu\");\r\n\t//alert(\"gu : \"+_guCode);\r\n\tvar param = \"&GU_CD=\"+_guCode;\r\n\tsendRequest(\"/rams/map/get_dong_list.do\", param, \"GET\", ResultChangeGuCode);\r\n}\r\n\r\nfunction\tResultChangeGuCode(obj)\r\n{\r\n\t\r\n\tfncSelectBoxSetting(obj, \"selectDong\", \"\", \"동선택\");\r\n}\r\n\r\nfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n{\r\n\t\r\n    var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n    var selectBoxLabel;\r\n    var root;\r\n    var selectBoxValue;\r\n    var opt \t= document.getElementById(selectBoxId);\r\n    var tags\t= \"\";\r\n    var\ttext\t= \"\";\r\n\r\n    for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n    {\r\n    \topt.options[i]\t= null;\r\n    }\r\n\r\n    xmldoc.async\t= false;\r\n\r\n\txmldoc.loadXML(strParam);\r\n\r\n\r\n\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n    if(root <= 0)\r\n    {\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(\"\");\r\n        tags.setAttribute(\"label\", \"\");\r\n        tags.appendChild(text);\r\n        tags.value = 0;\r\n        opt.appendChild(tags);\r\n        return;\r\n    }\r\n\r\n    if(topLabel != null && topLabel != \"\")\r\n\t{\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(topLabel);\r\n        tags.setAttribute(\"label\", topLabel);\r\n        tags.appendChild(text);\r\n        tags.value = '';\r\n        opt.appendChild(tags);\r\n    }\r\n\t\r\n    for(var i = 0; i < root; i++)\r\n    {\r\n    \t\r\n    \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n    \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n        tags \t= document.createElement(\"option\");\r\n   \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n        tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n        tags.value = selectBoxValue;\r\n        tags.appendChild(text);\r\n        opt.appendChild(tags);\r\n    }   \r\n\r\n}\r\n</script>\r\n\r\n</head>\r\n\r\n<body>\r\n<div id=\"left\">\r\n\r\n  <table width=\"260\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  ";
  private final static String _jspx_template2 = "  <tr>\r\n      <td height=\"5\" ><img src=\"../images/map/l_bg1.gif\" alt=\".\"/></td>\r\n    </tr>\r\n    <tr>\r\n      <td height=\"100%\" class=\"cont\">\r\n\t  \t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\"><img src=\"../images/map/l_t03.gif\" alt=\"적지분석\" width=\"250\" height=\"27\" /></th>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<td>\r\n\t\t\t\r\n\t\t\t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th scope=\"col\"><img src=\"../images/map/l_st_num.gif\" alt=\"검색\" width=\"250\" height=\"29\" /></th>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td class=\"cont2\">\r\n\t\t\t\t\t\t<table width=\"220\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th width=\"73\" height=\"24\" class=\"title\" scope=\"row\">구선택</th>\r\n\t\t\t\t\t\t\t<td width=\"147\"><label for=\"select\">\r\n\t\t\t\t\t\t\t";
  private final static String _jspx_template3 = "\t\t\t\t\t\t\r\n\t\t\t\t\t\t\t</label></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th width=\"73\" height=\"24\" class=\"title\" scope=\"row\">동선택</th>\r\n\t\t\t\t\t\t\t<td width=\"147\"><label for=\"select\"><select name=\"select\" class=\"tb147\" id=\"selectDong\"></select></label></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th width=\"73\" height=\"24\" class=\"title2\" scope=\"row\"><label for=\"checkbox\"><input type=\"checkbox\" name=\"san\" value=\"\" id=\"san\" /></label>산</th>\r\n\t\t\t\t\t\t\t<td width=\"147\"><label for=\"textfield\"><input name=\"jibun\" type=\"text\" class=\"tb143\" id=\"jibun\" /></label></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th height=\"28\"></th>\r\n\t\t\t\t\t\t\t<td align=\"right\" valign=\"bottom\"><img src=\"../images/common/btn_srch2.gif\" alt=\"검색\" width=\"62\" height=\"18\" border=\"0\" onClick=\"goResult3();\" style='cursor:hand;'/></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"1\" bgcolor=\"dddddd\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"1\" bgcolor=\"dddddd\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  \r\n\t\t</table>\r\n\t\t\r\n\t  </td>\r\n    </tr>\r\n  </table>\r\n  \r\n</div>\r\n</body>\r\n</html>\r\n";
}
