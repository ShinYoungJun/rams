package main.java.cityland.service;

import java.util.List;

import main.java.cityland.dao.ICitylandDao;
import main.java.cityland.model.CitylandBean;

public class CitylandService implements ICitylandService {
	
	private ICitylandDao objCitylandDao = null;
	
	
	public void setCitylandDao(ICitylandDao newCitylandDao) {
		this.objCitylandDao = newCitylandDao;
	}
	
	
	//��λ���㰡 ����Ʈ ��ȸ
	public List getPermissList(CitylandBean searchBean){
		return objCitylandDao.getPermissList(searchBean);
	}
	
	//ó����� ����Ʈ ��ȸ
	public List getDisList(CitylandBean searchBean){
		return objCitylandDao.getDisList(searchBean);
	}
	
	//�������� ����Ʈ ��ȸ
	public List getMoodanList(CitylandBean searchBean){
		return objCitylandDao.getMoodanList(searchBean);
	}
	
	//������� ����Ʈ ��ȸ
	public List getBaseList(CitylandBean searchBean){
		return objCitylandDao.getBaseList(searchBean);
	}
	
	//����̷� ����Ʈ ��ȸ
	public List getHistoryList(CitylandBean searchBean){
		return objCitylandDao.getHistoryList(searchBean);
	}
	
	//����̷� �� ����Ʈ ��ȸ
	public List getHistoryDetailList(String PP_SN){
		return objCitylandDao.getHistoryDetailList(PP_SN);
	}
	
	//��걸���ڵ�
	public List getPermissCode(){
		return objCitylandDao.getPermissCode() ;
	}
	
	//���뵵�����ڵ�
	public List getUseCode(){
		return objCitylandDao.getUseCode() ;
	}
	//�������뵵�����ڵ�
	public List getAdmiCode(){
		return objCitylandDao.getAdmiCode() ;
	}
	//ȸ�豸���ڵ�
	public List getAccountCode(){
		return objCitylandDao.getAccountCode() ;
	}
	//�����ڱ����ڵ�
	public List getMainManaCode(){
		return objCitylandDao.getMainManaCode() ;
	}


}
