package com.xuxijava.observerpattrenDemo;

/**
 * Created by xuxi on 2018/9/9.
 */

/**
 * Java内置观察者
 *
 * 1、Java内置的观察者
 *    Observable
 *    Observer
 * 2、用Java内置观察者重新设计该项目
 * 3、内置观察者的注意点
 *    Observable是类而不是接口
 *
 */

/**
 * 1、示例项目中问题分析
 * 2、观察者模式的意义
 * 3、松耦合、高内聚、隔离影响的意义
 * 4、使用Java内置观察者的注意点
 *
 *
 */
public class InternetWeather {
    public static void main(String[] args) {
        CurrentConditions currentConditions;
        ForcastConditions forcastConditions;
        WeatherDatass weatherDatass;

        currentConditions = new CurrentConditions();
        forcastConditions = new ForcastConditions();
        weatherDatass = new WeatherDatass();


        weatherDatass.addObserver(currentConditions);
        weatherDatass.addObserver(forcastConditions);
        weatherDatass.setData(2,5,9);

        weatherDatass.deleteObserver(currentConditions);
        weatherDatass.setData(4,6,9);

    }
}
