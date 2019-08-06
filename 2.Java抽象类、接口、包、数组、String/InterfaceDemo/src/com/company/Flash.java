package com.company;

/**
 * Created by xuxi on 2018/5/20.
 */
public class Flash implements USB{
    @Override
    public void start() {
        System.out.println("Flash开始");
    }

    @Override
    public void stop() {
        System.out.println("Flash结束");
    }
}
