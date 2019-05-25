package com.jsdz.jsdzcloud.test;

import java.io.IOException;
import java.io.Reader;
import java.util.Properties;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.jsdz.jsdzcloud.dao.UserLoginMapper;

public class Test {
	public static void main(String[] args) throws IOException {
		//配置数据库参数    
		Properties properties = new Properties();    
		properties.setProperty("jdbc.driver", "com.mysql.jdbc.Driver");    
		properties.setProperty("jdbc.url", "jdbc:mysql://localhost:3306/jjjj");    
		properties.setProperty("jdbc.username", "root");    
		properties.setProperty("jdbc.password", "root");    
		    
		//加载mybatis配置文件和映射文件，并获取sqlSession    
		String resource = "mybatis/mybatis-config.xml";    
		Reader reader = Resources.getResourceAsReader(resource);    
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();    
		SqlSessionFactory factory = builder.build(reader, properties);
		SqlSession session = factory.openSession();
		UserLoginMapper user = session.getMapper(UserLoginMapper.class);  
		user.deletewenyuan(2);
		session.commit();
		System.out.println(session);
//		session.close();
	}
}
