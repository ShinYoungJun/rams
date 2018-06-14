package main.java.reward.service;

import java.util.List;

import main.java.board.model.BoardBean;
import main.java.reward.model.RewardStatusBean;
import main.java.reward.model.RewardStatusViewBean;

public interface IRewardStatusService {
	
	public List getRewardStatusView(String compeId,String pnu,String juminNum);
	public List getRewardStatusList(RewardStatusBean searchBean,String currentPage,	String countPerPage);
	public int getRewardStatusCount(RewardStatusBean searchBean);
    public boolean setRewardStatusUpdate(RewardStatusViewBean searchBean);
}