package day08.TrainOne.Train6;

import java.io.File;

public class Train6 {
    public static void main(String[] args) {
        File f = new File("d:\\aaa.txt");

        System.out.println(f.getName());
        System.out.println(f.length());

        System.out.println(f.getAbsolutePath());

        System.out.println(f.getParent());
    }
}
