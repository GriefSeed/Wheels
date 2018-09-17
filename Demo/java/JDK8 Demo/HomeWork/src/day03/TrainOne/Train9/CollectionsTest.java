package day03.TrainOne.Train9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsTest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();

        Collections.addAll(arr, 1,2,6,2,1,6,8,4,3,6,8,4,6,8,9,0,6,4,12,34,35,56,42,45,67,34,78);

        System.out.println(arr);

        Collections.sort(arr, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(arr);

        Collections.sort(arr, (x, y) -> y - x);

        System.out.println(arr);

        Collections.shuffle(arr);

        System.out.println(arr);

        Collections.reverse(arr);
        System.out.println(arr);

        for(Integer i : arr){
            System.out.print("  " + i);
        }
    }
}
