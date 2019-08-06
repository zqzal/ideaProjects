package com.xuxi.observerpatternDemo;

/**
 * Created by xuxi on 2018/9/8.
 */
public class InternetWeathers {
    public static void main(String[] args) {
        CurrentConditions currentConditions;
        ForcastConditions forcastConditions;
        WeatherDataSt weatherDataSt;

        weatherDataSt = new WeatherDataSt();
        currentConditions = new CurrentConditions();
        forcastConditions = new ForcastConditions();
        weatherDataSt.registerObserver(currentConditions);
        weatherDataSt.registerObserver(forcastConditions);
        weatherDataSt.setData(31,152,40);

        weatherDataSt.removeObserver(currentConditions);
        weatherDataSt.setData(32,153,41);

    }
}
