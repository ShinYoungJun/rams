package main.java.suit.dao;

import java.util.List;

import main.java.admin.model.UserBean;
import main.java.suit.model.SuitBean;
import main.java.suit.model.SuitLandBean;
import main.java.suit.model.SuitRegBean;

public interface ISuitDao {
	
	//소송정보 수정 LawSuitProxy
	public void setLawSuitProxyModify(SuitBean bean);
	// LawSuitProxy 존재여부 조사
	public int getLawSuitProxyCount(String affairNum,String gubun);
	//소송정보 수정 Suitor
	public void setSuitorModify(SuitBean bean);
	//원고피고 존재여부 조사
	public int getSuitorCount(String affairNum,String gubun);
	//소송정보 수정 lawsuit
	public void setLawSuitModify(SuitBean bean);
	//소송정보 수정 landsuit
	public void setLandSuitModify(SuitBean bean);
	//소송 수정화면 조회
	public List GetLawSuitModify(String affairNum,String pnu);
	public void setLawSuitCopy(SuitRegBean bean);
	public void setLawSuitRelationCopy(SuitRegBean bean);
	
	public List getSuitFileList(String affairNum);
	public List getSuitRegList(SuitRegBean searchBean,String currentPage,	String countPerPage);
    public int getSuitRegListCount(SuitRegBean searchBean);
	//소송번호 체크
    public int getAffairNumCount(String affairNum);
    // 소송정보 등록
	public void setLawSuitInsert(SuitRegBean bean);
	public void setLandLawSuitInsert(SuitRegBean bean);
	public void setSuitorInsert(SuitRegBean bean); 
	public void setLawSuitProxyInsert(SuitRegBean bean);
	public void setOwnerInsert(SuitRegBean bean);
	

	public List getSuitList(SuitBean searchBean,String currentPage,	String countPerPage);
	public List getSuitListExcel(SuitBean searchBean);
	public int getSuitCount(SuitBean searchBean);
	public List getSuitView(String affairNum,String pnu);
	


}

