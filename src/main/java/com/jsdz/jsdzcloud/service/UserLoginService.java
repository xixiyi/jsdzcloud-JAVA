package com.jsdz.jsdzcloud.service;

import com.jsdz.jsdzcloud.bean.User;
import com.jsdz.jsdzcloud.exception.SessionNullException;

public interface UserLoginService {
	
	public User userlogin(User user) throws SessionNullException;

	public User regist(User user) throws SessionNullException;

	public User updateUserinfo(User user) throws SessionNullException;

	public User insertUser(User user) throws SessionNullException;

	public Object selectUser(User user,Integer pageNum,Integer pageSize) throws SessionNullException;

	public Object updateUser(User user) throws SessionNullException;

	public Object selectAccountmanager(User user) throws SessionNullException;

	public User insertKehu(User user) throws SessionNullException;

	public Object selectKehu(User user, Integer pageNum, Integer pageSize) throws SessionNullException;

//	public Object deleteUser(User user);
}
