package day01.train1.train1_4;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TransMyBirDay {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date birDay = df.parse("1988-11-21 12:09:09");

        System.out.println(df.format(birDay));
    }
}
