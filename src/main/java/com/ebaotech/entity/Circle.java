package com.ebaotech.entity;

import com.ebaotech.interf.PerimeterCalculate;

public class Circle implements PerimeterCalculate {
    private final double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * radius * PI;
    }
}
