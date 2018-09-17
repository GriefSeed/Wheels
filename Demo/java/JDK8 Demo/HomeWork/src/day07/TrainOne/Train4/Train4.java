package day07.TrainOne.Train4;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Train4 {
    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(3);



        pool.execute(new MyRunnable(10));
        pool.execute(new MyRunnable(5));
        pool.execute(new MyRunnable(8));

        pool.shutdown();
    }
}

class MyRunnable implements Runnable{
    private int num;

    public MyRunnable(int num) {
        this.num = num;
    }

    @Override
    public void run(){
        int n = this.num;
        int i = 1;
        int sum = 1;
        while(i <= n){
            sum *= i;
            i++;
        }
        System.out.println(n + "的阶乘是：" + sum);
    };
}
