package day07.TrainOne.Train3;

import java.util.Random;
import java.util.concurrent.*;

public class Train3 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        // ExecutorService pool = new ThreadPoolExecutor();
        ExecutorService pool = Executors.newFixedThreadPool(3);

        Callable cc = () -> {
            Random r = new Random();
            int i = 0;
            int sum = 0;
            while (i < 10) {
                sum += r.nextInt(100) + 1;
                i++;
            }

            float avg = sum / 10;

            return avg;
        };

        Future<Float> num1 = pool.submit(cc);
        Future<Float> num2 = pool.submit(cc);
        Future<Float> num3 = pool.submit(cc);

        pool.shutdown();
        System.out.println(String.format("%.2f", (num1.get() + num2.get() + num3.get()) / 3));

    }
}
