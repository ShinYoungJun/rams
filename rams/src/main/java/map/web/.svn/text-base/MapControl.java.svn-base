package main.java.map.web;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.StringUtil;
import main.java.map.model.ConstBean;
import main.java.map.model.GosiBean;
import main.java.map.model.LayerBean;
import main.java.map.model.SiGuBean;
import main.java.map.model.T_PNUBean;
import main.java.map.service.IMapService;
import main.java.suit.model.SuitViewBean;
import main.java.suit.service.ISuitService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class MapControl extends MultiActionController {

	private IMapService objMapService = null;
	private ISuitService objSuitService = null;
			

	public void setMapService(IMapService newObjMapService) {
		this.objMapService = newObjMapService;
		
	}
	
	public void setSuitService(ISuitService newObjSuitService) 
	{
		this.objSuitService  = newObjSuitService;
	}
	
	

	
	public ModelAndView Map(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		
		String selectMap = ServletRequestUtils.getStringParameter(request, "selectMap", "");
		
		String reward="0";
		if(selectMap.equals("juckji")){
			request.setAttribute("iFrameUrl1","/rams/map/juckjianalysis.do");
			request.setAttribute("iFrameUrl2","/rams/map/juckjianalysisres.do");
		}else if(selectMap.equals("unReward")){
			request.setAttribute("iFrameUrl1","/rams/map/unreward.do");
			request.setAttribute("iFrameUrl2","/rams/jsp/map/leftunrewardres.jsp");
			reward = "1";
			System.out.println("reward : "+reward);
		}else if(selectMap.equals("suitBiz")){
			request.setAttribute("iFrameUrl1","/rams/map/suitbiz.do");
			request.setAttribute("iFrameUrl2","/rams/map/suitbizres.do");				
		}else if(selectMap.equals("reward")){
			request.setAttribute("iFrameUrl1","/rams/map/reward.do");
			request.setAttribute("iFrameUrl2","");
			reward = "2";
		}
					
		
		request.setAttribute("reward", reward);
		return new ModelAndView("/map/main");
	}
	
	public ModelAndView JuckjiAnalysis(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		List list = objMapService.getJimokList();
		List olist = objMapService.getOwnGubunList();
		List gulist = objMapService.getGuCodeList();
		List roadlist = objMapService.getRoadNameList();
	//	List searchlist = objMapService.getJuckJiSearchList();
	
		String  jimok = "<select name='selectJi' class='tb147' id='selectJi'><option>::::선택::::</option>";
		String owner = "<select name='selectOwn' class='tb147' id='selectOwn'><option>::::선택::::</option>";
		String gu = "<select name='selectGu' class='tb147' id='selectGu' onChange='javascript:changeGuCode();'><option>::::선택::::</option>";
		String road = "<select name='selectRoad' class='tb147' id='selectRoad'><option>::::선택::::</option>";
		
		for(int i = 0; i<list.size();i++){
			T_PNUBean bean = (T_PNUBean)list.get(i);
			if(!bean.getJIMOK().equals("0")){
			jimok += "<option value="+bean.getJIMOK()+">"+bean.getCODEDESC()+"</option>";
			}
			
		}
		jimok += "</select>";
		
		
		for(int j = 0; j<olist.size();j++){
			T_PNUBean obean = (T_PNUBean)olist.get(j);
			if(!obean.getOWNGUBUN().equals("0")){
			owner += "<option value="+obean.getOWNGUBUN()+">"+obean.getCODEDESC()+"</option>";
			}
		}
		owner += "</select>";
		
		for(int k = 0; k<gulist.size();k++){
			SiGuBean gubean = (SiGuBean)gulist.get(k);
			if(!gubean.getGU_CD().equals("000")){			
			gu += "<option value='"+gubean.getGU_CD()+"'>"+gubean.getGU_NM()+"</option>";
			}
		}
		gu += "</select>";
		
		System.out.println(gu);
		
		for(int l = 0; l<roadlist.size();l++){			
			T_PNUBean roadbean = (T_PNUBean)roadlist.get(l);
		
			if(roadbean.getROADNAME() == null || roadbean.getROADNAME().equals("") || roadbean.getROADNAME().equals("null")){	
			//	System.out.println(roadbean.getROADNAME());
			}else{
				road += "<option value="+roadbean.getPNU()+">"+roadbean.getROADNAME()+"</option>";

			}
		
		}
		road += "</select>";
		
		System.out.println(road);
		
		
		
		request.setAttribute("RoadName", road);
		request.setAttribute("GuCode", gu);
		request.setAttribute("Owngubun", owner);
		request.setAttribute("Jimok", jimok);
	//	request.setAttribute("SearchList", searchlist);

		return new ModelAndView("/map/leftjuckji");
	}
	
	public ModelAndView JuckjiAnalysisRes(HttpServletRequest request,HttpServletResponse response) throws Exception {		
	
		
		//request.setCharacterEncoding("euc-kr");
		String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
		String selectGu = ServletRequestUtils.getStringParameter(request, "selectGu", "");
		String selectDong = ServletRequestUtils.getStringParameter(request, "selectDong", "");
		String selectRoad = ServletRequestUtils.getStringParameter(request, "selectRoad", "");		
		String selectOwn = ServletRequestUtils.getStringParameter(request, "selectOwn", "");
		String selectJi = ServletRequestUtils.getStringParameter(request, "selectJi", "");
		String prevJiga = ServletRequestUtils.getStringParameter(request, "prevJiga", "");
		String nextJiga = ServletRequestUtils.getStringParameter(request, "nextJiga", "");		
		String cityPlan = ServletRequestUtils.getStringParameter(request, "cityPlan", "");  //도시계획시설
		String useArea = ServletRequestUtils.getStringParameter(request, "useArea", ""); //용도구역
		String useZone = ServletRequestUtils.getStringParameter(request, "useZone", ""); //용도지역
		String useRegion = ServletRequestUtils.getStringParameter(request, "useRegion", ""); //용도지구
		
		
		
		System.out.println("road : "+selectRoad);

		System.out.println("selectGu : " +selectGu);
		System.out.println("selectDong : "+selectDong);
		System.out.println("selectOwn : "+selectOwn);
		System.out.println("selectJi : "+selectJi);
		System.out.println("prevJiga : "+prevJiga);
		System.out.println("nextJiga : "+nextJiga);
		
		 LayerBean bean = new LayerBean();
		
		
		int searchCount = objMapService.getJuckJiSearchListCnt(selectGu, selectDong, selectRoad,selectOwn,selectJi,
				prevJiga,nextJiga,cityPlan,useArea,useZone,useRegion);
		
		System.out.println("count : "+searchCount);
		
		String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.VOD_COUNTPER_PAGE),
				"&selectGu="+selectGu+"&selectDong="+selectDong+"&selectRoad="+selectRoad
				+"&selectOwn="+selectOwn+"&selectJi="+selectJi+"&prevJiga="+prevJiga+"&nextJiga="+nextJiga
				+"&cityPlan="+cityPlan+"&useArea="+useArea+"&useZone="+useZone+"&useRegion="+useRegion
				, "/rams/map/juckjianalysisres.do", searchCount);
		
		
		//RNUM > (?-1)*? AND ROWNUM <= ?
		
		int a= Integer.parseInt(currentPage); 
		int istartNum =  (a-1)*Integer.valueOf(Globals.VOD_COUNTPER_PAGE)+1;
		int iendNum = a*Integer.valueOf(Globals.VOD_COUNTPER_PAGE);
		
		String startNum = Integer.toString(istartNum);
		String endNum = Integer.toString(iendNum);
		
		System.out.println("======페이징=====");
		System.out.println("startNum : "+startNum);
		System.out.println("endNum : "+endNum);
		
		
		List searchlist = objMapService.getJuckJiSearchList(selectGu, selectDong, selectRoad,selectOwn,selectJi,
				prevJiga,nextJiga,startNum,endNum,cityPlan,useArea,useZone,useRegion);
	
		request.setAttribute("SearchList", searchlist);
		request.setAttribute("strPageDivideForm", strPageDivideForm);

		return new ModelAndView("/map/leftjuckjires");
	}
	
	public ModelAndView JuckjiAnalysisDetail(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
		
		List list = objMapService.getJuckJiSearchView(PNU);
		
		
		int gosiCount = objMapService.getJuckJiGosiListCnt(PNU);
		List gosiList = objMapService.getJuckJiGosiList(PNU);
		
		int planCount = objMapService.getJuckJiPlanListCnt(PNU);
		List planList = objMapService.getJuckJiPlanList(PNU);
		
		List compeList = objMapService.getCompeid(PNU);
		List AffairList = objMapService.getAffairNum(PNU);
		
		T_PNUBean  bean = new T_PNUBean();
		
		if(!list.isEmpty()){
		bean = (T_PNUBean)list.get(0);
		
		}

		System.out.println("PNU : "+PNU);
		System.out.println("gosiCount  : "+gosiCount);
		System.out.println("planCount : "+planCount);
		System.out.println("planCountlist : "+planList.size());

		request.setAttribute("planCount", planCount);
		request.setAttribute("planList", planList);
				
		request.setAttribute("gosiCount", gosiCount);
		request.setAttribute("gosiList", gosiList);
		
		request.setAttribute("AffairCount", AffairList.size());
		request.setAttribute("AffairList", AffairList);
		
		request.setAttribute("compeCount", compeList.size());
		request.setAttribute("compeList", compeList);
		
		request.setAttribute("PNU", PNU);		
		request.setAttribute("view", bean );
		
		return new ModelAndView("/map/leftjuckjidetail");
	}
	
	//상세검색
	
	public ModelAndView JuckjiAnalysisSearch(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		System.out.println("DetailSearch");
		
		List list = objMapService.getJimokList();
		List olist = objMapService.getOwnGubunList();
		List gulist = objMapService.getGuCodeList();
		List roadlist = objMapService.getRoadNameList();
	
		String  jimok = "<select name='selectJi' class='formBox1' id='selectJi'><option>::::선택::::</option>";
		String owner = "<select name='selectOwn' class='formBox1' id='selectOwn'><option>::::선택::::</option>";
		String gu = "<select name='selectGu' class='formBox1' id='selectGu' onChange='javascript:changeGuCode();'><option>::::선택::::</option>";
		String road = "<select name='selectRoad' class='formBox1' id='selectRoad'><option>::::선택::::</option>";
		
		for(int i = 0; i<list.size();i++){
			T_PNUBean bean = (T_PNUBean)list.get(i);
			if(!bean.getJIMOK().equals("0")){
			jimok += "<option value="+bean.getJIMOK()+">"+bean.getCODEDESC()+"</option>";
			}
			
		}
		jimok += "</select>";
		
		
		for(int j = 0; j<olist.size();j++){
			T_PNUBean obean = (T_PNUBean)olist.get(j);
			if(!obean.getOWNGUBUN().equals("0")){
			owner += "<option value="+obean.getOWNGUBUN()+">"+obean.getCODEDESC()+"</option>";
			}
		}
		owner += "</select>";
		
		for(int k = 0; k<gulist.size();k++){
			SiGuBean gubean = (SiGuBean)gulist.get(k);
			if(!gubean.getGU_CD().equals("000")){			
			gu += "<option value='"+gubean.getGU_CD()+"'>"+gubean.getGU_NM()+"</option>";
			}
		}
		gu += "</select>";
		
		System.out.println(gu);
		
		for(int l = 0; l<roadlist.size();l++){			
			T_PNUBean roadbean = (T_PNUBean)roadlist.get(l);
		
			if(roadbean.getROADNAME() == null || roadbean.getROADNAME().equals("") || roadbean.getROADNAME().equals("null")){	
			//	System.out.println(roadbean.getROADNAME());
			}else{
				road += "<option value="+roadbean.getPNU()+">"+roadbean.getROADNAME()+"</option>";

			}
		
		}
		road += "</select>";
		
		System.out.println(road);
		
		
		
		request.setAttribute("RoadName", road);
		request.setAttribute("GuCode", gu);
		request.setAttribute("Owngubun", owner);
		request.setAttribute("Jimok", jimok);
	//	request.setAttribute("SearchList", searchlist);
		
		
		return new ModelAndView("/map/leftjuckjisearchview");
		
	}
	
	
	
	public ModelAndView JuckjiAnalysisDetailView(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		System.out.println("상세 팝업");
		
		String GOSIID = ServletRequestUtils.getStringParameter(request, "GOSIID", "");
		
		System.out.println("GOSIID : "+GOSIID);
		
		List list = objMapService.getJuckJiSearchPopView(GOSIID);

		GosiBean bean = new GosiBean();
		
		
		if(!list.isEmpty()){
			bean = (GosiBean)list.get(0);

		}
		
		
		String path = "";
		String path1 = Globals.FILEUPLOADPATH.toString();
		String path2 = "";
		
		if(bean.getGUBUN().equals("1")){
			//시설결정고시
			path2 = Globals.APPROVEFILEPATH.toString();
		}else if(bean.getGUBUN().equals("4")){
			//실시계획인가
			path2 = Globals.PLANFILEPATH.toString();
		}
		
		path = path1+path2;
		
		
		System.out.println("gubun : "+bean.getGUBUN());
		System.out.println(path);
		
		request.setAttribute("path", path);
		//request.setAttribute(arg0, arg1);
		request.setAttribute("gosiBean", bean);
		
		return new ModelAndView("/map/leftjuckjidetailview");
	}
	
	

	
	public ModelAndView JuckjiAnalysisDetailFrame1(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		System.out.println("상세 팝업 iFrame");
		String GOSIID = ServletRequestUtils.getStringParameter(request, "GOSIID", "");
		
		System.out.println("GOSIID : "+GOSIID);
		
		List list = objMapService.getJuckJiSearchDetailFrame1(GOSIID);
		
		
		request.setAttribute("fSize", list.size());
		request.setAttribute("fList", list);
		
		return new ModelAndView("/map/leftjuckjidetailframe1");
	}
	
public ModelAndView JuckjiAnalysisDetailFrame2(HttpServletRequest request,HttpServletResponse response) throws Exception {
		
		System.out.println("상세 팝업 iFrame2");
		String GOSIID = ServletRequestUtils.getStringParameter(request, "GOSIID", "");
		
		System.out.println("GOSIID : "+GOSIID);
		
		List list = objMapService.getJuckJiSearchDetailFrame2(GOSIID);
		
		
		request.setAttribute("fSize", list.size());
		request.setAttribute("fList", list);
		
		
		
		return new ModelAndView("/map/leftjuckjidetailframe2");
	}

public ModelAndView JuckjiAnalysisDetailFrame3(HttpServletRequest request,HttpServletResponse response) throws Exception {
	
	System.out.println("상세 팝업 iFrame3");
	String GOSIID = ServletRequestUtils.getStringParameter(request, "GOSIID", "");
	
	
	System.out.println("GOSIID : "+GOSIID);
	List list = objMapService.getJuckJiSearchDetailFrame3(GOSIID);

	request.setAttribute("fSize", list.size());
	request.setAttribute("fList", list);
	
	return new ModelAndView("/map/leftjuckjidetailframe2");
}
	
	
	public ModelAndView		GetDongList(HttpServletRequest request,HttpServletResponse response, String SHOP_IMG_NAME) throws Exception 
	{
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 		GU_CD 	= ServletRequestUtils.getStringParameter(request, "GU_CD");
		
	System.out.println("에이젝스 ~~~"+GU_CD);
	//	System.out.println(userId);
		
		List 		list		= null;
		
	//	if(userId != null)
	//	{
			
			//String	Xml	= "";
			
			
			String	Xml	= "<?xml version='1.0' encoding='utf-8'?>";
			Xml	+= "<ROOT>";
			
			if(GU_CD == null || GU_CD.equals("")){
				Xml	+= StringUtil.XmlNodeMake("", "동선택");
			}else{
				list = objMapService.getBJDongList(GU_CD);
				SiGuBean Bean = new SiGuBean();
			
				for(int	i = 0	;	i < list.size()	;	i++)
				{
					Bean	= (SiGuBean)list.get(i);
					Xml	+= StringUtil.XmlNodeMake(Bean.getBJ_NM(),Bean.getBJ_CD());
				}
			}
			Xml	+= "</ROOT>";

	        response.setContentType("text/html;charset=EUC-KR");
	        response.setHeader("Cache-Control", "no-cache");
	        response.getWriter().write(Xml);
	        
	        System.out.println("Get_GU_CD :::::::::"+Xml);

//		}
		return null;
	}
	
	
public ModelAndView SuitBusinessMain(HttpServletRequest request,HttpServletResponse response) throws Exception {

		List gulist = objMapService.getGuCodeList();

	
		String gu = "<select name='selectGu' class='tb147' id='selectGu' onChange='javascript:changeGuCode();'><option>::::선택::::</option>";

		for(int k = 0; k<gulist.size();k++){
			SiGuBean gubean = (SiGuBean)gulist.get(k);
			if(!gubean.getGU_CD().equals("000")){			
			gu += "<option value='"+gubean.getGU_CD()+"'>"+gubean.getGU_NM()+"</option>";
			}
		}
		gu += "</select>";
		
		System.out.println(gu);
		
		request.setAttribute("GuCode", gu);
		

		return new ModelAndView("/map/leftsuitbiz");
	}
	

public ModelAndView SuitBusinessRes(HttpServletRequest request,HttpServletResponse response) throws Exception {		

	request.setCharacterEncoding("euc-kr");
	String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
	String selectGu = ServletRequestUtils.getStringParameter(request, "selectGu", "");
	String selectDong = ServletRequestUtils.getStringParameter(request, "selectDong", "");
	String jibun = ServletRequestUtils.getStringParameter(request, "jibun", "");
	String san = ServletRequestUtils.getStringParameter(request, "san", "");

	
	System.out.println("gu : "+selectGu);
	System.out.println("dong : "+selectDong);
	System.out.println("jibun : "+jibun);
	System.out.println("san : "+san);
	
	if(san == "true" || san.equals("true")){
		san =  "2";			
	}else if(san=="false" || san.equals("false")){
		san = "1";		
	}
	
	int searchCount = objMapService.getSuitBizSearchListCnt(selectGu, selectDong, san, jibun);
	
	String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.VOD_COUNTPER_PAGE),
			"&selectGu="+selectGu+"&selectDong="+selectDong+"&jibun="+jibun+"&san="+san
			, "/rams/map/suitbizres.do", searchCount);

	
	
	int a= Integer.parseInt(currentPage); 
	int istartNum =  (a-1)*Integer.valueOf(Globals.VOD_COUNTPER_PAGE)+1;
	int iendNum = a*Integer.valueOf(Globals.VOD_COUNTPER_PAGE);
	
	String startNum = Integer.toString(istartNum);
	String endNum = Integer.toString(iendNum);
	
	System.out.println("======페이징=====");
	System.out.println("startNum : "+startNum);
	System.out.println("endNum : "+endNum);
	
	
	List searchlist = objMapService.getSuitBizSearchList(selectGu, selectDong, san,jibun,startNum,endNum);

	
	System.out.println("count : "+searchCount);
	System.out.println("listsize : "+searchlist.size());
	
	
	request.setAttribute("SearchList", searchlist);
	request.setAttribute("strPageDivideForm", strPageDivideForm);

		
	return new ModelAndView("/map/leftsuitbizres");
}

public ModelAndView SuitBusinessDetail(HttpServletRequest request,HttpServletResponse response) throws Exception {		
	
	
	request.setCharacterEncoding("euc-kr");
	String selectTab = ServletRequestUtils.getStringParameter(request, "selectTab", "/rams/map/suitbizdetail1.do");
	String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
	
	
	selectTab += "?PNU="+PNU;
	
	request.setAttribute("PNU", PNU);
	request.setAttribute("selectTab", selectTab);
	
		
	return new ModelAndView("/map/leftsuitbizdetail");
}



public ModelAndView SuitBusinessTab1(HttpServletRequest request,HttpServletResponse response) throws Exception {		
	
	

	String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
	
	System.out.println("--------tab1---------");
	System.out.println("PNU : "+PNU);
	
	List list = objMapService.getJuckJiSearchView(PNU);
	
	
	int gosiCount = objMapService.getJuckJiGosiListCnt(PNU);
	List gosiList = objMapService.getJuckJiGosiList(PNU);
	
	int planCount = objMapService.getJuckJiPlanListCnt(PNU);
	List planList = objMapService.getJuckJiPlanList(PNU);
	
	
	System.out.println("PNU : "+PNU);
	System.out.println("gosiCount  : "+gosiCount);
	System.out.println("planCount : "+planCount);
	System.out.println("planCountlist : "+planList.size());
	List compeList = objMapService.getCompeid(PNU);
	List AffairList = objMapService.getAffairNum(PNU);

	T_PNUBean  bean = new T_PNUBean();
	
	if(!list.isEmpty()){
	bean = (T_PNUBean)list.get(0);
	
	}
	
	System.out.println("===================");
	System.out.println("suit");
	
	request.setAttribute("planCount", planCount);
	request.setAttribute("planList", planList);
	request.setAttribute("gosiCount", gosiCount);
	request.setAttribute("gosiList", gosiList);
	
	request.setAttribute("AffairCount", AffairList.size());
	request.setAttribute("AffairList", AffairList);	
	request.setAttribute("compeCount", compeList.size());
	request.setAttribute("compeList", compeList);
	
	request.setAttribute("PNU", PNU);		
	request.setAttribute("view", bean );

	
	return new ModelAndView("/map/leftsuitbizdetail1");
}


public ModelAndView SuitBusinessTab2(HttpServletRequest request,HttpServletResponse response) throws Exception {		

	String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
	
	System.out.println("--------tab2---------");
	System.out.println("PNU : "+PNU);
	
	List list1 = objMapService.getSuitBizConstList1(PNU);
	List list2 = objMapService.getSuitBizConstList2(PNU);
	List list3 = new ArrayList();
	String str = "";
	
	T_PNUBean bean1 = new T_PNUBean ();
	ConstBean bean2 = new ConstBean();
	ConstBean bean3 = new ConstBean();
	
	if(!list1.isEmpty()){
	 bean1= (T_PNUBean)list1.get(0);
	}
	
	if(!list2.isEmpty()){		
	 bean2 = (ConstBean)list2.get(0);
	 
			 if(bean2.getCONSTNUM() != null && !bean2.getCONSTNUM().equals("")){
				 list3 = objMapService.getSuitBizConstList3(bean2.getCONSTNUM());
			 }
			
			 if(!list3.isEmpty()){
				
				 			for(int i = 0; i<list3.size();i++){
				 				bean3 = (ConstBean)list3.get(i);
				 					if(i==0){
				 						str +=  bean3.getCOMPANY();
				 					}else {
				 						str +=   ", " + bean3.getCOMPANY();
				 					}
						 	}

			 }
	 	 
	}
	 
	
	 request.setAttribute("view1", bean1);
	request.setAttribute("view2", bean2);
	request.setAttribute("COMPANY", str);
	
	return new ModelAndView("/map/leftsuitbizdetail2");
}


public ModelAndView SuitBusinessTab3(HttpServletRequest request,HttpServletResponse response) throws Exception {		

	String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
	
	System.out.println("--------tab3---------");
	System.out.println("PNU : "+PNU);
	
	List list1 = objMapService.getSuitBizConstList1(PNU);
	List list2 = 	objMapService.getSuitBizConstList4(PNU);
	
	T_PNUBean bean1 = new T_PNUBean ();
	LayerBean bean2 = new LayerBean (); 
	String string = "";
	String string1 = "";
	String string2 = "";
	int a = 0;
	
	if(!list1.isEmpty()){
		bean1= (T_PNUBean)list1.get(0);
	}
	
	if(!list2.isEmpty()){
		bean2= (LayerBean)list2.get(0);


		
		string1 += "		<table width='233' border='1' cellspacing='0' cellpadding='0' bordercolor='#bed6e1'>";
		string1 += "  		<tr> ";
		string1 += "		<th height='25' scope='row' colspan='2'>도시계획시설</th>";
		string1 += "	  </tr>";
		
		if(!bean2.getCOUNT_16().equals("0")){
		string += "	  <tr> ";
		string += "		<th width='90' height='25' class='title' scope='row'>주차장</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='21' name='21' onclick=layerOnOff('21') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
			a += 1;
		}
		
		if(!bean2.getCOUNT_18().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' scope='row' class='title' height='25'>녹지</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='23' name='23' onclick=layerOnOff('23') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
			a += 1;
		}
		
		if(!bean2.getCOUNT_17().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' scope='row' class='title' height='25'>공원</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='22' name='22' onclick=layerOnOff('22') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
			a += 1;
		}
		
		if(!bean2.getCOUNT_15().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' scope='row' class='title' height='25'>도로</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_off.gif' alt='off' id='14' name='14' onclick=layerOnOff('14') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
			a += 1;
		}
		
		if(!bean2.getCOUNT_19().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' scope='row' class='title' height='25'>유원지</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='24' name='24' onclick=layerOnOff('24') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_20().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' scope='row' class='title' height='25'>학교</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='25' name='25' onclick=layerOnOff('25') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_21().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' scope='row' class='title' height='25'>하천</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_off.gif' alt='off' id='19' name='19' onclick=layerOnOff('19') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		
		
		if(a>0){
			string += "</table>";
			
			string1+=string;
			
		}else{
			string1 = "";
		}
		
		a=0;
		string="";
		
		string2 += "  <table width='233' border='1' cellspacing='0' cellpadding='0' bordercolor='#bed6e1'>";
		string2 += "  	<tr>";
		string2 += "		<th  height='25' scope='row' colspan='2'>용도지역지구</th>";
		string2 += "	  </tr>";
				
		if(!bean2.getCOUNT_().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>개발제한구역</th>";
		string += "		<td align='right' style='padding-right:10px'></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_1().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>주거지역</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='0' name='0' onclick=layerOnOff('0') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_2().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>상업지역</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='1' name='1' onclick=layerOnOff('1') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_3().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>공업지역</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='2' name='2' onclick=layerOnOff('2') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_4().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>녹지지역</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='3' name='3' onclick=layerOnOff('3') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_5().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>경관지구</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='4' name='4' onclick=layerOnOff('4') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_6().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>미관지구</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='5' name='5' onclick=layerOnOff('5') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_7().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>고도지구</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='6' name='6' onclick=layerOnOff('6') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_8().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>방화지구</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='7' name='7' onclick=layerOnOff('7') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_9().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>방재지구</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='8' name='8' onclick=layerOnOff('8') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_10().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>보존지구</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='9' name='9' onclick=layerOnOff('9') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_11().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>시설보호지구</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='10' name='10' onclick=layerOnOff('10') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_12().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>용도지구취락지구</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='11' name='11' onclick=layerOnOff('11') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_13().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>개발진흥지구</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='12' name='12' onclick=layerOnOff('12') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		a += 1;
		}
		
		if(!bean2.getCOUNT_14().equals("0")){
		string += "	  <tr>";
		string += "		<th width='90' height='25' class='title' scope='row'>국토이용기타용도지구</th>";
		string += "		<td align='right' style='padding-right:10px'><img src='/rams/images/common/btn_on.gif' alt='on' id='13' name='13' onclick=layerOnOff('13') width='42' height='19' border='0' style='cursor:hand;' /></td> ";
		string += "	  </tr>";
		
		a += 1;
		}
		
		
		
		if(a>0){
			
			string += "	</table>";
			
			string2 += string;
			
		}else{
			string2 = "";
		}
		
		string1 += string2;
		
	}
	
	System.out.println(string1);
	

	 request.setAttribute("view1", bean1);
	 request.setAttribute("string", string1);
	
	return new ModelAndView("/map/leftsuitbizdetail3");
}

public ModelAndView UnRewardMain(HttpServletRequest request,HttpServletResponse response) throws Exception {

	
		return new ModelAndView("/map/leftunreward");
	}
	

public ModelAndView UnRewardDetail(HttpServletRequest request,HttpServletResponse response) throws Exception {		
	
	
String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
	
	System.out.println("---------unrewarddetail--------");
	System.out.println("PNU : "+PNU);
	
	List list = objMapService.getJuckJiSearchView(PNU);
	
	
	int gosiCount = objMapService.getJuckJiGosiListCnt(PNU);
	List gosiList = objMapService.getJuckJiGosiList(PNU);
	
	int planCount = objMapService.getJuckJiPlanListCnt(PNU);
	List planList = objMapService.getJuckJiPlanList(PNU);
	
	List compeList = objMapService.getCompeid(PNU);
	List AffairList = objMapService.getAffairNum(PNU);
	

	System.out.println("gosiCount  : "+gosiCount);
	System.out.println("planCount : "+planCount);
	System.out.println("planCountlist : "+planList.size());
	T_PNUBean bean = new T_PNUBean(); 
	
	
	if(!list.isEmpty()){
		bean = (T_PNUBean)list.get(0);	
	}

	System.out.println("===================");
	System.out.println("unrewarddetail");
	
	request.setAttribute("planCount", planCount);
	request.setAttribute("planList", planList);
	
	request.setAttribute("gosiCount", gosiCount);
	request.setAttribute("gosiList", gosiList);
	
	request.setAttribute("AffairCount", AffairList.size());
	request.setAttribute("AffairList", AffairList);
	
	request.setAttribute("compeCount", compeList.size());
	request.setAttribute("compeList", compeList);
	
	request.setAttribute("PNU", PNU);		
	request.setAttribute("view", bean );
		
	return new ModelAndView("/map/leftunrewarddetail");
}


public ModelAndView RewardMain(HttpServletRequest request,HttpServletResponse response) throws Exception {

		return new ModelAndView("/map/leftreward");
	}
	
public ModelAndView RewardDetailView(HttpServletRequest request,HttpServletResponse response) throws Exception {		
	
	
	request.setCharacterEncoding("euc-kr");
	
	String pnuList = ServletRequestUtils.getStringParameter(request, "PNULIST", "");
	
	
	List<T_PNUBean> rewardList =  new ArrayList<T_PNUBean>();
	System.out.println("pnu : "+pnuList);
	
	 StringTokenizer tokenizer = new StringTokenizer(pnuList, " "); // 구분자를 공백으로 설정
	  
     System.out.println("Total Token Count :  "+ tokenizer.countTokens());
     String error = "";
     while(tokenizer.hasMoreTokens()){

   	  String string = tokenizer.nextToken();
   	  
   	  
   	  if(!string.equals("undefined"))  {
   		  
   		  List list = objMapService.getRewardReturnList(string.trim()); 
   			
   			  
   			  if(!list.isEmpty()){
        		  T_PNUBean bean  = (T_PNUBean)list.get(0);
           		  
        		  rewardList.add(bean);
           		  }else{
           			error += string+" ";  
           		  }

       
   	  }

     }

     request.setAttribute("pnuList", pnuList);
     request.setAttribute("count", rewardList.size());
     request.setAttribute("rewardList", rewardList);
	
			
	return new ModelAndView("/map/leftrewardview");
}

public ModelAndView		GetUnRewardList(HttpServletRequest request,HttpServletResponse response) throws Exception 
{
	HttpSession session = request.getSession();
	String 		userId	= (String)session.getAttribute("sessionUserId");
	String 		pnuStr 	= ServletRequestUtils.getStringParameter(request, "PNUSTR");
	String      ownGubun =  ServletRequestUtils.getStringParameter(request,"OWNGUBUN","all");
	
	
		System.out.println("GetUnRewardList : "+pnuStr);
		System.out.println("GetUnRewardListgu : "+ownGubun);
		
		if(ownGubun == null || ownGubun.equals("")){
			ownGubun = "all";
		}


		String	Xml	= "<?xml version='1.0' encoding='utf-8'?>";
		Xml	+= "<ROOT>";
		
          StringTokenizer tokenizer = new StringTokenizer(pnuStr, " "); // 구분자를 공백으로 설정
  
          System.out.println("Total Token Count :  "+ tokenizer.countTokens());
          String error = "";
          while(tokenizer.hasMoreTokens()){

        	  String string = tokenizer.nextToken();
        	  
        	  
        	  if(!string.equals("undefined"))  {
        		  
        		  List list =  objMapService.getUnRewardReturnList(string.trim(), ownGubun); 
        			
        			  
        			  if(!list.isEmpty()){
                		  T_PNUBean bean  = (T_PNUBean)list.get(0);
                			Xml += "<tr>";
                        	Xml += "<td>"+bean.getSGGCODE()+"</td>";
                        	Xml += "<td>"+bean.getDONGCODE()+"</td>";
                        	Xml += "<td>"+bean.getJIBUN()+"</td>";
                        	Xml += "<td>"+bean.getCODEDESC()+"</td>";
                        	Xml += "<td>"+bean.getPNU()+"</td>";
                        	Xml += "<td>"+bean.getXID()+"</td>";
                        	Xml += "</tr>";
                		  
                		  }else{
                			error += string+" ";  
                		  }

            //  System.out.println("Token is : "+ string);
        	  }

          }
		Xml	+= "</ROOT>";

        response.setContentType("text/html;charset=EUC-KR");
        response.setHeader("Cache-Control", "no-cache");
        response.getWriter().write(Xml);
        
        System.out.println("Get_GU_CD :::::::::"+Xml);
        System.out.println("error : "+error);

//	}
	return null;
}

public ModelAndView	RewardExcelView(HttpServletRequest request,HttpServletResponse response) throws Exception 
{

	String pnuList = ServletRequestUtils.getStringParameter(request, "PNULIST", "");
	String jigaList = ServletRequestUtils.getStringParameter(request, "JIGALIST", "");
	String sumArea = ServletRequestUtils.getStringParameter(request, "SUMAREA", "");
	String sumJiga = ServletRequestUtils.getStringParameter(request, "SUMJIGA", "");
		
		
	List<T_PNUBean> rewardList =  new ArrayList<T_PNUBean>();
	
	System.out.println("========Excel============");
	System.out.println("pnu : "+pnuList);
	System.out.println("jiga : "+jigaList);
	
	 StringTokenizer tokenizer = new StringTokenizer(pnuList, " "); // 구분자를 공백으로 설정
	 StringTokenizer tokenizer2 = new StringTokenizer(jigaList, " "); // 구분자를 공백으로 설정
	  
     System.out.println("Total Token Count :  "+ tokenizer.countTokens());
     String error = "";
     while(tokenizer.hasMoreTokens()){

   	  String string = tokenizer.nextToken();
   	  String str = tokenizer2.nextToken();
   	  
   	  
   	  if(!string.equals("undefined"))  {
   		  
   		  List list = objMapService.getRewardReturnList(string.trim()); 
   			
   			  
   			  if(!list.isEmpty()){
        		  T_PNUBean bean  = (T_PNUBean)list.get(0);
           		  
        		  bean.setMAKEJIGA(str);
        		  
        		  rewardList.add(bean);
           		  }else{
           			error += string+" ";  
           		  }       
   	  }

     }

     request.setAttribute("sumJiga", sumJiga);
     request.setAttribute("sumArea", sumArea);
     request.setAttribute("count", rewardList.size());
     request.setAttribute("rewardList", rewardList);

	return new ModelAndView("/map/excel_search");
	
}

//한글인코딩 문제로 suit쪽에 있는 메소드를 끌어옴.
public ModelAndView MapSuitView(HttpServletRequest request, HttpServletResponse response) throws Exception {
	HttpSession session = request.getSession();
	String 		userId	= (String)session.getAttribute("sessionUserId");
	SuitViewBean view = new SuitViewBean();

	//request.setCharacterEncoding("euc-kr");
	try{
	//	if(userId != null)
	//	{
			System.out.println("맵 소송 상세보기");		
			
			String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");
			String AFFAIRNUM = ServletRequestUtils.getStringParameter(request, "AFFAIRNUM", "");

						
			System.out.println("AFFAIRNUM : "+AFFAIRNUM);

			
			List AffairList = objMapService.getAffairNum(PNU);

    		String affairnum = "";			
			GosiBean bean1 = new GosiBean();

			if(!AffairList.isEmpty()){
				bean1 = null;
				bean1 = (GosiBean)AffairList.get(0);
				affairnum = bean1.getGOSIID();
				
				
			}
			
			System.out.println("===============");
			System.out.println("affair : "+affairnum);

			view = (SuitViewBean)objSuitService.getSuitView(AFFAIRNUM, PNU).get(0);	
			
			request.setAttribute("view", view);

			request.setAttribute("AFFAIRNUM",affairnum);
			request.setAttribute("PNU",PNU);
			
			request.setAttribute("fileList", objSuitService.getSuitFileList(affairnum));
			request.setAttribute("filePath",Globals.FILEUPLOADPATH);
			request.setAttribute("suitPath",Globals.LAWSUITFILEPATH);
	//	}
	}catch(Exception e){
		e.printStackTrace();
	}
	
	return new ModelAndView("/suit/suit_view");
}

}
