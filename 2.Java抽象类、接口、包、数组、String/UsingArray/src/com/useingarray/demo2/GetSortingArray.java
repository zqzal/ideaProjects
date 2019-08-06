package com.useingarray.demo2;

import javafx.scene.chart.BubbleChart;

/**
 * Created by xuxi on 2018/5/21.
 */
public class GetSortingArray {

     public static void main(String[] args){

     int[] score = {19,34,35,5,7};

     for (int i=1;i<score.length;i++){

     //            System.out.println(score[i]);

       for (int j = 0; j < score.length ; j++) {

     //                System.out.println("排列前 "+score[i]+ " " +score[j]);

               if (score[i] < score[j]){

                   int temp = score[i];
                   score[i] = score[j];
                   score[j] = temp;

                }


     }

     }

     for (int i = 0; i < score.length; i++) {
       System.out.println(score[i]+"\t");
     }


     }







}
