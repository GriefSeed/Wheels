package day01.train1.train1_3.train1_3_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class GetCurrentTime {
    public static void main(String[] args) {
        //Date
        Date now = new Date();
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(df.format(now));


        // Calender
        Calendar c = Calendar.getInstance();
        System.out.println(String.format("%s-%s-%s %s:%s:%s", c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH), c.get(Calendar.HOUR_OF_DAY), c.get(Calendar.MINUTE), c.get(Calendar.SECOND)));
    }
}
