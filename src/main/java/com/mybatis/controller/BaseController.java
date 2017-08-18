package com.mybatis.controller;

import javax.servlet.http.HttpServlet;

import com.mybatis.ServiceFactory;

public class BaseController extends HttpServlet{
    public static ServiceFactory serviceFactory = null;
    
    public BaseController(){
	if(serviceFactory == null){
	    serviceFactory = new ServiceFactory();
	}
    }
}
