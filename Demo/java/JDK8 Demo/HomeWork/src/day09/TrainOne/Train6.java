package day09.TrainOne;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Train6 {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("e:/beauty.jpg");
             FileOutputStream output = new FileOutputStream("e:/test/beauty2.jpg")) {
            int nextByte = -1;

            while ((nextByte = input.read()) != -1) {
                output.write(nextByte);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
