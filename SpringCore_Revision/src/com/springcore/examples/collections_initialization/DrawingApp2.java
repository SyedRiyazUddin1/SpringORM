package com.springcore.examples.collections_initialization;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp2 {

    public static void main(String[] args) {
        //WITHOUT SPRING
        //Triangle1 triangle1 = new Triangle1();

        //WITH SPRING
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle2 triangle2 = (Triangle2) context.getBean("triangle2");
        triangle2.draw();

    }
}
