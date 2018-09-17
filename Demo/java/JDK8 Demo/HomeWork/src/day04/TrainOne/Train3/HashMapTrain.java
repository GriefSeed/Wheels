package day04.TrainOne.Train3;

import java.util.*;

public class HashMapTrain {
    public static void main(String[] args) {
        HashMap<Integer, String> hm = new HashMap<>(Map.of(2,"aa",3,"bb",4,"cc",5,"dd"));
        hm.put(1, "hh");

        Collection<String> arr = hm.values();

        for(String s : arr){
            System.out.print("   " + s);
        }

        Iterator<String> it = arr.iterator();

        while(it.hasNext()){
            System.out.print("   " + it.next());

        }
    }

}
