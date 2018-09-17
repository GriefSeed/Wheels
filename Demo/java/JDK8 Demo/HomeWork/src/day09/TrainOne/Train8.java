package day09.TrainOne;

import java.io.FileWriter;
import java.util.Scanner;

public class Train8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try (FileWriter fileWriter = new FileWriter("e:/test3.txt")) {
            while (true) {
                String str = in.nextLine();
                if ("886".equals(str.trim().toString())) {
                    break;
                }
                fileWriter.write(str + System.lineSeparator());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
