package com.ebaotech.service;

import com.ebaotech.interf.PerimeterCalculate;

import java.util.List;

public class PerimeterCalculateService {

    public double calculatePerimeter(List<PerimeterCalculate> list) {
        return list.stream().mapToDouble(PerimeterCalculate::calculatePerimeter).sum();
    }
}
