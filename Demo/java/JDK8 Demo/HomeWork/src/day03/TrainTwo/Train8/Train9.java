package day03.TrainTwo.Train8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Train9 {
    public static void main(String[] args) {
        ArrayList<String> str1 = new ArrayList<>();
        ArrayList<String> str2 = new ArrayList<>();

        Collections.addAll(str1, "a", "b", "a", "c", "d");
        Collections.addAll(str1, "e", "f", "a", "d", "g", "h");

        HashSet<String> hs = new HashSet<>();

        int max_size = str1.size() > str2.size() ? str1.size() : str2.size();
        for (int i = 0; i < max_size; i++) {
            if (i < str1.size()) {
                hs.add(str1.get(i));
            }
            if (i < str2.size()) {
                hs.add(str2.get(i));
            }
        }

        System.out.println(hs);

    }
}
