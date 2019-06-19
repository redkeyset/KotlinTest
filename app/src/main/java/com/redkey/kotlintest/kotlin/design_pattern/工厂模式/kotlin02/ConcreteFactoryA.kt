package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.kotlin02

//class ConcreteFactoryA : Factory() {
//    override fun factoryMethod(): Product {
//        println("create ProductA")
//        return ConcreteFactoryA()
//    }
//}

class ConcreteFactoryA : Factory() {
    override fun factoryMethod(): Product {
        println("create ProductA")

        return ConcreteProductA()
    }
}