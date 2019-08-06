package com.company11_2;

import com.company11_1.Entry;
import com.company11_1.FileTreatMentException;

/**
 * Created by xuxi on 2018/12/24.
 */
public abstract class Entry_11_2 {
    protected Entry_11_2 parent;
    public abstract String getName();
    public abstract int getSize();
    public Entry_11_2 add(Entry_11_2 entry112) throws FileTreatMentException{
        throw  new FileTreatMentException();
    }
    public void printList(){
        printList("");
    }
    protected abstract void printList(String prefix);
    public String toString(){
        return getName() + " (" +getSize() + ")";
    }
    public String getFullName(){
        StringBuffer fullname = new StringBuffer();
        Entry_11_2 entry = this;
        do{
            fullname.insert(0,"/"+entry.getName());
            entry = entry.parent;
        }while (entry != null);
        return fullname.toString();
    }
}
