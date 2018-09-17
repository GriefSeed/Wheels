package day08.TrainOne.Train1;

import java.io.File;
import java.io.IOException;

public class Train1 {
    public static void main(String[] args) {
        File f1 = new File("test.txt");
        File f2 = new File("D:\\test.txt");

        try {
            f1.createNewFile();
            f2.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
