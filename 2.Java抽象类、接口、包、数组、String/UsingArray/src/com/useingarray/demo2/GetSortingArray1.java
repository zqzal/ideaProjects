package com.useingarray.demo2;



/**
 * Created by xuxi on 2018/5/21.
 */
public class GetSortingArray1 {

    public static void main(String[] args) {
        int[] arr = {1,1,2,0,9,3,12,7,8,3,4,65,22};

//        GetSortingArray1.bubbleSort1(arr, arr.length);

        GetSortingArray1.bubbleSort(arr);


//        for(int i:arr){
////            System.out.print(i+"\t");
//            System.out.println(i);
//        }

        for (int i:arr) {

            System.out.println(i);

        }


    }

    /**
     * 冒泡排序的第一种实现, 没有任何优化
     * @param a
     * @param n
     */
    public static void bubbleSort1(int [] a, int n){
        int i, j;

        for(i=0; i<n; i++){//表示n次排序过程。
            for(j=1; j<n-i; j++){
                if(a[j-1] > a[j]){//前面的数字大于后面的数字就交换
                    //交换a[j-1]和a[j]
                    int temp;
                    temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;
                }
            }
        }
    }// end


    public static void bubbleSort(int[] array) {
        if (null == array || array.length == 0)
            return;
        int temp;
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[j];
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }
    }



}
