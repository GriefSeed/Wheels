package day06.TrainOne.Train5;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 1. 请按要求编写多线程应用程序，模拟多个人通过一个山洞：
 * 这个山洞每次只能通过一个人，每个人通过山洞的时间为5秒。
 * 随机生成10个人，同时准备过此山洞，显示每次通过山洞人的姓名
 */

public class Test {
    public static void main(String[] args) {
        int i = 0;
        MyRunnable myRunnable = new MyRunnable();
        while (i < 10) {
            new Thread(myRunnable, "探险者" + i + "号").start();
            i++;
        }

    }
}

class MyRunnable implements Runnable {

    Lock hole = new ReentrantLock();

    @Override
    public void run() {
        try{
            hole.lock();
            System.out.println(Thread.currentThread().getName() + "正在穿越洞穴");
            Thread.sleep(2000);
            System.out.println(Thread.currentThread().getName() + "已经穿过洞穴====");
            hole.unlock();
        }catch (Exception e){
            hole.unlock();
            e.printStackTrace();
        }
    }

}
