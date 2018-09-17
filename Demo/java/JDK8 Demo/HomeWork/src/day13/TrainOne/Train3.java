package day13.TrainOne;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Train3 {
    public static void main(String[] args) {
        String[] array = {"迪丽热巴,女", "古力娜扎,女", "马尔扎哈,男", "赵丽颖,女"};
        ArrayList<String> get = filterMess(s1 -> "女".equals(s1.split(",")[1].toString()),
                s2 -> s2.split(",")[0].length() == 4, array);

        System.out.println(get);

    }

    private static ArrayList<String> filterMess(Predicate<String> p1, Predicate<String> p2, String[] list) {
        ArrayList<String> result = new ArrayList<>();
        for (String s : list) {
            if (p1.and(p2).test(s)) {
                result.add(s);
            }
        }
        return result;
    }

}
