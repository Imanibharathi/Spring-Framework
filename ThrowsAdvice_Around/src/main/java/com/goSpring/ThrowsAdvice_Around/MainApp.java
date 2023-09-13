package com.goSpring.ThrowsAdvice_Around;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) 
	{
		Resource rsc = new ClassPathResource("arconfig.xml");
		XmlBeanFactory factory = new XmlBeanFactory(rsc);
		
		MyInterface in = (MyInterface)factory.getBean("proxy");
		in.display();

	}

}
