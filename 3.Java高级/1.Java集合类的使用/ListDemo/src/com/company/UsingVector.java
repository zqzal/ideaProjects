package com.company;

import java.util.List;
import java.util.Vector;

/**
 * Created by xuxi on 2018/5/24.
 */
public class UsingVector {
    public static void main(String[] args ){


        List<String> list = new Vector<>();
        list.add("a1");
        list.add("b2");
        list.add("c3");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        list.add("a1");
        System.out.println("--------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
