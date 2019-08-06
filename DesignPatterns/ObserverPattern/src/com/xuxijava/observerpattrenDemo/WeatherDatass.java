package com.xuxijava.observerpattrenDemo;

import java.util.Observable;

/**
 * Created by xuxi on 2018/9/9.
 */
public class WeatherDatass extends Observable{

    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;
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

        this.setChanged();
        this.notifyObservers(new Data(getmTemperatrue(),getmPressure(),getmHumidity()));
    }

    public void setData(float mTemperatrue,float mPressure,float mHumidity){
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }

    public class Data{

        public float mTemperatrue;
        public float mPressure;
        public float mHumidity;
        public Data(float mTemperatrue,float mPressure,float mHumidity){
            this.mTemperatrue = mTemperatrue;
            this.mPressure = mPressure;
            this.mHumidity = mHumidity;
        }


    }

}
