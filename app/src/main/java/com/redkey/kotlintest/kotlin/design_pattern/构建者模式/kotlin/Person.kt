package com.redkey.kotlintest.kotlin.design_pattern.构建者模式.kotlin

class Person private constructor(builder: Builder) {
    internal var name: String? = null
    internal var age: Int? = 0

    init {
        name = builder.name
        age = builder.age
    }

    class Builder {
        internal var name: String? = null
        internal var age: Int? = 0

        fun name(name1: String): Builder {
            name = name1
            return this
        }

        fun age(age1: Int): Builder {
            age = age1
            return this
        }

        fun build(): Person {
            return Person(this)
        }
    }

    override fun toString(): String {
        return "Person(name=$name, age=$age)"
    }

}

fun main() {
    val person = Person.Builder()
        .name("张三")
        .age(20)
        .build()

    System.out.println(person.name + " --- ${person.age}")
    System.out.println(person.toString())
}