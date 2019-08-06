package com.company;

/**
 * Created by xuxi on 2018/5/20.
 */


/**
 * 应用场景
 *     接口的实际中更多作用是用来定制标准的，例如："U盘和打印机都可以插在电脑上使用，是
 *     因为他们实现了USB的接口，对于电脑来说，只要是符合了USB接口标准的设备都可以插
 *     进来"
 *
 *
 */
public class UsingInter {
    public static void main(String [] agrs){
        Flash flash = new Flash();
        Print print = new Print();
        Computer.plugin(flash);
//        Computer.plugin(print);


    }
}
