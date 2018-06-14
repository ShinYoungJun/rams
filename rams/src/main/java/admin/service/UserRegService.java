package main.java.admin.service;

import java.util.List;
import main.java.admin.dao.IUserRegDao;
import main.java.admin.model.UserBean;

public class UserRegService implements IUserRegService {

	private IUserRegDao objUserRegDao = null;

	public void setUserRegDao(IUserRegDao newUserRegDao) {
		this.objUserRegDao = newUserRegDao;
	}
	
	public UserBean getUserDetail(String userId) {
		
		return objUserRegDao.getUserDetail(userId);
	}
	
	public List getGuCodeList() {
		return objUserRegDao.getGuCodeList();
	}
	
	public boolean insertMember(UserBean bean) {
		return objUserRegDao.insertMember(bean);
	}
	
	public int checkUserId(String userId) {
		return objUserRegDao.checkUserId(userId);
	}
	
}