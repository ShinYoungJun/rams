package jeus_jspwork._jsp._admin._main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_main_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(58,18);to=(58,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userAuthur}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(99,69);to=(99,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${userName}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      out.write(_jspx_template9);

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
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: ����� �����������ý��� :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<style type=\"text/css\">\r\n<!--\r\n#sM01 {\r\n\tposition:absolute;\r\n\tleft:275px;\r\n\ttop:53px;\r\n\twidth:331px;\r\n\theight:20px;\r\n\tz-index:1;\r\n\tvisibility: hidden;\r\n\tpadding-top:2px;\r\n}\r\n#sM02 {\r\n\tposition:absolute;\r\n\tleft:341px;\r\n\ttop:53px;\r\n\twidth:187px;\r\n\theight:20px;\r\n\tz-index:1;\r\n\tvisibility: hidden;\r\n\tpadding-top:2px;\r\n}\r\n#sM03 {\r\n\tposition:absolute;\r\n\tleft:400px;\r\n\ttop:53px;\r\n\twidth:331px;\r\n\theight:20px;\r\n\tz-index:1;\r\n\tvisibility: hidden;\r\n\tpadding-top:2px;\r\n}\r\n#sM05 {\r\n\tposition:absolute;\r\n\tleft:495px;\r\n\ttop:53px;\r\n\twidth:365px;\r\n\theight:20px;\r\n\tz-index:1;\r\n\tvisibility: hidden;\r\n\tpadding-top:2px;\r\n}\r\n.style1 {color: #0083cd}\r\n-->\r\n</style>\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script type=\"text/javascript\">\r\n//���������� �̵�\r\nfunction moveMenu(num,link){\r\n\tvar authur = '";
  private final static String _jspx_template7 = "';\r\n\t\r\n\tif(authur != null & authur.indexOf(num) < 0){\r\n\t\talert('����� ������ �����ϴ�.');\r\n\t\treturn;\r\n\t}\r\n\t\r\n\tvar _mainFrm = document.getElementById(\"main\");\r\n\t_mainFrm.src = link;\r\n}\r\n//���������� ��������\r\nfunction iFrameResize(obj)\r\n{\r\n\tvar iFrm = obj;\r\n\r\n\t//width �߰� : ������ �� ���� �߰� �ٸ� ���������� ������ ��ġ�� �ʴ� �� ���� - �ѿ� ����\t\t\t\r\n\tvar the_height = iFrm.contentWindow.document.body.scrollHeight+30;\r\n\tvar the_width = iFrm.contentWindow.document.body.scrollWidth;\r\n\t\r\n\tiFrm.style.height = the_height;\r\n\tiFrm.style.width = the_width;\r\n}\r\n\r\n\r\nfunction logOut(){\r\n\tif(!confirm(\"�α׾ƿ� �Ͻðڽ��ϱ�?\")){\r\n        return;\r\n    }\r\n\tlocation.href=\"/rams/admin/user/logout.do\";\r\n\t\r\n}\r\n\r\n\r\n</script>\r\n\r\n</head>\r\n\r\n<body>\r\n\t<div id=\"top\">\r\n\t  <table width=\"874\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t\t<th height=\"21\" align=\"right\" scope=\"row\"><span class=\"style1\">";
  private final static String _jspx_template8 = "</span></th>\r\n\t\t\t<td width=\"85\" align=\"left\">�� ȯ���մϴ�. </td>\r\n\t\t\t<td align=\"right\" width=\"70\"><a href=\"#\" onclick=\"logOut();\"><img src=\"/rams/images/common/logout.gif\" alt=\"�α׾ƿ�\" border=\"0\" /></a></td>\r\n\t\t\t<td class=\"manage\" width=\"95\" align=\"right\"><a href=\"#\" onclick=\"moveMenu('0','/rams/admin/user/user_manager.do');\" class=\"blue1\">������</a>��<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('','/rams/board/board_list.do');\">�Խ���</a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"854\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t      <td rowspan=\"2\" scope=\"row\" width=\"260\" height=\"54\"><img src=\"/rams/images/common/logo.gif\" alt=\"����õ��������������ý���\" /></td>\r\n\t      <td><a href=\"#\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image23','','/rams/images/common/mm01_on.gif',1)\"><img src=\"/rams/images/common/mm01_off.gif\" alt=\"��������ȸ\" name=\"Image23\" width=\"107\" height=\"33\" border=\"0\" id=\"Image23\" onmouseover=\"MM_showHideLayers('sM01','','show')\" onmouseout=\"MM_showHideLayers('sM01','','hide')\" /></a></td>\r\n\t      <td><a href=\"#\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image18','','/rams/images/common/mm02_on.gif',1)\"><img src=\"/rams/images/common/mm02_off.gif\" alt=\"�Ҽ���������\" name=\"Image18\" width=\"122\" height=\"33\" border=\"0\" id=\"Image18\" onmouseover=\"MM_showHideLayers('sM02','','show')\" onmouseout=\"MM_showHideLayers('sM02','','hide')\" /></a></td>\r\n\t      <td><a href=\"#\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image4','','/rams/images/common/mm03_on.gif',1)\"><img src=\"/rams/images/common/mm03_off.gif\" alt=\"�����������\" name=\"Image4\" width=\"123\" height=\"33\" border=\"0\" id=\"Image4\" onmouseover=\"MM_showHideLayers('sM03','','show')\" onmouseout=\"MM_showHideLayers('sM03','','hide')\" /></a></td>\r\n\t      <td><a href=\"#\" onclick=\"moveMenu('4','/rams/gongsa/gongsa_list.do');\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image17','','/rams/images/common/mm04_on.gif',1)\"><img src=\"/rams/images/common/mm04_off.gif\" alt=\"������� ��ȸ\" name=\"Image17\" width=\"129\" height=\"33\" border=\"0\" id=\"Image17\" /></a></td>\r\n\t      <td><a href=\"#\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image7','','/rams/images/common/mm05_on.gif',1)\"><img src=\"/rams/images/common/mm05_off.gif\" alt=\"�ǻ��������\" name=\"Image7\" width=\"113\" height=\"33\" border=\"0\" id=\"Image7\" onmouseover=\"MM_showHideLayers('sM05','','show')\" onmouseout=\"MM_showHideLayers('sM05','','hide')\" /></a></td>\r\n\t    </tr>\r\n\t    <tr>\r\n\t      <td colspan=\"5\" class=\"subMenu\">&nbsp;</td>\r\n\t    </tr>\r\n\t  </table>\r\n\t</div>\t\r\n\t\r\n\t<div id=\"cont01\">\r\n\t  <table width=\"854\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t  \t<tr>\r\n\t\t  \t<td>\r\n\t\t  \t\t<iframe width=\"100%\" height=\"100%\" id=\"main\" name=\"main\" frameborder=\"0\" scrolling=\"no\" src=\"/rams/cityland/permiss_list.do\" onload=\"iFrameResize(this)\">\r\n\t\t  \t\t</iframe>\r\n\t\t  \t</td>\r\n\t  \t</tr>\r\n\t  </table>\r\n\t</div>\r\n\t<div id=\"sM01\" onmouseover=\"MM_showHideLayers('sM01','','show')\" onmouseout=\"MM_showHideLayers('sM01','','hide')\">\r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('1','/rams/cityland/permiss_list.do');\">��λ���㰡 </a>�� \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('1','/rams/cityland/dis_list.do');\">ó����� </a>�� \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('1','/rams/cityland/moodan_list.do');\">��������� </a>�� \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('1','/rams/cityland/base_list.do');\">�������</a>��\r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('1','/rams/cityland/history_list.do');\">����̷�</a>\r\n\t</div>\r\n\t<div id=\"sM02\" onmouseover=\"MM_showHideLayers('sM02','','show')\" onmouseout=\"MM_showHideLayers('sM02','','hide')\">\r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('2','/rams/suit/suit_list.do');\">�Ҽ����� </a>�� \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('2','/rams/suit/suit_price_list.do');\">�Ұ����� </a>�� \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('2','/rams/suit/suit_anal_list.do');\">���</a>\r\n\t</div>\r\n\t<div id=\"sM03\" onmouseover=\"MM_showHideLayers('sM03','','show')\" onmouseout=\"MM_showHideLayers('sM03','','hide')\">\r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('3','/rams/reward/reward_list.d";
  private final static String _jspx_template9 = "o');\">�̺Һ������ </a>�� \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('3','/rams/reward/reward_review_list.do');\">���� ����/������� </a>�� \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('3','/rams/reward/reward_status_list.do');\">��Ȳ���� </a>�� \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('3','/rams/reward/reward_anal_list.do');\">���</a>��  \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('3','/rams/reward/reward_own_list.do');\">����������Ȳ</a>\r\n\t</div>\r\n\t<div id=\"sM05\" onmouseover=\"MM_showHideLayers('sM05','','show')\" onmouseout=\"MM_showHideLayers('sM05','','hide')\">\r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('5','/rams/map/map.do?selectMap=juckji');\">�����м� </a>�� \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('5','/rams/map/map.do?selectMap=unReward')\">�̺Һ�������м� </a>�� \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('5','/rams/map/map.do?selectMap=suitBiz')\">�Ҽ۾������� </a>�� \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('5','/rams/map/map.do?selectMap=reward')\">�����������</a>\r\n\t</div>\r\n\r\n\r\n</body>\r\n\r\n</html>\r\n\r\n";
}
