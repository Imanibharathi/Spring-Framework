package com.goSpring.Spring_with_JDBC;

import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class DqlMaxSal2 {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("springjdbcbean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		JdbcTemplate jt = (JdbcTemplate)factory.getBean("jt1");
		List ls=jt.queryForList("Select esal from mycompany.employee where esal>=40000");
		for (Object obj : ls) {
			System.out.println(obj);
		}

	}

}
