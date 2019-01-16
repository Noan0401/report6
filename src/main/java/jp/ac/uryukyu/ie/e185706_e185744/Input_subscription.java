package jp.ac.uryukyu.ie.e185706_e185744;
import java.util.Scanner;

public class Input_subscription {

    int phone_input(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("電話番号を入力してください");
        input = in.nextInt();
        return input;
    }

    String s_input(int number){
        String input;
        Scanner in = new Scanner(System.in);
        switch (number){
            case 1:
                System.out.println("名前を入力して下さい。");
                break;
            case 2:
                System.out.println("メールアドレスを入力して下さい。");
                break;
            case 3:
                System.out.println("パスワードを設定して下さい。");
                break;
        }
        input = in.nextLine();
        return input;
    }

}
