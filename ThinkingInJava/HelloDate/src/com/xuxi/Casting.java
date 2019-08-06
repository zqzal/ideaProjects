package com.xuxi;

/**
 * Created by xuxi on 2019/1/7.
 */
public class Casting {
    public static void main(String[] args) {
        int i = 200;
        long lng = (long) i;
        lng = i;
        long lng2 =  (long) 200;
        lng2 = 200;
        i = (int)lng2;
    }
}
