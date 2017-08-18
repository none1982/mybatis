package com.mybatis.service;

import com.mybatis.DaoFactory;

public class BaseService {
    public static DaoFactory daoFactory = null;
    
    public BaseService(){
	if(daoFactory == null){
	    daoFactory = new DaoFactory();
	}
    }
}
