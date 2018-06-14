package main.java.reward.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.StringUtil;
import main.java.reward.model.RewardBean;
import main.java.reward.model.RewardLandBean;
import main.java.reward.model.RewardOwnBean;
import main.java.reward.model.RewardReviewBean;
import main.java.reward.service.IRewardPopupService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class RewardPopupControl extends MultiActionController {

	private IRewardPopupService objRewardPopupService = null;
	private	CommonCodeService	commonCode		= null;		

	public void setRewardPopupService(IRewardPopupService newObjRewardPopupService) {
		this.objRewardPopupService = newObjRewardPopupService;
	}
	    
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode = commonCode;
	}

	
	//보상토지 팝업 삭제
	public ModelAndView RewardLandPopDel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		String DEL_COMPEID = ServletRequestUtils.getStringParameter(request, "DEL_COMPEID", "");
		String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
		String MSG = "";
		
		try{
			if(userId != null)
			{
				String DEL_PNU = ServletRequestUtils.getStringParameter(request, "DEL_PNU", "");
				
				objRewardPopupService.setPopLandRewardDel(DEL_COMPEID,DEL_PNU);
				
				System.out.println("DEL_COMPEID:"+DEL_COMPEID);
				System.out.println("DEL_PNU:"+DEL_PNU);
				System.out.println("보상토지 팝업 삭제");
				
				MSG = "삭제되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "삭제에 실패하였습니다.";
		}
		return new ModelAndView("redirect:/reward/pop_reward_land.do?COMPEID="+DEL_COMPEID+"&MSG="+MSG+"&PNU="+PNU);
	}
	
	
	//보상토지 팝업 추가
	public ModelAndView RewardLandPopAdd(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
		String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
		String MSG = "";
		
		try{
			if(userId != null)
			{
				
				RewardLandBean regBean = new RewardLandBean();
				bind(request, regBean);
				regBean.setREGIID(userId);
				regBean.setCOMPEID(COMPEID);
				regBean.setPNU(Globals.DEFAULT_SI_CD+regBean.getGU_CD()+regBean.getDONG_CD()+"1"+StringUtil.replaceCipher(regBean.getBONBUN(),4,"0")+StringUtil.replaceCipher(regBean.getBUBUN(),4,"0"));
				
				System.out.println("보상토지 저장COMPEID:"+COMPEID);
				System.out.println("보상토지 저장PNU:"+PNU);
				System.out.println("보상토지 저장");
				objRewardPopupService.setPopLandRewardInsert(regBean);
				
				MSG = "저장되었습니다.";
				
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "동일한 지번이 존재합니다.";
		}
		return new ModelAndView("redirect:/reward/pop_reward_land.do?COMPEID="+COMPEID+"&MSG="+MSG+"&PNU="+PNU);
	}
	
	
	//보상토지 팝업
	public ModelAndView RewardLandPop(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		List blist = null;

		try{
			if(userId != null)
			{
				String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				request.setAttribute("MSG", MSG);
				
				request.setAttribute("COMPEID",COMPEID);
				request.setAttribute("PNU",PNU);
				
				blist = objRewardPopupService.getPopLandRewardList(COMPEID,PNU);
				
				System.out.println("보상토지 팝업 blist.size:"+blist.size());
				
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
				request.setAttribute("jimokList", commonCode.executeCommonCode("2", "지목코드", ""));
				
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("/reward/reward_land_pop","blist",blist);
	}
	

	public ModelAndView RewardOwnPopList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		RewardBean searchBean = new RewardBean();
		RewardOwnBean ownBean = new RewardOwnBean();
		
		List blist = null;
		int listCount = 0;
		
		try{
			if(userId != null)
			{
				System.out.println("토지소유현황 조회");
				
				String SEARCH_VALUE = ServletRequestUtils.getStringParameter(request, "SEARCH_VALUE", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String ownGubun = ServletRequestUtils.getStringParameter(request, "ownGubun", "");
				
				searchBean.setSEARCH_VALUE(SEARCH_VALUE);
				searchBean.setSEARCH_VALUE(SEARCH_VALUE.equals("")?"%":"%"+SEARCH_VALUE+"%");
				
				System.out.println(SEARCH_VALUE);
				System.out.println(currentPage);
				System.out.println(ownGubun);
				
				blist = objRewardPopupService.getRewardOwnPopList(searchBean,currentPage,Globals.DEFAULT_COUNTPER_PAGE, ownGubun);
				
				System.out.println("토지소유현황 팝업 :size::"+blist.size());			
				
				ownBean = (RewardOwnBean)blist.get(0);
				listCount	=	Integer.parseInt(ownBean.getCNT());

				System.out.println("토지소유현황 팝업 :listCount::"+listCount);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&SEARCH_VALUE="+SEARCH_VALUE+"&ownGubun="+ownGubun, "/rams/reward/reward_own_pop.do", listCount);
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", currentPage);
				request.setAttribute("ownGubun", ownGubun);
				request.setAttribute("SEARCH_VALUE", SEARCH_VALUE);
			}
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return new ModelAndView("/reward/reward_own_pop","blist",blist);
	}
}