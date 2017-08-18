package com.mybatis.service.impl;

import java.util.List;

import com.mybatis.dao.WordsDao;
import com.mybatis.model.Words;
import com.mybatis.service.BaseService;
import com.mybatis.service.WordsService;

public class WordsServiceImpl extends BaseService implements WordsService{

    public List<Words> findAll() {
	WordsDao dao = (WordsDao) daoFactory.getDao("WordsDao");
	List<Words> list = dao.findAll();
	
	return list;
    }

}
