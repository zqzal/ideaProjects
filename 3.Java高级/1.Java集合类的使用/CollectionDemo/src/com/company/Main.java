package com.company;

/**
 * 集合类的简介
 * Collenction的使用
 * List的使用
 * Set的使用
 * Map的使用
 *
 *
 *  集合类都有那些组成
 *  如何使用集合类
 *  了解常用的集合类
 *
 *  在Java中，集合类的结构应该是这样的：
 *  Collection（接口）
 *     List（接口）
 *        LinkedList（类）
 *        ArrayList（类）
 *        Vector（类）
 *            Stack（类）
 *     Set（接口）
 *  Map（接口）
 *     Hashtable（类）
 *     HashMap（类）
 *     WeakHashMap（类）
 *
 *  如何使用集合类
 *    （1）如果涉及到堆栈、队列等操作，应该考虑用List，对于需要快速插入，删除元素，
 *     应该使用LinkedList，如果需要快速随机访问元素，应该使用ArrayList
 *    （2）哈希表的操作，作为key的对象要正确复写equals和hashCode方法
 *    （3）尽量返回接口而非实际的类型，如返回List而非ArrayList，这样如果将来要将
 *     ArrayList换成LinkedList时，客户端代码不用改变。
 *    （4）List可以有类似数组的下标操作，且允许有相同的元素存在；Map是以键值对（Key-Value）
 *     的形式存在，不能存在相同的键。
 *
 *  了解常用的集合类
 *    （1）ArrayList类：
 *         ArrayList实现了可变大小的数组，长度随着元素的增加而变化，且可以存在重复的元素
 *    （2）HashMap类：允许null，即null key，null value。且存在的形式是key-value形式
 *       ，不允许有可以重复。
 *
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
    }
}
