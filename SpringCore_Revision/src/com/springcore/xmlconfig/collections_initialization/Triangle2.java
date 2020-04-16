package com.springcore.xmlconfig.collections_initialization;

import com.util.MyLogger;
import java.util.List;

public class Triangle2 {

    private List<Point1> points;

    public List<Point1> getPoints() {
        return points;
    }
    public void setPoints(List<Point1> points) {
        this.points = points;
    }

    public void draw() {

        for (Point1 point1 : points) {
            MyLogger.consoleLogger.info("Point = (" + point1.getP1() + ", " + point1.getP2() + ")");
        }
    }
}