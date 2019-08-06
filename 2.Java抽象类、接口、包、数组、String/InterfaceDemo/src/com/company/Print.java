package com.company;

/**
 * Created by xuxi on 2018/5/20.
 */
public class Print implements USB {
    @Override
    public void start() {
        System.out.println("Print开始");
    }

    @Override
    public void stop() {
        System.out.println("Print结束");
    }
}
