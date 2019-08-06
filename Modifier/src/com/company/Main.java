package com.company;

/**
 * Java修饰符
 * 修饰符的种类
 *    1.修饰符分为:访问修饰符、存储修饰符
 *    2.变量的命名、方法的命名等，都是由访问修饰符、
 *      存储修饰符及数据类型、变量、对象构成的
 *
 * 访问修饰符
 * 1.访问修饰符:访问修饰符分为四种：public、protected、默认、private这四种。
 * 2.为了使程序的变量更加安全，可以使用private关键字将数据封装在类里。
 *   且访问修饰符(关键字)提供了不同的程序访问权限的级别。
 * 3.四个访问修饰符的访问级别由高到低的顺序是:
 *   public -> protected -> 默认 -> private
 * 4.成员被声明为public时，该成员可以被程序的任何代码模块所访问
 * 5.成员被声明为protected时，该成员只可以被该类的子类模块所访问
 * 6.缺省时，该成员只可以被该类所在的包的类的代码块所访问
 * 7.成员被声明为private时，该成员只可以被本类程序所访问
 *
 *
 * 存储修饰符
 *   static访问方式
 *     类名.类成员  实例名.类成员
 *   可以用来初始化
 *     声明时具有初始化功能
 *     声明块时，先加载static块，再执行main块
 *   static当描述方法时，方法内不能使用this和super关键字
 *   final:可以修饰类、方法及变量
 *
 */
public class Main {

    static {
        System.out.println("www");
    }

    public static int age = 30;
    public static final String name = "詹姆斯刘能";

    public static void main(String[] args) {
	// write your code here
//        Main main = new Main();
//        main.run();

//        People people = new People();
//        people.age = 10;
//        System.out.println(people.age);

//        System.out.println(People.name);
        age=1;
//        name = "zhangshan";
        System.out.println(age);
        System.out.println(name);

    }
}
