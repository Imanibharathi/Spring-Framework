package com.goSpring.Spring_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp2 {

	public static void main(String[] args) 
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("spconfig.xml");
		Student2 s2 = (Student2)ap.getBean("student2");
		System.out.println(s2);
		System.out.println();
		System.out.println(s2.getSid());
		System.out.println(s2.getSname());
		System.out.println(s2.getSperc());

	}

}
