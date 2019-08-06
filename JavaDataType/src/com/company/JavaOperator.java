package com.company;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

/**
 * Created by xuxi on 2018/2/24.
 */
public class JavaOperator {

    public static void main(String[] args){
        //Java针对操控变量提供了一组丰富的运算符。我们可以将所有的Java运算符分为如下几组
        //算数运算符  （+ - * / % ++ --）testCondition
        //关系运算符  == != > <  >= <=
        //逻辑运算符
        //赋值运算符
        //其他运算符
//        JavaOperator.testArithmetic();
//          JavaOperator.testRelational();
        JavaOperator.testCondition();
    }
    //算数运算符
    public static void testArithmetic(){
        int a = 10;
        int b = 5;
        int c;
        c = a + b;
        System.out.println(c);
        System.out.println( a + b );
        System.out.println( a * b );
        System.out.println( a / b);
        //%
        a = 12;
        c = a % b;
        System.out.println(c);

        // ++  --
        int k = 20;
        k++;
        System.out.println(k);
        ++k;
        System.out.println(k);

        int m = 10;
        int n = 10;
        int p = 2 * ++m;
        int q = 2 * n++;
        System.out.println("p=" + p + " m="+m);
        System.out.println("q=" + q + " n="+n);

    }
    //    关系运算符
    public static void testRelational(){
        int a = 10;
        int b = 5;
        System.out.println( a == b);
        System.out.println( a != b);
        System.out.println( a > b);
        System.out.println( a < b);
        System.out.println( a >= b);
        System.out.println( a <= b);
    }
    //位运算符
    //Java定义了几种运算符，这类运算符可被运用于整数型式，long、int、short、字符型和字节型。
    // 位运算符作用于二进制系统间传输标准，并执行按位操作。
    //假设如果a 等于 60 ，b等于13，在二进制型式下它们就如下所示
    // a = 0011 1100
    // b = 0000 1101

    /*
    &  二进制AND运算符在结果上复制一位如果在双方操作数同时存在   (A&B)位12，即0000 1100
    |  二进制OR运算符在结果上复制一位如果在任何一个操作数上存在    (A|B)位61，即0011 1101
    ^  二进制XOR运算法复制位，如果它是设置在一个操作数上不是两个。  (A^B)位49  即0011 0001
    ~  二进制补充运算符是一元的，b并有"翻转"位的影响   (~A)为-61，由于是带符号的二进制数，那2的补位


     */
    public static void testCondition(){
        int a,b;
        a = 10;
        b = (a < 10) ? 20 : 30;
        System.out.println(b);

    }





}
