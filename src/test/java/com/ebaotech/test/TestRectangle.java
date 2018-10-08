package com.ebaotech.test;

import com.ebaotech.entity.Circle;
import com.ebaotech.entity.Rectangle;
import com.ebaotech.entity.Square;
import com.ebaotech.interf.PerimeterCalculate;
import com.ebaotech.service.PerimeterCalculateService;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class TestRectangle {
    @Test
    public void testRectanglePerimeter(){
        Rectangle rectangle = new Rectangle(30,20);
//        assertThat().
    }

    @Test
    public void testSumPerimeter(){
        Rectangle rectangle = new Rectangle(20,30);
        Circle circle = new Circle(3);
        Square square = new Square(2.5);
        List<PerimeterCalculate> list = new ArrayList<PerimeterCalculate>();
        list.add(rectangle);
        list.add(circle);
        list.add(square);
        PerimeterCalculateService perimeterCalculateService = new PerimeterCalculateService();


    }
}
