package com.mybatis.service;

import java.util.List;

import com.mybatis.model.Employee;

public interface EmployeeService {
    /**
     * 
     * @return
     */
    public List<Employee> findAll();
    
    /**
     * 
     * @param employee
     * @return
     */
    public List<Employee> findAllById(int id);
    
    /**
     * 
     * @param employee
     * @return
     */
    public List<Employee> findAllByName(String name);
}
