package jeus_jspwork._jsp._reward;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_reward_5freview_5fwrite_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(48,42);to=(48,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(49,47);to=(49,56)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${INVESTID }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(50,46);to=(50,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${COMPEID }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(91,36);to=(91,59)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewViewBean.REQDATE }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(96,86);to=(96,112)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewViewBean.INVESTDATE }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(104,36);to=(104,62)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewViewBean.CP_ADDRESS }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(108,24);to=(108,47)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewViewBean.CP_NAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(110,24);to=(110,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewViewBean.CP_TEL }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(134,11);to=(134,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewbean.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(134,39);to=(134,58)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewbean.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(134,67);to=(134,87)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewbean.BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(134,91);to=(134,110)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewbean.BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(135,11);to=(135,30)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewbean.JIMOK}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(136,11);to=(136,35)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewbean.AFFAIRAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(137,11);to=(137,32)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewbean.ISFIXED}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(138,11);to=(138,33)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewbean.TOTPRICE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(139,11);to=(139,28)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewbean.ETC}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_0_fn(pageContext, null)) return;


      out.write(_jspx_template25);
      // ----  c:if ---- invoke //
      if (_jspx_th_c_if_1_fn(pageContext, null)) return;


      out.write(_jspx_template27);
      // jsp code [from=(171,82);to=(171,104)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewViewBean.REASON }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template34);

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
  private boolean _jspx_th_c_if_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_0.setPageContext(pageContext);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ reviewViewBean.COMPEYN eq 'Y'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template24);

        } while (_jspx_th_c_if_0.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_0.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_0.release();
    }
    return false;
  }

  private boolean _jspx_th_c_if_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:if ---- //
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = new org.apache.taglibs.standard.tag.rt.core.IfTag();
    _jspx_th_c_if_1.setPageContext(pageContext);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${ reviewViewBean.COMPEYN eq 'N'}", java.lang.Boolean.class , pageContext.getVariableResolver(), null)).booleanValue());
    try {
      int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
      if (_jspx_eval_c_if_1 != Tag.SKIP_BODY) {
        do {
          out.write(_jspx_template26);

        } while (_jspx_th_c_if_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
      }
      if (_jspx_th_c_if_1.doEndTag() == Tag.SKIP_PAGE)
        return true;
    } finally {
      _jspx_th_c_if_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_0_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_0.setPageContext(pageContext);
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewFileList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("reviewFileList");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template29);
            // jsp code [from=(187,56);to=(187,79)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewFileList.FILENAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template30);
            // jsp code [from=(187,85);to=(187,93)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(187,96);to=(187,107)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${discussPath}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template31);
            // jsp code [from=(187,114);to=(187,137)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewFileList.FILENAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template32);
            // jsp code [from=(188,68);to=(188,89)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${reviewFileList.FILEID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template33);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script type=\"text/javascript\">\r\nfunction goWritePrc(){\r\n\r\n\tdocument.form.action = '/rams/reward/reward_review_write_prc.do';\r\n\tdocument.form.submit();\r\n\t\r\n\tvar isTrue = false;\r\n\t\r\n\tif(isTrue){\r\n\t\tif(confirm(\"등록 하시겠습니까?\")){\r\n\t\t\tdocument.form.submit();\r\n\t\t}\r\n\t}\r\n\r\n}\r\n\r\nfunction goDown(filename,filepath){\r\n\tvar url = \"/rams/jsp/common/file_down.jsp?filename=\"+filename+\"&filepath=\"+filepath;\r\n\tvar form = document.form;\r\n\tform.action = url;\r\n\tform.submit();\r\n}\r\n\r\nfunction goDel(fileid){\r\n\t\r\n\tif(confirm(\"심의자료를 삭제하시겠습니까?\")){\r\n\t\tdocument.form.action = '/rams/reward/reward_discuss_file_del.do?FILEID='+fileid;\r\n\t\tdocument.form.submit();\r\n\t}\r\n\t\r\n\r\n}\r\n\r\n</script>\r\n</head>\r\n<body>\r\n<form name=\"form\" method=\"post\" action=\"/rams/reward/reward_review_write_prc.do\" enctype=\"multipart/form-data\">\r\n<input type=\"hidden\" name=\"PNU\" value=\"";
  private final static String _jspx_template7 = "\" />\r\n<input type=\"hidden\" name=\"INVESTID\" value=\"";
  private final static String _jspx_template8 = "\" />\r\n<input type=\"hidden\" name=\"COMPEID\" value=\"";
  private final static String _jspx_template9 = "\" />\r\n\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"../images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > 보상용지 관리 <a href=\"#\" class=\"blue1\"></a> > <strong>보상 심의/사실조사</strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <div>\r\n    <h2><img src=\"../images/reward/tt02.gif\" alt=\"보상용지관리_미불보상용지\"/></h2>\r\n   \r\n   \r\n    <!-- 탭 메뉴 -->\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><a href=\"/rams/reward/reward_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image22','','../images/reward/tab01_on.gif',1)\"><img src=\"../images/reward/tab01_off.gif\" alt=\"미불보상용지\" name=\"Image22\" width=\"91\" height=\"29\" border=\"0\" id=\"Image22\" /></a></td>\r\n          <td width=\"91\"><img src=\"../images/reward/tab02_on.gif\" alt=\"보상 심의/사실조사\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_status_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image19','','../images/reward/tab03_on.gif',1)\"><img src=\"../images/reward/tab03_off.gif\" alt=\"현황관리\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image19\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_anal_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','../images/reward/tab04_on.gif',1)\"><img src=\"../images/reward/tab04_off.gif\" alt=\"통계\" name=\"Image20\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_own_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','/rams/images/reward/tab05_on.gif',1)\"><img src=\"/rams/images/reward/tab05_off.gif\" alt=\"토지소유현황\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td background=\"../images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\r\n\r\n      \r\n\t  <h3><img src=\"../images/reward/st_rm.gif\" alt=\"보상심의 및 사실조사 등록/수정\" /></h3>\r\n\t  <!-- 신청자 -->\r\n\t  <h4><img src=\"../images/reward/sst_applicant.gif\" alt=\"신청자\" width=\"51\" height=\"11\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">신청일자</th>\r\n\t\t\t\t<td width=\"274\" class=\"cont\">";
  private final static String _jspx_template10 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">심의일자 </th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<table width=\"160\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"120\"><input name=\"INVESTDATE\" type=\"text\" class=\"formBox1\" value=\"";
  private final static String _jspx_template11 = "\"/></td>\r\n\t\t\t\t\t\t<td class=\"cont\"><img src=\"../images/suit/cal.gif\" alt=\"달력\" width=\"19\" height=\"15\" border=\"0\" onclick=\"popUpCalendar(this,INVESTDATE,'yyyymmdd')\" style=\"cursor:pointer;\"/></a></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">신청인 주소</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">신청인 성명 </th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t<th scope=\"col\">연락처 </th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  \r\n\t  <!-- 토지 -->\r\n\t  <h4><img src=\"../images/suit/st_ground2.gif\" alt=\"토지\" width=\"41\" height=\"11\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">소재지번</th>\r\n\t\t\t\t<th scope=\"col\">지목</th>\r\n\t\t\t\t<th scope=\"col\">면적(㎡)</th>\r\n\t\t\t\t<th scope=\"col\">근저당여부</th>\r\n\t\t\t\t<th scope=\"col\">보상액</th>\r\n\t\t\t\t<th scope=\"col\">비고</th>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<td>";
  private final static String _jspx_template15 = "&nbsp;";
  private final static String _jspx_template16 = "&nbsp;";
  private final static String _jspx_template17 = "-";
  private final static String _jspx_template18 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template19 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \t  \r\n\t  <!-- 심의의결 결과관리 -->\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont2\"><img src=\"../images/reward/sst_manage.gif\" alt=\"심의의결 결과관리\" width=\"101\" height=\"11\" /></th>\r\n\t\t  <td width=\"90\" align=\"right\" class=\"cont2\"><!-- <a href=\"#\"><img src=\"../images/reward/btn_see2.gif\" alt=\"신청자료보기\" border=\"0\"/></a> --></td>\r\n\t    </tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">보상 여부</th>\r\n\t\t\t\t<td class=\"cont\" >\r\n\t\t\t\t\t<table width=\"150\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"50\"><input type=\"radio\" name=\"COMPEYN\" value=\"Y\" ";
  private final static String _jspx_template24 = "checked=\"checked\"";
  private final static String _jspx_template25 = "/>가결</td>\r\n\t\t\t\t\t\t<td><input type=\"radio\" name=\"COMPEYN\" value=\"N\" ";
  private final static String _jspx_template26 = "checked=\"checked\"";
  private final static String _jspx_template27 = "/>부결</td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t  </table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">보상부결사유 </th>\r\n\t\t\t\t<td class=\"cont\" ><input name=\"REASON\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template28 = "\"/></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">의결서 등록 </th>\r\n\t\t\t\t<td class=\"cont\" ><p>&nbsp;</p>\r\n\t\t\t\t  <table width=\"400\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                  <tr>\r\n                    <td width=\"180\"><input id=\"reviewFile\" name=\"reviewFile\" type=\"text\" class=\"formBox6\" readonly=\"readonly\"/></td>\r\n                    <td class=\"cont\">\r\n                    \t<div style=\"background-image:url(/rams/images/common/btn_add4.gif);width:42px;height:19px;overflow:hidden;\">\r\n\t\t\t\t\t\t <input type=\"file\" name=\"DISCUSS_FILE\" style=\"border:0;background-color:white;width:62px;filter:alpha(opacity=0)\" onchange=\"document.getElementById('reviewFile').value=this.value\">\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td>\r\n                  </tr>\r\n                ";
  private final static String _jspx_template29 = "\r\n                  <tr>\r\n                    <td><a href=\"#\" onclick=\"goDown('";
  private final static String _jspx_template30 = "','";
  private final static String _jspx_template31 = "')\">";
  private final static String _jspx_template32 = "</a></td>\r\n                    <td class=\"cont\"><a href=\"#\" onclick=\"goDel('";
  private final static String _jspx_template33 = "')\"><img src=\"../images/common/btn_del5.gif\" alt=\"삭제\" width=\"42\" height=\"19\" border=\"0\"/></a></td>\r\n                  </tr>\r\n\t\t\t  \t";
  private final static String _jspx_template34 = "\r\n                </table>\r\n\t\t\t    <p>&nbsp;</p></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td height=\"34\" align=\"right\"><a href=\"#\" onclick=\"goWritePrc();\"><img src=\"/rams/images/common/btn_save.gif\" alt=\"저장\" width=\"62\" height=\"19\" border=\"0\" class=\"cont2\" /></a></td>\r\n\t\t  <td width=\"70\" align=\"right\"><a href=\"#\" onclick=\"javascript:form.reset();\"><img src=\"/rams/images/common/btn_cancel.gif\" alt=\"취소\" width=\"62\" height=\"19\" border=\"0\" class=\"cont2\" /></a></td>\r\n\t\t  <td width=\"70\" align=\"right\"><a href=\"/rams/reward/reward_review_list.do\"><img src=\"/rams/images/common/btn_list2.gif\" alt=\"목록\" width=\"62\" height=\"19\" border=\"0\" class=\"cont2\" /></a></td>\r\n\t\t</tr>\r\n      </table>\r\n  </div>\r\n  </div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
