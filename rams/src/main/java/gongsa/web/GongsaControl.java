package main.java.gongsa.web;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.gongsa.model.GongsaBean;
import main.java.gongsa.service.IGongsaService;
import main.java.common.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.FileUploadUtil;
import main.java.common.util.Globals;
import main.java.common.util.StringUtil;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class GongsaControl extends MultiActionController {

	private IGongsaService 				gongsaService 	= null;	
	private	CommonCodeService	commonCode	= null;	
	private	Util								util					= new Util();
	private	Pageing						pageing			= new Pageing();
	
	public void setGongsaService(IGongsaService gongsaService) {
		this.gongsaService = gongsaService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	////////////////////////////////////////////////////////////////////////////////////////////////////////
	// 공사대장 조회
	public ModelAndView gongsaList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");

		List glist = null;
		GongsaBean searchBean = new GongsaBean();
		

		try{
			if(userId != null)
			{
				System.out.println("++++++++++공사대장 검색결과리스트++++++++++");
				
				
				String CONSTCATEG = ServletRequestUtils.getStringParameter(request, "CONSTCATEG", "");
				String LINENAME = ServletRequestUtils.getStringParameter(request, "LINENAME", "");
				String FROM_STARTDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "FROM_STARTDATE", ""));
				String TO_STARTDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "TO_STARTDATE", ""));
				String FROM_ENDDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "FROM_ENDDATE", ""));
				String TO_ENDDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "TO_ENDDATE", ""));
				searchBean.setCONSTCATEG(CONSTCATEG.equals("")?"%":CONSTCATEG);
				searchBean.setLINENAME(LINENAME.equals("")?"%":"%"+LINENAME+"%");
				searchBean.setFROM_STARTDATE(FROM_STARTDATE.equals("")?"00000000":FROM_STARTDATE);
				searchBean.setTO_STARTDATE(TO_STARTDATE.equals("")?"99999999":TO_STARTDATE);
				searchBean.setFROM_ENDDATE(FROM_ENDDATE.equals("")?"00000000":FROM_ENDDATE);
				searchBean.setTO_ENDDATE(TO_ENDDATE.equals("")?"99999999":TO_ENDDATE);
				
				
				request.setAttribute("MSG", ServletRequestUtils.getStringParameter(request, "MSG", ""));
				
				
				
				int listCount = gongsaService.getGongsaListCount(searchBean);
				
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String countPerPage ="5";
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(countPerPage), 
						"&CONSTCATEG="+CONSTCATEG+"&LINENAME="+LINENAME+"&FROM_STARTDATE="+FROM_STARTDATE+
						"&TO_STARTDATE="+TO_STARTDATE+"&FROM_ENDDATE="+FROM_ENDDATE+"&TO_ENDDATE="+TO_ENDDATE,
						 "/rams/gongsa/gongsa_list.do", listCount);
				
				glist = gongsaService.getGongsaList(searchBean,currentPage,countPerPage);
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", currentPage);
				request.setAttribute("constCategList", commonCode.executeCommonCode("11", "공사종류", ""));
				request.setAttribute("CONSTCATEG", CONSTCATEG);
				request.setAttribute("LINENAME", LINENAME);
				request.setAttribute("FROM_STARTDATE", FROM_STARTDATE);
				request.setAttribute("TO_STARTDATE", TO_STARTDATE);
				request.setAttribute("FROM_ENDDATE", FROM_ENDDATE);
				request.setAttribute("TO_ENDDATE", TO_ENDDATE);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		
			return new ModelAndView("/gongsa/gongsa_list", "glist", glist);
		
	}
	

	
	
	// 공사대장 상세조회
	
	public ModelAndView gongsaDetail(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	list	=	null;
		try{
			if(userId != null)
			{
				System.out.println("공사대장 상세조회");
				
				String CONSTNUM = ServletRequestUtils.getStringParameter(request, "CONSTNUM", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				
				list = gongsaService.getGongsaDetail(CONSTNUM);
				GongsaBean bean = (GongsaBean)list.get(0);

				request.setAttribute("CONSTNUM", CONSTNUM);
				request.setAttribute("MSG", MSG);
				request.setAttribute("filePath",Globals.FILEUPLOADPATH);
				request.setAttribute("bean", bean);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/gongsa/gongsa_detail");
	}
	
	
	
	
	
	// 공사대장 삭제
	public ModelAndView gongsaDelete(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String msg = "";
	
		try{
			if(userId != null)
			{
				System.out.println("공사대장 삭제!!!!");
				String CONSTNUM = ServletRequestUtils.getStringParameter(request, "CONSTNUM", "");
				
				try{
				gongsaService.setGongsaDelete(CONSTNUM);
				gongsaService.setGongsaCarryDelete(CONSTNUM);
				gongsaService.setGongsaFileDelete(CONSTNUM);
				gongsaService.setGongsaPnuDelete(CONSTNUM);
					msg = "성공적으로 해당 공사대장이 삭제 되었습니다.";
				}catch (Exception e) {
					msg = "시스템 오류로 삭제가 취소되었습니다.";

				}
			}
	
	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/gongsa/gongsa_list.do?MSG="+msg);
	}
	
	
	
	
	//공사대장 수정
	public ModelAndView gongsaModify(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	list	=	null;
	
		try{
			if(userId != null)
			{
				System.out.println("공사대장 수정!!!!");
				String CONSTNUM = ServletRequestUtils.getStringParameter(request, "CONSTNUM", "");
				list = gongsaService.getGongsaDetail(CONSTNUM);
				GongsaBean bean = (GongsaBean)list.get(0);

				request.setAttribute("CONSTNUM", CONSTNUM);
				request.setAttribute("filePath",Globals.FILEUPLOADPATH);
				request.setAttribute("bean", bean);
				request.setAttribute("constCategList", commonCode.executeCommonCode("11", "공사종류", ""));
			}
	
	
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/gongsa/gongsa_modify");
	}
	
	// gongsa 글 작성 및 수정 완료
	public ModelAndView gongsaModifyPrc(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("sessionUserId");
		String msg = "";
		GongsaBean gongsaBean = new GongsaBean();

		try {
			if (userId != null) {

				MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
				MultipartFile PLAN_FILE = mpRequest.getFile("PLAN_FILE");
				MultipartFile NOTICE_FILE = mpRequest.getFile("NOTICE_FILE");
				MultipartFile PRINT_FILE = mpRequest.getFile("PRINT_FILE");
				MultipartFile ETC_FILE = mpRequest.getFile("ETC_FILE");

				String CONSTNUM = ServletRequestUtils.getStringParameter(request, "CONSTNUM", "");

				String GOSIID = ServletRequestUtils.getStringParameter(request,"GOSIID", "");
				String ANNPERMISSION = ServletRequestUtils.getStringParameter(request, "ANNPERMISSION", "");
				String LINENAME = ServletRequestUtils.getStringParameter(request, "LINENAME", "");
				String CONSTCATEG = ServletRequestUtils.getStringParameter(request, "CONSTCATEG", "");
				String STARTSECTION = ServletRequestUtils.getStringParameter(request, "STARTSECTION", "");
				String ENDSECTION = ServletRequestUtils.getStringParameter(request, "ENDSECTION", "");
				String CONSTPLACE = ServletRequestUtils.getStringParameter(request, "CONSTPLACE", "");
				String STARTDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "STARTDATE", ""));
				String ENDDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "ENDDATE", ""));
				String REASON = ServletRequestUtils.getStringParameter(request,"REASON", "");

				String NAME = ServletRequestUtils.getStringParameter(request,"NAME", "");
				String JUMINNUM = ServletRequestUtils.getStringParameter(request, "JUMINNUM", "");
				String TEL = ServletRequestUtils.getStringParameter(request,"TEL", "");
				String POSTNUM = ServletRequestUtils.getStringParameter(request, "POSTNUM", "");
				String ADDR = ServletRequestUtils.getStringParameter(request,"ADDR", "");
				
				String PLAN = ServletRequestUtils.getStringParameter(request, "PLAN", "");
				String NOTICE = ServletRequestUtils.getStringParameter(request,"NOTICE", "");
				String PRINT = ServletRequestUtils.getStringParameter(request, "PRINT", "");
				String ETC = ServletRequestUtils.getStringParameter(request,"ETC", "");

				gongsaBean.setCONSTNUM(CONSTNUM);

				gongsaBean.setGOSIID(GOSIID);
				gongsaBean.setANNPERMISSION(ANNPERMISSION);
				gongsaBean.setLINENAME(LINENAME);
				gongsaBean.setCONSTCATEG(CONSTCATEG);
				gongsaBean.setSTARTSECTION(STARTSECTION);
				gongsaBean.setENDSECTION(ENDSECTION);
				gongsaBean.setCONSTPLACE(CONSTPLACE);
				gongsaBean.setSTARTDATE(STARTDATE);
				gongsaBean.setENDDATE(ENDDATE);
				gongsaBean.setREASON(REASON);

				gongsaBean.setNAME(NAME);
				gongsaBean.setJUMINNUM(JUMINNUM);
				gongsaBean.setTEL(TEL);
				gongsaBean.setPOSTNUM(POSTNUM);
				gongsaBean.setADDR(ADDR);

				if (PLAN_FILE.getSize() > 0) {
					gongsaBean.setPLAN_FILE(FileUploadUtil.uploadFormFile(PLAN_FILE, Globals.FILEUPLOADPATH+Globals.CONSTFILEPATH));
				}else{
					gongsaBean.setPLAN_FILE(PLAN);
				}
				if (NOTICE_FILE.getSize() > 0) {
					gongsaBean.setNOTICE_FILE(FileUploadUtil.uploadFormFile(NOTICE_FILE, Globals.FILEUPLOADPATH+Globals.CONSTFILEPATH));
				}else{
					gongsaBean.setNOTICE_FILE(NOTICE);
				}
				if (PRINT_FILE.getSize() > 0) {
					gongsaBean.setPRINT_FILE(FileUploadUtil.uploadFormFile(PRINT_FILE, Globals.FILEUPLOADPATH+Globals.CONSTFILEPATH));
				}else{
					gongsaBean.setPRINT_FILE(PRINT);
				}
				if (ETC_FILE.getSize() > 0) {
					gongsaBean.setETC_FILE(FileUploadUtil.uploadFormFile(ETC_FILE, Globals.FILEUPLOADPATH+Globals.CONSTFILEPATH));
				}else{
					gongsaBean.setETC_FILE(ETC);
				}
				
				gongsaBean.setFILELOC(Globals.CONSTFILEPATH);

				try{
					gongsaService.setGongsaUpdate(gongsaBean);
					gongsaService.setGongsaCarryUpdate(gongsaBean);
					gongsaService.setGongsaFileUpdate(gongsaBean);
					msg = "수정된 글이 저장되었습니다.";
				}catch (Exception e) {
					e.printStackTrace();
					msg = "시스템 오류로 저장이 취소되었습니다.";
				}
				
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView(
				"redirect:/gongsa/gongsa_detail.do?CONSTNUM="+ gongsaBean.getCONSTNUM() + "&MSG=" + msg);
	}
	


}