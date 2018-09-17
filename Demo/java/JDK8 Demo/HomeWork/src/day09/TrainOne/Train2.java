package day09.TrainOne;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Train2 {
    public static void main(String[] args) {
        File file = new File("e:/test2.txt");
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try (FileOutputStream out = new FileOutputStream(file);) {
            // 亮点，getBytes()
            byte[] oneByte = "abc".getBytes();
            out.write(oneByte);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
