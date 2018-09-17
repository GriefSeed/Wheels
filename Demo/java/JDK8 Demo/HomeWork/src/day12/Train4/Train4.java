package day12.Train4;

public class Train4 {
    public static void main(String[] args) {
        getRandomNumFromOne(6, new RandmoUtil()::nextInt);

        getRandomNumFromAToB(1, 10, new RandmoUtil()::nextInt);

        getRandomNumFromArray(new int[]{1, 2, 3, 4, 5}, new RandmoUtil()::nextInt);
    }

    private static void getRandomNumFromOne(int num, NumberSupplier ns) {
        System.out.println(ns.getNum(num));
    }

    private static void getRandomNumFromAToB(int a, int b, NumberSupplier ns) {
        System.out.println(ns.getNum(a, b));
    }

    private static void getRandomNumFromArray(int[] nums, NumberSupplier ns) {
        System.out.println(ns.getNum(nums));
    }
}
