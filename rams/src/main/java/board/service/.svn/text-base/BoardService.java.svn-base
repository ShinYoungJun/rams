package main.java.board.service;

import java.util.List;


import main.java.board.dao.BoardDao;
import main.java.board.dao.IBoardDao;
import main.java.board.model.BoardBean;

import org.springframework.web.servlet.mvc.multiaction.MultiActionController;


public class BoardService implements IBoardService{

	private	IBoardDao	boardDao	= null;
	
	public void setBoardDao(IBoardDao boardDao) {
	    this.boardDao = boardDao;
	}
	
    //	게시판 조회
    public List getBoardList(BoardBean searchBean,String currentPage,String countPerPage)
    {
    	return boardDao.getBoardList(searchBean,currentPage,countPerPage);
    }
    //  게시판 조회 개수
    public int getBoardListCount(BoardBean searchBean)
    {
		return boardDao.getBoardListCount(searchBean);
	}
    //  게시판 입력
    public boolean setBoardInsert(BoardBean boardBean){
    	return boardDao.setBoardInsert(boardBean);
    }
    //	게시판 글보기
    public BoardBean getBoardView(String SEQNUM){
    	return boardDao.getBoardView(SEQNUM);
    }
    
    //	게시판 글삭제
    public boolean setBoardDelete(String SEQNUM){
    	return boardDao.setBoardDelete(SEQNUM);
    }
    
    //  게시판 수정
    public boolean setBoardUpdate(BoardBean boardBean){
    	return boardDao.setBoardUpdate(boardBean);
    }
    
    //  게시판 카운트
    public void setBoardCntUpdate(String SEQNUM){
    	boardDao.setBoardCntUpdate(SEQNUM);
    }
	

	
}
