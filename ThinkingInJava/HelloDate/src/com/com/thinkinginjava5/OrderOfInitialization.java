package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/23.
 */


class Window{
    Window(int marker){
        System.out.println("Windwo(" + marker + ")");
    }
}
class House{
    Window w1 = new Window(1);
    House(){
        //Show that we are in the constructor
        System.out.println("Houser()");
        w3 = new Window(33); //Reinitialize w3
    }
    Window w2 = new Window(2); //Afert constructor
    void f(){
        System.out.println("f()");
    }
    Window w3 = new Window(3); //At end
}

public class OrderOfInitialization {

    public static void main(String[] args) {
        House h = new House();
        h.f();//Shows that construction is done
    }
}
