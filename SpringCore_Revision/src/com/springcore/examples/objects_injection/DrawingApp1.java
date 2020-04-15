package com.springcore.examples.objects_injection;

import com.springcore.examples.objects_injection.Triangle1;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp1 {

    public static void main(String[] args) {
        //WITHOUT SPRING
        //Triangle1 triangle1 = new Triangle1();

        //WITH SPRING
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle1 triangle1 = (Triangle1) context.getBean("triangle1");
        triangle1.draw();

    }
}
