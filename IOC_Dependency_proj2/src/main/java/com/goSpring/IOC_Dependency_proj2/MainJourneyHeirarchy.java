package com.goSpring.IOC_Dependency_proj2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainJourneyHeirarchy {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("Vehiclebean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		Resource rsc1 = new ClassPathResource("Startjourneybean.xml");
		BeanFactory factory1 = new XmlBeanFactory(rsc1,factory);
		journey j =(journey)factory1.getBean("std1");
		j.Startjourney();
		System.out.println(j);
		
		
		
	}

}
