package jeus_jspwork._jsp._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_leftjuckjisearchview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(179,38);to=(179,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${GuCode}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template3);
      // jsp code [from=(183,26);to=(183,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${RoadName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template4);
      // jsp code [from=(187,26);to=(187,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${Owngubun}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template5);
      // jsp code [from=(189,26);to=(189,31)]
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
  private final static String _jspx_template1 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Transitional//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>도로재산관리시스템</title>\r\n<link href=\"/rams/css/doro.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<script language='javascript'>\r\n\r\n//ajax\r\nfunction getXMLHTTPRequest()\r\n{\r\n\tvar xRequest = null;\r\n\txRequest = new ActiveXObject(\"Microsoft.XMLHTTP\");\r\n\r\n\treturn xRequest;\r\n}\r\n\r\nvar req;\r\nvar\tcall;\r\n\r\nfunction sendRequest(url, params, HttpMethod, callback)\r\n{\r\n\treq = getXMLHTTPRequest();\r\n\r\n\tcall\t= callback;\r\n\tif(req){\r\n\t\treq.onreadystatechange = onReadyStateChange;\r\n\t\treq.open(HttpMethod, url, true);\r\n\t\treq.setRequestHeader(\"Content-Type\",\"application/x-www-form-urlencoded;charset=UTF-8\");\r\n\t\treq.send(params);\r\n\t}\r\n}\r\n\r\nfunction onReadyStateChange()\r\n{\r\n\tvar ready = req.readyState;\r\n\tvar data = null;\r\n\tif(ready == 4){\r\n\t\tif(this.call\t!= null)\r\n\t\t\tthis.call(req.responseText);\r\n\t}\r\n}\r\n\r\nfunction getValueSelectTag(target){\r\n\tvar obj = document.getElementById(target).options;\r\n\r\n\tfor(var i = 0 ; i < obj.length ; i++){\r\n\t\tif(obj[i].selected == true){\r\n\t\t\treturn obj[i].value;\r\n\t\t} \r\n\t}\r\n}\r\n\r\n//ajax 끝\r\n\r\nfunction changeGuCode(){\r\n\tvar _guCode = getValueSelectTag(\"selectGu\");\r\n\t//alert(\"gu : \"+_guCode);\r\n\tvar param = \"&GU_CD=\"+_guCode;\r\n\tsendRequest(\"/rams/map/get_dong_list.do\", param, \"GET\", ResultChangeGuCode);\r\n}\r\n\r\nfunction\tResultChangeGuCode(obj)\r\n{\r\n\t\r\n\tfncSelectBoxSetting(obj, \"selectDong\", \"\", \"동선택\");\r\n}\r\n\r\nfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n{\r\n\t\r\n  var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n  var selectBoxLabel;\r\n  var root;\r\n  var selectBoxValue;\r\n  var opt \t= document.getElementById(selectBoxId);\r\n  var tags\t= \"\";\r\n  var\ttext\t= \"\";\r\n\r\n  for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n  {\r\n  \topt.options[i]\t= null;\r\n  }\r\n\r\n  xmldoc.async\t= false;\r\n\r\n\txmldoc.loadXML(strParam);\r\n\r\n\r\n\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n  if(root <= 0)\r\n  {\r\n      tags \t= document.createElement(\"option\");\r\n      text\t= document.createTextNode(\"\");\r\n      tags.setAttribute(\"label\", \"\");\r\n      tags.appendChild(text);\r\n      tags.value = 0;\r\n      opt.appendChild(tags);\r\n      return;\r\n  }\r\n\r\n  if(topLabel != null && topLabel != \"\")\r\n\t{\r\n      tags \t= document.createElement(\"option\");\r\n      text\t= document.createTextNode(topLabel);\r\n      tags.setAttribute(\"label\", topLabel);\r\n      tags.appendChild(text);\r\n      tags.value = '';\r\n      opt.appendChild(tags);\r\n  }\r\n\t\r\n  for(var i = 0; i < root; i++)\r\n  {\r\n  \t\r\n  \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n  \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n      tags \t= document.createElement(\"option\");\r\n \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n      tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n      tags.value = selectBoxValue;\r\n      tags.appendChild(text);\r\n      opt.appendChild(tags);\r\n  }   \r\n\r\n}\r\n\r\nfunction goResultPop(){\r\n\r\n\topener.parent.document.getElementById(\"selectGu\").value = document.getElementById(\"selectGu\").value;\r\n\topener.parent.document.getElementById(\"selectDong\").value =  document.getElementById(\"selectDong\").value;\r\n\topener.parent.document.getElementById(\"selectRoad\").value = document.getElementById(\"selectRoad\").value;\r\n\topener.parent.document.getElementById(\"selectOwn\").value = document.getElementById(\"selectOwn\").value;\r\n\topener.parent.document.getElementById(\"selectJi\").value = document.getElementById(\"selectJi\").value;\r\n\topener.parent.document.getElementById(\"prevJiga\").value = document.getElementById(\"prevJiga\").value;\r\n\topener.parent.document.getElementById(\"nextJiga\").value = document.getElementById(\"nextJiga\").value;\r\n\topener.parent.document.getElementById(\"cityPlan\").value = document.getElementById(\"cityPlan\").value;\r\n\topener.parent.document.getElementById(\"useArea\").value = document.getElementById(\"useArea\").value;\r\n\topener.parent.document.getElementById(\"useZone\")";
  private final static String _jspx_template2 = ".value = document.getElementById(\"useZone\").value;\r\n\topener.parent.document.getElementById(\"useRegion\").value = document.getElementById(\"useRegion\").value; \r\n\r\n\t\r\n\tvar gu =  document.getElementById(\"selectGu\").value;\r\n\r\n\tif( gu == null || gu == \"\" ){\r\n\t\talert('구를 선택해주세요');\r\n\t}else{\r\n\r\n\t\t\r\n\t\topener.parent.goResult();\r\n\t}\r\n\t\r\n\t\r\n\t\r\n\r\n}\r\n\r\n\r\n\r\n</script>\r\n</head>\r\n\r\n<body>\r\n\r\n<div id=\"tImg\" style='left:10px;'><img src=\"/rams/images/map/tit_srch.gif\" alt=\"상세검색\" width=\"65\" height=\"19\" /></div>\r\n<table width=\"804\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n  <tr>\r\n    <td>\r\n\t\t<table width=\"800\" border=\"1\" cellpadding=\"0\" cellspacing=\"1\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t  <tr>\r\n\t\t\t<th width=\"100\" scope=\"col\">구명</th>\r\n\t\t\t<td width=\"155\" class=\"leftCon\">";
  private final static String _jspx_template3 = "</td>\r\n\t\t\t<th width=\"100\" scope=\"col\">동명</th>\r\n\t\t\t<td width=\"155\" class=\"leftCon\"><select name=\"selectDong\" class=\"formBox1\" id=\"selectDong\"></select></td>\r\n\t\t\t<th width=\"100\" scope=\"col\">노선명</th>\r\n\t\t\t<td class=\"leftCon\">";
  private final static String _jspx_template4 = " </td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\">소유구분</th>\r\n\t\t\t<td class=\"leftCon\">";
  private final static String _jspx_template5 = "</td>\r\n\t\t\t<th scope=\"col\">지목</th>\r\n\t\t\t<td class=\"leftCon\">";
  private final static String _jspx_template6 = " </td>\r\n\t\t\t<th scope=\"col\">도시계획시설</th>\r\n\t\t\t<td class=\"leftCon\">\r\n\t\t\t\t<select name=\"cityPlan\" class=\"formBox1\">\r\n\t\t\t\t\t<option value='all'>::전체::</option>\r\n\t\t\t\t\t<option value='count_15'>도로</option>\r\n\t\t\t\t\t<option value='count_16'>주차장</option>\r\n\t\t\t\t\t<option value='count_17'>공원</option>\r\n\t\t\t\t\t<option value='count_18'>녹지</option>\r\n\t\t\t\t\t<option value='count_19'>유원지</option>\r\n\t\t\t\t\t<option value='count_20'>학교</option>\r\n\t\t\t\t\t<option value='count_21'>하천</option>\t\t\t\t\r\n\t\t\t\t</select>\t\t\t\r\n\t\t\t</td>\t\t\t\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\">용도구역</th>\r\n\t\t\t<td class=\"leftCon\">\r\n\t\t\t\t<select name=\"useArea\" class=\"formBox1\">\r\n\t\t\t\t\t<option value='all'>:::전체:::</option>\r\n\t\t\t\t\t<option value='count_'>개발제한구역</option>\r\n\t\t\t\t</select>\r\n\t\t\t</td>\r\n\t\t\t<th scope=\"col\">용도지역</th>\r\n\t\t\t<td class=\"leftCon\">\r\n\t\t\t\t<select name=\"useZone\" class=\"formBox1\">\r\n\t\t\t\t\t<option value='all'>:::전체:::</option>\r\n\t\t\t\t\t<option value='count_1'>주거지역</option>\r\n\t\t\t\t\t<option value='count_2'>상업지역</option>\r\n\t\t\t\t\t<option value='count_3'>공업지역</option>\r\n\t\t\t\t\t<option value='count_4'>녹지지역</option>\r\n\t\t\t\t</select>\r\n\t\t\t</td>\r\n\t\t\t<th width=\"85\" scope=\"col\">용도지구</th>\r\n\t\t\t<td class=\"leftCon\">\r\n\t\t\t\t<select name=\"useRegion\" class=\"formBox1\">\r\n\t\t\t\t\t<option value='all'>:::전체:::</option>\r\n\t\t\t\t\t<option value='count_5'>경관지구</option>\r\n\t\t\t\t\t<option value='count_6'>미관지구</option>\r\n\t\t\t\t\t<option value='count_7'>고도지구</option>\r\n\t\t\t\t\t<option value='count_8'>방화지구</option>\r\n\t\t\t\t\t<option value='count_9'>방재지구</option>\r\n\t\t\t\t\t<option value='count_10'>보존지구</option>\r\n\t\t\t\t\t<option value='count_11'>시설보호지구</option>\r\n\t\t\t\t\t<option value='count_12'>용도지구취락지구</option>\r\n\t\t\t\t\t<option value='count_13'>개발진흥지구</option>\r\n\t\t\t\t\t<option value='count_14'>국토이용기타용도지구</option>\r\n\t\t\t\t</select>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<th width=\"85\" scope=\"col\">지가</th>\r\n\t\t\t<td class=\"leftCon\" colspan=\"5\" ><input type='text' name=\"prevJiga\" id=\"prevJiga\" class=\"formBox1\"> ~ <input type='text' name=\"nextJiga\" id=\"nextJiga\" class=\"formBox1\"></td>\r\n\t\t  </tr>\r\n\t\t</table>\r\n\t</td>\r\n  </tr>\r\n</table>\r\n<table width=\"804\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n  <tr>\r\n    <td height=\"30\" align=\"right\"><img src=\"/rams/images/common/btn_srch2.gif\" onclick='goResultPop();' style='cursor:hand;'alt=\"검색\" width=\"62\" height=\"18\" border=\"0\" /></td>\r\n  </tr>\r\n</table>\r\n\r\n</body>\r\n</html>\r\n";
}
