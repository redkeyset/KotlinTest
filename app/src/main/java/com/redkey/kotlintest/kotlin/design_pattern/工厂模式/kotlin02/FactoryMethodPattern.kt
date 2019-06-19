package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.kotlin02

fun main() {
    println("Factory Method Pattern")
    var factory_a: Factory = ConcreteFactoryA()
    var product_a = factory_a.factoryMethod()
    product_a.print()

    var factory: Factory = ConcreteFactoryB()
    var product = factory.factoryMethod()
    product.print()

}