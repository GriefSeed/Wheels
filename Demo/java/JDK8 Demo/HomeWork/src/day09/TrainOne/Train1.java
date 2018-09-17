package day09.TrainOne;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Train1 {
    public static void main(String[] args) {
        File file = new File("e:/test.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileOutputStream out = new FileOutputStream(file);) {
            out.write(97);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
