package jp.ac.uryukyu.ie.e185744;

import org.junit.jupiter.api.Test;

import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Inputクラスのテスト
 * 名前クラスなどに継承されている為、テストした。
 */
class InputTest {
    @Test
    void input_test(){
        String str = "^[0-9]+$";
        Pattern p = Pattern.compile(str);
        Input input = new Input(str);
        boolean torf = input.findMatches(p,"000");
        while (true){
            if(torf == true) break;
        }

    }

}