package jeus_jspwork._jsp._suit;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;


public class _500_suit_5fview_5fjsp extends jeus.servlet.jsp.HttpJspBase {

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
      // jsp code [from=(101,72);to=(101,86)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template8);
      // jsp code [from=(101,92);to=(101,100)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template9);
      // jsp code [from=(102,93);to=(102,107)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template10);
      // jsp code [from=(103,89);to=(103,103)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template11);
      // jsp code [from=(103,109);to=(103,117)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template12);
      // jsp code [from=(115,36);to=(115,46)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.CALSS}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template13);
      // jsp code [from=(119,36);to=(119,50)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template14);
      // jsp code [from=(121,24);to=(121,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template15);
      // jsp code [from=(128,14);to=(128,27)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.SUITLAND}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template16);
      // jsp code [from=(129,56);to=(129,70)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template17);
      // jsp code [from=(129,76);to=(129,84)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template18);
      // jsp code [from=(134,24);to=(134,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.CONSTNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template19);
      // jsp code [from=(134,53);to=(134,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.CONSTNAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template20);
      // jsp code [from=(138,24);to=(138,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.JUDGMENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template21);
      // jsp code [from=(140,24);to=(140,34)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.COURT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template22);
      // jsp code [from=(144,24);to=(144,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.CLOSEDAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template23);
      // jsp code [from=(146,24);to=(146,39)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ACCEPTDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template24);
      // jsp code [from=(159,115);to=(159,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template25);
      // jsp code [from=(168,36);to=(168,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST2_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template26);
      // jsp code [from=(170,24);to=(170,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST2_JUMINNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template27);
      // jsp code [from=(170,57);to=(170,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST2_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template28);
      // jsp code [from=(174,36);to=(174,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST2_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template29);
      // jsp code [from=(195,24);to=(195,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP2_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template30);
      // jsp code [from=(196,24);to=(196,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP2_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template31);
      // jsp code [from=(201,24);to=(201,37)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP1_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template32);
      // jsp code [from=(202,24);to=(202,36)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.LP1_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template33);
      // jsp code [from=(216,115);to=(216,129)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template34);
      // jsp code [from=(226,36);to=(226,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST1_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template35);
      // jsp code [from=(228,24);to=(228,41)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST1_JUMINNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template36);
      // jsp code [from=(228,57);to=(228,69)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST1_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template37);
      // jsp code [from=(232,36);to=(232,49)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ST1_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template38);
      // jsp code [from=(243,147);to=(243,161)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template39);
      // jsp code [from=(243,167);to=(243,175)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template40);
      // jsp code [from=(244,114);to=(244,128)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template41);
      // jsp code [from=(244,134);to=(244,142)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template42);
      // jsp code [from=(254,36);to=(254,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ON_NAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template43);
      // jsp code [from=(256,24);to=(256,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ON_JUMINNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template44);
      // jsp code [from=(256,56);to=(256,67)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ON_TEL}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template45);
      // jsp code [from=(260,36);to=(260,48)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.ON_ADDR}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template46);
      // jsp code [from=(271,81);to=(271,95)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template47);
      // jsp code [from=(271,101);to=(271,109)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PNU}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template48);
      // ----  c:forEach ---- invoke //
      if (_jspx_th_c_forEach_0_fn(pageContext, null)) return;


      out.write(_jspx_template56);
      // jsp code [from=(327,24);to=(327,38)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PRE_COURT}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template57);
      // jsp code [from=(328,24);to=(328,42)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PRE_AFFAIRNUM}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template58);
      // jsp code [from=(329,24);to=(329,40)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PRE_OUTCOME}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template59);
      // jsp code [from=(330,24);to=(330,45)]
      out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${view.PRE_ANNOUNCEDATE}",java.lang.String.class , pageContext.getVariableResolver(), null));

      out.write(_jspx_template60);

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
    _jspx_th_c_forEach_0.setItems((java.lang.Object)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fileList}", java.lang.Object.class , pageContext.getVariableResolver(), null));
    _jspx_th_c_forEach_0.setVar("fileList");
    try {
      try {
        int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
        if (_jspx_eval_c_forEach_0 != Tag.SKIP_BODY) {
          do {
            out.write(_jspx_template49);
            // jsp code [from=(299,38);to=(299,57)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fileList.PRESENTDAY}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template50);
            // jsp code [from=(300,25);to=(300,41)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fileList.CONTENT}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template51);
            // jsp code [from=(301,68);to=(301,85)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fileList.FILENAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template52);
            // jsp code [from=(301,91);to=(301,99)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${filePath}",java.lang.String.class , pageContext.getVariableResolver(), null));

            // jsp code [from=(301,102);to=(301,110)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${suitPath}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template53);
            // jsp code [from=(301,117);to=(301,134)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fileList.FILENAME}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template54);
            // jsp code [from=(302,25);to=(302,43)]
            out.write((String)jeus.servlet.jsp.el.JeusExpressionEvaluator.evaluate("${fileList.FILECATEG}",java.lang.String.class , pageContext.getVariableResolver(), null));

            out.write(_jspx_template55);

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
  private final static String _jspx_template6 = "\r\n<!DOCTYPE html PUBLIC \"-//W3C//DTD XHTML 1.0 Frameset//EN\" \"http://www.w3.org/TR/xhtml1/DTD/xhtml1-frameset.dtd\">\r\n<html xmlns=\"http://www.w3.org/1999/xhtml\" xml:lang=\"ko\">\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\" />\r\n<title>::::: ����� �����������ý��� :::::</title>\r\n<link rel=\"stylesheet\" href=\"/rams/css/doro.css\" type=\"text/css\" />\r\n<script type=\"text/javascript\" src=\"/rams/js/common.js\"></script>\r\n<script type=\"text/javascript\">\r\nfunction init(){\r\n\tvar msg = '";
  private final static String _jspx_template7 = "';\r\n\tif(msg != ''){\r\n\t\talert(msg);\r\n\t\treturn;\r\n\t}else{\r\n\t\treturn;\r\n\t}\r\n}\r\n\r\nfunction goDown(filename,filepath){\r\n\tvar url = \"/rams/jsp/common/file_down.jsp?filename=\"+filename+\"&filepath=\"+filepath;\r\n\tvar form = document.form;\r\n\tform.action = url;\r\n\tform.submit();\r\n}\r\n\r\nfunction goLandPop(affairnum,pnu){\r\n\t\r\n    window.open(\"/rams/suit/suit_land_pop.do?AFFAIRNUM=\"+affairnum+\"&PNU=\"+pnu,'�����������','toolbar=no,status=no,menubar=no,width=815,height=400');\r\n}\r\n\r\nfunction goLawsuitResultPop(affairnum){\r\n\t\r\n    window.open(\"/rams/suit/suit_lawsuit_result_pop.do?AFFAIRNUM=\"+affairnum,'�����Է�','toolbar=no,status=no,menubar=no,width=790,height=200');\r\n}\r\n\r\nfunction goNumChangePop(affairnum,pnu){\r\n\t\r\n    window.open(\"/rams/suit/suit_num_change_pop.do?AFFAIRNUM=\"+affairnum+\"&PNU=\"+pnu,'��ǹ�ȣ����','toolbar=no,status=no,menubar=no,width=425,height=200');\r\n}\r\n\r\nfunction goModify(affairnum,pnu){\r\n\tvar form = document.form;\r\n\tform.action = \"/rams/suit/suit_modify.do?AFFAIRNUM=\"+affairnum+\"&PNU=\"+pnu;\r\n\tform.submit();\r\n}\r\n\r\n\r\nfunction goSuitorPop(affairnum,gubun){\r\n    window.open('/rams/suit/suit_suitor_pop.do?AFFAIRNUM='+affairnum+'&GUBUN='+gubun,'�Ҽ��ΰ���','toolbar=no,status=no,menubar=no,width=817,height=400');\r\n}\r\n\r\nfunction goOwnerPop(affairnum,pnu){\r\n    window.open('/rams/suit/suit_owner_pop.do?AFFAIRNUM='+affairnum+'&PNU='+pnu+'&ISFIXED=0','�����ڰ���','toolbar=no,status=no,menubar=no,width=817,height=400');\r\n}\r\n\r\n\r\nfunction goFilePop(affairnum,pnu){\r\n    window.open('/rams/suit/suit_file_pop.do?AFFAIRNUM='+affairnum+'&PNU='+pnu,'�����ڷ����','toolbar=no,status=no,menubar=no,width=817,height=400');\r\n}\r\n\r\nfunction goOwnerFixedPop(affairnum,pnu){\r\n\twindow.open('/rams/suit/suit_owner_pop.do?AFFAIRNUM='+affairnum+'&PNU='+pnu+'&ISFIXED=1','���������','toolbar=no,status=no,menubar=no,width=817,height=400');\r\n}\r\n\r\n\r\n</script>\r\n</head>\r\n\r\n<body onload=\"init();\">\r\n<form name=\"form\" id=\"form\" method=\"post\">\r\n<div id=\"cont01\">\r\n<!-- �����丮 -->\r\n  <div>\r\n  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n    <tr>\r\n      <td align=\"right\"><a href=\"#\"><img src=\"/rams/images/suit/home.gif\" alt=\"home\" border=\"0\" /></a> > <a href=\"#\" class=\"blue1\">�Ҽ���������</a> > <strong>�Ҽ�����</strong></td>\r\n    </tr>\r\n  </table>\r\n  </div>\r\n  \r\n<!-- �� �޴� -->\r\n  <div>\r\n    <h2><img src=\"/rams/images/suit/tt01.gif\" alt=\"�Ҽ���������_�Ҽ�����\" width=\"160\" height=\"22\" /></h2>\r\n\t<div class=\"tab\">\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n        <tr>\r\n          <td width=\"91\" height=\"29\"><img src=\"/rams/images/suit/02tab01_on.gif\" alt=\"�Ҽ�����\" /></td>\r\n          <td width=\"91\"><a href=\"/rams/suit/suit_price_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image13','','/rams/images/suit/02tab02_on.gif',1)\"><img src=\"/rams/images/suit/02tab02_off.gif\" alt=\"�Ұ�����\" name=\"Image13\" border=\"0\" id=\"Image13\" /></a></td>\r\n          <td width=\"91\"><a href=\"/rams/suit/suit_anal_list.do\" onmouseout=\"MM_swapImgRestore()\" onmouseover=\"MM_swapImage('Image14','','/rams/images/suit/02tab03_on.gif',1)\"><img src=\"/rams/images/suit/02tab03_off.gif\" alt=\"���\" name=\"Image14\" border=\"0\" id=\"Image14\" /></a></td>\r\n          <td background=\"/rams/images/map/p_tab_bg.gif\">&nbsp;</td>\r\n        </tr>\r\n      </table>\r\n\t</div>\r\n\t<div>\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t<tr>\r\n\t      <td height=\"35\" align=\"left\" valign=\"bottom\" class=\"t_org\">�� ������ư�� ���� ��� �⺻ ���� �� &quot;��������(�������, ���)&quot;�� �����Ͻ� �� �ֽ��ϴ�.<br/>\r\n          ����, ��� ��ȣ�� Ʋ����� &quot;��ǹ�ȣ����&quot;��ư�� ���� �Էµ� ����� �����Ͻ� �� �ֽ��ϴ�. </td>\r\n\t\t  <td align=\"right\" valign=\"bottom\"><a href=\"#\" onclick=\"goModify('";
  private final static String _jspx_template8 = "','";
  private final static String _jspx_template9 = "');\"><img src=\"/rams/images/common/btn_modify.gif\" alt=\"����\" width=\"62\" height=\"19\" border=\"0\" /></a></td>\r\n\t\t  <td width=\"70\" align=\"right\" valign=\"bottom\"><a href=\"#\" onclick=\"goLawsuitResultPop('";
  private final static String _jspx_template10 = "');\"><img src=\"/rams/images/common/btn_input2.gif\" alt=\"�����Է�\" border=\"0\"/></a></td>\r\n\t\t  <td width=\"90\" align=\"right\" valign=\"bottom\"><a href=\"#\" onclick=\"goNumChangePop('";
  private final static String _jspx_template11 = "','";
  private final static String _jspx_template12 = "');\"><img src=\"/rams/images/common/btn_change.gif\" alt=\"��ǹ�ȣ����\" border=\"0\"/></a></td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</div>\r\n\t<div >\r\n\t  <h4><img src=\"/rams/images/suit/st_basis.gif\" alt=\"�⺻����\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">����</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">";
  private final static String _jspx_template13 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">��ǹ�ȣ</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\">";
  private final static String _jspx_template14 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">��� �� </th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template15 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"row\">�������</th>\r\n\t\t\t\t<td class=\"cont\">\r\n\t\t\t\t    <table width=\"260\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t\t\t\t\t  <tr>\r\n\t\t\t\t\t\t<td >";
  private final static String _jspx_template16 = "</td>\r\n\t\t\t\t\t\t<td width=\"42\"><a href=\"#\" onclick=\"goLandPop('";
  private final static String _jspx_template17 = "','";
  private final static String _jspx_template18 = "');\"><img src=\"/rams/images/common/btn_more.gif\" alt=\"������� ������\" border=\"0\" /></a></td>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t\t</td>\r\n\t\t\t\t<th scope=\"row\">�����ȣ/�� </th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template19 = "&nbsp;/&nbsp;";
  private final static String _jspx_template20 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"row\">������Ǻ�</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template21 = "</td>\r\n\t\t\t\t<th scope=\"row\">���� �� </th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template22 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"row\">������������</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template23 = "</td>\r\n\t\t\t\t<th scope=\"row\">������</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template24 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\r\n\t  \r\n\t<!-- �ǰ� -->\r\n\t<table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont\"><img src=\"/rams/images/suit/st_defendant.gif\" alt=\"�ǰ�\" width=\"41\" height=\"11\" /></th>\r\n\t\t  <td align=\"right\" class=\"cont\"></td>\r\n\t\t  <td width=\"50\" align=\"right\" class=\"cont\"><img src=\"/rams/images/common/btn_more.gif\" onclick=\"goSuitorPop('";
  private final static String _jspx_template25 = "','2');\" style=\"cursor:pointer;\" alt=\"�ǰ��߰�,�����ϱ�\"/></td>\r\n\t    </tr>\r\n\t</table>\r\n\t<table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">����</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\">";
  private final static String _jspx_template26 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">�ֹι�ȣ/����ó</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template27 = "&nbsp;/&nbsp;";
  private final static String _jspx_template28 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">�ּ�</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">";
  private final static String _jspx_template29 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <!-- �븮 -->\r\n\t  <h4><img src=\"/rams/images/suit/st_deputy.gif\" alt=\"�븮\" width=\"41\" height=\"11\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">����</th>\r\n\t\t\t\t<th width=\"286\" scope=\"row\">�Ҽ۴븮��</th>\r\n\t\t\t\t<th scope=\"row\">����ó</th>\r\n\t\t\t\t<th scope=\"row\">���</th>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<td class=\"cont\">�ǰ�</td>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template30 = "</td>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template31 = "</td>\r\n\t\t\t\t<td class=\"cont\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<td class=\"cont\">����</td>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template32 = "</td>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template33 = "</td>\r\n\t\t\t\t<td class=\"cont\"></td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  \r\n\t  <!-- ���� -->\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont\"><img src=\"/rams/images/suit/st_plaintiff.gif\" alt=\"����\" width=\"41\" height=\"11\" /></th>\r\n\t\t  <td align=\"right\" class=\"cont\"></td>\r\n\t\t  <td width=\"50\" align=\"right\" class=\"cont\"><img src=\"/rams/images/common/btn_more.gif\" onclick=\"goSuitorPop('";
  private final static String _jspx_template34 = "','1');\" style=\"cursor:pointer;\" alt=\"���� �߰�,�����ϱ�\"/></td>\r\n\t    </tr>\r\n\t  </table>\r\n\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">����</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\">";
  private final static String _jspx_template35 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">�ֹι�ȣ/����ó</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template36 = "&nbsp;/&nbsp;";
  private final static String _jspx_template37 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">�ּ�</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">";
  private final static String _jspx_template38 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <!-- ���� -->\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont\"><img src=\"/rams/images/suit/st_possess.gif\" alt=\"����\" width=\"41\" height=\"11\" /></th>\r\n\t\t  <td align=\"right\" class=\"cont\"><img src=\"/rams/images/common/btn_security.gif\" alt=\"���������\" width=\"62\" height=\"19\" onclick=\"goOwnerFixedPop('";
  private final static String _jspx_template39 = "','";
  private final static String _jspx_template40 = "');\" style=\"cursor:pointer;\"/></td>\r\n\t\t  <td width=\"50\" align=\"right\" class=\"cont\"><img src=\"/rams/images/common/btn_more.gif\" onclick=\"goOwnerPop('";
  private final static String _jspx_template41 = "','";
  private final static String _jspx_template42 = "');\" style=\"cursor:pointer;\" alt=\"������ �߰� ����\"/></td>\r\n\t    </tr>\r\n\t  </table>\r\n\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">�������ڼ���</th>\r\n\t\t\t\t<td width=\"286\" class=\"cont\">";
  private final static String _jspx_template43 = "</td>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">�ֹι�ȣ/����ó</th>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template44 = "&nbsp;/&nbsp;";
  private final static String _jspx_template45 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<th scope=\"row\">�ּ�</th>\r\n\t\t\t\t<td colspan=\"3\" class=\"cont\">";
  private final static String _jspx_template46 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <!-- �����ڷ� -->\r\n\t  <table width=\"817\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\">\r\n\t    <tr>\r\n\t\t  <th height=\"30\" align=\"left\" class=\"cont\"><img src=\"/rams/images/suit/st_data.gif\" alt=\"�����ڷ�\" /></th>\r\n\t\t  <td width=\"62\" align=\"right\" class=\"cont\"><a href=\"#\" onclick=\"goFilePop('";
  private final static String _jspx_template47 = "','";
  private final static String _jspx_template48 = "');\"><img src=\"/rams/images/common/btn_data.gif\" alt=\"�����ڷ�\" border=\"0\"/></a></td>\r\n\t    </tr>\r\n\t  </table>\r\n\t  \r\n\r\n\t  \r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t\t<table width=\"813\" border=\"0\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t    <td width=\"813\" valign=\"top\" style=\"text-align:left;background-color:#ddecf2\">\r\n\t\t\t\t\t<table width=\"796\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t\t\t  <tr height=\"26px\">\r\n\t\t\t\t\t\t<th width=\"120\" scope=\"row\">����</th>\r\n\t\t\t\t\t\t<th width=\"270\" scope=\"row\">����</th>\r\n\t\t\t\t\t\t<th width=\"287\" scope=\"row\">÷������</th>\r\n\t\t\t\t\t\t<th width=\"120\" scope=\"row\">�ڷ�����</th>\r\n\t\t\t\t\t  </tr>\r\n\t\t\t\t\t</table>\r\n\t\t\t    </td>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t    <td width=\"813\" valign=\"top\">\r\n\t\t\t    <div id=\"mainDisplay2\" style=\"width:813px;height:150px;overflow-y:scroll;scrollbar-face-color:#EEF8FB;scrollbar-3dlight-color:#BBBDB6; scrollbar-highlight-color:#EEF8FB;scrollbar-shadow-color:#BBBDB6; scrollbar-darkshadow-color:#EEF8FB;scrollbar-track-color:#EEF8FB;scrollbar-arrow-color:#BBBDB6;\"\">\r\n\t\t\t\t<table width=\"796\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t\t  ";
  private final static String _jspx_template49 = "\r\n\t\t\t\t  <tr>\r\n\t\t\t\t\t<td width=\"120\" height=\"26px\">";
  private final static String _jspx_template50 = "</td>\r\n\t\t\t\t\t<td width=\"270\" >";
  private final static String _jspx_template51 = "</td>\r\n\t\t\t\t\t<td width=\"286\" ><a href=\"#\" class=\"blue1\" onclick=\"goDown('";
  private final static String _jspx_template52 = "','";
  private final static String _jspx_template53 = "')\">";
  private final static String _jspx_template54 = "</a></td>\r\n\t\t\t\t\t<td width=\"120\" >";
  private final static String _jspx_template55 = "</td>\r\n\t\t\t\t  </tr>\t\t\t  \r\n\t\t\t\t  ";
  private final static String _jspx_template56 = "\r\n\t\t\t\t</table>\r\n\t\t\t    </div>\r\n\t\t\t    </td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t  \r\n\t  <!-- �ɱ� -->\r\n\t  <h4><img src=\"/rams/images/suit/st_sim2.gif\" alt=\"�ɱ�\" width=\"41\" height=\"11\" /></h4>\r\n\t  <table width=\"817\" border=\"1\" cellpadding=\"1\" cellspacing=\"1\" bordercolor=\"#d3e2ea\">\r\n\t\t<tr>\r\n\t\t  <td>\r\n\t\t  \t<table width=\"813\" border=\"1\" cellspacing=\"0\" cellpadding=\"0\" class=\"mapPopup\" summary=\"\" bordercolor=\"#bed6e1\">\r\n\t\t\t  <tr>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">����</th>\r\n\t\t\t\t<th width=\"286\" scope=\"row\">��ǹ�ȣ</th>\r\n\t\t\t\t<th width=\"120\" scope=\"row\">�ǰ���</th>\r\n\t\t\t\t<th scope=\"row\">�ǰἱ������</th>\r\n\t\t\t  </tr>\r\n\t\t\t  <tr>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template57 = "</td>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template58 = "</td>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template59 = "</td>\r\n\t\t\t\t<td class=\"cont\">";
  private final static String _jspx_template60 = "</td>\r\n\t\t\t  </tr>\r\n\t\t\t</table>\r\n\t\t  </td>\r\n\t\t</tr>\r\n\t  </table>\r\n\t</div>\r\n  </div>\r\n</div>\r\n</form>\r\n</body>\r\n</html>\r\n";
}
