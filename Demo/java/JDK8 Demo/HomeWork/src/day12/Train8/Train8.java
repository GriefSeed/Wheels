package day12.Train8;

import java.util.ArrayList;

public class Train8 {
    public static void main(String[] args) {
        getIntegerArray(5, Integer[]::new);
    }

    static void getIntegerArray(int length, ArrayBuilder<Integer> builder) {
        Integer[] arr = builder.buildArray(length);
        System.out.println(arr);
    }
}
