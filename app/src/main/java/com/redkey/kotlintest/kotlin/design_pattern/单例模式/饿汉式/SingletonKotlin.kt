package com.redkey.kotlintest.kotlin.design_pattern.单例模式.饿汉式

/**
 *Kotlin实现 单例模式 饿汉式
 *（kotlin 实现单例模式 只需要 object）
 */
object SingletonKotlin {
    fun mPrint(str: String) {
        // new SingletonJava() 打印 内存
        println(SingletonKotlin)
        println(str)
    }
}

