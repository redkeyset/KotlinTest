package com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.factory;

import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.abst.ProductA;
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.java.abst.ProductB;

public abstract class Factory {
    public abstract ProductA createProductA();
    public abstract ProductB createProductB();
}
