package com.company;

/**
 *  什么是构造方法
 *
 *  构造方法是类中特有的方法，在实例化类对象时，可以直接调用此方法。
 *  构造方法可以是：默认构造方法、自定义构造方法
 *  构造方法和普通方法的调用顺序：如果实例化改类，先调用构造方法，再调用普通方法
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
//        People people = new People();
//        System.out.println(people.getAge());
//        System.out.println(people.getName());


//        People people1 = new People("张三",33);
//        System.out.println(people1.getName());
//        System.out.println(people1.getAge());


//        People people2 = new People();
//        people2.run();

          People.talk();
          People people3 = new People();


    }
}
