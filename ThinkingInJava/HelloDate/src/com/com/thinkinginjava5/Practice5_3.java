package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/18.
 */

class Practice{
    Practice(){
        System.out.println("自己写的构造器，编译器就不帮你生成了！");
    }
    Practice(String s){
        System.out.println("自己写的构造器，编译器就不帮你生成了！"+s);
    }
}

class Dog{

    void bark(){

    }

    void bark(int i){
        System.out.println(i + "barking");
    }

    void bark(double i){
        System.out.println(i + "howing");
    }
}
class NoConstructorDemo{

}

public class Practice5_3 {
    public static void main(String[] args) {
        Practice p = new Practice();
        Practice p1 = new Practice("朕知道了！！！");
        Dog d = new Dog();
        d.bark(1);
        d.bark(1.0);
        NoConstructorDemo n = new NoConstructorDemo();
    }
}
