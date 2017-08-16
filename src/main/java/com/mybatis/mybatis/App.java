package com.mybatis.mybatis;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.mybatis.model.Employee;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
	SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Employee.class.getResourceAsStream("/mybatis-config.xml"));
	//System.out.println(sqlSessionFactory);
	SqlSession session = sqlSessionFactory.openSession();
	List<Employee> list = session.selectList("com.mybatis.model.Employee.findAll");
	for(Employee user:list){
		System.out.println(user.getName());
	}
    }
}
