package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java;

public class ComputerFactory {
    public static final String FACTORY_PC = "pc";
    public static final String FACTORY_SERVER = "server";

    public static Computer getComputer(String type, String ram, String hdd, String cpu) {
        if ("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if ("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);

        return null;
    }
}
