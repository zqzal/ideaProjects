package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/22.
 */
public class E10_FinalizeCall {

    protected void finalize(){

        System.out.println("finalize() called");
    }

    public static void main(String[] args) {
        new E10_FinalizeCall();
    }
}
