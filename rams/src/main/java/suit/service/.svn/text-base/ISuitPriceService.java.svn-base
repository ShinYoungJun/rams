package main.java.suit.service;

import java.util.List;

import main.java.suit.model.SuitPriceBean;

public interface ISuitPriceService {
	public List getSuitPriceList(SuitPriceBean searchBean, String currentPage, String countPerPage);
	public int getSuitPriceCount(SuitPriceBean searchBean);
	public List getSuitPriceView(String affairNum,String pnu);
	public List getSuitPriceViewList(String affairNum,String pnu);

	public void setSuitPriceViewModify(String lawsuitPrice,String unfairProfit,String affairNum);
	public void setSuitPriceViewListReCal(String unfairProfit,String affairNum,String pnu);
	public void setSuitPriceViewListModify(SuitPriceBean bean);
	public void setSuitPriceViewListAdd(SuitPriceBean bean);
	
	public void setSuitPriceViewListRemove(String affairNum, String pnu, String lawsuitSeq);
}