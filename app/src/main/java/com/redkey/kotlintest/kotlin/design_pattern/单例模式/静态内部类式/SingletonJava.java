package com.redkey.kotlintest.kotlin.design_pattern.单例模式.静态内部类式;

import org.jetbrains.annotations.NotNull;

public class SingletonJava {
    private static class SingletonHolder{
        private static SingletonJava instance = new SingletonJava();
    }

    public static SingletonJava getInstance(){
        return SingletonHolder.instance;
    }

    public void mPrint(@NotNull String str) {
        System.out.println(SingletonHolder.instance);
        System.out.println(str);
    }
}
