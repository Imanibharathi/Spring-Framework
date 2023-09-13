package com.goSpring.BeforeAdvice_n_AfterAdvice;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainApp {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("BankConfig.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		Bank b = (Bank)factory.getBean("id4");
		b.withdraw(10000);System.out.println("------------------------------------------------------");
		b.deposit(25000);

	}

}
