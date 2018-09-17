package day09.TrainThird;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;
import java.util.Set;

public class TrainOne {

    public static void main(String[] args) {
        try (FileInputStream input = new FileInputStream("e:/test.txt");
             FileOutputStream output = new FileOutputStream("e:/test2.txt")) {
            Properties p = new Properties();
            p.load(input);

            Set<String> set = p.stringPropertyNames();

            for (String key : set) {
                if ("woman".equals(key)) {
                    p.setProperty(key, "bitch");
                }
            }
            /*p.setProperty("man", "dick");
            p.setProperty("woman","pussy");*/

            p.store(output, null);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
