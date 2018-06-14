package main.java.board.service;

import java.util.List;


import main.java.board.dao.INoticeDao;
import main.java.board.model.NoticeBean;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class NoticeService implements INoticeService{

	private	INoticeDao	noticeDao	= null;
	
	public void setNoticeDao(INoticeDao noticeDao) {
	    this.noticeDao = noticeDao;
	}
	
	// 공지사항 조회
	public List getNoticeList(NoticeBean searchBean, String currentPage,String countPerPage){
		return noticeDao.getNoticeList(searchBean, currentPage, countPerPage);
	}
	// 공지사항 조회 개수
	public int getNoticeListCount(NoticeBean searchBean){
		return noticeDao.getNoticeListCount(searchBean);
	}
	// 공지사항 입력
	public boolean setNoticeInsert(NoticeBean noticeBean){
		return noticeDao.setNoticeInsert(noticeBean);
	}
	// 공지사항 글보기
	public NoticeBean getNoticeView(String SEQNUM){
		return noticeDao.getNoticeView(SEQNUM);
	}
	// 공지사항 글삭제
	public boolean setNoticeDelete(String SEQNUM){
		return noticeDao.setNoticeDelete(SEQNUM);
	}
	// 공지사항 수정
	public boolean setNoticeUpdate(NoticeBean noticeBean){
		return noticeDao.setNoticeUpdate(noticeBean);
	}
	// 공지사항 카운트
	public void setNoticeCntUpdate(String SEQNUM){
		noticeDao.setNoticeCntUpdate(SEQNUM);
	}
}
