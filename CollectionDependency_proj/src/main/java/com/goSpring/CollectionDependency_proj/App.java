package com.goSpring.CollectionDependency_proj;

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
    	Resource rsc = new ClassPathResource("coursebean.xml");
    	BeanFactory factory = new XmlBeanFactory(rsc);
    	
    	Course cr = (Course)factory.getBean("crs");
    	System.out.println("Course name : "+cr.cname);
    	System.out.println("Course fee : "+cr.fees);
    	System.out.println("Course concepts :"+cr.concepts);
    }
}
