package jp.ac.uryukyu.ie.e185744;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Name extends Input {

    Name(){
        super("^[ぁ-んー]*$");
    }
    @Override
    String input_str(){
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("ひらがなで名前を入力してください");
        input = in.nextLine();
        return input;
    }
}
