package com.useingarray.demo2;

/**
 * Created by xuxi on 2018/5/21.
 */
public class GetMax {
    public static void main(String[] args){

        int[] score = {60,90,30,100,50,67};
        int max = score[0];
        int min = score[0];
        for (int i = 0; i < score.length; i++){
             if (score[i] > max){
                 max = score[i];

             }
            if (score[i] < min){
                min = score[i];
            }

        }
        System.out.println(max);
        System.out.println(min);



    }
}
