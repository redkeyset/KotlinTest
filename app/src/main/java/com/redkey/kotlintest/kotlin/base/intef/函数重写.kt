package com.redkey.kotlintest.kotlin.base.intef

/**
 * 实现多个接口时，可能会遇到同一方法继承多个实现的问题。
 */
interface A {
    fun foo() { print("A") }   // 已实现
    fun bar()                  // 未实现，没有方法体，是抽象的
}

interface B {
    fun foo() { print("B") }   // 已实现
    fun bar() { print("bar") } // 已实现
}

class C : A {
    override fun bar() { print("bar") }   // 重写
}

class D : A, B {
    override fun foo() {
        super<A>.foo()
        super<B>.foo()
    }

    override fun bar() {
        super<B>.bar()
    }
}

fun main(args: Array<String>) {
    val d =  D()
    d.foo()
    d.bar()
}