package com.redkey.kotlintest.kotlin.design_pattern.单例模式.线程安全的懒汉式

fun main() {
    val instance = SingletonJava.getInstance()
    instance.mPrint("SingletonJava 线程安全的懒汉式")

    println()
    SingletonKotlin.mPrint("SingletonKotlin 线程安全的懒汉式")
}