package com.springcore.examples;

import com.util.MyLogger;

public class Triangle {

    //member variables
    private String type;

    private int height;
    public int getHeight() {
        return height;
    }

    //constructor
    public Triangle(String type) {
        this.type = type;
    }

    //one more contructor (method overloading)
    public Triangle(String type, int height) {
        this.type = type;
        this.height = height;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public void draw() {
        MyLogger.consoleLogger.info(getType() + " Triangle drawn of height " +getHeight());
    }
}
