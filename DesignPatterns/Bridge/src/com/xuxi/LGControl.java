package com.xuxi;

/**
 * Created by xuxi on 2018/9/21.
 */
public class LGControl implements Control{

    @Override
    public void On() {
        System.out.println("Open LG TV");
    }

    @Override
    public void Off() {
        System.out.println("Off LG TV");
    }

    @Override
    public void setChannel(int ch) {
        System.out.println("The LG TV Channel is setted"+ch);
    }
}
