package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java02.modle;

import com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java02.impl.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
