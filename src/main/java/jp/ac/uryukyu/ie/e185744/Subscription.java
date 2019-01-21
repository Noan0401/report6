package jp.ac.uryukyu.ie.e185744;
import java.util.ArrayList;


public class Subscription {

    private String name;
    private String phone_number;
    private String pass;

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

    ArrayList list = new ArrayList();
    private void createList() {
        list.add(this.name);
        list.add(this.phone_number);
        list.add(this.pass);

        System.out.println(list.get(0));
    }

    public ArrayList<String> getList() {
        return list;
    }
}
