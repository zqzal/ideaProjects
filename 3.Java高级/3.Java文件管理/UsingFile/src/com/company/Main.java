package com.company;

import java.io.File;

/**
 * File类的基本简介
 * 文件、文件夹的创建、删除、重命名
 * 文件的属性读取和设置
 * 文件的简单读写
 *
 * 认识File类的常用方法
 * 操作文件常用的方法"
 *   1.exists；是否存在
 *   2.isFile：是否是文件
 *   3.isDirectory：是否是路径
 *   4.list：返回路径下的文件名及目录名
 *
 */
public class Main {

    public static void main(String[] args) {
	// write your code here

        File file = new File("src");

        if (file.exists()){
            System.out.println("是否是文件？"+file.isFile());
            System.out.println("是否是路径？"+file.isDirectory());
        }else {
            System.out.println("不存在");
        }

    }
}
