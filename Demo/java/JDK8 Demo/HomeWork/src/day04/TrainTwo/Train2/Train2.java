package day04.TrainTwo.Train2;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Train2 {
    public static void main(String[] args) {
        HashMap<String, Integer> hashMap = new HashMap<>(Map.of("柳岩", 2100, "张亮", 1700, "诸葛亮", 1800, "灭绝师太", 2600, "东方不败"
                , 3800));

        hashMap.put("柳岩", hashMap.get("柳岩") + 300);

        Set<String> s = hashMap.keySet();
        for(String str : s){
            System.out.println(str + "  " + hashMap.get(str));
        }
    }
}
