package main.java.reward.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.common.service.CommonCodeService;
import main.java.common.util.StringUtil;
import main.java.reward.model.RewardOwnBean;
import main.java.reward.service.IRewardAnalService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class RewardAnalControl extends MultiActionController {

	private IRewardAnalService objRewardAnalService = null;
	private	CommonCodeService	commonCode		= null;		

	public void setRewardAnalService(IRewardAnalService newObjRewardAnalService) {
		this.objRewardAnalService = newObjRewardAnalService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	// 보상통계 출력
	public ModelAndView RewardAnalList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		
		try{
			if(userId != null)
			{
				System.out.println("보상통계 조회");
				String SEARCH_TYPE = ServletRequestUtils.getStringParameter(request, "SEARCH_TYPE", "0");
				String FROMDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "FROMDATE", ""));
				String TODATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "TODATE", ""));
				
				
				if(SEARCH_TYPE.equals("0")){
					blist = objRewardAnalService.getRewardAnalList(FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE,"00000000","99999999");
				}else{
					blist = objRewardAnalService.getRewardAnalList("00000000","99999999",FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE);
				}
				
				request.setAttribute("SEARCH_TYPE", SEARCH_TYPE);
				request.setAttribute("FROMDATE", StringUtil.addDash(FROMDATE));
				request.setAttribute("TODATE", StringUtil.addDash(TODATE));
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_anal","blist", blist);
	}
	
	
	// 보상통계 엑셀
	public ModelAndView RewardAnalListExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		
		try{
			if(userId != null)
			{
				System.out.println("보상통계  엑셀");
				String SEARCH_TYPE = ServletRequestUtils.getStringParameter(request, "SEARCH_TYPE", "0");
				String FROMDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "FROMDATE", ""));
				String TODATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "TODATE", ""));
				
				if(SEARCH_TYPE.equals("0")){
					blist = objRewardAnalService.getRewardAnalList(FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE,"00000000","99999999");
				}else{
					blist = objRewardAnalService.getRewardAnalList("00000000","99999999",FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE);
				}
				
				request.setAttribute("SEARCH_TYPE", SEARCH_TYPE);
				request.setAttribute("FROMDATE", StringUtil.addDash(FROMDATE));
				request.setAttribute("TODATE", StringUtil.addDash(TODATE));
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_anal_excel","blist", blist);
	}
		
	// 토지소유 현황
	public ModelAndView RewardOwnList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		
		try{
			if(userId != null)
			{
				System.out.println("토지소유현황 조회");
				String SEARCH_TYPE = ServletRequestUtils.getStringParameter(request, "SEARCH_TYPE", "0");
				String FROMDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "FROMDATE", ""));
				String TODATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "TODATE", ""));
				
				
				if(SEARCH_TYPE.equals("0")){
					blist = objRewardAnalService.getRewardOwnList(FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE,"00000000","99999999");
				}else{
					blist = objRewardAnalService.getRewardOwnList("00000000","99999999",FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE);
				}
				
				RewardOwnBean bean = new RewardOwnBean();
				
				bean = (RewardOwnBean)blist.get(0);
				
				System.out.println("getJIGA:"+bean.getJIGA());
				
				request.setAttribute("SEARCH_TYPE", SEARCH_TYPE);
				request.setAttribute("FROMDATE", StringUtil.addDash(FROMDATE));
				request.setAttribute("TODATE", StringUtil.addDash(TODATE));

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_own","blist", blist);
	}
}