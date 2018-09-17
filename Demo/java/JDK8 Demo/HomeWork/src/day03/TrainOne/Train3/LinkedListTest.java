package day03.TrainOne.Train3;

import java.util.*;

public class LinkedListTest {
    public static void main(String[] args) {
        LinkedList<Integer> lk = new LinkedList();
        Collections.addAll(lk, 1,2,3,4,5,6,7,8);

        lk.add(2, 9);
        lk.set(1, 10);

        lk.get(1);

        System.out.println(String.format("数组长度为：%s", lk.size()));

        System.out.println("删除前");
        System.out.println(lk);
        lk.remove(0);
        System.out.println("删除后");
        System.out.println(lk);

        lk.clear();
        System.out.println(lk);






    }
}
