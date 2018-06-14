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
	
    //	�Խ��� ��ȸ
    public List getBoardList(BoardBean searchBean,String currentPage,String countPerPage)
    {
    	return boardDao.getBoardList(searchBean,currentPage,countPerPage);
    }
    //  �Խ��� ��ȸ ����
    public int getBoardListCount(BoardBean searchBean)
    {
		return boardDao.getBoardListCount(searchBean);
	}
    //  �Խ��� �Է�
    public boolean setBoardInsert(BoardBean boardBean){
    	return boardDao.setBoardInsert(boardBean);
    }
    //	�Խ��� �ۺ���
    public BoardBean getBoardView(String SEQNUM){
    	return boardDao.getBoardView(SEQNUM);
    }
    
    //	�Խ��� �ۻ���
    public boolean setBoardDelete(String SEQNUM){
    	return boardDao.setBoardDelete(SEQNUM);
    }
    
    //  �Խ��� ����
    public boolean setBoardUpdate(BoardBean boardBean){
    	return boardDao.setBoardUpdate(boardBean);
    }
    
    //  �Խ��� ī��Ʈ
    public void setBoardCntUpdate(String SEQNUM){
    	boardDao.setBoardCntUpdate(SEQNUM);
    }
	

	
}
