package com.spring_aop.core;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_aop.customer.Customer;

public class App {
    public static void main(String[] args) throws Exception {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("Spring-Customer.xml");

        Customer customer = (Customer) appContext.getBean("customer");
        //customer.addCustomer();

        //customer.addCustomerReturnValue();

        //customer.addCustomerThrowException();

        customer.addCustomerAround("Riyaz");

    }
}
