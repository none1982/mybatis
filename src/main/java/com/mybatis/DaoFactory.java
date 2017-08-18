package com.mybatis;

import com.mybatis.dao.EmployeeDao;
import com.mybatis.dao.WordsDao;
import com.mybatis.dao.impl.EmployeeDaoImpl;
import com.mybatis.dao.impl.WordsDaoImpl;

public class DaoFactory {

    private EmployeeDao employeeDao = null;
    private WordsDao wordsDao = null;
    
    public Object getDao(String daoName){
	if(daoName.equals("EmployeeDao")){
	    if(employeeDao == null){
		employeeDao = new EmployeeDaoImpl();
	    }
	    return employeeDao;
	}else if(daoName.equals("WordsDao")){
	    if(wordsDao == null){
		wordsDao = new WordsDaoImpl();
	    }
	    return wordsDao;
	}else{
	    return null;
	}
	
    }
}
