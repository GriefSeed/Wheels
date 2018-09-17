package day08.TrainTwo.Train2;

import java.io.File;
import java.util.Scanner;

public class Train2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        File f = new File(path.trim());

        if (f.isFile()) {
            System.out.println("文件大小是 ：" + f.length());
        } else if (f.isDirectory()) {
            long sum = 0L;
            long result = countLen(f, sum);
            System.out.println(result + " 文件夹大小");
        }
        System.out.println("nothing is happened");

    }

    public static long countLen(File f, long sum) {
        File[] flist = f.listFiles();
        for (File ff : flist) {
            if(ff.isFile()){
                sum += ff.length();
            }
            else if(ff.isDirectory()){
                System.out.println("ff is dir");
            }
        }
        // System.out.println("文件夹大小是：" + sum / 1024 / 1024 / 1000);
        // return sum / 1024 / 1024 / 1000;
        return sum;

    }
}
