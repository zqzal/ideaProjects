package com.xuxi1;

/**
 * Created by xuxi on 2019/1/8.
 */
public class E09_Fibonacci {
    static int fib(int n){
        if (n <= 2)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        args = new String[]{"1","1","2","3","5"};
        int n = Integer.parseInt(args[0]);
        if (n < 0){
            System.out.print("Cannot use negative numbers");
        }
        for (int i = 0; i <= n ; i++) {
            System.out.print(fib(i) + ", ");
        }

    }
}
