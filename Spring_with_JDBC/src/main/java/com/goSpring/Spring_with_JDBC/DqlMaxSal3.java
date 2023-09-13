package com.goSpring.Spring_with_JDBC;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.jdbc.core.JdbcTemplate;

public class DqlMaxSal3 {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("springjdbcbean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		JdbcTemplate jt = (JdbcTemplate)factory.getBean("jt1");
		List ls=jt.queryForList("Select esal from mycompany.employee where esal>=40000");
		for (Object obj : ls) {
			Map<String,Object> mp = (Map<String, Object>)obj;
			Set<Entry<String,Object>> set=mp.entrySet();
			for (Map.Entry me : set) 
			{
				System.out.println(me.getKey()+" => "+me.getValue());
			}
		}


	}

}
