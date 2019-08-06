package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/23.
 */
public class Counter {

    int i;
    Counter(){
        System.out.println(i);
        i = 7;
        System.out.println(i);
    }

    public static void main(String[] args) {
        System.out.println("");
        Counter counter = new Counter();

    }

}
