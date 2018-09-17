package day10.TrainOne;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Train9 {
    public static void main(String[] args) {
        try (PrintStream p = new PrintStream("test.txt")) {
            Scanner in = new Scanner(System.in);
            String input = in.nextLine();
            p.println(input);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
