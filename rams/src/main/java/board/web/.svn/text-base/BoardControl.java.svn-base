package main.java.board.web;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import main.java.admin.model.UserBean;
import main.java.board.model.BoardBean;
import main.java.board.service.IBoardService;
import main.java.common.service.CommonCodeService;
import main.java.common.util.BoardUtil;
import main.java.common.util.Globals;
import main.java.common.util.catUtil.Pageing;
import main.java.common.util.catUtil.Util;

import org.springframework.web.bind.ServletRequestUtils;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class BoardControl extends MultiActionController {

	private IBoardService 		boardService 	= null;	
	private	CommonCodeService	commonCode		= null;	
	private	Util				util			= new Util();
	private	Pageing				pageing			= new Pageing();
	
	public void setBoardService(IBoardService boardService) {
		this.boardService = boardService;
	}
	
	public void setCommonCodeService(CommonCodeService commonCode) 
	{
		this.commonCode 	= commonCode;
	}
	
	// 게시판 리스트 조회
	public ModelAndView boardList(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 		userAuthur	= (String)session.getAttribute("sessionAuthur");
		request.setAttribute("userAuthur", userAuthur);
		List	list	=	null;
		

		try{
			if(userId != null)
			{
				System.out.println("게시판 조회");
				String	SIDO_CD	= util.getSidoCode(getMessageSourceAccessor());
				
				//	관리자 데이터를 가져온다.
				UserBean	userBean	= new UserBean();
				
				BoardBean searchBean = new BoardBean();
				
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
				
				int listCount = boardService.getBoardListCount(searchBean);
				
				String strPageDivideForm = BoardUtil.getDividePageForm(Integer.parseInt(currentPage),Integer.valueOf(Globals.DEFAULT_COUNTPER_PAGE),
						"&SEARCH_DATA="+SEARCH_DATA+"&SEARCH_TERM1="+SEARCH_TERM1+"&SEARCH_TERM2="+SEARCH_TERM2
						+"&SEARCH_TERM3="+SEARCH_TERM3, "/rams/board/board_list.do", listCount);
				
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
				
				list = boardService.getBoardList(searchBean,currentPage,Globals.DEFAULT_COUNTPER_PAGE);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/board/board_list","blist", list);
	}
	
	// 게시판 작성 및 수정
	public ModelAndView boardWrite(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// 삭제 세션
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 		userAuthur	= (String)session.getAttribute("sessionAuthur");
		request.setAttribute("userAuthur", userAuthur);
		List	list	=	null;
		BoardBean boardBean = new BoardBean();


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
					boardBean = boardService.getBoardView(SEQNUM);
					if(!boardBean.getREGISID().equals(userId)){
						//수정권한 없음
						return new ModelAndView("redirect:/board/board_view.do?SEQNUM="+SEQNUM+"&MSG=권한이 없습니다.");
					}else{
						//수정
						return new ModelAndView("/board/board_write","board", boardBean);
					}
				}else{
					//처음작성
					return new ModelAndView("/board/board_write","board", boardBean);
				}
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	// 게시판 글 작성 및 수정 완료
	public ModelAndView boardWritePrc(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 		userAuthur	= (String)session.getAttribute("sessionAuthur");
		request.setAttribute("userAuthur", userAuthur);
		String msg = "";

		BoardBean boardBean = new BoardBean();

		try{
			if(userId != null)
			{
				String MODE = ServletRequestUtils.getStringParameter(request, "MODE", "");
				
				bind(request, boardBean);
				
				if(MODE.equals("modify")){
					if(boardService.setBoardUpdate(boardBean)){
						msg = "수정된 글이 저장되었습니다.";
					}else{
						msg = "시스템 오류로 저장이 취소되었습니다.";
					}
					
					return new ModelAndView("redirect:/board/board_view.do?SEQNUM="+boardBean.getSEQNUM()+"&MSG="+msg);
					
				}else{
					// 게시판 글 생성
					if(boardService.setBoardInsert(boardBean)){
						msg = "작성한 글이 저장되었습니다.";
					}else{
						msg = "시스템 오류로 저장이 취소되었습니다.";
					}
				}
				

				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/board/board_list.do?MSG="+msg);
	}
	
	// 게시판 보기
	public ModelAndView boardView(HttpServletRequest request,HttpServletResponse response) throws Exception {
		// 삭제 세션
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 		userAuthur	= (String)session.getAttribute("sessionAuthur");
		request.setAttribute("userAuthur", userAuthur);
		BoardBean boardBean = new BoardBean();

		try{
			if(userId != null)
			{
				String SEQNUM = ServletRequestUtils.getStringParameter(request, "SEQNUM", "");
				String MSG = ServletRequestUtils.getStringParameter(request, "MSG", "");
				System.out.println("게시판 상세보기 :: "+SEQNUM);
				
				boardBean = boardService.getBoardView(SEQNUM);
				boardService.setBoardCntUpdate(SEQNUM);
				
				request.setAttribute("MSG", MSG);
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("/board/board_view","board", boardBean);
	}
	
	// 게시판 글 삭제
	public ModelAndView boardDelete(HttpServletRequest request,HttpServletResponse response) throws Exception {
		HttpSession session = request.getSession();
		String 		userId	= (String)session.getAttribute("sessionUserId");
		String 		userAuthur	= (String)session.getAttribute("sessionAuthur");
		request.setAttribute("userAuthur", userAuthur);
		String msg = "";

		BoardBean boardBean = new BoardBean();

		try{
			if(userId != null)
			{
				String SEQNUM = ServletRequestUtils.getStringParameter(request, "SEQNUM", "");
				System.out.println("게시판 글 삭제 :: "+SEQNUM);
				
				
				// 게시판 글 생성
				if(boardService.setBoardDelete(SEQNUM)){
					msg = "성공적으로 게시판 글이 삭제 되었습니다.";
				}else{
					msg = "시스템 오류로 삭제가 취소되었습니다.";
				}
				
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		return new ModelAndView("redirect:/board/board_list.do?MSG="+msg);
	}
	
}