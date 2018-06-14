
package main.java.board.service;

import java.util.List;

import main.java.board.model.BoardBean;

import org.springframework.dao.DataAccessException;

public interface IBoardService{	
    //	게시판 조회
    public List getBoardList(BoardBean searchBean,String currentPage,String countPerPage);
    //  게시판 조회 개수
    public int getBoardListCount(BoardBean searchBean);
    //  게시판 입력
    public boolean setBoardInsert(BoardBean boardBean);
    //	게시판 글보기
    public BoardBean getBoardView(String SEQNUM);
    //	게시판 글삭제
    public boolean setBoardDelete(String SEQNUM);
    //  게시판 수정
    public boolean setBoardUpdate(BoardBean boardBean);
    //  게시판 카운트
    public void setBoardCntUpdate(String SEQNUM);
}