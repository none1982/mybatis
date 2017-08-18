package com.mybatis.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mybatis.model.Employee;
import com.mybatis.service.EmployeeService;

@WebServlet(name = "EmployeeController", urlPatterns = { "/employeeIndex" })
public class EmployeeController extends BaseController{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
	    throws ServletException, IOException {
	
	String method = req.getParameter("method");
	if(null != method && "queryName".equals(method)){
	    queryName(req);
	}	
	req.getRequestDispatcher("/page/employee.jsp").forward(req, resp);	
	
    }
    private void queryName(HttpServletRequest req){
	EmployeeService service= (EmployeeService) serviceFactory.getService("EmployeeService");
	String name = req.getParameter("name");
	List<Employee> list = service.findAllByName(name);
	req.setAttribute("list", list);
    }
    

    
}
