package com.springcore.xmlconfig.objects_injection;

import com.util.MyLogger;

public class Triangle1 {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Point getPointA() {
        return pointA;
    }

    public void setPointA(Point pointA) {
        this.pointA = pointA;
    }

    public Point getPointB() {
        return pointB;
    }

    public void setPointB(Point pointB) {
        this.pointB = pointB;
    }

    public Point getPointC() {
        return pointC;
    }

    public void setPointC(Point pointC) {
        this.pointC = pointC;
    }


    public void draw() {

        MyLogger.consoleLogger.info("Point A = ("+ getPointA().getP1() +", "+getPointA().getP2() +")");
        MyLogger.consoleLogger.info("Point B = ("+ getPointB().getP1() +", "+getPointB().getP2() +")");
        MyLogger.consoleLogger.info("Point C = ("+ getPointC().getP1() +", "+getPointC().getP2() +")");
    }
}
