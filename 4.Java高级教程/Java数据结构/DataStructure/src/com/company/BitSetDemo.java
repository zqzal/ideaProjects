package com.company;

import java.util.BitSet;

/**
 * Created by xuxi on 2018/11/6.
 */
public class BitSetDemo {
    public static void main(String[] args) {
        BitSet bits1 = new BitSet(16);
        BitSet bits2 = new BitSet(16);

        for(int i=0; i<16; i++){
            if((i%2) == 0) bits1.set(i);
            if((i%5) != 0) bits2.set(i);
        }

        System.out.println("Initial pattern in bits1:");
        System.out.println(bits1);


    }
}
