package day03.TrainTwo.Train1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Train1 {
    public static void main(String[] args) {
        ArrayList<String> strArr = new ArrayList<>();
        Collections.addAll(strArr, "a","f","b","c","a","d");

        HashSet<String> hs = new HashSet();
        hs.addAll(strArr);

        strArr.clear();

        strArr.addAll(hs);

        System.out.println(strArr);
    }
}
