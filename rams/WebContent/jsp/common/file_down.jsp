<%@ page contentType="application;" %>
<%@ page import="java.util.*,java.io.*,java.sql.*,java.text.*"%>
<%
 request.setCharacterEncoding("euc-kr"); // request �ѱ۷� ����
 String filename = request.getParameter("filename"); // ���ϸ� �ޱ�
 String filepath = request.getParameter("filepath"); // ���ϸ� �ޱ�
 
 
 ServletContext context = getServletContext(); // ���� ���ؽ�Ʈ ���

  // �ڹ� I/O�� �̿��Ͽ� �ٿ�޴´�.

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
