package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/21.
 */

/**
 * 在构造器中调用构造器
 * 可能为一个类写了多个构造器，有时可能想在一个构造器中调用另一个构造器，以避免重复
 * 代码。可用this关键字做到这一点。
 * 通常写this的时候，都是指"这个对象"或者"当前对象"，而且它本身表示对当前对象的引用。
 * 在构造器中，如果为this添加了参数列表，那么就有了不同的含义。这将产生对符合此参数
 * 列表的某个构造器的明确调用；这样，调用其他构造器就有了直接的途径：
 */
public class Flower {
    int petalCount = 0;
    String s = "initial value";
    Flower(int petals){
        petalCount = petals;
        System.out.println("Constructor w/ int arg only,petalCount=" + petalCount);
    }

    Flower(String ss){
        System.out.println("Constructor w/ String arg only,s = " + ss);
    }
    Flower(String s,int petals){
        /**
         * 构造器Flower(String s,int petals)表明：尽管可以用this调用一个构造器，但却不能调用两个。
         * 此外，必须将构造器调用置于最起始处，否则编译器会报错。
         * 这个例子也展示了this的另一种用法。由于参数s的名称和数据成员s的名字相同，所以会产生歧义。
         * 使用this.s来代表数据成员就能解决这个问题。在Java程序代码中经常出现这种写法，本书中也常出现
         * 这种写法，本书中也常这么写。
         * pringPetalCount()方法表明，除构造器之外，编译器禁止在其他任何方法中调用构造器。
         */
        this(petals);
//        this(s);  //Can not call two!
        this.s = s;
        System.out.println("String & int args");
    }
    Flower(){
        this("hi",47);
        System.out.println("defalut constructor (no args)");
    }
    void printPetalCount(){
//        this(11); //Not inside non-constructor!
        System.out.println("petalCount = " + petalCount + " s = "+s);
    }

    public static void main(String[] args) {
        Flower x = new Flower();
        x.printPetalCount();
    }
}
