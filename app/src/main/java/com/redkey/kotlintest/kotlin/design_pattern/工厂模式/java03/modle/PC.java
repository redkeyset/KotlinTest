package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java03.modle;

import com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java03.impl.Computer;

public class PC implements Computer {
    private String ram = "8Gb";
    private String hdd = "1Tb";
    private String cpu = "2.4 GHz";

    @Override
    public void ram(String ram) {
        this.ram = ram;
    }

    @Override
    public void hdd(String hdd) {
        this.hdd = hdd;
    }

    @Override
    public void cpu(String cpu) {
        this.cpu = cpu;
    }

    @Override
    public void deviceDir() {
        System.out.println("PC :" + ram +"-"+ hdd +"-"+ cpu);
    }

}
