package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/22.
 */

class Tank{
    static int counter;
    int id = counter++;
    boolean full;
    public Tank(){
        System.out.println("Tank " + id +" created");
        full = true;
    }
    public void empty(){
        full = false;
    }
    protected void finalize(){
        if (full){
            System.out.println("Error: tank"+id+" cleanded up OK");
        }else {
            System.out.println("Tank "+id+" cleanded up OK");
        }
    }
    public String toString(){
        return "Tank "+id;
    }
}

public class E12_TankWithTerminationCondition {
    public static void main(String[] args) {
        new Tank().empty();
        new Tank();
        //Do not empty the second one
        System.gc(); // Force finalization?
        System.runFinalization();
    }
}
