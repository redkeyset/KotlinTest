package com.redkey.kotlintest.kotlin.base

fun main() {
    println(sum(1, 2))
    println(toLong(1, 2))
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun toLong(a: Int, b: Int) = a.toLong() + b.toLong()