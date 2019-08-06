package com.company;

/**
 * Created by xuxi on 2018/5/21.
 */
public class Bclas {

    public void tell(){

        call(new Inter() {
            @Override
            public void print() {
                System.out.println("rangbingluan");
            }
        });

    }

    public void call(Inter i){

        i.print();

    }
}
