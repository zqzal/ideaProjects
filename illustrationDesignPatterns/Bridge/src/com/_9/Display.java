package com._9;

/**
 * Created by xuxi on 2018/11/22.
 */
public class Display {

    private DisplayImpl impl;

    public Display(DisplayImpl imp1){
        this.impl = imp1;
    }
    public void open(){
        impl.rawOpen();
    }
    public void print(){
        impl.rawPrint();
    }
    public void close(){
        impl.rawClose();
    }
    public final void display(){
        open();
        print();
        close();
    }

}
