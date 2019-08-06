package com.company;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by xuxi on 2018/11/6.
 */
public class EnumerationTester {
    public static void main(String[] args) {
        Enumeration<String> days;
        Vector<String> dayNames = new Vector<>();
        dayNames.add("Sunday");
        days = dayNames.elements();
        while (days.hasMoreElements()){
            System.out.println(days.nextElement());
        }


    }
}
