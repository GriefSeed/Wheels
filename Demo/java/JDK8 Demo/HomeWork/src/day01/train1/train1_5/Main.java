package day01.train1.train1_5;

import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, 500);
        System.out.println(String.format("%s-%s-%s",calendar.get(Calendar.YEAR), calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)));
        Calendar calendar1 = Calendar.getInstance();
        //calendar1.add(Calendar.HOUR, 1);
        System.out.println(calendar1.get(Calendar.HOUR_OF_DAY));
    }
}
