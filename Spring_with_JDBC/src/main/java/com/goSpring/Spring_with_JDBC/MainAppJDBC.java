package com.goSpring.Spring_with_JDBC;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class MainAppJDBC {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("jdbctemplate.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
		ppc.setLocation(new ClassPathResource("/jdbcbundle.properties"));
		ppc.postProcessBeanFactory((ConfigurableListableBeanFactory) factory);
		JdbcTemplate jt = (JdbcTemplate)factory.getBean("jt1");
		Integer maxsal = (Integer)jt.queryForObject("Select max(esal) from employee",Integer.class);
		System.out.println(maxsal);
		System.out.println("Thank You!..........................");

	}

}
