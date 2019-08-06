package com._10_4;

/**
 * Created by xuxi on 2018/12/20.
 */
public class QuickSorter implements Sorter {
    Comparable[] data;
    @Override
    public void sort(Comparable[] data) {
        this.data = data;
        qsort(0,data.length-1);
    }
    private void qsort(int pre,int post){
        int saved_pre = pre;
        int saved_post = post;
        Comparable mid = data[(pre + post) /2];
        do {
            while (data[pre].compareTo(mid) < 0){
                pre++;
            }
            while (mid.compareTo(data[post]) < 0){
                post--;
            }
        }while (pre <= post);

        if (saved_pre < post){
            qsort(saved_pre,post);
        }
        if (pre < saved_post){
            qsort(pre,saved_post);
        }

    }
}
