package com._9;

/**
 * Created by xuxi on 2018/11/23.
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl imp1) {
        super(imp1);
    }

    public void multiDisplay(int times){     //循环显示times次
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }

}
