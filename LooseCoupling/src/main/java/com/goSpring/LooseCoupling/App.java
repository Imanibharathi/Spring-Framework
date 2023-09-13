package com.goSpring.LooseCoupling;

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
    	Vehicle v1 = (Vehicle)ap.getBean("bike");
    	v1.drive();
    	System.out.println("Thank you!");
    }
}
