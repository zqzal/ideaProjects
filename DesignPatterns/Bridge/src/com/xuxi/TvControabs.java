package com.xuxi;

/**
 * Created by xuxi on 2018/9/21.
 */
public abstract class TvControabs {
    Control mControl = null;
    public TvControabs(Control control){
        this.mControl = control;
    }
    public abstract void Onoff();
    public abstract void nextChannel();
    public abstract void preChannel();

}
