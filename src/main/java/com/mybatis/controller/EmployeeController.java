package com.mybatis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.dao.EmployeeDao;
import com.mybatis.model.Employee;

@WebServlet(name = "EmployeeController", urlPatterns = { "/index" })
public class EmployeeController extends BaseController{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException {
	EmployeeDao dao = daoFactory.getDao("EmployeeDao");
	
	List<Employee> list = dao.findAll();
	req.setAttribute("list", list);
	req.getRequestDispatcher("/page/employee.jsp").forward(req, resp);	
	
    }
    

    
}
