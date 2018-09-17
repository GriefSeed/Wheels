package day13.TrainOne;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class Train4 {
    public static void main(String[] args) {
        functionMeh(s1 -> s1.split(",")[1], Integer::parseInt, i1 -> i1 + 100, "赵丽颖,20");
    }

    private static Integer functionMeh(Function<String, String> function1, Function<String, Integer> function2, Function<Integer, Integer> function3, String list) {
        return function1.andThen(function2).andThen(function3).apply(list);
    }
}
