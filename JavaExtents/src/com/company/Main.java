package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        People people = new People();
        people.run();

        Man man = new Man();
        man.run();
        System.out.println(man.getFatherName());
    }
}
