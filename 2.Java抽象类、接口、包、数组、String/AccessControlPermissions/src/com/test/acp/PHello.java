package com.test.acp;

/**
 * Created by xuxi on 2018/5/21.
 */
public class PHello {
    public static void main(String[] args){

        new PHello().tell();

    }

    public void tell(){
        Hello hello = new Hello();
        System.out.println(hello.age);
    }
}
