package com.xuxi1;

/**
 * Created by xuxi on 2019/1/7.
 */
public class WhileTest {
    static boolean condition(){
        boolean result = Math.random() < 0.99;
        System.out.println(result + ", ");
        return result;
    }
    public static void main(String[] args) {
        //只要condition()返回true，就重复执行循环体中的语句
        while (condition()){
            System.out.println("Inside 'while'");
            System.out.println("Exited 'while'");
        }
    }
}
