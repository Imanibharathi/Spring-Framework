package com.goSpring.IOC_Dependency_proj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new ClassPathXmlApplicationContext("Employeebean.xml");
    	Employee emp = (Employee)factory.getBean("emp1");
    	System.out.println(emp);
    }
}
