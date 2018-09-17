package day12.Train2;

public class Train2 {
    public static void main(String[] args) {
        getProduct(1, 2, Train2::myMethod);
    }

    private static void getProduct(int a, int b, IntCalc calc) {
        System.out.println(calc.calc(a, b));
    }

    private static int myMethod(int a, int b) {
        return a + b;
    }

}
