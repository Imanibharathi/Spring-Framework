package com.goSpring.CollectionDependency_proj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainCollege {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("collegebean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		
		College c = (College)factory.getBean("c1");
		System.out.println(c.cname);
		System.out.println(c.fee);
		System.out.println(c.Students);

	}

}
