package com.redkey.kotlintest.kotlin.design_pattern.单例模式.静态内部类式

fun main() {
    val instance = SingletonJava.getInstance()
    instance.mPrint("SingletonJava 单例模式.静态内部类式")

    println()
    SingletonKotlin.mPrint("SingletonKotlin 单例模式.静态内部类式")
}