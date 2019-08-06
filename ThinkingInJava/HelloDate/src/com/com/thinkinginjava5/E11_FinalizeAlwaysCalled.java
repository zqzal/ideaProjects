package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/22.
 */
public class E11_FinalizeAlwaysCalled {
    protected void finalize(){
        System.out.println("finalize() called");
    }
    public static void main(String[] args) {
        new E11_FinalizeAlwaysCalled();
        System.gc();
        System.runFinalization();
    }
}
