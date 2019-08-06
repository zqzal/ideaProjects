package com.company;

import java.io.CharArrayReader;

/**
 * Created by xuxi on 2018/2/10.
 */
public class VariableTest {
    public static void main (String[] argc){
        //1、分配内存空间,取一个变量名
        //2、将数据存储到对应的内存空间中
        //3、通过变量名获取数据值进行使用
        int money = 32000;
        double sumMoney = money * 4.05/100 + money;
        System.out.println("本金:"+ money);
        System.out.println("连本带利:" + sumMoney);

        String name = "徐贺辉";
        char gender = '男';
        int age = 25;
        System.out.println("姓名"+name);
        System.out.println("性别"+gender);
        System.out.println("年龄"+age);

        //变量的命名规范
        //abc _ $ 作为首字母
        int a1;
        int _a1;
        int $a1;
//        int 12a; //错误
        //其他部分：字母、_ 、 $ 、数字
        int a_1;
        int a$1;
//        int a+1; //非法变量名称!
        int abc;
        int ABC;


    }
}
