package main.java.reward.service;

import java.util.List;

import main.java.reward.dao.IRewardStatusDao;
import main.java.reward.model.RewardStatusBean;
import main.java.reward.model.RewardStatusViewBean;

public class RewardStatusService implements IRewardStatusService {

	private IRewardStatusDao objRewardStatusDao = null;
	
	public List getRewardStatusView(String compeId,String pnu,String juminNum){
		return objRewardStatusDao.getRewardStatusView(compeId,pnu,juminNum);
	}

	public void setRewardStatusDao(IRewardStatusDao newRewardStatusDao) {
		this.objRewardStatusDao = newRewardStatusDao;
	}
	
	public List getRewardStatusList(RewardStatusBean searchBean,String currentPage,	String countPerPage){
		return objRewardStatusDao.getRewardStatusList(searchBean,currentPage,countPerPage);
	}
	
	public int getRewardStatusCount(RewardStatusBean searchBean){
		return objRewardStatusDao.getRewardStatusCount(searchBean);
	}
	
    public boolean setRewardStatusUpdate(RewardStatusViewBean searchBean){
    	return objRewardStatusDao.setRewardStatusUpdate(searchBean);
    }

	
}