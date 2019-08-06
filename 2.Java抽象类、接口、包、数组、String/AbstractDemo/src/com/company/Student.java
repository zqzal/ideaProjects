package com.company;

/**
 * Created by xuxi on 2018/5/20.
 */
public class Student extends People {

    private float score;

    public Student(String name,int age,float _score){
        super(name,age);
        this.score = _score;
    }

    @Override
    public String getContet() {
        return "StudnetInfo-->name:"+getName()+"-->age:"+getAge()+"-->score:"+this.score;
    }
}
