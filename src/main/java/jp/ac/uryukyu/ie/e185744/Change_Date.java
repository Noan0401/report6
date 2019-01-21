package jp.ac.uryukyu.ie.e185744;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

/**
 * 電話番号を変更するクラス
 */
public class Change_Date {

    ArrayList list = new ArrayList();
    private String phone_num;

    void setList(ArrayList list) {
        this.list = list;
    }

    public ArrayList getList() {
        return list;
    }

    /**
     * scannerを利用した入力クラス
     * @param num　数字によって表示するprint文が変わる
     * @return　入力した文
     */
    String input(int num){
        String input;
        Scanner in = new Scanner(System.in);

        switch (num){
            case 1:
                System.out.println("設定した電話番号を入力してください");
                break;
            case 2:
                System.out.println("新しく設定する電話番号を入力してください");
                break;
        }

        input = in.nextLine();
        return input;
    }

    /**
     * 登録したデータと合うまで繰り返し
     * @param num　input()のprint文設定
     * @param number　listの何番目か指定
     */
    void check_date(int num,int number){
        String input_num = input(num);

        while (true){
            if(list.get(number).equals(input_num)){
                this.phone_num = input_num;
                break;
            }else {
                input_num = input(num);
            }
        }
    }

    /**
     * 正規表現で判定する。
     * @param pattern 正規表現
     * @param input 入力したもの
     * @return Matcher.find()の結果を返却する。
     */
    boolean findMatches(Pattern pattern, CharSequence input) {
        final Matcher m = pattern.matcher(input);
        return m.find();
    }

    /**
     * 新しく設定する番号を指定する。
     * @param number listの何番を変更するか　
     * @param str　正規表現
     */
    void change_date(int num,int number,String str){
        Pattern p = Pattern.compile(str);
        String input = input(num);
        while (true){
            if(!findMatches(p,input)){
                input = input(num);
            }else break;
        }
        list.set(number,input);
    }
}
