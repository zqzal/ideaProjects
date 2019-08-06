package com.company;

/**
 * Created by xuxi on 2018/5/20.
 */
public class Cat extends PetShop implements Pet,Eat {
    @Override
    public void play() {
        System.out.println(Pet.name+"玩");
    }

    @Override
    public void call() {
        System.out.println(Pet.name+"叫");
    }

    @Override
    public void edaFood() {
        System.out.println(Pet.name+"吃");
    }

    @Override
    public void pettoy() {
        System.out.println(Pet.name+"老鼠");
    }
}
