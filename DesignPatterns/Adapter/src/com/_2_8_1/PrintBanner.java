package com._2_8_1;

/**
 * Created by xuxi on 2018/11/6.
 */
public class PrintBanner extends Banner implements Print{


    public PrintBanner(String string) {
        super(string);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
