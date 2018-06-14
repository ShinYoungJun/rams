package jeus_jspwork._jsp._reward;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_reward_5fstatus_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(34,15);to=(34,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(48,59);to=(48,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${COMPEID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(49,51);to=(49,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(50,61);to=(50,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${JUMINNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(91,36);to=(91,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.JUMINNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(97,24);to=(97,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.GOSIID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(99,24);to=(99,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.CONSTNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(103,36);to=(103,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.GUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(107,24);to=(107,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(107,55);to=(107,77)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(107,86);to=(107,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(107,113);to=(107,135)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(109,24);to=(109,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.JIMOK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(113,24);to=(113,51)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.AFFAIRAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(115,24);to=(115,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(131,36);to=(131,65)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.OFFICENAME_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(133,24);to=(133,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.DANGA_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(137,24);to=(137,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.JUDGEPRICE_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(139,24);to=(139,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.POINTDATE_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(143,24);to=(143,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.OFFICENAME_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(145,24);to=(145,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.DANGA_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(149,24);to=(149,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.JUDGEPRICE_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(151,24);to=(151,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.POINTDATE_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(168,102);to=(168,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.ASSIGNDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(177,71);to=(177,82)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ISACQUIRE_N}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(179,72);to=(179,83)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ISACQUIRE_Y}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(187,99);to=(187,119)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardStatusView.ETC}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script type=\"text/javascript\">\r\nfunction goModify(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/reward/reward_status_modify.do\";\r\n\tform.submit();\r\n}\r\n\r\n\r\nfunction goCancel(){\r\n\tvar isAcquire = document.getElementsByName(\"ISACQUIRE\");\r\n\tfor(var i = 0; i < isAcquire.length;i++ ){\r\n\t\tif(isAcquire[i].value == 'N'){\r\n\t\t\tisAcquire[i].checked = true;\r\n\t\t}else{\r\n\t\t\tisAcquire[i].checked = false;\r\n\t\t}\r\n\t\t\r\n\t}\r\n\tdocument.getElementById(\"ASSIGNDATE\").value = \"\";\r\n\tdocument.getElementById(\"ETC\").value = \"\";\r\n}\r\n\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\n</script>\r\n</head>\r\n\r\n<body onload=\"init()\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<input type=\"hidden\" id=\"COMPEID\" name=\"COMPEID\" value=\"";
  private final static String _jspx_template8 = "\" />\r\n<input type=\"hidden\" id=\"PNU\" name=\"PNU\" value=\"";
  private final static String _jspx_template9 = "\" />\r\n<input type=\"hidden\" id=\"JUMINNUM\" name=\"JUMINNUM\" value=\"";
  private final static String _jspx_template10 = "\" />\r\n\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"../images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > 보상용지 관리 <a href=\"#\" class=\"blue1\"></a> > <strong>현황관리</strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <div>\r\n    <h2><img src=\"../images/reward/tt03.gif\" alt=\"보상용지관리_현황관리\"/></h2>\r\n   \r\n   \r\n    <!-- 탭 메뉴 -->\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><a href=\"/rams/reward/reward_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image22','','../images/reward/tab01_on.gif',1)\"><img src=\"../images/reward/tab01_off.gif\" alt=\"미불보상용지\" name=\"Image22\" width=\"91\" height=\"29\" border=\"0\" id=\"Image22\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_review_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image23','','../images/reward/tab02_on.gif',1)\"><img src=\"../images/reward/tab02_off.gif\" alt=\"보상 심의/사실조사\" name=\"Image23\" width=\"91\" height=\"29\" border=\"0\" id=\"Image23\" /></a></td>\r\n          <td width=\"91\"><img src=\"../images/reward/tab03_on.gif\" alt=\"현황관리\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_anal_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','../images/reward/tab04_on.gif',1)\"><img src=\"../images/reward/tab04_off.gif\" alt=\"통계\" name=\"Image20\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_own_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','/rams/images/reward/tab05_on.gif',1)\"><img src=\"/rams/images/reward/tab05_off.gif\" alt=\"토지소유현황\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td background=\"../images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t<div class=\"list\"> \r\n\t  <h3><img src=\"../images/reward/st_manage.gif\" alt=\"보상용지 현황관리\" /></h3>\r\n\t  \r\n\t  \r\n\t  <!-- 토지정보 -->\r\n\t  <h4><img src=\"../images/suit/st_ground.gif\" alt=\"토지정보\" width=\"60\" height=\"11\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">대상자 성명 </th>\r\n\t\t\t\t<td width=\"274\" class=\"cont\">";
  private final static String _jspx_template11 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">주민번호</th>\r\n\t\t\t\t<td class=\"cont\">&nbsp;</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">고시번호</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t\t<th scope=\"col\">공사명</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">구분</th>\r\n\t\t\t\t<td class=\"cont\" colspan=\"3\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">토지</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template15 = "&nbsp;";
  private final static String _jspx_template16 = "&nbsp;";
  private final static String _jspx_template17 = "-";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t<th scope=\"col\">지목</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">지적(㎡)</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t<th scope=\"col\">보상결정사유</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <!-- 평가정보 -->\r\n\t  <h4><img src=\"../images/reward/sst_info2.gif\" alt=\"평가정보\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">평가기관</th>\r\n\t\t\t\t<td width=\"274\" class=\"cont\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">단가</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">금액</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template24 = "</td>\r\n\t\t\t\t<th scope=\"col\">가격시점</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template25 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">평가기관</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t\t<th scope=\"col\">단가</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template27 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">금액</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template28 = "</td>\r\n\t\t\t\t<th scope=\"col\">가격시점</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template29 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <h4></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">배정일자</th>\r\n\t\t\t\t<td width=\"274\" class=\"cont\">\r\n\t\t\t\t\t<table width=\"160\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"120\"><input id=\"ASSIGNDATE\" name=\"ASSIGNDATE\" type=\"text\" class=\"formBox1\" value=\"";
  private final static String _jspx_template30 = "\" /></td>\r\n\t\t\t\t\t\t<td class=\"cont\"><img src=\"../images/suit/cal.gif\" alt=\"달력\" onclick=\"popUpCalendar(this,ASSIGNDATE,'yyyymmdd')\" style=\"cursor:pointer;\"/></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">취득보고</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<table width=\"150\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"55\"><input type=\"radio\" name=\"ISACQUIRE\" value=\"N\" ";
  private final static String _jspx_template31 = "/>\r\n\t\t\t\t\t\t미보고</td>\r\n\t\t\t\t\t\t<td width=\"100\"><input type=\"radio\" name=\"ISACQUIRE\" value=\"Y\" ";
  private final static String _jspx_template32 = "/>\r\n\t\t\t\t\t\t보고</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">비고</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\"><input id=\"ETC\" name=\"ETC\" type=\"text\" class=\"formBox8\" value=\"";
  private final static String _jspx_template33 = "\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table> \r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td height=\"40\" align=\"right\"><a href=\"#\" onclick=\"goModify();\"><img src=\"../images/common/btn_save.gif\" alt=\"저장\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t  <td width=\"70\" align=\"right\"><a href=\"#\" onclick=\"goCancel();\"><img src=\"../images/common/btn_cancel.gif\" alt=\"취소\" width=\"62\" height=\"19\" border=\"0\"/></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</div>\r\n  </div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
