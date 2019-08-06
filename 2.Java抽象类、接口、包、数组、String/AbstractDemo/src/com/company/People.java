package com.company;

/**
 * Created by xuxi on 2018/5/20.
 */
abstract public class People {

    private String name;

    private int age;

    public People(String _name ,int _age){

    }

    public void say(){
        System.out.println(getContet());
    }

    public abstract String getContet();

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
