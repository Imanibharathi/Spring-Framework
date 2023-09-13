package com.goSpring.CollectionDependency_proj;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainCollege_usingmap2 {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("collegebeanMap2.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		
		Object o = (Object)factory.getBean("clg2");
		College_usingMap2 c = (College_usingMap2)o;
		System.out.println("College name : "+c.cname);
		System.out.println("Students data : ");
		Map m=c.Studentsdata;
		Set<Map.Entry> s = m.entrySet();
		Iterator<Map.Entry> it = s.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey()+"=>"+entry.getValue());
		}

	}

}
