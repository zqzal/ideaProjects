package com.company;

/**
 * Created by xuxi on 2018/5/30.
 */

/**
 * throws关键字的含义及使用方法
 * throw关键字的含义及使用方法
 *
 * throws关键字的含义及使用方法
 * throws抛出异常的格式如下：
 *    public XX() throws Exception{
 *        //做一些容易出错的操作
 *    }
 *    public static void main(String[] args){
 *        try{
 *
 *        }catch(Exception e){
 *
 *        }
 *
 *    }
 *
 * throw抛出异常的格式如下：
 *   try{
 *       throw new Exception("实例化异常")
 *   }catch(Exception e){
 *       System.out.println(e);
 *   }
 *
 *
 */
public class UsingThrow {
    public static void main(String[] args) {

        try{

//            People people = new People();

            throw new Exception("实例化Exception");


        }catch (Exception e){

            System.out.println(e);

        }

    }
    public static class People{

        int a = 5;
        int b = 5;
        int result;

        public People(){
            result = a / b;
            System.out.println(result);
        }

    }

}
