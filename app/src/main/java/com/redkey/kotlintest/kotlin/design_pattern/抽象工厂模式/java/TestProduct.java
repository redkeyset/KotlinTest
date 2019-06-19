package com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java;

import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.factory.ConcreteFactory1;
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.factory.ConcreteFactory2;

public class TestProduct {
    public static void main(String[] args) {
        ConcreteFactory1 factory1 = new ConcreteFactory1();
        factory1.createProductA().mPrint();
        factory1.createProductB().mPrint();

        System.out.println("----------------");

        ConcreteFactory2 factory2 = new ConcreteFactory2();
        factory2.createProductA().mPrint();
        factory2.createProductB().mPrint();
    }
}


