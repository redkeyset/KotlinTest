package com.redkey.kotlintest.kotlin.design_pattern.单例模式.线程安全的懒汉式;

import org.jetbrains.annotations.NotNull;

public class SingletonJava {
    private static SingletonJava instance;
    private SingletonJava(){}
    public static synchronized SingletonJava getInstance(){//使用同步锁
        if(instance==null){
            instance=new SingletonJava();
        }
        return instance;
    }

    public void mPrint(@NotNull String str) {
        // new SingletonJava() 打印 内存
        System.out.println(instance);
        System.out.println(str);
    }
}
