package jp.ac.uryukyu.ie.e185706_e185744;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Input {
    private String str;
    private String regex;

    /**
     * 入力部分
     * @return　入力結果を返却する。
     */
    private String input_str(){
        String input;
        Scanner in = new Scanner(System.in);
        System.out.println("入力してください");
        input = in.nextLine();
        return input;
    }

    /**
     * 正規表現で判定する。
     * @param pattern　正規表現
     * @param input　入力したもの
     * @return Matcher.find()の結果を返却する。
     */
    private boolean findMatches(Pattern pattern, CharSequence input) {
        final Matcher m = pattern.matcher(input);
        return m.find();
    }

    /**
     * このクラスの実行部分
     */
    void input_main(){
        Pattern p = Pattern.compile("^[0-9]*$");
        String input = input_str();
        while (true){
            if(!findMatches(p, input)){
                input = input_str();
            }else break;
        }
    }
}