package jp.ac.uryukyu.ie.e185744;

import java.util.Scanner;

/**
 * 要件を選択できるクラス
 */
public class Branch {

    /**
     * 数字を入力して要件を選ぶ。
     * @return　intのみ、選択した数字。
     */
    int input(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("本日の要件を入力してください");
        System.out.println("1.加入、2.変更");
        input = in.nextInt();
        return input;
    }

    /**
     * 加入か変更か選べる。
     */
    void branch(){
        int num = input();

        while (true){
            if(num == 1){
                Subscription subscription = new Subscription();
                subscription.New();
                break;
            }else if(num == 2){
                Date_Customer date_customer = new Date_Customer();
                date_customer.main();
                break;
            }else {
                num = input();
            }
        }

    }
}
