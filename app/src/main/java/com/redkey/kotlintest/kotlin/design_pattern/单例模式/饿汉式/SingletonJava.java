package com.redkey.kotlintest.kotlin.design_pattern.单例模式.饿汉式;

//Java实现
public class SingletonJava {
    private static SingletonJava instance = new SingletonJava();

    private SingletonJava() {

    }

    public static SingletonJava getInstance() {
        return instance;
    }

    public void mPrint(String str) {
        // new SingletonJava() 打印 内存
        System.out.println(instance);
        System.out.println(str);
    }
}