package com.xuxi.bridgems;

/**
 * Created by xuxi on 2018/9/21.
 */
public class SonyTvControl extends SonyControl implements TvControl{

    private static int ch = 0;
    private static boolean ison = false;

    @Override
    public void Onoff() {
        if (ison){
            ison = false;
            super.Off();
        }else {
            ison = true;
            super.On();
        }
    }

    @Override
    public void nextChannel() {
        ch++;
        super.setChannel(ch);
    }

    @Override
    public void preChannel() {
        ch--;
        if (ch < 0){
            ch = 200;
        }
        super.setChannel(ch);
    }



}
