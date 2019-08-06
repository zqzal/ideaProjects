package com.company;

/**
 * Created by xuxi on 2018/5/17.
 */
public class Man extends People {
    @Override
    public void run() {
//        super.run();
        System.out.println("Man Run");
    }
    public String getFatherName(){
        return name;
    }
}

