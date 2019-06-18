package com.redkey.kotlintest.kotlin.design_pattern.单例模式.双重校验锁式

class SingletonKotlin private constructor() {
    companion object {
        fun mPrint(str: String) {
            println(SingletonKotlin)
            println(str)
        }

        val instance: SingletonKotlin by lazy(mode = LazyThreadSafetyMode.SYNCHRONIZED) {
            SingletonKotlin()
        }
    }
}