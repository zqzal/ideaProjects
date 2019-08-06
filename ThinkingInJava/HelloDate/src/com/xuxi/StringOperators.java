package com.xuxi;

/**
 * Created by xuxi on 2019/1/7.
 */
public class StringOperators {
    public static void main(String[] args) {
        int x = 0,y = 1,z = 2;
        String s = "x , y , z ";
        System.out.println(s+ x + y + z);
        System.out.println(x + " " + s);
        s += "(summed) = ";
        System.out.println(s + (x + y +z));
        System.out.println("" + x);
    }
}
