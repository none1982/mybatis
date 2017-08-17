package com.mybatis.controller;

import javax.servlet.http.HttpServlet;

import com.mybatis.DaoFactory;

public class BaseController extends HttpServlet{
    public static DaoFactory daoFactory = null;
    
    public BaseController(){
	if(daoFactory == null){
	    daoFactory = new DaoFactory();
	}
    }
}
