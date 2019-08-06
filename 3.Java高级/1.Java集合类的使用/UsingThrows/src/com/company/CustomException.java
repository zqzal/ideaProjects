package com.company;

/**
 * Created by xuxi on 2018/5/30.
 */

/**
 * 如何自定义异常类
 * 如何使用
 *
 * 自定义异常类：继承于异常类基类即可
 *
 */
public class CustomException {

    public static class MyException extends Exception{
        public MyException(String str){

            super(str);

        }
    }

    public static void main(String[] args){

        try {

            throw new MyException("自定义");

        }catch (Exception e) {

            System.out.println(e);

        }

    }
}
