package day04.TrainOne.Train7;

import day04.TrainOne.Train6.Student;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTrain {
    public static void main(String[] args) {
        HashMap<Student, String> hm = new HashMap<>(Map.of(Student.newBuilder().withName("dd").withAge(12).build(), "区域1",
                Student.newBuilder().withName("cc").withAge(13).build(), "区域2",
                Student.newBuilder().withName("yy").withAge(15).build(), "区域3"));

        Set<Student> area = hm.keySet();

        for (Student s : area) {
            System.out.println(s + "   " + hm.get(s));
        }


        System.out.println("=====================");

        Set<Entry<Student, String>> set = hm.entrySet();

        Iterator<Entry<Student, String>> it = set.iterator();

        while (it.hasNext()) {
            Entry<Student,String> e = it.next();
            System.out.println(e.getKey() + "   " + e.getValue());
        }
    }
}
