package jp.ac.uryukyu.ie.e185744;
import java.util.ArrayList;

/**
 * 名前、電話番号、パスワードの実行をまとめたクラス。
 */
public class Subscription {

    private String name;
    private String phone_number;
    private String pass;

    /**
     * 名前、電話番号、パスワードを作るメソッド。
     */
    void New(){
        Name name = new Name();
        name.input_main();
        this.name = name.getStr();

        Phone_Number phone_number = new Phone_Number();
        phone_number.input_main();
        this.phone_number = phone_number.getStr();

        Passward passward = new Passward();
        passward.input_str();
        this.pass = passward.getStr();

        createList();
    }

    /**
     * New()で設定したデータをlistにする。
     */
    ArrayList list = new ArrayList();
    private void createList() {
        list.add(this.name);
        list.add(this.phone_number);
        list.add(this.pass);

        System.out.println("ご利用有難うございました。");
    }

    public ArrayList<String> getList() {
        return list;
    }
}
