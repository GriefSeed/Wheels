package day09.TrainOne;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Train3 {
    public static void main(String[] args) {
        File file = new File("e:/test3.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileOutputStream out = new FileOutputStream(file, true);) {
            int i = 0;
            while(i < 5){
                out.write("fuck your ass \r\n".getBytes());
                i++;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
