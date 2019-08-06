package com.xuxi.observerpatternDemo;

import com.xuxi.interfaceweather.Observer;
import com.xuxi.interfaceweather.Subject;

import java.util.ArrayList;

/**
 * Created by xuxi on 2018/9/8.
 */
public class WeatherDataSt implements Subject {

    private float mTemperatrue;
    private float mPressure;
    private float mHumidity;

    private ArrayList<Observer> mObservers;


    public WeatherDataSt(){
        mObservers = new ArrayList<>();
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

        notifyObservers();

    }

    public void setData(float mTemperatrue,float mPressure,float mHumidity){
        this.mTemperatrue = mTemperatrue;
        this.mPressure = mPressure;
        this.mHumidity = mHumidity;
        dataChange();
    }


    @Override
    public void registerObserver(Observer o) {
        mObservers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        if (mObservers.contains(o)){
            mObservers.remove(o);
        }
    }

    @Override
    public void notifyObservers() {
        for (int i=0,len=mObservers.size();  i < len ; i++){
            mObservers.get(i).update(getmTemperatrue(),getmPressure(),getmHumidity());
        }
    }
}
