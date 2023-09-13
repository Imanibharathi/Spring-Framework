package com.goSpring.Autowiring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Resource rsc = new ClassPathResource("studentbean.xml");
        BeanFactory factory = new XmlBeanFactory(rsc);
        Student s1 = (Student)factory.getBean("std");
        System.out.println("Student name : "+s1.getSname());
        System.out.println("Course name : "+s1.getCr().cname);
        System.out.println("Course fees : "+s1.getCr().fees);
        System.out.println("Thank you!.....................................");
    }
}
