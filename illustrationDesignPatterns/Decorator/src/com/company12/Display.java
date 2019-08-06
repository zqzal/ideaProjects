package com.company12;

/**
 * Created by xuxi on 2018/12/25.
 */
public abstract class Display {
    public abstract int getColumns();   //获取横向字符数
    public abstract int getRows();      //获取纵向行数
    public abstract String getRowTex(int row);   //获取第row行的字符串
    public final void show(){  //全部显示
        for (int i = 0; i < getRows(); i++) {
            System.out.println(getRowTex(i));
        }
    }

}
