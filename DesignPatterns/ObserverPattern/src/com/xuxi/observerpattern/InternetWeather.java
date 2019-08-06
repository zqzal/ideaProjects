package com.xuxi.observerpattern;

/**
 * Created by xuxi on 2018/9/8.
 * 气象站
 */

/**
 * 1.Interner气象站项目：
 *     提供温度、气压和湿度的接口
 *     测量数据更新时需时时通知给第三方
 *     需要设计开放性API，便于其他第三方公司也能接入气象站获取数据
 *
 * 2.WeatherData类
 *     WeatherData
 *   getTemperature()
 *   getHumidity()              气象站
 *   getPresssure()
 *   dataChange()
 *
 *
 * 一个通常的设计方案
 *
 *   CurrentConditons                    WeatherData
 *
 *   update()                     getTemperature()
 *   display()                    getHumidity()
 *                                getPressure()
 *                                dataChange()
 */

/**
 * 观察者模式原理
 *
 * 1、观察者模式就像定牛奶业务
 *   1）奶站，Subject
 *   2）用户，Observer
 * 2、Subject：登记注册、移除和通知
 *     <interface>
 *       Subject
 *    registerObserver()
 *    removeObserver()
 *    notifyObservers()
 * 3、Observer：接受输入
 *    <interface>
 *      Observer
 *    update()
 *
 * 4、观察者模式：对象之间多对一依赖的一种设计方案，被依赖的对象为Subject，依赖的对象
 *   为Observer，Subject通知Observer变化
 *
 *
 */

/**
 *  观察者模式重新设计的方案
 *
 *    <interface>                        <interface>
 *      Subject                            Observer
 *   registerObserver()                    update()
 *   removeObserver()
 *   notifyObservers()
 *
 *        ^                                  ^
 *        |                                  |
 *    WeatherData                      CurrentConditions
 *   registerObserver()    <-------
 *   removeObserver()      <-------        update()
 *   notifyObservers()     ------->        display()
 */
public class InternetWeather {

    public static void main(String[] args) {
        CurrnetCondition currnetConditions;
        WeatherData weatherData;
        currnetConditions = new CurrnetCondition();
        weatherData = new WeatherData(currnetConditions);
        weatherData.setData(30,150,40);

    }
}
