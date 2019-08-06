package com.xuxi.compositepattern;

/**
 * Created by xuxi on 2018/9/30.
 */

import java.util.List;

/**
 * Component
 */
public abstract class Employer {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void add(Employer employer);

    public abstract void delete(Employer employer);

    public List<Employer> employers;

    public void printInfo(){
        System.out.println(name);
    }

    public List<Employer> getEmployers() {
        return employers;
    }
}
