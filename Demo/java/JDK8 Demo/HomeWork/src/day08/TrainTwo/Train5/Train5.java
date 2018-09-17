package day08.TrainTwo.Train5;

import java.io.File;
import java.util.Scanner;

public class Train5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        File f = new File(path.trim());
        printPath(f);

        f.delete();


        System.out.println("nothing is happened");
    }



    public static void printPath(File f) {
        File[] flist = f.listFiles();
        for (File ff : flist) {
            if (ff.isDirectory()) {
                printPath(ff);
            } else if (ff.isFile()) {
                ff.delete();
            }
            if(ff.length() == 0){
                ff.delete();
            }
        }
    }
}
