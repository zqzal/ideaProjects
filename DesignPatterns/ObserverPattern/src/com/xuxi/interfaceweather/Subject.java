package com.xuxi.interfaceweather;

/**
 * Created by xuxi on 2018/9/8.
 */
public interface Subject {


    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
