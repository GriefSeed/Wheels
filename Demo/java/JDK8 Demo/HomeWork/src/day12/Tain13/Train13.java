package day12.Tain13;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Random;
import java.util.function.Supplier;

public class Train13 {
    public static void main(String[] args) {
        //   长度为5的String数组
        int[] result = getObj(() -> new int[5]);
        System.out.println(result.length);
        //   包含5个1‐20(含1和20)之间随机数的HashSet<Integer>集合
        HashSet<Integer> result2 = getObj(() -> {
            HashSet<Integer> temp = new HashSet<>();
            Random r = new Random();
            while (temp.size() < 6) {
                temp.add(r.nextInt(20) + 1);
            }

            return temp;
        });
        System.out.println(result2);
        //   一个代表2018年4月1日的Calendar对象

        Calendar c = getObj(() -> {
            Calendar c1 = Calendar.getInstance();
            return c1;
        });

        System.out.println(String.format("%s-%s-%s %s:%s:%s", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND)));
    }

    public static <T> T getObj(Supplier<T> supplier) {
        return supplier.get();
    }
}
