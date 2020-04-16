package com.springcore.xmlconfig.codingto_interfaces;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp3 {

    public static void main(String[] args) {


        //with SPRING Framework
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Shape shape = (Shape) context.getBean("triangle3"); we can draw triangle

        //if we want to draw a circle, we can write the below code
        Shape shape = (Shape) context.getBean("circle");

        shape.draw();

    }
}
