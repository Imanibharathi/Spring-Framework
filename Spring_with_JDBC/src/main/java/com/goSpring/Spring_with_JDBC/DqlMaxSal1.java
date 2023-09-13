package com.goSpring.Spring_with_JDBC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class DqlMaxSal1 {
	public static void main(String[] args) {
		
		Resource rsc = new ClassPathResource("springjdbcbean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		JdbcTemplate jt = (JdbcTemplate)factory.getBean("jt1");
		Integer maxsal=jt.queryForObject("Select max(esal) from mycompany.employee",Integer.class);
		System.out.println("Maximum sal = "+maxsal);
		System.out.println("Thank you!.....");
	}

}
