package day09.TrainOne;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Train4 {
    public static void main(String[] args) {
        File file = new File("e:/test3.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileInputStream input = new FileInputStream(file);) {
            int len = -1;
            while ((len = input.read()) != -1) {
                System.out.print(len);
                // System.out.print((char) len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
