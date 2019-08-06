package com._9_1;

import com._9.Display;
import com._9.DisplayImpl;

/**
 * Created by xuxi on 2018/11/26.
 */
public class RandomDisplay extends Display {  //直接继承Display
    public RandomDisplay(DisplayImpl imp1) {
        super(imp1);
    }

    public void randomDisplay(int number){ //随机显示number次
        open();
        for (int i = 0; i < number; i++) {
            print();
        }
        close();
    }



}
