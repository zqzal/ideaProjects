package com.company;


import java.util.ArrayList;
import java.util.List;

/**
 * List接口的特点
 * 接口常用的子类
 * ArrayList与Vector的区别
 *
 *  1.List接口可以存放任意的数据，且在接口中，内容可以重复
 *  2.List中提供了高效的插入和移除多个元素的方法。
 *
 *
 */

/**
 * Java 泛型的定义(类、接口、对象)、使用、继承
 *
 * 1.设计泛型的初衷：
 *
 *   1)主要是为了解决Java容器无法记忆元素类型的问题:
 *      i.由于Java设计之初并不知道会往容器中存放什么类型的元素，因此元素类型都设定为Object
 *      这样就什么东西都能放了
 *      ii:但是这样设计有明显的缺点：
 *        a.取出元素的时候必须进行强制类型转换（尽管集合在运行时里面元素的"运行时类型"不变，即元素的
 *         getClass返回的还是最初自己的类型而不是Object）
 *        b. 如果不小心往集合里加了不相同类型的元素可能会导致类型异常（进行equals、compare比
 *          较的时候尤为明显）；
 *        c. 由于没有类型就需要在很多地方进行强制类型转换，但是这样做增加了编程的复杂度，并
 *          且代码也不美观（臃肿），维护起来也更加困难
 *
 *   2)泛型的概念定义
 *      i.从Java5开始，引入了参数化类型（Parameterized Type）的概念，改造了所有的Java集合，使之
 *      都实现泛型，允许程序在创建集合时就可以指定集合元素的类型，比如List<String>就表明这是一个只能
 *      存放String类型的List
 *      ii.泛型（Generic）：就是指参数化类型，上面的Lsit<String>就是参数化类型，因此就是泛型，而String
 *      就是该List
 *
 */
public class Main {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();

        list.add("a");
        list.add("b");
        list.add("c");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------------");
        list.add("a");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("------------");
        list.remove(0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }
}
