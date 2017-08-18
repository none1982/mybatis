package com.mybatis.dao;

import java.util.List;

import com.mybatis.model.Employee;

public interface EmployeeDao {
    public List<Employee> findAll();
    
    public List<Employee> findAllById(Employee employee);
}
