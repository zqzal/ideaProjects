package com.xuxi.bridgems;

/**
 * Created by xuxi on 2018/9/21.
 */
public interface Control {

    void On();
    void Off();
    void setChannel(int ch);
    void setVolume(int vol);

}
