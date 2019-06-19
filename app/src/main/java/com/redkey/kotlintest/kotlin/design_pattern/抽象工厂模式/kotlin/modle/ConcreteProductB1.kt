package com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.modle

import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.abst.ProductB

class ConcreteProductB1 : ProductB() {
    override fun mPrint() {
        System.out.println("ConcreteProductB1")
    }
}