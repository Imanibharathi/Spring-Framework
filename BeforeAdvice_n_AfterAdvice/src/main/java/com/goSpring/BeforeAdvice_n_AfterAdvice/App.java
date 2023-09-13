package com.goSpring.BeforeAdvice_n_AfterAdvice;

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
    	Resource rsc = new ClassPathResource("springconf.xml");
    	BeanFactory factory = new XmlBeanFactory(rsc);
    	MyInterface inter = (MyInterface)factory.getBean("id4");
    	inter.m1();System.out.println("----------------------------------------------------");
    	inter.m2();
    }
}
