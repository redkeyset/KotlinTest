package com.redkey.kotlintest.kotlin.design_pattern.原型模式.java;

//如果要克隆就必须实现Cloneable接口
public class Person implements Cloneable{
    //可能会抛出不支持克隆异常，原因是没有实现Cloneable接口
    @Override
    protected Person clone(){
        try{
            return (Person) super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
            return null;
        }
    }
}