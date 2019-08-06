package com._9_1;

import com._9.CountDisplay;
import com._9.DisplayImpl;

import java.util.Random;

/**
 * Created by xuxi on 2018/11/26.
 */
public class RandomCountDisplay extends CountDisplay { //继承CountDisplay

    private Random random = new Random();

    public RandomCountDisplay(DisplayImpl imp1) {
        super(imp1);
    }

    public void randomDisplay(int times) {
        multiDisplay(random.nextInt(times));
    }
}
