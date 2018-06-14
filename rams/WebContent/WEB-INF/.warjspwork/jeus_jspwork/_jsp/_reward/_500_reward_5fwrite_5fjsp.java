package jeus_jspwork._jsp._reward;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_reward_5fwrite_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      out.write(_jspx_template13);
      out.write(_jspx_template14);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template18);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_2_fn(pageContext, null)) return;


      out.write(_jspx_template28);
      out.write(_jspx_template29);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("guList");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template7);
            // jsp code [from=(22,9);to=(22,21)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);
            // jsp code [from=(23,31);to=(23,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);
            // jsp code [from=(23,49);to=(23,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template10);
            // jsp code [from=(24,30);to=(24,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${compeView.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

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

  private boolean _jspx_th_c_forEach_1_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_1.setPageContext(pageContext);
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jimokList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("jimokView");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template15);
            // jsp code [from=(313,26);to=(313,45)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jimokView.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(313,50);to=(313,68)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${jimokView.CODEDESC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);

          } while (_jspx_th_c_forEach_1.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_1.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_1.doCatch(t);
      } finally {
        _jspx_th_c_forEach_1.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_1.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_2_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_2.setPageContext(pageContext);
    _jspx_th_c_forEach_2.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_2.setVar("CompeViewBean");
    try {
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template19);
            // jsp code [from=(386,116);to=(386,137)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewBean.COMPEID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);
            // jsp code [from=(386,143);to=(386,160)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewBean.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template21);
            // jsp code [from=(387,11);to=(387,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewBean.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template22);
            // jsp code [from=(387,34);to=(387,53)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewBean.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(387,57);to=(387,77)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewBean.BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(387,81);to=(387,100)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewBean.BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);
            // jsp code [from=(388,11);to=(388,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewBean.JIMOK}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template26);
            // jsp code [from=(389,11);to=(389,35)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${CompeViewBean.AFFAIRAREA}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template27);

          } while (_jspx_th_c_forEach_2.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_2.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_2.doCatch(t);
      } finally {
        _jspx_th_c_forEach_2.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_2.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/calculation.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction initSearchForm(){\r\n\tvar area_form = document.area_form;\r\n\t\r\n\tvar new_option;\r\n\tvar _AreaGuCd = document.getElementById(\"AREA_GU_CD\");\t\r\n\tvar _GuCd = document.getElementById(\"CP_DEPT_CODE\");\r\n\t\r\n\t";
  private final static String _jspx_template7 = "\r\n\t\tif('";
  private final static String _jspx_template8 = "' != ''){\r\n\t\t\tnew_option = new Option('";
  private final static String _jspx_template9 = "','";
  private final static String _jspx_template10 = "');\r\n\t\t\tif(new_option.value == '";
  private final static String _jspx_template11 = "'){\r\n\t\t\t\tnew_option.selected = true;\r\n\t\t\t}\r\n\t\t\t_AreaGuCd.options.add(new_option);\r\n\t\t}\r\n\t";
  private final static String _jspx_template12 = "\r\n\t\r\n}\r\n\r\n// 구코드 변경\r\nfunction changeGuCode(){\r\n\tvar _guCode = getValueSelectTag(\"AREA_GU_CD\");\r\n\tvar param = \"&GU_CD=\"+_guCode;\r\n\r\n\tsendRequest(\"/rams/common/get_dong_list.do\", param, \"GET\", ResultChangeGuCode);\r\n}\r\n\r\n////////////////////////////////AJAX////////////////////////////////////////////\r\n\r\nfunction ResultChangeGuCode(obj)\r\n{\r\n\tfncSelectBoxSetting(obj, \"AREA_DONG_CD\", \"\", \"동명\");\r\n}\r\n\r\nfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n{\r\n    var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n    var selectBoxLabel;\r\n    var root;\r\n    var selectBoxValue;\r\n    var opt \t= document.getElementById(selectBoxId);\r\n    var tags\t= \"\";\r\n    var\ttext\t= \"\";\r\n\r\n    for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n    {\r\n    \topt.options[i]\t= null;\r\n    }\r\n\r\n    xmldoc.async\t= false;\r\n\r\n\txmldoc.loadXML(strParam);\r\n\r\n\r\n\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n    if(root <= 0)\r\n    {\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(\"\");\r\n        tags.setAttribute(\"label\", \"\");\r\n        tags.appendChild(text);\r\n        tags.value = 0;\r\n        opt.appendChild(tags);\r\n        return;\r\n    }\r\n\r\n    if(topLabel != null && topLabel != \"\")\r\n\t{\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(topLabel);\r\n        tags.setAttribute(\"label\", topLabel);\r\n        tags.appendChild(text);\r\n        tags.value = '';\r\n        opt.appendChild(tags);\r\n    }\r\n\t\r\n    for(var i = 0; i < root; i++)\r\n    {\r\n    \t\r\n    \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n    \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n        tags \t= document.createElement(\"option\");\r\n   \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n        tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n        tags.value = selectBoxValue;\r\n        tags.appendChild(text);\r\n        opt.appendChild(tags);\r\n    }   \r\n}\r\n\r\nfunction juminCk(obj1, obj2){\r\n\t\r\n\tvar chk =0;\r\n\t\r\n\tfor (var i = 0; i <=5 ; i++){\r\n\t\tchk = chk + ((i%8+2) * parseInt(obj1.substring(i,i+1)))\r\n\t\t}\r\n\t\t\r\n\t\tfor (var i = 6; i <=11 ; i++){\r\n\t\tchk = chk + ((i%8+2) * parseInt(obj2.substring(i-6,i-5)))\r\n\t\t}\r\n\t\t\r\n\t\tchk = 11 - (chk %11)\r\n\t\tchk = chk % 10\r\n\t\t\r\n\t\tif (chk != obj2.substring(6,7))\r\n\t\t{\r\n\t\t\talert (\"주민등록번호가 유효하지 않습니다.\");\r\n\t\t\tdocument.area_form.CP_JUMIN.focus();\r\n\t\t\treturn false;\r\n\t\t}\r\n\t\treturn true;\r\n}\r\n\r\nfunction goAreaWritePrc(){\r\n\tvar form = document.area_form;\r\n\tvar temp,jumin1,jumin2;\r\n\tvar isTrue = false;\r\n\t\r\n\ttemp = form.CP_JUMIN.value;\r\n\ttemp = temp.replace(/-/gi, \"\");  \r\n\t\r\n\tjumin1 = temp.substr(0,6);\r\n\tjumin2 = temp.substr(6,8);\r\n\r\n\r\n\tif(form.COMPEID.value == 'null' || form.COMPEID.value == \"\"){\r\n\t\talert (\"공사명을 선택해 주세요.\");\r\n\t\tform.COMPEID.focus();\r\n\t\treturn;\r\n\t}\r\n\r\n\tif(form.AREA_GU_CD.value.length\t< 1){\r\n\t\talert (\"자치구를 선택해 주세요.\");\r\n\t\tform.AREA_GU_CD.focus();\r\n\t\treturn;\r\n\t}\r\n\t\t\r\n\tif(form.AREA_DONG_CD.value.length\t< 1){\r\n\t\talert (\"동명을 선택해 주세요.\");\r\n\t\tform.AREA_DONG_CD.focus();\r\n\t\treturn;\r\n\t}\r\n\r\n\tif(form.AREA_ADDRESS.value.length\t< 1){\r\n\t\talert (\"주소를 입력해 주세요.\");\r\n\t\tform.AREA_ADDRESS.focus();\r\n\t\treturn;\r\n\t}\r\n\t\r\n\tif(form.AREA_BONBUN.value.length\t< 1){\r\n\t\talert (\"번지 앞자리를 입력해 주세요.\");\r\n\t\tform.AREA_BONBUN.focus();\r\n\t\treturn;\r\n\t}\r\n\r\n\tif(form.AREA_BUBUN.value.length\t< 1){\r\n\t\talert (\"번지 뒷자리를 입력해 주세요.\");\r\n\t\tform.AREA_BUBUN.focus();\r\n\t\treturn;\r\n\t}\r\n\r\n\tif(form.CP_NAME.value.length\t< 1){\r\n\t\talert (\"신청자 성명을 입력해 주세요.\");\r\n\t\tform.CP_NAME.focus();\r\n\t\treturn;\r\n\t}\r\n\r\n\tif(form.CP_ADDRESS.value.length\t< 1){\r\n\t\talert (\"신청자 주소를 입력해 주세요.\");\r\n\t\tform.CP_ADDRESS.focus();\r\n\t\treturn;\r\n\t}\r\n\tif(form.REQDATE.value.length\t< 1){\r\n\t\talert (\"신청 일자를 입력해 주세요.\");\r\n\t\tform.REQDATE.focus();\r\n\t\treturn;\r\n\t}\r\n\r\n\tif(form.RECEIPT.value.length\t< 1){\r\n\t\talert (\"수신처를 입력해 주세요.\");\r\n\t\tform.RECEIPT.focus();\r\n\t\treturn;\r\n\t}\r\n\t\r\n\tisTrue = juminCk(jumin1, jumin2);\r\n\tform.CP_JUMIN.value = temp;\r\n\t\r\n\tif(isTrue){\r\n\t\tif(confirm(\"등록 하시겠습니까?\")){\r\n\t\t\tdocument.area_form.submit();\r\n\t\t}\r\n\t}\r\n\r\n}\r\n\r\nfunction goGongsaPop(){\r\n\tpopWindow('/rams/reward/pop_reward_gongsa.do','gonsaPop','800";
  private final static String _jspx_template13 = "','500','no','no');\r\n//\twindow.open('/rams/reward/pop_reward_gongsa.do', 'gonsaPop', 'top=100px, left=100px, height=500px, width=800px');\r\n}\r\n</script>\r\n</head>\r\n\r\n<body onload=\"initSearchForm();\">\r\n<form name=\"area_form\" method=\"post\" action=\"/rams/reward/reward_area_write_prc.do\" enctype=\"multipart/form-data\">\r\n<input type=\"hidden\" id=\"COMPEID\" name=\"COMPEID\" value=\"\" />\r\n<input type=\"hidden\" id=\"CONSTNAME\" name=\"CONSTNAME\" value=\"\" />\r\n<input type=\"hidden\" id=\"PNU\" name=\"PNU\" value=\"\" />\r\n<input type=\"hidden\" id=\"CP_REGION_TEXT\" name=\"CP_REGION_TEXT\" value=\"\" />\r\n<input type=\"hidden\" id=\"CP_DEPT_CODE_TEXT\" name=\"CP_DEPT_CODE_TEXT\" value=\"\" />\r\n<input type=\"hidden\" id=\"CP_DONG_CODE_TEXT\" name=\"CP_DONG_CODE_TEXT\" value=\"\" />\r\n\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > 보상용지 관리 <a href=\"#\" class=\"blue1\"></a> > <strong>미불보상용지 </strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  <div>\r\n    <h2><img src=\"/rams/images/reward/tt01.gif\" alt=\"보상용지관리_미불보상용지\" width=\"184\" height=\"22\" /></h2>\r\n   \r\n   \r\n    <!-- 탭 메뉴 -->\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><img src=\"/rams/images/reward/tab01_on.gif\" alt=\"미불보상용지\" width=\"91\" height=\"29\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_review_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image16','','/rams/images/reward/tab02_on.gif',1)\"><img src=\"/rams/images/reward/tab02_off.gif\" alt=\"보상심의/사실조사\" name=\"Image16\" width=\"91\" height=\"29\" border=\"0\" id=\"Image16\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_status_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image19','','/rams/images/reward/tab03_on.gif',1)\"><img src=\"/rams/images/reward/tab03_off.gif\" alt=\"현황관리\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image19\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_anal_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','/rams/images/reward/tab04_on.gif',1)\"><img src=\"/rams/images/reward/tab04_off.gif\" alt=\"통계\" name=\"Image20\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/reward/reward_own_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image20','','/rams/images/reward/tab05_on.gif',1)\"><img src=\"/rams/images/reward/tab05_off.gif\" alt=\"토지소유현황\" name=\"Image19\" width=\"91\" height=\"29\" border=\"0\" id=\"Image20\" /></a></td>\r\n          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t\r\n\t<div class=\"list\">\r\n\t  <h3><img src=\"/rams/images/reward/st_regi.gif\" alt=\"미불 보상용지 등록\" /></h3>\r\n\t  \r\n\t  \r\n\t  <!-- 토지정보 -->\r\n\t  <h4><img src=\"/rams/images/suit/st_ground.gif\" alt=\"토지정보\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">고시(관보)</th>\r\n\t\t\t\t<td width=\"274\" class=\"cont\"><input name=\"GOSIID\" id=\"GOSIID\" type=\"text\" class=\"formBox6\" value=\"\" readOnly/></td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">공사명</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<table width=\"240\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"180\"><input name=\"CONSTNUM\" id=\"CONSTNUM\" type=\"text\" class=\"formBox6\"  value=\"\" readOnly/></td>\r\n\t\t\t\t\t\t<td><a href=\"#\" onclick=\"goGongsaPop();\"><img src=\"/rams/images/common/btn_srch5.gif\" alt=\"검색\" width=\"42\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">토지</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<table width=\"240\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"80\"><select id=\"AREA_GU_CD\" name=\"AREA_GU_CD\" class=\"formBox2\" onchange=\"";
  private final static String _jspx_template14 = "changeGuCode();\">\r\n\t\t\t\t\t\t  <option>자치구</option>\r\n\t\t\t\t\t\t</select></td>\r\n\t\t\t\t\t\t<td width=\"80\" class=\"cont\"><select id=\"AREA_DONG_CD\" name=\"AREA_DONG_CD\" class=\"formBox2\">\r\n\t\t\t\t\t\t  <option>동명</option>\r\n\t\t\t\t\t\t</select></td>\r\n<!-- \r\n\t\t\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t\t<input name=\"AREA_ADDRESS\" id=\"AREA_ADDRESS\" type=\"text\" class=\"formBox7\" />\r\n\t\t\t\t\t\t</td>\r\n -->\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"80\" align=\"right\">번지입력:</td>\r\n\t\t\t\t\t\t<td width=\"80\" class=\"cont\">\r\n\t\t\t\t\t\t\t<input name=\"AREA_BONBUN\" id=\"AREA_BONBUN\" type=\"text\" class=\"formBox7\" maxlength='4' onKeyDown=\"onlyNumberInput();\" />&nbsp;-&nbsp;</td>\r\n\t\t\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t\t\t<input name=\"AREA_BUBUN\" id=\"AREA_BUBUN\" type=\"text\" class=\"formBox7\" maxlength='4' onKeyDown=\"onlyNumberInput();\" />\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t  </tr>\t\t\t\t\t  \r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<th scope=\"col\">지목</th>\r\n\t\t\t\t<td class=\"cont\">        \r\n\t\t\t\t<select id=\"JIMOK\" name=\"JIMOK\" class=\"formBox6\"\">\r\n\t\t\t  \t\t";
  private final static String _jspx_template15 = "\r\n\t\t\t  \t\t <option value=\"";
  private final static String _jspx_template16 = "\">";
  private final static String _jspx_template17 = "</option>\r\n\t\t\t  \t\t";
  private final static String _jspx_template18 = "\r\n\t\t\t  \t</select>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">지적(㎡)</th>\r\n\t\t\t\t<td class=\"cont\"><input name=\"AFFAIRNUM\" id=\"AFFAIRNUM\" type=\"text\" class=\"formBox6\" onKeyDown=\"onlyNumberInput();\" /></td>\r\n\t\t\t\t<th scope=\"col\">보상결정사유</th>\r\n\t\t\t\t<td class=\"cont\"><input name=\"REASON\" id=\"REASON\" type=\"text\" class=\"formBox6\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <!-- 평가정보 -->\r\n\t  <h4><img src=\"/rams/images/reward/sst_info2.gif\" alt=\"평가정보\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">평가기관</th>\r\n\t\t\t\t<td width=\"274\" class=\"cont\"><input name=\"OFFICENAME_1\" id=\"OFFICENAME_1\" type=\"text\" class=\"formBox6\" /></td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">단가</th>\r\n\t\t\t\t<td class=\"cont\"><input name=\"DANGA_1\" id=\"DANGA_1\" type=\"text\" class=\"formBox6\" onKeyDown=\"onlyNumberInput();\"/></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">금액</th>\r\n\t\t\t\t<td class=\"cont\"><input name=\"JUDGEPRICE_1\" id=\"JUDGEPRICE_1\" type=\"text\" class=\"formBox6\" onKeyDown=\"onlyNumberInput();\" /></td>\r\n\t\t\t\t<th scope=\"col\">가격시점</th>\r\n\t\t\t\t<td class=\"cont\"><input name=\"POINTDATE_1\" id=\"POINTDATE_1\" type=\"text\" class=\"formBox6\" readOnly/><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" width=\"19\" height=\"15\" border=\"0\" onclick=\"popUpCalendar(this,POINTDATE_1,'yyyymmdd')\" style=\"cursor:pointer;\"/></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">평가기관</th>\r\n\t\t\t\t<td class=\"cont\"><input name=\"OFFICENAME_2\" id=\"OFFICENAME_2\" type=\"text\" class=\"formBox6\" /></td>\r\n\t\t\t\t<th scope=\"col\">단가</th>\r\n\t\t\t\t<td class=\"cont\"><input name=\"DANGA_2\" id=\"DANGA_2\" type=\"text\" class=\"formBox6\" onKeyDown=\"onlyNumberInput();\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">금액</th>\r\n\t\t\t\t<td class=\"cont\"><input name=\"JUDGEPRICE_2\" id=\"JUDGEPRICE_2\" type=\"text\" class=\"formBox6\" onKeyDown=\"onlyNumberInput();\" /></td>\r\n\t\t\t\t<th scope=\"col\">가격시점</th>\r\n\t\t\t\t<td class=\"cont\"><input name=\"POINTDATE_2\" id=\"POINTDATE_2\" type=\"text\" class=\"formBox6\" readOnly/><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" width=\"19\" height=\"15\" border=\"0\" onclick=\"popUpCalendar(this,POINTDATE_2,'yyyymmdd')\" style=\"cursor:pointer;\"/></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \t  \r\n\t  <!-- 대상토지 목록\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont2\"><img src=\"/rams/images/reward/sst_list.gif\" alt=\"대상토지 목록\" width=\"83\" height=\"11\" /></th>\r\n\t\t  <td width=\"70\" align=\"right\" class=\"cont2\"><a href=\"#\" onclick=\"goDelPrc();\"><img src=\"/rams/images/common/btn_del.gif\" alt=\"토지삭제\" width=\"62\" height=\"19\" /></a></td>\r\n\t\t  <td width=\"70\" align=\"right\" class=\"cont2\"><a href=\"#\" onclick=\"goAreaWritePrc();\"><img src=\"/rams/images/common/btn_add.gif\" alt=\"토지추가\" width=\"62\" height=\"19\" /></a></td>\r\n\t    </tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" id=\"area_info_ready\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">토지</th>\r\n\t\t\t\t<th width=\"150\" scope=\"col\">지목</th>\r\n\t\t\t\t<th width=\"150\" scope=\"col\">지적(㎡)</th>\r\n\t\t\t\t<th width=\"150\" scope=\"col\">&nbsp;</th>\r\n\t\t\t\t<th width=\"150\" scope=\"col\">&nbsp;</th>\r\n\t\t\t  </tr>\r\n\t\t\t  ";
  private final static String _jspx_template19 = "\r\n\t\t\t  <tr onmouseover=\"trMoouseOver(this)\" onmouseout=\"trMoouseOut(this)\" style=\"cursor:pointer\" onclick=\"goView('";
  private final static String _jspx_template20 = "','";
  private final static String _jspx_template21 = "');\">\r\n\t\t\t\t<td>";
  private final static String _jspx_template22 = " ";
  private final static String _jspx_template23 = " ";
  private final static String _jspx_template24 = "-";
  private final static String _jspx_template25 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template27 = "㎡</td>\r\n\t\t\t\t<td>&nbsp;</td>\r\n\t\t\t\t<td>&nbsp;</td>\r\n\t\t\t  </tr>\t\t\t  \r\n\t\t\t  ";
  private final static String _jspx_template28 = "\t\t\t  \r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t   -->\r\n\t  \t  \r\n\t  <!-- 대상토지 소유자 정보\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont2\"><img src=\"/rams/images/reward/sst_info.gif\" alt=\"대상토지 소유자정보\" width=\"115\" height=\"11\" /></th>\r\n\t\t  <td width=\"70\" align=\"right\" class=\"cont2\"><img src=\"/rams/images/reward/btn_srch.gif\" alt=\"소유자조회\" width=\"62\" height=\"19\" /></td>\r\n\t    </tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"fcol\">소유자 명 </th>\r\n\t\t\t\t<th scope=\"col\">주소</th>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">지분</th>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">비고</th>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">업데이트 일자 </th>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<td>&nbsp;</td>\r\n\t\t\t\t<td>&nbsp;</td>\r\n\t\t\t\t<td>&nbsp;</td>\r\n\t\t\t\t<td>&nbsp;</td>\r\n\t\t\t\t<td>&nbsp;</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t   -->\r\n\t  \r\n\t  <h4></h4>\r\n<!-- \t  \r\n</form>\t  \r\n<form name=\"form\" method=\"post\" action=\"/rams/reward/reward_area_write_prc.do\" enctype=\"multipart/form-data\">\r\n--> \r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">신청자 성명 </th>\r\n\t\t\t\t<td width=\"274\" class=\"cont\"><input name=\"CP_NAME\" id=\"CP_NAME\" type=\"text\" class=\"formBox6\" /></td>\r\n\t\t\t\t<th width=\"120\" scope=\"col\">주민번호</th>\r\n\t\t\t\t<td class=\"cont\"><input name=\"CP_JUMIN\" id=\"CP_JUMIN\" type=\"text\" class=\"formBox6\" onKeyDown=\"onlyNumberInput();\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">주소</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">\r\n\t\t\t\t\t<table width=\"550\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n<!-- \t\t\t\t\t  \r\n\t\t\t\t\t\t<td width=\"80\"><select name=\"CP_REGION\" class=\"formBox2\">\r\n\t\t\t\t\t\t  <option value=\"11\">서울</option>\r\n\t\t\t\t\t\t  <option value=\"\">지역</option>\r\n\t\t\t\t\t\t  </select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"80\" class=\"cont\"><select name=\"CP_DEPT_CODE\" class=\"formBox2\" onchange=\"changeGuCode2();\">\r\n\t\t\t\t\t\t  <option value=\"\">자치구</option>\r\n\t\t\t\t\t\t  </select>\r\n\t\t\t\t\t\t</td>\r\n\t\t\t\t\t\t<td width=\"80\" class=\"cont\"><select name=\"CP_DONG_CODE\" class=\"formBox2\">\r\n\t\t\t\t\t\t  <option value=\"\">동명</option>\r\n\t\t\t\t\t\t  </select>\r\n\t\t\t\t\t\t</td>\r\n -->\t\t\t\t\t\t\r\n\t\t\t\t\t\t<td width=\"130\" class=\"cont\"><input name=\"CP_ADDRESS\" id=\"CP_ADDRESS\" type=\"text\" class=\"formBox1\" style=\"width:300px\"/></td>\r\n<!-- \r\n\t\t\t\t\t\t<td width=\"20\" class=\"cont\"><input type=\"checkbox\" name=\"CP_AUTH_YN\" value=\"Y\" /></td>\r\n\t\t\t\t\t\t<td class=\"cont\">소유자 동일여부</td>\r\n -->\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t  </table>\r\n\t\t\t\t</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">토지현황</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\"><table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                  <tr>\r\n                    <td width=\"50\"><input type=\"radio\" name=\"LANDGUBUN\" id=\"LANDGUBUN\" value=\"1\" />도로</td>\r\n                    <td width=\"70\" class=\"cont\"><input type=\"radio\" name=\"LANDGUBUN\" id=\"LANDGUBUN\" value=\"2\" />하천</td>\r\n                    <td width=\"100\" class=\"cont\">(<input type=\"radio\" name=\"LANDDETAIL\" id=\"LANDDETAIL\" value=\"asphalt\" />아스팔트포장</td>\r\n                    <td width=\"100\" class=\"cont\"><input type=\"radio\" name=\"LANDDETAIL\" id=\"LANDDETAIL\" value=\"concrete\" />콘크리트포장</td>\r\n                    <td width=\"100\" class=\"cont\"><input type=\"radio\" name=\"LANDDETAIL\" id=\"LANDDETAIL\" value=\"block\" />보도블럭포설</td>\r\n                    <td class=\"cont\"><input type=\"radio\" name=\"LANDDETAIL\" id=\"LANDDETAIL\" value=\"etc\" />기타 )</td>\r\n                  </tr>\r\n                </table></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">신청일자</th>\r\n\t\t\t\t<td class=\"cont\"><table width=\"230\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n                  <tr>\r\n                    <td width=\"120\"><input name=\"REQDATE\" id=\"REQDATE\" type=\"text\" class=\"formBox1\" readOnly/></";
  private final static String _jspx_template29 = "td>\r\n                    <td class=\"cont\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" width=\"19\" height=\"15\" border=\"0\"  onclick=\"popUpCalendar(this,REQDATE,'yyyymmdd')\" style=\"cursor:pointer;\"/></td>\r\n                  </tr>\r\n                </table></td>\r\n\t\t\t\t<th scope=\"col\">수신처</th>\r\n\t\t\t\t<td class=\"cont\"><input name=\"RECEIPT\" id=\"RECEIPT\" type=\"text\" class=\"formBox6\" /></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <!-- 첨부자료 -->\r\n\t  <h4><img src=\"/rams/images/register/st_data.gif\" alt=\"첨부자료\" width=\"60\" height=\"11\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t\t<p>&nbsp;</p>\r\n\t\t\t\t\t<table width=\"600\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td width=\"300\" class=\"cont\"><input name=\"compeFile\" id=\"compeFile\" type=\"text\" class=\"formBox8\" /></td>\r\n\t\t\t\t\t\t<td class=\"cont\"><a href=\"#\"><img src=\"/rams/images/common/btn_find2.gif\" alt=\"찾기\" width=\"42\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t  </table>\r\n\t\t\t\t    <p>&nbsp;</p></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td height=\"34\" align=\"right\"><a href=\"#\" onclick=\"goAreaWritePrc();\"><img src=\"/rams/images/common/btn_save.gif\" alt=\"저장\" width=\"62\" height=\"19\" border=\"0\" class=\"cont2\" /></a></td>\r\n\t\t  <td width=\"70\" align=\"right\"><a href=\"/rams/reward/reward_list.do\"><img src=\"/rams/images/common/btn_cancel.gif\" alt=\"취소\" width=\"62\" height=\"19\" border=\"0\" class=\"cont2\" /></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n    </div>\r\n  </div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
