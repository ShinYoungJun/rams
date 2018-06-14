package jeus_jspwork._jsp._gongsa;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_gongsa_5fmodify_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template12);
      // jsp code [from=(45,62);to=(45,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CONSTNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(65,136);to=(65,147)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.GOSIID}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(67,142);to=(67,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.ANNPERMISSION }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(72,126);to=(72,140)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.LINENAME }",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(84,71);to=(84,88)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.STARTSECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(85,69);to=(85,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.ENDSECTION}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(90,172);to=(90,187)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.CONSTPLACE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(96,83);to=(96,97)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.STARTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(101,79);to=(101,91)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.ENDDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(109,85);to=(109,96)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.REASON}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(128,134);to=(128,143)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(130,138);to=(130,151)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.JUMINNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(134,121);to=(134,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(136,125);to=(136,137)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.POSTNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(140,166);to=(140,175)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(158,75);to=(158,89)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.PLAN_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(173,79);to=(173,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.NOTICE_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(190,77);to=(190,92)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.PRINT_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(207,73);to=(207,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.ETC_FILE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${constCategList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("constCategList");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template7);
            // jsp code [from=(27,8);to=(27,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${constCategList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);
            // jsp code [from=(28,33);to=(28,56)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${constCategList.CODEDESC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(28,62);to=(28,86)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${constCategList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(29,32);to=(29,47)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${bean.CONSTCATEG}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction goModifyPrc(){\r\n\tdocument.form.submit();\r\n}\r\n\r\nfunction goCancel(){\r\n\tvar form = document.form;\r\n\tform.action = '/rams/gongsa/gongsa_detail.do?CONSTNUM='+document.getElementById(\"CONSTNUM\");\r\n\tform.submit();\r\n}\r\n\r\nfunction init(){\r\n\t\r\n\tvar constCateg = document.getElementById(\"CONSTCATEG\");\r\n    ";
  private final static String _jspx_template7 = "\r\n\tif('";
  private final static String _jspx_template8 = "' != ''){\r\n    \tnew_option = new Option('";
  private final static String _jspx_template9 = "','";
  private final static String _jspx_template10 = "');\r\n    \tif(new_option.value == '";
  private final static String _jspx_template11 = "'){\r\n    \t\tnew_option.selected = true;\r\n    \t}\r\n    \tconstCateg.options.add(new_option);\r\n\t}\r\n\t";
  private final static String _jspx_template12 = "\r\n}\r\n\r\n</script>\r\n\r\n\r\n\r\n</head>\r\n\r\n<body onload=\"init();\">\r\n<form name=\"form\" method=\"post\" action=\"/rams/gongsa/gongsa_modify_prc.do\" enctype=\"multipart/form-data\">\r\n\t<input type=\"hidden\" id=\"CONSTNUM\" name=\"CONSTNUM\" value=\"";
  private final static String _jspx_template13 = "\" />\r\n\t<!-- 검색 -->\r\n   <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n    \t\t<td height=\"26\" align=\"right\" valign=\"bottom\">\r\n    \t\t\t<a href=\"#\" onclick=\"goModifyPrc();\"><img src=\"/rams//images/common/btn_save.gif\" alt=\"저장\" width=\"62\" height=\"19\" border=\"0\" /></a>\r\n    \t\t\t&nbsp;\r\n    \t\t\t<a href=\"#\" onclick=\"goCancel();\"><img src=\"/rams//images/common/btn_cancel.gif\" alt=\"취소\" width=\"62\" height=\"19\" border=\"0\" /></a>\r\n\t\t\t</td>\r\n    \t</tr>\r\n    </table>\r\n\t\r\n\t<!-- 공사시행내역 상세 -->\r\n\t  <h4><img src=\"/rams/images/register/st_detailed.gif\" alt=\"공사시행내역 상세\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th style=\"width:150px;\" scope=\"col\">실시계획인가고시</th>\r\n\t\t\t\t<td style=\"width:253px;text-align:left;padding-left:10px;\" class=\"cont\"><input name=\"GOSIID\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template14 = "\" readonly=\"readonly\"/></td>\r\n\t\t\t\t<th style=\"width:150px;\" scope=\"col\">공사시행허가 내용공고 </th>\r\n\t\t\t\t<td style=\"width:260px;text-align:left;padding-left:10px\" class=\"cont\"><input name=\"ANNPERMISSION\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template15 = "\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">도로의 종류(노선명)</th>\r\n\t\t\t\t<td style=\"text-align:left;padding-left:10px;\" class=\"cont\"><input name=\"LINENAME\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template16 = "\" /></td>\r\n\t\t\t\t<th scope=\"col\">공사의 종류</th>\r\n\t\t\t\t<td style=\"text-align:left;padding-left:10px;\" class=\"cont\">\r\n\t\t\t\t  \t<select id=\"CONSTCATEG\" name=\"CONSTCATEG\" class=\"formBox1\">\r\n\t\t\t\t  \t\t<option value=\"\">:::선택:::</option>\r\n\t\t\t\t  \t</select>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">공사구간</th>\r\n\t\t\t\t<td style=\"width:663px;text-align:left;padding-left:10px;\" colspan=\"3\" class=\"cont\">\r\n\t\t\t\t\t<input name=\"STARTSECTION\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template17 = "\" />부터\r\n\t\t\t\t\t<input name=\"ENDSECTION\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template18 = "\" />까지\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">공사장소</th>\r\n\t\t\t\t<td style=\"width:663px;text-align:left;padding-left:10px;\" colspan=\"3\" class=\"cont\"><input name=\"CONSTPLACE\" type=\"text\" style=\"width:650px\" class=\"formBox6\" value=\"";
  private final static String _jspx_template19 = "\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">착수일</th>\r\n\t\t\t\t<td style=\"text-align:left;padding-left:10px;\" class=\"cont\">\r\n\t\t\t\t\t<input id=\"STARTDATE\" name=\"STARTDATE\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template20 = "\"/>\r\n\t\t\t\t\t<a href=\"#\" onclick=\"popUpCalendar(this, document.getElementById('STARTDATE'), 'yyyymmdd');\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" border=\"0\" /></a>\r\n\t\t\t\t</td>\r\n\t\t\t\t<th scope=\"col\">준공일</th>\r\n\t\t\t\t<td style=\"text-align:left;padding-left:10px;\" class=\"cont\">\r\n\t\t\t\t\t<input id=\"ENDDATE\" name=\"ENDDATE\" type=\"text\" class=\"formBox2\" value=\"";
  private final static String _jspx_template21 = "\"/>\r\n\t\t\t\t\t<a href=\"#\" onclick=\"popUpCalendar(this, document.getElementById('ENDDATE'), 'yyyymmdd');\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" border=\"0\" /></a>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  \r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">공사사유</th>\r\n\t\t\t\t<td style=\"width:663px;text-align:left;padding-left:10px;\" colspan=\"3\" class=\"cont\">\r\n\t\t\t\t\t<input name=\"REASON\" type=\"text\" style=\"width:650px\" class=\"formBox6\" value=\"";
  private final static String _jspx_template22 = "\" />\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <br/>\r\n\t  <br/>\r\n\t  \r\n\t  <!-- 공사시행자(신청인) -->\r\n\t  <h4><img src=\"/rams/images/register/st_pp.gif\" alt=\"공사시행자(신청인)\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th style=\"width:150px;\" scope=\"col\">성명(회사명)</th>\r\n\t\t\t\t<td style=\"width:253px;text-align:left;padding-left:10px;\" class=\"cont\"><input name=\"NAME\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template23 = "\" /></td>\r\n\t\t\t\t<th style=\"width:150px;\" scope=\"col\">주민등록번호<br/>(사업자등록번호)</th>\r\n\t\t\t\t<td style=\"width:260px;text-align:left;padding-left:10px;\" class=\"cont\"><input name=\"JUMINNUM\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template24 = "\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">연락처</th>\r\n\t\t\t\t<td style=\"text-align:left;padding-left:10px;\" class=\"cont\"><input name=\"TEL\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template25 = "\" /></td>\r\n\t\t\t\t<th scope=\"col\">우편번호</th>\r\n\t\t\t\t<td style=\"text-align:left;padding-left:10px;\" class=\"cont\"><input name=\"POSTNUM\" type=\"text\" class=\"formBox6\" value=\"";
  private final static String _jspx_template26 = "\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">주소</th>\r\n\t\t\t\t<td style=\"width:663px;text-align:left;padding-left:10px;\" colspan=\"3\" class=\"cont\"><input name=\"ADDR\" type=\"text\" style=\"width:650px\" class=\"formBox6\" value=\"";
  private final static String _jspx_template27 = "\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\r\n\t  <!-- 첨부자료 -->\r\n\t  <h4><img src=\"/rams/images/register/st_data.gif\" alt=\"첨부자료\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th style=\"width:150px;\" scope=\"col\">사업계획서</th>\r\n\t\t\t\t<td style=\"width:253px;text-align:left;padding-left:10px;\" class=\"cont\">\r\n\t\t\t\t\t<table width=\"244px\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"160px\"><input id=\"PLAN\" name=\"PLAN\" type=\"text\" value=\"";
  private final static String _jspx_template28 = "\"  class=\"formBox6\" style=\"width:90%\" readonly=\"readonly\"/></td>\r\n\t\t\t\t\t\t<td width=\"42px\"><div style=\"background-image:url(/rams/images/common/btn_add4.gif);width:42px;height:19px;overflow:hidden;\">\r\n\t\t\t\t\t\t <input type=\"file\" name=\"PLAN_FILE\" style=\"border:0;background-color:white;width:62px;filter:alpha(opacity=0)\" onchange=\"document.getElementById('PLAN').value=this.value\">\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"42px\">\r\n\t\t\t\t\t\t\t<img src=\"/rams//images/common/btn_del5.gif\" alt=\"삭제\" width=\"42px\" height=\"19px\" onclick=\"document.getElementById('PLAN').value=''\" style=\"border:0px;cursor:pointer;\"/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<th style=\"width:150px;\" scope=\"col\">도로공사시행허가 내용공고 </th>\r\n\t\t\t\t<td style=\"width:260px;text-align:left;padding-left:10px;\" class=\"cont\">\r\n\t\t\t\t\t<table width=\"244px\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"150px\"><input id=\"NOTICE\" name=\"NOTICE\" type=\"text\" value=\"";
  private final static String _jspx_template29 = "\"  class=\"formBox6\" style=\"width:90%\" readonly=\"readonly\"/></td>\r\n\t\t\t\t\t\t<td width=\"42px\"><div style=\"background-image:url(/rams/images/common/btn_add4.gif);width:42px;height:19px;overflow:hidden;\">\r\n\t\t\t\t\t\t <input type=\"file\" name=\"NOTICE_FILE\" style=\"border:0;background-color:white;width:62px;filter:alpha(opacity=0)\" onchange=\"document.getElementById('NOTICE').value=this.value\">\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"42px\">\r\n\t\t\t\t\t\t\t<img src=\"/rams//images/common/btn_del5.gif\" alt=\"삭제\" width=\"42px\" height=\"19px\" onclick=\"document.getElementById('NOTICE').value=''\" style=\"border:0px;cursor:pointer;\"/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">도면자료</th>\r\n\t\t\t\t<td style=\"width:663px;text-align:left;padding-left:10px;\" colspan=\"3\" class=\"cont\">\r\n\t\t\t\t\t<table width=\"474px\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"390px\"><input id=\"PRINT\" name=\"PRINT\" type=\"text\" value=\"";
  private final static String _jspx_template30 = "\"  class=\"formBox6\" style=\"width:90%\" readonly=\"readonly\"/></td>\r\n\t\t\t\t\t\t<td width=\"42px\"><div style=\"background-image:url(/rams/images/common/btn_add4.gif);width:42px;height:19px;overflow:hidden;\">\r\n\t\t\t\t\t\t <input type=\"file\" name=\"PRINT_FILE\" style=\"border:0;background-color:white;width:62px;filter:alpha(opacity=0)\" onchange=\"document.getElementById('PRINT').value=this.value\">\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"42px\">\r\n\t\t\t\t\t\t\t<img src=\"/rams//images/common/btn_del5.gif\" alt=\"삭제\" width=\"42px\" height=\"19px\" onclick=\"document.getElementById('PRINT').value=''\" style=\"border:0px;cursor:pointer;\"/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">기타자료</th>\r\n\t\t\t\t<td style=\"width:663px;text-align:left;padding-left:10px;\" colspan=\"3\" class=\"cont\">\r\n\t\t\t\t\t<table width=\"474px\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t<td width=\"390px\"><input id=\"ETC\" name=\"ETC\" type=\"text\" value=\"";
  private final static String _jspx_template31 = "\"  class=\"formBox6\" style=\"width:90%\" readonly=\"readonly\"/></td>\r\n\t\t\t\t\t\t<td width=\"42px\"><div style=\"background-image:url(/rams/images/common/btn_add4.gif);width:42px;height:19px;overflow:hidden;\">\r\n\t\t\t\t\t\t <input type=\"file\" name=\"ETC_FILE\" style=\"border:0;background-color:white;width:62px;filter:alpha(opacity=0)\" onchange=\"document.getElementById('ETC').value=this.value\">\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"42px\">\r\n\t\t\t\t\t\t\t<img src=\"/rams//images/common/btn_del5.gif\" alt=\"삭제\" width=\"42px\" height=\"19px\" onclick=\"document.getElementById('ETC').value=''\" style=\"border:0px;cursor:pointer;\"/>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\r\n</form>\r\n</body>\r\n</html>\r\n";
}
