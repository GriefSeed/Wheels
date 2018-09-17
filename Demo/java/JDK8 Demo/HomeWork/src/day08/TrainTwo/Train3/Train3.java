package day08.TrainTwo.Train3;

import java.io.File;
import java.util.Scanner;

public class Train3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        File f = new File(path.trim());
        printPath(f, 0);

        System.out.println("nothing is happened");
    }

    public static String pathStr(int deep) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < deep; i++) {
            sb.append("|---");
        }
        return sb.toString();
    }

    public static void printPath(File f, int deep) {
        deep++;
        if (f.isDirectory()) {
            System.out.println(pathStr(deep) + f.getName());
            File[] flist = f.listFiles();
            if(flist != null){
                for (File ff : flist) {
                    printPath(ff, deep);
                }
            }
        } else if (f.isFile()) {
            System.out.println(pathStr(deep) + f.getName());
        }
    }
}
