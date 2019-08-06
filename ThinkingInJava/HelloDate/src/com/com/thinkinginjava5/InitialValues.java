package com.com.thinkinginjava5;

/**
 * Created by xuxi on 2019/1/22.
 */

class InitialValues2{
    boolean bool = true;
    char ch = 'x';
    byte b = 47;
    short s = 0xff;
    int i = 999;
    long lng = 1;
    float f = 3.14f;
    double d = 3.14159;
}
class Depth{

}
public class InitialValues {

    void f(){
//        int i;
//        i++;//Error -- i not initialized
    }

    boolean t;
    char c;
    byte b;
    short s;
    int i;
    long l;
    float f;
    double d;
    InitialValues reference;
    void printInitialValues(){
        System.out.println("Data type     Initial value");
        System.out.println("boolean "+t);
        System.out.println("char "+c);
        System.out.println("byte "+b);
        System.out.println("short "+s);
        System.out.println("int "+i);
        System.out.println("long "+l);
        System.out.println("float "+f);
        System.out.println("double "+d);
        System.out.println("referenc "+reference);
    }

    public static void main(String[] args) {
        InitialValues iv = new InitialValues();
        iv.printInitialValues();
        Depth d = new Depth();
    }

}
