package com.company;

import sun.util.resources.cldr.mas.CalendarData_mas_KE;

/**
 * Created by xuxi on 2018/5/18.
 */
public class People {
    private String name;
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public People(){
        //默认构造方法
        System.out.println("default people");
        this.name = "赵四";
        this.age = 32;
    }

    public void run(){
        System.out.println("default people run");
    }

    public static void talk(){
        System.out.println("default peope talk");
    }

    public People(String _name,int _age){
        //自定义构造方法
        System.out.println("custom people");
        this.name = _name;
        this.age = _age;
    }



}
