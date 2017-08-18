package com.mybatis.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.log4j.Logger;

import com.mybatis.dao.BaseDao;
import com.mybatis.dao.WordsDao;
import com.mybatis.model.Employee;
import com.mybatis.model.Words;

public class WordsDaoImpl extends BaseDao implements WordsDao {
    private Logger logger = Logger.getLogger(this.getClass().getName());
    private String xmlMapperId = "WordsMapper";

    public List<Words> findAll() {
	SqlSessionFactory sessionFactory = getSessionFactory(null);
	SqlSession sqlSession = sessionFactory.openSession(); 
	
	String sqlId=".findAll";
	List<Words> list = sqlSession.selectList(xmlMapperId+sqlId);
	
	sqlSession.close();
	return list;
    }

}
