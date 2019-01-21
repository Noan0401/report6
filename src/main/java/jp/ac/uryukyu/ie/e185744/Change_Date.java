package jp.ac.uryukyu.ie.e185744;
import java.util.ArrayList;
import java.util.Scanner;

public class Change_Date {

    ArrayList list;
    private String phone_num;

    Change_Date(){
        Subscription subscription = new Subscription();
        this.list = subscription.getList();
    }

    void setList(ArrayList list) {
        this.list = list;
    }

    public ArrayList getList() {
        return list;
    }

    String input(){
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("設定した電話番号を入力してください");
        input = in.nextLine();
        return input;
    }

    void check_date(int num){
        String input_num = input();

        while (true){
            if(input_num.equals(list.get(num))){
                this.phone_num = input_num;
                break;
            }else {
                input_num = input();
            }
        }
    }

    void change_date(int num){
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("新しく設定する電話番号を入力してください");
        input = in.nextLine();

        list.set(num,input);
    }
}
