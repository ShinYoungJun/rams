package main.java.admin.service;

import java.util.List;

import main.java.admin.model.UserBean;
import main.java.common.util.Globals;

public interface IUserService {
	
	public List getRamsNoticeList(String SEQNUM);
	public List getRoadsNoticeList(String PUBLIC);
	
	public List getUserList(UserBean bean, String currentPage, String countPerPage);
	public int GetUserCount(UserBean bean);
	public void setUserApprove(String approve, String userId);
	public void setUserDelete(String userId);
	public void setUserUpdate(UserBean bean);
}
