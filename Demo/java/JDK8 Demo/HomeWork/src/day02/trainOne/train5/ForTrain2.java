package day02.trainOne.train5;

import java.util.ArrayList;
import java.util.Collections;

public class ForTrain2 {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        Collections.addAll(strList, "abc1", "abc2", "abc3", "abc4");

        for(String s : strList){
            System.out.println(s);
        }
    }
}
