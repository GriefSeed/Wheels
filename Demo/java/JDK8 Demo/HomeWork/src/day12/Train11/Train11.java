package day12.Train11;

import java.util.Arrays;
import java.util.function.Supplier;

public class Train11 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 3, 2, 4, 5, 6, 2};

        Integer result = getMax(() -> {
            int value = arr[0];
            for (int a : arr) {
                if (a > value) {
                    value = a;
                }
            }
            return value;
        });

        System.out.println(result);
    }

    private static Integer getMax(Supplier<Integer> s) {
        return s.get();
    }
}
