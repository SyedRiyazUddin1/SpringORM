package com.springcore.xmlconfig.constructor_setterInjections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

    public static void main(String[] args) {
        //WITHOUT SPRING
        //Triangle triangle = new Triangle();

        //with SPRING Framework
        //BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
        //BeanFactory is deprecated, can also use ApplicationContext

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle) context.getBean("triangle");
        triangle.draw();

    }
}
