package main.java.suit.service;

import java.util.List;

import main.java.suit.dao.ISuitPopupDao;
import main.java.suit.model.SuitBean;
import main.java.suit.model.SuitFileBean;
import main.java.suit.model.SuitLandBean;
import main.java.suit.model.SuitRegBean;

public class SuitPopupService implements ISuitPopupService {

	private ISuitPopupDao objSuitPopupDao = null;

	public void setSuitPopupDao(ISuitPopupDao newSuitPopupDao) {
		this.objSuitPopupDao = newSuitPopupDao;
	}
	
	//팝업
	//지분률 변경
	public void setOwnerFixedModify(String ownRate,String affairNum,String ownerNum){
		objSuitPopupDao.setOwnerFixedModify(ownRate,affairNum,ownerNum);
	}
	//제출자료 추가
	public void setFilePopAdd(SuitFileBean bean){
		objSuitPopupDao.setFilePopAdd(bean);
	}
	//제출자료 삭제
	public void setFilePopDel(String affairNum, String fileId){
		objSuitPopupDao.setFilePopDel(affairNum,fileId);
	}
	//제출자료
	public List getFilePopList(String affairNum){
		return objSuitPopupDao.getFilePopList(affairNum);
	}
	//소유자 삭제
	public void setOwnerPopDel(SuitBean bean){
		objSuitPopupDao.setOwnerPopDel(bean);
	}
	//소유자 추가
	public void setOwnerPopAdd(SuitBean bean){
		objSuitPopupDao.setOwnerPopAdd(bean);
	}
	//소유자 목록 조회
	public List getOwnerPopList(String affairNum,String pnu,String isFixed){
		return objSuitPopupDao.getOwnerPopList(affairNum,pnu,isFixed);
	}
	//원고피고 삭제
	public void setSuitorPopDel(SuitBean bean){
		objSuitPopupDao.setSuitorPopDel(bean);
	}
	//원고피고 추가
	public void setSuitorPopAdd(SuitBean bean){
		objSuitPopupDao.setSuitorPopAdd(bean);
	}
	//원고 피고 조회
	public List getPopSuitorList(String affairNum,String gubun){
		return objSuitPopupDao.getPopSuitorList(affairNum,gubun);
	}
	//소송번호 체크
    public int getAffairNumCount(String affairNum){
    	return objSuitPopupDao.getAffairNumCount(affairNum);
    }
	// 사건번호 변경
	public void setSuitNumChangePrc(SuitRegBean bean){
		objSuitPopupDao.setSuitNumChangePrc(bean);
	}
	//승패 변경
	public void setPopLawsuitResult(SuitBean bean){
		objSuitPopupDao.setPopLawsuitResult(bean);
	}
	//승패 조회
	public List getPopLawsuitResult(String affairNum){
		return objSuitPopupDao.getPopLawsuitResult(affairNum);
	}
	
	//landsuit 삭제
	public void setPopLandSuitDel(String affairNum, String pnu){
		objSuitPopupDao.setPopLandSuitDel(affairNum,pnu);
	}
	
	//landsuit 입력
	public void setPopLandSuitInsert(SuitLandBean bean){
		objSuitPopupDao.setPopLandSuitInsert(bean);
	}
	//landsuit 조회
	public List getPopLandSuitList(String affairNum,String pnu){
		return objSuitPopupDao.getPopLandSuitList(affairNum,pnu);
	}
}