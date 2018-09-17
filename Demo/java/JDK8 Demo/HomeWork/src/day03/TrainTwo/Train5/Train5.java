package day03.TrainTwo.Train5;

import java.util.ArrayList;
import java.util.HashSet;

public class Train5 {
    public static void main(String[] args) {
        String arr[] = {"abc", "bad", "abc", "aab", "bad", "cef", "jhi"};
        HashSet<String> hs = new HashSet<>();

        for(String s : arr){
            hs.add(s);
        }

        ArrayList<String> strArr = new ArrayList<>();
        strArr.addAll(hs);

        System.out.println(strArr);
    }

}
