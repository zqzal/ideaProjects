package com.company;

import java.io.OutputStream;

public class Main {

    public int sum(int x,int y){
        return x + y;
    }

    public static void main(String[] args) {
	// write your code here

        Main  mainObject = new Main();

        System.out.println(mainObject.sum(2,3));
        People people = new People();
        people.run();


    }
}
