package com.goSpring.Spring_Appconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Main method started" );
        ApplicationContext ap = new AnnotationConfigApplicationContext(com.goSpring.Spring_Appconfig.Appconfig.class);
        Vehicle v1 = (Vehicle)ap.getBean(Car.class);
        v1.drive();
        Vehicle v2 = (Vehicle)ap.getBean(Bike.class);
        v2.drive();
    }
}
