package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.kotlin02

class ConcreteFactoryB : Factory() {
    override fun factoryMethod(): Product {
        println("create ProductB")

        return ConcreteProductB()
    }
}