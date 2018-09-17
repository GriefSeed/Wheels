package day08.TrainTwo.Train1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Train1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String path = in.nextLine();
        File f = new File(path.trim());

        if (!f.isFile()) {
            try {
                f.createNewFile();
                System.out.println(path +  " 创建成功");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
