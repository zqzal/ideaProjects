package com.company12;

/**
 * Created by xuxi on 2018/12/25.
 */
public class SileBorder extends Border {
    private char borderChar;      //表示装饰边框的字符
    protected SileBorder(Display display,char ch) {  //通过构造函数指定Didplay和装饰边框字符
        super(display);
        this.borderChar = ch;
    }

    @Override
    public int getColumns() {
        return 0;
    }

    @Override
    public int getRows() {
        return 0;
    }

    @Override
    public String getRowTex(int row) {
        return null;
    }
}
