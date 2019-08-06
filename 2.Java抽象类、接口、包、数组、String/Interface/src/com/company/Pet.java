package com.company;

/**
 * Created by xuxi on 2018/5/20.
 */
public interface Pet extends A,B {

    public static final String name = "小学";

    //抽象方法
//    public abstract void play();
    void play();

    public abstract void call();


}
