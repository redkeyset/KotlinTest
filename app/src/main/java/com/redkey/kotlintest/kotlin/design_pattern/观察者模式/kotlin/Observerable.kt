package com.redkey.kotlintest.kotlin.design_pattern.观察者模式.kotlin

import java.util.*

/**
 * 抽象 被观察者 接口
 * 声明了添加、删除、通知观察者方法
 */
interface Observerable {
    fun registerObserver(observer: Observer)
    fun removeObserver(observer: Observer)
    fun notifyObservers()
}