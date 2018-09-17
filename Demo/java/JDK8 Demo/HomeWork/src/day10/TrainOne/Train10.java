package day10.TrainOne;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Train10 {
    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("test.txt"));
            ArrayList<String> strArr = new ArrayList<>();
            String content;
            while ((content = br.readLine()) != null) {
                strArr.add(content);
            }
            br.close();

            Collections.reverse(strArr);
            BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
            for (String s : strArr) {
                bw.write(s + System.lineSeparator());
            }
            bw.close();
        } catch (Exception e) {

        }
    }
}
