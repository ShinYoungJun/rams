package jeus_jspwork._jsp._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_leftjuckji_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(212,46);to=(212,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GuCode }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(220,46);to=(220,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${RoadName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(224,47);to=(224,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Owngubun }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(228,46);to=(228,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Jimok}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template6);

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
  private final static String _jspx_template1 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>도로재산관리시스템</title>\r\n<link href=\"../css/doro.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<style type=\"text/css\">\r\n.box777 {\r\n\tbackground-color:#ffffff;\r\n\tborder: 1px #d3e2ea solid;\r\n\tcolor: #9a9a9a;\r\n\t}\r\n\r\n</style>\r\n\r\n<script language=\"javascript\">\r\nfunction goResult(){\r\n\r\n\t\r\n\tparent.document.getElementById(\"selectGu\").value = document.getElementById(\"selectGu\").value;\r\n\tparent.document.getElementById(\"selectDong\").value = document.getElementById(\"selectDong\").value;\r\n\tparent.document.getElementById(\"selectRoad\").value = document.getElementById(\"selectRoad\").value;\r\n\tparent.document.getElementById(\"selectOwn\").value = document.getElementById(\"selectOwn\").value;\r\n\tparent.document.getElementById(\"selectJi\").value = document.getElementById(\"selectJi\").value;\r\n\tparent.document.getElementById(\"prevJiga\").value = document.getElementById(\"prevJiga\").value;\r\n\tparent.document.getElementById(\"nextJiga\").value = document.getElementById(\"nextJiga\").value;\r\n\r\n\tvar gu =  document.getElementById(\"selectGu\").value;\r\n\r\n\tif( gu == null || gu == \"\" ){\r\n\t\talert('구를 선택해주세요');\r\n\t}else{\r\n\t\t\t\r\n\tparent.goResult();\r\n\t}\r\n\t\r\n}\r\n\r\n//ajax\r\nfunction getXMLHTTPRequest()\r\n{\r\n\tvar xRequest = null;\r\n\txRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n\treturn xRequest;\r\n}\r\n\r\nvar req;\r\nvar\tcall;\r\n\r\nfunction sendRequest(url, params, HttpMethod, callback)\r\n{\r\n\treq = getXMLHTTPRequest();\r\n\r\n\tcall\t= callback;\r\n\tif(req){\r\n\t\treq.onreadystatechange = onReadyStateChange;\r\n\t\treq.open(HttpMethod, url, true);\r\n\t\treq.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=UTF-8\");\r\n\t\treq.send(params);\r\n\t}\r\n}\r\n\r\nfunction onReadyStateChange()\r\n{\r\n\tvar ready = req.readyState;\r\n\tvar data = null;\r\n\tif(ready == 4){\r\n\t\tif(this.call\t!= null)\r\n\t\t\tthis.call(req.responseText);\r\n\t}\r\n}\r\n\r\nfunction getValueSelectTag(target){\r\n\tvar obj = document.getElementById(target).options;\r\n\r\n\tfor(var i = 0 ; i < obj.length ; i++){\r\n\t\tif(obj[i].selected == true){\r\n\t\t\treturn obj[i].value;\r\n\t\t} \r\n\t}\r\n}\r\n\r\n//ajax 끝\r\n\r\nfunction changeGuCode(){\r\n\tvar _guCode = getValueSelectTag(\"selectGu\");\r\n\t//alert(\"gu : \"+_guCode);\r\n\tvar param = \"&GU_CD=\"+_guCode;\r\n\tsendRequest(\"/rams/map/get_dong_list.do\", param, \"GET\", ResultChangeGuCode);\r\n}\r\n\r\nfunction\tResultChangeGuCode(obj)\r\n{\r\n\t\r\n\tfncSelectBoxSetting(obj, \"selectDong\", \"\", \"동선택\");\r\n}\r\n\r\nfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n{\r\n\t\r\n    var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n    var selectBoxLabel;\r\n    var root;\r\n    var selectBoxValue;\r\n    var opt \t= document.getElementById(selectBoxId);\r\n    var tags\t= \"\";\r\n    var\ttext\t= \"\";\r\n\r\n    for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n    {\r\n    \topt.options[i]\t= null;\r\n    }\r\n\r\n    xmldoc.async\t= false;\r\n\r\n\txmldoc.loadXML(strParam);\r\n\r\n\r\n\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n    if(root <= 0)\r\n    {\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(\"\");\r\n        tags.setAttribute(\"label\", \"\");\r\n        tags.appendChild(text);\r\n        tags.value = 0;\r\n        opt.appendChild(tags);\r\n        return;\r\n    }\r\n\r\n    if(topLabel != null && topLabel != \"\")\r\n\t{\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(topLabel);\r\n        tags.setAttribute(\"label\", topLabel);\r\n        tags.appendChild(text);\r\n        tags.value = '';\r\n        opt.appendChild(tags);\r\n    }\r\n\t\r\n    for(var i = 0; i < root; i++)\r\n    {\r\n    \t\r\n    \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n    \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n        tags \t= document.createElement(\"option\");\r\n   \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n        tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n        tags.value = selectBoxValue;\r\n        tags.appendChild(text);\r\n  ";
  private final static String _jspx_template2 = "      opt.appendChild(tags);\r\n    }   \r\n\r\n}\r\n\r\nfunction goSearch(){\r\n\t\r\n\r\n\t    var cw=screen.availWidth; // 화면 너비\r\n\tvar ch=screen.availHeight; // 화면 높이\r\n\r\n\tvar name = '/rams/map/juckjianalysissearch.do';\r\n\tvar sw=810;// 띄울 창의 너비\r\n\tvar sh=200;// 띄울 창의 높이\r\n\r\n\tvar ml=(cw-sw)/2;// 가운데 띄우기위한 창의 x위치\r\n\tvar mt=(ch-sh)/2;// 가운데 띄우기위한 창의 y위치\r\n\r\n\t window.open(name,'newWin','width='+sw+',height='+sh+',top='+mt+',left='+ml+',toobar=no,scrollbars=no,menubar=no,status=no ,directories=no,');\r\n\r\n\t\r\n}\r\n</script>\r\n\r\n</head>\r\n\r\n<body>\r\n<div id=\"left\">\r\n\r\n  <table width=\"260\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td height=\"5\" ><img src=\"../images/map/l_bg1.gif\" alt=\".\"/></td>\r\n    </tr>\r\n    <tr>\r\n      <td height=\"100%\" class=\"cont\">\r\n\t  \t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\"><img src=\"../images/map/l_t01.gif\" alt=\"적지분석\" width=\"250\" height=\"27\" /></th>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<td>\r\n\t\t\t\r\n\t\t\t\r\n\t\t\t\t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th scope=\"col\"><img src=\"../images/map/l_st_srch.gif\" alt=\"검색\" width=\"250\" height=\"29\" /></th>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td class=\"cont2\">\r\n\t\t\t\t\t\t<table width=\"220\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th width=\"73\" height=\"24\" class=\"title\" scope=\"row\">구명</th>\r\n\t\t\t\t\t\t\t<td width=\"147\"><label for=\"select\">";
  private final static String _jspx_template3 = "</label></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th height=\"24\" class=\"title\" scope=\"row\">동명</th>\r\n\t\t\t\t\t\t\t<td width=\"147\"><label for=\"select\"><select name=\"selectDong\" class=\"tb147\" id=\"selectDong\"></select></label></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th height=\"24\" class=\"title\" scope=\"row\">노선번호</th>\r\n\t\t\t\t\t\t\t<td width=\"147\"><label for=\"select\">";
  private final static String _jspx_template4 = "</label></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th height=\"24\" class=\"title\" scope=\"row\">소유구분</th>\r\n\t\t\t\t\t\t\t<td width=\"147\"><label for=\"select\"> ";
  private final static String _jspx_template5 = "</label></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th height=\"24\" class=\"title\" scope=\"row\">지목</th>\r\n\t\t\t\t\t\t\t<td width=\"147\"><label for=\"select\">";
  private final static String _jspx_template6 = "</label></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th height=\"24\" class=\"title\" scope=\"row\">지가</th>\r\n\t\t\t\t\t\t\t<td width=\"147\" align=\"left\"><input type=\"text\" id=\"prevJiga\" name=\"prevJiga\" class=\"box777\"  size=\"7\">&nbsp; ~ &nbsp;<input type=\"text\" id=\"nextJiga\" name=\"nextJiga\"  size=\"7\" class=\"box777\" ></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th scope=\"row\"></th>\r\n\t\t\t\t\t\t\t<td height=\"30\" align=\"right\" valign=\"bottom\">\r\n\t\t\t\t\t\t\t\t<table width=\"130\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t\t\t<td><img src=\"/rams/images/common/btn_detail.gif\" onclick='goSearch();' alt=\"상세검색\" style='cursor:hand;' width=\"62\" height=\"18\" border=\"0\" /></td>\r\n\t\t\t\t\t\t\t\t\t<td width=\"68\" align=\"right\"><img src=\"/rams/images/common/btn_srch.gif\" onClick=\"javascript:goResult();\" style='cursor:hand;' alt=\"검색\" border=\"0\"/></td>\r\n\t\t\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t\t\t</table>\r\n\t\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"1\" bgcolor=\"dddddd\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  \r\n\t\t</table>\r\n\t\t\r\n\t  </td>\r\n    </tr>\r\n  </table>\r\n  \r\n</div>\r\n</body>\r\n</html>\r\n";
}
