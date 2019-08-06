package com.xuxi.compositepattern;

/**
 * Created by xuxi on 2018/9/30.
 */

/**
 * Leaf
 * 定义Leaf类Programmer
 */
public class Programmer extends Employer {

    public Programmer(String name){
        setName(name);
        employers = null; //程序员，表示没有下属了
    }

    @Override
    public void add(Employer employer) {

    }

    @Override
    public void delete(Employer employer) {

    }
}
