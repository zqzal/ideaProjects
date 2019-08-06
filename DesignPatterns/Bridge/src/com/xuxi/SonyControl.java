package com.xuxi;

/**
 * Created by xuxi on 2018/9/21.
 */
public class SonyControl implements Control{
    @Override
    public void On() {
        System.out.println("Open Sony TV");
    }

    @Override
    public void Off() {
        System.out.println("Off Sony TV");
    }

    @Override
    public void setChannel(int ch) {
        System.out.println("The Sony TV Channel is setted"+ch);
    }
}
