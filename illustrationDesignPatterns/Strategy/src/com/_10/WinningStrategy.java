package com._10;

import java.util.Random;

/**
 * Created by xuxi on 2018/12/18.
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed){
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if (!won){
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    @Override
    public void study(boolean win) {
        won = win;
    }
}
