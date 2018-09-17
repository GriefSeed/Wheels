package day07.TrainOne.Train7;

public class InvokeCalTest {
    public static void main(String[] args) {
        Calculator c = (int a, int b) -> a - b;

        int result = c.cal(130, 120);

        System.out.println(result);

        invokeCal(130, 120, (a, b) -> a - b);
    }


    private static void invokeCal(int a, int b, Calculator c) {
        int result = c.cal(a, b);
        System.out.println(result);
    }

}
