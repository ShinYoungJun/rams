package main.java.board.dao;

import java.util.List;

import main.java.board.model.NoticeBean;

public interface INoticeDao {	
	// �������� ��ȸ
	public List getNoticeList(NoticeBean searchBean, String currentPage,String countPerPage);
	// �������� ��ȸ ����
	public int getNoticeListCount(NoticeBean searchBean);
	// �������� �Է�
	public boolean setNoticeInsert(NoticeBean noticeBean);
	// �������� �ۺ���
	public NoticeBean getNoticeView(String SEQNUM);
	// �������� �ۻ���
	public boolean setNoticeDelete(String SEQNUM);
	// �������� ����
	public boolean setNoticeUpdate(NoticeBean noticeBean);
	// �������� ī��Ʈ
	public void setNoticeCntUpdate(String SEQNUM);

}