package com._2_8_2;

/**
 * Created by xuxi on 2018/11/6.
 */
public class PrintBannerTwo extends PrintTwo {


    private BannerTwo bannert;

    public PrintBannerTwo(String string){
        this.bannert = new BannerTwo(string);
    }


    @Override
    public void printWeak() {
        bannert.showWithAster();
    }

    @Override
    public void printStrong() {
        bannert.showWithParen();
    }
}
