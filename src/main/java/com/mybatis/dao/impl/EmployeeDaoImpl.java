package com.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.mybatis.dao.BaseDao;
import com.mybatis.dao.EmployeeDao;
import com.mybatis.model.Employee;

public class EmployeeDaoImpl extends BaseDao implements EmployeeDao {

    private String xmlMapperId = "com.mybatis.xml.EmployeeMapper";

    public List<Employee> findAll() {
	SqlSessionFactory sessionFactory = getSessionFactory(null);
	SqlSession sqlSession = sessionFactory.openSession(); 
	
	String sqlId=".findAll";
	List<Employee> list = sqlSession.selectList(xmlMapperId+sqlId);
	
	sqlSession.close();
	return list;
    }

    public List<Employee> findAllById(Employee employee) {
	SqlSessionFactory sessionFactory = null;
	
	sessionFactory = getSessionFactory(null);
	SqlSession sqlSession = sessionFactory.openSession(); 
	
	String sqlId=".findAllById";
	List<Employee> list = sqlSession.selectList(xmlMapperId+sqlId,employee);
	
	return list;
    }
}
