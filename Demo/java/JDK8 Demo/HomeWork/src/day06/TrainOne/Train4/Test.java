package day06.TrainOne.Train4;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(i < 10){
                    System.out.println("播放背景音乐");
                    i++;
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                int i = 0;
                while(i < 10){
                    System.out.println("显示画面");
                    i++;
                }
            }
        });

        t1.start();
        t2.start();
    }



}
