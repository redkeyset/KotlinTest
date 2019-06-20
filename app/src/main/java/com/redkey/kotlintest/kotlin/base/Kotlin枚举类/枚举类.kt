package com.redkey.kotlintest.kotlin.base.Kotlin枚举类

/**
 * 每一个枚举都是枚举类的实例，它们可以被初始化：
 */
enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

enum class Shape(value: Int) {
    ovel(100),
    rectangle(200)
}

enum class ProtocolState {
    WAITING {
        override fun signal() = TALKING
    },

    TALKING {
        override fun signal() = WAITING
    };

    abstract fun signal(): ProtocolState
}

fun main() {
    println("--------: ${Color.BLUE}")

    println("--------: ${ProtocolState.WAITING.signal()}")
}