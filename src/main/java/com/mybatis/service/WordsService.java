package com.mybatis.service;

import java.util.List;

import com.mybatis.model.Words;

public interface WordsService {
    /**
     * 
     * @return
     */
    public List<Words> findAll();
    
}
