package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/18.
 */

/**
 * 假设你希望在方法的内部获得对当前对象的引用。由于这个引用是由编译器"偷偷"传入
 * 的，所以没有标识符可用。但是，为此有个专门的关键字：this。this关键字只能在
 * 方法内部使用，表示对"调用方法的那个对象"的引用。this的用法和其他对象引用并无
 * 不同。但要注意，如果在方法内部调用同一个类的另一个方法，就不必使用this，直接
 * 调用即可。当前方法中的this引用会自动应用于同一个类中的其他方法。
 */

/**
 * this 关键字只能在方法内部使用，表示对"调用方法的那个对象"的引用。
 * this的用法和其他对象引用并无不同。
 * 但要注意，如果方法内部调用的用一个类的另一个方法，就不必使用this，直接调用即可。
 * 当前方法中的this引用会自动应用于同一个中的其他方法。
 */

class Apricot{
    void pick(){};
    void pit(){
        pick();
    }
}

/**
 * 只有当前需要明确指出对当前对象的引用时，才需要使用this关键字。例如，
 * 当需要返回对当前对象的引用时，就常常在return语句里这样写:
 */
class Leaf{
    int i = 0;
    Leaf increment(){
        i++;
        return this;
    }
    void print(){
        System.out.println("i = " + i);
    }
}

class Banana{
    void peel(int i){

    }
}

/**
 * this关键字对于将当前对象传递给其他方法也很有用
 */

class Person{
    public void ead(Apple apple){
        Apple peeled = apple.getPeeled();
        System.out.println("Yummy");
    }
}

class Peeler{
    static Apple peel(Apple apple){
        return apple;
    }
}

class Apple{
    Apple getPeeled(){
        return Peeler.peel(this);
    }
}

class TestEnight{
    void methodone(){


    }
    void methodTwo(){
        methodone();
        this.methodone();
    }
}

public class BananaPeel {

    public static void main(String[] args) {
        Banana a = new Banana(),b = new Banana();
        a.peel(1);
        b.peel(2);
        Leaf x = new Leaf();
        x.increment().increment().increment().print();
        /**
         * Apple需要调用Peeler.peel()方法，它是一个外部的工具方法，将执行由于某种原因必须放在Apple
         * 外部的操作（也许是因为该外部方法要应用于许多不同的类，而你却不想重复这些代码）。为了将其自身
         * 传递给外部方法，Apple必须使用this关键字
         */
        new Person().ead(new Apple());
    }


}
