package day10.TrainOne;

import java.io.*;
import java.nio.file.FileVisitResult;

public class Train6 {
    public static void main(String[] args) {
        try (InputStreamReader ow = new InputStreamReader(new FileInputStream("a.txt"), "GBK")) {
            char[] buffer = new char[1024];
            int len = -1;
            while ((len = ow.read(buffer)) != -1) {
                System.out.println(new String(buffer, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
