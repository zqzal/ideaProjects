package com.company;

/**
 * Created by xuxi on 2018/5/20.
 */
public class Computer {
    public static void plugin(USB usb){
        usb.start();
//        System.out.println("usb开始工作");
        usb.stop();
//        System.out.println("usb结束工作");
    }
}
