package day04.TrainOne.Train6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

public class HashMapTrain {
    public static void main(String[] args) {
        HashMap<String, Student> hm = new HashMap<>(Map.of("区域1", Student.newBuilder().withName("dd").withAge(12).build(),
                "区域2", Student.newBuilder().withName("cc").withAge(13).build(),
                "区域3", Student.newBuilder().withName("yy").withAge(15).build()));

        Set<String> area = hm.keySet();

        for (String s : area) {
            System.out.println(s + "   " + hm.get(s));
        }


        System.out.println("=====================");

        Set<Entry<String, Student>> set = hm.entrySet();

        Iterator<Entry<String, Student>> it = set.iterator();

        while(it.hasNext()){
            Entry<String, Student> e = it.next();
            System.out.println(e.getKey() + "   " + e.getValue());
        }
    }
}
