package com.company;



public class Main {
    //怎么创建  静态内部类  和  非静态内部类  的实例
    public static void main(String[] args) {
	// write your code here
        //创建静态内部类的实例
        OuterClass.NestedStaticClass printer = new OuterClass.NestedStaticClass();
        //创建静态内部类的非静态方法
        printer.printMessage();


        // 为了创建非静态内部类，我们需要外部类的实例
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner  = outer.new InnerClass();
        //调用非静态内部类的非静态方法
        inner.display();
        //我们也可以结合以上步骤，
        //一步创建的内部类实例
        OuterClass.InnerClass inner1 = new OuterClass().new InnerClass();
        //同样我们现在可以调用内部类方法
        inner1.display();



    }

}
/**
 * Java中用static修饰符修饰的方法被称为静态方法，本文我们来看看
 * Java的static静态方法是属于整个类的的类方法。
 * 不用static修饰符限定的方法，是属于某个具体类对象的方法。
 *
 * static方法使用特点如下
 * 1。引用这个方法时，可以使用对象名做前缀，也可以使用类名做前缀
 * 2。static方法不能被覆盖，也就是说，这个类的子类，不能有相同名、相同参数的方法
 * 3。static方法只能访问static方法，不能访问非static方法，但非static方法可以访问static方法
 * 4。static方法只能访问static数据成员，不能访问非static数据成员，但非static方法可以访问static数据成员
 * 5。main方法是静态方法。在Java中每个Application程序中，都必须有且能有一个main方法
 *   ，它是Application程序运行的特点
 * 6。static方法是属于整个类的，它在内存中的代码段将随着类的定义而分配和壮哉。
 *    而非static的方法属于某个对象的方法，在这个对象创建时，在对象的内存中拥有这个方法的专用代码
 *    
 */
