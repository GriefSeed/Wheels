package day12.Train12;

import java.util.function.Consumer;

public class Train12 {

    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男"};
        mergeString(s -> System.out.print(s.toString().split(",")[0] + "="), s -> System.out.println(s.toString().split(",")[1]), array);

    }

    private static void mergeString(Consumer<String> c1, Consumer<String> c2, String[] arr) {
        for (String s : arr) {
            c1.andThen(c2).accept(s);
        }
    }

}
