package main.java.suit.service;

import java.util.List;

import main.java.suit.dao.ISuitPriceDao;
import main.java.suit.model.SuitPriceBean;

public class SuitPriceService implements ISuitPriceService {

	private ISuitPriceDao objSuitPriceDao = null;

	public void setSuitPriceDao(ISuitPriceDao newSuitPriceDao) {
		this.objSuitPriceDao = newSuitPriceDao;
	}
	
	public List getSuitPriceList(SuitPriceBean searchBean, String currentPage, String countPerPage){
		return objSuitPriceDao.getSuitPriceList(searchBean, currentPage, countPerPage);
	}
	
	public int getSuitPriceCount(SuitPriceBean searchBean){
		return objSuitPriceDao.getSuitPriceCount(searchBean);
	}
	
	public List getSuitPriceView(String affairNum,String pnu){
		return objSuitPriceDao.getSuitPriceView(affairNum, pnu);
	}
	
	public List getSuitPriceViewList(String affairNum,String pnu){
		return objSuitPriceDao.getSuitPriceViewList(affairNum, pnu);
	}
	
	
	public void setSuitPriceViewModify(String lawsuitPrice,String unfairProfit,String affairNum){
		objSuitPriceDao.setSuitPriceViewModify(lawsuitPrice,unfairProfit, affairNum);
	}
	public void setSuitPriceViewListReCal(String unfairProfit,String affairNum,String pnu){
		objSuitPriceDao.setSuitPriceViewListReCal(unfairProfit,affairNum, pnu);
	}
	
	public void setSuitPriceViewListModify(SuitPriceBean bean){
		objSuitPriceDao.setSuitPriceViewListModify(bean);
	}
	
	public void setSuitPriceViewListAdd(SuitPriceBean bean){
		objSuitPriceDao.setSuitPriceViewListAdd(bean);
	}
	
	public void setSuitPriceViewListRemove(String affairNum, String pnu, String lawsuitSeq){
		objSuitPriceDao.setSuitPriceViewListRemove(affairNum,pnu,lawsuitSeq);
	}
	
}