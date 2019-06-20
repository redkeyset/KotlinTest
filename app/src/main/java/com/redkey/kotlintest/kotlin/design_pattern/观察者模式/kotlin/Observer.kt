package com.redkey.kotlintest.kotlin.design_pattern.观察者模式.kotlin

/**
 * 抽象 观察者 接口
 * 定义了一个update()方法，当被观察者调用notifyObservers()方法时，观察者的update()方法会被回调。
 */
interface Observer {
    fun update(message: String)
}