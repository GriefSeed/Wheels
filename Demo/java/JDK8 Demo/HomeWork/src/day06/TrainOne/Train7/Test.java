package day06.TrainOne.Train7;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable, "前门").start();
        new Thread(myRunnable, "中门").start();
        new Thread(myRunnable, "后门").start();



    }
}


class MyRunnable implements Runnable {
    private int desk = 80;

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            while (true) {
                lock.lock();
                if(desk > 0){
                    desk--;
                    System.out.println(Thread.currentThread().getName() + " 进来，剩余：" + desk + "个座位");
                }
                lock.unlock();
                if(desk == 0){
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            lock.unlock();
        }
    }
}
