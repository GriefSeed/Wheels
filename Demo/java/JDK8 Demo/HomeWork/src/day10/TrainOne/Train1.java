package day10.TrainOne;

import java.io.*;

public class Train1 {
    public static void main(String[] args) {
        try (BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream("test.txt"))) {
            bf.write(97);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
