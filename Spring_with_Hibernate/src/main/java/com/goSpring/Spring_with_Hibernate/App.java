package com.goSpring.Spring_with_Hibernate;

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
    	
    	Resource rsc = new ClassPathResource("Applicationconfig.xml");
    	BeanFactory fact = new XmlBeanFactory(rsc);
    	EmployeeDAO dao =(EmployeeDAO)fact.getBean("d");
    	EmployeeDTO dto = new EmployeeDTO();
    	dto.setId(101);
    	dto.setName("jo");
    	dto.setSal(56789.0);
    	dao.saveEmployee(dto);
    	System.out.println("Thank you");
    	
    	
    	
    
    }
}
