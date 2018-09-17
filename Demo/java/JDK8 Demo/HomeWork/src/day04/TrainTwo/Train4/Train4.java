package day04.TrainTwo.Train4;

import javax.swing.text.html.parser.Entity;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.*;
import java.util.Scanner;
import java.util.Set;

public class Train4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        char[] c = str.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (Character cc : c) {
            if (hashMap.get(cc) != null) {
                hashMap.put(cc, hashMap.get(cc) + 1);
            } else {
                hashMap.put(cc, 1);
            }
        }

        Set<Entry<Character, Integer>> se = hashMap.entrySet();
        Iterator<Entry<Character, Integer>> it = se.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()){
            Entry e = it.next();
            sb.append(e.getKey() + "(" + e.getValue()+") ");
        }

        System.out.println(sb.toString());
    }
}
