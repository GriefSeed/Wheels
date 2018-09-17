package day03.TrainOne.Train4;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> lk = new LinkedList<>();
        Collections.addAll(lk, 1,2,3,4,5,6,7,8);
        lk.addFirst(100);

        lk.addLast(100);

        System.out.println(lk);

        System.out.println(lk.getFirst());
        System.out.println(lk.getLast());

        lk.removeFirst();
        lk.removeLast();
        System.out.println(lk);

    }
}
