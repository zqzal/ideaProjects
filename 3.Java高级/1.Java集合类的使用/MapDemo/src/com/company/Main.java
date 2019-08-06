package com.company;

import java.util.*;

/**
 * Map接口的特点
 * 接口常用的子类
 * 迭代器Iterator的使用
 *
 * Map接口的特点
 * 1.Map接口存放的数据是以键值对的形式存放，例如：
 *    key->value
 *    "name"->"詹姆斯刘能"
 *    "age"->"33"
 * 2.键（key）的类型要一致，值（value）的类型也要一致。
 *
 *
 * 接口常用的子类
 * 1.HashMap
 *
 * 迭代器Iterator的使用
 * 1.Iterator自带常用的方法:
 *   1) hasNext
 *   2) next
 *   3) remove
 *
 */

public class Main {

    public static void main(String[] args) {
	// write your code here

        Map<String,String> maps = new HashMap<>();
        maps.put("name","詹姆斯");
        maps.put("age","33");

        System.out.println(maps);
        Set<String> sets = maps.keySet();
        System.out.println("keys"+sets);
        System.out.println("---------------");
        Iterator<String> iterator = sets.iterator();
        while (iterator.hasNext()){
            System.out.println("key = "+iterator.next());
        }
        System.out.println("---------------");


        Collection<String> collection = maps.values();
        Iterator<String> iterator1 = collection.iterator();
        while (iterator1.hasNext()){
            System.out.println("value = "+iterator1.next());
        }

















    }
}
