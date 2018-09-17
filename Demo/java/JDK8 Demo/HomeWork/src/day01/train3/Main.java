package day01.train3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
        Date d = sf.parse("2016-12-18");
        System.out.println(sf.format(d));

        sf.applyPattern("yyyy年MM月dd日");
        String d2 = sf.format(d);
        System.out.println(d2);
    }
}
