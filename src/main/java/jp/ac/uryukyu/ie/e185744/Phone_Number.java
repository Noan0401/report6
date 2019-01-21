package jp.ac.uryukyu.ie.e185744;

import java.util.Scanner;

public class Phone_Number extends Input {

    Phone_Number(){
        super("^[0-9]{9,10}");
    }
    @Override
    String input_str(){
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("電話番号を入力してください");
        input = in.nextLine();
        return input;
    }

}
