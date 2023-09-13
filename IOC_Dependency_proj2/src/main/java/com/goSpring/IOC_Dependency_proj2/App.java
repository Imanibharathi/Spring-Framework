package com.goSpring.IOC_Dependency_proj2;

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
    	/*Resource rsc = new ClassPathResource("Addressbean.xml");
    	BeanFactory factory = new XmlBeanFactory(rsc);
    	
    	Resource rsc1 = new ClassPathResource("Employeebean.xml");
    	BeanFactory factory1 = new XmlBeanFactory(rsc1,factory);
    	Employee emp = (Employee)factory1.getBean("emp1");
    	System.out.println(emp);*/
    	
    	Resource rsc = new ClassPathResource("Addressbeanc.xml");
    	BeanFactory factory = new XmlBeanFactory(rsc);
    	
    	Resource rsc1 = new ClassPathResource("Employeebeanc.xml");
    	BeanFactory factory1 = new XmlBeanFactory(rsc1,factory);
    	Employeec empc = (Employeec)factory1.getBean("emp1"); 
    	System.out.println(empc);
    }
}
