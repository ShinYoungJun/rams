package main.java.admin.service;

import java.util.List;

import main.java.admin.model.UserBean;

public interface IUserRegService {

	public UserBean getUserDetail(String userId);
	public List getGuCodeList() ;
	public boolean insertMember(UserBean bean) ;
	public int checkUserId(String userId) ;
}