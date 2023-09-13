package com.goSpring.IOC_Dependency_proj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainStudent {

	public static void main(String[] args) {
	/*	ApplicationContext factory = new ClassPathXmlApplicationContext("Studentbean.xml");
		Student s1 = (Student)factory.getBean("std1");
		System.out.println(s1);
*/
		ApplicationContext factory = new ClassPathXmlApplicationContext("Studentbeanc.xml");
		Studentc s1c = (Studentc)factory.getBean("stdc");
		System.out.println(s1c);
	}

}
