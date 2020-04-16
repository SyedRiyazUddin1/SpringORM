package com.springcore.xmlconfig.codingto_interfaces;

import com.util.MyLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


//@Service
//@Controller
// @Repository
// the functionality of the above annotation in this class is same like @Component,
// besides these annotations et the spring know the roles of a particular class
@Component
public class Circle implements Shape {

    private Point2 center;

    public Point2 getCenter() {
        return center;
    }

    @Autowired
    @Qualifier("circleRelated") //if you have multiple beans of the same type, it is gonna look for a bean which has qualifier name mentioned in the Qualifier annotation
    public void setCenter(Point2 center) {
        this.center = center;
    }

    public void draw() {
        MyLogger.consoleLogger.info("Drawing Circle");
        MyLogger.consoleLogger.info("Point is :" + center.getP1() + ", " + center.getP2() + ")");

    }

}
