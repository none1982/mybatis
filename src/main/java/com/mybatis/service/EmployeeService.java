package com.mybatis.service;

import java.util.List;

import com.mybatis.model.Employee;

public interface EmployeeService {
    public List<Employee> findAll();
    
    public List<Employee> findAllById(int id);
}
