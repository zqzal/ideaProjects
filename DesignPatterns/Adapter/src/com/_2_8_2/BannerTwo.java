package com._2_8_2;

/**
 * Created by xuxi on 2018/11/6.
 */
public class BannerTwo {

    private String string;

    public BannerTwo(String string){
        this.string = string;
    }

    public void showWithParen(){
        System.out.println("(" + string + ")");
    }

    public void showWithAster(){
        System.out.println("*" + string + "*");
    }
}
