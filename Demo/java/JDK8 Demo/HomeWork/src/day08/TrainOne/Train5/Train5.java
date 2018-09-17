package day08.TrainOne.Train5;

import java.io.File;

public class Train5 {
    public static void main(String[] args) {
        File f = new File("d:\\test.txt");

        if (!f.isFile()) {
            f.delete();
        }

        File f2 = new File("d:\\test.txt");

        if (!f.isFile()) {
            f.delete();
        }

    }
}
