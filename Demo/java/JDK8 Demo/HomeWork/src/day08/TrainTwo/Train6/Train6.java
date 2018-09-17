package day08.TrainTwo.Train6;

import java.io.File;
import java.util.Scanner;

public class Train6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        File f = new File(path.trim());
        long size = printPath(f, 0L);
        System.out.println("文件大小是：" + size);
        System.out.println("nothing is happened");
    }


    public static long printPath(File f, long sum) {
        if (f.isDirectory()) {
            File[] flist = f.listFiles();
            if (flist != null) {
                for (File ff : flist) {
                    sum = printPath(ff, sum);
                }
            }
        } else if (f.isFile()) {
            sum += f.length();
        }
        return sum;
    }
}
