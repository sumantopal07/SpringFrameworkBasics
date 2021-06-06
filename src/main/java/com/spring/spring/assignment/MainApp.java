package com.spring.spring.assignment;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/Beans.xml");


        Shape circle= (Shape) context.getBean("circle");

        System.out.println(        context.getMessage("greeting",null,"default greeting",null)
);
        System.out.println(circle);
    }
}
