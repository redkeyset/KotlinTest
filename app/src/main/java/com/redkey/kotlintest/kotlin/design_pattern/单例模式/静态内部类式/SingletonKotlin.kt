package com.redkey.kotlintest.kotlin.design_pattern.单例模式.静态内部类式

class SingletonKotlin private constructor() {
    companion object {
        val instance = SingletonHolder.holder

        fun mPrint(str: String) {
            println(instance)
            println(str)
        }
    }

    private object SingletonHolder {
        val holder = SingletonKotlin()
    }

}