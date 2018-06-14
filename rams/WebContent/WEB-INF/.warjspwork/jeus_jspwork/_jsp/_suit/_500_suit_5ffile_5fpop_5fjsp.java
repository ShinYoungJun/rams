package jeus_jspwork._jsp._suit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_suit_5ffile_5fpop_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(69,15);to=(69,18)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${MSG}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template7);
      // jsp code [from=(106,63);to=(106,72)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(107,51);to=(107,54)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template18);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("blist");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template10);
            // jsp code [from=(185,55);to=(185,67)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.FILEID}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template11);
            // jsp code [from=(187,25);to=(187,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.PRESENTDAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template12);
            // jsp code [from=(188,25);to=(188,38)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.CONTENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template13);
            // jsp code [from=(189,68);to=(189,82)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.FILENAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template14);
            // jsp code [from=(189,88);to=(189,96)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(189,99);to=(189,107)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitPath}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template15);
            // jsp code [from=(189,114);to=(189,128)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.FILENAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template16);
            // jsp code [from=(190,25);to=(190,40)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${blist.FILECATEG}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template17);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: 서울시 도로재산관리시스템 :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/PopupCalendar.js\"></script> \r\n<script language=\"javascript\" src=\"/rams/js/calculation.js\"></script>\r\n<script language=\"javascript\" src=\"/rams/js/Ajax_request.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction goDelete(){\r\n\t\r\n\tif(document.getElementById(\"FILEID\").value != null && document.getElementById(\"FILEID\").value != ''){\r\n\t\tif(!confirm(\"삭제하시겠습니까?\")){\r\n\t        return;\r\n\t    }\r\n\t\tvar form = document.form;\r\n\t\tform.action = \"/rams/suit/suit_file_pop_del.do\";\r\n\t\tform.submit();\r\n\t}else{\r\n\t\talert(\"삭제할 대상을 선택하세요\");\r\n\t}\r\n}\r\nfunction goSave(){\r\n\t\r\n\tif(!confirm(\"제출자료를 추가하시겠습니까?\")){\r\n        return;\r\n    }\r\n\t\r\n\tvar\tresult\t= DataCheck();\r\n\tif(result\t==\tfalse)\r\n\t\treturn;\r\n\t\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_file_pop_add.do\";\r\n\tform.submit();\r\n\r\n}\r\n\r\nfunction\tDataCheck()\r\n{\r\n    var form \t= document.form;\r\n    var\tstr\t\t= \"\";\r\n    if(form.PRESENTDAY.value.length\t< 1)\r\n    {\r\n        str\t+= \"일자를 입력하세요\\n\";\r\n        alert(str);\r\n        form.PRESENTDAY.focus();\r\n    }\r\n    else if(form.FILENAME.value.length\t< 6)\r\n    {\r\n        str\t+= \"파일을 선택하세요\\n\";\r\n        alert(str);\r\n        form.FILENAME.focus();\r\n    }\r\n\t\r\n    if(str\t== \"\")\r\n    {\r\n        return\ttrue;\r\n    }\r\n\r\n    return\tfalse;\r\n}\r\n\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\topener.location = \"/rams/suit/suit_view.do?AFFAIRNUM=\"+form.AFFAIRNUM.value+\"&PNU=\"+form.PNU.value;\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\nfunction goDown(filename,filepath){\r\n\tvar url = \"/rams/jsp/common/file_down.jsp?filename=\"+filename+\"&filepath=\"+filepath;\r\n\tvar form = document.form;\r\n\tform.action = url;\r\n\tform.submit();\r\n}\r\n\r\nfunction checkItem(obj){\r\n\t\r\n\tvar selectItem_arr = document.getElementsByName(\"SELECT_ITEM\");\r\n\tvar fileId_arr = document.getElementsByName(\"FILEID_ARR\");\r\n\r\n\tfor(var i = 0; i < selectItem_arr.length; i ++){\r\n\t\tif(selectItem_arr[i] == obj){\r\n\t\t\tdocument.getElementById(\"FILEID\").value = fileId_arr[i].value;\r\n\t\t}else{\r\n\t\t\tselectItem_arr[i].checked = false;\r\n\t\t}\r\n\t}\r\n\t\r\n}\r\n\r\n\r\n</script>\r\n</head>\r\n<body onload=\"init();\">\r\n<form name=\"form\" id=\"form\" method=\"post\" enctype=\"multipart/form-data\">\r\n<input id=\"AFFAIRNUM\" name=\"AFFAIRNUM\" type=\"hidden\" value=\"";
  private final static String _jspx_template8 = "\"></input>\r\n<input id=\"PNU\" name=\"PNU\" type=\"hidden\" value=\"";
  private final static String _jspx_template9 = "\"></input>\r\n<input id=\"FILEID\" name=\"FILEID\" type=\"hidden\" value=\"\"></input>\r\n<div id=\"cont02\">\r\n\t  \r\n\t  <!-- 제출 자료 등록/변경 관리 -->\r\n\t  <h3><img src=\"/rams/images/suit/st_manage2.gif\" alt=\"제출 자료 등록/변경 관리\"/></h3>\r\n      <table width=\"680\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <th scope=\"row\" width=\"5\" height=\"100\"><img src=\"/rams/images/suit/srch3_bg1.gif\" alt=\".\" /></th>\r\n          <td background=\"/rams/images/suit/srch3_bg2.gif\" class=\"srch\">\r\n\t\t\t  <table width=\"650\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <th width=\"60\" height=\"40\" align=\"left\" scope=\"row\">자료 등록</th>\r\n\t\t\t\t  <td width=\"120\">일자&nbsp;&nbsp;<input id=\"PRESENTDAY\" name=\"PRESENTDAY\" type=\"text\" class=\"formBox2\" readonly=\"readonly\" /></td>\r\n\t\t\t\t  <td width=\"60\"><a href=\"#\" onclick=\"popUpCalendar(this, document.getElementById('PRESENTDAY'), 'yyyymmdd');\"><img src=\"/rams/images/suit/cal.gif\" alt=\"달력\" border=\"0\" /></a></td>\r\n\t\t\t\t  <td align=\"left\">내용&nbsp;&nbsp;<input nid=\"CONTENT\" name=\"CONTENT\" type=\"text\" class=\"formBox8\" /></td>\r\n\t\t\t\t  <td width=\"70\" align=\"right\"><a href=\"#\" onclick=\"goSave();\"><img src=\"/rams/images/common/btn_add5.gif\" alt=\"자료추가\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t\t\t</tr>\r\n\t\t\t\t<tr>\r\n\t\t\t\t  <th height=\"40\" align=\"left\" scope=\"row\"></th>\r\n\t\t\t\t  <td>종류&nbsp;&nbsp;<select id=\"FILECATEG\" name=\"FILECATEG\" class=\"formBox2\">\r\n\t\t\t\t  <option value=\"\">::선택::</option>\r\n\t\t\t\t  <option value=\"문서\">문서</option>\r\n\t\t\t\t  <option value=\"이미지\">이미지</option>\r\n\t\t\t\t  <option value=\"기타\">기타</option></select>\r\n\t\t\t\t  </td>\r\n\t\t\t\t  <td align=\"left\">\r\n\t\t\t\t  <td align=\"left\">\r\n\t\t\t\t  \t<table>\r\n\t\t\t\t  \t<tr>\r\n\t\t\t\t\t  \t<td>\r\n\t\t\t\t\t  \t\t파일위치&nbsp;&nbsp;<input id=\"FILENAME\" name=\"FILENAME\" type=\"text\" class=\"formBox4\" readonly=\"readonly\"/>\r\n\t\t\t\t\t  \t</td>\r\n\t\t\t\t\t  \t<td height=\"19\">\r\n\t\t\t\t\t  \t<div style=\"background-image:url(/rams/images/common/btn_find.gif);width:62px;height:19px;overflow:hidden;\">\r\n\t\t\t\t\t\t <input type=\"file\" id=\"SUIT_FILE\" name=\"SUIT_FILE\" style=\"border:0;background-color:white;width:62px;height:19px;filter:alpha(opacity=0)\" onchange=\"document.getElementById('FILENAME').value=this.value\">\r\n\t\t\t\t\t\t</div>\r\n\t\t\t\t\t  \t</td>\r\n\t\t\t\t  \t</tr>\r\n\t\t\t\t  \t</table>\r\n\t\t\t  \t  </td>\r\n\t\t\t\t  <td align=\"right\"></td>\r\n\t\t\t\t</tr>\r\n\t\t\t  </table>\r\n\t\t  </td>\r\n          <td width=\"5\"><img src=\"/rams/images/suit/srch3_bg3.gif\" alt=\".\"/></td>\r\n        </tr>\r\n      </table>\r\n\t  \r\n\t  \r\n\t  <!-- 제출 자료 목록 -->\r\n\t  <h3><img src=\"/rams/images/suit/st_list3.gif\" alt=\"제출 자료 목록\"/></h3>\r\n\t  \r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t\t<table width=\"813\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t    <td width=\"813\" valign=\"top\" style=\"text-align:left;background-color:#ddecf2\">\r\n\t\t\t\t\t<table width=\"796\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t\t\t  <tr height=\"26px\">\r\n\t\t\t\t\t  \t<th width=\"40\" scope=\"row\">선택</th>\r\n\t\t\t\t\t\t<th width=\"100\" scope=\"row\">일자</th>\r\n\t\t\t\t\t\t<th width=\"250\" scope=\"row\">내용</th>\r\n\t\t\t\t\t\t<th width=\"287\" scope=\"row\">첨부파일</th>\r\n\t\t\t\t\t\t<th width=\"120\" scope=\"row\">자료종류</th>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t    </td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t    <td width=\"813\" valign=\"top\">\r\n\t\t\t    <div id=\"mainDisplay2\" style=\"width:813px;height:150px;overflow-y:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;\"\">\r\n\t\t\t\t<table width=\"796\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t\t  ";
  private final static String _jspx_template10 = "\r\n\t\t\t\t  <tr>\r\n\t\t\t\t  \t<td width=\"40\" height=\"26\">\r\n\t\t\t\t  \t\t<INPUT TYPE=\"checkbox\" NAME=\"SELECT_ITEM\" onclick=\"checkItem(this);\">\r\n\t\t\t\t\t\t<INPUT TYPE=\"hidden\" NAME=\"FILEID_ARR\" value=\"";
  private final static String _jspx_template11 = "\">\r\n\t\t\t  \t\t</td>\r\n\t\t\t\t\t<td width=\"100\" >";
  private final static String _jspx_template12 = "</td>\r\n\t\t\t\t\t<td width=\"250\" >";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t\t\t<td width=\"286\" ><a href=\"#\" class=\"blue1\" onclick=\"goDown('";
  private final static String _jspx_template14 = "','";
  private final static String _jspx_template15 = "')\">";
  private final static String _jspx_template16 = "</a></td>\r\n\t\t\t\t\t<td width=\"120\" >";
  private final static String _jspx_template17 = "</td>\r\n\t\t\t\t  </tr>\t\t\t  \r\n\t\t\t\t  ";
  private final static String _jspx_template18 = "\r\n\t\t\t\t</table>\r\n\t\t\t    </div>\r\n\t\t\t    </td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t\t  <td height=\"40\" align=\"right\">\r\n\t\t  \t<a href=\"#\" onclick=\"goDelete();\"><img src=\"/rams/images/common/btn_del3.gif\" alt=\"삭제\" width=\"62\" height=\"19\" border=\"0\" /></a>\r\n\t\t  \t<a href=\"#\" onclick=\"window.close();\"><img src=\"/rams/images/common/btn_close3.gif\" alt=\"닫기\" width=\"62\" height=\"19\" border=\"0\" /></a>\r\n\t  \t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
