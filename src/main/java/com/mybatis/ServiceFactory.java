package com.mybatis;

import com.mybatis.service.EmployeeService;
import com.mybatis.service.impl.EmployeeServiceImpl;

public class ServiceFactory {

    private EmployeeService employeeService = null;
    
    public Object getService(String name){
	if(name.equals("EmployeeService")){
	    if(employeeService == null){
		employeeService = new EmployeeServiceImpl();
	    }
	    return employeeService;
	}else{
	    return null;
	}
	
    }
}
