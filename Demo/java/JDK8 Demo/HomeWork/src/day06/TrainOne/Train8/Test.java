package day06.TrainOne.Train8;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Test {
    public static void main(String[] args) {
        // LockB lock = new ReentrantLock();
        Integer res = 200;
        new MyThread("窗口1",res).start();
        new MyThread("窗口2",res).start();
        new MyThread("窗口3",res).start();
        new MyThread("窗口4",res).start();

    }
}


class MyThread extends Thread {
    // private static int ticket = 200;// thread 只能用static变量了
    private String name;
    private Integer res;

    public MyThread(String name,Integer res) {
        this.name = name;
        this.res = res;
    }

    @Override
    public void run() {
        try {
            while (true) {
                synchronized (MyThread.class) {
                    if (res > 0) {
                        res--;
                        System.out.println(this.name + " 卖了一张，剩余：" + res + " 张");
                    } else {
                        break;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
