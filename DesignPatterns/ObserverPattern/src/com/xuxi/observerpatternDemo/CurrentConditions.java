package com.xuxi.observerpatternDemo;

import com.xuxi.interfaceweather.Observer;

/**
 * Created by xuxi on 2018/9/8.
 */
public class CurrentConditions implements Observer{

    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(float mTemperatrue, float mPressure, float mHumidity) {
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        display();
    }

    public void display(){
        System.out.println("***  Today mTemperatrue: "+ mTemperatrue +"***");
        System.out.println("***  Today mPressure: "+ mPressure +"***");
        System.out.println("***  Today mHumidity: "+ mHumidity +"***");
    }

}
