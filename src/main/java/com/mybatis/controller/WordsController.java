package com.mybatis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.Words;
import com.mybatis.service.WordsService;

@WebServlet(name = "WordsController", urlPatterns = { "/wordsIndex" })
public class WordsController extends BaseController{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException {
	
	WordsService service= (WordsService) serviceFactory.getService("WordsService");
	List<Words> list = service.findAll();
	req.setAttribute("list", list);	
	req.getRequestDispatcher("/page/words.jsp").forward(req, resp);	
	
    }

    
}
