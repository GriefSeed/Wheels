package day07.TrainOne.Train8;

import java.util.ArrayList;
import java.util.Collections;

public class Train8 {
    public static void main(String[] args) {

        ArrayList<Student> sArr = new ArrayList<>();

        int i = 1;
        while (i < 11) {
            sArr.add(Student.newBuilder().withName("学生" + i).withAge(i).build());
            i++;
        }

        Collections.shuffle(sArr);

        sArr.forEach(System.out::println);


        System.out.println("===================================================");
        Collections.sort(sArr, (s1, s2) -> s1.getAge() - s2.getAge());

        sArr.forEach(System.out::println);


    }
}
