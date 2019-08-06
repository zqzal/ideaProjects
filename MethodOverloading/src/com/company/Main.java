package com.company;

public class Main {

    /**
     *  什么是方法重载
     *
     *  方法重载：是静态多态，是编译时的多态
     *  发生在一个类里面，方法名相同，但参数的个数或者种类不同的方法之间的关系，
     *  称之为方法重载
     *  使你的程序编写更灵活
     *
     */

    public int add(int x,int y){
        return x+y;
    }

    public int add(int x,int y,int z){
        return x+y+z;
    }

    public float add(float x,float y){
        return x+y;
    }

    public int add(int...value){
//        System.out.println(value);
        int temp = 0;
        for (int i=0 ; i<value.length ; i++){
            temp+=value[i];
        }

        return temp;
    }

    public static void main(String[] args) {
	// write your code here
        Main main = new Main();
        System.out.println(main.add(1,2));
        System.out.println(main.add(1,2,3));
        System.out.println(main.add(1.2f,2.3f));
        System.out.println(main.add(1,2,3,4,5,6,7,8,9,10));
    }
}
