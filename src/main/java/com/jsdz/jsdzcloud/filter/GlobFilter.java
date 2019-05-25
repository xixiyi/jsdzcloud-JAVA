package com.jsdz.jsdzcloud.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

public class GlobFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("MyFilterTwo doFilter"+request.getParameter("dbid"));
		HttpServletResponse res = (HttpServletResponse) response;  
		res.setHeader("Access-Control-Allow-Origin", "*");  
		res.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");  
		res.setHeader("Access-Control-Max-Age", "3600");  
		res.setHeader("Access-Control-Allow-Headers", "x-requested-with");  
		chain.doFilter(request, response);
	}
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("MyFilter init");
	}
 
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("MyFilter destroy");
	}


}
