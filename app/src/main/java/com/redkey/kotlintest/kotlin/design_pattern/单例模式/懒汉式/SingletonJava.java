package com.redkey.kotlintest.kotlin.design_pattern.单例模式.懒汉式;

//Java实现 单例模式 懒汉式
class SingletonJava {
    private static SingletonJava instance;

    private SingletonJava() {

    }

    public void mPrint(String str) {
        System.out.println(instance);
        System.out.println(str);
    }

    public static SingletonJava getInstance() {
        if (instance == null) {
            instance = new SingletonJava();
        }
        return instance;
    }
}