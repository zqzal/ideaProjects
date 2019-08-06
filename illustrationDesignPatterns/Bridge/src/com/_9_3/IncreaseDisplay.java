package com._9_3;

import com._9.CountDisplay;
import com._9.DisplayImpl;

/**
 * Created by xuxi on 2018/11/26.
 */
public class IncreaseDisplay extends CountDisplay {
    private int step;  //递增步长
    public IncreaseDisplay(DisplayImpl imp1,int step) {
        super(imp1);
        this.step = step;
    }
    public void increaseDisplay(int level){
        int count = 0;
        for (int i = 0; i < level; i++) {
            multiDisplay(count);
            count += step;
        }
    }
}
