package com.company;

import java.io.*;

/**
 * I/O简介及字节流读写数据
 * 字符流读写数据
 * 运用Apache IO库操作I/O与文件
 *
 * 介绍什么是I/O
 * 如何使用字节流进行数据读取与写入
 *
 * I/O与称为：输入输出，可以理解为In、Out
 *   I/O流：读取键盘输入的字符，硬盘上的文件
 * 处理数据的类型分类：字节流、字符流
 *
 * 字节流
 *    以Stream结尾
 *    例：处理文字、图片、音频、视频等，读取到一个字节则返回一个字节
 * 字符流
 *    以Reader或Writer结尾
 *    仅能处理存文本数据，读取到一个或多个字节，再查询指定编码表，最后返回字符
 *
 * 如何使用字节流进行数据读取和写入
 *    字节流的读取：FileInputStream
 *         读取方法：read()
 *    字节流的写入：FileOutputStream
 *         读取方法：write()
 *
 *
 *
 *
 *
 */


public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("Java文件目录不能包含'/'");
//        File file = new File("src/test.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try {
            FileInputStream fileInputStream = new FileInputStream("src/test.txt");
            byte[] bytes = new byte[3];

            String str = "";
            while (fileInputStream.read(bytes) != -1){
               str += new String(bytes,"utf-8");
            }
            System.out.println(str);
            fileInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
