package day04.TrainOne.Train1;

import java.util.HashMap;
import java.util.Map;

public class MapTrain {
    public static void main(String[] args) {
        HashMap<Integer, Integer> hm = new HashMap<>(Map.of(2,2,3,3,4,4,5,5));

        System.out.println(hm);

        hm.put(1, 1);

        Integer old = hm.put(1, 2);

        Integer getEle = hm.get(5);

        hm.remove(5);

        System.out.println(hm);
    }
}
