package com.redkey.kotlintest.kotlin.design_pattern.单例模式.双重校验锁式;

import org.jetbrains.annotations.NotNull;

public class SingletonJava {
    private volatile static SingletonJava instance;
    private SingletonJava(){}
    public static SingletonJava getInstance(){
        if(instance==null){
            synchronized (SingletonJava.class){
                if(instance==null){
                    instance=new SingletonJava();
                }
            }
        }
        return instance;
    }

    public void mPrint(@NotNull String str) {
        System.out.println(instance);
        System.out.println(str);
    }
}