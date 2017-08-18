package com.mybatis;

import com.mybatis.service.EmployeeService;
import com.mybatis.service.WordsService;
import com.mybatis.service.impl.EmployeeServiceImpl;
import com.mybatis.service.impl.WordsServiceImpl;

public class ServiceFactory {

    private EmployeeService employeeService = null;
    private WordsService wordsService = null;
    
    public Object getService(String name){
	if(name.equals("EmployeeService")){
	    if(employeeService == null){
		employeeService = new EmployeeServiceImpl();
	    }
	    return employeeService;
	}else if(name.equals("WordsService")){
	    if(wordsService == null){
		wordsService = new WordsServiceImpl();
	    }
	    return wordsService;
	}else{
	    return null;
	}
	
    }
}
