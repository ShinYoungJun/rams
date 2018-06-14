package jeus_jspwork._jsp._suit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_suit_5fprice_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(45,26);to=(45,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LAWSUITPRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(46,26);to=(46,43)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.UNFAIRPROFIT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(56,15);to=(56,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(140,63);to=(140,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(141,51);to=(141,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(186,65);to=(186,79)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(188,53);to=(188,68)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(192,65);to=(192,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.SUITLAND}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(196,53);to=(196,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LAWSUITAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(198,53);to=(198,61)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.SUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(203,88);to=(203,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LAWSUITPRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(207,88);to=(207,105)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.UNFAIRPROFIT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template33);
      // jsp code [from=(256,78);to=(256,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.UNFAIRPROFIT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(257,77);to=(257,93)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LAWSUITAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(258,121);to=(258,134)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${viewListCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(259,119);to=(259,132)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${viewListCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(260,129);to=(260,142)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${viewListCount}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${viewList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("viewList");
    _jspx_th_c_forEach_0.setVarStatus("idx");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template19);
            // jsp code [from=(240,78);to=(240,95)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.UNFAIRPROFIT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(241,77);to=(241,93)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LAWSUITAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(242,74);to=(242,91)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${viewList.STARTDAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(242,141);to=(242,152)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count-1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(243,72);to=(243,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${viewList.ENDDAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(243,137);to=(243,148)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count-1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(244,70);to=(244,83)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${viewList.RATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(244,145);to=(244,156)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count-1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);
            // jsp code [from=(245,72);to=(245,87)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${viewList.DAYCNT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template28);
            // jsp code [from=(246,69);to=(246,81)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${viewList.SUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template29);
            // jsp code [from=(247,76);to=(247,95)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${viewList.REGISTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(250,58);to=(250,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${viewList.LAWSUITSEQ}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(251,103);to=(251,114)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${idx.count-1}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendarSuitView.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction priceViewModify(){\r\n\tdocument.getElementById(\"viewMode\").innerHTML = \r\n\t\t\"<img src='/rams/images/common/btn_save.gif' alt='소가저장' width='62' height='19' onclick='priceViewSave()' style='cursor:pointer;'/>&nbsp;&nbsp;\"+\r\n\t\t\"<img src='/rams/images/common/btn_cancel.gif' alt='소가취소' width='62' height='19' onclick='priceViewCancel()' style='cursor:pointer;'/>\";\r\n\tvar lawSuitPrice = document.getElementById(\"LAWSUITPRICE\");\r\n\tvar unfairProfit = document.getElementById(\"UNFAIRPROFIT\");\r\n\t\r\n\tlawSuitPrice.style.border = '1px solid #9a9a9a';\r\n\tunfairProfit.style.border = '1px solid #9a9a9a';\r\n\tlawSuitPrice.readOnly = false;\r\n\tunfairProfit.readOnly = false;\r\n\t\r\n}\r\n\r\nfunction priceViewSave(){\r\n\t\r\n\tif(!confirm(\"수정하시겠습니까?\")){\r\n        return;\r\n    }\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_price_view_modify.do\";\r\n\tform.submit();\r\n}\r\n\r\nfunction priceViewCancel(){\r\n\tdocument.getElementById(\"viewMode\").innerHTML = \r\n\t\t\"<img src='/rams/images/common/btn_modify2.gif' alt='소가수정' width='62' height='19' onclick='priceViewModify()' style='cursor:pointer;'/>\";\r\n\t\t\r\n\tvar lawSuitPrice = document.getElementById(\"LAWSUITPRICE\");\r\n\tvar unfairProfit = document.getElementById(\"UNFAIRPROFIT\");\r\n\tlawSuitPrice.value = '";
  private final static String _jspx_template7 = "';\r\n\tunfairProfit.value = '";
  private final static String _jspx_template8 = "';\r\n\tlawSuitPrice.style.border = '0px solid #9a9a9a';\r\n\tunfairProfit.style.border = '0px solid #9a9a9a';\r\n\tlawSuitPrice.readOnly = true;\r\n\tunfairProfit.readOnly = true;\r\n\t\t\r\n\t\t\r\n}\r\n\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template9 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\nfunction calRawSuitPrice(idx){\r\n\tvar unFairProfitArr = document.getElementsByName(\"UNFAIRPROFIT_ARR\");\r\n\tvar lawSuitAreaArr = document.getElementsByName(\"LAWSUITAREA_ARR\");\r\n\tvar startDayArr = document.getElementsByName(\"STARTDAY_ARR\");\r\n\tvar endDayArr = document.getElementsByName(\"ENDDAY_ARR\");\r\n\tvar rateArr = document.getElementsByName(\"RATE_ARR\");\r\n\tvar dayCntArr = document.getElementsByName(\"DAYCNT_ARR\");\r\n\tvar sumArr = document.getElementsByName(\"SUM_ARR\");\r\n\tvar statusArr = document.getElementsByName(\"STATUS_ARR\");\r\n\t\r\n\tvar startDay = removeDash(startDayArr[idx].value);\r\n\tvar endDay = removeDash(endDayArr[idx].value);\r\n\t\r\n\tif(startDay == ''){\r\n\t\t\r\n\t\treturn;\r\n\t}else if(endDay == ''){\r\n\t\t\r\n\t\treturn;\r\n\t}else if(startDay >= endDay){\r\n\t\talert(\"기간종료일이 시작일보다 커야합니다.\");\r\n\t\treturn;\r\n\t}\r\n\t\r\n\tdayCntArr[idx].value = getDiffDay(startDay,endDay);\r\n\t\r\n\tvar day = dayCntArr[idx].value/365;\r\n\tvar unfairProfit = removeComma(unFairProfitArr[idx].value);\r\n\tvar rate;\r\n\t\r\n\tif(!rateArr[idx].value == ''){\r\n\t\trate = rateArr[idx].value/100;\r\n\t}else{\r\n\t\trate = 0;\r\n\t\trateArr[idx].value = '0';\r\n\t}\r\n\t\r\n\tsumArr[idx].value = insertComma2(Math.floor(fixFloatCal(unfairProfit*rate*day)));\r\n\t\r\n\tif(statusArr[idx].value != 'add'){\r\n\t\tstatusArr[idx].value = 'modify';\r\n\t}\r\n}\r\n\r\nfunction goSave(){\r\n\t\r\n\tif(!confirm(\"저장하시겠습니까?\")){\r\n        return;\r\n    }\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_price_view_list_save.do\";\r\n\tform.submit();\r\n}\r\n\r\nfunction goDelete(idx){\r\n\tif(!confirm(\"삭제하시겠습니까?\")){\r\n        return;\r\n    }\r\n\t\r\n\tvar affairNum = document.getElementById(\"AFFAIRNUM\");\r\n\tvar pnu = document.getElementById(\"PNU\");\r\n\tvar lawSuitSeq_arr = document.getElementsByName(\"LAWSUITSEQ_ARR\");\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_price_view_list_delete.do?LAWSUITSEQ=\"+lawSuitSeq_arr[idx].value;\r\n\tform.submit();\r\n\t\r\n}\r\n\r\n\r\n</script>\r\n</head>\r\n<body onload=\"init();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<input id=\"AFFAIRNUM\" name=\"AFFAIRNUM\" type=\"hidden\" value=\"";
  private final static String _jspx_template10 = "\" />\r\n<input id=\"PNU\" name=\"PNU\" type=\"hidden\" value=\"";
  private final static String _jspx_template11 = "\" />\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > <a href=\"#\" class=\"blue1\">소송정보관리</a> > <strong>소가관리</strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <!-- 검색 -->\r\n  <div>\r\n    <h2><img src=\"/rams/images/suit/tt02.gif\" alt=\"소송정보관리_소가 관리\" /></h2>\t\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><a href=\"/rams/suit/suit_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image23','','/rams/images/suit/02tab01_on.gif',1)\"><img src=\"/rams/images/suit/02tab01_off.gif\" alt=\"소송정보\" name=\"Image23\" width=\"91\" height=\"29\" border=\"0\" id=\"Image23\" /></a></td>\r\n          <td width=\"91\"><img src=\"/rams/images/suit/02tab02_on.gif\" alt=\"소가 관리\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/suit/suit_anal_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image14','','/rams/images/suit/02tab03_on.gif',1)\"><img src=\"/rams/images/suit/02tab03_off.gif\" alt=\"통계\" name=\"Image14\" border=\"0\" id=\"Image14\" /></a></td>\r\n          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t<div class=\"list\">\r\n\t\r\n\t\r\n\t  <!-- 소가 조회 -->\r\n\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont2\"><img src=\"/rams/images/suit/st_srch3.gif\" alt=\"소가 조회\" width=\"66\" height=\"19\" /></th>\r\n\t\t  <td width=\"140\" align=\"right\" class=\"cont2\">\r\n\t\t  <div id=\"viewMode\" style=\"width:140\">\r\n\t\t  \t<img src='/rams/images/common/btn_modify2.gif' alt='소가수정' width='62' height='19' onclick='priceViewModify()' style='cursor:pointer;' />\r\n\t\t  </div>\r\n\t\t  </td>\r\n\t    </tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">사건 번호</th>\r\n\t\t\t\t<td width=\"286\" style=\"text-align:left;padding-left:10px\">";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">사건 명 </th>\r\n\t\t\t\t<td style=\"text-align:left;padding-left:10px\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">사건 토지</th>\r\n\t\t\t\t<td colspan=\"3\" style=\"text-align:left;padding-left:10px\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"row\">사건 면적(㎡)</th>\r\n\t\t\t\t<td style=\"text-align:left;padding-left:10px\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">이윤 합계 </th>\r\n\t\t\t\t<td style=\"text-align:left;padding-left:10px\">";
  private final static String _jspx_template16 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"row\">소가</th>\r\n\t\t\t\t<td style=\"text-align:left;padding-left:5px\">\r\n\t\t\t\t<input id=\"LAWSUITPRICE\" name=\"LAWSUITPRICE\" type=\"text\" class=\"formBox7\" value=\"";
  private final static String _jspx_template17 = "\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"fn_addComma(this)\" maxlength=\"13\" style=\"border:0px;\" readonly=\"readonly\"/>\r\n\t\t\t\t</td>\r\n\t\t\t\t<th scope=\"row\">부당이득금 </th>\r\n\t\t\t\t<td style=\"text-align:left;padding-left:5px\">\r\n\t\t\t\t<input id=\"UNFAIRPROFIT\" name=\"UNFAIRPROFIT\" type=\"text\" class=\"formBox7\" value=\"";
  private final static String _jspx_template18 = "\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"fn_addComma(this)\" maxlength=\"13\" style=\"border:0px;\" readonly=\"readonly\"/>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <br/>\r\n\t  <br/>\r\n\t  <!-- 관련 이윤 상세 정보 -->\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont2\"><img src=\"/rams/images/suit/st_info.gif\" alt=\"관련 이윤 상세 정보\"/></th>\r\n\t\t  <td width=\"70\" align=\"right\" class=\"cont2\"><img src=\"/rams/images/common/btn_save.gif\" alt=\"저장\" width=\"62\" height=\"19\" onclick=\"goSave();\" style=\"cursor:pointer;\" /></td>\r\n\t    </tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"90\" scope=\"row\">부당이득금</th>\r\n\t\t\t\t<th width=\"90\" scope=\"row\">사건 면적(㎡)</th>\r\n\t\t\t\t<th width=\"110\" scope=\"row\">기간(시작)</th>\r\n\t\t\t\t<th width=\"110\" scope=\"row\">기간(종료)</th>\r\n\t\t\t\t<th width=\"70\" scope=\"row\">이율(%)</th>\r\n\t\t\t\t<th width=\"90\" scope=\"row\">일수</th>\r\n\t\t\t\t<th width=\"93\" scope=\"row\">합계</th>\r\n\t\t\t\t<th width=\"90\" scope=\"row\">등록일자</th>\r\n\t\t\t\t<th width=\"70\" scope=\"row\">삭  제</th>\r\n\t\t\t  </tr>\r\n\t\t\t\t";
  private final static String _jspx_template19 = "\r\n\t\t\t\t<tr>\r\n\t\t\t\t<td><input name=\"UNFAIRPROFIT_ARR\" type=\"text\" class=\"formBox7\" value=\"";
  private final static String _jspx_template20 = "\" style=\"border:0px;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"LAWSUITAREA_ARR\" type=\"text\" class=\"formBox7\" value=\"";
  private final static String _jspx_template21 = "\" style=\"border:0px;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"STARTDAY_ARR\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template22 = "\" onclick=\"popUpCalendar(this,this,'yyyymmdd','";
  private final static String _jspx_template23 = "')\" style=\"cursor:pointer;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"ENDDAY_ARR\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template24 = "\" onclick=\"popUpCalendar(this,this,'yyyymmdd','";
  private final static String _jspx_template25 = "')\" style=\"cursor:pointer;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"RATE_ARR\" type=\"text\" class=\"formBox9\" value=\"";
  private final static String _jspx_template26 = "\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"calRawSuitPrice('";
  private final static String _jspx_template27 = "');\" style=\"text-align:center;\" /></td>\r\n\t\t\t\t<td><input name=\"DAYCNT_ARR\" type=\"text\" class=\"formBox7\" value=\"";
  private final static String _jspx_template28 = "\" style=\"border:0px;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"SUM_ARR\" type=\"text\" class=\"formBox7\" value=\"";
  private final static String _jspx_template29 = "\" style=\"border:0px;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"REGISTDATE_ARR\" type=\"text\" class=\"formBox7\" value=\"";
  private final static String _jspx_template30 = "\" style=\"border:0px;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input name=\"STATUS_ARR\" type=\"hidden\" value=\"\"/>\r\n\t\t\t\t\t<input name=\"LAWSUITSEQ_ARR\" type=\"hidden\" value=\"";
  private final static String _jspx_template31 = "\"/>\r\n\t\t\t\t\t<img src=\"/rams/images/common/btn_del3.gif\" alt=\"삭제\" width=\"62\" height=\"19\" onclick=\"goDelete('";
  private final static String _jspx_template32 = "');\" style=\"cursor:pointer;\" />\r\n\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t";
  private final static String _jspx_template33 = "\r\n\t\t\t\t<tr>\r\n\t\t\t\t<td><input name=\"UNFAIRPROFIT_ARR\" type=\"text\" class=\"formBox7\" value=\"";
  private final static String _jspx_template34 = "\" style=\"border:0px;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"LAWSUITAREA_ARR\" type=\"text\" class=\"formBox7\" value=\"";
  private final static String _jspx_template35 = "\" style=\"border:0px;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"STARTDAY_ARR\" type=\"text\" class=\"formBox2\" value=\"\" onclick=\"popUpCalendar(this,this,'yyyymmdd','";
  private final static String _jspx_template36 = "')\" style=\"cursor:pointer;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"ENDDAY_ARR\" type=\"text\" class=\"formBox2\" value=\"\" onclick=\"popUpCalendar(this,this,'yyyymmdd','";
  private final static String _jspx_template37 = "')\" style=\"cursor:pointer;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"RATE_ARR\" type=\"text\" class=\"formBox9\" value=\"\" onKeyDown=\"onlyNumberInput();\" onkeyup=\"calRawSuitPrice('";
  private final static String _jspx_template38 = "');\"  style=\"text-align:center;\" /></td>\r\n\t\t\t\t<td><input name=\"DAYCNT_ARR\" type=\"text\" class=\"formBox7\" value=\"\" style=\"border:0px;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"SUM_ARR\" type=\"text\" class=\"formBox7\" value=\"\" style=\"border:0px;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td><input name=\"REGISTDATE_ARR\" type=\"text\" class=\"formBox7\" value=\"\" style=\"border:0px;text-align:center;\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<td>\r\n\t\t\t\t\t<input name=\"STATUS_ARR\" type=\"hidden\" value=\"add\"/>\r\n\t\t\t\t</td>\r\n\t\t\t\t</tr>\r\n\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <td height=\"24\" align=\"right\" class=\"cont2\">\r\n\t\t  \t<img src=\"/rams/images/common/btn_list2.gif\" alt=\"목록\" width=\"62\" height=\"19\" onclick=\"location.href='/rams/suit/suit_price_list.do'\" style=\"cursor:pointer;\" />\r\n\t\t  </td>\r\n\t    </tr>\r\n\t  </table>\t  \r\n\t</div>\r\n  </div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
