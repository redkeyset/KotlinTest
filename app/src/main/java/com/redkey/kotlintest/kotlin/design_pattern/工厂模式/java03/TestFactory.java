package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java03;

import com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java03.factory.ComputerFactory;
import com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java03.impl.Computer;

public class TestFactory {
    public static void main(String[] args) {
        ComputerFactory pcFactory = new ComputerFactory();
        Computer pc = pcFactory.getDevice("pc");
        pc.deviceDir();

        Computer server = pcFactory.getDevice("server");
        server.deviceDir();
    }
}
