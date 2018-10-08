package com.ebaotech.entity;

import com.ebaotech.interf.PerimeterCalculate;

public class Rectangle implements PerimeterCalculate {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculatePerimeter(){
        return 2 * (length + width);
    }

    public double calculateArea(){
        return width * length;
    }
}
