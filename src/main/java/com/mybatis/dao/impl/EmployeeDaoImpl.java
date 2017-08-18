package com.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.mapping.BoundSql;
import org.apache.ibatis.mapping.MappedStatement;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.mybatis.dao.BaseDao;
import com.mybatis.dao.EmployeeDao;
import com.mybatis.model.Employee;

public class EmployeeDaoImpl extends BaseDao implements EmployeeDao {
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private String xmlMapperId = "EmployeeMapper";

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

    public List<Employee> findAllByName(Employee employee) {
	SqlSessionFactory sessionFactory = null;
	sessionFactory = getSessionFactory(null);
	SqlSession sqlSession = sessionFactory.openSession(); 
	
	String sqlId=".findAllByName";
	MappedStatement ms = sqlSession.getConfiguration().getMappedStatement(xmlMapperId + sqlId);
	BoundSql boundSql = ms.getBoundSql(1);
	logger.info(boundSql.getSql() + " param:" + boundSql.getParameterObject());
	List<Employee> list = sqlSession.selectList(xmlMapperId+sqlId,employee);
	
	return list;
    }
}
