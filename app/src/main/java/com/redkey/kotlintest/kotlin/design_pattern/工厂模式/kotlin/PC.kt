package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.kotlin

class PC(var ram: String, var hdd: String, var cpu: String) : Computer() {
    override fun getRAM(): String {
        return this.ram
    }

    override fun getHDD(): String {
        return this.hdd
    }

    override fun getCPU(): String {
        return this.cpu
    }
}