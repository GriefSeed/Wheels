package day04.TrainTwo.Train7;

import java.util.*;

public class Train7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strList = in.nextLine().split(" ");

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String s : strList) {
            countingKey(hashMap, s);
        }

        Set<Map.Entry<String, Integer>> se = hashMap.entrySet();
        Iterator<Map.Entry<String, Integer>> it = se.iterator();
        StringBuilder sb = new StringBuilder();
        while (it.hasNext()) {
            Map.Entry e = it.next();
            sb.append(e.getKey() + "=" + e.getValue() + "\n");
        }

        System.out.println(sb.toString());

    }

    private static void countingKey(HashMap<String, Integer> map, String key) {
        if (map.get(key) != null) {
            map.put(key, map.get(key) + 1);
        } else {
            map.put(key, 1);
        }
    }
}
