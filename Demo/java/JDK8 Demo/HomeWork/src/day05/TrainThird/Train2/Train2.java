package day05.TrainThird.Train2;

import java.util.Random;

public class Train2 {
    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            Random r = new Random();
            int[] arr =new int[10];
            int i = 0;
            int sum = 0;
            while(i < 10){
                arr[i] = r.nextInt(900) + 100;
                i++;
            }
            for(int is : arr){
                System.out.println(is);
                sum += is;
            }
            System.out.println("sum = " + sum);
        });

        t.start();
    }
}
