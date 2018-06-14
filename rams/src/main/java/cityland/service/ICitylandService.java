package main.java.cityland.service;

import java.util.List;

import main.java.cityland.model.CitylandBean;

public interface ICitylandService {
	
	//대부사용허가 리스트 조회
	public List getPermissList(CitylandBean searchBean);
	//처분재산 리스트 조회
	public List getDisList(CitylandBean searchBean);
	//무단점용 리스트 조회
	public List getMoodanList(CitylandBean searchBean);
	//재산정보 리스트 조회
	public List getBaseList(CitylandBean searchBean);
	//재산이력 리스트 조회
	public List getHistoryList(CitylandBean searchBean);
	//재산이력 상세 리스트 조회
	public List getHistoryDetailList(String PP_SN);
	//재산구분코드
	public List getPermissCode(); 
	//재산용도구분코드
	public List getUseCode();
	//행정재산용도구분코드
	public List getAdmiCode();
	//회계구분코드
	public List getAccountCode();
	//관리자구분코드
	public List getMainManaCode();

}
