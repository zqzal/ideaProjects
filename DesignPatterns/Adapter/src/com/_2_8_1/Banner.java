package com._2_8_1;

/**
 * Created by xuxi on 2018/11/6.
 */
public class Banner {

    private String string;

    public Banner(String string){
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }




}
