package main.java.cityland.web;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.cityland.model.CitylandBean;
import main.java.cityland.service.ICitylandService;
import main.java.common.model.RefDongBean;
import main.java.common.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.StringUtil;
import main.java.reward.service.IRewardService;
import main.java.suit.model.SuitBean;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class CitylandControl extends MultiActionController {
	
	private	CommonCodeService	commonCode		= null;
	private ICitylandService objCitylandService = null;

	public void setCitylandService(ICitylandService newObjCitylandService) {
		this.objCitylandService = newObjCitylandService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	
	
	// 시유지 대부사용 허가 리스트 출력
	public ModelAndView PermissList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		int listCount = 0;
		CitylandBean searchBean = null;
		

		try{
			if(userId != null)
			{
				System.out.println("시유지 대부사용 허가 리스트 조회");
				
				String PP_CLASS = ServletRequestUtils.getStringParameter(request, "PP_CLASS", "");
				String USE = ServletRequestUtils.getStringParameter(request, "USE", "");
				String ADMI = ServletRequestUtils.getStringParameter(request, "ADMI", "");
				String ACCOUNT = ServletRequestUtils.getStringParameter(request, "ACCOUNT", "");
				String MAIN_MANA = ServletRequestUtils.getStringParameter(request, "MAIN_MANA", "");
				String GU_CD = ServletRequestUtils.getStringParameter(request, "GU_CD", "");
				String DONG_CD = ServletRequestUtils.getStringParameter(request, "DONG_CD", "");
				String BUNJI = ServletRequestUtils.getStringParameter(request, "BUNJI", "");
				
				String START_P_AMT = ServletRequestUtils.getStringParameter(request, "START_P_AMT", "");
				String END_P_AMT = ServletRequestUtils.getStringParameter(request, "END_P_AMT", "");
				
				String PER_START_DAY = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "PER_START_DAY", ""));
				String PER_END_DAY = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "PER_END_DAY", ""));
				String START_P_AREA = ServletRequestUtils.getStringParameter(request, "START_P_AREA", "");
				String END_P_AREA = ServletRequestUtils.getStringParameter(request, "END_P_AREA", "");
				
				searchBean = new CitylandBean();
				
				searchBean.setPP_CLASS(PP_CLASS.equals("")?"%":PP_CLASS);
				searchBean.setUSE(USE.equals("")?"%":USE);
				searchBean.setADMI(ADMI.equals("")?"%":ADMI);
				searchBean.setACCOUNT(ACCOUNT.equals("")?"%":ACCOUNT);
				searchBean.setMAIN_MANA(MAIN_MANA.equals("")?"%":MAIN_MANA);
				searchBean.setGU_CD(GU_CD.equals("")?"%":GU_CD);
				searchBean.setDONG_CD(DONG_CD.equals("")?"%":DONG_CD);
				searchBean.setBUNJI(BUNJI.equals("")?"%":"%"+BUNJI+"%");
				searchBean.setSTART_P_AMT(START_P_AMT.equals("")?"0":START_P_AMT);
				searchBean.setEND_P_AMT(END_P_AMT.equals("")?"9999999999999":END_P_AMT);
				searchBean.setPER_START_DAY(PER_START_DAY.equals("")?"00000000":PER_START_DAY);
				searchBean.setPER_END_DAY(PER_END_DAY.equals("")?"99999999":PER_END_DAY);
				searchBean.setSTART_P_AREA(START_P_AREA.equals("")?"0":START_P_AREA);
				searchBean.setEND_P_AREA(END_P_AREA.equals("")?"9999999999999":END_P_AREA);
				
				
				if(ServletRequestUtils.getStringParameter(request, "SEARCH", "N").equals("Y")){
					blist = objCitylandService.getPermissList(searchBean);
					listCount = blist.size();
				}
				System.out.println("::시유지 대부사용 허가 리스트!!!::"+String.valueOf(listCount));
				request.setAttribute("listCount", String.valueOf(listCount));
				
				//시유지조회공통코드
				request.setAttribute("PermissCodeList", objCitylandService.getPermissCode());
				request.setAttribute("UseCodeList", objCitylandService.getUseCode());
				request.setAttribute("AdmiCodeList", objCitylandService.getAdmiCode());
				request.setAttribute("AccountCodeList", objCitylandService.getAccountCode());
				request.setAttribute("MainManaCodeList", objCitylandService.getMainManaCode());
				
				request.setAttribute("PP_CLASS", PP_CLASS);
				request.setAttribute("USE", USE);
				request.setAttribute("ADMI", ADMI);
				request.setAttribute("ACCOUNT", ACCOUNT);
				request.setAttribute("MAIN_MANA", MAIN_MANA);
				
				//주소조회코드
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
				request.setAttribute("dongList", GU_CD.equals("")?null:commonCode.getBJDongList(GU_CD, ""));
				request.setAttribute("GU_CD", GU_CD);
				request.setAttribute("DONG_CD", DONG_CD);
				request.setAttribute("BUNJI", BUNJI);
				
				request.setAttribute("START_P_AMT", START_P_AMT);
				request.setAttribute("END_P_AMT", END_P_AMT);
				
				request.setAttribute("PER_START_DAY", PER_START_DAY);
				request.setAttribute("PER_END_DAY", PER_END_DAY);
				request.setAttribute("START_P_AREA", START_P_AREA);
				request.setAttribute("END_P_AREA", END_P_AREA);
				
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/cityland/permiss_list","blist",blist);
	}
	
	
	//시유지 처분재산 리스트 조회
	public ModelAndView DisList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		int listCount = 0;
		CitylandBean searchBean = null;
		

		try{
			if(userId != null)
			{
				System.out.println("시유지 처분재산 리스트 조회");
				String PP_CLASS = ServletRequestUtils.getStringParameter(request, "PP_CLASS", "");
				String GU_CD = ServletRequestUtils.getStringParameter(request, "GU_CD", "");
				String DONG_CD = ServletRequestUtils.getStringParameter(request, "DONG_CD", "");
				String BUNJI = ServletRequestUtils.getStringParameter(request, "BUNJI", "");
				
				String START_DIS_JUD_AMT = ServletRequestUtils.getStringParameter(request, "START_DIS_JUD_AMT", "");
				String END_DIS_JUD_AMT = ServletRequestUtils.getStringParameter(request, "END_DIS_JUD_AMT", "");
				
				searchBean = new CitylandBean();
				
				searchBean.setPP_CLASS(PP_CLASS.equals("")?"%":PP_CLASS);
				searchBean.setGU_CD(GU_CD.equals("")?"%":GU_CD);
				searchBean.setDONG_CD(DONG_CD.equals("")?"%":DONG_CD);
				searchBean.setBUNJI(BUNJI.equals("")?"%":"%"+BUNJI+"%");
				searchBean.setSTART_DIS_JUD_AMT(START_DIS_JUD_AMT.equals("")?"0":START_DIS_JUD_AMT);
				searchBean.setEND_DIS_JUD_AMT(END_DIS_JUD_AMT.equals("")?"9999999999999":END_DIS_JUD_AMT);
				
				
				if(ServletRequestUtils.getStringParameter(request, "SEARCH", "N").equals("Y")){
					blist = objCitylandService.getDisList(searchBean);
					listCount = blist.size();
				}
				System.out.println("::시유지 처분재산 리스트::"+String.valueOf(listCount));
				request.setAttribute("listCount", String.valueOf(listCount));
				
				//시유지조회공통코드
				request.setAttribute("PermissCodeList", objCitylandService.getPermissCode());
				
				request.setAttribute("PP_CLASS", PP_CLASS);
				
				//주소조회코드
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
				request.setAttribute("dongList", GU_CD.equals("")?null:commonCode.getBJDongList(GU_CD, ""));
				request.setAttribute("GU_CD", GU_CD);
				request.setAttribute("DONG_CD", DONG_CD);
				request.setAttribute("BUNJI", BUNJI);
				request.setAttribute("START_DIS_JUD_AMT", START_DIS_JUD_AMT);
				request.setAttribute("END_DIS_JUD_AMT", END_DIS_JUD_AMT);
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/cityland/dis_list","blist",blist);
	}
	
	// 시유지 무단점사용 허가 리스트 출력
	public ModelAndView MoodanList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		int listCount = 0;
		CitylandBean searchBean = null;
		

		try{
			if(userId != null)
			{
				System.out.println("시유지 무단점사용 허가 리스트 조회");
				
				String PP_CLASS = ServletRequestUtils.getStringParameter(request, "PP_CLASS", "");
				String USE = ServletRequestUtils.getStringParameter(request, "USE", "");
				String ADMI = ServletRequestUtils.getStringParameter(request, "ADMI", "");
				String ACCOUNT = ServletRequestUtils.getStringParameter(request, "ACCOUNT", "");
				String MAIN_MANA = ServletRequestUtils.getStringParameter(request, "MAIN_MANA", "");
				String GU_CD = ServletRequestUtils.getStringParameter(request, "GU_CD", "");
				String DONG_CD = ServletRequestUtils.getStringParameter(request, "DONG_CD", "");
				String BUNJI = ServletRequestUtils.getStringParameter(request, "BUNJI", "");
				
				String START_P_AMT = ServletRequestUtils.getStringParameter(request, "START_P_AMT", "");
				String END_P_AMT = ServletRequestUtils.getStringParameter(request, "END_P_AMT", "");
				
				String WRONG_START_DAY = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "WRONG_START_DAY", ""));
				String WRONG_END_DAY = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "WRONG_END_DAY", ""));
				String START_WRONG_AREA = ServletRequestUtils.getStringParameter(request, "START_WRONG_AREA", "");
				String END_WRONG_AREA = ServletRequestUtils.getStringParameter(request, "END_WRONG_AREA", "");
				
				searchBean = new CitylandBean();
				
				searchBean.setPP_CLASS(PP_CLASS.equals("")?"%":PP_CLASS);
				searchBean.setUSE(USE.equals("")?"%":USE);
				searchBean.setADMI(ADMI.equals("")?"%":ADMI);
				searchBean.setACCOUNT(ACCOUNT.equals("")?"%":ACCOUNT);
				searchBean.setMAIN_MANA(MAIN_MANA.equals("")?"%":MAIN_MANA);
				searchBean.setGU_CD(GU_CD.equals("")?"%":GU_CD);
				searchBean.setDONG_CD(DONG_CD.equals("")?"%":DONG_CD);
				searchBean.setBUNJI(BUNJI.equals("")?"%":"%"+BUNJI+"%");
				searchBean.setSTART_P_AMT(START_P_AMT.equals("")?"0":START_P_AMT);
				searchBean.setEND_P_AMT(END_P_AMT.equals("")?"9999999999999":END_P_AMT);
				searchBean.setWRONG_START_DAY(WRONG_START_DAY.equals("")?"00000000":WRONG_START_DAY);
				searchBean.setWRONG_END_DAY(WRONG_END_DAY.equals("")?"99999999":WRONG_END_DAY);
				searchBean.setSTART_WRONG_AREA(START_WRONG_AREA.equals("")?"0":START_WRONG_AREA);
				searchBean.setEND_WRONG_AREA(END_WRONG_AREA.equals("")?"9999999999999":END_WRONG_AREA);
				
				
				if(ServletRequestUtils.getStringParameter(request, "SEARCH", "N").equals("Y")){
					blist = objCitylandService.getMoodanList(searchBean);
					listCount = blist.size();
				}
				System.out.println("::시유지 무단점사용 허가 리스트!!!::"+String.valueOf(listCount));
				request.setAttribute("listCount", String.valueOf(listCount));
				
				//시유지조회공통코드
				request.setAttribute("PermissCodeList", objCitylandService.getPermissCode());
				request.setAttribute("UseCodeList", objCitylandService.getUseCode());
				request.setAttribute("AdmiCodeList", objCitylandService.getAdmiCode());
				request.setAttribute("AccountCodeList", objCitylandService.getAccountCode());
				request.setAttribute("MainManaCodeList", objCitylandService.getMainManaCode());
				
				request.setAttribute("PP_CLASS", PP_CLASS);
				request.setAttribute("USE", USE);
				request.setAttribute("ADMI", ADMI);
				request.setAttribute("ACCOUNT", ACCOUNT);
				request.setAttribute("MAIN_MANA", MAIN_MANA);
				
				//주소조회코드
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
				request.setAttribute("dongList", GU_CD.equals("")?null:commonCode.getBJDongList(GU_CD, ""));
				request.setAttribute("GU_CD", GU_CD);
				request.setAttribute("DONG_CD", DONG_CD);
				request.setAttribute("BUNJI", BUNJI);
				
				request.setAttribute("START_P_AMT", START_P_AMT);
				request.setAttribute("END_P_AMT", END_P_AMT);
				
				request.setAttribute("WRONG_START_DAY", WRONG_START_DAY);
				request.setAttribute("WRONG_END_DAY", WRONG_END_DAY);
				request.setAttribute("START_WRONG_AREA", START_WRONG_AREA);
				request.setAttribute("END_WRONG_AREA", END_WRONG_AREA);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/cityland/moodan_list","blist",blist);
	}
	
	
	//시유지 재산정보 리스트 조회
	public ModelAndView BaseList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		int listCount = 0;
		CitylandBean searchBean = null;
		

		try{
			if(userId != null)
			{
				System.out.println("시유지 재산정보 리스트 조회");
				String PP_CLASS = ServletRequestUtils.getStringParameter(request, "PP_CLASS", "");
				String GU_CD = ServletRequestUtils.getStringParameter(request, "GU_CD", "");
				String DONG_CD = ServletRequestUtils.getStringParameter(request, "DONG_CD", "");
				String BUNJI = ServletRequestUtils.getStringParameter(request, "BUNJI", "");
				String START_P_AMT = ServletRequestUtils.getStringParameter(request, "START_P_AMT", "");
				String END_P_AMT = ServletRequestUtils.getStringParameter(request, "END_P_AMT", "");
				
				searchBean = new CitylandBean();
				
				searchBean.setPP_CLASS(PP_CLASS.equals("")?"%":PP_CLASS);
				searchBean.setGU_CD(GU_CD.equals("")?"%":GU_CD);
				searchBean.setDONG_CD(DONG_CD.equals("")?"%":DONG_CD);
				searchBean.setBUNJI(BUNJI.equals("")?"%":"%"+BUNJI+"%");
				searchBean.setSTART_P_AMT(START_P_AMT.equals("")?"0":START_P_AMT);
				searchBean.setEND_P_AMT(END_P_AMT.equals("")?"9999999999999":END_P_AMT);
				
				
				if(ServletRequestUtils.getStringParameter(request, "SEARCH", "N").equals("Y")){
					blist = objCitylandService.getBaseList(searchBean);
					listCount = blist.size();
				}
				System.out.println("::시유지 재산정보 리스트::"+String.valueOf(listCount));
				request.setAttribute("listCount", String.valueOf(listCount));
				
				//시유지조회공통코드
				request.setAttribute("PermissCodeList", objCitylandService.getPermissCode());
				request.setAttribute("PP_CLASS", PP_CLASS);
				
				//주소조회코드
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
				request.setAttribute("dongList", GU_CD.equals("")?null:commonCode.getBJDongList(GU_CD, ""));
				request.setAttribute("GU_CD", GU_CD);
				request.setAttribute("DONG_CD", DONG_CD);
				request.setAttribute("BUNJI", BUNJI);
				request.setAttribute("START_P_AMT", START_P_AMT);
				request.setAttribute("END_P_AMT", END_P_AMT);
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/cityland/base_list","blist",blist);
	}
	
	//시유지 재산이력 리스트 조회
	public ModelAndView HistoryList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		int listCount = 0;
		CitylandBean searchBean = null;
		

		try{
			if(userId != null)
			{
				System.out.println("시유지 재산이력 리스트 조회");
				String PP_CLASS = ServletRequestUtils.getStringParameter(request, "PP_CLASS", "");
				String GU_CD = ServletRequestUtils.getStringParameter(request, "GU_CD", "");
				String DONG_CD = ServletRequestUtils.getStringParameter(request, "DONG_CD", "");
				String BUNJI = ServletRequestUtils.getStringParameter(request, "BUNJI", "");
				String START_P_AMT = ServletRequestUtils.getStringParameter(request, "START_P_AMT", "");
				String END_P_AMT = ServletRequestUtils.getStringParameter(request, "END_P_AMT", "");
				
				searchBean = new CitylandBean();
				
				searchBean.setPP_CLASS(PP_CLASS.equals("")?"%":PP_CLASS);
				searchBean.setGU_CD(GU_CD.equals("")?"%":GU_CD);
				searchBean.setDONG_CD(DONG_CD.equals("")?"%":DONG_CD);
				searchBean.setBUNJI(BUNJI.equals("")?"%":"%"+BUNJI+"%");
				searchBean.setSTART_P_AMT(START_P_AMT.equals("")?"0":START_P_AMT);
				searchBean.setEND_P_AMT(END_P_AMT.equals("")?"9999999999999":END_P_AMT);
				
				
				if(ServletRequestUtils.getStringParameter(request, "SEARCH", "N").equals("Y")){
					blist = objCitylandService.getHistoryList(searchBean);
					listCount = blist.size();
				}
				System.out.println("::시유지 재산이력  리스트::"+String.valueOf(listCount));
				request.setAttribute("listCount", String.valueOf(listCount));
				
				//시유지조회공통코드
				request.setAttribute("PermissCodeList", objCitylandService.getPermissCode());
				request.setAttribute("PP_CLASS", PP_CLASS);
				
				//주소조회코드
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
				request.setAttribute("dongList", GU_CD.equals("")?null:commonCode.getBJDongList(GU_CD, ""));
				request.setAttribute("GU_CD", GU_CD);
				request.setAttribute("DONG_CD", DONG_CD);
				request.setAttribute("BUNJI", BUNJI);
				request.setAttribute("START_P_AMT", START_P_AMT);
				request.setAttribute("END_P_AMT", END_P_AMT);
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/cityland/history_list","blist",blist);
	}
	
	
	// 재산이력 상세조회 AJAX
	public ModelAndView		GetHistoryList(HttpServletRequest request,HttpServletResponse response, String SHOP_IMG_NAME) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 		PP_SN 	= ServletRequestUtils.getStringParameter(request, "PP_SN");
		
		List		list		= null;
		CitylandBean Bean = null;
		System.out.println(PP_SN);
		if(userId != null)
		{
			String txt = "";
			
				list = objCitylandService.getHistoryDetailList(PP_SN);
			
				for(int	i = 0	;	i < list.size()	;	i++)
				{
					Bean = (CitylandBean)list.get(i);

					txt	+= Bean.getHISTORY_SN()==null?" ":Bean.getHISTORY_SN()+"^";
					txt	+= Bean.getAPPLY_DAY()==null?" ":Bean.getAPPLY_DAY()+"^";
					txt	+= Bean.getTTL_YEAR()==null?" ":Bean.getTTL_YEAR()+"^";
					txt	+= Bean.getHISTORY_N()==null?" ":Bean.getHISTORY_N()+"^";
					txt	+= Bean.getBEFOR_VALUE()==null?" ":Bean.getBEFOR_VALUE()+"^";
					txt	+= Bean.getAFTER_VALUE()==null?" ":Bean.getAFTER_VALUE()+"^";
					txt	+= Bean.getHISTORY_NOTE()==null?" ":Bean.getHISTORY_NOTE();
					if(i != list.size()-1)
						txt	+= "@";
				}
			
			System.out.println("GetHistoryList :::::::::"+txt);
	        response.setContentType("text/html;charset=EUC-KR");
	        response.setHeader("Cache-Control", "no-cache");
	        response.getWriter().write(txt);
		}
		return null;
	}

}
