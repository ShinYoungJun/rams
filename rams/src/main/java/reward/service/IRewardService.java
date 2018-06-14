package main.java.reward.service;

import java.util.List;

import main.java.admin.model.UserBean;
import main.java.reward.model.CompeFileBean;
import main.java.reward.model.CompeViewBean;
import main.java.reward.model.CompeWriteBean;
import main.java.reward.model.RewardBean;

public interface IRewardService {

	public List getRewardList(RewardBean searchBean,String currentPage,	String countPerPage);
	public int getRewardCount(RewardBean searchBean);
	public int getRewardCompenCount(RewardBean searchBean);
	public List getComepeFileList(String compeId);
	public List getComepeView(String compeId,String pnu);
	
	public void setComepePersonUpdate(CompeWriteBean writeBean);
	public void setComepeReQUpdate(CompeWriteBean writeBean);
	public void setComepensationUpdate(CompeWriteBean writeBean);
	public void setComepeJudge1Update(CompeWriteBean writeBean);
	public void setComepeJudge2Update(CompeWriteBean writeBean);
	
	public void setComepePersonInsert(CompeWriteBean writeBean);
	public void setComepeReQInsert(CompeWriteBean writeBean);
	public void setComepensationInsert(CompeWriteBean writeBean);
	public void setComepeJudge1Insert(CompeWriteBean writeBean);
	public void setComepeJudge2Insert(CompeWriteBean writeBean);

	public List getGongsiList(RewardBean searchBean,String currentPage,	String countPerPage);
	public List getComepeAreaView(String compeId);
	public List getCompeId();
	public List geJimokList(String Code);
	public List getRewardRightView(String compeId);
	
    //관련자료 추가
	public void setRewardCompeFileInsert(CompeFileBean bean);
	//관련자료 삭제
	public void setRewardCompeFileDel(CompeFileBean bean);
	
}