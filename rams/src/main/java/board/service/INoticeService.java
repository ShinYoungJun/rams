
package main.java.board.service;

import java.util.List;


import main.java.board.model.NoticeBean;

import org.springframework.dao.DataAccessException;

public interface INoticeService{	
	// 공지사항 조회
	public List getNoticeList(NoticeBean searchBean, String currentPage,String countPerPage);
	// 공지사항 조회 개수
	public int getNoticeListCount(NoticeBean searchBean);
	// 공지사항 입력
	public boolean setNoticeInsert(NoticeBean noticeBean);
	// 공지사항 글보기
	public NoticeBean getNoticeView(String SEQNUM);
	// 공지사항 글삭제
	public boolean setNoticeDelete(String SEQNUM);
	// 공지사항 수정
	public boolean setNoticeUpdate(NoticeBean noticeBean);
	// 공지사항 카운트
	public void setNoticeCntUpdate(String SEQNUM);
}