package com.jsdz.jsdzcloud.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsdz.jsdzcloud.bean.Mokuai;
import com.jsdz.jsdzcloud.bean.ResponseContent;
import com.jsdz.jsdzcloud.exception.SessionNullException;
import com.jsdz.jsdzcloud.service.MokuaiService;
import com.jsdz.jsdzcloud.util.JsonObject;

@Controller
public class MokuaiController {
	@Resource
	private MokuaiService mokuaiservice;
	
		@RequestMapping("/insertmokuai")
		@ResponseBody
		public Object insertmokuai(Mokuai mokuai, HttpServletRequest request, HttpServletResponse response)
				throws IOException, SessionNullException {
			mokuai = mokuaiservice.insertmokuai(mokuai);
			ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", mokuai);
			return responsecontent;
		}

		@RequestMapping("/deletemokuai")
		@ResponseBody
		public Object deletemokuai(Mokuai mokuai, HttpServletRequest request, HttpServletResponse response)
				throws IOException, SessionNullException {
			mokuaiservice.deletemokuai(mokuai);
			ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", null);
			return responsecontent;
		}

		@RequestMapping("/updatemokuai")
		@ResponseBody
		public Object updatemokuai(Mokuai mokuai, HttpServletRequest request, HttpServletResponse response)
				throws IOException, SessionNullException {
			mokuaiservice.updatemokuai(mokuai);
			ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", mokuai);
			return responsecontent;
		}

		@RequestMapping("/selectmokuai")
		@ResponseBody
		public Object selectmokuai(Mokuai mokuai, Integer pageNum, Integer pageSize, HttpServletRequest request,
				HttpServletResponse response) throws IOException, SessionNullException {
			Object object = mokuaiservice.selectmokuai(mokuai,pageNum,pageSize);
			ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", object);
			return responsecontent;
		}
}
