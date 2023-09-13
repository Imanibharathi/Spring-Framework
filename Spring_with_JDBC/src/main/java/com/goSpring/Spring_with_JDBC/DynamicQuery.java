package com.goSpring.Spring_with_JDBC;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class DynamicQuery {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Resource rsc = new ClassPathResource("springjdbcbean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		JdbcTemplate jt = (JdbcTemplate)factory.getBean("jt1");
		while(true) {
			System.out.println("Enter id and name ");
			int id = sc.nextInt();
			String name = sc.next();
			Object values[] = {id,name};
			int r = jt.update("Insert into jstudent values(?,?)",values);
			System.out.println(r+" Data Inserted");
			System.out.println("Do u want to insert more ?");
			String res = sc.next();
			if(res.equalsIgnoreCase("no")) {
				break;
			}
			System.out.println("Thank you!......");
		}


	}

}
