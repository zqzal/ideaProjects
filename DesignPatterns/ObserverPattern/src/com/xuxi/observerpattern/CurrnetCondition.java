package com.xuxi.observerpattern;

/**
 * Created by xuxi on 2018/9/8.
 * 公告版
 */
public class CurrnetCondition {

    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    public void updata(float mTemperatrue,float mPressure,float mHumidity){
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
