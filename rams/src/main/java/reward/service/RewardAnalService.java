package main.java.reward.service;

import java.util.List;

import main.java.reward.dao.IRewardAnalDao;


public class RewardAnalService implements IRewardAnalService {

	private IRewardAnalDao objRewardAnalDao = null;

	public void setRewardAnalDao(IRewardAnalDao newRewardAnalDao) {
		this.objRewardAnalDao = newRewardAnalDao;
	}
	
	public List getRewardAnalList(String fromReqDate, String toReqDate,String fromRegistDate, String toRegistDate){
		return objRewardAnalDao.getRewardAnalList(fromReqDate, toReqDate, fromRegistDate, toRegistDate);
	}
	
	public List getRewardOwnList(String fromReqDate, String toReqDate,String fromRegistDate, String toRegistDate){
		return objRewardAnalDao.getRewardOwnList(fromReqDate, toReqDate, fromRegistDate, toRegistDate);
	}
	
}