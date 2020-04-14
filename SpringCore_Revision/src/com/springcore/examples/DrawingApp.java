package com.springcore.examples;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

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
