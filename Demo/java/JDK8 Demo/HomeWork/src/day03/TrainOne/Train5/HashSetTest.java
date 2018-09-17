package day03.TrainOne.Train5;

import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        Collections.addAll(hs, "zhangsan", "lisi","wangwu", "zhangsan");

        hs.add("biubiu99999");
        Iterator<String> it = hs.iterator();

        while(it.hasNext()){
            System.out.print("   " + it.next());
        }

    }
}
