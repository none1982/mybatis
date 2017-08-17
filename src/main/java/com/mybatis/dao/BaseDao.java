package com.mybatis.dao;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class BaseDao {
    public SqlSessionFactory getSessionFactory(String resource) {  
	SqlSessionFactory sessionFactory = null;  
	 
	try {  
	    if( null != resource && !"".equals(resource)){
		sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
	    }else{
		sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("config/mybatis-config.xml"));	
	    }
	} catch (IOException e) {  
	    e.printStackTrace();  
	}  
		return sessionFactory;  
	}  
}
