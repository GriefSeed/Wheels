package day09.TrainOne;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Train5 {
    public static void main(String[] args) {
        try (FileInputStream fileInputStream = new FileInputStream("e:/test3.txt")) {
            byte[] buffer = new byte[100];
            int len = -1;
            while ((len = fileInputStream.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, len));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
