package day06.TrainOne.Train6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        MyRunnable myRunnable = new MyRunnable();
        new Thread(myRunnable, "官网").start();
        new Thread(myRunnable, "实体店").start();


    }
}


class MyRunnable implements Runnable {
    private int bottle = 100;

    private Lock lock = new ReentrantLock();

    @Override
    public void run() {
        try {
            while (true) {
                lock.lock();
                if(bottle > 0){
                    bottle--;
                    System.out.println(Thread.currentThread().getName() + " 卖了一瓶，剩余：" + bottle + "瓶");
                }else{
                    break;// 你中断了while，就不会执行后面的释放lock的操作了
                }
                lock.unlock();
                if(bottle == 0){
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            lock.unlock();
        }
    }
}
