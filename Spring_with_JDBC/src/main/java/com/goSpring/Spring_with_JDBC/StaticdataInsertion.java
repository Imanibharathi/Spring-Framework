package com.goSpring.Spring_with_JDBC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class StaticdataInsertion {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("springjdbcbean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		JdbcTemplate jt = (JdbcTemplate)factory.getBean("jt1");
		int r1=jt.update("Insert into jstudent values(101,'Anantpur Kediii')");
		int r2=jt.update("Insert into jstudent values(102,'Hemaaa')");
		int r3=jt.update("Insert into jstudent values(103,'Havila')");
		int r4=jt.update("Insert into jstudent values(104,'Jo')");
		int r= r1+r2+r3+r4;
		System.out.println(r+" Data Inserted successfully");
		System.out.println("Thank you!........");

	}

}
