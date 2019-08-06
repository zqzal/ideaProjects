package com.company;

/**
 * Created by xuxi on 2018/5/22.
 */
/**
 * String 常用方法
 * 1.字符数组与字符串
 * 2.从字符串中取出指定位置的字符
 * 3.取得一个字符串的长度
 * 4.查找指定的字符串是否存在
 * 5.去掉空格
 * 6.字符串截取
 */
public class StringMethod {

    public static void main(String[] args){

        String str1 = "hello";
        char[] c = str1.toCharArray();
        for (int i = 0; i < c.length; i++) {
            System.out.println(c[i]);
        }
//        System.out.println(str1.toCharArray());

        String str2 = new String(c);
        System.out.println(str2);

        String str3 = new String(c,0,3);
        System.out.println(str3);

        System.out.println(str1.charAt(0));
        System.out.println(str1.length());

//        4.查找指定的字符串是否存在

        System.out.println(str1.indexOf("e"));
        System.out.println(str1.indexOf("l",0));
        //5。去空格
        String str4 = "hello";
        System.out.println(str4.trim());

        //
        System.out.println(str1.substring(2));
        System.out.println(str1.substring(1,3));
    }

}
