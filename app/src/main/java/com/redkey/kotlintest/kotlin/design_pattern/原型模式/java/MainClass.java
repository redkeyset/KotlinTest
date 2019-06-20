package com.redkey.kotlintest.kotlin.design_pattern.原型模式.java;

public class MainClass {
    public static void main(String[] args) {
        Person person1 = new Person();
        System.out.println(person1.clone());

        Person person2 = person1.clone();
    }
}