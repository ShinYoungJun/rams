package main.java.reward.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.FileUploadUtil;
import main.java.common.util.Globals;
import main.java.common.util.StringUtil;
import main.java.reward.model.CompeFileBean;
import main.java.reward.model.CompeGongsaBean;
import main.java.reward.model.CompeViewBean;
import main.java.reward.model.CompeWriteBean;
import main.java.reward.model.RewardBean;
import main.java.reward.model.RewardRightViewBean;
import main.java.reward.service.IRewardService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class RewardControl extends MultiActionController {

	private IRewardService objRewardService = null;
	private	CommonCodeService	commonCode		= null;		

	public void setRewardService(IRewardService newObjRewardService) {
		this.objRewardService = newObjRewardService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	// 권리권자 보기
	public ModelAndView RewardRightView(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
		List	compeFileList	=	null;
		
		RewardRightViewBean rightBean = new RewardRightViewBean();
		

		try{
			if(userId != null)
			{
				System.out.println("권리권자 보기");
				
				compeFileList = objRewardService.getComepeFileList(COMPEID);
				
				request.setAttribute("compeFileList", compeFileList);
				
				rightBean = (RewardRightViewBean)objRewardService.getRewardRightView(COMPEID).get(0);
				
				request.setAttribute("rightBean", rightBean);

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_right_view_pop");
	}
	
	///보상관련자료 추가
	public ModelAndView RewardFilePopAdd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		System.out.println("제출자료 추가");
		String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
		String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
		String MSG = "";
		
		CompeFileBean bean = new CompeFileBean();
		
		try{
			if(userId != null)
			{
				MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
				MultipartFile REWARD_FILE = mpRequest.getFile("REWARD_FILE");

				bean.setCOMPEID(COMPEID);
				bean.setPATH(Globals.COMPEFILEPATH);
				bean.setFILENAME(FileUploadUtil.uploadFormFile(REWARD_FILE, Globals.FILEUPLOADPATH+Globals.LAWSUITFILEPATH));
				
				objRewardService.setRewardCompeFileInsert(bean);
				MSG = "추가 되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "추가에 실패하였습니다.";
		}
		return new ModelAndView("redirect:/reward/reward_file_pop.do?COMPEID="+COMPEID+"&PNU="+PNU+"&MSG="+MSG);
	}
	
	
	///보상관련자료 삭제
	public ModelAndView RewardFilePopDel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		System.out.println("제출자료 삭제");
		String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
		String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
		String MSG = "";
		
		CompeFileBean bean = new CompeFileBean();
		
		try{
			if(userId != null)
			{
				String FILEID = ServletRequestUtils.getStringParameter(request, "FILEID", "");
				bean.setCOMPEID(COMPEID);
				bean.setFILEID(FILEID);
				objRewardService.setRewardCompeFileDel(bean);
				MSG = "삭제 되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "삭제에 실패하였습니다.";
		}
		return new ModelAndView("redirect:/reward/reward_file_pop.do?COMPEID="+COMPEID+"&PNU="+PNU+"&MSG="+MSG);
	}
	
	//보상 파일 보기
	public ModelAndView RewardFilePop(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	compeFileList	=	null;
		
		try{
			if(userId != null)
			{
				System.out.println("보상 상세보기");
				
				String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				
				System.out.println(COMPEID+"::"+PNU);
				
				compeFileList = objRewardService.getComepeFileList(COMPEID);
				
				request.setAttribute("COMPEID", COMPEID);
				request.setAttribute("PNU",PNU);
				request.setAttribute("MSG",MSG);
				
				request.setAttribute("blist", compeFileList);
				request.setAttribute("filePath",Globals.FILEUPLOADPATH);
				request.setAttribute("rewardPath",Globals.COMPEFILEPATH);
				
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_file_pop");
	}
	
	// 보상 수정 보기 
	public ModelAndView RewardViewMody(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 		GU_CD 	= ServletRequestUtils.getStringParameter(request, "GU_CD", "");
		List	compeFileList	=	null;
		
		CompeViewBean viewBean = new CompeViewBean();

		try{
			if(userId != null)
			{
				System.out.println("보상 수정 보기");
				
				String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				
				compeFileList = objRewardService.getComepeFileList(COMPEID);
				
				request.setAttribute("compeFileList", compeFileList);
				request.setAttribute("filePath",Globals.FILEUPLOADPATH);
				request.setAttribute("rewardPath",Globals.COMPEFILEPATH);
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
				request.setAttribute("dongList", commonCode.getBJDongList(GU_CD, ""));
				
				viewBean = (CompeViewBean)objRewardService.getComepeView(COMPEID, PNU).get(0);
				
				request.setAttribute("jimokList", objRewardService.geJimokList("2"));
				request.setAttribute("compeView", viewBean);

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_view_mody");
	}
	
	// 보상 수정 
	public ModelAndView RewardViewUpdatePrc(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("sessionUserId");
		String msg = "";
		String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
		
		CompeWriteBean writeBean = new CompeWriteBean();

		try {
			if (userId != null) {
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				String GOSIID = ServletRequestUtils.getStringParameter(request, "GOSIID", "");
				String CONSTID = ServletRequestUtils.getStringParameter(request, "CONSTID", "");
				String CONSTNUM = ServletRequestUtils.getStringParameter(request, "CONSTNUM", "");
				String COMPENUM = ServletRequestUtils.getStringParameter(request, "COMPENUM", "");
				String AREA_GU_CD = ServletRequestUtils.getStringParameter(request, "AREA_GU_CD", "");
				String AREA_DONG_CD = ServletRequestUtils.getStringParameter(request, "AREA_DONG_CD", "");
				String AREA_ADDRESS = ServletRequestUtils.getStringParameter(request, "AREA_ADDRESS", "");
				String AREA_BONBUN = ServletRequestUtils.getStringParameter(request, "AREA_BONBUN", "");
				String AREA_BUBUN = ServletRequestUtils.getStringParameter(request, "AREA_BUBUN", "");
				String AREA_FULL_ADDRESS = AREA_GU_CD+" "+AREA_DONG_CD+" "+AREA_ADDRESS;
				String JIMOK = ServletRequestUtils.getStringParameter(request, "JIMOK", "");
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String REASON = ServletRequestUtils.getStringParameter(request, "REASON", "");
				String OFFICENAME_1 = ServletRequestUtils.getStringParameter(request, "OFFICENAME_1", "");
				String DANGA_1 = ServletRequestUtils.getStringParameter(request, "DANGA_1", "");
				String JUDGEPRICE_1 = ServletRequestUtils.getStringParameter(request, "JUDGEPRICE_1", "");
				String POINTDATE_1 = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "POINTDATE_1", ""));
				String OFFICENAME_2 = ServletRequestUtils.getStringParameter(request, "OFFICENAME_2", "");
				String DANGA_2 = ServletRequestUtils.getStringParameter(request, "DANGA_2", "");
				String JUDGEPRICE_2 = ServletRequestUtils.getStringParameter(request, "JUDGEPRICE_2", "");
				String POINTDATE_2 = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "POINTDATE_2", ""));
				String CP_NAME = ServletRequestUtils.getStringParameter(request, "CP_NAME", "");
				String CP_JUMIN = ServletRequestUtils.getStringParameter(request, "CP_JUMIN", "");
				String CP_REGION = ServletRequestUtils.getStringParameter(request, "CP_REGION", "");
				String CP_DEPT_CODE = ServletRequestUtils.getStringParameter(request, "CP_DEPT_CODE", "");
				String CP_DONG_CODE = ServletRequestUtils.getStringParameter(request, "CP_DONG_CODE", "");
				
				//String CP_REGION_TEXT = ServletRequestUtils.getStringParameter(request, "CP_REGION_TEXT", "");
				//String CP_DEPT_CODE_TEXT = ServletRequestUtils.getStringParameter(request, "CP_DEPT_CODE_TEXT", "");
				//String CP_DONG_CODE_TEXT = ServletRequestUtils.getStringParameter(request, "CP_DONG_CODE_TEXT", "");
				
				String CP_ADDRESS = ServletRequestUtils.getStringParameter(request, "CP_ADDRESS", "");
				
				//String CP_FULL_ADDRESS = CP_REGION_TEXT+" "+CP_DEPT_CODE_TEXT+" "+CP_DONG_CODE_TEXT+" "+CP_ADDRESS;
				String CP_FULL_ADDRESS = CP_ADDRESS;
				String REQDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "REQDATE", ""));
				String RECEIPT = ServletRequestUtils.getStringParameter(request, "RECEIPT", "");
				String LANDGUBUN = ServletRequestUtils.getStringParameter(request, "LANDGUBUN", "");
				String LANDDETAIL = ServletRequestUtils.getStringParameter(request, "LANDDETAIL", "");
				String CP_AUTH_YN = ServletRequestUtils.getStringParameter(request, "CP_AUTH_YN", "");

				
				writeBean.setGOSIID(GOSIID);
				writeBean.setCONSTID(CONSTID);
				writeBean.setCONSTNUM(CONSTNUM);
				writeBean.setCOMPEID(COMPEID);
				writeBean.setCOMPENUM(COMPENUM);
				writeBean.setBONBUN(AREA_BONBUN);
				writeBean.setBUBUN(AREA_BUBUN);
				writeBean.setAREA_GU_CD(AREA_GU_CD);
				writeBean.setAREA_DONG_CD(AREA_DONG_CD);
				writeBean.setPNU_before(PNU);
				writeBean.setPNU(Globals.DEFAULT_SI_CD+writeBean.getAREA_GU_CD()+writeBean.getAREA_DONG_CD()+"1"+StringUtil.replaceCipher(writeBean.getBONBUN(),4,"0")+StringUtil.replaceCipher(writeBean.getBUBUN(),4,"0"));
				writeBean.setAREA_ADDRESS(AREA_ADDRESS);
				//writeBean.setAREA_ADDRESS(AREA_FULL_ADDRESS);
				writeBean.setJIMOK(JIMOK);
				writeBean.setAFFAIRNUM(AFFAIRNUM);
				writeBean.setREASON(REASON);
				writeBean.setOFFICENAME_1(OFFICENAME_1);
				writeBean.setDANGA_1(DANGA_1);
				writeBean.setJUDGEPRICE_1(JUDGEPRICE_1);
				writeBean.setPOINTDATE_1(POINTDATE_1);
				writeBean.setOFFICENAME_2(OFFICENAME_2);
				writeBean.setDANGA_2(DANGA_2);
				writeBean.setJUDGEPRICE_2(JUDGEPRICE_2);
				writeBean.setPOINTDATE_2(POINTDATE_2);
				writeBean.setCP_NAME(CP_NAME);
				writeBean.setCP_JUMIN(CP_JUMIN);
				writeBean.setCP_REGION(CP_REGION);
				writeBean.setCP_DEPT_CODE(CP_DEPT_CODE);
				writeBean.setCP_DONG_CODE(CP_DONG_CODE);
				//writeBean.setCP_ADDRESS(CP_ADDRESS);
				writeBean.setCP_ADDRESS(CP_FULL_ADDRESS);
				writeBean.setREQDATE(REQDATE);
				writeBean.setRECEIPT(RECEIPT);
				writeBean.setLANDGUBUN(LANDGUBUN);
				writeBean.setLANDDETAIL(LANDDETAIL);
				writeBean.setCP_AUTH_YN(CP_AUTH_YN);
				writeBean.setUSERID(userId);
				
				try{
					objRewardService.setComepeReQUpdate(writeBean);
					objRewardService.setComepePersonUpdate(writeBean);
					objRewardService.setComepensationUpdate(writeBean);
					objRewardService.setComepeJudge1Update(writeBean);
					objRewardService.setComepeJudge2Update(writeBean);
					
					msg = "정보가 수정되었습니다.";
				}catch (Exception e) {
					e.printStackTrace();
					msg = "시스템 오류로 저장이 취소되었습니다.";
				}
				
				request.setAttribute("COMPEID", COMPEID);
				request.setAttribute("CONSTNUM", CONSTNUM);

			}
			System.out.println("수정끝-:"+msg);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView(
				"redirect:/reward/reward_view.do?COMPEID="+ COMPEID + "&PNU="+writeBean.getPNU() + "&MSG=" + msg);
	}
	
	
	// 보상 쓰기 보기
	public ModelAndView RewardWrite(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session 	= request.getSession();
		String 		userId		= (String)session.getAttribute("sessionUserId");
		String 		sCOMPEID 	= ServletRequestUtils.getStringParameter(request, "COMPEID", "");
		
		CompeViewBean compeViewBean = new CompeViewBean();

		try{
			if(userId != null)
			{

				if ("".equals(sCOMPEID)){
					compeViewBean = (CompeViewBean)objRewardService.getCompeId().get(0);
					request.setAttribute("COMPEID", compeViewBean.getCOMPEID());

				}else{
					request.setAttribute("COMPEID", sCOMPEID);
				}
				
				request.setAttribute("jimokList", objRewardService.geJimokList("2"));
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_write");
	}
	
	
	// 보상 입력 
	public ModelAndView RewardAreaWritePrc(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("sessionUserId");
		
		String msg = "";
		String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
		
		CompeWriteBean writeBean = new CompeWriteBean();

		try {
			if (userId != null) {
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				String GOSIID = ServletRequestUtils.getStringParameter(request, "GOSIID", "");
				String CONSTID = ServletRequestUtils.getStringParameter(request, "CONSTID", "");
				String CONSTNUM = ServletRequestUtils.getStringParameter(request, "CONSTNUM", "");
				String COMPENUM = ServletRequestUtils.getStringParameter(request, "COMPENUM", "");
				String AREA_GU_CD = ServletRequestUtils.getStringParameter(request, "AREA_GU_CD", "");
				String AREA_DONG_CD = ServletRequestUtils.getStringParameter(request, "AREA_DONG_CD", "");
				String AREA_ADDRESS = ServletRequestUtils.getStringParameter(request, "AREA_ADDRESS", "");
				String AREA_BONBUN = ServletRequestUtils.getStringParameter(request, "AREA_BONBUN", "");
				String AREA_BUBUN = ServletRequestUtils.getStringParameter(request, "AREA_BUBUN", "");
				String AREA_FULL_ADDRESS = AREA_GU_CD+" "+AREA_DONG_CD+" "+AREA_ADDRESS;
				String JIMOK = ServletRequestUtils.getStringParameter(request, "JIMOK", "");
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String REASON = ServletRequestUtils.getStringParameter(request, "REASON", "");
				String OFFICENAME_1 = ServletRequestUtils.getStringParameter(request, "OFFICENAME_1", "");
				String DANGA_1 = ServletRequestUtils.getStringParameter(request, "DANGA_1", "");
				String JUDGEPRICE_1 = ServletRequestUtils.getStringParameter(request, "JUDGEPRICE_1", "");
				String POINTDATE_1 = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "POINTDATE_1", ""));
				String OFFICENAME_2 = ServletRequestUtils.getStringParameter(request, "OFFICENAME_2", "");
				String DANGA_2 = ServletRequestUtils.getStringParameter(request, "DANGA_2", "");
				String JUDGEPRICE_2 = ServletRequestUtils.getStringParameter(request, "JUDGEPRICE_2", "");
				String POINTDATE_2 = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "POINTDATE_2", ""));
				String CP_NAME = ServletRequestUtils.getStringParameter(request, "CP_NAME", "");
				String CP_JUMIN = ServletRequestUtils.getStringParameter(request, "CP_JUMIN", "");
				String CP_REGION = ServletRequestUtils.getStringParameter(request, "CP_REGION", "");
				String CP_DEPT_CODE = ServletRequestUtils.getStringParameter(request, "CP_DEPT_CODE", "");
				String CP_DONG_CODE = ServletRequestUtils.getStringParameter(request, "CP_DONG_CODE", "");
				
				String CP_REGION_TEXT = ServletRequestUtils.getStringParameter(request, "CP_REGION_TEXT", "");
				String CP_DEPT_CODE_TEXT = ServletRequestUtils.getStringParameter(request, "CP_DEPT_CODE_TEXT", "");
				String CP_DONG_CODE_TEXT = ServletRequestUtils.getStringParameter(request, "CP_DONG_CODE_TEXT", "");
				
				String CP_ADDRESS = ServletRequestUtils.getStringParameter(request, "CP_ADDRESS", "");
				
				String CP_FULL_ADDRESS = CP_REGION_TEXT+" "+CP_DEPT_CODE_TEXT+" "+CP_DONG_CODE_TEXT+" "+CP_ADDRESS;
				String REQDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "REQDATE", ""));
				String RECEIPT = ServletRequestUtils.getStringParameter(request, "RECEIPT", "");
				String LANDGUBUN = ServletRequestUtils.getStringParameter(request, "LANDGUBUN", "");
				String LANDDETAIL = ServletRequestUtils.getStringParameter(request, "LANDDETAIL", "");
				String CP_AUTH_YN = ServletRequestUtils.getStringParameter(request, "CP_AUTH_YN", "");

				
				writeBean.setGOSIID(GOSIID);
				writeBean.setCONSTID(CONSTID);
				writeBean.setCONSTNUM(CONSTNUM);
				writeBean.setCOMPEID(COMPEID);
				writeBean.setCOMPENUM(COMPENUM);
				writeBean.setBONBUN(AREA_BONBUN);
				writeBean.setBUBUN(AREA_BUBUN);
				writeBean.setAREA_GU_CD(AREA_GU_CD);
				writeBean.setAREA_DONG_CD(AREA_DONG_CD);
				//writeBean.setPNU(PNU);
				writeBean.setPNU(Globals.DEFAULT_SI_CD+writeBean.getAREA_GU_CD()+writeBean.getAREA_DONG_CD()+"1"+StringUtil.replaceCipher(writeBean.getBONBUN(),4,"0")+StringUtil.replaceCipher(writeBean.getBUBUN(),4,"0"));
				writeBean.setAREA_ADDRESS(AREA_ADDRESS);
				//writeBean.setAREA_ADDRESS(AREA_FULL_ADDRESS);
				writeBean.setJIMOK(JIMOK);
				writeBean.setAFFAIRNUM(AFFAIRNUM);
				writeBean.setREASON(REASON);
				writeBean.setOFFICENAME_1(OFFICENAME_1);
				writeBean.setDANGA_1(DANGA_1);
				writeBean.setJUDGEPRICE_1(JUDGEPRICE_1);
				writeBean.setPOINTDATE_1(POINTDATE_1);
				writeBean.setOFFICENAME_2(OFFICENAME_2);
				writeBean.setDANGA_2(DANGA_2);
				writeBean.setJUDGEPRICE_2(JUDGEPRICE_2);
				writeBean.setPOINTDATE_2(POINTDATE_2);
				writeBean.setCP_NAME(CP_NAME);
				writeBean.setCP_JUMIN(CP_JUMIN);
				writeBean.setCP_REGION(CP_REGION);
				writeBean.setCP_DEPT_CODE(CP_DEPT_CODE);
				writeBean.setCP_DONG_CODE(CP_DONG_CODE);
				//writeBean.setCP_ADDRESS(CP_ADDRESS);
				writeBean.setCP_ADDRESS(CP_FULL_ADDRESS);
				writeBean.setREQDATE(REQDATE);
				writeBean.setRECEIPT(RECEIPT);
				writeBean.setLANDGUBUN(LANDGUBUN);
				writeBean.setLANDDETAIL(LANDDETAIL);
				writeBean.setCP_AUTH_YN(CP_AUTH_YN);
				
				try{
					
					objRewardService.setComepeReQInsert(writeBean);
					objRewardService.setComepePersonInsert(writeBean);
					objRewardService.setComepensationInsert(writeBean);
					objRewardService.setComepeJudge1Insert(writeBean);
					objRewardService.setComepeJudge2Insert(writeBean);	
					
					msg = "정보가 저장되었습니다.";
				}catch (Exception e) {
					e.printStackTrace();
					msg = "시스템 오류로 저장이 취소되었습니다.";
				}
				
				request.setAttribute("COMPEID", COMPEID);
				request.setAttribute("CONSTNUM", CONSTNUM);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return new ModelAndView("redirect:/reward/reward_view.do?COMPEID="+ COMPEID + "&PNU=" + writeBean.getPNU() + "&MSG=" + msg);
	}
	
	
	// 공시 팝업 보기
	public ModelAndView RewardGongsiList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List		blist = null;
		
		RewardBean searchBean = new RewardBean();
		CompeGongsaBean gonsaView = new CompeGongsaBean();
		
		System.out.println("공시 리스트 시작");
		try{
			if(userId != null)
			{
				
				String SEARCH_VALUE = ServletRequestUtils.getStringParameter(request, "SEARCH_VALUE", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				
				
				searchBean.setSEARCH_VALUE(SEARCH_VALUE);
				searchBean.setSEARCH_VALUE(SEARCH_VALUE.equals("")?"%":"%"+SEARCH_VALUE+"%");
				
				blist = objRewardService.getGongsiList(searchBean,currentPage,Globals.DEFAULT_COUNTPER_PAGE);
				gonsaView = (CompeGongsaBean)blist.get(0);
				int listCount = Integer.parseInt(gonsaView.getTOTNUM());
				
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&SEARCH_VALUE="+SEARCH_VALUE, "/rams/reward/pop_reward_gongsa.do", listCount);
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", currentPage);
				
				request.setAttribute("SEARCH_VALUE", SEARCH_VALUE);
				
				System.out.println("공시 갯수:::"+blist.size());
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("/reward/pop_reward_gongsa","list", blist);
	}
	
	
	// 보상 상세보기
	public ModelAndView RewardView(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 		MSG	= ServletRequestUtils.getStringParameter(request, "MSG", "");
		List	compeFileList	=	null;
		
		CompeViewBean viewBean = new CompeViewBean();
		

		try{
			if(userId != null)
			{
				System.out.println("보상 상세보기");
				
				String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				
				System.out.println(COMPEID+"::"+PNU);
				
				compeFileList = objRewardService.getComepeFileList(COMPEID);
				
				request.setAttribute("MSG", MSG);
				request.setAttribute("compeFileList", compeFileList);
				request.setAttribute("filePath",Globals.FILEUPLOADPATH);
				request.setAttribute("rewardPath",Globals.COMPEFILEPATH);
				
				viewBean = (CompeViewBean)objRewardService.getComepeView(COMPEID, PNU).get(0);
				
				request.setAttribute("compeView", viewBean);
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_view");
	}
	
	
	// 보상리스트 출력
	public ModelAndView RewardList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		
		RewardBean searchBean = new RewardBean();
		

		try{
			if(userId != null)
			{
				System.out.println("보상리스트 조회");
				
				String SEARCH_VALUE = ServletRequestUtils.getStringParameter(request, "SEARCH_VALUE", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				
				
				searchBean.setSEARCH_VALUE(SEARCH_VALUE);
				searchBean.setSEARCH_VALUE(SEARCH_VALUE.equals("")?"%":"%"+SEARCH_VALUE+"%");
				
				int listCount = objRewardService.getRewardCount(searchBean);
				int listCompenCount = objRewardService.getRewardCompenCount(searchBean);
				
				
				blist = objRewardService.getRewardList(searchBean,currentPage,Globals.DEFAULT_COUNTPER_PAGE);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&SEARCH_VALUE="+SEARCH_VALUE, "/rams/reward/reward_list.do", listCount);
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("listCompenCount", String.valueOf(listCompenCount));
				request.setAttribute("currentPage", currentPage);
				
				request.setAttribute("SEARCH_VALUE", SEARCH_VALUE);
				
				System.out.println("보상갯수:::"+blist.size());
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_list","list", blist);
	}
	
	// 엑셀출력
	public ModelAndView RewardListExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		
		RewardBean searchBean = new RewardBean();
		

		try{
			if(userId != null)
			{
				System.out.println("보상리스트 조회");
				
				String SEARCH_VALUE = ServletRequestUtils.getStringParameter(request, "SEARCH_VALUE", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				
				searchBean.setSEARCH_VALUE(SEARCH_VALUE.equals("")?"%":"%"+SEARCH_VALUE+"%");
				searchBean.setSEARCH_VALUE(SEARCH_VALUE);
				
				int listCount = objRewardService.getRewardCount(searchBean);
				//blist = objRewardService.getRewardList(searchBean);
				

				
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", currentPage);

				
				request.setAttribute("SEARCH_VALUE", SEARCH_VALUE);
				
				
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_list","list", blist);
	}
	
	
}