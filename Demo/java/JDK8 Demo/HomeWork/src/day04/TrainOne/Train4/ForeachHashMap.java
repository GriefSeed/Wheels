package day04.TrainOne.Train4;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class ForeachHashMap {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>(Map.of("邓超", "孙俪", "李晨", "范冰冰", "刘德华", "柳岩", "黄晓明", " Baby", "谢霆锋", "张柏芝"));
        hm.put("get", "hh");

        Set<String> s = hm.keySet();
        Iterator<String> it = s.iterator();

        String key = it.next();

        while (it.hasNext()) {
            System.out.print("  " + it.next());
        }

        System.out.println();
        System.out.println("key : " + key + "value : " + hm.get(key));


    }
}
