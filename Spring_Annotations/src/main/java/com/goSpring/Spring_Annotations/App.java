package com.goSpring.Spring_Annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ap = new ClassPathXmlApplicationContext("spconfig.xml");
    	Student s1 = (Student)ap.getBean("student");
    	System.out.println(s1);
    	System.out.println();
    	System.out.println(s1.getSid());
    	System.out.println(s1.getSname());
    	System.out.println(s1.getSperc());
    	System.out.println("Thank You!");
    }
}
