package com.company;

/**
 * Created by xuxi on 2018/5/20.
 */
public abstract class Animal {

    private int age = 10;
    //抽象方法
    public abstract void call();

    public int getAge() {
        return age;
    }
}
