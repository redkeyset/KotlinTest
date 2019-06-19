package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.kotlin

fun main() {
    val pc = ComputerFactory.getComputer(ComputerFactory.FACTORY_PC, "2 GB", "500 GB", "2.4 GHz")
    val server = ComputerFactory.getComputer(ComputerFactory.FACTORY_SERVER, "16 GB", "1 TB", "2.9 GHz")
    System.out.println("Factory PC Config :$pc")
    System.out.println("Factory Server Config :$server")
}