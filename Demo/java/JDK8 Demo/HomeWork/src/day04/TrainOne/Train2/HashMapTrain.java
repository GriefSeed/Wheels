package day04.TrainOne.Train2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapTrain {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(2,"aa",3,"bb",4,"cc",5,"dd"));

        hm.put(1, "hh");

        Set<Integer> keySet = hm.keySet();

        for(Integer i : keySet){
            System.out.print("   " + i);
        }

        System.out.println();
        Iterator<Integer> it = keySet.iterator();

        while(it.hasNext()){
            System.out.print("   " + it.next());
        }
    }
}
