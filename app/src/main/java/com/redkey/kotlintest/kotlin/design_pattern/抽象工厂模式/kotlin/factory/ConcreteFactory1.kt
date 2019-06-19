package com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.factory

import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.abst.ProductA
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.abst.ProductB
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.modle.ConcreteProductA1
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.modle.ConcreteProductB1

class ConcreteFactory1 : Factory() {
    override fun createProductA(): ProductA{
        return ConcreteProductA1()
    }

    override fun createProductB(): ProductB{
        return ConcreteProductB1()
    }
}