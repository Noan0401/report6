package jp.ac.uryukyu.ie.e185706_e185744;

import java.util.Scanner;

public class Passward extends Input{

    Passward(){
        super("/^(?=.*?[a-z])(?=.*?\\d)[a-z\\d]{8,100}$/i");
    }
    @Override
    String input_str(){
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("パスワードを決めてください。");
        System.out.println("*半角英字と半角数字それぞれ1文字以上含む,8文字以上でお願い致します。" );
        input = in.nextLine();
        return input;
    }
}
