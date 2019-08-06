package com.xuxi;

/**
 * Created by xuxi on 2018/9/21.
 */
public class TvControl extends TvControabs{

    private static int ch = 0;
    private static boolean ison = false;

    public TvControl(Control control) {
        super(control);
    }

    @Override
    public void Onoff() {
        if (ison){
            ison = false;
            mControl.Off();
        }else {
            ison = true;
            mControl.On();
        }
    }

    @Override
    public void nextChannel() {
        ch++;
        mControl.setChannel(ch);
    }

    @Override
    public void preChannel() {
        ch--;
        if (ch < 0){
            ch = 200;
        }
        mControl.setChannel(ch);
    }
}
