package com.redkey.kotlintest.kotlin.base.Kotlin扩展

class User(var name: String)

/**
 * 扩展 User函数
 */
fun User.print(){
    print("用户名 $name")
}

fun main() {
    val user = User("张三")
    user.print()
}