package com.ebaotech.entity;

import com.ebaotech.interf.PerimeterCalculate;

public class Square extends Rectangle implements PerimeterCalculate {
    private final double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}
