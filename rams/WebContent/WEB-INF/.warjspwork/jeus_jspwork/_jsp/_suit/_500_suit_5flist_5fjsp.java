package jeus_jspwork._jsp._suit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_suit_5flist_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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


      out.write(_jspx_template10);
      out.write(_jspx_template11);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_1_fn(pageContext, null)) return;


      out.write(_jspx_template16);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_2_fn(pageContext, null)) return;


      out.write(_jspx_template21);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_3_fn(pageContext, null)) return;


      out.write(_jspx_template26);
      // jsp code [from=(320,65);to=(320,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${SEARCHTYPE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(321,61);to=(321,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NUM_YEAR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(322,59);to=(322,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NUM_DAN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(323,59);to=(323,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NUM_NUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(324,63);to=(324,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${NAME_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(325,59);to=(325,66)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LAND_GU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(326,63);to=(326,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LAND_DONG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(327,67);to=(327,78)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LAND_BONBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(328,65);to=(328,75)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${LAND_BUBUN}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(329,71);to=(329,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${USERNAME_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_4_fn(pageContext, null)) return;


      out.write(_jspx_template48);
      // jsp code [from=(438,9);to=(438,26)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${strPageDivideForm}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template49);

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
            // jsp code [from=(53,32);to=(53,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template8);
            // jsp code [from=(53,49);to=(53,61)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template9);

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
    _jspx_th_c_forEach_1.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitCodeList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_1.setVar("suitCodeList");
    try {
      try {
        int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
        if (_jspx_eval_c_forEach_1 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template12);
            // jsp code [from=(263,32);to=(263,54)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitCodeList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(264,57);to=(264,79)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitCodeList.CODEVALUE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(267,18);to=(267,39)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitCodeList.CODEDESC}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);

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
    _jspx_th_c_forEach_2.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_2.setVar("guList");
    try {
      try {
        int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
        if (_jspx_eval_c_forEach_2 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template17);
            // jsp code [from=(283,32);to=(283,44)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template18);
            // jsp code [from=(284,57);to=(284,69)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template19);
            // jsp code [from=(287,18);to=(287,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${guList.GU_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template20);

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

  private boolean _jspx_th_c_forEach_3_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_3.setPageContext(pageContext);
    _jspx_th_c_forEach_3.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_3.setVar("dongList");
    try {
      try {
        int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
        if (_jspx_eval_c_forEach_3 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template22);
            // jsp code [from=(295,32);to=(295,46)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template23);
            // jsp code [from=(296,59);to=(296,73)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_CD}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template24);
            // jsp code [from=(299,18);to=(299,32)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${dongList.BJ_NM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template25);

          } while (_jspx_th_c_forEach_3.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_3.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_3.doCatch(t);
      } finally {
        _jspx_th_c_forEach_3.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_3.release();
    }
    return false;
  }

  private boolean _jspx_th_c_forEach_4_fn(javax.servlet.jsp.PageContext pageContext, javax.servlet.jsp.tagext.JspTag _jspx_parentTag) throws Throwable {
    JspWriter	out = pageContext.getOut();
    HttpSession session = pageContext.getSession();
    ServletContext application = pageContext.getServletContext();
    HttpServletRequest request = (HttpServletRequest)pageContext.getRequest();

    // ----  c:forEach ---- //
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = new org.apache.taglibs.standard.tag.rt.core.ForEachTag();
    _jspx_th_c_forEach_4.setPageContext(pageContext);
    _jspx_th_c_forEach_4.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${list}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_4.setVar("suitlist");
    try {
      try {
        int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
        if (_jspx_eval_c_forEach_4 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template37);
            // jsp code [from=(415,116);to=(415,134)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitlist.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template38);
            // jsp code [from=(415,140);to=(415,152)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitlist.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template39);
            // jsp code [from=(416,11);to=(416,29)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitlist.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template40);
            // jsp code [from=(417,11);to=(417,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitlist.AFFAIRNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template41);
            // jsp code [from=(418,11);to=(418,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitlist.SUITLAND}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template42);
            // jsp code [from=(419,11);to=(419,24)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitlist.NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template43);
            // jsp code [from=(420,11);to=(420,31)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitlist.ANNOUNCE_YN}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template44);
            // jsp code [from=(421,11);to=(421,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitlist.CLOSEDAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template45);
            // jsp code [from=(422,11);to=(422,28)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitlist.USERNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template46);
            // jsp code [from=(423,11);to=(423,30)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitlist.ACCEPTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template47);

          } while (_jspx_th_c_forEach_4.doAfterBody() == BodyTag.EVAL_BODY_AGAIN);
        }
        if (_jspx_th_c_forEach_4.doEndTag() == Tag.SKIP_PAGE)
          return true;
      } catch (Throwable t) {
        _jspx_th_c_forEach_4.doCatch(t);
      } finally {
        _jspx_th_c_forEach_4.doFinally();
      }
    } finally {
      _jspx_th_c_forEach_4.release();
    }
    return false;
  }

  private final static String _jspx_template0 = "\r\n";
  private final static String _jspx_template1 = "\r\n";
  private final static String _jspx_template2 = "  \r\n";
  private final static String _jspx_template3 = "  \r\n";
  private final static String _jspx_template4 = "  \r\n";
  private final static String _jspx_template5 = "\r\n";
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction addSearchForm(){\r\n\t\r\n\tvar _searchType = getValueSelectTag(\"search_type\");\r\n\tvar _searchForm = document.getElementById(\"search_form\");\r\n\t\r\n\tvar year = new Date().getYear();\r\n\t\r\n\tif(_searchType == 'affairnum'){\r\n\t\tvar html = \"<select id='selectYearValue' name='selectYearValue' class='formBox2'>\" +\r\n\t    \"<option value=''>::선택::</option>\";\r\n\t    \r\n\t    for(var i=year-20;i<=year;i++){\r\n\t\t\thtml +=\"<option\";\r\n\t\t\thtml+=\" value='\"+i+\"'>\"+i+\"년</option>\";\r\n\t\t}\r\n\r\n\t\t  html += \"</select>\";\r\n\t\t  html += \"&nbsp;&nbsp;\";\r\n\t\t  html += \"<select id='selectDanValue' name='selectDanValue' class='formBox2'>\";\r\n\t\t  html += \"<option value=''>::선택::</option>\";\r\n\t\t  html += \"<option value='다'>다</option>\";\r\n\t\t  html += \"<option value='나'>나</option>\";\r\n\t\t  html += \"<option value='구단'>구단</option>\";\r\n\t\t  html += \"<option value='가단'>가단</option>\";\r\n\t\t  html += \"<option value='가합'>가합</option>\";\r\n\t\t  html += \"<option value='가소'>가소</option>\";\r\n\t\t  html += \"</select>\";\r\n\t\t  html += \"&nbsp;&nbsp;\";\r\n\t\t  html += \"<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:150px'/>\";\r\n\t \r\n\t  _searchForm.innerHTML = html;\r\n\t\t\r\n\t}else if(_searchType == 'affairname'){\r\n\t\t_searchForm.innerHTML = \"<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:320px'/>\";\r\n\t\t\r\n\t}else if(_searchType == 'affairland'){\r\n\t\tvar html = \"<select id='selectGuValue' name='selectGuValue' class='formBox2' onchange='changeGuCode();'>\";\r\n\t\thtml += \"<option value=''>구선택</option>\";\r\n\t\t\r\n\t    ";
  private final static String _jspx_template7 = "\r\n\t    \thtml +=\"<option value='";
  private final static String _jspx_template8 = "'>";
  private final static String _jspx_template9 = "</option>\";\r\n    \t";
  private final static String _jspx_template10 = "\r\n\t\t\r\n\t\t  html += \"</select>\";\r\n\t\t  html += \"&nbsp;&nbsp;\";\r\n\t\t  html += \"<select id='selectDongValue' name='selectDongValue' class='formBox2'>\";\r\n\t\t  html += \"</select>\";\r\n\t\t  html += \"&nbsp;&nbsp;\";\r\n\t\t  html += \"<input id='searchBonbun' name='searchBonbun' type='text' class='formBox3' style='width:40px' maxlength='4'/>\";\r\n\t\t  html += \"&nbsp;-&nbsp;\";\r\n\t\t  html += \"<input id='searchBubun' name='searchBubun' type='text' class='formBox3' style='width:40px' maxlength='4'/>\";\r\n\t\t\r\n\t\t_searchForm.innerHTML = html;\r\n\t\t\r\n\t}else if(_searchType == 'username'){\r\n\t\t_searchForm.innerHTML = \"<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:320px'/>\";\r\n\t\t\r\n\t}\r\n}\r\n\r\nfunction changeGuCode(){\r\n\tvar _guCode = getValueSelectTag(\"selectGuValue\");\r\n\tvar param = \"&GU_CD=\"+_guCode;\r\n\tsendRequest(\"/rams/common/get_dong_list.do\", param, \"GET\", ResultChangeGuCode);\r\n}\r\n\r\n\r\n////////////////////////////////AJAX////////////////////////////////////////////\r\n\r\nfunction\tResultChangeGuCode(obj)\r\n{\r\n\tfncSelectBoxSetting(obj, \"selectDongValue\", \"\", \"동선택\");\r\n}\r\n\r\nfunction fncSelectBoxSetting(strParam, selectBoxId, defaultSel, topLabel)\r\n{\r\n    var xmldoc = new ActiveXObject(\"Microsoft.XMLDOM\");\r\n    var selectBoxLabel;\r\n    var root;\r\n    var selectBoxValue;\r\n    var opt \t= document.getElementById(selectBoxId);\r\n    var tags\t= \"\";\r\n    var\ttext\t= \"\";\r\n\r\n    for(var i = opt.options.length - 1 ; i > -1 ; i--)\r\n    {\r\n    \topt.options[i]\t= null;\r\n    }\r\n\r\n    xmldoc.async\t= false;\r\n\r\n\txmldoc.loadXML(strParam);\r\n\r\n\r\n\troot = xmldoc.getElementsByTagName(\"option\").length;\r\n\r\n\r\n    if(root <= 0)\r\n    {\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(\"\");\r\n        tags.setAttribute(\"label\", \"\");\r\n        tags.appendChild(text);\r\n        tags.value = 0;\r\n        opt.appendChild(tags);\r\n        return;\r\n    }\r\n\r\n    if(topLabel != null && topLabel != \"\")\r\n\t{\r\n        tags \t= document.createElement(\"option\");\r\n        text\t= document.createTextNode(topLabel);\r\n        tags.setAttribute(\"label\", topLabel);\r\n        tags.appendChild(text);\r\n        tags.value = '';\r\n        opt.appendChild(tags);\r\n    }\r\n\t\r\n    for(var i = 0; i < root; i++)\r\n    {\r\n    \t\r\n    \tselectBoxValue = xmldoc.getElementsByTagName(\"option/@value\").item(i).text;\r\n    \tselectBoxLabel = xmldoc.getElementsByTagName(\"option/@label\").item(i).text;\r\n\r\n        tags \t= document.createElement(\"option\");\r\n   \t\ttext\t= document.createTextNode(selectBoxLabel);\r\n\r\n        tags.setAttribute(\"label\", selectBoxLabel);\r\n\r\n        tags.value = selectBoxValue;\r\n        tags.appendChild(text);\r\n        opt.appendChild(tags);\r\n    }   \r\n}\r\n\r\n\r\nfunction goReg(){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_reg_init.do\";\r\n\tform.submit();\r\n}\r\n\r\nfunction goView(num,pnu){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_view.do?AFFAIRNUM=\"+num+\"&PNU=\"+pnu;\r\n\tform.submit();\r\n\t\r\n}\r\n\r\nfunction goSearch(){\r\n\t\r\n\tvar form = document.form;\r\n\tdocument.getElementById(\"SEARCHTYPE\").value = getValueSelectTag('search_type');\r\n\t\r\n\tdocument.getElementById(\"NUM_YEAR\").value = \"\";\r\n\tdocument.getElementById(\"NUM_DAN\").value = \"\";\r\n\tdocument.getElementById(\"NUM_NUM\").value = \"\";\r\n\tdocument.getElementById(\"NAME_NAME\").value = \"\";\r\n\tdocument.getElementById(\"LAND_GU\").value = \"\";\r\n\tdocument.getElementById(\"LAND_DONG\").value = \"\";\r\n\tdocument.getElementById(\"LAND_BONBUN\").value = \"\";\r\n\tdocument.getElementById(\"LAND_BUBUN\").value = \"\";\r\n\tdocument.getElementById(\"USERNAME_NAME\").value = \"\";\r\n\t\r\n\tvar _searchType = getValueSelectTag(\"search_type\");\r\n\tif(_searchType == 'affairnum'){\r\n\t\tdocument.getElementById(\"NUM_YEAR\").value = getValueSelectTag('selectYearValue');\r\n\t\tdocument.getElementById(\"NUM_DAN\").value = getValueSelectTag('selectDanValue');\r\n\t\tdocument.getElementById(\"NUM_NUM\").value = document.getElementById('searchValue').value;\r\n\t}else if(_searchType == 'affairname'){\r\n\t\tdocument.getElementById(\"NAME_NAME\").value = document.getElementById('searchValue').value;\r\n\t}else if(_searchType == 'affairland'){\r\n\t\tdocument.getElementById(\"LAND_GU";
  private final static String _jspx_template11 = "\").value = getValueSelectTag('selectGuValue');\r\n\t\tdocument.getElementById(\"LAND_DONG\").value = getValueSelectTag('selectDongValue');\r\n\t\tdocument.getElementById(\"LAND_BONBUN\").value = document.getElementById(\"searchBonbun\").value;\r\n\t\tdocument.getElementById(\"LAND_BUBUN\").value = document.getElementById(\"searchBubun\").value;\r\n\t}else if(_searchType == 'username'){\r\n\t\tdocument.getElementById(\"USERNAME_NAME\").value = document.getElementById(\"searchValue\").value;\r\n\t}\r\n\t\r\n\r\n\tform.action = \"/rams/suit/suit_list.do\";\r\n\tform.submit();\r\n}\r\n\r\nfunction goSearchExcel(){\r\n\t\r\n\tvar form = document.form;\r\n\tdocument.getElementById(\"SEARCHTYPE\").value = getValueSelectTag('search_type');\r\n\t\r\n\tdocument.getElementById(\"NUM_YEAR\").value = \"\";\r\n\tdocument.getElementById(\"NUM_DAN\").value = \"\";\r\n\tdocument.getElementById(\"NUM_NUM\").value = \"\";\r\n\tdocument.getElementById(\"NAME_NAME\").value = \"\";\r\n\tdocument.getElementById(\"LAND_GU\").value = \"\";\r\n\tdocument.getElementById(\"LAND_DONG\").value = \"\";\r\n\tdocument.getElementById(\"LAND_BONBUN\").value = \"\";\r\n\tdocument.getElementById(\"LAND_BUBUN\").value = \"\";\r\n\tdocument.getElementById(\"USERNAME_NAME\").value = \"\";\r\n\t\r\n\t\r\n\tvar _searchType = getValueSelectTag(\"search_type\");\r\n\tif(_searchType == 'affairnum'){\r\n\t\tdocument.getElementById(\"NUM_YEAR\").value = getValueSelectTag('selectYearValue');\r\n\t\tdocument.getElementById(\"NUM_DAN\").value = getValueSelectTag('selectDanValue');\r\n\t\tdocument.getElementById(\"NUM_NUM\").value = document.getElementById('searchValue').value;\r\n\t}else if(_searchType == 'affairname'){\r\n\t\tdocument.getElementById(\"NAME_NAME\").value = document.getElementById('searchValue').value;\r\n\t}else if(_searchType == 'affairland'){\r\n\t\tdocument.getElementById(\"LAND_GU\").value = getValueSelectTag('selectGuValue');\r\n\t\tdocument.getElementById(\"LAND_DONG\").value = getValueSelectTag('selectDongValue');\r\n\t\tdocument.getElementById(\"LAND_BONBUN\").value = document.getElementById(\"searchBonbun\").value;\r\n\t\tdocument.getElementById(\"LAND_BUBUN\").value = document.getElementById(\"searchBubun\").value;\r\n\t}else if(_searchType == 'username'){\r\n\t\tdocument.getElementById(\"USERNAME_NAME\").value = document.getElementById(\"searchValue\").value;\r\n\t}\r\n\t\r\n\r\n\tform.action = \"/rams/suit/suit_list_excel.do\";\r\n\tform.submit();\r\n}\r\n\r\nfunction initSearchForm(){\r\n\t\r\n\tvar form = document.form;\r\n\t\r\n\tchangeSelectTag('search_type',document.getElementById(\"SEARCHTYPE\").value);\r\n\t\r\n\tvar _searchType = document.getElementById(\"SEARCHTYPE\").value;\r\n\tvar _searchForm = document.getElementById(\"search_form\");\r\n\t\r\n\tvar year = new Date().getYear();\r\n\t\r\n\tif(_searchType == 'affairnum'){\r\n\t\tvar html = \"<select id='selectYearValue' name='selectYearValue' class='formBox2'>\" +\r\n\t    \"<option value=''>::선택::</option>\";\r\n\t    \r\n\t    for(var i=year-20;i<=year;i++){\r\n\t\t\thtml +=\"<option\";\r\n\t\t\thtml+=\" value='\"+i+\"' \";\r\n\t\t\tif(document.getElementById(\"NUM_YEAR\").value == i){\r\n\t\t\t\thtml+=\"selected\";\r\n\t\t\t}\r\n\t\t\thtml+=\">\"+i+\"년</option>\";\r\n\t\t}\r\n\t\t  html += \"</select>\";\r\n\t\t  html += \"&nbsp;&nbsp;\";\r\n\t\t  html += \"<select id='selectDanValue' name='selectDanValue' class='formBox2'>\";\r\n\t\t  html += \"<option value=''>::선택::</option>\";\r\n\t\t  ";
  private final static String _jspx_template12 = "\r\n\t    \thtml +=\"<option value='";
  private final static String _jspx_template13 = "'\";\r\n\t    \tif(document.getElementById(\"NUM_DAN\").value == '";
  private final static String _jspx_template14 = "'){\r\n\t    \t\thtml +=\"selected\";\r\n\t    \t}\r\n\t    \thtml +=\">";
  private final static String _jspx_template15 = "</option>\";\r\n    \t  ";
  private final static String _jspx_template16 = "\r\n\t\t  html += \"</select>\";\r\n\t\t  html += \"&nbsp;&nbsp;\";\r\n\t\t  html += \"<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:150px'value='\"+form.NUM_NUM.value+\"'/>\";\r\n\t\t  \r\n\t  _searchForm.innerHTML = html;\r\n\t\t\r\n\t}else if(_searchType == 'affairname'){\r\n\t\t_searchForm.innerHTML = \"<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:320px' value='\"+form.NAME_NAME.value+\"'/>\";\r\n\t\t\r\n\t}else if(_searchType == 'affairland'){\r\n\t\tvar html = \"<select name='selectGuValue' id='selectGuValue' class='formBox2' onchange='changeGuCode();'>\";\r\n\t\thtml += \"<option value=''>구선택</option>\";\r\n\t\t\r\n\t    ";
  private final static String _jspx_template17 = "\r\n\t    \thtml +=\"<option value='";
  private final static String _jspx_template18 = "'\"\r\n\t    \tif(document.getElementById(\"LAND_GU\").value == '";
  private final static String _jspx_template19 = "'){\r\n\t    \t\thtml +=\"selected\";\r\n\t    \t}\r\n\t    \thtml +=\">";
  private final static String _jspx_template20 = "</option>\";\r\n    \t";
  private final static String _jspx_template21 = "\r\n\t\t\r\n\t\t  html += \"</select>\";\r\n\t\t  html += \"&nbsp;&nbsp;\";\r\n\t\t  html += \"<select id='selectDongValue' name='selectDongValue' class='formBox2'>\";\r\n\t\t  html += \"<option value=''>동선택</option>\";\r\n\t\t  ";
  private final static String _jspx_template22 = "\r\n\t    \thtml +=\"<option value='";
  private final static String _jspx_template23 = "'\"\r\n\t    \tif(document.getElementById(\"LAND_DONG\").value == '";
  private final static String _jspx_template24 = "'){\r\n\t    \t\thtml +=\"selected\";\r\n\t    \t}\r\n\t    \thtml +=\">";
  private final static String _jspx_template25 = "</option>\";\r\n    \t  ";
  private final static String _jspx_template26 = "\r\n\t\t  html += \"</select>\";\r\n\t\t  html += \"&nbsp;&nbsp;\";\r\n\t\t  html += \"<input id='searchBonbun' name='searchBonbun' type='text' class='formBox3' style='width:40px' maxlength='4' value='\"+form.LAND_BONBUN.value+\"'/>\";\r\n\t\t  html += \"&nbsp;-&nbsp;\";\r\n\t\t  html += \"<input id='searchBubun' name='searchBubun' type='text' class='formBox3' style='width:40px' maxlength='4' value='\"+form.LAND_BUBUN.value+\"'/>\";\r\n\t\t\r\n\t\t_searchForm.innerHTML = html;\r\n\t\t\r\n\t}else if(_searchType == 'username'){\r\n\t\t_searchForm.innerHTML = \"<input id='searchValue' name='searchValue' type='text' class='formBox3' style='width:320px' value='\"+form.USERNAME_NAME.value+\"'/>\";\r\n\t\t\r\n\t}\r\n}\r\n\r\n</script>\r\n\r\n</head>\r\n<body onload=\"initSearchForm();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<input id=\"SEARCHTYPE\" name=\"SEARCHTYPE\" type=\"hidden\" value=\"";
  private final static String _jspx_template27 = "\" />\r\n<input id=\"NUM_YEAR\" name=\"NUM_YEAR\" type=\"hidden\" value=\"";
  private final static String _jspx_template28 = "\" />\r\n<input id=\"NUM_DAN\" name=\"NUM_DAN\" type=\"hidden\" value=\"";
  private final static String _jspx_template29 = "\" />\r\n<input id=\"NUM_NUM\" name=\"NUM_NUM\" type=\"hidden\" value=\"";
  private final static String _jspx_template30 = "\" />\r\n<input id=\"NAME_NAME\" name=\"NAME_NAME\" type=\"hidden\" value=\"";
  private final static String _jspx_template31 = "\" />\r\n<input id=\"LAND_GU\" name=\"LAND_GU\" type=\"hidden\" value=\"";
  private final static String _jspx_template32 = "\" />\r\n<input id=\"LAND_DONG\" name=\"LAND_DONG\" type=\"hidden\" value=\"";
  private final static String _jspx_template33 = "\" />\r\n<input id=\"LAND_BONBUN\" name=\"LAND_BONBUN\" type=\"hidden\" value=\"";
  private final static String _jspx_template34 = "\" />\r\n<input id=\"LAND_BUBUN\" name=\"LAND_BUBUN\" type=\"hidden\" value=\"";
  private final static String _jspx_template35 = "\" />\r\n<input id=\"USERNAME_NAME\" name=\"USERNAME_NAME\" type=\"hidden\" value=\"";
  private final static String _jspx_template36 = "\" />\r\n\r\n<div id=\"cont01\">\r\n  <!-- 히스토리 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > <a href=\"#\" class=\"blue1\">소송정보관리</a> > <strong>소송정보</strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n  \r\n  <!-- 검색 -->\r\n  <div style=\"position:relative;\">\r\n    <h2><img src=\"/rams/images/suit/tt01.gif\" alt=\"소송정보관리_소송정보\" width=\"160\" height=\"22\" /></h2>\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><img src=\"/rams/images/suit/02tab01_on.gif\" alt=\"소송정보\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/suit/suit_price_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image13','','/rams/images/suit/02tab02_on.gif',1)\"><img src=\"/rams/images/suit/02tab02_off.gif\" alt=\"소가관리\" name=\"Image13\" border=\"0\" id=\"Image13\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/suit/suit_anal_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image14','','/rams/images/suit/02tab03_on.gif',1)\"><img src=\"/rams/images/suit/02tab03_off.gif\" alt=\"통계\" name=\"Image14\" border=\"0\" id=\"Image14\" /></a></td>\r\n          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t<div>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td width=\"5\" height=\"50\"><img src=\"/rams/images/suit/srch_bg1.gif\" alt=\".\" /></td>\r\n\t\t  <td background=\"/rams/images/suit/srch_bg2.gif\" class=\"srch\">\r\n\t\t\t  <table width=\"787\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <td width=\"43\" height=\"14\" ><img src=\"/rams/images/suit/srch.gif\" alt=\"검색\"/></td>\r\n\t\t\t\t  <td width=\"95\"><input name=\"FROMDATE\" type=\"text\" class=\"formBox2\" /></td>\r\n\t\t\t\t  <td width=\"23\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" onclick=\"popUpCalendar(this,FROMDATE,'yyyymmdd')\" style=\"cursor:pointer;\"/></td>\r\n\t\t\t\t  <td width=\"10\">~</td>\r\n\t\t\t\t  <td width=\"95\"><input name=\"TODATE\" type=\"text\" class=\"formBox2\" /></td>\r\n\t\t\t\t  <td width=\"50\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" onclick=\"popUpCalendar(this,TODATE,'yyyymmdd')\" style=\"cursor:pointer;\"/></td>\r\n\t\t\t\t  <td width=\"90\">\r\n\t\t\t\t  <select id=\"search_type\" class=\"formBox2\" onchange='addSearchForm();'>\r\n\t\t\t\t    <option value='affairnum'>사건번호</option>\r\n\t\t\t\t    <option value='affairname'>원고</option>\r\n\t\t\t\t    <option value='affairland'>사건토지</option>\r\n\t\t\t\t    <option value='username'>담당자</option>\r\n\t\t\t\t  </select>\t\t\t\t \t\t  \r\n\t\t\t\t   </td>\r\n\t\t\t\t  <td>\r\n\t\t\t\t  \t<div id=\"search_form\">\r\n\t\t\t\t   \t</div>\r\n\t\t\t\t   \t\r\n\t\t\t\t  </td>\r\n\t\t\t\t  <td align=\"right\">\r\n\t\t\t\t  \t<a href=\"#\" onclick=\"goSearch()\"><img src=\"/rams/images/common/btn_srch3.gif\" alt=\"검색\" border=\"0\" /></a>\r\n\t\t\t\t  </td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t\r\n\t\t\t  </table>\r\n\t\t  </td>\r\n\t\t  <td width=\"5\"><img src=\"/rams/images/suit/srch_bg3.gif\" alt=\".\"/></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</div>\r\n\t\r\n\t\r\n    <div class=\"list\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t      <td height=\"26\" align=\"right\" valign=\"top\"><a href=\"#\" onclick=\"goSearchExcel();\"><img src=\"/rams/images/common/btn_print2.gif\" alt=\"대장출력\" border=\"0\"/></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"col\">사건번호</th>\r\n\t\t\t\t<th scope=\"col\">사건명</th>\r\n\t\t\t\t<th scope=\"col\">사건토지</th>\r\n\t\t\t\t<th scope=\"col\">원고</th>\r\n\t\t\t\t<th scope=\"col\">진행상황</th>\r\n\t\t\t\t<th scope=\"col\">변론기일</th>\r\n\t\t\t\t<th scope=\"col\">담당자</th>\r\n\t\t\t\t<th scope=\"col\">접수일자</th>\r\n\t\t\t  </tr>\r\n\t\t\t  ";
  private final static String _jspx_template37 = "\r\n\t\t\t  <tr onmouseover=\"trMoouseOver(this)\" onmouseout=\"trMoouseOut(this)\" style=\"cursor:pointer\" onclick=\"goView('";
  private final static String _jspx_template38 = "','";
  private final static String _jspx_template39 = "');\">\r\n\t\t\t\t<td>";
  private final static String _jspx_template40 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template41 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template42 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template43 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template44 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template45 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template46 = "</td>\r\n\t\t\t\t<td>";
  private final static String _jspx_template47 = "</td>\r\n\t\t\t  </tr>\t\t\t  \r\n\t\t\t  ";
  private final static String _jspx_template48 = "\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t      <td height=\"26\" align=\"right\" valign=\"bottom\"><a href=\"#\" onclick=\"goReg();\"><img src=\"/rams/images/common/btn_enroll.gif\" alt=\"등록\" border=\"0\"/></a></td>\r\n\t\t</tr>\r\n\t\t  <tr>\r\n\t\t\t<td height=\"30\" align=\"center\">\r\n\t\t  \t  \t<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\">\r\n\t\t\t\t\t<tr>\r\n\t\t\t\t\t\t";
  private final static String _jspx_template49 = "\r\n\t\t\t\t\t</tr>\r\n\t\t\t\t</table>\r\n\t\t\t</td>\r\n\t\t  </tr>\r\n\t  </table>\r\n\t</div>\r\n  </div>\r\n</div>\r\n</body>\r\n</form>\r\n</html>\r\n";
}
