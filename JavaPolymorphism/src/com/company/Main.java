package com.company;

public class Main {
    /**
     *   多态
     *  通俗的讲是"类的不同对象对同一个消息做出不同的反应"。例如水在不同温度下会有固态、液态、气态三种状态
     *
     *  为什么引入多态的概念？
     *     会让程序运行起来更灵活
     *  多态分两种：静态多态和动态多态
     *     静态多态是编译时多态：方法重载
     *     动态多态是运行时多态：方法重写和接口的引用
     */
    public static void main(String[] args) {
	// write your code here
        Car car = new Car();
        car.run();

//        Montorcycle montorcycle = new Montorcycle();
//        montorcycle.run();

        Car montorcycle1 = new Montorcycle();
        montorcycle1.run();

        Car bicycle = new Bicycle();
        bicycle.run();;

    }
}
