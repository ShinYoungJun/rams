package main.java.suit.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import main.java.common.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.StringUtil;
import main.java.suit.model.SuitPriceBean;
import main.java.suit.service.ISuitPriceService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class SuitPriceControl extends MultiActionController {

	private ISuitPriceService objSuitPriceService = null;
	private	CommonCodeService	commonCode		= null;		

	public void setSuitPriceService(ISuitPriceService newObjSuitPriceService) {
		this.objSuitPriceService = newObjSuitPriceService;
	}
	    
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	// 소가 리스트 출력
	public ModelAndView SuitPriceList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		
		SuitPriceBean searchBean = new SuitPriceBean();
		

		try{
			if(userId != null)
			{
				System.out.println("소가 리스트 조회");
				
				String SEARCH_TYPE = ServletRequestUtils.getStringParameter(request, "SEARCH_TYPE", "1");
				String SEARCH_VALUE = ServletRequestUtils.getStringParameter(request, "SEARCH_VALUE", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				
				
				if(SEARCH_TYPE.equals("1")){
					searchBean.setAFFAIRNUM(SEARCH_VALUE.equals("")?"%":"%"+SEARCH_VALUE+"%");
					searchBean.setNAME("%");
				}else if(SEARCH_TYPE.equals("2")){
					searchBean.setAFFAIRNUM("%");
					searchBean.setNAME(SEARCH_VALUE.equals("")?"%":"%"+SEARCH_VALUE+"%");
				}
				
				blist = objSuitPriceService.getSuitPriceList(searchBean,currentPage,Globals.DEFAULT_COUNTPER_PAGE);
				int listCount = objSuitPriceService.getSuitPriceCount(searchBean);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&SEARCH_TYPE="+SEARCH_TYPE+"&SEARCH_VALUE="+SEARCH_VALUE, "/rams/suit/suit_price_list.do", listCount);
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("currentPage", currentPage);
				request.setAttribute("SEARCH_TYPE", SEARCH_TYPE);
				request.setAttribute("SEARCH_VALUE", SEARCH_VALUE);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_price_list","blist", blist);
	}
	
	// 소가 상세 보기
	public ModelAndView SuitPriceView(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		SuitPriceBean view = new SuitPriceBean();
		List viewList = null;

		try{
			if(userId != null)
			{
				System.out.println("소가 상세보기");
				
				
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				
				view = (SuitPriceBean)objSuitPriceService.getSuitPriceView(AFFAIRNUM, PNU).get(0);
				viewList = objSuitPriceService.getSuitPriceViewList(AFFAIRNUM, PNU);
				

				request.setAttribute("AFFAIRNUM", AFFAIRNUM);
				request.setAttribute("PNU", PNU);
				request.setAttribute("MSG", MSG);			
				request.setAttribute("view", view);
				request.setAttribute("viewList", viewList);
				request.setAttribute("viewListCount", viewList.size());
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_price_view");
	}
	
	
	
	// 소가 상세 보기 수정
	public ModelAndView SuitPriceViewModify(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String AFFAIRNUM = "";
		String PNU = "";
		String MSG = "";
		try{
			if(userId != null)
			{
				System.out.println("소가 상세보기 수정");
				
				
				AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				
				
				String LAWSUITPRICE = StringUtil.removeComma(ServletRequestUtils.getStringParameter(request, "LAWSUITPRICE", ""));
				String UNFAIRPROFIT = StringUtil.removeComma(ServletRequestUtils.getStringParameter(request, "UNFAIRPROFIT", ""));
				
				objSuitPriceService.setSuitPriceViewModify(LAWSUITPRICE, UNFAIRPROFIT, AFFAIRNUM);
				objSuitPriceService.setSuitPriceViewListReCal(UNFAIRPROFIT, AFFAIRNUM, PNU);
				
				MSG = "소가정보가 수정되었습니다.";
				
			}
		}catch(Exception e){
			e.printStackTrace();
			
			MSG = "시스템 오류로 소가정보수정이 취소 되었습니다.";
		}
		
		return new ModelAndView("redirect:/suit/suit_price_view.do?AFFAIRNUM="+AFFAIRNUM+"&PNU="+PNU+"&MSG="+MSG);
	}
	
	
	//SuitPriceViewListSave
	// 소가 상세 정보 리스트 저장
	public ModelAndView SuitPriceViewListSave(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String AFFAIRNUM = "";
		String PNU = "";
		String MSG = "";
		
		SuitPriceBean bean = null;
		
		try{
			if(userId != null)
			{
				System.out.println("소가 상세 정보 리스트 저장");
				
				
				AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				
				String[] LAWSUITSEQ_ARR = request.getParameterValues("LAWSUITSEQ_ARR");
                String[] UNFAIRPROFIT_ARR = request.getParameterValues("UNFAIRPROFIT_ARR");
                String[] STARTDAY_ARR = request.getParameterValues("STARTDAY_ARR");
                String[] ENDDAY_ARR = request.getParameterValues("ENDDAY_ARR");
                String[] RATE_ARR = request.getParameterValues("RATE_ARR");
                String[] DAYCNT_ARR = request.getParameterValues("DAYCNT_ARR");
                String[] SUM_ARR = request.getParameterValues("SUM_ARR");
                String[] STATUS_ARR = request.getParameterValues("STATUS_ARR");
                
                for(int i = 0 ; i < UNFAIRPROFIT_ARR.length ; i++){
                	if(RATE_ARR[i].equals("") || DAYCNT_ARR[i].equals("") || DAYCNT_ARR[i].equals("0")){
                		
                	}else{
                		
                		if(STATUS_ARR[i].equals("add")){
                			//추가
                			bean = new SuitPriceBean();
                			bean.setAFFAIRNUM(AFFAIRNUM);
                			bean.setPNU(PNU);
                			bean.setUNFAIRPROFIT(StringUtil.removeComma(UNFAIRPROFIT_ARR[i]));
                			bean.setSTARTDAY(StringUtil.removeDash(STARTDAY_ARR[i]));
                			bean.setENDDAY(StringUtil.removeDash(ENDDAY_ARR[i]));
                			bean.setRATE(RATE_ARR[i]);
                			bean.setDAYCNT(DAYCNT_ARR[i]);
                			bean.setSUM(StringUtil.removeComma(SUM_ARR[i]));
                			
                			objSuitPriceService.setSuitPriceViewListAdd(bean);
                			
                		}else{
                			//수정
                			bean = new SuitPriceBean();
                			bean.setAFFAIRNUM(AFFAIRNUM);
                			bean.setPNU(PNU);
                			bean.setLAWSUITSEQ(LAWSUITSEQ_ARR[i]);
                			bean.setUNFAIRPROFIT(StringUtil.removeComma(UNFAIRPROFIT_ARR[i]));
                			bean.setSTARTDAY(StringUtil.removeDash(STARTDAY_ARR[i]));
                			bean.setENDDAY(StringUtil.removeDash(ENDDAY_ARR[i]));
                			bean.setRATE(RATE_ARR[i]);
                			bean.setDAYCNT(DAYCNT_ARR[i]);
                			bean.setSUM(StringUtil.removeComma(SUM_ARR[i]));
                			
                			objSuitPriceService.setSuitPriceViewListModify(bean);
                		}
                	}
                }
				MSG = "관련이윤정보가 저장되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "시스템 오류로 관련이윤정보 저장이 취소 되었습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_price_view.do?AFFAIRNUM="+AFFAIRNUM+"&PNU="+PNU+"&MSG="+MSG);
	}
	
	// 소가 상세 정보 리스트 삭제
	public ModelAndView SuitPriceViewListDelete(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String AFFAIRNUM = "";
		String PNU = "";
		String MSG = "";
		String LAWSUITSEQ = "";
		
		SuitPriceBean bean = null;
		
		try{
			if(userId != null)
			{
				System.out.println("소가 상세 정보 리스트 삭제");
				AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
                LAWSUITSEQ = ServletRequestUtils.getStringParameter(request, "LAWSUITSEQ", "");
                
                System.out.println(AFFAIRNUM+"::"+PNU+"::"+LAWSUITSEQ);
                
                objSuitPriceService.setSuitPriceViewListRemove(AFFAIRNUM,PNU,LAWSUITSEQ);
				MSG = "관련이윤정보가  삭제되었습니다.";
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "시스템 오류로 관련이윤정보 삭제가 취소 되었습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_price_view.do?AFFAIRNUM="+AFFAIRNUM+"&PNU="+PNU+"&MSG="+MSG);
		
	}
	
}