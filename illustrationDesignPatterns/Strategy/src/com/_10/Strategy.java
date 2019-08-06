package com._10;

/**
 * Created by xuxi on 2018/12/5.
 */
public interface Strategy {

    public abstract Hand nextHand();
    public abstract void study(boolean win);

}
