package main.java.suit.service;

import java.util.List;

import main.java.suit.model.SuitBean;
import main.java.suit.model.SuitFileBean;
import main.java.suit.model.SuitLandBean;
import main.java.suit.model.SuitRegBean;

public interface ISuitPopupService {
	//팝업
	//지분률 변경
	public void setOwnerFixedModify(String ownRate,String affairNum,String ownerNum);
	//제출자료 추가
	public void setFilePopAdd(SuitFileBean bean);
	//제출자료 삭제
	public void setFilePopDel(String affairNum, String fileId);
	//제출자료
	public List getFilePopList(String affairNum);
	//소유자 삭제
	public void setOwnerPopDel(SuitBean bean);
	//소유자 추가
	public void setOwnerPopAdd(SuitBean bean);
	//소유자 목록 조회
	public List getOwnerPopList(String affairNum,String pnu,String isFixed);
	//원고피고 삭제
	public void setSuitorPopDel(SuitBean bean);
	//원고피고 추가
	public void setSuitorPopAdd(SuitBean bean);
	//원고 피고 조회
	public List getPopSuitorList(String affairNum,String gubun);
	//소송번호 체크
    public int getAffairNumCount(String affairNum);
	// 사건번호 변경
	public void setSuitNumChangePrc(SuitRegBean bean);
	//승패 변경
	public void setPopLawsuitResult(SuitBean bean);
	//승패 조회
	public List getPopLawsuitResult(String affairNum);
	//landsuit 삭제
	public void setPopLandSuitDel(String affairNum, String pnu);
	//landsuit 입력
	public void setPopLandSuitInsert(SuitLandBean bean);
	//landsuit 조회
	public List getPopLandSuitList(String affairNum,String pnu);

}
