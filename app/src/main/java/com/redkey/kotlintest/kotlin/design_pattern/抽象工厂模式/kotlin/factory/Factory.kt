package com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.factory

import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.abst.ProductA
import com.redkey.kotlintest.kotlin.design_pattern.抽象工厂模式.kotlin.abst.ProductB

abstract class Factory {
   open abstract fun createProductA(): ProductA
   open abstract fun createProductB(): ProductB
}