package com.company11_1;

/**
 * Created by xuxi on 2018/12/21.
 */
public abstract class Entry {
    public abstract String getName();             //获取名字
    public abstract int getSize();                //获取大小
    public Entry add(Entry entry) throws FileTreatMentException{ //加入目录条目
        throw new FileTreatMentException();
    }
    public void printList(){            //显示目录条目一览
        printList("");
    }
    protected abstract void printList(String prefix);  //为一览加上前缀并显示目录条目一览

    public String toString(){   //显示代表类的文字
        return getName() + " (" + getSize() + ")";
    }
}
