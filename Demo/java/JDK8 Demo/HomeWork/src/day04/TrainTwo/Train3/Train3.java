package day04.TrainTwo.Train3;

import java.util.HashMap;
import java.util.Map;

public class Train3 {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>(Map.of(1,"张三丰",2,"周芷若",3,"汪峰",4,"灭绝师太"));

        System.out.println(hashMap);

        hashMap.put(5, "李晓红");

        System.out.println(hashMap);

        hashMap.remove(5);

        hashMap.put(2, "周林");

        System.out.println(hashMap);
    }
}
