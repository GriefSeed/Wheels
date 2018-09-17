package day04.TrainTwo.Train5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Train5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        char[] c = str.toCharArray();

        HashMap<Character, Integer> hashMap = new HashMap<>();

        for (Character cc : c) {
            countingKey(hashMap, cc);
        }

        Set<Entry<Character, Integer>> se = hashMap.entrySet();
        Iterator<Entry<Character, Integer>> it = se.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            Entry e = it.next();
            sb.append(e.getKey() + "(" + e.getValue() + ") ");
        }

        System.out.println(sb.toString());
    }

    private static void countingKey(HashMap<Character, Integer> map, Character key) {
        if (map.get(key) != null) {
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
    }
}

