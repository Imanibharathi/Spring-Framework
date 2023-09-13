package com.goSpring.CollectionDependency_proj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainShop1 {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("Shop1bean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		
		Object o =(Object)factory.getBean("shop1");
		Shop1 s1 = (Shop1)o;
		System.out.println(s1.sname);
		System.out.println(s1.customers);

	}

}
