package main.java.reward.service;

import java.util.List;

import main.java.reward.model.RewardBean;
import main.java.reward.model.RewardLandBean;

public interface IRewardPopupService {
	//landReward 삭제
	public void setPopLandRewardDel(String affairNum, String pnu);
	//landReward 입력
	public void setPopLandRewardInsert(RewardLandBean bean);
	//landReward 조회
	public List getPopLandRewardList(String affairNum,String pnu);

	public List getRewardOwnPopList(RewardBean searchBean, String currentPage, String countPerPage, String ownGubun);
}
