package com.company;

/**
 *  二维数组声明：
 *     动态初始化：
 *        数据类型  数组名[][] = null;
 *        数组名 = new 数据类型[行][列];
 *     静态初始化：
 *        数据类型  数组名[][] = {{1,2}.{3,4},{5,6}};
 *
 *  多维数组：
 *     数据类型 数组名[][][]...
 *
 *
 */

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("二维数组测试");

//        int array[][] = null;
//        array = new int[10][10];

        int array[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                System.out.println(array[i][j]);

            }
        }


    }
}
