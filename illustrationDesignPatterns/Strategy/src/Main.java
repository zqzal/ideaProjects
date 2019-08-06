/**
 * Created by xuxi on 2018/12/5.
 */

/**
 * Strategy模式 -- 整体地替换算法
 */

import com._10.Hand;
import com._10.Player;
import com._10.ProbStrategy;
import com._10.WinningStrategy;

/**
 * Strategy的意思是"策略"，指的是敌军对垒时行军作战的方法。在编程中，我们可以将它理解为"算法"
 *
 * 无论什么程序，其目的都是解决问题。而为了解决问题，我们又需要编写特定的算法。使用Strategy模式可以
 * 整体地替换算法的实现部分。能够整体地替换算法，能让我们轻松地以不同的算法去解决同一个问题，这种模式
 * 就是Strategy模式。
 */
public class Main {
    public static void main(String[] args) {
        args = new String[]{"0","1","2"};
        if (args.length != 2){
            System.out.println("args[0]"+args[0]);
            System.out.println("args[1]"+args[1]);
//            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);
        Player player1 = new Player("Taro",new WinningStrategy(seed1));
        Player player2 = new Player("Hana",new ProbStrategy(seed2));
        for (int i = 0;i < 10000; i++){
            Hand nextHand1 = player1.nextHand();
            Hand nextHand2 = player2.nextHand();
            if (nextHand1.isStrongerThan(nextHand2)){
                System.out.println("Winner:"+player1);
                player1.win();
                player2.lose();
            }else if(nextHand2.isStrongerThan(nextHand1)){
                System.out.println("Winner:"+player2);
                player1.lose();
                player2.win();
            }else {
                System.out.println("Even...");
                player1.even();
                player2.even();
            }
        }
        System.out.println("Total result:");
        System.out.println(player1.toString());
        System.out.println(player2.toString());

    }
}
