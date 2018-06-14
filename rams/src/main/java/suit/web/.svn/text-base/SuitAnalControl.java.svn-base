package main.java.suit.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import main.java.common.service.CommonCodeService;
import main.java.suit.model.SuitAnalBean;
import main.java.suit.service.ISuitAnalService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class SuitAnalControl extends MultiActionController {

	private ISuitAnalService objSuitAnalService = null;
	private	CommonCodeService	commonCode		= null;		

	public void setSuitAnalService(ISuitAnalService newObjSuitAnalService) {
		this.objSuitAnalService = newObjSuitAnalService;
	}
	    
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	// 소송통계 출력
	public ModelAndView SuitAnalList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		try{
			if(userId != null)
			{
				System.out.println("소송통계 조회");
				String SEARCH_TYPE = ServletRequestUtils.getStringParameter(request, "SEARCH_TYPE", "");
				String FROMDATE = ServletRequestUtils.getStringParameter(request, "FROMDATE", "");
				String TODATE = ServletRequestUtils.getStringParameter(request, "TODATE", "");
				
				
				if(SEARCH_TYPE.equals("")){
					SEARCH_TYPE = "GU";
					request.setAttribute("SEARCH_TYPE", "자   치   구");
					request.setAttribute("GU", "checked");
					request.setAttribute("LINE", "");
					blist = objSuitAnalService.getSuitAnalGuList(FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE);
				}else if(SEARCH_TYPE.equals("GU")){
					request.setAttribute("SEARCH_TYPE", "자   치   구");
					request.setAttribute("GU", "checked");
					request.setAttribute("LINE", "");
					blist = objSuitAnalService.getSuitAnalGuList(FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE);
				}else if(SEARCH_TYPE.equals("LINE")){
					request.setAttribute("SEARCH_TYPE", "노   선   명");
					request.setAttribute("GU", "");
					request.setAttribute("LINE", "checked");
					blist = objSuitAnalService.getSuitAnalLineList(FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE);
					
					
				}
				
				request.setAttribute("FROMDATE", FROMDATE);
				request.setAttribute("TODATE", TODATE);
				
				

				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_anal","blist", blist);
	}
	
	
	//엑셀출력
	public ModelAndView SuitAnalListExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		try{
			if(userId != null)
			{
				System.out.println("소송통계 엑셀");
				String SEARCH_TYPE = ServletRequestUtils.getStringParameter(request, "SEARCH_TYPE", "");
				String FROMDATE = ServletRequestUtils.getStringParameter(request, "FROMDATE", "");
				String TODATE = ServletRequestUtils.getStringParameter(request, "TODATE", "");
				
				if(SEARCH_TYPE.equals("")){
					request.setAttribute("SEARCH_TYPE", "자   치   구");
					SEARCH_TYPE = "GU";
					blist = objSuitAnalService.getSuitAnalGuList(FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE);
				}else if(SEARCH_TYPE.equals("GU")){
					request.setAttribute("SEARCH_TYPE", "자   치   구");
					blist = objSuitAnalService.getSuitAnalGuList(FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE);
				}else if(SEARCH_TYPE.equals("LINE")){
					request.setAttribute("SEARCH_TYPE", "노   선   명");
					blist = objSuitAnalService.getSuitAnalLineList(FROMDATE.equals("")?"00000000":FROMDATE, TODATE.equals("")?"99999999":TODATE);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_anal_excel","blist", blist);
	}

	
}