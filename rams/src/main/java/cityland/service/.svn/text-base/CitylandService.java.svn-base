package main.java.cityland.service;

import java.util.List;

import main.java.cityland.dao.ICitylandDao;
import main.java.cityland.model.CitylandBean;

public class CitylandService implements ICitylandService {
	
	private ICitylandDao objCitylandDao = null;
	
	
	public void setCitylandDao(ICitylandDao newCitylandDao) {
		this.objCitylandDao = newCitylandDao;
	}
	
	
	//대부사용허가 리스트 조회
	public List getPermissList(CitylandBean searchBean){
		return objCitylandDao.getPermissList(searchBean);
	}
	
	//처분재산 리스트 조회
	public List getDisList(CitylandBean searchBean){
		return objCitylandDao.getDisList(searchBean);
	}
	
	//무단점용 리스트 조회
	public List getMoodanList(CitylandBean searchBean){
		return objCitylandDao.getMoodanList(searchBean);
	}
	
	//재산정보 리스트 조회
	public List getBaseList(CitylandBean searchBean){
		return objCitylandDao.getBaseList(searchBean);
	}
	
	//재산이력 리스트 조회
	public List getHistoryList(CitylandBean searchBean){
		return objCitylandDao.getHistoryList(searchBean);
	}
	
	//재산이력 상세 리스트 조회
	public List getHistoryDetailList(String PP_SN){
		return objCitylandDao.getHistoryDetailList(PP_SN);
	}
	
	//재산구분코드
	public List getPermissCode(){
		return objCitylandDao.getPermissCode() ;
	}
	
	//재산용도구분코드
	public List getUseCode(){
		return objCitylandDao.getUseCode() ;
	}
	//행정재산용도구분코드
	public List getAdmiCode(){
		return objCitylandDao.getAdmiCode() ;
	}
	//회계구분코드
	public List getAccountCode(){
		return objCitylandDao.getAccountCode() ;
	}
	//관리자구분코드
	public List getMainManaCode(){
		return objCitylandDao.getMainManaCode() ;
	}


}
