package jp.ac.uryukyu.ie.e185744;

import java.util.Scanner;

public class Branch {

    int input(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("本日の要件を入力してください");
        System.out.println("1.加入、2.変更");
        input = in.nextInt();
        return input;
    }

    void branch(){
        int num = input();

        if(num == 1){
            Subscription subscription = new Subscription();
            subscription.New();
        }else if(num == 2){

        }else {
            num = input();
        }
    }
}
