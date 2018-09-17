package day03.TrainOne.Train8;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        Collections.addAll(lhs, "王昭君","王昭君","西施","杨玉环","貂蝉");

        Iterator<String> it = lhs.iterator();

        while(it.hasNext()){
            System.out.print("  " + it.next());
        }

        System.out.println();

        for(String s : lhs){
            System.out.print(s + "  ");
        }
    }
}
