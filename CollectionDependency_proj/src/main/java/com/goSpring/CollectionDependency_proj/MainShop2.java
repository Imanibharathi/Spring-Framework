package com.goSpring.CollectionDependency_proj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainShop2 {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("shop2bean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		
		Object o =(Object)factory.getBean("shop2");
		Shop2 s2 = (Shop2)o;
		System.out.println(s2.sname);
		System.out.println(s2.customers);

	}

}
