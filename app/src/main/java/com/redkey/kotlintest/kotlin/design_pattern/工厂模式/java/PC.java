package com.redkey.kotlintest.kotlin.design_pattern.工厂模式.java;

public class PC extends Computer {
    private String ram;
    private String hdd;
    private String cpu;

    protected PC(String ram, String hdd, String cpu) {
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }

    @Override
    public String getRAM() {
        return this.ram;
    }

    @Override
    public String getHDD() {
        return this.hdd;
    }

    @Override
    public String getCPU() {
        return this.cpu;
    }
}
