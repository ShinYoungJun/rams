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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=euc-kr\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<style type=\"text/css\">\r\n<!--\r\n#sM01 {\r\n\tposition:absolute;\r\n\tleft:275px;\r\n\ttop:53px;\r\n\twidth:331px;\r\n\theight:20px;\r\n\tz-index:1;\r\n\tvisibility: hidden;\r\n\tpadding-top:2px;\r\n}\r\n#sM02 {\r\n\tposition:absolute;\r\n\tleft:341px;\r\n\ttop:53px;\r\n\twidth:187px;\r\n\theight:20px;\r\n\tz-index:1;\r\n\tvisibility: hidden;\r\n\tpadding-top:2px;\r\n}\r\n#sM03 {\r\n\tposition:absolute;\r\n\tleft:400px;\r\n\ttop:53px;\r\n\twidth:331px;\r\n\theight:20px;\r\n\tz-index:1;\r\n\tvisibility: hidden;\r\n\tpadding-top:2px;\r\n}\r\n#sM05 {\r\n\tposition:absolute;\r\n\tleft:495px;\r\n\ttop:53px;\r\n\twidth:365px;\r\n\theight:20px;\r\n\tz-index:1;\r\n\tvisibility: hidden;\r\n\tpadding-top:2px;\r\n}\r\n.style1 {color: #0083cd}\r\n-->\r\n</style>\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script type=\"text/javascript\">\r\n//메인페이지 이동\r\nfunction moveMenu(num,link){\r\n\tvar authur = '";
  private final static String _jspx_template7 = "';\r\n\t\r\n\tif(authur != null & authur.indexOf(num) < 0){\r\n\t\talert('사용자 권한이 없습니다.');\r\n\t\treturn;\r\n\t}\r\n\t\r\n\tvar _mainFrm = document.getElementById(\"main\");\r\n\t_mainFrm.src = link;\r\n}\r\n//메인페이지 리사이즈\r\nfunction iFrameResize(obj)\r\n{\r\n\tvar iFrm = obj;\r\n\r\n\t//width 추가 : 지도가 안 떠서 추가 다른 페이지에는 영향을 미치지 않는 것 같음 - 한웅 수정\t\t\t\r\n\tvar the_height = iFrm.contentWindow.document.body.scrollHeight+30;\r\n\tvar the_width = iFrm.contentWindow.document.body.scrollWidth;\r\n\t\r\n\tiFrm.style.height = the_height;\r\n\tiFrm.style.width = the_width;\r\n}\r\n\r\n\r\nfunction logOut(){\r\n\tif(!confirm(\"로그아웃 하시겠습니까?\")){\r\n        return;\r\n    }\r\n\tlocation.href=\"/rams/admin/user/logout.do\";\r\n\t\r\n}\r\n\r\n\r\n</script>\r\n\r\n</head>\r\n\r\n<body>\r\n\t<div id=\"top\">\r\n\t  <table width=\"874\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t\t<th height=\"21\" align=\"right\" scope=\"row\"><span class=\"style1\">";
  private final static String _jspx_template8 = "</span></th>\r\n\t\t\t<td width=\"85\" align=\"left\">님 환영합니다. </td>\r\n\t\t\t<td align=\"right\" width=\"70\"><a href=\"#\" onclick=\"logOut();\"><img src=\"/rams/images/common/logout.gif\" alt=\"로그아웃\" border=\"0\" /></a></td>\r\n\t\t\t<td class=\"manage\" width=\"95\" align=\"right\"><a href=\"#\" onclick=\"moveMenu('0','/rams/admin/user/user_manager.do');\" class=\"blue1\">관리자</a>ㅣ<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('','/rams/board/board_list.do');\">게시판</a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"854\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t      <td rowspan=\"2\" scope=\"row\" width=\"260\" height=\"54\"><img src=\"/rams/images/common/logo.gif\" alt=\"서울시도로재산관리정보시스템\" /></td>\r\n\t      <td><a href=\"#\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image23','','/rams/images/common/mm01_on.gif',1)\"><img src=\"/rams/images/common/mm01_off.gif\" alt=\"시유지조회\" name=\"Image23\" width=\"107\" height=\"33\" border=\"0\" id=\"Image23\" onmouseover=\"MM_showHideLayers('sM01','','show')\" onmouseout=\"MM_showHideLayers('sM01','','hide')\" /></a></td>\r\n\t      <td><a href=\"#\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image18','','/rams/images/common/mm02_on.gif',1)\"><img src=\"/rams/images/common/mm02_off.gif\" alt=\"소송정보관리\" name=\"Image18\" width=\"122\" height=\"33\" border=\"0\" id=\"Image18\" onmouseover=\"MM_showHideLayers('sM02','','show')\" onmouseout=\"MM_showHideLayers('sM02','','hide')\" /></a></td>\r\n\t      <td><a href=\"#\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image4','','/rams/images/common/mm03_on.gif',1)\"><img src=\"/rams/images/common/mm03_off.gif\" alt=\"보상용지관리\" name=\"Image4\" width=\"123\" height=\"33\" border=\"0\" id=\"Image4\" onmouseover=\"MM_showHideLayers('sM03','','show')\" onmouseout=\"MM_showHideLayers('sM03','','hide')\" /></a></td>\r\n\t      <td><a href=\"#\" onclick=\"moveMenu('4','/rams/gongsa/gongsa_list.do');\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image17','','/rams/images/common/mm04_on.gif',1)\"><img src=\"/rams/images/common/mm04_off.gif\" alt=\"공사대장 조회\" name=\"Image17\" width=\"129\" height=\"33\" border=\"0\" id=\"Image17\" /></a></td>\r\n\t      <td><a href=\"#\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image7','','/rams/images/common/mm05_on.gif',1)\"><img src=\"/rams/images/common/mm05_off.gif\" alt=\"의사결정지원\" name=\"Image7\" width=\"113\" height=\"33\" border=\"0\" id=\"Image7\" onmouseover=\"MM_showHideLayers('sM05','','show')\" onmouseout=\"MM_showHideLayers('sM05','','hide')\" /></a></td>\r\n\t    </tr>\r\n\t    <tr>\r\n\t      <td colspan=\"5\" class=\"subMenu\">&nbsp;</td>\r\n\t    </tr>\r\n\t  </table>\r\n\t</div>\t\r\n\t\r\n\t<div id=\"cont01\">\r\n\t  <table width=\"854\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t  \t<tr>\r\n\t\t  \t<td>\r\n\t\t  \t\t<iframe width=\"100%\" height=\"100%\" id=\"main\" name=\"main\" frameborder=\"0\" scrolling=\"no\" src=\"/rams/cityland/permiss_list.do\" onload=\"iFrameResize(this)\">\r\n\t\t  \t\t</iframe>\r\n\t\t  \t</td>\r\n\t  \t</tr>\r\n\t  </table>\r\n\t</div>\r\n\t<div id=\"sM01\" onmouseover=\"MM_showHideLayers('sM01','','show')\" onmouseout=\"MM_showHideLayers('sM01','','hide')\">\r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('1','/rams/cityland/permiss_list.do');\">대부사용허가 </a>ㅣ \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('1','/rams/cityland/dis_list.do');\">처분재산 </a>ㅣ \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('1','/rams/cityland/moodan_list.do');\">무단점사용 </a>ㅣ \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('1','/rams/cityland/base_list.do');\">재산정보</a>ㅣ\r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('1','/rams/cityland/history_list.do');\">재산이력</a>\r\n\t</div>\r\n\t<div id=\"sM02\" onmouseover=\"MM_showHideLayers('sM02','','show')\" onmouseout=\"MM_showHideLayers('sM02','','hide')\">\r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('2','/rams/suit/suit_list.do');\">소송정보 </a>ㅣ \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('2','/rams/suit/suit_price_list.do');\">소가관리 </a>ㅣ \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('2','/rams/suit/suit_anal_list.do');\">통계</a>\r\n\t</div>\r\n\t<div id=\"sM03\" onmouseover=\"MM_showHideLayers('sM03','','show')\" onmouseout=\"MM_showHideLayers('sM03','','hide')\">\r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('3','/rams/reward/reward_list.d";
  private final static String _jspx_template9 = "o');\">미불보상용지 </a>ㅣ \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('3','/rams/reward/reward_review_list.do');\">보상 심의/사실조사 </a>ㅣ \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('3','/rams/reward/reward_status_list.do');\">현황관리 </a>ㅣ \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('3','/rams/reward/reward_anal_list.do');\">통계</a>ㅣ  \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('3','/rams/reward/reward_own_list.do');\">토지소유현황</a>\r\n\t</div>\r\n\t<div id=\"sM05\" onmouseover=\"MM_showHideLayers('sM05','','show')\" onmouseout=\"MM_showHideLayers('sM05','','hide')\">\r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('5','/rams/map/map.do?selectMap=juckji');\">적지분석 </a>ㅣ \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('5','/rams/map/map.do?selectMap=unReward')\">미불보상용지분석 </a>ㅣ \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('5','/rams/map/map.do?selectMap=suitBiz')\">소송업무지원 </a>ㅣ \r\n\t\t<a href=\"#\" class=\"blue1\" onclick=\"moveMenu('5','/rams/map/map.do?selectMap=reward')\">보상업무지원</a>\r\n\t</div>\r\n\r\n\r\n</body>\r\n\r\n</html>\r\n\r\n";
}
