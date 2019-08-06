package com.xuxi;

/**
 * Created by xuxi on 2019/1/7.
 */
public class Overflow {
    public static void main(String[] args) {
        int big = Integer.MAX_VALUE;
        System.out.println("big = "+big);
        int bigger = big*4;
        System.out.println("bigger = "+bigger);
    }
}
