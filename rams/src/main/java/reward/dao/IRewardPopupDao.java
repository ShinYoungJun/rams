package main.java.reward.dao;

import java.util.List;

import main.java.reward.model.RewardBean;
import main.java.reward.model.RewardLandBean;

public interface IRewardPopupDao {
	//landReward ����
	public void setPopLandRewardDel(String compeId, String pnu);
	//landReward �Է�
	public void setPopLandRewardInsert(RewardLandBean bean);
	//landReward ��ȸ
	public List getPopLandRewardList(String compeId, String pnu);
	
	public List getRewardOwnPopList(RewardBean searchBean, String currentPage, String countPerPage, String ownGubun);
}
