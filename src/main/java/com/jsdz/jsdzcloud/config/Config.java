package com.jsdz.jsdzcloud.config;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.jsdz.jsdzcloud.filter.GlobFilter;
import com.jsdz.jsdzcloud.interceptor.GlobInterceptor;
import com.jsdz.jsdzcloud.listener.GlobHttpSessionListener;

@Configuration
public class Config implements WebMvcConfigurer  {
	@Autowired
    private GlobInterceptor globInterceptor;
	
	 @SuppressWarnings({ "rawtypes", "unchecked" })
	    @Bean
	    public ServletListenerRegistrationBean listenerRegist() {
	        ServletListenerRegistrationBean srb = new ServletListenerRegistrationBean();
	        srb.setListener(new GlobHttpSessionListener());
	        System.out.println("listener");
	        return srb;
	    }
	 @SuppressWarnings({ "rawtypes", "unchecked" })
	 @Bean
	    public FilterRegistrationBean filterRegistrationBean() {
	    	FilterRegistrationBean filterRegistrationBean = 
	    			new FilterRegistrationBean();
	    	filterRegistrationBean.setFilter(new GlobFilter());
	    	filterRegistrationBean.addUrlPatterns("/*");
	    	return filterRegistrationBean;
	 }
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub registry.addInterceptor(loginInterceptor).addPathPatterns("/**")
		registry.addInterceptor(globInterceptor).addPathPatterns("/**");
		WebMvcConfigurer.super.addInterceptors(registry);
	}
	 
	 
}
