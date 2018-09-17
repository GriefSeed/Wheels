package day07.TrainOne.Train9;

import java.util.*;

public class Train9 {
    public static void main(String[] args) {
        ArrayList<String> sArr = new ArrayList<>(List.of("lily", "davi", "jekson", "vivi", "mark", "hen"));

        HashMap map = new HashMap(Map.of("lily", "1", "davi", "2", "jekson", "3", "vivi", "4", "mark", "5", "hen", "6"));

        HashSet set = new HashSet(List.of(List.of("lily", "davi", "jekson", "vivi", "mark", "hen")));


        sArr.forEach(System.out::println);

        System.out.println("================================");

        map.forEach((k, v) -> {
            System.out.println(k +" : "+ v);
        });

        System.out.println("================================");
        set.forEach(System.out::println);
    }
}
