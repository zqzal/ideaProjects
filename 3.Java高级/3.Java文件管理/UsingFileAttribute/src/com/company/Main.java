package com.company;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        File file = new File("src/mytest.txt");
        try {
            file.createNewFile();
            System.out.println("长度是："+(float)file.length() / 1000 + "KB");
            System.out.println("长度是："+file.length()+"byte");
            System.out.println("相对路径："+file.getParent());
            System.out.println("文件的绝对路径："+file.getAbsolutePath());
            System.out.println("文件的父级的绝对路径："+new File(file.getAbsolutePath()).getParent());
            System.out.println("文件可写？"+file.canWrite());
            System.out.println("文件可读？"+file.canRead());

            System.out.println("---------------");

            file.setReadable(true);
            file.setWritable(true);


        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
