package main.java.reward.service;

import java.util.List;

import main.java.reward.dao.IRewardPopupDao;
import main.java.reward.model.RewardBean;
import main.java.reward.model.RewardLandBean;

public class RewardPopupService  implements IRewardPopupService {
	
	private IRewardPopupDao objRewardPopupDao = null;

	public void setRewardPopupDao(IRewardPopupDao newRewardPopupDao) {
		this.objRewardPopupDao = newRewardPopupDao;
	}
	
	//landReward ����
	public void setPopLandRewardDel(String affairNum, String pnu){
		objRewardPopupDao.setPopLandRewardDel(affairNum,pnu);
	}
	
	//landReward �Է�
	public void setPopLandRewardInsert(RewardLandBean bean){
		objRewardPopupDao.setPopLandRewardInsert(bean);
	}
	//landReward ��ȸ
	public List getPopLandRewardList(String affairNum,String pnu){
		return objRewardPopupDao.getPopLandRewardList(affairNum,pnu);
	}
	
	public List getRewardOwnPopList(RewardBean searchBean, String currentPage, String countPerPage, String ownGubun) {
		return objRewardPopupDao.getRewardOwnPopList(searchBean,currentPage,countPerPage,ownGubun);
	}
}
