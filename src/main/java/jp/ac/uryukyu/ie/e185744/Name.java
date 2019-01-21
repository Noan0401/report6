package jp.ac.uryukyu.ie.e185744;
import java.util.regex.Matcher;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 名前クラス　Inputクラスを継承
 */
public class Name extends Input {

    Name(){ super("^[ぁ-んー]*$"); }

    /**
     * print文をを変える為、Override。
     * @return　入力された名前
     */
    @Override
    String input_str(){
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("ひらがなで名前を入力してください");
        input = in.nextLine();
        return input;
    }
}
