package com.goSpring.MyFirst_proj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainEmployee {

	public static void main(String[] args) {
		ApplicationContext factory = new ClassPathXmlApplicationContext("Employeebean.xml");
		Employee emp1 = (Employee)factory.getBean("emp1"); 
		System.out.println(emp1);
		
		
		

	}

}
