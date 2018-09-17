package day07.TrainOne.Train10;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Model {

    private static Lock lock = new ReentrantLock();
    private static final Condition c = lock.newCondition();

    public static void main(String[] args) {
        ExecutorService pool = Executors.newFixedThreadPool(2);

        Goods g = new Goods();


        pool.execute(new Comsumer(lock, g, c));
        pool.execute(new Product(lock, g, c));


        pool.shutdown();

        /*new Thread(new Product(lock, g)).start();
        new Thread(new Comsumer(lock, g)).start();*/

    }
}


class Comsumer implements Runnable {
    private Lock lock;
    private Goods g;
    private Condition condition;

    public Comsumer(Lock lock, Goods g, Condition condition) {
        this.lock = lock;
        this.g = g;
        this.condition = condition;
    }

    @Override
    public void run() {

        while (true) {
            // 要等有货才能提
            try {
                lock.lock();
                if (g.getGoodsName() == null) {
                    condition.await();
                }
                System.out.println(g.getGoodsName() + "======卸货=====");
                condition.signal();
                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }


    }

}


class Product implements Runnable {
    private Lock lock;
    private Goods g;
    private Condition condition;

    public Product(Lock lock, Goods g, Condition condition) {
        this.lock = lock;
        this.g = g;
        this.condition = condition;
    }

    @Override
    public void run() {

        while (true) {
            try {
                lock.lock();

                g.setGoodsName("苹果");
                System.out.println("装入苹果");

                // 生产完后要等提货
                condition.signalAll();

                condition.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }

        }

    }
}
