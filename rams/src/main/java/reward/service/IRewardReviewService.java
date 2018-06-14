package main.java.reward.service;

import java.util.List;

import main.java.reward.model.CompeWriteBean;
import main.java.reward.model.RewardReviewBean;
import main.java.reward.model.RewardReviewWriteBean;

public interface IRewardReviewService {

	public List getRewardReviewList(RewardReviewBean searchBean,String currentPage,	String countPerPage);
	
	//�������
	public List getRewardReviewDiscussView(String INVESTID, String COMPEID);
	
	//�����û��
	public List getRewardReviewPersonView(String PNU);
	
	//����
	public List getRewardReviewAreaView(String COMPEID);
	
	//���ǰ��
	public List getRewardReviewResultView(String INVESTID, String PNU);

	public List getRewardReviewFileList(String INVESTID);
	
	public void setComepensationUpdate(RewardReviewBean writeBean);
	
	public void setComperesultUpdate(RewardReviewBean writeBean);
	
	public void setCompeDiscussUpdate(RewardReviewBean writeBean);
	
	//�����ڷ� �߰�
	public void setRewardDiscussFileInsert(RewardReviewBean writeBean);
	//�����ڷ� ����
	public void setRewardDiscussFileDel(RewardReviewBean writeBean);
}