package jp.ac.uryukyu.ie.e185744;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;


//このクラスは使っていません

public class Input_subscription {
    private String name;
    private String mail_address;
    private String phone_number;
    private String pass;


    Input_subscription(){
        this.name = s_input(1);
        this.mail_address = s_input(2);
        this.phone_number = s_input(3);
        this.pass = s_input(4);
    }

    public String getName() { return name; }

    public String getMail_address() { return mail_address; }

    public String getPhone_number() { return phone_number; }

    public String getPass() { return pass; }


    /**
     * 入力関係
     * @param number　数字によってprintlnの表示が変わります。
     * @return 入力したものを返します。
     */
    String s_input(int number) {
        String input;
        Scanner in = new Scanner(System.in);
        switch (number) {
            case 1:
                System.out.println("名前を入力して下さい。");
                break;
            case 2:
                System.out.println("メールアドレスを入力して下さい。");
                break;
            case 3:
                System.out.println("電話番号を入力して下さい。");
                break;
            case 4:
                System.out.println("パスワードを設定して下さい。");
        }
        input = in.nextLine();
        return input;
    }

}

