package day12.Train9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.locks.Condition;

public class Train9 {
    public static void main(String[] args) {
        ArrayList<Student> stuList = new ArrayList<>(List.of(Student.newBuilder().withName("谢霆锋").withAge(12).withScore(85).build(),
                Student.newBuilder().withName("章子怡").withAge(12).withScore(63).build(),
                Student.newBuilder().withName("刘亦菲").withAge(12).withScore(77).build(),
                Student.newBuilder().withName("黄晓明").withAge(12).withScore(33).build(),
                Student.newBuilder().withName("岑小村").withAge(12).withScore(92).build()));

        Collections.sort(stuList, (Student a, Student b) -> b.getScore() - a.getScore());

        stuList.forEach(System.out::print);

        System.out.println();
        Collections.shuffle(stuList);
        System.out.println();
        stuList.forEach(System.out::print);

        Collections.sort(stuList, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o2.getScore() - o1.getScore();
            }
        });
        System.out.println();
        stuList.forEach(System.out::print);
    }
}
