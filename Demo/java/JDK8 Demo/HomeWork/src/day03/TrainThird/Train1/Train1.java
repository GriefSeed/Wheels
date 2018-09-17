package day03.TrainThird.Train1;

import java.util.HashSet;
import java.util.Random;

public class Train1 {
    public static void main(String[] args) {
        HashSet<Integer> red_hs = new HashSet<>();
        HashSet<Integer> blue_hs = new HashSet<>();

        Random r = new Random();

        Integer blue_ball = null;

        // 红球6个，1-33
        while (red_hs.size() < 7) {
            red_hs.add(r.nextInt(33) + 1);
        }

        // 篮球1个，1-16
        while (red_hs.size() < 8) {
            red_hs.add(blue_ball = r.nextInt(16) + 1);
        }

        System.out.println("红球：" + red_hs);
        System.out.println("蓝球：" + blue_ball);


    }
}
