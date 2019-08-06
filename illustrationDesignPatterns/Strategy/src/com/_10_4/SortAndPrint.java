package com._10_4;

/**
 * Created by xuxi on 2018/12/20.
 */
public class SortAndPrint {
    Comparable[] data;
    Sorter sorter;
    public SortAndPrint(Comparable[] data,Sorter sorter){
        this.data = data;
        this.sorter = sorter;
    }
    public void execute(){
        print();
        sorter.sort(data);
        print();
    }

    private void print() {
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + ", ");
        }
        System.out.println("");
    }
}
