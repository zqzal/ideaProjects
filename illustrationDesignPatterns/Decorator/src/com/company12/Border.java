package com.company12;

/**
 * Created by xuxi on 2018/12/25.
 */
public abstract class Border extends Display {

    protected  Display display;  //表示被装饰物
    protected  Border(Display display){  //在生成实例时通过参数指定被装饰物
        this.display = display;
    }

}
