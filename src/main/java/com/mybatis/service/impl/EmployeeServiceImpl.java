package com.mybatis.service.impl;

import java.util.List;

import com.mybatis.dao.EmployeeDao;
import com.mybatis.model.Employee;
import com.mybatis.service.BaseService;
import com.mybatis.service.EmployeeService;

public class EmployeeServiceImpl extends BaseService implements EmployeeService{

    public List<Employee> findAll() {
	EmployeeDao dao = (EmployeeDao) daoFactory.getDao("EmployeeDao");
	List<Employee> list = dao.findAll();
	
	return list;
    }

    public List<Employee> findAllById(int id) {
	EmployeeDao dao = (EmployeeDao) daoFactory.getDao("EmployeeDao");
	Employee e =  new Employee();
	
	e.setId(id);
	List<Employee> list = dao.findAllById(e);
	
	return list;
    }

}
