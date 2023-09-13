package com.goSpring.CollectionDependency_proj;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MainCollege_usingmap {

	public static void main(String[] args) {
		Resource rsc = new ClassPathResource("collegeMapbean.xml");
		BeanFactory factory = new XmlBeanFactory(rsc);
		
		Object obj = (Object)factory.getBean("clg1");
		College_usingMap cm = (College_usingMap)obj;
		System.out.println(cm.getCname());
		Map m =cm.getStudentsdata();
		Set<Map.Entry> s = m.entrySet();
		Iterator<Map.Entry> it = s.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			System.out.println(entry.getKey()+" => "+entry.getValue());
		}

	}

}
