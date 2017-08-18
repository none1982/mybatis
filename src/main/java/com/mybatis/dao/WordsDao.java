package com.mybatis.dao;

import java.util.List;

import com.mybatis.model.Words;

public interface WordsDao {
    /**
     * 
     * @return
     */
    public List<Words> findAll();
    
   
}
