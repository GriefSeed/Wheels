package day03.TrainTwo.Train4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class HashSetTest {
    public static void main(String[] args) {
        int i = 0;
        HashSet<Student> hs = new HashSet<>();
        while(i < 10){
            hs.add(Student.newBuilder().withName("学生" + i).withAge(i).withSex('男').build());
            i++;
        }

        Iterator<Student> it = hs.iterator();

        while(it.hasNext()){
            System.out.println(it.next().toString());
        }

        System.out.println("=====================================");

        for(Student s : hs){
            System.out.println(s.toString());
        }
    }
}
