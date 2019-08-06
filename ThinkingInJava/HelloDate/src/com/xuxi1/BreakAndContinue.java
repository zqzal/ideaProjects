package com.xuxi1;

/**
 * Created by xuxi on 2019/1/7.
 */

/**
 * berak用于强行退出循环，不执行循环中剩余的语句。
 * 而continue则停止执行当前的迭代，然后退出循环起始处，开始下一次迭代
 */
public class BreakAndContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            if (i == 74)
                break;
            if (i % 9 != 0)
                continue;;
            System.out.print(i + " ");
        }
        System.out.println();

        int i = 0;
        while (true){
            i++;
            int j = i*27;
            if (j == 1269)
                break;
            if (i % 10 != 0)
                continue;
            System.out.print(i+ " ");
        }

        for (int j = 0; j < 100; j++) {
            System.out.println(j + " ");
            if (j == 99)
//                break;
            return;

        }


    }
}
