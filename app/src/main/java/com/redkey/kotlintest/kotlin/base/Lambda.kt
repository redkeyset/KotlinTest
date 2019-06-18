package com.redkey.kotlintest.kotlin.base

fun main() {
    println(sumarr(1, 2))

    println()
    // 括号是相当于对变量的某个方法的调用，也就是相当于：
    printHello.invoke()

    println()
    val arr1: Array<String> = arrayOf("一", "er", "叁", "四", "⑤")
    //用Lambda表达式进行遍历
    arr1.forEach {
        println(it)
    }

    println()
    //参数重命名
    arr1.forEach { element ->
        println(element)
    }

    println()
    //用两个冒号来引用println参数（但是参数只有一个，那么参数也可以省略）
    arr1.forEach(::println)
}

/**
 *有参数，有函数体，最后一行作为返回值
 */
val sumarr = { a: Int, b: Int ->
    println("a=$a,b=$b")
    a + b
}

/**
 *无参数，大部分可省略
 */
val printHello = {
    println("hello")
}