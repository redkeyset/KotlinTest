package com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.factory;

import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.abst.ProductA;
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.abst.ProductB;
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.modle.ConcreteProductA1;
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.modle.ConcreteProductB1;

public class ConcreteFactory1 extends Factory {

    @Override
    public ProductA createProductA() {
        return new ConcreteProductA1();
    }

    @Override
    public ProductB createProductB() {
        return new ConcreteProductB1();
    }
}
