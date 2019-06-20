package com.redkey.kotlintest.kotlin.design_pattern.原型模式.kotlin

/**
 * 原型模式（Prototype）
 */
data class Person(val name: String, val age: Int) {
    fun work() {
        println("$name 正在工作. $age 岁")
    }
}

fun main(args: Array<String>) {
    val person = Person("张三", 15)
    val copy = person.copy(name = "李四")
    println(person.work())
    println(copy.work())
}