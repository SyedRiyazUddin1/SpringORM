package com.springcore.xmlconfig.codingto_interfaces;

import com.util.MyLogger;

public class Triangle3 implements Shape {

    private Point2 pointA;
    private Point2 pointB;
    private Point2 pointC;

    public Point2 getPointA() {
        return pointA;
    }

    public void setPointA(Point2 pointA) {
        this.pointA = pointA;
    }

    public Point2 getPointB() {
        return pointB;
    }

    public void setPointB(Point2 pointB) {
        this.pointB = pointB;
    }

    public Point2 getPointC() {
        return pointC;
    }

    public void setPointC(Point2 pointC) {
        this.pointC = pointC;
    }


    public void draw() {
        MyLogger.consoleLogger.info("Drawing Triangle");
        MyLogger.consoleLogger.info("Point A = (" + getPointA().getP1() + ", " + getPointA().getP2() + ")");
        MyLogger.consoleLogger.info("Point B = (" + getPointB().getP1() + ", " + getPointB().getP2() + ")");
        MyLogger.consoleLogger.info("Point C = (" + getPointC().getP1() + ", " + getPointC().getP2() + ")");
    }


}
