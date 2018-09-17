package day06.TrainOne.Train3;

public class Test {
    public static void main(String[] args) {
        Thread myThread = new MyThread();

        myThread.start();

        Thread myRunnable = new Thread(new MyRunable(),"djfl");

        myRunnable.start();
    }
}


class MyThread extends Thread{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName() + "  继承Thread");
    }
}

class MyRunable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "  实现Runable接口");
    }
}
