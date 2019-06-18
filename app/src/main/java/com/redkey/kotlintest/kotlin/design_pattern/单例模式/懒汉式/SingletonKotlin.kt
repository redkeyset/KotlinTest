package com.redkey.kotlintest.kotlin.design_pattern.单例模式.懒汉式

//Kotlin 单例模式 懒汉式
class SingletonKotlin private constructor() {
    companion object {

        private var instance: SingletonKotlin? = null
            get() {
                if (field == null) {
                    field = SingletonKotlin()
                }
                return field
            }

        fun get(): SingletonKotlin {
            //细心的小伙伴肯定发现了，这里不用getInstance作为为方法名，是因为在伴生对象声明时，内部已有getInstance方法，所以只能取其他名字
            return instance!!
        }

        fun mPrint(str: String) {
            println(SingletonKotlin)
            println(str)
        }
    }
}