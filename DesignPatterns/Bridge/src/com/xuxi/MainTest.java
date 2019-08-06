package com.xuxi;

/**
 * Created by xuxi on 2018/9/21.
 */

/**
 * Bridge
 * 桥接模式原理：
 *   将实现和抽象放在两个不同的类层次中，使两个层次可以独立改变
 *
 *
 *   桥接的目的是分离抽象与实现，使抽象和实现可以独立变化
 *   系统有多维角度分类时，而每一种分类又有可能变化，考虑使用桥接模式
 *
 * 桥接模式和策略模式差异
 *   桥接的目的是让接口实现和抽象层可以分别演化，从而提供移植性
 *   策略的目的是将复杂的算法封装起来，从而便于替换不同的算法
 *
 *   桥接模式往往是为了利用已有的方法或类
 *   策略模式是为了扩展和修改，并提供动态配置
 *
 *   桥接模式强调接口对象仅提供基本操作
 *   策略模式强调接口对象提供的是一种算法
 *
 */

public class MainTest {
    public static void main(String[] args) {
        TvControl mLGTvcontrol;
        TvControl mSonyTvControl;
        NewTvControl mSonyTvControlOne;

        mLGTvcontrol = new TvControl(new LGControl());
        mSonyTvControl = new TvControl(new SonyControl());

        mLGTvcontrol.Onoff();
        mLGTvcontrol.nextChannel();
        mLGTvcontrol.nextChannel();
        mLGTvcontrol.preChannel();
        mLGTvcontrol.Onoff();

        mSonyTvControl.Onoff();
        mSonyTvControl.nextChannel();
        mSonyTvControl.nextChannel();
        mSonyTvControl.preChannel();
        mSonyTvControl.Onoff();

        mSonyTvControlOne = new NewTvControl(new SonyControl());
        mSonyTvControlOne.Onoff();
        mSonyTvControlOne.nextChannel();
        mSonyTvControlOne.setChannel(9);
        mSonyTvControlOne.setChannel(28);
        mSonyTvControlOne.Back();
        mSonyTvControlOne.Onoff();



    }
}
