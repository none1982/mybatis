package com.mybatis.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.Employee;
import com.mybatis.service.EmployeeService;

@WebServlet(name = "EmployeeController", urlPatterns = { "/index" })
public class EmployeeController extends BaseController{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException {
	
	EmployeeService service= (EmployeeService) serviceFactory.getService("EmployeeService");
	List<Employee> list = service.findAllById(1);
	req.setAttribute("list", list);
	req.getRequestDispatcher("/page/employee.jsp").forward(req, resp);	
	
    }
    

    
}
