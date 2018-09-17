package day01.train2.train2_1;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        DateFormat briDayStr = new SimpleDateFormat("yyyy-MM-dd");
        Date d = briDayStr.parse("1993-12-21");
        Long birTime = d.getTime();
        Long now = System.currentTimeMillis();
        // System.out.println((now - birTime) / (1000 * 60 * 60 * 24 * 365));
        System.out.println((now - birTime) / 1000 / 60 / 60 /24 / 365);
    }
}
