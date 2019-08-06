package com.company;

/**
 * Created by xuxi on 2018/5/20.
 */
public class Outer {

    private static String info = "gg";

    static class Inner{
        public void print(){
            System.out.println(info);
        }
    }

    public void tell(){
        new Inner().print();

    }





}
