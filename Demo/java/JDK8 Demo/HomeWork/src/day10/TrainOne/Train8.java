package day10.TrainOne;

import day10.TrainOne.Train7.Student;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Train8 {
    public static void main(String[] args) {
        try (ObjectInputStream oos = new ObjectInputStream(new FileInputStream("test.txt"))) {
            Student s = (Student) oos.readObject();
            System.out.println(s.toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
