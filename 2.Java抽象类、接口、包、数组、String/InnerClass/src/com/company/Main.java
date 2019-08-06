package com.company;

/**
 * 内部类：
 *    在一个类的内部存在另一个类，就被称为内部类
 *
 * 内部类的优点和缺点：
 *    缺点：破坏了程序的结构
 *    优点：方便的访问外部类中的私有属性
 *    注意：此时内部类是无法直接访问的，如果想访问，需要使用static关键字
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        new Outer().tell();

        new Outer.Inner().print();
    }
}
