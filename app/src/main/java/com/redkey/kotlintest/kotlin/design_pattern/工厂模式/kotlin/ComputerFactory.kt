package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.kotlin

class ComputerFactory {
    companion object {
        const val FACTORY_PC: String = "pc"
        const val FACTORY_SERVER: String = "server"

        fun getComputer(type: String, ram: String, hdd: String, cpu: String): Computer? {
            return when {
                type.equals(FACTORY_PC, false) -> PC(ram, hdd, cpu)
                type.equals(FACTORY_SERVER, false) -> Server(ram, hdd, cpu)
                else -> null
            }
        }
    }

}