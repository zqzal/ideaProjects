package com.company;

/**
 * Created by xuxi on 2018/5/18.
 */

/**
 * this、super关键字使用
 *
 * this是对象的别名，是当前类的实例的引用
 * 在类的成员方法内部使用，代替当前类的实例。在java中，本质上是指针，相当于
 * c++中的指针概念。如果方法中的成员调用前没操作实例名，实际是默认使用了this
 *
 * super关键字：调用父类的实例及方法
 *   super有两种调用形式：
 *    1.super代表父类的实例
 *    2.super() 代表父类的构造方法
 */
public class ThisAndSuper {

    private String name;
    public  int age = 10;

    public ThisAndSuper(String _name) {
        System.out.println("ThisAndSuper");
//        this.name = _name;
        name = _name;

    }

}
