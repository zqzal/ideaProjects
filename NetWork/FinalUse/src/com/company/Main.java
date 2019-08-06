package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//
//        String a = "hello2";
//        String f = "hello2";
//        final String b = "hello";
//        String d = "hello";
//        String c = b + 2;
//        String e = d + 2;
//        System.out.println("a->"+a);
//        System.out.println("c->"+c);
//        System.out.println("e->"+e);
//        System.out.println((a == c));
//        System.out.println((a == e));
//        System.out.println((a == f));
//        if (a.equals(e)){
//            System.out.println("a的值等于e");
//        }else {
//            System.out.println("a的值不等于e");
//        }

//        String a = "hello2";
//        final String b = getHello();
//        String c = b + 2;
//        System.out.println((a == c));


        MyClass myClass1 = new MyClass();
        MyClass myClass2 = new MyClass();
        System.out.println(myClass1.i);
        System.out.println(myClass1.j);
        System.out.println(myClass2.i);
        System.out.println(myClass2.j);


    }

    public static String getHello() {
        return "hello";
    }
}
class MyClass {
    public final double i = Math.random();
    public static double j = Math.random();
}
