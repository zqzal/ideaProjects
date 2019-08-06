package com._9_3;

import com._9.Display;
import com._9.DisplayImpl;

/**
 * Created by xuxi on 2018/11/26.
 */
public class CharDisplayImpl extends DisplayImpl {
    private char head;
    private char body;
    private char foot;

    public CharDisplayImpl(char head,char body,char foot){
        this.head = head;
        this.body = body;
        this.foot = foot;
    }

    @Override
    public void rawOpen() {
        System.out.print(head);
    }

    @Override
    public void rawPrint() {
        System.out.print(body);
    }

    @Override
    public void rawClose() {
        System.out.println(foot);
    }
}
