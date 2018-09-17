package day10.TrainOne;

import day10.TrainOne.Train7.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Train11 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("test.txt"));
            ArrayList<Student> students = new ArrayList<>(List.of(
                    Student.newBuilder().withSex('男').withName("李大雕1号").build(),
                    Student.newBuilder().withSex('女').withName("李大B2号").build(),
                    Student.newBuilder().withSex('男').withName("李大雕3号").build()
            ));
            oos.writeObject(students);
            oos.close();

            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("test.txt"));
            ArrayList<Student> s = (ArrayList<Student>) ois.readObject();
            for (Student ss : s) {
                ss.toString();
            }
            ois.close();

            System.out.println(s.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
