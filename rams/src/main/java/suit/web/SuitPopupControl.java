package main.java.suit.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import main.java.common.service.CommonCodeService;
import main.java.common.util.FileUploadUtil;
import main.java.common.util.Globals;
import main.java.common.util.StringUtil;
import main.java.suit.model.SuitBean;
import main.java.suit.model.SuitFileBean;
import main.java.suit.model.SuitLandBean;
import main.java.suit.model.SuitRegBean;
import main.java.suit.model.SuitViewBean;
import main.java.suit.service.ISuitPopupService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class SuitPopupControl extends MultiActionController {

	private ISuitPopupService objSuitPopupService = null;
	private	CommonCodeService	commonCode		= null;		

	public void setSuitPopupService(ISuitPopupService newObjSuitPopupService) {
		this.objSuitPopupService = newObjSuitPopupService;
	}
	    
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode = commonCode;
	}
	
	//소유자 삭제
	public ModelAndView SuitOwnerPopDel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String Url = null;
		System.out.println("소유자 삭제");
		
		SuitBean regBean = new SuitBean();
		bind(request, regBean);
		String MSG = "";
		
		try{
			if(userId != null)
			{
				objSuitPopupService.setOwnerPopDel(regBean);
				MSG = "삭제 되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "삭제에 실패하였습니다.";
		}
		
		return new ModelAndView("redirect:/suit/suit_owner_pop.do?AFFAIRNUM="+regBean.getAFFAIRNUM()+"&PNU="+regBean.getPNU()+"&ISFIXED="+regBean.getISFIXED()+"&MSG="+MSG);
	}
	
	
	//소유자 추가
	public ModelAndView SuitOwnerPopAdd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String Url = null;
		
		
		System.out.println("소유자 추가");
		SuitBean regBean = new SuitBean();
		bind(request, regBean);
		String MSG = "";
		
		try{
			if(userId != null)
			{
				regBean.setJUMINNUM(regBean.getJUMINNUM_1()+regBean.getJUMINNUM_2());
				objSuitPopupService.setOwnerPopAdd(regBean);
				MSG = "저장 되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "저장에 실패하였습니다.";
		}
		
		return new ModelAndView("redirect:/suit/suit_owner_pop.do?AFFAIRNUM="+regBean.getAFFAIRNUM()+"&PNU="+regBean.getPNU()+"&ISFIXED="+regBean.getISFIXED()+"&MSG="+MSG);
	}
	
	//소유자 목록
	public ModelAndView SuitOwnerPop(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List blist = null;
		String Url = null;

		try{
			if(userId != null)
			{
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String ISFIXED = ServletRequestUtils.getStringParameter(request, "ISFIXED", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				
				
				blist = objSuitPopupService.getOwnerPopList(AFFAIRNUM,PNU,ISFIXED);
				
				request.setAttribute("MSG", MSG);
				request.setAttribute("AFFAIRNUM", AFFAIRNUM);
				request.setAttribute("ISFIXED", ISFIXED);
				request.setAttribute("PNU", PNU);
				
				if(ISFIXED.equals("1")){
					Url = "/suit/suit_owner_fixed_pop";
				}else{
					Url = "/suit/suit_owner_pop";
				}
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView(Url,"blist",blist);
	}
	
	///제출자료 추가
	public ModelAndView SuitFilePopAdd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		System.out.println("제출자료 추가");
		String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
		String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
		String MSG = "";
		
		SuitFileBean bean = new SuitFileBean();
		
		try{
			if(userId != null)
			{
				MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
				MultipartFile SUIT_FILE = mpRequest.getFile("SUIT_FILE");

				String PRESENTDAY = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "PRESENTDAY", ""));
				String CONTENT = ServletRequestUtils.getStringParameter(request,"CONTENT", "");
				String FILECATEG = ServletRequestUtils.getStringParameter(request, "FILECATEG", "");
				
				bean.setAFFAIRNUM(AFFAIRNUM);
				bean.setPRESENTDAY(PRESENTDAY);
				bean.setCONTENT(CONTENT);
				bean.setFILECATEG(FILECATEG);
				bean.setFILENAME(FileUploadUtil.uploadFormFile(SUIT_FILE, Globals.FILEUPLOADPATH+Globals.LAWSUITFILEPATH));
				bean.setFILELOC(Globals.LAWSUITFILEPATH);
				
				objSuitPopupService.setFilePopAdd(bean);
				MSG = "추가 되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "추가에 실패하였습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_file_pop.do?AFFAIRNUM="+AFFAIRNUM+"&PNU="+PNU+"&MSG="+MSG);
	}
	
	
	///제출자료 삭제
	public ModelAndView SuitFilePopDel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		System.out.println("제출자료 삭제");
		String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
		String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
		String MSG = "";
		
		try{
			if(userId != null)
			{
				String FILEID = ServletRequestUtils.getStringParameter(request, "FILEID", "");
				objSuitPopupService.setFilePopDel(AFFAIRNUM,FILEID);
				MSG = "삭제 되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "삭제에 실패하였습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_file_pop.do?AFFAIRNUM="+AFFAIRNUM+"&PNU="+PNU+"&MSG="+MSG);
	}
	
	
	//제출자료 관리
	public ModelAndView SuitFilePop(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List blist = null;

		try{
			if(userId != null)
			{
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				
				blist = objSuitPopupService.getFilePopList(AFFAIRNUM);
				
				request.setAttribute("MSG", MSG);
				request.setAttribute("AFFAIRNUM", AFFAIRNUM);
				request.setAttribute("PNU", PNU);
				request.setAttribute("filePath",Globals.FILEUPLOADPATH);
				request.setAttribute("suitPath",Globals.LAWSUITFILEPATH);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_file_pop","blist",blist);
	}
	

	
	
	//원고피고 삭제
	public ModelAndView SuitSuitorPopDel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		System.out.println("원고피고 삭제");
		
		SuitBean regBean = new SuitBean();
		bind(request, regBean);
		String MSG = "";
		
		try{
			if(userId != null)
			{
				objSuitPopupService.setSuitorPopDel(regBean);
				MSG = "삭제 되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "삭제에 실패하였습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_suitor_pop.do?AFFAIRNUM="+regBean.getAFFAIRNUM()+"&GUBUN="+regBean.getGUBUN()+"&MSG="+MSG);
	}
	
	
	//원고피고 추가
	public ModelAndView SuitSuitorPopAdd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		System.out.println("원고피고 추가");
		SuitBean regBean = new SuitBean();
		bind(request, regBean);
		String MSG = "";
		
		try{
			if(userId != null)
			{
				regBean.setJUMINNUM(regBean.getJUMINNUM_1()+regBean.getJUMINNUM_2());
				objSuitPopupService.setSuitorPopAdd(regBean);
				MSG = "저장 되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "저장에 실패하였습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_suitor_pop.do?AFFAIRNUM="+regBean.getAFFAIRNUM()+"&GUBUN="+regBean.getGUBUN()+"&MSG="+MSG);
	}
	
	
	
	//원고 피고 수정
	public ModelAndView SuitSuitorPop(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List blist = null;
		SuitViewBean view = new SuitViewBean();

		try{
			if(userId != null)
			{
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String GUBUN = ServletRequestUtils.getStringParameter(request, "GUBUN", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				
				
				blist = objSuitPopupService.getPopSuitorList(AFFAIRNUM,GUBUN);
				
				request.setAttribute("MSG", MSG);
				request.setAttribute("AFFAIRNUM", AFFAIRNUM);
				request.setAttribute("GUBUN", GUBUN);
				
				if(GUBUN.equals("1")){
					request.setAttribute("GUBUN_NM", "원고");
				}else{
					request.setAttribute("GUBUN_NM", "피고");
				}
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_suitor_pop","blist",blist);
	}
	
	
	//사건번호 변경 처리
	public ModelAndView SuitNumChangePrc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		String PRE_AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
		String PRE_PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
		String MSG = "";
		
		try{
			if(userId != null)
			{
				SuitRegBean regBean = new SuitRegBean();
				bind(request, regBean);
				regBean.setPRE_AFFAIRNUM(PRE_AFFAIRNUM);
				regBean.setAFFAIRNUM(regBean.getAFFAIRNUM_1()+regBean.getAFFAIRNUM_2()+regBean.getAFFAIRNUM_3());
				
				
				if(objSuitPopupService.getAffairNumCount(regBean.getAFFAIRNUM()) == 0){
					objSuitPopupService.setSuitNumChangePrc(regBean);
					PRE_AFFAIRNUM = regBean.getAFFAIRNUM();
					MSG = "변경되었습니다.";
				}else{
					MSG = "동일한 사건번호가 존재합니다.";
				}
				
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "변경에 실패하였습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_num_change_pop.do?AFFAIRNUM="+PRE_AFFAIRNUM+"&PNU="+PRE_PNU+"&MSG="+MSG);
	}
	
	
	//사건번호 변경
	public ModelAndView SuitNumChangePop(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		SuitBean bean = null;
		
		try{
			if(userId != null)
			{
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");

				request.setAttribute("AFFAIRNUM", AFFAIRNUM);
				request.setAttribute("PNU", PNU);
				request.setAttribute("MSG", MSG);
				request.setAttribute("affairNum2List", commonCode.executeCommonCode("10", "소송구분코드", ""));
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_num_change_pop");
	}
	
	
	//소송 승패 저장
	public ModelAndView SuitLawsuitResultModifyPop(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
		String MSG = "";
		
		try{
			if(userId != null)
			{
				String ANNOUNCEDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "ANNOUNCEDATE", ""));
				String OUTCOME = ServletRequestUtils.getStringParameter(request, "OUTCOME", "");
				String RESULT = ServletRequestUtils.getStringParameter(request, "RESULT", "");
				
				SuitBean bean = new SuitBean();
				
				bean.setAFFAIRNUM(AFFAIRNUM);
				bean.setANNOUNCEDATE(ANNOUNCEDATE);
				bean.setOUTCOME(OUTCOME);
				bean.setRESULT(RESULT);
				
				objSuitPopupService.setPopLawsuitResult(bean);
				MSG = "저장되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "저장에 실패하였습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_lawsuit_result_pop.do?AFFAIRNUM="+AFFAIRNUM+"&MSG="+MSG);
	}
	
	
	
	
	//소송 승패입력
	public ModelAndView SuitLawsuitResultPop(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		SuitBean bean = null;
		
		try{
			if(userId != null)
			{
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				request.setAttribute("MSG", MSG);
				
				bean = (SuitBean) objSuitPopupService.getPopLawsuitResult(AFFAIRNUM).get(0);
				
				request.setAttribute("AFFAIRNUM", AFFAIRNUM);
				request.setAttribute("OUTCOME_"+bean.getOUTCOME(), "checked");
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_lawsuit_result_pop","view",bean);
	}
	
	
	
	//소송토지 팝업 삭제
	public ModelAndView SuitLandPopDel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
		String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
		String MSG = "";
		
		try{
			if(userId != null)
			{
				String DEL_AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "DEL_AFFAIRNUM", "");
				String DEL_PNU = ServletRequestUtils.getStringParameter(request, "DEL_PNU", "");
				objSuitPopupService.setPopLandSuitDel(DEL_AFFAIRNUM,DEL_PNU);
				MSG = "삭제되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "삭제에 실패하였습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_land_pop.do?AFFAIRNUM="+AFFAIRNUM+"&PNU="+PNU+"&MSG="+MSG);
	}
	
	
	//소송토지 팝업 추가
	public ModelAndView SuitLandPopAdd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
		String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
		String MSG = "";
		
		try{
			if(userId != null)
			{
				
				SuitLandBean regBean = new SuitLandBean();
				bind(request, regBean);
				regBean.setAFFAIRNUM(AFFAIRNUM);
				regBean.setPNU(Globals.DEFAULT_SI_CD+regBean.getGU_CD()+regBean.getDONG_CD()+"1"+StringUtil.replaceCipher(regBean.getBONBUN(),4,"0")+StringUtil.replaceCipher(regBean.getBUBUN(),4,"0"));
				
				objSuitPopupService.setPopLandSuitInsert(regBean);
				
				MSG = "저장되었습니다.";
				
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "동일한 지번이 존재합니다.";
		}
		return new ModelAndView("redirect:/suit/suit_land_pop.do?AFFAIRNUM="+AFFAIRNUM+"&PNU="+PNU+"&MSG="+MSG);
	}
	
	
	//소송토지 팝업
	public ModelAndView SuitLandPop(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		List blist = null;

		try{
			if(userId != null)
			{
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				request.setAttribute("MSG", MSG);
				
				request.setAttribute("AFFAIRNUM",AFFAIRNUM);
				request.setAttribute("PNU",PNU);
				
				blist = objSuitPopupService.getPopLandSuitList(AFFAIRNUM,PNU);
				
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
				request.setAttribute("jimokList", commonCode.executeCommonCode("2", "지목코드", ""));
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("/suit/suit_land_pop","blist",blist);
	}
	
}