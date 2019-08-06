package com.company;

/**
 * Created by xuxi on 2018/5/18.
 */
public class ThisAndSuperSun extends ThisAndSuper {
    public ThisAndSuperSun(String _name) {
        super(_name);
        System.out.println("ThisAndSuperSun");
        System.out.println(super.age);
    }
}
