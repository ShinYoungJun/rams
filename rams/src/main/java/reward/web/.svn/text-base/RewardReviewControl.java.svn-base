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
import main.java.reward.model.CompeViewBean;
import main.java.reward.model.CompeWriteBean;
import main.java.reward.model.RewardBean;
import main.java.reward.model.RewardReviewBean;
import main.java.reward.model.RewardReviewViewBean;
import main.java.reward.model.RewardReviewWriteBean;
import main.java.reward.service.IRewardReviewService;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

public class RewardReviewControl extends MultiActionController {

	private IRewardReviewService objRewardReviewService = null;
	private	CommonCodeService	commonCode		= null;		

	public void setRewardReviewService(IRewardReviewService RewardReviewService) {
		this.objRewardReviewService = RewardReviewService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	// 보상 심의 리스트 출력
	public ModelAndView RewardReviewList(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	reviewList	=	null;
		int listCount = 0;
		
		RewardReviewBean searchBean = new RewardReviewBean();
		RewardReviewBean reviewListBean = new RewardReviewBean();

		try{
			if(userId != null)
			{
				System.out.println("보상 심의 리스트 조회");
				
				String SEARCH_VALUE = ServletRequestUtils.getStringParameter(request, "SEARCH_VALUE", "");
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				
				searchBean.setSEARCH_VALUE(SEARCH_VALUE);
				searchBean.setSEARCH_VALUE(SEARCH_VALUE.equals("")?"%":"%"+SEARCH_VALUE+"%");

				reviewList = objRewardReviewService.getRewardReviewList(searchBean,currentPage,Globals.DEFAULT_COUNTPER_PAGE);
				reviewListBean = (RewardReviewBean)reviewList.get(0);
				
				listCount	=	Integer.parseInt(reviewListBean.getTOTNUM());
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&SEARCH_VALUE="+SEARCH_VALUE, "/rams/reward/reward_review_list.do", listCount);
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", currentPage);
				
				request.setAttribute("SEARCH_VALUE", SEARCH_VALUE);
				
				System.out.println("보상 심의 갯수:::"+reviewList.size());
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_review_list","list", reviewList);
	}
	
	
	// 보상심의 및 사실조사 보기
	public ModelAndView RewardReviewWrite(HttpServletRequest request, HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	reviewFileList	=	null;
		
		RewardReviewViewBean reviewViewBean = new RewardReviewViewBean();
		RewardReviewViewBean discussBean = new RewardReviewViewBean();
		RewardReviewViewBean personBean = new RewardReviewViewBean();
		RewardReviewViewBean resultBean = new RewardReviewViewBean();
		CompeViewBean CompeViewbean = new CompeViewBean();
		
		try{
			if(userId != null)
			{
				System.out.println("보상심의 및 사실조사 등록 보기");
				
				String INVESTID = ServletRequestUtils.getStringParameter(request, "INVESTID", "");
				String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");
				String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");

				System.out.println("보상심의 및 사실조사 등록 보기-INVESTID:"+INVESTID);
				System.out.println("보상심의 및 사실조사 등록 보기-COMPEID:"+COMPEID);
				System.out.println("보상심의 및 사실조사 등록 보기-PNU:"+PNU);
				
				//보상심의
				discussBean = (RewardReviewViewBean)objRewardReviewService.getRewardReviewDiscussView(INVESTID,COMPEID).get(0);
				//보상신청자
				personBean = (RewardReviewViewBean)objRewardReviewService.getRewardReviewPersonView(PNU).get(0);
				//토지
				CompeViewbean = (CompeViewBean)objRewardReviewService.getRewardReviewAreaView(PNU).get(0);
				//심의결과
				resultBean = (RewardReviewViewBean)objRewardReviewService.getRewardReviewResultView(INVESTID,PNU).get(0);

				//심의 파일
				reviewFileList = objRewardReviewService.getRewardReviewFileList(INVESTID);
				
				reviewViewBean.setREQDATE(discussBean.getREQDATE());
				reviewViewBean.setINVESTDATE(discussBean.getINVESTDATE());
				reviewViewBean.setCP_NAME(personBean.getCP_NAME());
				reviewViewBean.setCP_ADDRESS(personBean.getCP_ADDRESS());
				reviewViewBean.setCP_TEL(personBean.getCP_TEL());
				reviewViewBean.setCOMPEYN(resultBean.getCOMPEYN());
				reviewViewBean.setREASON(resultBean.getREASON());				
				
				System.out.println("getREQDATE:"+reviewViewBean.getREQDATE());
				System.out.println("getINVESTDATE:"+reviewViewBean.getINVESTDATE());
				System.out.println("getCP_NAME:"+reviewViewBean.getCP_NAME());
				System.out.println("getCP_ADDRESS:"+reviewViewBean.getCP_ADDRESS());
				System.out.println("getCP_TEL:"+reviewViewBean.getCP_TEL());
				System.out.println("getCOMPEYN:"+reviewViewBean.getCOMPEYN());
				System.out.println("getREASON:"+reviewViewBean.getREASON());
				
				request.setAttribute("filePath",Globals.FILEUPLOADPATH);
				request.setAttribute("discussPath",Globals.DISCUSSFILEPATH);
				
				request.setAttribute("PNU", PNU);
				request.setAttribute("INVESTID", INVESTID);
				request.setAttribute("COMPEID", COMPEID);
				
				request.setAttribute("reviewFileList", reviewFileList);
				request.setAttribute("reviewViewBean", reviewViewBean);
				request.setAttribute("CompeViewbean", CompeViewbean);

			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/reward/reward_review_write");
	}
	
	
	// 보상심의 및 사실조사 등록	
	public ModelAndView RewardReviewWritePrc(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("sessionUserId");
		String msg = "";
		String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");	
		String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");	
		String INVESTID = ServletRequestUtils.getStringParameter(request, "INVESTID", "");
		
		RewardReviewBean writeBean = new RewardReviewBean();

		try {
			if (userId != null) {
				
				String INVESTDATE = StringUtil.removeDash(ServletRequestUtils.getStringParameter(request, "INVESTDATE", ""));	
				String COMPEYN = ServletRequestUtils.getStringParameter(request, "COMPEYN", "");	
				String REASON = ServletRequestUtils.getStringParameter(request, "REASON", "");	
				
				MultipartHttpServletRequest mpRequest = (MultipartHttpServletRequest) request;
				MultipartFile DISCUSS_FILE = mpRequest.getFile("DISCUSS_FILE");
				

				writeBean.setCOMPEID(COMPEID);
				writeBean.setPNU(PNU);
				writeBean.setINVESTID(INVESTID);
				writeBean.setINVESTDATE(INVESTDATE);
				writeBean.setCOMPEYN(COMPEYN);
				writeBean.setREASON(REASON);
				
				System.out.println("seoyes2-getCOMPEID:'"+writeBean.getCOMPEID()+"'");
				System.out.println("seoyes2-getPNU:'"+writeBean.getPNU()+"'");;
				System.out.println("seoyes2-getINVESTID:'"+writeBean.getINVESTID()+"'");
				System.out.println("seoyes2-getINVESTDATE:'"+writeBean.getINVESTDATE()+"'");
				System.out.println("seoyes2-getCOMPEYN:'"+writeBean.getCOMPEYN()+"'");;
				System.out.println("seoyes2-getREASON:'"+writeBean.getREASON()+"'");
				
				try{
					//심의결과 등록
					//objRewardReviewService.setComepensationInsert(writeBean);
					//보상신청물건지 등록
					//objRewardReviewService.setComperesultInsert(writeBean);
					//심의일자 등록
					//objRewardReviewService.setCompeDiscussInsert(writeBean);
					
					//심의결과 수정
					objRewardReviewService.setComepensationUpdate(writeBean);
					//보상신청물건지 수정
					objRewardReviewService.setComperesultUpdate(writeBean);
					//심의일자 수정
					objRewardReviewService.setCompeDiscussUpdate(writeBean);
					
					writeBean.setPATH(Globals.DISCUSSFILEPATH);
					writeBean.setFILENAME(FileUploadUtil.uploadFormFile(DISCUSS_FILE, Globals.FILEUPLOADPATH+Globals.DISCUSSFILEPATH));
					
					//심의자료 추가
					objRewardReviewService.setRewardDiscussFileInsert(writeBean);
					
					msg = "정보가 수정되었습니다.";
				}catch (Exception e) {
					e.printStackTrace();
					msg = "시스템 오류로 저장이 취소되었습니다.";
				}


			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView(
				"redirect:/reward/reward_review_write.do?COMPEID="+ COMPEID + "&PNU="+writeBean.getPNU()+ "&INVESTID="+writeBean.getINVESTID() + "&MSG=" + msg);
	}
	
	
	//RewardDiscussFileDel
	public ModelAndView RewardDiscussFileDel(HttpServletRequest request, HttpServletResponse response) throws Exception {		
		HttpSession session = request.getSession();
		String userId = (String) session.getAttribute("sessionUserId");
		String msg = "";
		String COMPEID = ServletRequestUtils.getStringParameter(request, "COMPEID", "");	
		String PNU = ServletRequestUtils.getStringParameter(request, "PNU", "");	
		String INVESTID = ServletRequestUtils.getStringParameter(request, "INVESTID", "");
		
		RewardReviewBean writeBean = new RewardReviewBean();

		try {
			if (userId != null) {
				
				String FILEID = ServletRequestUtils.getStringParameter(request, "FILEID", "");	

				writeBean.setCOMPEID(COMPEID);
				writeBean.setPNU(PNU);
				writeBean.setINVESTID(INVESTID);
				
				try{
					writeBean.setFILEID(FILEID);
					
					//심의자료 삭제
					objRewardReviewService.setRewardDiscussFileDel(writeBean);
					
					msg = "심의자료가 삭제되었습니다.";
				}catch (Exception e) {
					e.printStackTrace();
					msg = "심의자료 삭제가 실패 하였습니다.";
				}


			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ModelAndView(
				"redirect:/reward/reward_review_write.do?COMPEID="+ COMPEID + "&PNU="+writeBean.getPNU()+ "&INVESTID="+writeBean.getINVESTID() + "&MSG=" + msg);
	}
	

}