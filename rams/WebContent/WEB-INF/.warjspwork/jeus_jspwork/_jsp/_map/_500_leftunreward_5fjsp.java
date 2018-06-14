package jeus_jspwork._jsp._map;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_leftunreward_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
  private final static String _jspx_template1 = "\r\n\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>무제 문서</title>\r\n<link href=\"/rams/css/doro.css\" rel=\"stylesheet\" type=\"text/css\" />\r\n<style type=\"text/css\">\r\n.box777 {\r\n\tbackground-color:#ffffff;\r\n\tborder: 1px #d3e2ea solid;\r\n\tcolor: #9a9a9a;\r\n\t}\r\n\r\n</style>\r\n<script src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\">\r\nfunction goResult3(){\r\n\t\r\n\tparent.document.getElementById(\"ownGubun\").value = document.getElementById(\"ownGubun\").value;\r\n\t\r\n}\r\n\r\nfunction goSetLocation(){\r\n\r\n\tvar select = document.getElementById('GU').value;\r\n\tvar  layer = \"\";\r\n\r\n\t\r\n\tif(select == '3'){\r\n\t\tlayer = 'LA_PA_CBND_YS';\r\n\t}else if(select == '19'){\r\n\t\tlayer = 'LA_PA_CBND_DJ';\r\n\t\t//layer = 'LP_PA_CBND_ALL';\r\n\t}else if(select == '20'){\r\n\t\tlayer = 'LA_PA_CBND_GA';\r\n\t}else if(select == '17'){\r\n\t\tlayer = 'LA_PA_CBND_GC';\r\n\t}else if(select == '16'){\r\n\t\tlayer = 'LA_PA_CBND_GURO';\r\n\t}else if(select == '2'){\r\n\t\tlayer = 'LA_PA_CBND_JUNGGU';\r\n\t\t//layer = 'LP_PA_CBND_ALL';\r\n\t}else if(select == '18'){\r\n\t\tlayer = 'LA_PA_CBND_YDP';\r\n\t}else{\r\n\t\tlayer = 'NOTSELECTED';\r\n\t}\r\n\r\n\tparent.document.getElementById(\"moveGu\").value = layer;\r\n\t\r\n\tparent.fnGetCentroid(select,'G001_2_1');\r\n\t\r\n\t\r\n}\r\n</script>\r\n\r\n</head>\r\n\r\n<body>\r\n<div id=\"left\">\r\n <table width=\"260\" height=\"100%\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td height=\"5\" ><img src=\"/rams/images/map/l_bg1.gif\" alt=\".\"/></td>\r\n    </tr>\r\n    <tr>\r\n      <td height=\"100%\" class=\"cont\">\r\n\t  \t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t  <tr>\r\n\t\t\t<th scope=\"col\"><img src=\"/rams/images/map/l_t02.gif\" alt=\"적지분석\" width=\"250\" height=\"27\" /></th>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<td>\t\t\t\r\n\t\t\t\t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th scope=\"col\"><img src=\"/rams/images/map/l_st_target.gif\" alt=\"검색\" width=\"250\" height=\"29\" /></th>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td class=\"cont2\">\r\n\t\t\t\t\t\t<table width=\"220\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th width=\"73\" height=\"24\" class=\"title\" scope=\"row\">구명</th>\r\n\t\t\t\t\t\t\t<td width=\"147\"><label for=\"select\"><select class=\"tb147\" id=\"GU\" name=\"GU\" onChange=\"goSetLocation();\">\r\n\t\t\t\t\t\t\t  <option value=\"NOTSELECTED\" selected>구선택</option>\r\n\t\t\t\t\t\t\t  <option value=\"3\">용산구</option>\r\n\t\t\t\t\t\t\t  <option value=\"19\">동작구</option>\r\n\t\t\t\t\t\t\t  <option value=\"20\">관악구</option>\r\n\t\t\t\t\t\t\t  <option value=\"17\">금천구</option>\r\n\t\t\t\t\t\t\t  <option value=\"16\">구로구</option>\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t\t  <option value=\"2\">중구</option>\r\n\t\t\t\t\t\t\t  <option value=\"18\">영등포구</option>\r\n\t\t\t\t\t\t\t</select></label></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t  \r\n\t\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t\t<th width=\"73\" height=\"24\" class=\"title\" scope=\"row\">소유구분</th>\r\n\t\t\t\t\t\t\t<td width=\"147\"><label for=\"select\"><select class=\"tb147\" id=\"ownGubun\" name=\"ownGubun\" onChange=\"goResult3();\">\r\n\t\t\t\t\t\t\t  <option value=\"all\" selected>전체</option>\r\n\t\t\t\t\t\t\t  <option value=\"1\">개인</option>\r\n\t\t\t\t\t\t\t  <option value=\"5\">구유지</option>\r\n\t\t\t\t\t\t\t  <option value=\"2\">국유지</option>\r\n\t\t\t\t\t\t\t  <option value=\"4\">시유지</option>\t\t\t\t\t\t\t  \r\n\t\t\t\t\t\t\t  <option value=\"9\">기타</option>\r\n\t\t\t\t\t\t\t</select></label></td>\r\n\t\t\t\t\t\t  </tr>\r\n\t\t\t\t\t\t</table>\r\n\t\t\t\t\t</td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"1\" bgcolor=\"dddddd\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\t  <tr>\r\n\t\t\t<td>\t\t\t\r\n\t\t\t\t<table width=\"250\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<th height=\"35\" valign=\"bottom\" scope=\"col\"><img src=\"/rams/images/map/l_st_area.gif\" alt=\"검색\" width=\"250\" height=\"29\" /></th>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td><img src=\"/rams/images/map/area1.gif\" alt=\"영역지정설명\" /></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td height=\"1\" bgcolor=\"dddddd\"></td>\r\n\t\t\t\t  </tr>\r\n\t\t\t  </table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t\r\n\t\r\n\t\t</table>\r\n\t  </td>\r\n    </tr>\r\n  </table>\r\n  \r\n</div>\r\n</body>\r\n</html>\r\n";
}
