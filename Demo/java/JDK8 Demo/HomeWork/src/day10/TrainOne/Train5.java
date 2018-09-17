package day10.TrainOne;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

public class Train5 {
    public static void main(String[] args) {
        try (OutputStreamWriter ow = new OutputStreamWriter(new FileOutputStream("a.txt"),"GBK")) {
            ow.write("我TM社保");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
