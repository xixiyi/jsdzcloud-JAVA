package com.jsdz.jsdzcloud.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsdz.jsdzcloud.bean.ResponseContent;
import com.jsdz.jsdzcloud.bean.User;
import com.jsdz.jsdzcloud.exception.SessionNullException;
import com.jsdz.jsdzcloud.service.UserLoginService;
import com.jsdz.jsdzcloud.util.JsonObject;

@Controller
public class UserLoginController {
	
	@Resource
	private UserLoginService userloginservice;
	
	/**
	 * login  			登录
	 * regist 			注册
	 * updateUserinfo   完善公司信息
	 * 这三个方法都不是在系统控制页面发生的，同属于一类     公司的注册于登录方向	
	 */
	@RequestMapping("/login")
	@ResponseBody
	public Object login(HttpServletRequest httpServletRequest,User user) throws SessionNullException {
		user = userloginservice.userlogin(user);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", user);
		return responsecontent;
	}
	
	@RequestMapping("/regist")
	@ResponseBody
	public Object regist(HttpServletRequest httpServletRequest,HttpServletResponse response,User user) throws SessionNullException {
		user = userloginservice.regist(user);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", user);
		return responsecontent;
	}
	
	@RequestMapping("/updateUserinfo")
	@ResponseBody
	public Object updateUserinfo(HttpServletRequest httpServletRequest,HttpServletResponse response,User user) throws SessionNullException {
		user = userloginservice.updateUserinfo(user);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", user);
		return responsecontent;
	}
	
	/***
	 * 
	 * @param httpServletRequest
	 * @param response
	 * @param user
	 * @return
	 * @throws SessionNullException
	 * 在员工管理中添加员工信息
	 */
	@RequestMapping("/insertUser")
	@ResponseBody
	public Object insertUser(HttpServletRequest httpServletRequest,HttpServletResponse response,User user) throws SessionNullException {
		user = userloginservice.insertUser(user);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", user);
		return responsecontent;
	}
	
	@RequestMapping("/selectUser")
	@ResponseBody
	public Object selectUser(HttpServletRequest httpServletRequest,HttpServletResponse response,User user,Integer pageNum,Integer pageSize) throws SessionNullException {
		Object obj = userloginservice.selectUser(user,pageNum,pageSize);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", obj);
		return responsecontent;
	}
	
	@RequestMapping("/updateUser")
	@ResponseBody
	public Object updateUser(HttpServletRequest httpServletRequest,HttpServletResponse response,User user) throws SessionNullException {
		Object obj = userloginservice.updateUser(user);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", obj);
		return responsecontent;
	}
	
	@RequestMapping("/selectAccountmanager")
	@ResponseBody
	public Object selectAccountmanager(HttpServletRequest httpServletRequest,HttpServletResponse response,User user) throws SessionNullException {
		Object obj = userloginservice.selectAccountmanager(user);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", obj);
		return responsecontent;
	}
	
	
	@RequestMapping("/insertKehu")
	@ResponseBody
	public Object insertKehu(HttpServletRequest httpServletRequest,HttpServletResponse response,User user) throws SessionNullException {
		user = userloginservice.insertKehu(user);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", user);
		return responsecontent;
	}
	
	@RequestMapping("/selectKehu")
	@ResponseBody
	public Object selectKehu(HttpServletRequest httpServletRequest,HttpServletResponse response,User user,Integer pageNum,Integer pageSize) throws SessionNullException {
		Object obj = userloginservice.selectKehu(user,pageNum,pageSize);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", obj);
		return responsecontent;
	}
	
	
}
