package day12.Train1;

public class Train1 {
    public static void main(String[] args) {
        showLongTime(() -> System.out.println(System.currentTimeMillis()));
    }

    private static void showLongTime(CurrentTimePrinter timePrinter) {
        timePrinter.printCurrentTime();
    }
}
