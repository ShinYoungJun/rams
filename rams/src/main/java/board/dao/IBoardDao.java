package main.java.board.dao;
import java.util.List;
import java.util.Map;

import main.java.board.model.BoardBean;

import org.springframework.dao.DataAccessException;

public interface IBoardDao {	
    //	�Խ��� ��ȸ
    public List getBoardList(BoardBean searchBean,String currentPage,String countPerPage);
    //  �Խ��� ��ȸ ����
    public int getBoardListCount(BoardBean searchBean);
    //  �Խ��� �Է�
    public boolean setBoardInsert(BoardBean boardBean);
    //	�Խ��� �ۺ���
    public BoardBean getBoardView(String SEQNUM);
    //	�Խ��� �ۻ���
    public boolean setBoardDelete(String SEQNUM);
    //  �Խ��� ����
    public boolean setBoardUpdate(BoardBean boardBean);
    //  �Խ��� ī��Ʈ
    public void setBoardCntUpdate(String SEQNUM);
}