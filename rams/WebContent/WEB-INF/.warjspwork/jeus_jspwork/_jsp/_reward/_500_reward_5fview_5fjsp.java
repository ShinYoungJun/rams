package jeus_jspwork._jsp._reward;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_reward_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(12,15);to=(12,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(92,40);to=(92,57)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.COMPEID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(103,36);to=(103,52)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.GOSIID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(105,30);to=(105,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.CONSTNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(115,24);to=(115,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(115,48);to=(115,63)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(115,72);to=(115,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(115,92);to=(115,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(115,154);to=(115,171)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.COMPEID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(115,177);to=(115,190)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(119,24);to=(119,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.JIMOK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(123,24);to=(123,44)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.AFFAIRAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(125,30);to=(125,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(141,36);to=(141,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.OFFICENAME_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(143,24);to=(143,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.DANGA_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(147,24);to=(147,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.JUDGEPRICE_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(149,24);to=(149,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.POINTDATE_1}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(153,24);to=(153,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.OFFICENAME_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(155,24);to=(155,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.DANGA_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(159,24);to=(159,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.JUDGEPRICE_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(161,24);to=(161,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.POINTDATE_2}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(184,11);to=(184,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(184,35);to=(184,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(184,59);to=(184,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(184,79);to=(184,94)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(185,11);to=(185,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.JIMOK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(186,11);to=(186,31)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.AFFAIRAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(187,11);to=(187,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.UNITPRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(188,11);to=(188,29)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.TOTPRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(189,11);to=(189,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(204,36);to=(204,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(206,24);to=(206,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.JUMINNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(210,36);to=(210,53)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.ADDRESS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(223,81);to=(223,98)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.COMPEID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(223,104);to=(223,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template46);
      // jsp code [from=(241,105);to=(241,122)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.COMPEID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(241,128);to=(241,141)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeFileList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("compeFileList");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template42);
            // jsp code [from=(232,67);to=(232,89)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeFileList.FILENAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(232,95);to=(232,103)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(232,106);to=(232,116)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${rewardPath}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(232,123);to=(232,145)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeFileList.FILENAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);

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
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\nfunction goDown(filename,filepath){\r\n\tvar url = \"/rams/jsp/common/file_down.jsp?filename=\"+filename+\"&filepath=\"+filepath;\r\n\tvar form = document.form;\r\n\tform.action = url;\r\n\tform.submit();\r\n}\r\n\r\nfunction goMody(num,pnu){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/reward/reward_view_mody.do?COMPEID=\"+num+\"&PNU=\"+pnu;\r\n\tform.submit();\r\n}\r\n\r\nfunction goFilePop(compeId,pnu){\r\n\twindow.open('/rams/reward/reward_file_pop.do?COMPEID='+compeId+'&PNU='+pnu,'관련자료관리','toolbar=no,status=no,menubar=no,width=437,height=400');\r\n}\r\n\r\n\r\nfunction goLandPop(compeid,pnu){\r\n\t\r\n    window.open(\"/rams/reward/pop_reward_land.do?COMPEID=\"+compeid+\"&PNU=\"+pnu,'보상토지관리','toolbar=no,status=no,menubar=no,width=815,height=400');\r\n}\r\n\r\nfunction goRightPop(compeid){\r\n\tpopWindow('/rams/reward/pop_reward_right.do?COMPEID='+compeid,'gonsaPop','800','500','no','no');\r\n//\twindow.open('/rams/reward/pop_reward_gongsa.do', 'gonsaPop', 'top=100px, left=100px, height=500px, width=800px');\r\n}\r\n\r\n</script>\r\n</head>\r\n\r\n<body onload=\"init();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<iframe id=\"fileDown\" style=\"visibility:hidden;\" src=\"\" width=\"1\" height=\"1\"></iframe>\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > 보상용지 관리 <a href=\"#\" class=\"blue1\"></a> > <strong>미불보상용지 </strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <div>\r\n    <h2><img src=\"/rams/images/reward/tt01.gif\" alt=\"보상용지관리_미불보상용지\" width=\"184\" height=\"22\" /></h2>\r\n   \r\n   \r\n    <!-- 탭 메뉴 -->\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><img src=\"/rams/images/reward/tab01_on.gif\" alt=\"미불보상용지\" width=\"91\" height=\"29\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_review_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image16','','/rams/images/reward/tab02_on.gif',1)\"><img src=\"/rams/images/reward/tab02_off.gif\" alt=\"보상심의/사실조사\" name=\"Image16\" width=\"91\" height=\"29\" border=\"0\" id=\"Image16\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_status_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image19','','/rams/images/reward/tab03_on.gif',1)\"><img src=\"/rams/images/reward/tab03_off.gif\" alt=\"현황관리\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image19\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_anal_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','/rams/images/reward/tab04_on.gif',1)\"><img src=\"/rams/images/reward/tab04_off.gif\" alt=\"통계\" name=\"Image20\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_own_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','/rams/images/reward/tab05_on.gif',1)\"><img src=\"/rams/images/reward/tab05_off.gif\" alt=\"토지소유현황\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t\r\n\t<div class=\"list\">\r\n\t  <h3><img src=\"/rams/images/reward/st_info.gif\" alt=\"미불 보상용지 상세정보\" /></h3>\r\n\t  \r\n\t  \r\n\t  <!-- 토지정보 -->\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont2\"><img src=\"/rams/images/suit/st_ground.gif\" alt=\"토지정보\" width=\"60\" height=\"11\" /></th>\r\n\t\t  <td align=\"right\" class=\"cont2\"><!-- \r\n\t\t  <a href=\"#\" onclick=\"goRightPop('";
  private final static String _jspx_template8 = "');\"><img src=\"/rams/images/reward/btn_see.gif\" alt=\"권리권자정보보기\" width=\"100\" height=\"19\" border=\"0\" /></a>\r\n\t\t   -->\r\n\t\t  </td>\r\n\t    </tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">고시(관보)</th>\r\n\t\t\t\t<td width=\"274\" class=\"cont\">";
  private final static String _jspx_template9 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">공사대장</th>\r\n\t\t\t\t<td class=\"cont\">&nbsp;";
  private final static String _jspx_template10 = "</td>\r\n\t\t\t  </tr>\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">토지상황</th>\r\n\t\t\t\t<td width=\"274\" class=\"cont\">&nbsp;</td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">출처</th>\r\n\t\t\t\t<td width=\"289\" class=\"cont\">&nbsp;</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">토지</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template11 = "&nbsp;";
  private final static String _jspx_template12 = "&nbsp;";
  private final static String _jspx_template13 = "-";
  private final static String _jspx_template14 = "&nbsp;&nbsp;<a href=\"#\" onclick=\"goLandPop('";
  private final static String _jspx_template15 = "','";
  private final static String _jspx_template16 = "');\"><img src=\"/rams/images/common/btn_more.gif\" alt=\"사건토지 더보기\" border=\"0\" align=\"absmiddle\"/></a>\r\n\r\n\t\t\t\t</td>\r\n\t\t\t\t<th scope=\"col\">지목</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">지적(㎡)</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t<th scope=\"col\">보상결정사유</th>\r\n\t\t\t\t<td class=\"cont\">&nbsp;";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <!-- 평가정보 -->\r\n\t  <h4><img src=\"/rams/images/reward/sst_info2.gif\" alt=\"평가정보\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">평가기관</th>\r\n\t\t\t\t<td width=\"274\" class=\"cont\">";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">단가</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">금액</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t<th scope=\"col\">가격시점</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">평가기관</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template24 = "</td>\r\n\t\t\t\t<th scope=\"col\">단가</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template25 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">금액</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t\t<th scope=\"col\">가격시점</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template27 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <!-- 감정평가 -->\r\n\t  <h4><img src=\"/rams/images/reward/sst_test.gif\" alt=\"감정평가\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th WIDTH=\"150\" scope=\"col\">소재지</th>\r\n\t\t\t\t<th width=\"80\" scope=\"col\">지목</th>\r\n\t\t\t\t<th width=\"80\" scope=\"col\">지적(㎡)</th>\r\n\t\t\t\t<th width=\"80\" scope=\"col\">단가</th>\r\n\t\t\t\t<th width=\"80\" scope=\"col\">금액</th>\r\n\t\t\t\t<th scope=\"col\">보상결정사유</th>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<td>";
  private final static String _jspx_template28 = "&nbsp;";
  private final static String _jspx_template29 = "&nbsp;";
  private final static String _jspx_template30 = "-";
  private final static String _jspx_template31 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template32 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template33 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template34 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template35 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template36 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <h4></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">신청자 성명 </th>\r\n\t\t\t\t<td width=\"274\" class=\"cont\">";
  private final static String _jspx_template37 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">주민번호</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template38 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">주소</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">";
  private final static String _jspx_template39 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <!-- 평가정보 -->\r\n\t  \r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont\"><h4><img src=\"/rams/images/reward/sst_data.gif\" alt=\"관련자료\" width=\"60\" height=\"11\" /></h4></th>\r\n\t\t  <td width=\"62\" align=\"right\" class=\"cont\"><a href=\"#\" onclick=\"goFilePop('";
  private final static String _jspx_template40 = "','";
  private final static String _jspx_template41 = "');\"><img src=\"/rams/images/common/btn_add5.gif\" alt=\"제출자료\" border=\"0\"/></a></td>\r\n\t    </tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t  \t";
  private final static String _jspx_template42 = "\r\n\t\t  \t  <tr>\r\n\t\t\t\t<td class=\"cont\"><a href=\"#\" class=\"blue1\" onclick=\"goDown('";
  private final static String _jspx_template43 = "','";
  private final static String _jspx_template44 = "')\">";
  private final static String _jspx_template45 = "</a></td>\r\n\t\t\t  </tr>\r\n\t\t  \t";
  private final static String _jspx_template46 = "\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td height=\"34\" align=\"right\" valign=\"bottom\"><a href=\"#\" style=\"cursor:pointer\" onclick=\"goMody('";
  private final static String _jspx_template47 = "','";
  private final static String _jspx_template48 = "');\"><img src=\"/rams/images/common/btn_modify.gif\" alt=\"수정\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t  <td width=\"70\" align=\"right\" valign=\"bottom\"><a href=\"/rams/reward/reward_list.do\"><img src=\"/rams/images/common/btn_list2.gif\" alt=\"목록\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n    </div>\r\n  </div>\r\n</div>\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
}
