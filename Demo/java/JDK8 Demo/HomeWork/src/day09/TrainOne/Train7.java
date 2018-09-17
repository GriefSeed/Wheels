package day09.TrainOne;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Train7 {
    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("e:/beauty.jpg");
             FileOutputStream output = new FileOutputStream("e:/test/beauty2.jpg")) {
            int nextByte = -1;

            byte[] buffer = new byte[1024];
            while ((nextByte = input.read(buffer)) != -1) {
                output.write(buffer);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
