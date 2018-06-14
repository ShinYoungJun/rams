package main.java.admin.service;

import java.util.List;

import main.java.admin.dao.IUserDao;
import main.java.admin.model.UserBean;


public class UserService implements IUserService {
	
	private	IUserDao userDao	= null;
	
	public void setUserDao(IUserDao newUserDao) {
	    this.userDao = newUserDao;
	}
	
	public List getRamsNoticeList(String SEQNUM){
		return userDao.getRamsNoticeList(SEQNUM);
	}
	
	public List getRoadsNoticeList(String PUBLIC){
		return userDao.getRoadsNoticeList(PUBLIC);
	}
	
	public List getUserList(UserBean bean, String currentPage, String countPerPage){
		return userDao.getUserList(bean,currentPage,countPerPage);
	}

	public int GetUserCount(UserBean bean){
		return userDao.GetUserCount(bean);
	}
	
	public void setUserApprove(String approve, String userId){
		userDao.setUserApprove(approve, userId);
	}
	public void setUserDelete(String userId){
		userDao.setUserDelete(userId);
	}
	public void setUserUpdate(UserBean bean){
		userDao.setUserUpdate(bean);
	}

}
