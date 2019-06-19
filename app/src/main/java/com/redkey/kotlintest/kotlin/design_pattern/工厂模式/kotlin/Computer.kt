package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.kotlin

abstract class Computer {
    open abstract fun getRAM(): String
    open abstract fun getHDD(): String
    open abstract fun getCPU(): String

    override fun toString(): String {
        return "RAM= " + this.getRAM() + ", HDD=" + this.getHDD() + ", CPU=" + this.getCPU()
    }
}