package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/22.
 */

class Tanks{
    int howFull = 0;
    Tanks(){
        this(0);
    }

    Tanks(int fullness) {
        howFull = fullness;
    }

    void sayHowFull(){
        if (howFull == 0){
            System.out.println("Tank is empty");
        }else {
            System.out.println("Tank filling status = " + howFull);
        }
    }

    void empty(){
        howFull = 0;
    }

    protected  void finalize(){
        if (howFull != 0){
            System.out.println("Error: Tank not empty");
        }
        //Normally,you will also do this:
        //super.finalize()
        //Call the base-class version
    }
}

public class TankTest {

    public static void main(String[] args) {
        Tanks tanks1 = new Tanks();
        Tanks tanks2 = new Tanks(3);
        Tanks tanks3 = new Tanks(5);
        tanks2.empty();
        new Tanks(6);
        System.out.println("Check tanks:");
        System.out.println("tanks1:");
        tanks1.sayHowFull();
        System.out.println("tank2");
        tanks2.sayHowFull();
        System.out.println("tank3");
        tanks3.sayHowFull();
        System.out.println("first forced gc():");
        System.gc();
        //Force finalization on exit but using method
        //deprecated since JDK 1.1
//        System.out.println("try deprecated runFinalizersOnExit(true)");
//        System.runFinalizersOnExit(true);
//        System.gc();

    }
}
