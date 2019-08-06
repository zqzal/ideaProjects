package com.company;

/**
 * 抽象类的概念
 *     包含一个抽象方法的类就是抽象类
 * 抽象方法：
 *     只声明而未实现的方法就是抽象方法
 *   1.抽象类与抽象方法都要使用abstrant关键字声明
 *   2.抽象类必须被子类继承
 *
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("AbstractClass抽象类概念");


        Cat cat = new Cat();

        cat.call();
    }
}
