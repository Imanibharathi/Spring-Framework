package com.goSpring.ThrowsAdvice_Around;

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
    	Resource rsc = new ClassPathResource("spconfig.xml");
    	XmlBeanFactory factory = new XmlBeanFactory(rsc);
    	
    	Calculator c = (Calculator)factory.getBean("proxy");
    	c.operations(10, 0, '/');
    }
}
