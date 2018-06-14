package main.java.admin.web;


import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.model.UserBean;
import main.java.admin.service.IUserRegService;
import main.java.admin.service.IUserService;
import main.java.admin.service.UserService;
import main.java.common.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.StringUtil;
import main.java.map.model.T_PNUBean;
import main.java.suit.model.SuitBean;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class UserControl extends MultiActionController {

	private IUserRegService objUserRegService = null;
	private IUserService objUserService = null;
	private	CommonCodeService	commonCode		= null;		

	public void setUserRegService(IUserRegService newObjUserRegService) {
		this.objUserRegService = newObjUserRegService;
	}
	
	public void setUserService(IUserService newObjUserService) {
		this.objUserService = newObjUserService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode = commonCode;
	}
	
 	 /**
   	 * loginó��
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	
	public ModelAndView login(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		String strUserId = ServletRequestUtils.getStringParameter(request, "RAMS_USERID", "").trim();
		String strPass = ServletRequestUtils.getStringParameter(request, "RAMS_PASS", "").trim();
		String message = ServletRequestUtils.getStringParameter(request, "message", "");
		
		//20180515 request.setAttribute("ramsNoticeList", objUserService.getRamsNoticeList("%"));
		//20180515 request.setAttribute("roadsNoticeList", objUserService.getRoadsNoticeList("3"));
		//System.out.println("fdasfjdaslk;"+objUserService.getRoadsNoticeList("3").size());
		request.setAttribute("message", message);
		
		strUserId = strUserId.replace('=','#');
		strUserId = strUserId.replace(';','#');
		strUserId = strUserId.replaceAll("<","&lt;");
		strUserId = strUserId.replaceAll(">","&gt;");
		
		strPass = strPass.replace('=','#');
		strPass = strPass.replace(';','#');
		strPass = strPass.replaceAll("<","&lt;");
		strPass = strPass.replaceAll(">","&gt;");

		if(strUserId == null || strUserId == "")
		{ 
			

			
			
			return new ModelAndView("/admin/user/login");
		}
		else
		{
			UserBean objUserBean = objUserRegService.getUserDetail(strUserId);
			
			// ��ϵ� ����ڰ� �ƴ�
			if(objUserBean == null){
				request.setAttribute("message", "�������� �ʴ� ID�Դϴ�");
				return new ModelAndView("/admin/user/login");
			}
			// �������� ����     
			else if(!objUserBean.getISAPPROVE().equals("Y")){
				request.setAttribute("message", "�̽��λ����Դϴ�. �����ڿ��� ���� ��û�ٶ��ϴ�.");
				return new ModelAndView("/admin/user/login");
			}
			// password ����ġ
			else if(!objUserBean.getPASS().equals(strPass)){
				request.setAttribute("message", "�н����带 Ȯ���Ͻñ� �ٶ��ϴ�.");
				return new ModelAndView("/admin/user/login");
			}
			// �α��� ����
			else{
				// ���ǿ� �α� ���� ��� �� ������ �������� �̵�
				HttpSession session = request.getSession();
				session.setAttribute("sessionUserId", objUserBean.getUSERID());
				session.setAttribute("sessionAuthur", objUserBean.getAUTHURNAME());
				session.setAttribute("sessionName", objUserBean.getUSERNAME());
				session.setAttribute("sessionOrgCD", objUserBean.getADMINIST());
				request.setAttribute("userId", strUserId);
				request.setAttribute("userName", objUserBean.getUSERNAME());
				request.setAttribute("userAuthur", objUserBean.getAUTHURNAME());
				
				System.out.println("����� �̸� : : : : "+objUserBean.getUSERNAME());
				return new ModelAndView("/admin/main/main");
			}	
		}
	}
	
	
	
	public ModelAndView ramsNoticeView(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String SEQNUM = ServletRequestUtils.getStringParameter(request, "SEQNUM", "");
		
		request.setAttribute("ramsNotice", objUserService.getRamsNoticeList(SEQNUM).get(0));
			
		return new ModelAndView("/admin/user/rams_notice_view");
	}
	
  	 /**
   	 * userRegó��
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	
	public ModelAndView userReg(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		String strUserId = ServletRequestUtils.getStringParameter(request, "USERID", "").trim();
		String strPass = ServletRequestUtils.getStringParameter(request, "PASS", "").trim();
		
		strUserId = strUserId.replace('=','#');
		strUserId = strUserId.replace(';','#');
		strUserId = strUserId.replaceAll("<","&lt;");
		strUserId = strUserId.replaceAll(">","&gt;");
		
		strPass = strPass.replace('=','#');
		strPass = strPass.replace(';','#');
		strPass = strPass.replaceAll("<","&lt;");
		strPass = strPass.replaceAll(">","&gt;");

		if(strUserId == null || strUserId == "")
		{	
			return new ModelAndView("/admin/user/login");
		}
		else
		{
			UserBean objUserBean = objUserRegService.getUserDetail(strUserId);
			
			// ��ϵ� ����ڰ� �ƴ�
			if(objUserBean == null){
				request.setAttribute("message", "�������� �ʴ� ID�Դϴ�");
				return new ModelAndView("/admin/user/login");
			}
			// �������� ����     
			else if(!objUserBean.getISAPPROVE().equals("Y")){
				request.setAttribute("message", "�������� �ʾҽ��ϴ�.");
				return new ModelAndView("/admin/user/login");
			}
			// password ����ġ
			else if(!objUserBean.getPASS().equals(strPass)){
				request.setAttribute("message", "�н����带 Ȯ���Ͻñ� �ٶ��ϴ�.");
				return new ModelAndView("/admin/user/login");
			}
			// �α��� ����
			else{
				// ���ǿ� �α� ���� ��� �� ������ �������� �̵�
				HttpSession session = request.getSession();
				
				session.setAttribute("sessionUserId", objUserBean.getUSERID());
				session.setAttribute("sessionAuthur", objUserBean.getAUTHURNAME());
				session.setAttribute("sessionName", objUserBean.getUSERNAME());
				session.setAttribute("sessionOrgCD", objUserBean.getSIGU_CD());
				request.setAttribute("userId", strUserId);
				
				return new ModelAndView("/admin/main/main");
			}	
		}
	}
	
 	 /**
   	 * findIdó��
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	public ModelAndView findId(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		String strUserId = ServletRequestUtils.getStringParameter(request, "USERID", "").trim();
		String strPass = ServletRequestUtils.getStringParameter(request, "PASS", "").trim();
		
		strUserId = strUserId.replace('=','#');
		strUserId = strUserId.replace(';','#');
		strUserId = strUserId.replaceAll("<","&lt;");
		strUserId = strUserId.replaceAll(">","&gt;");
		
		strPass = strPass.replace('=','#');
		strPass = strPass.replace(';','#');
		strPass = strPass.replaceAll("<","&lt;");
		strPass = strPass.replaceAll(">","&gt;");

		if(strUserId == null || strUserId == "")
		{	
			return new ModelAndView("/admin/user/login");
		}
		else
		{
			UserBean objUserBean = objUserRegService.getUserDetail(strUserId);
			
			// ��ϵ� ����ڰ� �ƴ�
			if(objUserBean == null){
				request.setAttribute("message", "�������� �ʴ� ID�Դϴ�");
				return new ModelAndView("/admin/user/login");
			}
			// �������� ����     
			else if(!objUserBean.getISAPPROVE().equals("Y")){
				request.setAttribute("message", "�������� �ʾҽ��ϴ�.");
				return new ModelAndView("/admin/user/login");
			}
			// password ����ġ
			else if(!objUserBean.getPASS().equals(strPass)){
				request.setAttribute("message", "�н����带 Ȯ���Ͻñ� �ٶ��ϴ�.");
				return new ModelAndView("/admin/user/login");
			}
			// �α��� ����
			else{
				// ���ǿ� �α� ���� ��� �� ������ �������� �̵�
				HttpSession session = request.getSession();
				session.setAttribute("sessionUserId", objUserBean.getUSERID());
				session.setAttribute("sessionAuthur", objUserBean.getAUTHURNAME());
				session.setAttribute("sessionName", objUserBean.getUSERNAME());
				session.setAttribute("sessionOrgCD", objUserBean.getSIGU_CD());
				request.setAttribute("userId", strUserId);
				System.out.println("����� �̸� : : : : "+objUserBean.getUSERNAME());

				return new ModelAndView("/admin/main/main");
			}	
		}
	}
    	
	/**
   	 * logoutó��
 	 * @param HttpServletRequest request 
 	 * @param HttpServletResponse response
	 * @return ModelAndView
	 */
	
	public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) throws Exception {

		HttpSession session = request.getSession();
		
		session.removeAttribute("sessionUserId");
		session.removeAttribute("sessionOrgCD");
		
		return new ModelAndView("redirect:/admin/user/login.do");
	}
	
	
	
	//����� ����
	public ModelAndView userManager(HttpServletRequest request, HttpServletResponse response,String MSG) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		UserBean bean = new UserBean();
		List blist = null;

		try{
			if(userId != null)
			{
				
				String USERNAME = ServletRequestUtils.getStringParameter(request, "USERNAME", "");
				String GU_CD = ServletRequestUtils.getStringParameter(request, "GU_CD", "");
				String ISAPPROVE = ServletRequestUtils.getStringParameter(request, "ISAPPROVE", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				
				System.out.println("MSG :: : :"+MSG);
				
				request.setAttribute("MSG", MSG);
				
				bean.setUSERID("%");
				bean.setUSERNAME(USERNAME.equals("")?"%":USERNAME);
				bean.setADMINIST(GU_CD.equals("")?"%":GU_CD);
				bean.setISAPPROVE(ISAPPROVE.equals("")?"%":ISAPPROVE);
				
				blist = objUserService.getUserList(bean,currentPage,Globals.DEFAULT_COUNTPER_PAGE);
				int listCount = objUserService.GetUserCount(bean);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&USERNAME="+USERNAME+"&GU_CD="+GU_CD+"&ISAPPROVE="+ISAPPROVE
						, "/rams/admin/user/user_manager.do", listCount);
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
				request.setAttribute("USERNAME", USERNAME);
				request.setAttribute("GU_CD", GU_CD);
				request.setAttribute("ISAPPROVE", ISAPPROVE);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("/admin/main/user_manager","blist",blist);
	}
	
	//����� ��޺�ȯ
	public ModelAndView userApproveModify(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		String MSG = "";
		//���κ���
		String NAME = ServletRequestUtils.getStringParameter(request, "NAME", "");
		String USERID = ServletRequestUtils.getStringParameter(request, "USERID", "");
		String APPROVE = ServletRequestUtils.getStringParameter(request, "APPROVE", "");

		try{
			if(userId != null)
			{

				objUserService.setUserApprove(APPROVE, USERID);
				
				if(APPROVE.equals("Y")){
					MSG = NAME+"�Կ� ����ó�� �Ǿ����ϴ�.";
				}else{
					MSG = NAME+"�Կ� ������ öȸ�Ǿ����ϴ�.";
				}
			}
		}catch(Exception e){
			MSG = NAME+"�Կ� ������ �����Ͽ����ϴ�.";
		}
		
		return userManager(request,response,MSG);
	}
	
	//����� ����
	public ModelAndView userDelete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		//����� ����
		String TARGET_ID = ServletRequestUtils.getStringParameter(request, "TARGET_ID", "");
		String MSG = "";

		try{
			if(userId != null)
			{
				//����� ����
				objUserService.setUserDelete(TARGET_ID);
				MSG = "�����ID "+TARGET_ID+"�� �����Ǿ����ϴ�.";
			}
		}catch(Exception e){
			MSG = "�����ID "+TARGET_ID+"�� ������ �����Ͽ����ϴ�.";
		}
		
		return userManager(request,response,MSG);
	}
	
	//����� ����
	public ModelAndView userModify(HttpServletRequest request, HttpServletResponse response,String MSG) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		UserBean bean = new UserBean();
		UserBean view = new UserBean();

		try{
			if(userId != null)
			{
				
				String TARGET_ID = ServletRequestUtils.getStringParameter(request, "TARGET_ID", "");
				bean.setUSERID(TARGET_ID);
				bean.setUSERNAME("%");
				bean.setADMINIST("%");
				bean.setISAPPROVE("%");
				
				view = (UserBean)objUserService.getUserList(bean,"1","1").get(0);
				
				if(view.getJUMINNUM() != null && view.getJUMINNUM().length() == 13){
					view.setJUMINNUM1(view.getJUMINNUM().substring(0, 6));
					view.setJUMINNUM2(view.getJUMINNUM().substring(6,13));
				}
				request.setAttribute("MSG", MSG);				
				request.setAttribute("TARGET_ID", TARGET_ID);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("/admin/main/user_modify","view",view);
	}
	
	//����� ���� ó��
	public ModelAndView userModifyPrc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String MSG = "";
		UserBean bean = new UserBean();
		

		try{
			if(userId != null)
			{
				bind(request, bean);
				String TARGET_ID = ServletRequestUtils.getStringParameter(request, "TARGET_ID", "");
				String AUTHURNAME = "";
                String[] AUTHUR = request.getParameterValues("AUTHUR");
                for (int i = 0; i < AUTHUR.length; i++) {
                	AUTHURNAME += AUTHUR[i];
				}
                bean.setUSERID(TARGET_ID);
                bean.setJUMINNUM(bean.getJUMINNUM1()+bean.getJUMINNUM2());
                bean.setAUTHURNAME(AUTHURNAME);
                
                objUserService.setUserUpdate(bean);
                
                MSG = "����� ������ �����Ǿ����ϴ�.";
                
                
				
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "����� ���� ������ �����Ͽ����ϴ�.";
		}
		return userModify(request,response,MSG);
	}
	
	//����� ������
	public ModelAndView idRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		String msg = ServletRequestUtils.getStringParameter(request, "msg", "");
		
		System.out.println("����ڰ���");
		
		List list = objUserRegService.getGuCodeList();
		
		System.out.println("list : "+list.size());
		
		
		String gu = "<select id='ADMINIST' name='ADMINIST' class='formBox6'>";
		
		for(int i  = 0; i<list.size();i++){
		UserBean bean = (UserBean)list.get(i);
		
			if(!bean.getGU_CD().equals("450")){
				gu += "<option value='"+bean.getGU_CD()+"'>"+bean.getGU_NM()+"</option>";
			}
		}
		
		gu+= "</select>";
		
		String job ="<SELECT ID='AUTHURNAME' NAME='AUTHURNAME' class='formBox6'>";
		
		job +="<OPTION VALUE='12345' selected>���������</OPTION>";
		job +="<OPTION VALUE='012345'>������</OPTION></SELECT>";			
		
		
	
		
		System.out.println(gu);
		
		
		//System.out.println(bean2.getEMAIL());
		
		
		request.setAttribute("gu", gu);
		request.setAttribute("job", job);
		request.setAttribute("msg", msg);
		return new ModelAndView("/admin/user/id_request");
	
	}

	//����� ������
	public ModelAndView idRequestPrc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		System.out.println("���������");
		
		UserBean bean2 = new UserBean();
		
		
		String userId = ServletRequestUtils.getStringParameter(request, "USERID", "");
		
		bean2.setUSERID(userId);
		bean2.setAUTHURNAME(ServletRequestUtils.getStringParameter(request, "AUTHURNAME", "123456"));
		bean2.setPASS(ServletRequestUtils.getStringParameter(request, "PASS", ""));
		bean2.setPASS2(ServletRequestUtils.getStringParameter(request, "PASS2", ""));
		bean2.setUSERNAME(ServletRequestUtils.getStringParameter(request, "USERNAME", ""));
		bean2.setADMINIST(ServletRequestUtils.getStringParameter(request, "ADMINIST", ""));
		bean2.setPART(ServletRequestUtils.getStringParameter(request, "PART", ""));
		bean2.setINLINENUM(ServletRequestUtils.getStringParameter(request, "INLINENUM", ""));
		bean2.setTEL1(ServletRequestUtils.getStringParameter(request, "TEL1", ""));
		bean2.setTEL2(ServletRequestUtils.getStringParameter(request, "TEL2", ""));
		bean2.setTEL3(ServletRequestUtils.getStringParameter(request, "TEL3", ""));
		
		bean2.setMTEL1(ServletRequestUtils.getStringParameter(request, "MTEL1", ""));		
		bean2.setMTEL2(ServletRequestUtils.getStringParameter(request, "MTEL2", ""));
		bean2.setMTEL3(ServletRequestUtils.getStringParameter(request, "MTEL3", ""));
		bean2.setEMAIL(ServletRequestUtils.getStringParameter(request, "EMAIL", ""));
		bean2.setASSIGNWORK(ServletRequestUtils.getStringParameter(request, "ASSIGNWORK", ""));
		bean2.setISAPPROVE("N");
		bean2.setJUMINNUM(ServletRequestUtils.getStringParameter(request, "JUMINNUM1", "")+ServletRequestUtils.getStringParameter(request, "JUMINNUM2", ""));
		bean2.setJUMINNUM1(ServletRequestUtils.getStringParameter(request, "JUMINNUM1", ""));
		bean2.setJUMINNUM2(ServletRequestUtils.getStringParameter(request, "JUMINNUM2", ""));
		int i  = objUserRegService.checkUserId(userId);
		
		Boolean a = false;
		
		if(i==0){
			a =  objUserRegService.insertMember(bean2);
			
			System.out.println("ȸ������ ����? : "+a);
			
			
			return new ModelAndView("redirect:/admin/user/idRequest.do?msg=��ϵǾ����ϴ�");
			
		}else{
	
			List list = objUserRegService.getGuCodeList();
			
			String gu = "<select id='ADMINIST' name='ADMINIST' class='formBox6'>";
			
			
			System.out.println("BEAN : "+bean2.getADMINIST());
			for(int j  = 0; j<list.size();j++){
			UserBean bean = (UserBean)list.get(j);
			
			
				if(!bean.getGU_CD().equals("450")){
					if(bean.getGU_CD().equals(bean2.getADMINIST())){
						gu += "<option value='"+bean.getGU_CD()+"' selected>"+bean.getGU_NM()+"</option>";						
						
					}else{
						gu += "<option value='"+bean.getGU_CD()+"'>"+bean.getGU_NM()+"</option>";
					}
				}
			}
					
			
			gu+= "</select>";
			
			String job ="<SELECT ID='AUTHURNAME' NAME='AUTHURNAME' class='formBox6'>";
			if(bean2.getAUTHURNAME()=="012345"){
				job +="<OPTION VALUE='12345'>���������</OPTION>";
				job += "<OPTION VALUE='012345' selected>������</OPTION></SELECT>";			
			}else{
				job +="<OPTION VALUE='12345' selected>���������</OPTION>";	
				job += "<OPTION VALUE='012345'>������</OPTION></SELECT>";			
			}
		
			
			request.setAttribute("gu", gu);
			request.setAttribute("job", job);	
			request.setAttribute("bean2", bean2);
			request.setAttribute("msg","���� ���̵� �ֽ��ϴ�.");
			
			
			return new ModelAndView("/admin/user/id_request");
			
		}
		
		

		
	
	}
	
	public ModelAndView		CompareUserId(HttpServletRequest request,HttpServletResponse response) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= ServletRequestUtils.getStringParameter(request,"USERID");
		

		System.out.println("userId : "+userId);
		
			String	Xml	= "<?xml version='1.0' encoding='utf-8'?>";
			Xml	+= "<ROOT>";

			int i  = objUserRegService.checkUserId(userId);
	                		  
	                			
	                        	Xml += "<td>"+i+"</td>";	                        	
	                        	

	                        	System.out.println("id�� ���� : "+i);
			Xml	+= "</ROOT>";

	        response.setContentType("text/html;charset=EUC-KR");
	        response.setHeader("Cache-Control", "no-cache");
	        response.getWriter().write(Xml);
	        
	        System.out.println("Get_GU_CD :::::::::"+Xml);
	        
	        

		return null;
	}

}