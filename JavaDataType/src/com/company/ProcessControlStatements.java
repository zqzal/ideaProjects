package com.company;

/**
 * Created by xuxi on 2018/5/17.
 */
public class ProcessControlStatements {
    //1.条件语句循环  if语句  switch语句
    //2.循环语句  while循环(当循环)  do while循环(直到循环) for循环
    //3.跳出语句
    public  static void main (String[] args){

      //while(布尔表达式){
        // 循环体
        // }

        //while循环体后语句
        int x = 10;
        while (x>=0){
//            System.out.print(x);
            System.out.println(x);
            x--;
        }
        System.out.println("end");

//do ...while
//        do{http://60.191.54.28:8089/main.do
//
//        }while (布尔表达式);
        int y = 10;
        do{
            System.out.println(y);
            y--;
        }while (y>=0);
        System.out.println("do...while ENd");



        //跳出语句
        //关键字break是用来停止整个循环的。break关键字必须用于任何循环中或一个swithch语句中。关键字break将停止最内层循环的执行，
        //并开始执行在块之后的下一行代码。

        //continue关键字可以在任一环的控制结构使用。它是循环立即跳转到循环的下一次迭代。
        //在for循环中，continue关键字会导致控制流立即跳转到更新语句。
        //在一个while循环或do/while循环，控制流立即跳转到布尔表达式。
        for (int i = 10; i >= 0 ; i--){
//            if (i==5){
//                continue;
//            }
            if (i==5){
                break;
            }
            System.out.println(i);
        }


    }
}
