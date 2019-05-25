package com.jsdz.jsdzcloud.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.jsdz.jsdzcloud.bean.Accountmanager;
import com.jsdz.jsdzcloud.bean.Grade;
import com.jsdz.jsdzcloud.bean.NameAndTime;
import com.jsdz.jsdzcloud.bean.User;



public interface UserLoginMapper {
	public List<User> selectAllStudent(User user);

	public User login(User loginuser);

	public void regist(User loginuser);

	public void updateuserinformation(User user);

	public void insertgrade(Grade grade);

	public List<Grade> selectallgradde();

	public void updateuserdengji(Integer uid, Integer dengjiid);

	public User selectuserbyusername(String username);

	public User selectuserbyid(Integer jxsid);

	public User selectuserby(Integer uid);

	public Accountmanager selectaccountbyusername(String accountmanager);

	public void insertaccountmanager(Accountmanager accountmanager);

	public List<Accountmanager> selectaccountmanager(Accountmanager accountmanager);

	public List<User> selectsuoyouStudent(User user);

	public void deletewenyuan(Integer uid);

	public List<User> selecttardyuser(NameAndTime nameAndTime);

	public List<User> selectyoukeuser(User user);

	public void updateuserinstatus(User user);

	public void updateaccountmanager(Accountmanager accountmanager);

	public Grade selectgrade(@Param("dengjiname")String string);

	public List<Map<String,String>> selecttuijianrenuser(@Param("accountmanager")Integer accountmanager, @Param("username")String username);

	public void updateaccountmanagername(Accountmanager accountmanager);

	public void deleteaccountmanager(Accountmanager accountmanagerobj);

	public List<Accountmanager> selectjiansuotuijianren(@Param("username")String username);

	public void creatNewDatabase(@Param("dbid")String dbid);

	public List<Accountmanager> selectAccountmanager();


}
