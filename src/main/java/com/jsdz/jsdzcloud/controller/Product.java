package com.jsdz.jsdzcloud.controller;

import java.io.IOException;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jsdz.jsdzcloud.bean.ProductInformation;
import com.jsdz.jsdzcloud.bean.ResponseContent;
import com.jsdz.jsdzcloud.bean.Series;
import com.jsdz.jsdzcloud.exception.SessionNullException;
import com.jsdz.jsdzcloud.service.ProductService;
import com.jsdz.jsdzcloud.util.JsonObject;

@Controller
public class Product {
	@Resource
	private ProductService productservice;
	
	
	@RequestMapping("/insertSeries")
	@ResponseBody
	public Object insertSeries(Series series, HttpServletRequest request, HttpServletResponse response)
			throws IOException, SessionNullException {
		productservice.insertSeries(series);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", series);
		return responsecontent;
	}

	@RequestMapping("/deleteSeries")
	@ResponseBody
	public Object deleteSeries(Series series, HttpServletRequest request, HttpServletResponse response)
			throws IOException, SessionNullException {
		productservice.deleteSeries(series);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", null);
		return responsecontent;
	}

	@RequestMapping("/updateSeries")
	@ResponseBody
	public Object updateSeries(Series series, HttpServletRequest request, HttpServletResponse response)
			throws IOException, SessionNullException {
		productservice.updateSeries(series);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", series);
		return responsecontent;
	}

	@RequestMapping("/selectSeries")
	@ResponseBody
	public Object selectSeries(Series series, Integer pageNum, Integer pageSize, HttpServletRequest request,
			HttpServletResponse response) throws IOException, SessionNullException {
		Object object = productservice.selectSeries(series,pageNum,pageSize);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", object);
		return responsecontent;
	}
	
	
	
	
	
	
	
	
	
	@RequestMapping("/insertProduct")
	@ResponseBody
	public Object insertProduct(ProductInformation productinformation, HttpServletRequest request, HttpServletResponse response)
			throws IOException, SessionNullException {
		productservice.insertProduct(productinformation);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", productinformation);
		return responsecontent;
	}

	@RequestMapping("/deleteProduct")
	@ResponseBody
	public Object deleteProduct(ProductInformation productinformation, HttpServletRequest request, HttpServletResponse response)
			throws IOException, SessionNullException {
		productservice.deleteProduct(productinformation);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", null);
		return responsecontent;
	}

	@RequestMapping("/updateProduct")
	@ResponseBody
	public Object updateProduct(ProductInformation productinformation, HttpServletRequest request, HttpServletResponse response)
			throws IOException, SessionNullException {
		productservice.updateProduct(productinformation);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", productinformation);
		return responsecontent;
	}

	@RequestMapping("/selectProduct")
	@ResponseBody
	public Object selectProduct(ProductInformation productinformation, Integer pageNum, Integer pageSize, HttpServletRequest request,
			HttpServletResponse response) throws IOException, SessionNullException {
		Object object = productservice.selectProduct(productinformation,pageNum,pageSize);
		ResponseContent responsecontent = JsonObject.JsonObjectWrite("0", "成功", object);
		return responsecontent;
	}
}
