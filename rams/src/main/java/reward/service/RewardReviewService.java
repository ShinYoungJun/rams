package main.java.reward.service;

import java.util.List;

import main.java.reward.dao.IRewardReviewDao;
import main.java.reward.model.RewardReviewBean;
import main.java.reward.model.RewardReviewWriteBean;

public class RewardReviewService implements IRewardReviewService {

	private IRewardReviewDao objRewardReviewDao = null;

	public void setRewardReviewDao(IRewardReviewDao newRewardReviewDao) {
		this.objRewardReviewDao = newRewardReviewDao;
	}

	public List getRewardReviewList(RewardReviewBean searchBean, String currentPage, String countPerPage) {
		return objRewardReviewDao.getRewardReviewList(searchBean,currentPage,countPerPage);
	}
	
	//보상심의
	public List getRewardReviewDiscussView(String INVESTID, String COMPEID) {
		return objRewardReviewDao.getRewardReviewDiscussView(INVESTID,COMPEID);
	}
	//보상신청자
	public List getRewardReviewPersonView(String PNU) {
		return objRewardReviewDao.getRewardReviewPersonView(PNU);
	}
	//토지
	public List getRewardReviewAreaView(String PNU) {
		return objRewardReviewDao.getRewardReviewAreaView(PNU);
	}
	//심의결과
	public List getRewardReviewResultView(String INVESTID, String PNU) {
		return objRewardReviewDao.getRewardReviewResultView(INVESTID,PNU);
	}
	
	public List getRewardReviewFileList(String INVESTID){
		return objRewardReviewDao.getRewardReviewFileList(INVESTID);
	}
	
	
	public void setComepensationUpdate(RewardReviewBean writeBean) {
		objRewardReviewDao.setComepensationUpdate(writeBean);
	}

	public void setComperesultUpdate(RewardReviewBean writeBean) {
		objRewardReviewDao.setComperesultUpdate(writeBean);
	}
	
	public void setCompeDiscussUpdate(RewardReviewBean writeBean) {
		objRewardReviewDao.setCompeDiscussUpdate(writeBean);
	}
	
	//심의자료 추가
	public void setRewardDiscussFileInsert(RewardReviewBean writeBean){
		objRewardReviewDao.setRewardDiscussFileInsert(writeBean);
	}
	//심의자료 삭제
	public void setRewardDiscussFileDel(RewardReviewBean writeBean){
		objRewardReviewDao.setRewardDiscussFileDel(writeBean);
	}
}