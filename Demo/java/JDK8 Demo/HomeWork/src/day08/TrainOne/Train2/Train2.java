package day08.TrainOne.Train2;

import java.io.File;
import java.io.IOException;

public class Train2 {
    public static void main(String[] args) {
        File f = new File("d:\\test.txt");

        if (!f.isFile()) {
            try {
                f.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
