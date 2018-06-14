package main.java.board.web;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.model.UserBean;
import main.java.board.model.NoticeBean;
import main.java.board.service.INoticeService;
import main.java.common.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class NoticeControl extends MultiActionController {

	private INoticeService 		noticeService 	= null;	
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	public void setNoticeService(INoticeService noticeService) {
		this.noticeService = noticeService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	// �������� ����Ʈ ��ȸ
	public ModelAndView noticeList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	list	=	null;
		

		try{
			if(userId != null)
			{
				System.out.println("�������� ��ȸ");
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	������ �����͸� �����´�.
				UserBean	userBean	= new UserBean();
				
				NoticeBean searchBean = new NoticeBean();
				
				String currentPage = ServletRequestUtils.getStringParameter(request, "currentPage", Globals.DEFAULT_CURRENT_PAGE);
				
				String SEARCH_DATA = ServletRequestUtils.getStringParameter(request, "SEARCH_DATA", "");
				String SEARCH_TERM1 = ServletRequestUtils.getStringParameter(request, "SEARCH_TERM1", "");
				String SEARCH_TERM2 = ServletRequestUtils.getStringParameter(request, "SEARCH_TERM2", "");
				String SEARCH_TERM3 = ServletRequestUtils.getStringParameter(request, "SEARCH_TERM3", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				
				
				searchBean.setSEARCH_DATA(SEARCH_DATA.equals("")?"%":"%"+SEARCH_DATA+"%");
				searchBean.setSEARCH_TERM1(SEARCH_TERM1.equals("")?"%":searchBean.getSEARCH_DATA());
				searchBean.setSEARCH_TERM2(SEARCH_TERM2.equals("")?"%":searchBean.getSEARCH_DATA());
				searchBean.setSEARCH_TERM3(SEARCH_TERM3.equals("")?"%":searchBean.getSEARCH_DATA());
				
				int listCount = noticeService.getNoticeListCount(searchBean);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&SEARCH_DATA="+SEARCH_DATA+"&SEARCH_TERM1="+SEARCH_TERM1+"&SEARCH_TERM2="+SEARCH_TERM2
						+"&SEARCH_TERM3="+SEARCH_TERM3, "/rams/board/notice_list.do", listCount);
				
				request.setAttribute("strPageDivideForm", strPageDivideForm);
				request.setAttribute("listCount", String.valueOf(listCount));
				request.setAttribute("currentPage", currentPage);
				
				request.setAttribute("SEARCH_DATA", SEARCH_DATA);
				request.setAttribute("SEARCH_TERM1", SEARCH_TERM1.equals("")?"":"checked");
				request.setAttribute("SEARCH_TERM2", SEARCH_TERM2.equals("")?"":"checked");
				request.setAttribute("SEARCH_TERM3", SEARCH_TERM3.equals("")?"":"checked");
				
				
				int totalPageNum = listCount/Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE)+
									(listCount%Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE) != 0?1:0);
				request.setAttribute("totalPageNum", String.valueOf(totalPageNum));
				
				
				request.setAttribute("MSG", MSG);
				
				list = noticeService.getNoticeList(searchBean,currentPage,Globals.DEFAULT_COUNTPER_PAGE);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/board/notice_list","nlist", list);
	}
	
	// �������� �ۼ� �� ����
	public ModelAndView noticeWrite(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// ���� ����
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		List	list	=	null;
		NoticeBean noticeBean = new NoticeBean();


		try{
			if(userId != null)
			{
				String userName = (String)session.getAttribute("sessionName");				
				String MODE = ServletRequestUtils.getStringParameter(request, "MODE", "view");
				String SEQNUM = ServletRequestUtils.getStringParameter(request, "SEQNUM", "");
				
				
				request.setAttribute("userName", userName);
				request.setAttribute("userId", userId);
				request.setAttribute("MODE", MODE);
				request.setAttribute("SEQNUM", SEQNUM);
				
				if(MODE.equals("modify")){
					noticeBean = noticeService.getNoticeView(SEQNUM);
					if(!noticeBean.getUSERID().equals(userId)){
						//�������� ����
						return new ModelAndView("redirect:/board/notice_view.do?SEQNUM="+SEQNUM+"&MSG=������ �����ϴ�.");
					}else{
						//����
						return new ModelAndView("/board/notice_write","notice", noticeBean);
					}
				}else{
					//ó���ۼ�
					return new ModelAndView("/board/notice_write","notice", noticeBean);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	// �������� �� �ۼ� �� ���� �Ϸ�
	public ModelAndView noticeWritePrc(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String msg = "";

		NoticeBean noticeBean = new NoticeBean();

		try{
			if(userId != null)
			{
				String MODE = ServletRequestUtils.getStringParameter(request, "MODE", "");
				
				bind(request, noticeBean);
				
				if(MODE.equals("modify")){
					if(noticeService.setNoticeUpdate(noticeBean)){
						msg = "������ ���� ����Ǿ����ϴ�.";
					}else{
						msg = "�ý��� ������ ������ ��ҵǾ����ϴ�.";
					}
					
					return new ModelAndView("redirect:/board/notice_view.do?SEQNUM="+noticeBean.getSEQNUM()+"&MSG="+msg);
					
				}else{
					// �������� �� ����
					if(noticeService.setNoticeInsert(noticeBean)){
						msg = "�ۼ��� ���� ����Ǿ����ϴ�.";
					}else{
						msg = "�ý��� ������ ������ ��ҵǾ����ϴ�.";
					}
				}
				

				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/board/notice_list.do?MSG="+msg);
	}
	
	// �������� ����
	public ModelAndView noticeView(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// ���� ����
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		NoticeBean noticeBean = new NoticeBean();

		try{
			if(userId != null)
			{
				String SEQNUM = ServletRequestUtils.getStringParameter(request, "SEQNUM", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				System.out.println("�������� �󼼺��� :: "+SEQNUM);
				
				noticeBean = noticeService.getNoticeView(SEQNUM);
				noticeService.setNoticeCntUpdate(SEQNUM);
				
				request.setAttribute("MSG", MSG);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/board/notice_view","notice", noticeBean);
	}
	
	// �������� �� ����
	public ModelAndView noticeDelete(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String msg = "";

		NoticeBean noticeBean = new NoticeBean();

		try{
			if(userId != null)
			{
				String SEQNUM = ServletRequestUtils.getStringParameter(request, "SEQNUM", "");
				System.out.println("�������� �� ���� :: "+SEQNUM);
				
				
				// �������� �� ����
				if(noticeService.setNoticeDelete(SEQNUM)){
					msg = "���������� �������� ���� ���� �Ǿ����ϴ�.";
				}else{
					msg = "�ý��� ������ ������ ��ҵǾ����ϴ�.";
				}
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/board/notice_list.do?MSG="+msg);
	}
	
}