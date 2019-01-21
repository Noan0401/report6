package jp.ac.uryukyu.ie.e185744;

import java.util.Scanner;

/**
 * Change_Dateを継承したパスワードを変更するクラス
 */
public class Change_Pass extends Change_Date {

    Change_Pass(){ super(); }

    /**
     * scannerを利用した入力クラス
     * @param num　数字によって表示するprint文が変わる
     * @return 入力したパスワード
     */
    @Override
    String input(int num){
        String input;
        Scanner in = new Scanner(System.in);

        switch (num){
            case 1:
                System.out.println("設定したパスワードを入力してください");
                break;
            case 2:
                System.out.println("新しく設定するパスワードを入力してください");
                break;
        }

        input = in.nextLine();
        return input;
    }
}
