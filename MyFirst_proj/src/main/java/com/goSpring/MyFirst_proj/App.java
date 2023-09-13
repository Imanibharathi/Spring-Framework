package com.goSpring.MyFirst_proj;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class App 
{
    public static void main( String[] args )
    {
//    	Resource res = new ClassPathResource("studentbean.xml");
//    	BeanFactory bf = new XmlBeanFactory(res);
    	ApplicationContext apc = new ClassPathXmlApplicationContext("studentbean.xml");
    	Student s1 = (Student)apc.getBean("std1");
    	System.out.println(s1);
    }
}
