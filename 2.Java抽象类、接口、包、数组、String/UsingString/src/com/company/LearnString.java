package com.company;

/**
 * Created by xuxi on 2018/5/22.
 */

/**
 *     栈内存                    堆内存
 *     stirng1(指向(1))        (1)"Hello"
 *     string2(指向(2))        (2)"Hello"
 *     string3(指向(2))
 *
 *
 */
public class LearnString {

    public static void main(String[] args){
/**
        String string1 = "Hello";
        String string2 = new String("Hello");
//        String string2 = "Hello";
        String string3 = string2;
        //==变成了内存地址的比较
        System.out.println(string1==string2);
        System.out.println(string1==string3);
        System.out.println(string2==string3);
        System.out.println(string1.equals(string2));
        System.out.println(string1.equals(string3));
        System.out.println(string2.equals(string3));
 */

        /**
         //String字符串是不可以改变的
         String str1 = "Hello";
         str1 = str1 + "Word";
         System.out.println(str1);
         for (int i = 0; i < 100; i++) {
         str1+=i;
         System.out.println(str1);
         }
         */
        String str1 = "Hello";
        str1 = "ee";
        System.out.println(str1);


    }

}
