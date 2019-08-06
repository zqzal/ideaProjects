package com._9;

import com._9_1.RandomCountDisplay;
import com._9_1.RandomDisplay;
import com._9_2.FileDisplayImpl;
import com._9_3.CharDisplayImpl;
import com._9_3.IncreaseDisplay;

import java.util.Random;

public class Main {
    //Birdge模式  将类的功能层次结构与实现层次结构分离
    public static void main(String[] args) {
	// write your code here

        Display d1 = new Display(new StringDisplayImpl("Hello,China."));
        Display d2 = new CountDisplay(new StringDisplayImpl("Hello,World."));
        CountDisplay d3 = new CountDisplay(new StringDisplayImpl("Hello,Universe."));
        d1.display();
        System.out.println("\n");
        d2.display();
        System.out.println("\n");
        d3.display();
        System.out.println("\n");
        d3.multiDisplay(5);
        System.out.println("\n");
        //9-1
        RandomDisplay d4 = new RandomDisplay(new StringDisplayImpl("Hello RandomDisplay"));
        Random random = new Random();
        d4.randomDisplay(random.nextInt(10));

        System.out.println("\n");
        RandomCountDisplay d5 = new RandomCountDisplay(new StringDisplayImpl("Hello RandomCountDisplay"));
        d5.randomDisplay(10);

        System.out.println("\n");
        //9-2  写入自己文件的目录
        CountDisplay d6 = new CountDisplay(new FileDisplayImpl("/Users/xuxi/IdeaProjects/illustrationDesignPatterns/Bridge/src/star.txt"));
        d6.multiDisplay(3);

        System.out.println("\n");
        //9-3
        IncreaseDisplay d7 = new IncreaseDisplay(new CharDisplayImpl('<','*','>'),1);
        IncreaseDisplay d8 = new IncreaseDisplay(new CharDisplayImpl('|','#', '-'),2);
        d7.increaseDisplay(4);
        d8.increaseDisplay(6);

    }
}
