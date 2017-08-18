package com.mybatis.dao;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class BaseDao {
    private SqlSessionFactory sessionFactory = null; 
    
    public SqlSessionFactory getSessionFactory(String resource) {  
	 
	try {  
	    if( null != resource && !"".equals(resource)){
		sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader(resource));
	    }else{
		sessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("config/mybatis-config.xml"));	
	    }
	} catch (IOException e) {  
	    
	}  
	return sessionFactory;  
    }  
}
