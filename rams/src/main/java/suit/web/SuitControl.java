package main.java.suit.web;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import main.java.admin.model.UserBean;
import main.java.board.model.BoardBean;
import main.java.common.model.RefDongBean;
import main.java.common.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.StringUtil;
import main.java.suit.model.SiGuBean;
import main.java.suit.model.SuitBean;
import main.java.suit.model.SuitLandBean;
import main.java.suit.model.SuitRegBean;
import main.java.suit.model.SuitViewBean;
import main.java.suit.service.ISuitService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class SuitControl extends MultiActionController {

	private ISuitService objSuitService = null;
	private	CommonCodeService	commonCode		= null;		

	public void setSuitService(ISuitService newObjSuitService) {
		this.objSuitService = newObjSuitService;
	}
	    
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode = commonCode;
	}
	
	
	
	//소송 수정 처리
	public ModelAndView SuitModifyPrc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String		MSG		= "";
		
		SuitBean regBean = new SuitBean();
		bind(request, regBean);

		try{
			if(userId != null)
			{
				regBean.setACCEPTDATE(StringUtil.removeDash(regBean.getACCEPTDATE()));
				regBean.setCLOSEDAY(StringUtil.removeDash(regBean.getCLOSEDAY()));
				
					regBean.setST1_JUMINNUM(regBean.getST1_JUMINNUM_1()+regBean.getST1_JUMINNUM_2());
					regBean.setST2_JUMINNUM(regBean.getST2_JUMINNUM_1()+regBean.getST2_JUMINNUM_2());
					regBean.setLP1_JUMINNUM(regBean.getLP1_JUMINNUM_1()+regBean.getLP1_JUMINNUM_2());
					regBean.setLP2_JUMINNUM(regBean.getLP2_JUMINNUM_1()+regBean.getLP2_JUMINNUM_2());
				
				
				//lawsuit업데이트
				objSuitService.setLawSuitModify(regBean);
				//land_lawsuit 업데이트
				objSuitService.setLandSuitModify(regBean);
				//피고원고정보 존재유무 판단
				//있으면 업데이트 없으면 insert
				objSuitService.setSuitorModify(regBean);
				
				//대리피고원고정보 존재유무 판단
				//있으면 업데이트 없으면 insert
				objSuitService.setLawSuitProxyModify(regBean);
		
				
				MSG = "소송정보가 수정되었습니다.";
				
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "소송정보 수정에실패하였습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_view.do?AFFAIRNUM="+regBean.getAFFAIRNUM()+"&PNU="+regBean.getPNU()+"&MSG="+MSG);
	}
	
	//소송 수정
	public ModelAndView SuitModify(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		SuitBean bean = new SuitBean();

		try{
			if(userId != null)
			{
				System.out.println("소송 수정화면");
				
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				
				bean = (SuitBean)objSuitService.GetLawSuitModify(AFFAIRNUM,PNU).get(0);
				
				
				if(bean.getST1_JUMINNUM() != null && bean.getST1_JUMINNUM().length() == 13){
					bean.setST1_JUMINNUM_1(bean.getST1_JUMINNUM().substring(0, 6));
					bean.setST1_JUMINNUM_2(bean.getST1_JUMINNUM().substring(6,13));
				}
				
				if(bean.getST2_JUMINNUM() != null && bean.getST2_JUMINNUM().length() == 13){
					bean.setST2_JUMINNUM_1(bean.getST2_JUMINNUM().substring(0, 6));
					bean.setST2_JUMINNUM_2(bean.getST2_JUMINNUM().substring(6,13));
				}
				
				if(bean.getLP1_JUMINNUM() != null && bean.getLP1_JUMINNUM().length() == 13){
					bean.setLP1_JUMINNUM_1(bean.getLP1_JUMINNUM().substring(0, 6));
					bean.setLP1_JUMINNUM_2(bean.getLP1_JUMINNUM().substring(6,13));
				}
				
				if(bean.getLP2_JUMINNUM() != null && bean.getLP2_JUMINNUM().length() == 13){
					bean.setLP2_JUMINNUM_1(bean.getLP2_JUMINNUM().substring(0, 6));
					bean.setLP2_JUMINNUM_2(bean.getLP2_JUMINNUM().substring(6,13));
				}
				
				if(bean.getOW_JUMINNUM() != null && bean.getOW_JUMINNUM().length() == 13){
					bean.setOW_JUMINNUM_1(bean.getOW_JUMINNUM().substring(0, 6));
					bean.setOW_JUMINNUM_2(bean.getOW_JUMINNUM().substring(6,13));
				}
				
				request.setAttribute("AFFAIRNUM", AFFAIRNUM);
				request.setAttribute("PNU", PNU);
				
				request.setAttribute("suitGubunList", commonCode.executeCommonCode("14", "소송구분", ""));
				request.setAttribute("jimokList", commonCode.executeCommonCode("2", "지목코드", ""));
				
				
				
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_modify","view",bean);
	}
	
		
	//상급심 등록 저장
	public ModelAndView SuitAfterRegPrc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String		MSG		= "";
		
				

		try{
			if(userId != null)
			{
				SuitRegBean regBean = new SuitRegBean();
				bind(request, regBean);
				
				regBean.setAFFAIRNUM(regBean.getAFFAIRNUM_1()+regBean.getAFFAIRNUM_2()+regBean.getAFFAIRNUM_3());
				regBean.setACCEPTDATE(StringUtil.removeDash(regBean.getACCEPTDATE()));
				regBean.setCLOSEDAY(StringUtil.removeDash(regBean.getCLOSEDAY()));
				regBean.setUSER_ID(userId);
				
				if(objSuitService.getAffairNumCount(regBean.getAFFAIRNUM()) == 0){
					objSuitService.setLawSuitCopy(regBean);
					objSuitService.setLawSuitRelationCopy(regBean);
					
					MSG = "소송정보 등록이 성공하였습니다.";
					return new ModelAndView("redirect:/suit/suit_view.do?AFFAIRNUM="+regBean.getAFFAIRNUM()+"&PNU="+regBean.getPRE_PNU()+"&MSG="+MSG);
				}else{
					MSG = "동일한 사건번호가 존재합니다.";
				}
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "소송정보 등록이 실패하였습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_reg_init.do?MSG="+MSG);
	}
	
	
	//상급심 등록화면
	public ModelAndView SuitAfterReg(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List blist = null;
		SuitViewBean view = new SuitViewBean();

		try{
			if(userId != null)
			{
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				request.setAttribute("PRE_AFFAIRNUM", AFFAIRNUM);
				request.setAttribute("PRE_PNU", PNU);
				
				
				view = (SuitViewBean)objSuitService.getSuitView(AFFAIRNUM, PNU).get(0);
				request.setAttribute("view", view);
				request.setAttribute("fileList", objSuitService.getSuitFileList(AFFAIRNUM));
				request.setAttribute("suitGubunList", commonCode.executeCommonCode("14", "소송구분", ""));
				request.setAttribute("affairNum2List", commonCode.executeCommonCode("10", "소송구분코드", ""));
				
				request.setAttribute("filePath",Globals.FILEUPLOADPATH);
				request.setAttribute("suitPath",Globals.LAWSUITFILEPATH);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_after_reg","blist",blist);
	}
	
	//신규등록 저장
	public ModelAndView SuitRegPrc(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String		MSG		= "";
		
				

		try{
			if(userId != null)
			{
				SuitRegBean regBean = new SuitRegBean();
				bind(request, regBean);
				
				regBean.setAFFAIRNUM(regBean.getAFFAIRNUM_1()+regBean.getAFFAIRNUM_2()+regBean.getAFFAIRNUM_3());
				regBean.setPNU(Globals.DEFAULT_SI_CD+regBean.getGU_CD()+regBean.getDONG_CD()+"1"+StringUtil.replaceCipher(regBean.getBONBUN(),4,"0")+StringUtil.replaceCipher(regBean.getBUBUN(),4,"0"));
				regBean.setACCEPTDATE(StringUtil.removeDash(regBean.getACCEPTDATE()));
				regBean.setCLOSEDAY(StringUtil.removeDash(regBean.getCLOSEDAY()));
				regBean.setUSER_ID(userId);
				
				if(objSuitService.getAffairNumCount(regBean.getAFFAIRNUM()) == 0){
					
				objSuitService.setLawSuitInsert(regBean);
				objSuitService.setLandLawSuitInsert(regBean);
				objSuitService.setSuitorInsert(regBean);
				objSuitService.setLawSuitProxyInsert(regBean);
				objSuitService.setOwnerInsert(regBean);
				
					MSG = "소송정보 등록이 성공하였습니다.";
					return new ModelAndView("redirect:/suit/suit_view.do?AFFAIRNUM="+regBean.getAFFAIRNUM()+"&PNU="+regBean.getPNU()+"&MSG="+MSG);
					
				}else{
					MSG = "동일한 사건번호가 존재합니다.";
				}
			}
		}catch(Exception e){
			e.printStackTrace();
			MSG = "소송정보 등록이 실패하였습니다.";
		}
		return new ModelAndView("redirect:/suit/suit_reg_init.do?MSG="+MSG);
	}
	
	
	//신규등록
	//SuitReg
	public ModelAndView SuitReg(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List blist = null;

		try{
			if(userId != null)
			{
				request.setAttribute("suitGubunList", commonCode.executeCommonCode("14", "소송구분", ""));
				request.setAttribute("affairNum2List", commonCode.executeCommonCode("10", "소송구분코드", ""));
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
				request.setAttribute("jimokList", commonCode.executeCommonCode("2", "지목코드", ""));
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_reg","blist",blist);
	}
		
	// 소송 등록 초기화면
	//SuitRegInit
	public ModelAndView SuitRegInit(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		SuitRegBean searchBean = new SuitRegBean();
		List blist = null;

		try{
			if(userId != null)
			{
				System.out.println("소송 등록 초기화면");
				
				
				String GU_CD = ServletRequestUtils.getStringParameter(request, "GU_CD", "");
				String DONG_CD = ServletRequestUtils.getStringParameter(request, "DONG_CD", "");
				String BUNJI = ServletRequestUtils.getStringParameter(request, "BUNJI", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				request.setAttribute("MSG", MSG);
				
				searchBean.setGU_CD(GU_CD.equals("")?"":GU_CD);
				searchBean.setDONG_CD(DONG_CD.equals("")?"":DONG_CD);
				searchBean.setBUNJI(BUNJI.equals("")?"%":"%"+BUNJI+"%");
				
				blist = objSuitService.getSuitRegList(searchBean,currentPage,Globals.DEFAULT_COUNTPER_PAGE);
				
				int listCount = objSuitService.getSuitRegListCount(searchBean);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&GU_CD="+GU_CD+"&DONG_CD="+DONG_CD+"&BUNJI="+BUNJI
						, "/rams/suit/suit_reg_init.do", listCount);
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", currentPage);
				
				//주소조회코드
				request.setAttribute("guList", commonCode.getGuList(Globals.DEFAULT_SI_CD, ""));
				request.setAttribute("dongList", GU_CD.equals("")?null:commonCode.getBJDongList(GU_CD, ""));
				request.setAttribute("GU_CD", GU_CD);
				request.setAttribute("DONG_CD", DONG_CD);
				request.setAttribute("BUNJI", BUNJI);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_reg_init","blist",blist);
	}
	
	
	
	
	// 소송 상세보기
	public ModelAndView SuitView(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		SuitViewBean view = new SuitViewBean();

		try{
			if(userId != null)
			{
				System.out.println("소송 상세보기");
				
				String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				request.setAttribute("MSG", MSG);
				
//				AFFAIRNUM = new String(AFFAIRNUM.getBytes("8859_1"), "MS949");				

				view = (SuitViewBean)objSuitService.getSuitView(AFFAIRNUM, PNU).get(0);				
				request.setAttribute("view", view);

				request.setAttribute("AFFAIRNUM",AFFAIRNUM);
				request.setAttribute("PNU",PNU);
				
				request.setAttribute("fileList", objSuitService.getSuitFileList(AFFAIRNUM));
				request.setAttribute("filePath",Globals.FILEUPLOADPATH);
				request.setAttribute("suitPath",Globals.LAWSUITFILEPATH);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_view");
	}
	
	
	
	
	// 소송리스트 출력
	public ModelAndView SuitList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		List	guList	=	null;
		List	dongList	=	null;
		List	suitCodeList	=	null;
		
		SuitBean searchBean = new SuitBean();
		

		try{
			if(userId != null)
			{
				System.out.println("소송리스트 조회");
				
				String SEARCHTYPE = ServletRequestUtils.getStringParameter(request, "SEARCHTYPE", "affairnum");
				String FROMDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "FROMDATE", ""));
				String TODATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "TODATE", ""));
				String NUM_YEAR = ServletRequestUtils.getStringParameter(request, "NUM_YEAR", "");
				String NUM_DAN = ServletRequestUtils.getStringParameter(request, "NUM_DAN", "");
				String NUM_NUM = ServletRequestUtils.getStringParameter(request, "NUM_NUM", "");
				String NAME_NAME = ServletRequestUtils.getStringParameter(request, "NAME_NAME", "");
				String LAND_GU = ServletRequestUtils.getStringParameter(request, "LAND_GU", "");
				String LAND_DONG = ServletRequestUtils.getStringParameter(request, "LAND_DONG", "");
				String LAND_BONBUN = ServletRequestUtils.getStringParameter(request, "LAND_BONBUN", "");
				String LAND_BUBUN = ServletRequestUtils.getStringParameter(request, "LAND_BUBUN", "");
				String USERNAME_NAME = ServletRequestUtils.getStringParameter(request, "USERNAME_NAME", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				
				
				searchBean.setFROMDATE(FROMDATE.equals("")?"00000000":FROMDATE);
				searchBean.setTODATE(TODATE.equals("")?"99999999":TODATE);
				searchBean.setAFFAIRNUM((NUM_YEAR.equals("")?"%":NUM_YEAR)+
						(NUM_DAN.equals("")?"%":NUM_DAN)+(NUM_NUM.equals("")?"%":NUM_NUM));
				searchBean.setNAME(NAME_NAME.equals("")?"%":NAME_NAME);
				searchBean.setLAND_GU(LAND_GU.equals("")?"%":LAND_GU);
				searchBean.setLAND_DONG(LAND_DONG.equals("")?"%":LAND_DONG);
				searchBean.setLAND_BONBUN(LAND_BONBUN.equals("")?"%":LAND_BONBUN);
				searchBean.setLAND_BUBUN(LAND_BUBUN.equals("")?"%":LAND_BUBUN);
				searchBean.setUSERNAME(USERNAME_NAME.equals("")?"%":USERNAME_NAME);
				
				blist = objSuitService.getSuitList(searchBean,currentPage,Globals.DEFAULT_COUNTPER_PAGE);
				
				int listCount = objSuitService.getSuitCount(searchBean);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&SEARCHTYPE="+SEARCHTYPE+"&FROMDATE="+FROMDATE+"&TODATE="+TODATE+
						"&NUM_YEAR="+NUM_YEAR+"&NUM_DAN="+NUM_DAN+"&NUM_NUM="+NUM_NUM+
						"&NAME_NAME="+NAME_NAME+"&LAND_GU="+LAND_GU+"&LAND_DONG="+LAND_DONG+
						"&LAND_BONBUN="+LAND_BONBUN+"&LAND_BUBUN="+LAND_BUBUN+"&USERNAME_NAME="+USERNAME_NAME
						, "/rams/suit/suit_list.do", listCount);

				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", currentPage);

				
				guList = commonCode.getGuList(Globals.DEFAULT_SI_CD, "");
				dongList = LAND_GU.equals("")?null:commonCode.getBJDongList(LAND_GU, "");
				suitCodeList = commonCode.executeCommonCode("10", "소송구분코드", "");
				request.setAttribute("guList", guList);
				request.setAttribute("dongList", dongList);
				request.setAttribute("suitCodeList", suitCodeList);
				
				request.setAttribute("SEARCHTYPE", SEARCHTYPE);
				request.setAttribute("FROMDATE", FROMDATE);
				request.setAttribute("TODATE", TODATE);
				request.setAttribute("NUM_YEAR", NUM_YEAR);
				request.setAttribute("NUM_DAN", NUM_DAN);
				request.setAttribute("NUM_NUM", NUM_NUM);
				request.setAttribute("NAME_NAME", NAME_NAME);
				request.setAttribute("LAND_GU", LAND_GU);
				request.setAttribute("LAND_DONG", LAND_DONG);
				request.setAttribute("LAND_BONBUN", LAND_BONBUN);
				request.setAttribute("LAND_BUBUN", LAND_BUBUN);
				request.setAttribute("USERNAME_NAME", USERNAME_NAME);
				
				
				
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_list","list", blist);
	}
	
	// 엑셀출력
	public ModelAndView SuitListExcel(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	blist	=	null;
		List	guList	=	null;
		List	dongList	=	null;
		List	suitCodeList	=	null;
		
		SuitBean searchBean = new SuitBean();
		

		try{
			if(userId != null)
			{
				System.out.println("소송리스트 엑셀출력");
				
				String SEARCHTYPE = ServletRequestUtils.getStringParameter(request, "SEARCHTYPE", "affairnum");
				String FROMDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "FROMDATE", ""));
				String TODATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "TODATE", ""));
				String NUM_YEAR = ServletRequestUtils.getStringParameter(request, "NUM_YEAR", "");
				String NUM_DAN = ServletRequestUtils.getStringParameter(request, "NUM_DAN", "");
				String NUM_NUM = ServletRequestUtils.getStringParameter(request, "NUM_NUM", "");
				String NAME_NAME = ServletRequestUtils.getStringParameter(request, "NAME_NAME", "");
				String LAND_GU = ServletRequestUtils.getStringParameter(request, "LAND_GU", "");
				String LAND_DONG = ServletRequestUtils.getStringParameter(request, "LAND_DONG", "");
				String LAND_BONBUN = ServletRequestUtils.getStringParameter(request, "LAND_BONBUN", "");
				String LAND_BUBUN = ServletRequestUtils.getStringParameter(request, "LAND_BUBUN", "");
				String USERNAME_NAME = ServletRequestUtils.getStringParameter(request, "USERNAME_NAME", "");
				
				
				searchBean.setFROMDATE(FROMDATE.equals("")?"00000000":FROMDATE);
				searchBean.setTODATE(TODATE.equals("")?"99999999":TODATE);
				searchBean.setAFFAIRNUM((NUM_YEAR.equals("")?"%":NUM_YEAR)+
						(NUM_DAN.equals("")?"%":NUM_DAN)+(NUM_NUM.equals("")?"%":NUM_NUM));
				searchBean.setNAME(NAME_NAME.equals("")?"%":NAME_NAME);
				searchBean.setLAND_GU(LAND_GU.equals("")?"%":LAND_GU);
				searchBean.setLAND_DONG(LAND_DONG.equals("")?"%":LAND_DONG);
				searchBean.setLAND_BONBUN(LAND_BONBUN.equals("")?"%":LAND_BONBUN);
				searchBean.setLAND_BUBUN(LAND_BUBUN.equals("")?"%":LAND_BUBUN);
				searchBean.setUSERNAME(USERNAME_NAME.equals("")?"%":USERNAME_NAME);
				
				blist = objSuitService.getSuitListExcel(searchBean);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/suit/suit_list_excel","list", blist);
	}
	
}