package day06.TrainOne.Train9;

public class Test {
    public static void main(String[] args) {
        new Thread(() -> {
            int num = 10;
            int sum = 1;
            while(num > 0){
                sum *= num;
                num--;
            }
            System.out.println(sum);
        }).start();

        new Thread(() -> {
            int num = 5;
            int sum = 1;
            while(num > 0){
                sum *= num;
                num--;
            }
            System.out.println(sum);
        }).start();

        new Thread(() -> {
            int num = 8;
            int sum = 1;
            while(num > 0){
                sum *= num;
                num--;
            }
            System.out.println(sum);
        }).start();
    }
}
