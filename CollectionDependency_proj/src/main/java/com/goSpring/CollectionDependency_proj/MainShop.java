package com.goSpring.CollectionDependency_proj;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainShop {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("Shopbean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		Object o = (Object)factory.getBean("s1");
		Shop s =  (Shop)o; 
		
		
		System.out.println("Shop name : "+s.sname);
		System.out.println("Shop customers : "+s.customer);

	}

}
