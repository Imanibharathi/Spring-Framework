package com.goSpring.Spring_with_Mail;

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
    	XmlBeanFactory fact = new XmlBeanFactory(rsc);
    	MailLogic m = (MailLogic)fact.getBean("id2");
    	m.sendM("imanibtm@gmail.com","manibharathi_raja@yahoo.com","MySubject","Thank u");
    	System.out.println("Success........");
    }
}
