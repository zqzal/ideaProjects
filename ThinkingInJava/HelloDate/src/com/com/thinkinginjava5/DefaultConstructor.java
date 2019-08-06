package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/18.
 */
//默认构造器
//如前所述，默认构造器（又名"无参"构造器）是没有形式参数的——他的作用是创造一个
//"默认对象"。如果你写的类中没有构造器，则编译器会自动帮你创建一个默认构造器。例如：
class Bird{

}

public class DefaultConstructor {
    public static void main(String[] args) {
        Bird b = new Bird(); //Default!
    }
}
