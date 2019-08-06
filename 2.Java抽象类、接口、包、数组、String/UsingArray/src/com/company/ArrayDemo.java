package com.company;

/**
 * Created by xuxi on 2018/5/21.
 */

/**
 * 数组的静态初始化：
 *    静态初始化就是在数组定义之后，直接指明好其内容
 *    格式：数据类型 数组名[] = {值1，值2，值3...};
 */
public class ArrayDemo {

    public static void main(String[] args){
        /**
         //声明数组
         //    int array[] = null;
         int[] array = null;
         //开辟内存空间
         array = new int[11];
         array[4] = 4;
         array[5] = 5;
         for (int i=0; i< array.length ; i++){
         System.out.println(array[i]);
         }
         */
        int[] array = {1,2,3,4,5,6};
        for (int i=0; i< array.length ; i++){
            System.out.println(array[i]);
        }
    }
}
