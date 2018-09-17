package day12.Train10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Train10 {
    public static void main(String[] args) {
        String[] stringsArray = {"Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda"};


        Arrays.sort(stringsArray, (String s1, String s2) -> s1.compareToIgnoreCase(s2));

        for (String s : stringsArray) {
            System.out.print(s + " ");
        }

        String[] stringsArray2 = {"Barbara", "James", "Mary", "John", "Patricia", "Robert", "Michael", "Linda"};

        Arrays.sort(stringsArray2, String::compareToIgnoreCase);

        System.out.println();
        for (String s : stringsArray2) {
            System.out.print(s + " ");
        }
    }
}
