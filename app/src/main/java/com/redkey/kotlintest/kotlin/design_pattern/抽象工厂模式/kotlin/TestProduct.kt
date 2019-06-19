package com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin

import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.factory.ConcreteFactory1
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.factory.ConcreteFactory2

fun main() {
    val factory1 = ConcreteFactory1()
    factory1.createProductA().mPrint()
    factory1.createProductB().mPrint()

    System.out.println("----------------")

    val factory2 = ConcreteFactory2()
    factory2.createProductA().mPrint()
    factory2.createProductB().mPrint()
}