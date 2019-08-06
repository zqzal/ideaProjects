package com._10_4;

/**
 * Created by xuxi on 2018/12/20.
 */
public class _10_4_Main {
    public static void main(String[] args) {
        String[] data = {
           "Dumpty","Bowman","Carroll","Elfland","Alice"
        };
//        SortAndPrint sap = new SortAndPrint(data,new SelectionSorter());
//        sap.execute();
        SortAndPrint sap = new SortAndPrint(data,new QuickSorter());
        sap.execute();
    }
}
