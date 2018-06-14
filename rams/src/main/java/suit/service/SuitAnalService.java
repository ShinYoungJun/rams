package main.java.suit.service;

import java.util.List;

import main.java.suit.dao.ISuitAnalDao;
import main.java.suit.model.SuitBean;

public class SuitAnalService implements ISuitAnalService {

	private ISuitAnalDao objSuitAnalDao = null;

	public void setSuitAnalDao(ISuitAnalDao newSuitAnalDao) {
		this.objSuitAnalDao = newSuitAnalDao;
	}
	
	
	public List getSuitAnalGuList(String fromDate, String toDate){
		return objSuitAnalDao.getSuitAnalGuList(fromDate,toDate);
	}
	
	public List getSuitAnalLineList(String fromDate, String toDate){
		return objSuitAnalDao.getSuitAnalLineList(fromDate,toDate);
	}
	
}