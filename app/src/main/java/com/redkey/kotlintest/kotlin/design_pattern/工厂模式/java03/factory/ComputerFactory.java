package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java03.factory;

import com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java03.impl.Computer;
import com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java03.modle.PC;
import com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java03.modle.Server;

public class ComputerFactory {
    //使用 getShape 方法获取形状类型的对象
    public Computer getDevice(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("pc")) {
            return new PC();
        } else if (shapeType.equalsIgnoreCase("server")) {
            return new Server();
        }
        return null;
    }
}
