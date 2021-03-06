package main.java.reward.dao;

import java.util.List;

import main.java.reward.model.RewardReviewBean;

public interface IRewardReviewDao {

	public List getRewardReviewList(RewardReviewBean searchBean,String currentPage,	String countPerPage);
	
	//보상심의
	public List getRewardReviewDiscussView(String INVESTID, String COMPEID);
	
	//보상신청자
	public List getRewardReviewPersonView(String PNU);
	
	//토지
	public List getRewardReviewAreaView(String PNU);
	
	//심의결과
	public List getRewardReviewResultView(String INVESTID, String PNU);	

	public List getRewardReviewFileList(String INVESTID);
	
	public void setComepensationUpdate(RewardReviewBean writeBean);
	
	public void setComperesultUpdate(RewardReviewBean writeBean);
	
	public void setCompeDiscussUpdate(RewardReviewBean writeBean);
	
    //심의자료 추가
	public void setRewardDiscussFileInsert(RewardReviewBean writeBean);
	//심의자료 삭제
	public void setRewardDiscussFileDel(RewardReviewBean writeBean);
}

