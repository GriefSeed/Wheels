package day10.TrainOne.Train7;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Train7 {
    public static void main(String[] args) {
        Student s = Student.newBuilder().withSex('男').withName("李大雕").build();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"))) {
            oos.writeObject(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
