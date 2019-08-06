package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/18.
 */

/**
 *  new Bird()行创建了一个新对象，并调用其默认构造器————即使你没有明确定义它。没有它的话，就
 *  没有方法可调用，就无法创建对象。但是，如果已经定义了一个构造器（无论是否有参数），编译器就不会
 *  帮你自动创建默认构造器
 */

class Bird2{
    Bird2(int i){

    }
    Bird2(double b){

    }
}
public class NoSynthesis {
    public static void main(String[] args) {
//      Bird2 b = new Bird2(); //No default
        Bird2 b2 = new Bird2(1);
        Bird2 b3 = new Bird2(1.0);
    }
}
