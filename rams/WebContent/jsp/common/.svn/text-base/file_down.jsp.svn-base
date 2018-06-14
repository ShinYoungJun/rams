<%@ page contentType="application;" %>
<%@ page import="java.util.*,java.io.*,java.sql.*,java.text.*"%>
<%
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
%>
