package com.jsdz.jsdzcloud.util;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class CreatSqlSessionFactory {
	
	public static SqlSessionFactory creat(String dbid) throws IOException {
		Properties properties = new Properties();    
		properties.setProperty("jdbc.driver", "com.mysql.jdbc.Driver");    
		properties.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/jjjj"+dbid);
		properties.setProperty("jdbc.username", "root");    
		properties.setProperty("jdbc.password", "root");    
		    
		//加载mybatis配置文件和映射文件，并获取sqlSession    
		String resource = "com/jsdz/jsdzcloud/configxml/mybatis-config.xml";    
		Reader reader = Resources.getResourceAsReader(resource);
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();    
		SqlSessionFactory factory = builder.build(reader, properties);
		return factory;
	}
}
