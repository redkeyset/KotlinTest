package com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.factory;

import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.abst.ProductA;
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.abst.ProductB;
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.modle.ConcreteProductA2;
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.modle.ConcreteProductB2;

public class ConcreteFactory2 extends Factory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA2();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB2();
    }
}
