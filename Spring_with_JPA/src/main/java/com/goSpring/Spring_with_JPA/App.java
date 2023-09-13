package com.goSpring.Spring_with_JPA;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Student s1 = new Student();
    	s1.setId(123);
    	s1.setName("Thangam");
    	s1.setPer(97.98);
    	EntityManagerFactory ef = Persistence.createEntityManagerFactory("daya");
    	EntityManager em = ef.createEntityManager();
    	
    	em.getTransaction().begin();
    	em.persist(s1);
    	em.getTransaction().commit();
    	System.out.println("persisted");
  
    	
//    	EntityManagerFactory ef = Persistence.createEntityManagerFactory("puc");
//    	EntityManager em = ef.createEntityManager();
//    	Student s1 = em.find(Student.class, 123);
//    	em.getTransaction().begin();
//    	em.remove(s1);
//    	em.getTransaction().commit();
//    	System.out.println("deleted");
//
    	
//    	EntityManagerFactory ef = Persistence.createEntityManagerFactory("puc");
//    	EntityManager em = ef.createEntityManager();
//    	Student s2 = em.find(Student.class, 120);
//    	s2.setName("Priya Thangam");
//    	em.getTransaction().begin();
//    	em.persist(s2);
//    	em.getTransaction().commit();
//    	System.out.println("persisted");

    }
}
