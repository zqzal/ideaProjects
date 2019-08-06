package com.company;

/**
 * Created by xuxi on 2018/11/17.
 */
public abstract class Builder {

    public abstract void makeTitle(String title);
    public abstract void makeString(String str);
    public abstract void makeItems(String[] items);
    public abstract void close();

}
