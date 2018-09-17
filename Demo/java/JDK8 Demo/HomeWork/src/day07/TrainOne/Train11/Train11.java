package day07.TrainOne.Train11;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Train11 {


    public static void main(String[] args) {

        ExecutorService pool = Executors.newFixedThreadPool(50);

        int num = 0;

        Employeer e = new Employeer();
        while (num < 50) {
            pool.execute(e);
            num++;
        }

        pool.shutdown();
    }
}

class Employeer implements Runnable {
    // 门口资源有两个
    private Door frontDoor = new Door();
    private Door outDoor = new Door();

    private int frontDoorFlag = 1;
    private int outDoorFlag = 1;

    private int frontDoorNum = 0;
    private int outDoorNum = 0;


    @Override
    public void run() {
        while (true) {


            synchronized (frontDoor) {
                if (frontDoorFlag == 1) {
                    frontDoorFlag--;
                    frontDoorNum++;
                    System.out.println("前门进去了一个人，彩票号码是：" + BallTool.create());
                    frontDoorFlag++;
                    break;
                }
            }


            synchronized (outDoor) {
                if (outDoorFlag == 1) {
                    outDoorFlag--;
                    outDoorNum++;
                    System.out.println("后门进去了一个人，彩票号码是：" + BallTool.create());
                    outDoorFlag++;
                    break;
                }
            }

        }


    }
}
