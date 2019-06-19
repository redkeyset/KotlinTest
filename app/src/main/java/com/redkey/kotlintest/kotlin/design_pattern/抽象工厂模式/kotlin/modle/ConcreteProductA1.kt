package com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.modle

import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.abst.ProductA

class ConcreteProductA1 : ProductA() {
    override fun mPrint() {
        System.out.println("ConcreteProductA1")
    }
}