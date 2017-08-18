package com.mybatis;

import com.mybatis.dao.EmployeeDao;
import com.mybatis.dao.impl.EmployeeDaoImpl;

public class DaoFactory {

    private EmployeeDao employeeDao = null;
    
    public Object getDao(String daoName){
	if(daoName.equals("EmployeeDao")){
	    if(employeeDao == null){
		employeeDao = new EmployeeDaoImpl();
	    }
	    return employeeDao;
	}else{
	    return null;
	}
	
    }
}
