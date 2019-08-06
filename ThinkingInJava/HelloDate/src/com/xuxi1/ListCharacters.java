package com.xuxi1;

/**
 * Created by xuxi on 2019/1/7.
 */
public class ListCharacters {
    public static void main(String[] args) {
        for (char c = 0; c < 128 ; c++) {
            if (Character.isLowerCase(c)){
                System.out.println("value: "+ (int)c + " character: " + c);
            }
        }
    }
}
