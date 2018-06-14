package main.java.reward.service;

import java.util.List;

import main.java.reward.dao.IRewardDao;
import main.java.reward.model.CompeFileBean;
import main.java.reward.model.CompeViewBean;
import main.java.reward.model.CompeWriteBean;
import main.java.reward.model.RewardBean;

public class RewardService implements IRewardService {

	private IRewardDao objRewardDao = null;

	public void setRewardDao(IRewardDao newRewardDao) {
		this.objRewardDao = newRewardDao;
	}
	
	public List getRewardList(RewardBean searchBean,String currentPage,	String countPerPage){
		return objRewardDao.getRewardList(searchBean,currentPage,countPerPage);
	}
	
	public int getRewardCount(RewardBean searchBean){
		return objRewardDao.getRewardCount(searchBean);
	}
	
	public int getRewardCompenCount(RewardBean searchBean){
		return objRewardDao.getRewardCompenCount(searchBean);
	}
	
	public List getComepeFileList(String compeId){
		return objRewardDao.getComepeFileList(compeId);
	}
	
	public List getComepeView(String compeId,String pnu){
		return objRewardDao.getComepeView(compeId,pnu);
	}
	
	public void setComepePersonUpdate(CompeWriteBean viewBean) {
		objRewardDao.setComepePersonUpdate(viewBean);
	}

	public void setComepeReQUpdate(CompeWriteBean viewBean) {
		objRewardDao.setComepeReQUpdate(viewBean);
	}

	public void setComepensationUpdate(CompeWriteBean viewBean) {
		objRewardDao.setComepensationUpdate(viewBean);
	}
	
	public void setComepeJudge1Update(CompeWriteBean writeBean) {
		objRewardDao.setComepeJudge1Update(writeBean);
	}

	public void setComepeJudge2Update(CompeWriteBean writeBean) {
		objRewardDao.setComepeJudge2Update(writeBean);
	}
	
	public void setComepePersonInsert(CompeWriteBean writeBean) {
		objRewardDao.setComepePersonInsert(writeBean);	
	}

	public void setComepeReQInsert(CompeWriteBean writeBean) {
		objRewardDao.setComepeReQInsert(writeBean);	
	}

	public void setComepensationInsert(CompeWriteBean writeBean) {
		objRewardDao.setComepensationInsert(writeBean);	
	}
		
	public void setComepeJudge1Insert(CompeWriteBean writeBean) {
		objRewardDao.setComepeJudge1Insert(writeBean);	
	}
	
	public void setComepeJudge2Insert(CompeWriteBean writeBean) {
		objRewardDao.setComepeJudge2Insert(writeBean);	
	}
	
	public List getGongsiList(RewardBean searchBean,String currentPage,	String countPerPage){
		return objRewardDao.getGongsiList(searchBean,currentPage,countPerPage);
	}
	
	public List getComepeAreaView(String compeId){
		return objRewardDao.getComepeAreaView(compeId);
	}
	
	public List getCompeId(){
		return objRewardDao.getCompeId();
	}

	public List geJimokList(String Code){
		return objRewardDao.geJimokList(Code);
	} 
	
	public List getRewardRightView(String compeId){
		return objRewardDao.getRewardRightView(compeId);
	}
	
    //관련자료 추가
	public void setRewardCompeFileInsert(CompeFileBean bean){
		objRewardDao.setRewardCompeFileInsert(bean);	
	}
	//관련자료 삭제
	public void setRewardCompeFileDel(CompeFileBean bean){
		objRewardDao.setRewardCompeFileDel(bean);	
	}
}