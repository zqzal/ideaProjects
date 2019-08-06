package com.company;

/**
 *  接口：
 *      接口可以理解为一种特殊的类，里面全部都是由全局变量和公共的抽象方法所组成
 *  组成
 *  1.接口必须有子类，并且子类要实现全部的抽象方法
 *  2.一个子类可以实现多个接口，但是一个子类只能继承一个抽象类
 *  3.一个接口可以继承多个接口
 *  4.一个子类可以继承抽象类同时实现接口
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Cat cat = new Cat();
        cat.call();
        cat.play();
        cat.edaFood();
        cat.pettoy();
    }
}
