package jeus_jspwork._jsp._common;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import java.text.*;


public class _500_file_5fdown_5fjsp extends jeus.servlet.jsp.HttpJspBase {

  public final String[] __jeusGetIncludedJspFiles() {
    return null;
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

      response.setContentType("application;charset=MS949");

      out.write(_jspx_template0);
      out.write(_jspx_template1);
      // jsp code [from=(3,3);to=(29,1)]
      
       request.setCharacterEncoding("euc-kr"); // request 한글로 설정
       String filename = request.getParameter("filename"); // 파일명 받기
       String filepath = request.getParameter("filepath"); // 파일명 받기
       
       
       ServletContext context = getServletContext(); // 서블릿 컨텍스트 얻기
      
        // 자바 I/O를 이용하여 다운받는다.
      
       File file = new File(filepath + "/" + filename);
       byte b[] = new byte[4096];
       response.setHeader("Content-Disposition", "attachment;filename=" + filename + ";");
      
      
       if (file.isFile())
       {
        BufferedInputStream fin = new BufferedInputStream(new FileInputStream(file));
        BufferedOutputStream outs = new BufferedOutputStream(response.getOutputStream());
        int read = 0;
        while ((read = fin.read(b)) != -1){
         outs.write(b,0,read);
        }//while
        outs.close();
        fin.close();
       }//if

      out.write(_jspx_template2);

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
  private final static String _jspx_template2 = "\r\n";
}
