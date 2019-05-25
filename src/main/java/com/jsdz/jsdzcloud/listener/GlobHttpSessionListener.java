package com.jsdz.jsdzcloud.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class GlobHttpSessionListener implements HttpSessionListener {
	
	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		System.out.println("我被销毁了");
	}

}
