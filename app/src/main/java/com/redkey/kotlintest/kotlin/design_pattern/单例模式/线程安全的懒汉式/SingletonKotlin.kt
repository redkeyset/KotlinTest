package com.redkey.kotlintest.kotlin.design_pattern.单例模式.线程安全的懒汉式

class SingletonKotlin private constructor() {
    companion object {
        private var instance: SingletonKotlin? = null
            get() {
                if (field == null) {
                    field = SingletonKotlin()
                }
                return field
            }

        @Synchronized
        fun get(): SingletonKotlin {
            return instance!!
        }

        fun mPrint(str: String) {
            System.out.println(instance)
            System.out.println(str)
        }
    }

}