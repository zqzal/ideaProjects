package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/8.
 */
public class SimpleConstructor {
    static class Rock {
        Rock(){ //This is the constructor
            System.out.println("Rock");
        }
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            new Rock();
        }
    }
}
