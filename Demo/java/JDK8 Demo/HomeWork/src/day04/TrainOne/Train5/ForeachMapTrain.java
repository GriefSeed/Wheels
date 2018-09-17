package day04.TrainOne.Train5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.*;
import java.util.Set;

public class ForeachMapTrain {
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>(Map.of("邓超", "孙俪", "李晨", "范冰冰", "刘德华", "柳岩", "黄晓明", " Baby", "谢霆锋", "张柏芝"));
        hm.put("get", "hh");

        Set<Entry<String, String>> s = hm.entrySet();

        Iterator<Entry<String, String>> it = s.iterator();

        while (it.hasNext()) {
            Entry<String, String> e = it.next();
            System.out.println(e.getKey() + "   " + e.getValue());
        }
    }
}
