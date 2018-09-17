package day04.TrainTwo.Train6;

import java.util.*;

public class Train6 {
    public static void main(String[] args) {
        ArrayList<String> str = new ArrayList<>(List.of("abc", "bcd"));
        HashMap<Character, Integer> hashMap = new HashMap<>();

        for(String s : str){
            char[] c = s.toCharArray();
            for(Character cc : c){
                countingKey(hashMap, cc);
            }
        }

        Set<Map.Entry<Character, Integer>> se = hashMap.entrySet();
        Iterator<Map.Entry<Character, Integer>> it = se.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            Map.Entry e = it.next();
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
