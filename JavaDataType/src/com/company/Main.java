package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        Java语言是强类型语言。Java的数据类型分为两大类:
            基本数据类型
            引用数据类型
            Java语言有8种基本数据类型 （字节是保存数据的最小单位)
            类型             |占用空间           |取值范围
            byte(字节型)     |1字节              |-128～127
            short(短整形)    |2字节              |-2^16 ~ 2^16-1
            int(整形)        |4字节              |-2^32 ~ 2^31-1
            long(长整形)     |8字节              |-2^63 ~ 2^63-1
            float(单精度)    |4字节              |-3.4*10^-45 ~ 3.4*10&38
            double(双精度)   |8字节              |-1.79*10^-308 ~ 1.79*10^308
            char(字符型)     |1字节              |0~65535
            boolean(布尔型)  |1字节或4字节        |false、true
         */


        //四种整数类型
        byte byteVar = 15;
        short shortVar = 12345;
        int intVar = 100000;
        long longVar = 1000000L; //L表示长这个
        long longVar01 = 1000000000l; //

        //两种浮点类型 (表示小数点可以浮动的 在数学中有一种科学计数发)
        //double类型的精度是float类型精度的两倍
        float fVar = 1.23f; //F/f表示float类型的值
        double dVar = 1.23;  //  0.123*10   0.00123*1000

        //字符型
        char ch01 = 'a';
        char ch02 = '徐';

        String str01 = "XUXI";

        //布尔型
        boolean b = true;
        boolean b01 = false;


        /*
        引用数据类型分为以下三种:
            类(class)
            接口(interface)
            数组

           引用数据类型也叫复合数据类型。引用类型的数据都是以某个类的对象形式存在的在程序中声明的引用类型变量只是为该对象取的一个名字，
           或者是对改对象的引用，变量的值是对象在内存中的存储地址而不是对象本身，这就是被成为引用类型的原因.

         */
    }
}
