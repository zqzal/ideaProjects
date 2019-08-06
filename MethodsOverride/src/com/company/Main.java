package com.company;

public class Main {
    /**
     * 什么是方法重写
     * 方法重写：是动态多态，是运行时的多态
     * 发生在父子类之间，子类覆盖父类的方法，覆盖后子类的方法和父类的方法名相同、参数的个数
     * 及类型相同。这种关系称为方法重写。
     */
    public static void main(String[] args) {
	// write your code here
        Car car = new Car();
        car.run();
        Car car1 = new Motorcycle();
        car1.run();;
        Car car2 = new Bicycle();
        car2.run();
    }
}
