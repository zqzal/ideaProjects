package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/21.
 */
class Book{
    boolean checkedOut = false;
    Book(boolean checkedOut){
        this.checkedOut = checkedOut;
    }
    void checkIn(){
        checkedOut = false;
    }
    protected void finalize(){
        if (checkedOut){
            System.out.println("Error: checked out");
        }
        //Normally,you will also do this;
        //super.finalize(); //Call the base-class version
    }
}
public class TerminationConditon {
    public static void main(String[] args) {
        Book novel = new Book(true);
        //Proper cleanup
        novel.checkIn();
        //Drop the reference,forget to clean up;
        new Book(true);
        //Force garbage collection & finalization
        System.gc();
    }
}
