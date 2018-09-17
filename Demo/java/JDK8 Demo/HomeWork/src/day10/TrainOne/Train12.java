package day10.TrainOne;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Train12 {
    public static void main(String[] args) {
        Path pathA = Paths.get("a.txt");
        Path pathB = Paths.get("b.txt");

        try {
            Files.copy(pathA, pathB, REPLACE_EXISTING);
            // BufferedReader bf = new BufferedReader(new FileReader(pathB.toFile()));
            BufferedReader bf = Files.newBufferedReader(pathB, Charset.forName("UTF-8"));
            String str;
            while ((str = bf.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
