package com.redkey.kotlintest.kotlin.design_pattern.单例模式.饿汉式

fun main() {
    val instance1 = SingletonJava.getInstance()
    instance1.mPrint("Java 单例模式 -- 饿汉式")

    SingletonKotlin.mPrint("Kotlin 单例模式 -- 饿汉式")
}