package com.redkey.kotlintest.kotlin.design_pattern.单例模式.懒汉式

fun main() {
    val instance = SingletonJava.getInstance()
    instance.mPrint("Java 单例模式 -- 懒汉式")

    SingletonKotlin.mPrint("Kotlin 单例模式 -- 懒汉式")
}