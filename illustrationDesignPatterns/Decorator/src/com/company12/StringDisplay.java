package com.company12;

/**
 * Created by xuxi on 2018/12/25.
 */
public class StringDisplay extends Display {

    private String string;          //要显示的字符串
    public StringDisplay(String string){ //通过参数传入显示的字符串
        this.string = string;
    }

    @Override
    public int getColumns() {    //字符数
        return string.getBytes().length;
    }

    @Override
    public int getRows() {    //行数是1
        return 1;
    }

    @Override
    public String getRowTex(int row) {  //仅当row为0s时返回值
        if (row == 0){
            return string;
        }
        return null;
    }
}
