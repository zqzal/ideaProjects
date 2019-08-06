package com.company;

public class Main {
    static String[] firstNameArr = {"徐","张","刘","王","董","胡"};
    static String[] lastNameArr = {"xx","dd","cc","ee","ww","qq"};

    public static void main(String[] args) {
	// write your code here
        GirlFriend girlFriend = new GirlFriend("zhangan",3);

        System.out.println(girlFriend.getName());
        System.out.println(girlFriend.getAge());

        for (int i = 0 ; i < 1000; i++){
//            System.out.println(firstNameArr[(int)(Math.random()*firstNameArr.length)]);

            String firstName =  firstNameArr[(int)(Math.random()*firstNameArr.length)];
            String lastName = lastNameArr[(int)(Math.random()*lastNameArr.length)];
            int ages = (int)(Math.random()*10)+15;
//            System.out.println("name:"+firstName+lastName+",age:"+ages);

            GirlFriend girlFriend1 = new GirlFriend(firstName+lastName,ages);
//            System.out.println(girlFriend1.getName()+"  "+girlFriend1.getAge());
            System.out.println(girlFriend1.toString());

        }

    }
}
