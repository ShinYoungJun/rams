package main.java.reward.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import main.java.common.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.StringUtil;
import main.java.reward.model.CompeViewBean;
import main.java.reward.model.RewardBean;
import main.java.reward.model.RewardStatusBean;
import main.java.reward.model.RewardStatusViewBean;
import main.java.reward.service.IRewardStatusService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class RewardStatusControl extends MultiActionController {

	private IRewardStatusService objRewardStatusService = null;
	private	CommonCodeService	commonCode		= null;		

	public void setRewardStatusService(IRewardStatusService newObjRewardStatusService) {
		this.objRewardStatusService = newObjRewardStatusService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	// 보상현황리스트 출력
	public ModelAndView RewardStatusList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		List	guList	=	null;
		List	dongList	=	null;
		List	RewardCodeList	=	null;
		
		RewardStatusBean searchBean = new RewardStatusBean();
		

		try{
			if(userId != null)
			{
				System.out.println("보상현황리스트 조회");
				
				String FROMDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "FROMDATE", ""));
				String TODATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "TODATE", ""));
				String SEARCH_VALUE = ServletRequestUtils.getStringParameter(request, "SEARCH_VALUE", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				
				
				searchBean.setFROMDATE(FROMDATE.equals("")?"00000000":FROMDATE);
				searchBean.setTODATE(TODATE.equals("")?"99999999":TODATE);
				searchBean.setSEARCH_VALUE(SEARCH_VALUE.equals("")?"%":"%"+SEARCH_VALUE+"%");
				
				int listCount = objRewardStatusService.getRewardStatusCount(searchBean);
				
				
				blist = objRewardStatusService.getRewardStatusList(searchBean,currentPage,Globals.DEFAULT_COUNTPER_PAGE);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&SEARCH_VALUE="+SEARCH_VALUE+"&FROMDATE="+FROMDATE+"&TODATE="+TODATE, "/rams/reward/reward_status_list.do", listCount);
				
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", currentPage);
				
				request.setAttribute("FROMDATE", FROMDATE);
				request.setAttribute("TODATE", TODATE);
				request.setAttribute("SEARCH_VALUE", SEARCH_VALUE);
				System.out.println("보상현황갯수:::"+blist.size());
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_status_list","list", blist);
	}
	
	
	// 보상현황 상세보기
	public ModelAndView RewardStatusView(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		RewardStatusViewBean viewBean = new RewardStatusViewBean();
		

		try{
			if(userId != null)
			{
				System.out.println("보상현황 상세보기");
				String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				String JUMINNUM = ServletRequestUtils.getStringParameter(request, "JUMINNUM", "");
				
				viewBean = (RewardStatusViewBean)objRewardStatusService.getRewardStatusView(COMPEID, PNU,JUMINNUM).get(0);
				
				if(viewBean.getISACQUIRE() == null || viewBean.getISACQUIRE().equals("N")){
					request.setAttribute("ISACQUIRE_Y", "");
					request.setAttribute("ISACQUIRE_N", "checked");
				}else{
					request.setAttribute("ISACQUIRE_Y", "checked");
					request.setAttribute("ISACQUIRE_N", "");
				}

				request.setAttribute("COMPEID", COMPEID);
				request.setAttribute("PNU", PNU);
				request.setAttribute("JUMINNUM", JUMINNUM);
				request.setAttribute("rewardStatusView", viewBean);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_status_view");
	}
	
	
	//보상현황 수정
	public ModelAndView RewardStatusModify(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		
		RewardStatusViewBean searchBean = new RewardStatusViewBean();
		
		RewardStatusViewBean viewBean = new RewardStatusViewBean();
		

		try{
			if(userId != null)
			{
				System.out.println("보상현황 수정");
				
				bind(request,searchBean);
				String ASSIGNDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "ASSIGNDATE", ""));
				searchBean.setASSIGNDATE(ASSIGNDATE);
				
				//보상현황 수정반영

				String MSG = "";
				if(objRewardStatusService.setRewardStatusUpdate(searchBean)){
					MSG = "저장에 성공하였습니다.";
				}else{
					MSG = "시스템 오류로 저장이 취소되었습니다.";
				}
				
				request.setAttribute("MSG", MSG);
				
				//뷰화면 다시보기
				
				viewBean = (RewardStatusViewBean)objRewardStatusService.getRewardStatusView(searchBean.getCOMPEID(), searchBean.getPNU(),searchBean.getJUMINNUM()).get(0);
				
				if(viewBean.getISACQUIRE() == null || viewBean.getISACQUIRE().equals("N")){
					request.setAttribute("ISACQUIRE_Y", "");
					request.setAttribute("ISACQUIRE_N", "checked");
				}else{
					request.setAttribute("ISACQUIRE_Y", "checked");
					request.setAttribute("ISACQUIRE_N", "");
				}

				request.setAttribute("COMPEID", searchBean.getCOMPEID());
				request.setAttribute("PNU", searchBean.getPNU());
				request.setAttribute("JUMINNUM", searchBean.getJUMINNUM());
				request.setAttribute("rewardStatusView", viewBean);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_status_view");
	}
	
	// 보상현황리스트 엑셀 출력
	public ModelAndView RewardStatusListExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		List	guList	=	null;
		List	dongList	=	null;
		List	RewardCodeList	=	null;
		
		RewardStatusBean searchBean = new RewardStatusBean();
		

		try{
			if(userId != null)
			{
				String FROMDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "FROMDATE", ""));
				String TODATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "TODATE", ""));
				String SEARCH_VALUE = ServletRequestUtils.getStringParameter(request, "SEARCH_VALUE", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				System.out.println("보상현황리스트 excel 조회:"+currentPage);	
				
				searchBean.setFROMDATE(FROMDATE.equals("")?"00000000":FROMDATE);
				searchBean.setTODATE(TODATE.equals("")?"99999999":TODATE);
				searchBean.setSEARCH_VALUE(SEARCH_VALUE.equals("")?"%":"%"+SEARCH_VALUE+"%");
				
				int listCount = objRewardStatusService.getRewardStatusCount(searchBean);
				
				
				blist = objRewardStatusService.getRewardStatusList(searchBean,currentPage,Globals.DEFAULT_COUNTPER_PAGE);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&SEARCH_VALUE="+SEARCH_VALUE+"&FROMDATE="+FROMDATE+"&TODATE="+TODATE, "/rams/reward/reward_status_list.do", listCount);
				
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", currentPage);
				
				request.setAttribute("FROMDATE", FROMDATE);
				request.setAttribute("TODATE", TODATE);
				request.setAttribute("SEARCH_VALUE", SEARCH_VALUE);
				System.out.println("보상현황 excel 갯수:::"+blist.size());
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_status_excel","list", blist);
	}
}