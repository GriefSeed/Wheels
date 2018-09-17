package day08.TrainOne.Train8;

import java.io.File;

public class Train8 {
    public static void main(String[] args) {
        File f = new File("d:\\data");

        File[] flist = f.listFiles();

        for (File fu : flist) {
            System.out.println(fu.getName());
        }
    }
}
