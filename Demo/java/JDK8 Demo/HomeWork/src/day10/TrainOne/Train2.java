package day10.TrainOne;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

public class Train2 {
    public static void main(String[] args) {
        try (BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream("test.txt", true))) {
            String aim = "i want to fuck your ass\r\n";
            bf.write(aim.getBytes());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
