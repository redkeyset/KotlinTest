package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java;

public class TestFactory {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(ComputerFactory.FACTORY_PC, "2 GB", "500 GB", "2.4 GHz");
        Computer server = ComputerFactory.getComputer(ComputerFactory.FACTORY_SERVER, "16 GB", "1 TB", "2.9 GHz");
        System.out.println("Factory PC Config::" + pc);
        System.out.println("Factory Server Config::" + server);
    }
}
