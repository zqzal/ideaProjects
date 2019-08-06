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
public class UsingThrows {
    public static void main(String[] args){

        try {
            Caculation caculation = new Caculation();
        } catch (Exception e) {

            System.out.println(e);
        }


    }
    public static class Caculation{
        int a = 5;
        int b = 0;
        int result;
        public Caculation() throws Exception{
            result = a/b;
            System.out.println(result);
        }


    }
}
