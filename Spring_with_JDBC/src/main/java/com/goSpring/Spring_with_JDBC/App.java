package com.goSpring.Spring_with_JDBC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class App 
{
    public static void main( String[] args )
    {
    	Resource rsc = new ClassPathResource("springjdbcbean.xml");
    	BeanFactory factory = new XmlBeanFactory(rsc);
    	JdbcTemplate jt = (JdbcTemplate)factory.getBean("jt1");
    	jt.execute("create table jstudent(sid int, sname varchar(20))");
    	System.out.println("Thank you ........................");
    }
}
