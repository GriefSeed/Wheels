package day03.TrainTwo.Train2;

import java.util.Collections;
import java.util.HashSet;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        Collections.addAll(hs, "张三","李四","王五","二丫","钱六","孙七");

        hs.remove("二丫");
        hs.add("王小丫");

        System.out.println(hs);
    }
}
