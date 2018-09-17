package day10.TrainOne;

import java.io.*;
import java.util.Scanner;

public class Train4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try (BufferedReader bf = new BufferedReader(new FileReader("data.txt"));
             BufferedWriter bo = new BufferedWriter(new FileWriter("data.txt"))) {

            for (int i = 0; i < 3; i++) {
                bo.write(in.next() + System.lineSeparator());
            }
            bo.flush();
            System.out.println("输入成功，再输一个校验");
            String str = in.next();
            String line;
            while ((line = bf.readLine()) != null) {
                if(line.trim().equals(str)){
                    System.out.println("exists this checkCode");
                }
            }
            System.out.println("no this checkCode");


        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
