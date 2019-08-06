package com.company;

/**
 * Created by xuxi on 2018/5/17.
 */
public class WrapperClass {
    public static void main(String[] args){
        //包装类
        //Java语言是一个面向对象的语言，但是Java中的基本数据类型却是不面向对象的，这在实际使用时存在很多的不便，为了解决这个不足，
        //在设计类时为每个基本数据类型设计了一个对应的类进行代表，这样八个和基本数据类型对应的类统称为包装类。
        //包装类均位于java.lang 包，包装类和基本数据类型的对应关系如下表：

        //基本数据类型       包装类
        //byte       Byte
        //boolean       Boolean
        //short         Short
        //char       Character
        //int       Integer
        //long       Long
        //float       Float
        //double       Double


        //包装类的用途
        //对于包装类说，这些类的用途主要包含两种：
        //1.作为和基本数据类型对应的类类型存在，方便涉及到对象的操作。
        //2.包含每种基本数据类型的相关属性如最大值、最小值等，以及相关的操作方法。

        //实际使用
        //        intValue
        int n = 10;
        Integer in = new Integer(100);
        Integer in1 = new Integer(n);
        int m = in.intValue();
        System.out.println(n);
        System.out.println(in);
        System.out.println(in1);
        System.out.print(m);

        //parseInt
        String s = "1234";
        int n1 = Integer.parseInt(s);
        //toString
        int m1 = 1000;
        String s1 = Integer.toString(m1);
        System.out.print(n1);
        System.out.print(m1);

    }
}
