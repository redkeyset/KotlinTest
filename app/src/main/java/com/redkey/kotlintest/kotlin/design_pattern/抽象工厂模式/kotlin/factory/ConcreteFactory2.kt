package com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.factory

import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.abst.ProductA
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.abst.ProductB
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.modle.ConcreteProductA2
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.modle.ConcreteProductB2

class ConcreteFactory2 : Factory() {
    override fun createProductA(): ProductA {
        return ConcreteProductA2()
    }

    override fun createProductB(): ProductB {
        return ConcreteProductB2()
    }
}