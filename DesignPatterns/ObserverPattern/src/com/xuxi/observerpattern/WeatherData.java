package com.xuxi.observerpattern;

/**
 * Created by xuxi on 2018/9/8.
 * 天气数据
 */
public class WeatherData {

    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;
    private CurrnetCondition mCurrnetConditions;

    public WeatherData(CurrnetCondition currnetConditions){
        this.mCurrnetConditions = currnetConditions;
    }


    public float getmTemperatrue() {
        return mTemperatrue;
    }

    public float getmPressure() {
        return mPressure;
    }

    public float getmHumidity() {
        return mHumidity;
    }

    public void dataChange(){

        mCurrnetConditions.updata(getmTemperatrue(),getmPressure(),getmHumidity());

    }

    public void setData(float mTemperatrue,float mPressure,float mHumidity){
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

}
