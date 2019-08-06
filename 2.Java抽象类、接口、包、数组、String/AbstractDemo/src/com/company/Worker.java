package com.company;

/**
 * Created by xuxi on 2018/5/20.
 */
public class Worker extends People{

    private float salary;

    public Worker(String _name, int _age,float _salary) {
        super(_name, _age);
        this.salary = _salary;
    }

    @Override
    public String getContet() {
        return "woker-->name:"+getName()+"-->age:"+getAge()+"-->salary:"+this.salary;
    }
}
