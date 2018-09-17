package day08.TrainTwo.Train4;

import java.io.File;
import java.io.FileFilter;
import java.util.Scanner;

public class Train4 {
    public static void main(String[] args) {
        FileFilter fileFilter = (pathname)->{
            if(pathname.getName().endsWith(".java")){
                return true;
            }
            return false;
        };

        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        File f = new File(path.trim());

        File[] flist = f.listFiles();
        for (File ff : flist) {
            if(ff.isFile()){
                System.out.println(ff.getName());
            }
        }
    }
}
