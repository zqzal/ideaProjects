package com.xuxijava.observerpattrenDemo;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by xuxi on 2018/9/9.
 */
public class CurrentConditions implements Observer{


    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    @Override
    public void update(Observable o, Object arg) {

        this.mTemperatrue = ((WeatherDatass.Data)(arg)).mTemperatrue;
        this.mPressure = ((WeatherDatass.Data)(arg)).mPressure;
        this.mHumidity = ((WeatherDatass.Data)(arg)).mHumidity;
        display();
    }

    public void display(){
        System.out.println("***  Today mTemperatrue: "+ mTemperatrue +"***");
        System.out.println("***  Today mPressure: "+ mPressure +"***");
        System.out.println("***  Today mHumidity: "+ mHumidity +"***");
    }
}
