package day10.TrainOne;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class Train3 {
    public static void main(String[] args) {
        try (BufferedInputStream bf = new BufferedInputStream(new FileInputStream("1.jpeg"));
             BufferedOutputStream bo = new BufferedOutputStream(new FileOutputStream("2.jpeg"))) {
            int nextByte;
            while(( nextByte = bf.read()) != -1){
                bo.write(nextByte);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
