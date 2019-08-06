package com.company;

/**
 * Created by xuxi on 2018/5/19.
 */
public class GirlFriend {
    private String name;
    private int age;


    public GirlFriend(String _name,int _age){
        this.name = _name;
        this.age = _age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

//        System.out.println(String.format("名字是:%s 年龄是:%d",getName(),getAge()));
//        return super.toString();
        return String.format("名字是:%s 年龄是:%d",getName(),getAge());
    }
}
