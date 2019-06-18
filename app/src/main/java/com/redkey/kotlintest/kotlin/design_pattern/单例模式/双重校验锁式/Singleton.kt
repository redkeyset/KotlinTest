package com.redkey.kotlintest.kotlin.design_pattern.单例模式.双重校验锁式

fun main() {
    val instance = SingletonJava.getInstance()
    instance.mPrint("Java 单例模式.双重校验锁式")

    println()
    SingletonKotlin.mPrint("Kotlin 单例模式.双重校验锁式")
}