package jp.ac.uryukyu.ie.e185744;
import java.util.ArrayList;
import java.util.Scanner;


public class Date_Customer {

    /**
     * 仮顧客のデータセットクラス
     * @return　顧客データもちのlist
     */
    ArrayList createList(){
        ArrayList list = new ArrayList();;
        list.add("でんばんかえたい");
        list.add("08012123434");
        list.add("pass1234");
        return list;
    }

    /**
     * scannerを利用した入力クラス
     * @return　入力した番号
     */
    int input(){
        int input;
        Scanner in = new Scanner(System.in);
        System.out.println("何を変更致しますか？");
        System.out.println("1.電話番号　2.パスワード　3.両方");
        input = in.nextInt();
        return input;
    }

    /**
     * このクラスの実行部分
     * if文によって変更したいものを選ぶ。
     */
    void main(){
        Change_Date change_date = new Change_Date();
        change_date.setList(createList());

        Change_Pass change_pass = new Change_Pass();
        change_pass.setList(createList());

        int num = input();

        if(num == 1){
            change_date.check_date(1,1);
            change_date.change_date(2,1,"^[0-9]{9,10}");
        } else if(num == 2){
            change_pass.check_date(1,2);
            change_pass.change_date(2,2,"/^(?=.*?[a-z])(?=.*?\\d)[a-z\\d]{8}$/i");
        } else if (num == 3){
            change_date.check_date(1,1);
            change_date.change_date(2,1,"^[0-9]{9,10}");
            change_pass.check_date(1,2);
            change_pass.change_date(2,2,"/^(?=.*?[a-z])(?=.*?\\d)[a-z\\d]{8}$/i");
        } else {
            num = input();
        }
    }

}
