package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/8.
 */
public class SimpleConstructor2 {
    static class Rock2{
        Rock2(int i){
            System.out.println("Rock "+ i + " ");
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            new Rock2(i);
        }
    }
}
