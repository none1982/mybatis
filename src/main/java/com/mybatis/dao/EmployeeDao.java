package com.mybatis.dao;

import java.util.List;

import com.mybatis.model.Employee;

public interface EmployeeDao {
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
    public List<Employee> findAllById(Employee employee);
    
    /**
     * 
     * @param employee
     * @return
     */
    public List<Employee> findAllByName(Employee employee);
}
