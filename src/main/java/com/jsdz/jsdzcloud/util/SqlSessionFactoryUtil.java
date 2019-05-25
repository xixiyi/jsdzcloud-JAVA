package com.jsdz.jsdzcloud.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;

import com.jsdz.jsdzcloud.exception.SessionNullException;

public class SqlSessionFactoryUtil {

	private static List<SqlSessionFactory> factorylist = new ArrayList<SqlSessionFactory>();
	
	private static Map<String,SqlSessionFactory> factoryMap = new HashMap<String,SqlSessionFactory>();
	
	public static void putSqlsession(String dbid,SqlSessionFactory sqlsessionfactory) {
		factoryMap.put(dbid, sqlsessionfactory);
	}
	
	
	public static SqlSessionFactory getSqlsession(String dbid) throws SessionNullException {
		SqlSessionFactory factory = factoryMap.get(dbid);
		if(factory == null) {
			System.out.println("报错，应该转发到登录页面");
			throw new SessionNullException("登录超时，请重新登录","-1",null);
		}
		return factory;
	}
	
}
